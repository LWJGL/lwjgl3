/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDL {

    private static final SharedLibrary SDL = Library.loadNative(SDL.class, "org.lwjgl.sdl", Configuration.SDL_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("SDL3")), true);

    /** Contains the function pointers loaded from the sdl {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            AsyncIOFromFile                            = apiGetFunctionAddress(SDL, "SDL_AsyncIOFromFile"),
            GetAsyncIOSize                             = apiGetFunctionAddress(SDL, "SDL_GetAsyncIOSize"),
            ReadAsyncIO                                = apiGetFunctionAddress(SDL, "SDL_ReadAsyncIO"),
            WriteAsyncIO                               = apiGetFunctionAddress(SDL, "SDL_WriteAsyncIO"),
            CloseAsyncIO                               = apiGetFunctionAddress(SDL, "SDL_CloseAsyncIO"),
            CreateAsyncIOQueue                         = apiGetFunctionAddress(SDL, "SDL_CreateAsyncIOQueue"),
            DestroyAsyncIOQueue                        = apiGetFunctionAddress(SDL, "SDL_DestroyAsyncIOQueue"),
            GetAsyncIOResult                           = apiGetFunctionAddress(SDL, "SDL_GetAsyncIOResult"),
            WaitAsyncIOResult                          = apiGetFunctionAddress(SDL, "SDL_WaitAsyncIOResult"),
            SignalAsyncIOQueue                         = apiGetFunctionAddress(SDL, "SDL_SignalAsyncIOQueue"),
            LoadFileAsync                              = apiGetFunctionAddress(SDL, "SDL_LoadFileAsync"),
            GetNumAudioDrivers                         = apiGetFunctionAddress(SDL, "SDL_GetNumAudioDrivers"),
            GetAudioDriver                             = apiGetFunctionAddress(SDL, "SDL_GetAudioDriver"),
            GetCurrentAudioDriver                      = apiGetFunctionAddress(SDL, "SDL_GetCurrentAudioDriver"),
            GetAudioPlaybackDevices                    = apiGetFunctionAddress(SDL, "SDL_GetAudioPlaybackDevices"),
            GetAudioRecordingDevices                   = apiGetFunctionAddress(SDL, "SDL_GetAudioRecordingDevices"),
            GetAudioDeviceName                         = apiGetFunctionAddress(SDL, "SDL_GetAudioDeviceName"),
            GetAudioDeviceFormat                       = apiGetFunctionAddress(SDL, "SDL_GetAudioDeviceFormat"),
            GetAudioDeviceChannelMap                   = apiGetFunctionAddress(SDL, "SDL_GetAudioDeviceChannelMap"),
            OpenAudioDevice                            = apiGetFunctionAddress(SDL, "SDL_OpenAudioDevice"),
            IsAudioDevicePhysical                      = apiGetFunctionAddress(SDL, "SDL_IsAudioDevicePhysical"),
            IsAudioDevicePlayback                      = apiGetFunctionAddress(SDL, "SDL_IsAudioDevicePlayback"),
            PauseAudioDevice                           = apiGetFunctionAddress(SDL, "SDL_PauseAudioDevice"),
            ResumeAudioDevice                          = apiGetFunctionAddress(SDL, "SDL_ResumeAudioDevice"),
            AudioDevicePaused                          = apiGetFunctionAddress(SDL, "SDL_AudioDevicePaused"),
            GetAudioDeviceGain                         = apiGetFunctionAddress(SDL, "SDL_GetAudioDeviceGain"),
            SetAudioDeviceGain                         = apiGetFunctionAddress(SDL, "SDL_SetAudioDeviceGain"),
            CloseAudioDevice                           = apiGetFunctionAddress(SDL, "SDL_CloseAudioDevice"),
            BindAudioStreams                           = apiGetFunctionAddress(SDL, "SDL_BindAudioStreams"),
            BindAudioStream                            = apiGetFunctionAddress(SDL, "SDL_BindAudioStream"),
            UnbindAudioStreams                         = apiGetFunctionAddress(SDL, "SDL_UnbindAudioStreams"),
            UnbindAudioStream                          = apiGetFunctionAddress(SDL, "SDL_UnbindAudioStream"),
            GetAudioStreamDevice                       = apiGetFunctionAddress(SDL, "SDL_GetAudioStreamDevice"),
            CreateAudioStream                          = apiGetFunctionAddress(SDL, "SDL_CreateAudioStream"),
            GetAudioStreamProperties                   = apiGetFunctionAddress(SDL, "SDL_GetAudioStreamProperties"),
            GetAudioStreamFormat                       = apiGetFunctionAddress(SDL, "SDL_GetAudioStreamFormat"),
            SetAudioStreamFormat                       = apiGetFunctionAddress(SDL, "SDL_SetAudioStreamFormat"),
            GetAudioStreamFrequencyRatio               = apiGetFunctionAddress(SDL, "SDL_GetAudioStreamFrequencyRatio"),
            SetAudioStreamFrequencyRatio               = apiGetFunctionAddress(SDL, "SDL_SetAudioStreamFrequencyRatio"),
            GetAudioStreamGain                         = apiGetFunctionAddress(SDL, "SDL_GetAudioStreamGain"),
            SetAudioStreamGain                         = apiGetFunctionAddress(SDL, "SDL_SetAudioStreamGain"),
            GetAudioStreamInputChannelMap              = apiGetFunctionAddress(SDL, "SDL_GetAudioStreamInputChannelMap"),
            GetAudioStreamOutputChannelMap             = apiGetFunctionAddress(SDL, "SDL_GetAudioStreamOutputChannelMap"),
            SetAudioStreamInputChannelMap              = apiGetFunctionAddress(SDL, "SDL_SetAudioStreamInputChannelMap"),
            SetAudioStreamOutputChannelMap             = apiGetFunctionAddress(SDL, "SDL_SetAudioStreamOutputChannelMap"),
            PutAudioStreamData                         = apiGetFunctionAddress(SDL, "SDL_PutAudioStreamData"),
            GetAudioStreamData                         = apiGetFunctionAddress(SDL, "SDL_GetAudioStreamData"),
            GetAudioStreamAvailable                    = apiGetFunctionAddress(SDL, "SDL_GetAudioStreamAvailable"),
            GetAudioStreamQueued                       = apiGetFunctionAddress(SDL, "SDL_GetAudioStreamQueued"),
            FlushAudioStream                           = apiGetFunctionAddress(SDL, "SDL_FlushAudioStream"),
            ClearAudioStream                           = apiGetFunctionAddress(SDL, "SDL_ClearAudioStream"),
            PauseAudioStreamDevice                     = apiGetFunctionAddress(SDL, "SDL_PauseAudioStreamDevice"),
            ResumeAudioStreamDevice                    = apiGetFunctionAddress(SDL, "SDL_ResumeAudioStreamDevice"),
            LockAudioStream                            = apiGetFunctionAddress(SDL, "SDL_LockAudioStream"),
            UnlockAudioStream                          = apiGetFunctionAddress(SDL, "SDL_UnlockAudioStream"),
            SetAudioStreamGetCallback                  = apiGetFunctionAddress(SDL, "SDL_SetAudioStreamGetCallback"),
            SetAudioStreamPutCallback                  = apiGetFunctionAddress(SDL, "SDL_SetAudioStreamPutCallback"),
            DestroyAudioStream                         = apiGetFunctionAddress(SDL, "SDL_DestroyAudioStream"),
            OpenAudioDeviceStream                      = apiGetFunctionAddress(SDL, "SDL_OpenAudioDeviceStream"),
            SetAudioPostmixCallback                    = apiGetFunctionAddress(SDL, "SDL_SetAudioPostmixCallback"),
            LoadWAV_IO                                 = apiGetFunctionAddress(SDL, "SDL_LoadWAV_IO"),
            LoadWAV                                    = apiGetFunctionAddress(SDL, "SDL_LoadWAV"),
            MixAudio                                   = apiGetFunctionAddress(SDL, "SDL_MixAudio"),
            ConvertAudioSamples                        = apiGetFunctionAddress(SDL, "SDL_ConvertAudioSamples"),
            GetAudioFormatName                         = apiGetFunctionAddress(SDL, "SDL_GetAudioFormatName"),
            GetSilenceValueForFormat                   = apiGetFunctionAddress(SDL, "SDL_GetSilenceValueForFormat"),
            ComposeCustomBlendMode                     = apiGetFunctionAddress(SDL, "SDL_ComposeCustomBlendMode"),
            GetNumCameraDrivers                        = apiGetFunctionAddress(SDL, "SDL_GetNumCameraDrivers"),
            GetCameraDriver                            = apiGetFunctionAddress(SDL, "SDL_GetCameraDriver"),
            GetCurrentCameraDriver                     = apiGetFunctionAddress(SDL, "SDL_GetCurrentCameraDriver"),
            GetCameras                                 = apiGetFunctionAddress(SDL, "SDL_GetCameras"),
            GetCameraSupportedFormats                  = apiGetFunctionAddress(SDL, "SDL_GetCameraSupportedFormats"),
            GetCameraName                              = apiGetFunctionAddress(SDL, "SDL_GetCameraName"),
            GetCameraPosition                          = apiGetFunctionAddress(SDL, "SDL_GetCameraPosition"),
            OpenCamera                                 = apiGetFunctionAddress(SDL, "SDL_OpenCamera"),
            GetCameraPermissionState                   = apiGetFunctionAddress(SDL, "SDL_GetCameraPermissionState"),
            GetCameraID                                = apiGetFunctionAddress(SDL, "SDL_GetCameraID"),
            GetCameraProperties                        = apiGetFunctionAddress(SDL, "SDL_GetCameraProperties"),
            GetCameraFormat                            = apiGetFunctionAddress(SDL, "SDL_GetCameraFormat"),
            AcquireCameraFrame                         = apiGetFunctionAddress(SDL, "SDL_AcquireCameraFrame"),
            ReleaseCameraFrame                         = apiGetFunctionAddress(SDL, "SDL_ReleaseCameraFrame"),
            CloseCamera                                = apiGetFunctionAddress(SDL, "SDL_CloseCamera"),
            SetClipboardText                           = apiGetFunctionAddress(SDL, "SDL_SetClipboardText"),
            GetClipboardText                           = apiGetFunctionAddress(SDL, "SDL_GetClipboardText"),
            HasClipboardText                           = apiGetFunctionAddress(SDL, "SDL_HasClipboardText"),
            SetPrimarySelectionText                    = apiGetFunctionAddress(SDL, "SDL_SetPrimarySelectionText"),
            GetPrimarySelectionText                    = apiGetFunctionAddress(SDL, "SDL_GetPrimarySelectionText"),
            HasPrimarySelectionText                    = apiGetFunctionAddress(SDL, "SDL_HasPrimarySelectionText"),
            SetClipboardData                           = apiGetFunctionAddress(SDL, "SDL_SetClipboardData"),
            ClearClipboardData                         = apiGetFunctionAddress(SDL, "SDL_ClearClipboardData"),
            GetClipboardData                           = apiGetFunctionAddress(SDL, "SDL_GetClipboardData"),
            HasClipboardData                           = apiGetFunctionAddress(SDL, "SDL_HasClipboardData"),
            GetClipboardMimeTypes                      = apiGetFunctionAddress(SDL, "SDL_GetClipboardMimeTypes"),
            GetNumLogicalCPUCores                      = apiGetFunctionAddress(SDL, "SDL_GetNumLogicalCPUCores"),
            GetCPUCacheLineSize                        = apiGetFunctionAddress(SDL, "SDL_GetCPUCacheLineSize"),
            HasAltiVec                                 = apiGetFunctionAddress(SDL, "SDL_HasAltiVec"),
            HasMMX                                     = apiGetFunctionAddress(SDL, "SDL_HasMMX"),
            HasSSE                                     = apiGetFunctionAddress(SDL, "SDL_HasSSE"),
            HasSSE2                                    = apiGetFunctionAddress(SDL, "SDL_HasSSE2"),
            HasSSE3                                    = apiGetFunctionAddress(SDL, "SDL_HasSSE3"),
            HasSSE41                                   = apiGetFunctionAddress(SDL, "SDL_HasSSE41"),
            HasSSE42                                   = apiGetFunctionAddress(SDL, "SDL_HasSSE42"),
            HasAVX                                     = apiGetFunctionAddress(SDL, "SDL_HasAVX"),
            HasAVX2                                    = apiGetFunctionAddress(SDL, "SDL_HasAVX2"),
            HasAVX512F                                 = apiGetFunctionAddress(SDL, "SDL_HasAVX512F"),
            HasARMSIMD                                 = apiGetFunctionAddress(SDL, "SDL_HasARMSIMD"),
            HasNEON                                    = apiGetFunctionAddress(SDL, "SDL_HasNEON"),
            HasLSX                                     = apiGetFunctionAddress(SDL, "SDL_HasLSX"),
            HasLASX                                    = apiGetFunctionAddress(SDL, "SDL_HasLASX"),
            GetSystemRAM                               = apiGetFunctionAddress(SDL, "SDL_GetSystemRAM"),
            GetSIMDAlignment                           = apiGetFunctionAddress(SDL, "SDL_GetSIMDAlignment"),
            ShowOpenFileDialog                         = apiGetFunctionAddress(SDL, "SDL_ShowOpenFileDialog"),
            ShowSaveFileDialog                         = apiGetFunctionAddress(SDL, "SDL_ShowSaveFileDialog"),
            ShowOpenFolderDialog                       = apiGetFunctionAddress(SDL, "SDL_ShowOpenFolderDialog"),
            ShowFileDialogWithProperties               = apiGetFunctionAddress(SDL, "SDL_ShowFileDialogWithProperties"),
            SetError                                   = apiGetFunctionAddress(SDL, "SDL_SetError"),
            SetErrorV                                  = apiGetFunctionAddress(SDL, "SDL_SetErrorV"),
            OutOfMemory                                = apiGetFunctionAddress(SDL, "SDL_OutOfMemory"),
            GetError                                   = apiGetFunctionAddress(SDL, "SDL_GetError"),
            ClearError                                 = apiGetFunctionAddress(SDL, "SDL_ClearError"),
            PumpEvents                                 = apiGetFunctionAddress(SDL, "SDL_PumpEvents"),
            PeepEvents                                 = apiGetFunctionAddress(SDL, "SDL_PeepEvents"),
            HasEvent                                   = apiGetFunctionAddress(SDL, "SDL_HasEvent"),
            HasEvents                                  = apiGetFunctionAddress(SDL, "SDL_HasEvents"),
            FlushEvent                                 = apiGetFunctionAddress(SDL, "SDL_FlushEvent"),
            FlushEvents                                = apiGetFunctionAddress(SDL, "SDL_FlushEvents"),
            PollEvent                                  = apiGetFunctionAddress(SDL, "SDL_PollEvent"),
            WaitEvent                                  = apiGetFunctionAddress(SDL, "SDL_WaitEvent"),
            WaitEventTimeout                           = apiGetFunctionAddress(SDL, "SDL_WaitEventTimeout"),
            PushEvent                                  = apiGetFunctionAddress(SDL, "SDL_PushEvent"),
            SetEventFilter                             = apiGetFunctionAddress(SDL, "SDL_SetEventFilter"),
            GetEventFilter                             = apiGetFunctionAddress(SDL, "SDL_GetEventFilter"),
            AddEventWatch                              = apiGetFunctionAddress(SDL, "SDL_AddEventWatch"),
            RemoveEventWatch                           = apiGetFunctionAddress(SDL, "SDL_RemoveEventWatch"),
            FilterEvents                               = apiGetFunctionAddress(SDL, "SDL_FilterEvents"),
            SetEventEnabled                            = apiGetFunctionAddress(SDL, "SDL_SetEventEnabled"),
            EventEnabled                               = apiGetFunctionAddress(SDL, "SDL_EventEnabled"),
            RegisterEvents                             = apiGetFunctionAddress(SDL, "SDL_RegisterEvents"),
            GetWindowFromEvent                         = apiGetFunctionAddress(SDL, "SDL_GetWindowFromEvent"),
            GetBasePath                                = apiGetFunctionAddress(SDL, "SDL_GetBasePath"),
            GetPrefPath                                = apiGetFunctionAddress(SDL, "SDL_GetPrefPath"),
            GetUserFolder                              = apiGetFunctionAddress(SDL, "SDL_GetUserFolder"),
            CreateDirectory                            = apiGetFunctionAddress(SDL, "SDL_CreateDirectory"),
            EnumerateDirectory                         = apiGetFunctionAddress(SDL, "SDL_EnumerateDirectory"),
            RemovePath                                 = apiGetFunctionAddress(SDL, "SDL_RemovePath"),
            RenamePath                                 = apiGetFunctionAddress(SDL, "SDL_RenamePath"),
            CopyFile                                   = apiGetFunctionAddress(SDL, "SDL_CopyFile"),
            GetPathInfo                                = apiGetFunctionAddress(SDL, "SDL_GetPathInfo"),
            GlobDirectory                              = apiGetFunctionAddress(SDL, "SDL_GlobDirectory"),
            GetCurrentDirectory                        = apiGetFunctionAddress(SDL, "SDL_GetCurrentDirectory"),
            GPUSupportsShaderFormats                   = apiGetFunctionAddress(SDL, "SDL_GPUSupportsShaderFormats"),
            GPUSupportsProperties                      = apiGetFunctionAddress(SDL, "SDL_GPUSupportsProperties"),
            CreateGPUDevice                            = apiGetFunctionAddress(SDL, "SDL_CreateGPUDevice"),
            CreateGPUDeviceWithProperties              = apiGetFunctionAddress(SDL, "SDL_CreateGPUDeviceWithProperties"),
            DestroyGPUDevice                           = apiGetFunctionAddress(SDL, "SDL_DestroyGPUDevice"),
            GetNumGPUDrivers                           = apiGetFunctionAddress(SDL, "SDL_GetNumGPUDrivers"),
            GetGPUDriver                               = apiGetFunctionAddress(SDL, "SDL_GetGPUDriver"),
            GetGPUDeviceDriver                         = apiGetFunctionAddress(SDL, "SDL_GetGPUDeviceDriver"),
            GetGPUShaderFormats                        = apiGetFunctionAddress(SDL, "SDL_GetGPUShaderFormats"),
            CreateGPUComputePipeline                   = apiGetFunctionAddress(SDL, "SDL_CreateGPUComputePipeline"),
            CreateGPUGraphicsPipeline                  = apiGetFunctionAddress(SDL, "SDL_CreateGPUGraphicsPipeline"),
            CreateGPUSampler                           = apiGetFunctionAddress(SDL, "SDL_CreateGPUSampler"),
            CreateGPUShader                            = apiGetFunctionAddress(SDL, "SDL_CreateGPUShader"),
            CreateGPUTexture                           = apiGetFunctionAddress(SDL, "SDL_CreateGPUTexture"),
            CreateGPUBuffer                            = apiGetFunctionAddress(SDL, "SDL_CreateGPUBuffer"),
            CreateGPUTransferBuffer                    = apiGetFunctionAddress(SDL, "SDL_CreateGPUTransferBuffer"),
            SetGPUBufferName                           = apiGetFunctionAddress(SDL, "SDL_SetGPUBufferName"),
            SetGPUTextureName                          = apiGetFunctionAddress(SDL, "SDL_SetGPUTextureName"),
            InsertGPUDebugLabel                        = apiGetFunctionAddress(SDL, "SDL_InsertGPUDebugLabel"),
            PushGPUDebugGroup                          = apiGetFunctionAddress(SDL, "SDL_PushGPUDebugGroup"),
            PopGPUDebugGroup                           = apiGetFunctionAddress(SDL, "SDL_PopGPUDebugGroup"),
            ReleaseGPUTexture                          = apiGetFunctionAddress(SDL, "SDL_ReleaseGPUTexture"),
            ReleaseGPUSampler                          = apiGetFunctionAddress(SDL, "SDL_ReleaseGPUSampler"),
            ReleaseGPUBuffer                           = apiGetFunctionAddress(SDL, "SDL_ReleaseGPUBuffer"),
            ReleaseGPUTransferBuffer                   = apiGetFunctionAddress(SDL, "SDL_ReleaseGPUTransferBuffer"),
            ReleaseGPUComputePipeline                  = apiGetFunctionAddress(SDL, "SDL_ReleaseGPUComputePipeline"),
            ReleaseGPUShader                           = apiGetFunctionAddress(SDL, "SDL_ReleaseGPUShader"),
            ReleaseGPUGraphicsPipeline                 = apiGetFunctionAddress(SDL, "SDL_ReleaseGPUGraphicsPipeline"),
            AcquireGPUCommandBuffer                    = apiGetFunctionAddress(SDL, "SDL_AcquireGPUCommandBuffer"),
            PushGPUVertexUniformData                   = apiGetFunctionAddress(SDL, "SDL_PushGPUVertexUniformData"),
            PushGPUFragmentUniformData                 = apiGetFunctionAddress(SDL, "SDL_PushGPUFragmentUniformData"),
            PushGPUComputeUniformData                  = apiGetFunctionAddress(SDL, "SDL_PushGPUComputeUniformData"),
            BeginGPURenderPass                         = apiGetFunctionAddress(SDL, "SDL_BeginGPURenderPass"),
            BindGPUGraphicsPipeline                    = apiGetFunctionAddress(SDL, "SDL_BindGPUGraphicsPipeline"),
            SetGPUViewport                             = apiGetFunctionAddress(SDL, "SDL_SetGPUViewport"),
            SetGPUScissor                              = apiGetFunctionAddress(SDL, "SDL_SetGPUScissor"),
            SetGPUBlendConstants                       = apiGetFunctionAddress(SDL, "SDL_SetGPUBlendConstants"),
            SetGPUStencilReference                     = apiGetFunctionAddress(SDL, "SDL_SetGPUStencilReference"),
            BindGPUVertexBuffers                       = apiGetFunctionAddress(SDL, "SDL_BindGPUVertexBuffers"),
            BindGPUIndexBuffer                         = apiGetFunctionAddress(SDL, "SDL_BindGPUIndexBuffer"),
            BindGPUVertexSamplers                      = apiGetFunctionAddress(SDL, "SDL_BindGPUVertexSamplers"),
            BindGPUVertexStorageTextures               = apiGetFunctionAddress(SDL, "SDL_BindGPUVertexStorageTextures"),
            BindGPUVertexStorageBuffers                = apiGetFunctionAddress(SDL, "SDL_BindGPUVertexStorageBuffers"),
            BindGPUFragmentSamplers                    = apiGetFunctionAddress(SDL, "SDL_BindGPUFragmentSamplers"),
            BindGPUFragmentStorageTextures             = apiGetFunctionAddress(SDL, "SDL_BindGPUFragmentStorageTextures"),
            BindGPUFragmentStorageBuffers              = apiGetFunctionAddress(SDL, "SDL_BindGPUFragmentStorageBuffers"),
            DrawGPUIndexedPrimitives                   = apiGetFunctionAddress(SDL, "SDL_DrawGPUIndexedPrimitives"),
            DrawGPUPrimitives                          = apiGetFunctionAddress(SDL, "SDL_DrawGPUPrimitives"),
            DrawGPUPrimitivesIndirect                  = apiGetFunctionAddress(SDL, "SDL_DrawGPUPrimitivesIndirect"),
            DrawGPUIndexedPrimitivesIndirect           = apiGetFunctionAddress(SDL, "SDL_DrawGPUIndexedPrimitivesIndirect"),
            EndGPURenderPass                           = apiGetFunctionAddress(SDL, "SDL_EndGPURenderPass"),
            BeginGPUComputePass                        = apiGetFunctionAddress(SDL, "SDL_BeginGPUComputePass"),
            BindGPUComputePipeline                     = apiGetFunctionAddress(SDL, "SDL_BindGPUComputePipeline"),
            BindGPUComputeSamplers                     = apiGetFunctionAddress(SDL, "SDL_BindGPUComputeSamplers"),
            BindGPUComputeStorageTextures              = apiGetFunctionAddress(SDL, "SDL_BindGPUComputeStorageTextures"),
            BindGPUComputeStorageBuffers               = apiGetFunctionAddress(SDL, "SDL_BindGPUComputeStorageBuffers"),
            DispatchGPUCompute                         = apiGetFunctionAddress(SDL, "SDL_DispatchGPUCompute"),
            DispatchGPUComputeIndirect                 = apiGetFunctionAddress(SDL, "SDL_DispatchGPUComputeIndirect"),
            EndGPUComputePass                          = apiGetFunctionAddress(SDL, "SDL_EndGPUComputePass"),
            MapGPUTransferBuffer                       = apiGetFunctionAddress(SDL, "SDL_MapGPUTransferBuffer"),
            UnmapGPUTransferBuffer                     = apiGetFunctionAddress(SDL, "SDL_UnmapGPUTransferBuffer"),
            BeginGPUCopyPass                           = apiGetFunctionAddress(SDL, "SDL_BeginGPUCopyPass"),
            UploadToGPUTexture                         = apiGetFunctionAddress(SDL, "SDL_UploadToGPUTexture"),
            UploadToGPUBuffer                          = apiGetFunctionAddress(SDL, "SDL_UploadToGPUBuffer"),
            CopyGPUTextureToTexture                    = apiGetFunctionAddress(SDL, "SDL_CopyGPUTextureToTexture"),
            CopyGPUBufferToBuffer                      = apiGetFunctionAddress(SDL, "SDL_CopyGPUBufferToBuffer"),
            DownloadFromGPUTexture                     = apiGetFunctionAddress(SDL, "SDL_DownloadFromGPUTexture"),
            DownloadFromGPUBuffer                      = apiGetFunctionAddress(SDL, "SDL_DownloadFromGPUBuffer"),
            EndGPUCopyPass                             = apiGetFunctionAddress(SDL, "SDL_EndGPUCopyPass"),
            GenerateMipmapsForGPUTexture               = apiGetFunctionAddress(SDL, "SDL_GenerateMipmapsForGPUTexture"),
            BlitGPUTexture                             = apiGetFunctionAddress(SDL, "SDL_BlitGPUTexture"),
            WindowSupportsGPUSwapchainComposition      = apiGetFunctionAddress(SDL, "SDL_WindowSupportsGPUSwapchainComposition"),
            WindowSupportsGPUPresentMode               = apiGetFunctionAddress(SDL, "SDL_WindowSupportsGPUPresentMode"),
            ClaimWindowForGPUDevice                    = apiGetFunctionAddress(SDL, "SDL_ClaimWindowForGPUDevice"),
            ReleaseWindowFromGPUDevice                 = apiGetFunctionAddress(SDL, "SDL_ReleaseWindowFromGPUDevice"),
            SetGPUSwapchainParameters                  = apiGetFunctionAddress(SDL, "SDL_SetGPUSwapchainParameters"),
            SetGPUAllowedFramesInFlight                = apiGetFunctionAddress(SDL, "SDL_SetGPUAllowedFramesInFlight"),
            GetGPUSwapchainTextureFormat               = apiGetFunctionAddress(SDL, "SDL_GetGPUSwapchainTextureFormat"),
            AcquireGPUSwapchainTexture                 = apiGetFunctionAddress(SDL, "SDL_AcquireGPUSwapchainTexture"),
            WaitForGPUSwapchain                        = apiGetFunctionAddress(SDL, "SDL_WaitForGPUSwapchain"),
            WaitAndAcquireGPUSwapchainTexture          = apiGetFunctionAddress(SDL, "SDL_WaitAndAcquireGPUSwapchainTexture"),
            SubmitGPUCommandBuffer                     = apiGetFunctionAddress(SDL, "SDL_SubmitGPUCommandBuffer"),
            SubmitGPUCommandBufferAndAcquireFence      = apiGetFunctionAddress(SDL, "SDL_SubmitGPUCommandBufferAndAcquireFence"),
            CancelGPUCommandBuffer                     = apiGetFunctionAddress(SDL, "SDL_CancelGPUCommandBuffer"),
            WaitForGPUIdle                             = apiGetFunctionAddress(SDL, "SDL_WaitForGPUIdle"),
            WaitForGPUFences                           = apiGetFunctionAddress(SDL, "SDL_WaitForGPUFences"),
            QueryGPUFence                              = apiGetFunctionAddress(SDL, "SDL_QueryGPUFence"),
            ReleaseGPUFence                            = apiGetFunctionAddress(SDL, "SDL_ReleaseGPUFence"),
            GPUTextureFormatTexelBlockSize             = apiGetFunctionAddress(SDL, "SDL_GPUTextureFormatTexelBlockSize"),
            GPUTextureSupportsFormat                   = apiGetFunctionAddress(SDL, "SDL_GPUTextureSupportsFormat"),
            GPUTextureSupportsSampleCount              = apiGetFunctionAddress(SDL, "SDL_GPUTextureSupportsSampleCount"),
            CalculateGPUTextureFormatSize              = apiGetFunctionAddress(SDL, "SDL_CalculateGPUTextureFormatSize"),
            GUIDToString                               = apiGetFunctionAddress(SDL, "SDL_GUIDToString"),
            StringToGUID                               = apiGetFunctionAddress(SDL, "SDL_StringToGUID"),
            GetHaptics                                 = apiGetFunctionAddress(SDL, "SDL_GetHaptics"),
            GetHapticNameForID                         = apiGetFunctionAddress(SDL, "SDL_GetHapticNameForID"),
            OpenHaptic                                 = apiGetFunctionAddress(SDL, "SDL_OpenHaptic"),
            GetHapticFromID                            = apiGetFunctionAddress(SDL, "SDL_GetHapticFromID"),
            GetHapticID                                = apiGetFunctionAddress(SDL, "SDL_GetHapticID"),
            GetHapticName                              = apiGetFunctionAddress(SDL, "SDL_GetHapticName"),
            IsMouseHaptic                              = apiGetFunctionAddress(SDL, "SDL_IsMouseHaptic"),
            OpenHapticFromMouse                        = apiGetFunctionAddress(SDL, "SDL_OpenHapticFromMouse"),
            IsJoystickHaptic                           = apiGetFunctionAddress(SDL, "SDL_IsJoystickHaptic"),
            OpenHapticFromJoystick                     = apiGetFunctionAddress(SDL, "SDL_OpenHapticFromJoystick"),
            CloseHaptic                                = apiGetFunctionAddress(SDL, "SDL_CloseHaptic"),
            GetMaxHapticEffects                        = apiGetFunctionAddress(SDL, "SDL_GetMaxHapticEffects"),
            GetMaxHapticEffectsPlaying                 = apiGetFunctionAddress(SDL, "SDL_GetMaxHapticEffectsPlaying"),
            GetHapticFeatures                          = apiGetFunctionAddress(SDL, "SDL_GetHapticFeatures"),
            GetNumHapticAxes                           = apiGetFunctionAddress(SDL, "SDL_GetNumHapticAxes"),
            HapticEffectSupported                      = apiGetFunctionAddress(SDL, "SDL_HapticEffectSupported"),
            CreateHapticEffect                         = apiGetFunctionAddress(SDL, "SDL_CreateHapticEffect"),
            UpdateHapticEffect                         = apiGetFunctionAddress(SDL, "SDL_UpdateHapticEffect"),
            RunHapticEffect                            = apiGetFunctionAddress(SDL, "SDL_RunHapticEffect"),
            StopHapticEffect                           = apiGetFunctionAddress(SDL, "SDL_StopHapticEffect"),
            DestroyHapticEffect                        = apiGetFunctionAddress(SDL, "SDL_DestroyHapticEffect"),
            GetHapticEffectStatus                      = apiGetFunctionAddress(SDL, "SDL_GetHapticEffectStatus"),
            SetHapticGain                              = apiGetFunctionAddress(SDL, "SDL_SetHapticGain"),
            SetHapticAutocenter                        = apiGetFunctionAddress(SDL, "SDL_SetHapticAutocenter"),
            PauseHaptic                                = apiGetFunctionAddress(SDL, "SDL_PauseHaptic"),
            ResumeHaptic                               = apiGetFunctionAddress(SDL, "SDL_ResumeHaptic"),
            StopHapticEffects                          = apiGetFunctionAddress(SDL, "SDL_StopHapticEffects"),
            HapticRumbleSupported                      = apiGetFunctionAddress(SDL, "SDL_HapticRumbleSupported"),
            InitHapticRumble                           = apiGetFunctionAddress(SDL, "SDL_InitHapticRumble"),
            PlayHapticRumble                           = apiGetFunctionAddress(SDL, "SDL_PlayHapticRumble"),
            StopHapticRumble                           = apiGetFunctionAddress(SDL, "SDL_StopHapticRumble"),
            hid_init                                   = apiGetFunctionAddress(SDL, "SDL_hid_init"),
            hid_exit                                   = apiGetFunctionAddress(SDL, "SDL_hid_exit"),
            hid_device_change_count                    = apiGetFunctionAddress(SDL, "SDL_hid_device_change_count"),
            hid_enumerate                              = apiGetFunctionAddress(SDL, "SDL_hid_enumerate"),
            hid_free_enumeration                       = apiGetFunctionAddress(SDL, "SDL_hid_free_enumeration"),
            hid_open                                   = apiGetFunctionAddress(SDL, "SDL_hid_open"),
            hid_open_path                              = apiGetFunctionAddress(SDL, "SDL_hid_open_path"),
            hid_write                                  = apiGetFunctionAddress(SDL, "SDL_hid_write"),
            hid_read_timeout                           = apiGetFunctionAddress(SDL, "SDL_hid_read_timeout"),
            hid_read                                   = apiGetFunctionAddress(SDL, "SDL_hid_read"),
            hid_set_nonblocking                        = apiGetFunctionAddress(SDL, "SDL_hid_set_nonblocking"),
            hid_send_feature_report                    = apiGetFunctionAddress(SDL, "SDL_hid_send_feature_report"),
            hid_get_feature_report                     = apiGetFunctionAddress(SDL, "SDL_hid_get_feature_report"),
            hid_get_input_report                       = apiGetFunctionAddress(SDL, "SDL_hid_get_input_report"),
            hid_close                                  = apiGetFunctionAddress(SDL, "SDL_hid_close"),
            hid_get_manufacturer_string                = apiGetFunctionAddress(SDL, "SDL_hid_get_manufacturer_string"),
            hid_get_product_string                     = apiGetFunctionAddress(SDL, "SDL_hid_get_product_string"),
            hid_get_serial_number_string               = apiGetFunctionAddress(SDL, "SDL_hid_get_serial_number_string"),
            hid_get_indexed_string                     = apiGetFunctionAddress(SDL, "SDL_hid_get_indexed_string"),
            hid_get_device_info                        = apiGetFunctionAddress(SDL, "SDL_hid_get_device_info"),
            hid_get_report_descriptor                  = apiGetFunctionAddress(SDL, "SDL_hid_get_report_descriptor"),
            hid_ble_scan                               = apiGetFunctionAddress(SDL, "SDL_hid_ble_scan"),
            SetHintWithPriority                        = apiGetFunctionAddress(SDL, "SDL_SetHintWithPriority"),
            SetHint                                    = apiGetFunctionAddress(SDL, "SDL_SetHint"),
            ResetHint                                  = apiGetFunctionAddress(SDL, "SDL_ResetHint"),
            ResetHints                                 = apiGetFunctionAddress(SDL, "SDL_ResetHints"),
            GetHint                                    = apiGetFunctionAddress(SDL, "SDL_GetHint"),
            GetHintBoolean                             = apiGetFunctionAddress(SDL, "SDL_GetHintBoolean"),
            AddHintCallback                            = apiGetFunctionAddress(SDL, "SDL_AddHintCallback"),
            RemoveHintCallback                         = apiGetFunctionAddress(SDL, "SDL_RemoveHintCallback"),
            Init                                       = apiGetFunctionAddress(SDL, "SDL_Init"),
            InitSubSystem                              = apiGetFunctionAddress(SDL, "SDL_InitSubSystem"),
            QuitSubSystem                              = apiGetFunctionAddress(SDL, "SDL_QuitSubSystem"),
            WasInit                                    = apiGetFunctionAddress(SDL, "SDL_WasInit"),
            Quit                                       = apiGetFunctionAddress(SDL, "SDL_Quit"),
            IsMainThread                               = apiGetFunctionAddress(SDL, "SDL_IsMainThread"),
            RunOnMainThread                            = apiGetFunctionAddress(SDL, "SDL_RunOnMainThread"),
            SetAppMetadata                             = apiGetFunctionAddress(SDL, "SDL_SetAppMetadata"),
            SetAppMetadataProperty                     = apiGetFunctionAddress(SDL, "SDL_SetAppMetadataProperty"),
            GetAppMetadataProperty                     = apiGetFunctionAddress(SDL, "SDL_GetAppMetadataProperty"),
            IOFromFile                                 = apiGetFunctionAddress(SDL, "SDL_IOFromFile"),
            IOFromMem                                  = apiGetFunctionAddress(SDL, "SDL_IOFromMem"),
            IOFromConstMem                             = apiGetFunctionAddress(SDL, "SDL_IOFromConstMem"),
            IOFromDynamicMem                           = apiGetFunctionAddress(SDL, "SDL_IOFromDynamicMem"),
            OpenIO                                     = apiGetFunctionAddress(SDL, "SDL_OpenIO"),
            CloseIO                                    = apiGetFunctionAddress(SDL, "SDL_CloseIO"),
            GetIOProperties                            = apiGetFunctionAddress(SDL, "SDL_GetIOProperties"),
            GetIOStatus                                = apiGetFunctionAddress(SDL, "SDL_GetIOStatus"),
            GetIOSize                                  = apiGetFunctionAddress(SDL, "SDL_GetIOSize"),
            SeekIO                                     = apiGetFunctionAddress(SDL, "SDL_SeekIO"),
            TellIO                                     = apiGetFunctionAddress(SDL, "SDL_TellIO"),
            ReadIO                                     = apiGetFunctionAddress(SDL, "SDL_ReadIO"),
            WriteIO                                    = apiGetFunctionAddress(SDL, "SDL_WriteIO"),
            IOprintf                                   = apiGetFunctionAddress(SDL, "SDL_IOprintf"),
            IOvprintf                                  = apiGetFunctionAddress(SDL, "SDL_IOvprintf"),
            FlushIO                                    = apiGetFunctionAddress(SDL, "SDL_FlushIO"),
            LoadFile_IO                                = apiGetFunctionAddress(SDL, "SDL_LoadFile_IO"),
            LoadFile                                   = apiGetFunctionAddress(SDL, "SDL_LoadFile"),
            SaveFile_IO                                = apiGetFunctionAddress(SDL, "SDL_SaveFile_IO"),
            SaveFile                                   = apiGetFunctionAddress(SDL, "SDL_SaveFile"),
            ReadU8                                     = apiGetFunctionAddress(SDL, "SDL_ReadU8"),
            ReadS8                                     = apiGetFunctionAddress(SDL, "SDL_ReadS8"),
            ReadU16LE                                  = apiGetFunctionAddress(SDL, "SDL_ReadU16LE"),
            ReadS16LE                                  = apiGetFunctionAddress(SDL, "SDL_ReadS16LE"),
            ReadU16BE                                  = apiGetFunctionAddress(SDL, "SDL_ReadU16BE"),
            ReadS16BE                                  = apiGetFunctionAddress(SDL, "SDL_ReadS16BE"),
            ReadU32LE                                  = apiGetFunctionAddress(SDL, "SDL_ReadU32LE"),
            ReadS32LE                                  = apiGetFunctionAddress(SDL, "SDL_ReadS32LE"),
            ReadU32BE                                  = apiGetFunctionAddress(SDL, "SDL_ReadU32BE"),
            ReadS32BE                                  = apiGetFunctionAddress(SDL, "SDL_ReadS32BE"),
            ReadU64LE                                  = apiGetFunctionAddress(SDL, "SDL_ReadU64LE"),
            ReadS64LE                                  = apiGetFunctionAddress(SDL, "SDL_ReadS64LE"),
            ReadU64BE                                  = apiGetFunctionAddress(SDL, "SDL_ReadU64BE"),
            ReadS64BE                                  = apiGetFunctionAddress(SDL, "SDL_ReadS64BE"),
            WriteU8                                    = apiGetFunctionAddress(SDL, "SDL_WriteU8"),
            WriteS8                                    = apiGetFunctionAddress(SDL, "SDL_WriteS8"),
            WriteU16LE                                 = apiGetFunctionAddress(SDL, "SDL_WriteU16LE"),
            WriteS16LE                                 = apiGetFunctionAddress(SDL, "SDL_WriteS16LE"),
            WriteU16BE                                 = apiGetFunctionAddress(SDL, "SDL_WriteU16BE"),
            WriteS16BE                                 = apiGetFunctionAddress(SDL, "SDL_WriteS16BE"),
            WriteU32LE                                 = apiGetFunctionAddress(SDL, "SDL_WriteU32LE"),
            WriteS32LE                                 = apiGetFunctionAddress(SDL, "SDL_WriteS32LE"),
            WriteU32BE                                 = apiGetFunctionAddress(SDL, "SDL_WriteU32BE"),
            WriteS32BE                                 = apiGetFunctionAddress(SDL, "SDL_WriteS32BE"),
            WriteU64LE                                 = apiGetFunctionAddress(SDL, "SDL_WriteU64LE"),
            WriteS64LE                                 = apiGetFunctionAddress(SDL, "SDL_WriteS64LE"),
            WriteU64BE                                 = apiGetFunctionAddress(SDL, "SDL_WriteU64BE"),
            WriteS64BE                                 = apiGetFunctionAddress(SDL, "SDL_WriteS64BE"),
            LockJoysticks                              = apiGetFunctionAddress(SDL, "SDL_LockJoysticks"),
            UnlockJoysticks                            = apiGetFunctionAddress(SDL, "SDL_UnlockJoysticks"),
            HasJoystick                                = apiGetFunctionAddress(SDL, "SDL_HasJoystick"),
            GetJoysticks                               = apiGetFunctionAddress(SDL, "SDL_GetJoysticks"),
            GetJoystickNameForID                       = apiGetFunctionAddress(SDL, "SDL_GetJoystickNameForID"),
            GetJoystickPathForID                       = apiGetFunctionAddress(SDL, "SDL_GetJoystickPathForID"),
            GetJoystickPlayerIndexForID                = apiGetFunctionAddress(SDL, "SDL_GetJoystickPlayerIndexForID"),
            GetJoystickGUIDForID                       = apiGetFunctionAddress(SDL, "SDL_GetJoystickGUIDForID"),
            GetJoystickVendorForID                     = apiGetFunctionAddress(SDL, "SDL_GetJoystickVendorForID"),
            GetJoystickProductForID                    = apiGetFunctionAddress(SDL, "SDL_GetJoystickProductForID"),
            GetJoystickProductVersionForID             = apiGetFunctionAddress(SDL, "SDL_GetJoystickProductVersionForID"),
            GetJoystickTypeForID                       = apiGetFunctionAddress(SDL, "SDL_GetJoystickTypeForID"),
            OpenJoystick                               = apiGetFunctionAddress(SDL, "SDL_OpenJoystick"),
            GetJoystickFromID                          = apiGetFunctionAddress(SDL, "SDL_GetJoystickFromID"),
            GetJoystickFromPlayerIndex                 = apiGetFunctionAddress(SDL, "SDL_GetJoystickFromPlayerIndex"),
            AttachVirtualJoystick                      = apiGetFunctionAddress(SDL, "SDL_AttachVirtualJoystick"),
            DetachVirtualJoystick                      = apiGetFunctionAddress(SDL, "SDL_DetachVirtualJoystick"),
            IsJoystickVirtual                          = apiGetFunctionAddress(SDL, "SDL_IsJoystickVirtual"),
            SetJoystickVirtualAxis                     = apiGetFunctionAddress(SDL, "SDL_SetJoystickVirtualAxis"),
            SetJoystickVirtualBall                     = apiGetFunctionAddress(SDL, "SDL_SetJoystickVirtualBall"),
            SetJoystickVirtualButton                   = apiGetFunctionAddress(SDL, "SDL_SetJoystickVirtualButton"),
            SetJoystickVirtualHat                      = apiGetFunctionAddress(SDL, "SDL_SetJoystickVirtualHat"),
            SetJoystickVirtualTouchpad                 = apiGetFunctionAddress(SDL, "SDL_SetJoystickVirtualTouchpad"),
            SendJoystickVirtualSensorData              = apiGetFunctionAddress(SDL, "SDL_SendJoystickVirtualSensorData"),
            GetJoystickProperties                      = apiGetFunctionAddress(SDL, "SDL_GetJoystickProperties"),
            GetJoystickName                            = apiGetFunctionAddress(SDL, "SDL_GetJoystickName"),
            GetJoystickPath                            = apiGetFunctionAddress(SDL, "SDL_GetJoystickPath"),
            GetJoystickPlayerIndex                     = apiGetFunctionAddress(SDL, "SDL_GetJoystickPlayerIndex"),
            SetJoystickPlayerIndex                     = apiGetFunctionAddress(SDL, "SDL_SetJoystickPlayerIndex"),
            GetJoystickGUID                            = apiGetFunctionAddress(SDL, "SDL_GetJoystickGUID"),
            GetJoystickVendor                          = apiGetFunctionAddress(SDL, "SDL_GetJoystickVendor"),
            GetJoystickProduct                         = apiGetFunctionAddress(SDL, "SDL_GetJoystickProduct"),
            GetJoystickProductVersion                  = apiGetFunctionAddress(SDL, "SDL_GetJoystickProductVersion"),
            GetJoystickFirmwareVersion                 = apiGetFunctionAddress(SDL, "SDL_GetJoystickFirmwareVersion"),
            GetJoystickSerial                          = apiGetFunctionAddress(SDL, "SDL_GetJoystickSerial"),
            GetJoystickType                            = apiGetFunctionAddress(SDL, "SDL_GetJoystickType"),
            GetJoystickGUIDInfo                        = apiGetFunctionAddress(SDL, "SDL_GetJoystickGUIDInfo"),
            JoystickConnected                          = apiGetFunctionAddress(SDL, "SDL_JoystickConnected"),
            GetJoystickID                              = apiGetFunctionAddress(SDL, "SDL_GetJoystickID"),
            GetNumJoystickAxes                         = apiGetFunctionAddress(SDL, "SDL_GetNumJoystickAxes"),
            GetNumJoystickBalls                        = apiGetFunctionAddress(SDL, "SDL_GetNumJoystickBalls"),
            GetNumJoystickHats                         = apiGetFunctionAddress(SDL, "SDL_GetNumJoystickHats"),
            GetNumJoystickButtons                      = apiGetFunctionAddress(SDL, "SDL_GetNumJoystickButtons"),
            SetJoystickEventsEnabled                   = apiGetFunctionAddress(SDL, "SDL_SetJoystickEventsEnabled"),
            JoystickEventsEnabled                      = apiGetFunctionAddress(SDL, "SDL_JoystickEventsEnabled"),
            UpdateJoysticks                            = apiGetFunctionAddress(SDL, "SDL_UpdateJoysticks"),
            GetJoystickAxis                            = apiGetFunctionAddress(SDL, "SDL_GetJoystickAxis"),
            GetJoystickAxisInitialState                = apiGetFunctionAddress(SDL, "SDL_GetJoystickAxisInitialState"),
            GetJoystickBall                            = apiGetFunctionAddress(SDL, "SDL_GetJoystickBall"),
            GetJoystickHat                             = apiGetFunctionAddress(SDL, "SDL_GetJoystickHat"),
            GetJoystickButton                          = apiGetFunctionAddress(SDL, "SDL_GetJoystickButton"),
            RumbleJoystick                             = apiGetFunctionAddress(SDL, "SDL_RumbleJoystick"),
            RumbleJoystickTriggers                     = apiGetFunctionAddress(SDL, "SDL_RumbleJoystickTriggers"),
            SetJoystickLED                             = apiGetFunctionAddress(SDL, "SDL_SetJoystickLED"),
            SendJoystickEffect                         = apiGetFunctionAddress(SDL, "SDL_SendJoystickEffect"),
            CloseJoystick                              = apiGetFunctionAddress(SDL, "SDL_CloseJoystick"),
            GetJoystickConnectionState                 = apiGetFunctionAddress(SDL, "SDL_GetJoystickConnectionState"),
            GetJoystickPowerInfo                       = apiGetFunctionAddress(SDL, "SDL_GetJoystickPowerInfo"),
            AddGamepadMapping                          = apiGetFunctionAddress(SDL, "SDL_AddGamepadMapping"),
            AddGamepadMappingsFromIO                   = apiGetFunctionAddress(SDL, "SDL_AddGamepadMappingsFromIO"),
            AddGamepadMappingsFromFile                 = apiGetFunctionAddress(SDL, "SDL_AddGamepadMappingsFromFile"),
            ReloadGamepadMappings                      = apiGetFunctionAddress(SDL, "SDL_ReloadGamepadMappings"),
            GetGamepadMappings                         = apiGetFunctionAddress(SDL, "SDL_GetGamepadMappings"),
            GetGamepadMappingForGUID                   = apiGetFunctionAddress(SDL, "SDL_GetGamepadMappingForGUID"),
            GetGamepadMapping                          = apiGetFunctionAddress(SDL, "SDL_GetGamepadMapping"),
            SetGamepadMapping                          = apiGetFunctionAddress(SDL, "SDL_SetGamepadMapping"),
            HasGamepad                                 = apiGetFunctionAddress(SDL, "SDL_HasGamepad"),
            GetGamepads                                = apiGetFunctionAddress(SDL, "SDL_GetGamepads"),
            IsGamepad                                  = apiGetFunctionAddress(SDL, "SDL_IsGamepad"),
            GetGamepadNameForID                        = apiGetFunctionAddress(SDL, "SDL_GetGamepadNameForID"),
            GetGamepadPathForID                        = apiGetFunctionAddress(SDL, "SDL_GetGamepadPathForID"),
            GetGamepadPlayerIndexForID                 = apiGetFunctionAddress(SDL, "SDL_GetGamepadPlayerIndexForID"),
            GetGamepadGUIDForID                        = apiGetFunctionAddress(SDL, "SDL_GetGamepadGUIDForID"),
            GetGamepadVendorForID                      = apiGetFunctionAddress(SDL, "SDL_GetGamepadVendorForID"),
            GetGamepadProductForID                     = apiGetFunctionAddress(SDL, "SDL_GetGamepadProductForID"),
            GetGamepadProductVersionForID              = apiGetFunctionAddress(SDL, "SDL_GetGamepadProductVersionForID"),
            GetGamepadTypeForID                        = apiGetFunctionAddress(SDL, "SDL_GetGamepadTypeForID"),
            GetRealGamepadTypeForID                    = apiGetFunctionAddress(SDL, "SDL_GetRealGamepadTypeForID"),
            GetGamepadMappingForID                     = apiGetFunctionAddress(SDL, "SDL_GetGamepadMappingForID"),
            OpenGamepad                                = apiGetFunctionAddress(SDL, "SDL_OpenGamepad"),
            GetGamepadFromID                           = apiGetFunctionAddress(SDL, "SDL_GetGamepadFromID"),
            GetGamepadFromPlayerIndex                  = apiGetFunctionAddress(SDL, "SDL_GetGamepadFromPlayerIndex"),
            GetGamepadProperties                       = apiGetFunctionAddress(SDL, "SDL_GetGamepadProperties"),
            GetGamepadID                               = apiGetFunctionAddress(SDL, "SDL_GetGamepadID"),
            GetGamepadName                             = apiGetFunctionAddress(SDL, "SDL_GetGamepadName"),
            GetGamepadPath                             = apiGetFunctionAddress(SDL, "SDL_GetGamepadPath"),
            GetGamepadType                             = apiGetFunctionAddress(SDL, "SDL_GetGamepadType"),
            GetRealGamepadType                         = apiGetFunctionAddress(SDL, "SDL_GetRealGamepadType"),
            GetGamepadPlayerIndex                      = apiGetFunctionAddress(SDL, "SDL_GetGamepadPlayerIndex"),
            SetGamepadPlayerIndex                      = apiGetFunctionAddress(SDL, "SDL_SetGamepadPlayerIndex"),
            GetGamepadVendor                           = apiGetFunctionAddress(SDL, "SDL_GetGamepadVendor"),
            GetGamepadProduct                          = apiGetFunctionAddress(SDL, "SDL_GetGamepadProduct"),
            GetGamepadProductVersion                   = apiGetFunctionAddress(SDL, "SDL_GetGamepadProductVersion"),
            GetGamepadFirmwareVersion                  = apiGetFunctionAddress(SDL, "SDL_GetGamepadFirmwareVersion"),
            GetGamepadSerial                           = apiGetFunctionAddress(SDL, "SDL_GetGamepadSerial"),
            GetGamepadSteamHandle                      = apiGetFunctionAddress(SDL, "SDL_GetGamepadSteamHandle"),
            GetGamepadConnectionState                  = apiGetFunctionAddress(SDL, "SDL_GetGamepadConnectionState"),
            GetGamepadPowerInfo                        = apiGetFunctionAddress(SDL, "SDL_GetGamepadPowerInfo"),
            GamepadConnected                           = apiGetFunctionAddress(SDL, "SDL_GamepadConnected"),
            GetGamepadJoystick                         = apiGetFunctionAddress(SDL, "SDL_GetGamepadJoystick"),
            SetGamepadEventsEnabled                    = apiGetFunctionAddress(SDL, "SDL_SetGamepadEventsEnabled"),
            GamepadEventsEnabled                       = apiGetFunctionAddress(SDL, "SDL_GamepadEventsEnabled"),
            GetGamepadBindings                         = apiGetFunctionAddress(SDL, "SDL_GetGamepadBindings"),
            UpdateGamepads                             = apiGetFunctionAddress(SDL, "SDL_UpdateGamepads"),
            GetGamepadTypeFromString                   = apiGetFunctionAddress(SDL, "SDL_GetGamepadTypeFromString"),
            GetGamepadStringForType                    = apiGetFunctionAddress(SDL, "SDL_GetGamepadStringForType"),
            GetGamepadAxisFromString                   = apiGetFunctionAddress(SDL, "SDL_GetGamepadAxisFromString"),
            GetGamepadStringForAxis                    = apiGetFunctionAddress(SDL, "SDL_GetGamepadStringForAxis"),
            GamepadHasAxis                             = apiGetFunctionAddress(SDL, "SDL_GamepadHasAxis"),
            GetGamepadAxis                             = apiGetFunctionAddress(SDL, "SDL_GetGamepadAxis"),
            GetGamepadButtonFromString                 = apiGetFunctionAddress(SDL, "SDL_GetGamepadButtonFromString"),
            GetGamepadStringForButton                  = apiGetFunctionAddress(SDL, "SDL_GetGamepadStringForButton"),
            GamepadHasButton                           = apiGetFunctionAddress(SDL, "SDL_GamepadHasButton"),
            GetGamepadButton                           = apiGetFunctionAddress(SDL, "SDL_GetGamepadButton"),
            GetGamepadButtonLabelForType               = apiGetFunctionAddress(SDL, "SDL_GetGamepadButtonLabelForType"),
            GetGamepadButtonLabel                      = apiGetFunctionAddress(SDL, "SDL_GetGamepadButtonLabel"),
            GetNumGamepadTouchpads                     = apiGetFunctionAddress(SDL, "SDL_GetNumGamepadTouchpads"),
            GetNumGamepadTouchpadFingers               = apiGetFunctionAddress(SDL, "SDL_GetNumGamepadTouchpadFingers"),
            GetGamepadTouchpadFinger                   = apiGetFunctionAddress(SDL, "SDL_GetGamepadTouchpadFinger"),
            GamepadHasSensor                           = apiGetFunctionAddress(SDL, "SDL_GamepadHasSensor"),
            SetGamepadSensorEnabled                    = apiGetFunctionAddress(SDL, "SDL_SetGamepadSensorEnabled"),
            GamepadSensorEnabled                       = apiGetFunctionAddress(SDL, "SDL_GamepadSensorEnabled"),
            GetGamepadSensorDataRate                   = apiGetFunctionAddress(SDL, "SDL_GetGamepadSensorDataRate"),
            GetGamepadSensorData                       = apiGetFunctionAddress(SDL, "SDL_GetGamepadSensorData"),
            RumbleGamepad                              = apiGetFunctionAddress(SDL, "SDL_RumbleGamepad"),
            RumbleGamepadTriggers                      = apiGetFunctionAddress(SDL, "SDL_RumbleGamepadTriggers"),
            SetGamepadLED                              = apiGetFunctionAddress(SDL, "SDL_SetGamepadLED"),
            SendGamepadEffect                          = apiGetFunctionAddress(SDL, "SDL_SendGamepadEffect"),
            CloseGamepad                               = apiGetFunctionAddress(SDL, "SDL_CloseGamepad"),
            GetGamepadAppleSFSymbolsNameForButton      = apiGetFunctionAddress(SDL, "SDL_GetGamepadAppleSFSymbolsNameForButton"),
            GetGamepadAppleSFSymbolsNameForAxis        = apiGetFunctionAddress(SDL, "SDL_GetGamepadAppleSFSymbolsNameForAxis"),
            HasKeyboard                                = apiGetFunctionAddress(SDL, "SDL_HasKeyboard"),
            GetKeyboards                               = apiGetFunctionAddress(SDL, "SDL_GetKeyboards"),
            GetKeyboardNameForID                       = apiGetFunctionAddress(SDL, "SDL_GetKeyboardNameForID"),
            GetKeyboardFocus                           = apiGetFunctionAddress(SDL, "SDL_GetKeyboardFocus"),
            GetKeyboardState                           = apiGetFunctionAddress(SDL, "SDL_GetKeyboardState"),
            ResetKeyboard                              = apiGetFunctionAddress(SDL, "SDL_ResetKeyboard"),
            GetModState                                = apiGetFunctionAddress(SDL, "SDL_GetModState"),
            SetModState                                = apiGetFunctionAddress(SDL, "SDL_SetModState"),
            GetKeyFromScancode                         = apiGetFunctionAddress(SDL, "SDL_GetKeyFromScancode"),
            GetScancodeFromKey                         = apiGetFunctionAddress(SDL, "SDL_GetScancodeFromKey"),
            SetScancodeName                            = apiGetFunctionAddress(SDL, "SDL_SetScancodeName"),
            GetScancodeName                            = apiGetFunctionAddress(SDL, "SDL_GetScancodeName"),
            GetScancodeFromName                        = apiGetFunctionAddress(SDL, "SDL_GetScancodeFromName"),
            GetKeyName                                 = apiGetFunctionAddress(SDL, "SDL_GetKeyName"),
            GetKeyFromName                             = apiGetFunctionAddress(SDL, "SDL_GetKeyFromName"),
            StartTextInput                             = apiGetFunctionAddress(SDL, "SDL_StartTextInput"),
            StartTextInputWithProperties               = apiGetFunctionAddress(SDL, "SDL_StartTextInputWithProperties"),
            TextInputActive                            = apiGetFunctionAddress(SDL, "SDL_TextInputActive"),
            StopTextInput                              = apiGetFunctionAddress(SDL, "SDL_StopTextInput"),
            ClearComposition                           = apiGetFunctionAddress(SDL, "SDL_ClearComposition"),
            SetTextInputArea                           = apiGetFunctionAddress(SDL, "SDL_SetTextInputArea"),
            GetTextInputArea                           = apiGetFunctionAddress(SDL, "SDL_GetTextInputArea"),
            HasScreenKeyboardSupport                   = apiGetFunctionAddress(SDL, "SDL_HasScreenKeyboardSupport"),
            ScreenKeyboardShown                        = apiGetFunctionAddress(SDL, "SDL_ScreenKeyboardShown"),
            GetPreferredLocales                        = apiGetFunctionAddress(SDL, "SDL_GetPreferredLocales"),
            SetLogPriorities                           = apiGetFunctionAddress(SDL, "SDL_SetLogPriorities"),
            SetLogPriority                             = apiGetFunctionAddress(SDL, "SDL_SetLogPriority"),
            GetLogPriority                             = apiGetFunctionAddress(SDL, "SDL_GetLogPriority"),
            ResetLogPriorities                         = apiGetFunctionAddress(SDL, "SDL_ResetLogPriorities"),
            SetLogPriorityPrefix                       = apiGetFunctionAddress(SDL, "SDL_SetLogPriorityPrefix"),
            LogMessage                                 = apiGetFunctionAddress(SDL, "SDL_LogMessage"),
            LogMessageV                                = apiGetFunctionAddress(SDL, "SDL_LogMessageV"),
            GetDefaultLogOutputFunction                = apiGetFunctionAddress(SDL, "SDL_GetDefaultLogOutputFunction"),
            GetLogOutputFunction                       = apiGetFunctionAddress(SDL, "SDL_GetLogOutputFunction"),
            SetLogOutputFunction                       = apiGetFunctionAddress(SDL, "SDL_SetLogOutputFunction"),
            ShowMessageBox                             = apiGetFunctionAddress(SDL, "SDL_ShowMessageBox"),
            ShowSimpleMessageBox                       = apiGetFunctionAddress(SDL, "SDL_ShowSimpleMessageBox"),
            OpenURL                                    = apiGetFunctionAddress(SDL, "SDL_OpenURL"),
            HasMouse                                   = apiGetFunctionAddress(SDL, "SDL_HasMouse"),
            GetMice                                    = apiGetFunctionAddress(SDL, "SDL_GetMice"),
            GetMouseNameForID                          = apiGetFunctionAddress(SDL, "SDL_GetMouseNameForID"),
            GetMouseFocus                              = apiGetFunctionAddress(SDL, "SDL_GetMouseFocus"),
            GetMouseState                              = apiGetFunctionAddress(SDL, "SDL_GetMouseState"),
            GetGlobalMouseState                        = apiGetFunctionAddress(SDL, "SDL_GetGlobalMouseState"),
            GetRelativeMouseState                      = apiGetFunctionAddress(SDL, "SDL_GetRelativeMouseState"),
            WarpMouseInWindow                          = apiGetFunctionAddress(SDL, "SDL_WarpMouseInWindow"),
            WarpMouseGlobal                            = apiGetFunctionAddress(SDL, "SDL_WarpMouseGlobal"),
            SetWindowRelativeMouseMode                 = apiGetFunctionAddress(SDL, "SDL_SetWindowRelativeMouseMode"),
            GetWindowRelativeMouseMode                 = apiGetFunctionAddress(SDL, "SDL_GetWindowRelativeMouseMode"),
            CaptureMouse                               = apiGetFunctionAddress(SDL, "SDL_CaptureMouse"),
            CreateCursor                               = apiGetFunctionAddress(SDL, "SDL_CreateCursor"),
            CreateColorCursor                          = apiGetFunctionAddress(SDL, "SDL_CreateColorCursor"),
            CreateSystemCursor                         = apiGetFunctionAddress(SDL, "SDL_CreateSystemCursor"),
            SetCursor                                  = apiGetFunctionAddress(SDL, "SDL_SetCursor"),
            GetCursor                                  = apiGetFunctionAddress(SDL, "SDL_GetCursor"),
            GetDefaultCursor                           = apiGetFunctionAddress(SDL, "SDL_GetDefaultCursor"),
            DestroyCursor                              = apiGetFunctionAddress(SDL, "SDL_DestroyCursor"),
            ShowCursor                                 = apiGetFunctionAddress(SDL, "SDL_ShowCursor"),
            HideCursor                                 = apiGetFunctionAddress(SDL, "SDL_HideCursor"),
            CursorVisible                              = apiGetFunctionAddress(SDL, "SDL_CursorVisible"),
            GetPixelFormatName                         = apiGetFunctionAddress(SDL, "SDL_GetPixelFormatName"),
            GetMasksForPixelFormat                     = apiGetFunctionAddress(SDL, "SDL_GetMasksForPixelFormat"),
            GetPixelFormatForMasks                     = apiGetFunctionAddress(SDL, "SDL_GetPixelFormatForMasks"),
            GetPixelFormatDetails                      = apiGetFunctionAddress(SDL, "SDL_GetPixelFormatDetails"),
            CreatePalette                              = apiGetFunctionAddress(SDL, "SDL_CreatePalette"),
            SetPaletteColors                           = apiGetFunctionAddress(SDL, "SDL_SetPaletteColors"),
            DestroyPalette                             = apiGetFunctionAddress(SDL, "SDL_DestroyPalette"),
            MapRGB                                     = apiGetFunctionAddress(SDL, "SDL_MapRGB"),
            MapRGBA                                    = apiGetFunctionAddress(SDL, "SDL_MapRGBA"),
            GetRGB                                     = apiGetFunctionAddress(SDL, "SDL_GetRGB"),
            GetRGBA                                    = apiGetFunctionAddress(SDL, "SDL_GetRGBA"),
            GetPlatform                                = apiGetFunctionAddress(SDL, "SDL_GetPlatform"),
            GetPowerInfo                               = apiGetFunctionAddress(SDL, "SDL_GetPowerInfo"),
            GetGlobalProperties                        = apiGetFunctionAddress(SDL, "SDL_GetGlobalProperties"),
            CreateProperties                           = apiGetFunctionAddress(SDL, "SDL_CreateProperties"),
            CopyProperties                             = apiGetFunctionAddress(SDL, "SDL_CopyProperties"),
            LockProperties                             = apiGetFunctionAddress(SDL, "SDL_LockProperties"),
            UnlockProperties                           = apiGetFunctionAddress(SDL, "SDL_UnlockProperties"),
            SetPointerPropertyWithCleanup              = apiGetFunctionAddress(SDL, "SDL_SetPointerPropertyWithCleanup"),
            SetPointerProperty                         = apiGetFunctionAddress(SDL, "SDL_SetPointerProperty"),
            SetStringProperty                          = apiGetFunctionAddress(SDL, "SDL_SetStringProperty"),
            SetNumberProperty                          = apiGetFunctionAddress(SDL, "SDL_SetNumberProperty"),
            SetFloatProperty                           = apiGetFunctionAddress(SDL, "SDL_SetFloatProperty"),
            SetBooleanProperty                         = apiGetFunctionAddress(SDL, "SDL_SetBooleanProperty"),
            HasProperty                                = apiGetFunctionAddress(SDL, "SDL_HasProperty"),
            GetPropertyType                            = apiGetFunctionAddress(SDL, "SDL_GetPropertyType"),
            GetPointerProperty                         = apiGetFunctionAddress(SDL, "SDL_GetPointerProperty"),
            GetStringProperty                          = apiGetFunctionAddress(SDL, "SDL_GetStringProperty"),
            GetNumberProperty                          = apiGetFunctionAddress(SDL, "SDL_GetNumberProperty"),
            GetFloatProperty                           = apiGetFunctionAddress(SDL, "SDL_GetFloatProperty"),
            GetBooleanProperty                         = apiGetFunctionAddress(SDL, "SDL_GetBooleanProperty"),
            ClearProperty                              = apiGetFunctionAddress(SDL, "SDL_ClearProperty"),
            EnumerateProperties                        = apiGetFunctionAddress(SDL, "SDL_EnumerateProperties"),
            DestroyProperties                          = apiGetFunctionAddress(SDL, "SDL_DestroyProperties"),
            HasRectIntersection                        = apiGetFunctionAddress(SDL, "SDL_HasRectIntersection"),
            GetRectIntersection                        = apiGetFunctionAddress(SDL, "SDL_GetRectIntersection"),
            GetRectUnion                               = apiGetFunctionAddress(SDL, "SDL_GetRectUnion"),
            GetRectEnclosingPoints                     = apiGetFunctionAddress(SDL, "SDL_GetRectEnclosingPoints"),
            GetRectAndLineIntersection                 = apiGetFunctionAddress(SDL, "SDL_GetRectAndLineIntersection"),
            HasRectIntersectionFloat                   = apiGetFunctionAddress(SDL, "SDL_HasRectIntersectionFloat"),
            GetRectIntersectionFloat                   = apiGetFunctionAddress(SDL, "SDL_GetRectIntersectionFloat"),
            GetRectUnionFloat                          = apiGetFunctionAddress(SDL, "SDL_GetRectUnionFloat"),
            GetRectEnclosingPointsFloat                = apiGetFunctionAddress(SDL, "SDL_GetRectEnclosingPointsFloat"),
            GetRectAndLineIntersectionFloat            = apiGetFunctionAddress(SDL, "SDL_GetRectAndLineIntersectionFloat"),
            GetNumRenderDrivers                        = apiGetFunctionAddress(SDL, "SDL_GetNumRenderDrivers"),
            GetRenderDriver                            = apiGetFunctionAddress(SDL, "SDL_GetRenderDriver"),
            CreateWindowAndRenderer                    = apiGetFunctionAddress(SDL, "SDL_CreateWindowAndRenderer"),
            CreateRenderer                             = apiGetFunctionAddress(SDL, "SDL_CreateRenderer"),
            CreateRendererWithProperties               = apiGetFunctionAddress(SDL, "SDL_CreateRendererWithProperties"),
            CreateSoftwareRenderer                     = apiGetFunctionAddress(SDL, "SDL_CreateSoftwareRenderer"),
            GetRenderer                                = apiGetFunctionAddress(SDL, "SDL_GetRenderer"),
            GetRenderWindow                            = apiGetFunctionAddress(SDL, "SDL_GetRenderWindow"),
            GetRendererName                            = apiGetFunctionAddress(SDL, "SDL_GetRendererName"),
            GetRendererProperties                      = apiGetFunctionAddress(SDL, "SDL_GetRendererProperties"),
            GetRenderOutputSize                        = apiGetFunctionAddress(SDL, "SDL_GetRenderOutputSize"),
            GetCurrentRenderOutputSize                 = apiGetFunctionAddress(SDL, "SDL_GetCurrentRenderOutputSize"),
            CreateTexture                              = apiGetFunctionAddress(SDL, "SDL_CreateTexture"),
            CreateTextureFromSurface                   = apiGetFunctionAddress(SDL, "SDL_CreateTextureFromSurface"),
            CreateTextureWithProperties                = apiGetFunctionAddress(SDL, "SDL_CreateTextureWithProperties"),
            GetTextureProperties                       = apiGetFunctionAddress(SDL, "SDL_GetTextureProperties"),
            GetRendererFromTexture                     = apiGetFunctionAddress(SDL, "SDL_GetRendererFromTexture"),
            GetTextureSize                             = apiGetFunctionAddress(SDL, "SDL_GetTextureSize"),
            SetTextureColorMod                         = apiGetFunctionAddress(SDL, "SDL_SetTextureColorMod"),
            SetTextureColorModFloat                    = apiGetFunctionAddress(SDL, "SDL_SetTextureColorModFloat"),
            GetTextureColorMod                         = apiGetFunctionAddress(SDL, "SDL_GetTextureColorMod"),
            GetTextureColorModFloat                    = apiGetFunctionAddress(SDL, "SDL_GetTextureColorModFloat"),
            SetTextureAlphaMod                         = apiGetFunctionAddress(SDL, "SDL_SetTextureAlphaMod"),
            SetTextureAlphaModFloat                    = apiGetFunctionAddress(SDL, "SDL_SetTextureAlphaModFloat"),
            GetTextureAlphaMod                         = apiGetFunctionAddress(SDL, "SDL_GetTextureAlphaMod"),
            GetTextureAlphaModFloat                    = apiGetFunctionAddress(SDL, "SDL_GetTextureAlphaModFloat"),
            SetTextureBlendMode                        = apiGetFunctionAddress(SDL, "SDL_SetTextureBlendMode"),
            GetTextureBlendMode                        = apiGetFunctionAddress(SDL, "SDL_GetTextureBlendMode"),
            SetTextureScaleMode                        = apiGetFunctionAddress(SDL, "SDL_SetTextureScaleMode"),
            GetTextureScaleMode                        = apiGetFunctionAddress(SDL, "SDL_GetTextureScaleMode"),
            UpdateTexture                              = apiGetFunctionAddress(SDL, "SDL_UpdateTexture"),
            UpdateYUVTexture                           = apiGetFunctionAddress(SDL, "SDL_UpdateYUVTexture"),
            UpdateNVTexture                            = apiGetFunctionAddress(SDL, "SDL_UpdateNVTexture"),
            LockTexture                                = apiGetFunctionAddress(SDL, "SDL_LockTexture"),
            LockTextureToSurface                       = apiGetFunctionAddress(SDL, "SDL_LockTextureToSurface"),
            UnlockTexture                              = apiGetFunctionAddress(SDL, "SDL_UnlockTexture"),
            SetRenderTarget                            = apiGetFunctionAddress(SDL, "SDL_SetRenderTarget"),
            GetRenderTarget                            = apiGetFunctionAddress(SDL, "SDL_GetRenderTarget"),
            SetRenderLogicalPresentation               = apiGetFunctionAddress(SDL, "SDL_SetRenderLogicalPresentation"),
            GetRenderLogicalPresentation               = apiGetFunctionAddress(SDL, "SDL_GetRenderLogicalPresentation"),
            GetRenderLogicalPresentationRect           = apiGetFunctionAddress(SDL, "SDL_GetRenderLogicalPresentationRect"),
            RenderCoordinatesFromWindow                = apiGetFunctionAddress(SDL, "SDL_RenderCoordinatesFromWindow"),
            RenderCoordinatesToWindow                  = apiGetFunctionAddress(SDL, "SDL_RenderCoordinatesToWindow"),
            ConvertEventToRenderCoordinates            = apiGetFunctionAddress(SDL, "SDL_ConvertEventToRenderCoordinates"),
            SetRenderViewport                          = apiGetFunctionAddress(SDL, "SDL_SetRenderViewport"),
            GetRenderViewport                          = apiGetFunctionAddress(SDL, "SDL_GetRenderViewport"),
            RenderViewportSet                          = apiGetFunctionAddress(SDL, "SDL_RenderViewportSet"),
            GetRenderSafeArea                          = apiGetFunctionAddress(SDL, "SDL_GetRenderSafeArea"),
            SetRenderClipRect                          = apiGetFunctionAddress(SDL, "SDL_SetRenderClipRect"),
            GetRenderClipRect                          = apiGetFunctionAddress(SDL, "SDL_GetRenderClipRect"),
            RenderClipEnabled                          = apiGetFunctionAddress(SDL, "SDL_RenderClipEnabled"),
            SetRenderScale                             = apiGetFunctionAddress(SDL, "SDL_SetRenderScale"),
            GetRenderScale                             = apiGetFunctionAddress(SDL, "SDL_GetRenderScale"),
            SetRenderDrawColor                         = apiGetFunctionAddress(SDL, "SDL_SetRenderDrawColor"),
            SetRenderDrawColorFloat                    = apiGetFunctionAddress(SDL, "SDL_SetRenderDrawColorFloat"),
            GetRenderDrawColor                         = apiGetFunctionAddress(SDL, "SDL_GetRenderDrawColor"),
            GetRenderDrawColorFloat                    = apiGetFunctionAddress(SDL, "SDL_GetRenderDrawColorFloat"),
            SetRenderColorScale                        = apiGetFunctionAddress(SDL, "SDL_SetRenderColorScale"),
            GetRenderColorScale                        = apiGetFunctionAddress(SDL, "SDL_GetRenderColorScale"),
            SetRenderDrawBlendMode                     = apiGetFunctionAddress(SDL, "SDL_SetRenderDrawBlendMode"),
            GetRenderDrawBlendMode                     = apiGetFunctionAddress(SDL, "SDL_GetRenderDrawBlendMode"),
            RenderClear                                = apiGetFunctionAddress(SDL, "SDL_RenderClear"),
            RenderPoint                                = apiGetFunctionAddress(SDL, "SDL_RenderPoint"),
            RenderPoints                               = apiGetFunctionAddress(SDL, "SDL_RenderPoints"),
            RenderLine                                 = apiGetFunctionAddress(SDL, "SDL_RenderLine"),
            RenderLines                                = apiGetFunctionAddress(SDL, "SDL_RenderLines"),
            RenderRect                                 = apiGetFunctionAddress(SDL, "SDL_RenderRect"),
            RenderRects                                = apiGetFunctionAddress(SDL, "SDL_RenderRects"),
            RenderFillRect                             = apiGetFunctionAddress(SDL, "SDL_RenderFillRect"),
            RenderFillRects                            = apiGetFunctionAddress(SDL, "SDL_RenderFillRects"),
            RenderTexture                              = apiGetFunctionAddress(SDL, "SDL_RenderTexture"),
            RenderTextureRotated                       = apiGetFunctionAddress(SDL, "SDL_RenderTextureRotated"),
            RenderTextureAffine                        = apiGetFunctionAddress(SDL, "SDL_RenderTextureAffine"),
            RenderTextureTiled                         = apiGetFunctionAddress(SDL, "SDL_RenderTextureTiled"),
            RenderTexture9Grid                         = apiGetFunctionAddress(SDL, "SDL_RenderTexture9Grid"),
            RenderGeometry                             = apiGetFunctionAddress(SDL, "SDL_RenderGeometry"),
            RenderGeometryRaw                          = apiGetFunctionAddress(SDL, "SDL_RenderGeometryRaw"),
            RenderReadPixels                           = apiGetFunctionAddress(SDL, "SDL_RenderReadPixels"),
            RenderPresent                              = apiGetFunctionAddress(SDL, "SDL_RenderPresent"),
            DestroyTexture                             = apiGetFunctionAddress(SDL, "SDL_DestroyTexture"),
            DestroyRenderer                            = apiGetFunctionAddress(SDL, "SDL_DestroyRenderer"),
            FlushRenderer                              = apiGetFunctionAddress(SDL, "SDL_FlushRenderer"),
            GetRenderMetalLayer                        = apiGetFunctionAddress(SDL, "SDL_GetRenderMetalLayer"),
            GetRenderMetalCommandEncoder               = apiGetFunctionAddress(SDL, "SDL_GetRenderMetalCommandEncoder"),
            AddVulkanRenderSemaphores                  = apiGetFunctionAddress(SDL, "SDL_AddVulkanRenderSemaphores"),
            SetRenderVSync                             = apiGetFunctionAddress(SDL, "SDL_SetRenderVSync"),
            GetRenderVSync                             = apiGetFunctionAddress(SDL, "SDL_GetRenderVSync"),
            RenderDebugText                            = apiGetFunctionAddress(SDL, "SDL_RenderDebugText"),
            RenderDebugTextFormat                      = apiGetFunctionAddress(SDL, "SDL_RenderDebugTextFormat"),
            GetSensors                                 = apiGetFunctionAddress(SDL, "SDL_GetSensors"),
            GetSensorNameForID                         = apiGetFunctionAddress(SDL, "SDL_GetSensorNameForID"),
            GetSensorTypeForID                         = apiGetFunctionAddress(SDL, "SDL_GetSensorTypeForID"),
            GetSensorNonPortableTypeForID              = apiGetFunctionAddress(SDL, "SDL_GetSensorNonPortableTypeForID"),
            OpenSensor                                 = apiGetFunctionAddress(SDL, "SDL_OpenSensor"),
            GetSensorFromID                            = apiGetFunctionAddress(SDL, "SDL_GetSensorFromID"),
            GetSensorProperties                        = apiGetFunctionAddress(SDL, "SDL_GetSensorProperties"),
            GetSensorName                              = apiGetFunctionAddress(SDL, "SDL_GetSensorName"),
            GetSensorType                              = apiGetFunctionAddress(SDL, "SDL_GetSensorType"),
            GetSensorNonPortableType                   = apiGetFunctionAddress(SDL, "SDL_GetSensorNonPortableType"),
            GetSensorID                                = apiGetFunctionAddress(SDL, "SDL_GetSensorID"),
            GetSensorData                              = apiGetFunctionAddress(SDL, "SDL_GetSensorData"),
            CloseSensor                                = apiGetFunctionAddress(SDL, "SDL_CloseSensor"),
            UpdateSensors                              = apiGetFunctionAddress(SDL, "SDL_UpdateSensors"),
            malloc                                     = apiGetFunctionAddress(SDL, "SDL_malloc"),
            calloc                                     = apiGetFunctionAddress(SDL, "SDL_calloc"),
            realloc                                    = apiGetFunctionAddress(SDL, "SDL_realloc"),
            free                                       = apiGetFunctionAddress(SDL, "SDL_free"),
            GetOriginalMemoryFunctions                 = apiGetFunctionAddress(SDL, "SDL_GetOriginalMemoryFunctions"),
            GetMemoryFunctions                         = apiGetFunctionAddress(SDL, "SDL_GetMemoryFunctions"),
            SetMemoryFunctions                         = apiGetFunctionAddress(SDL, "SDL_SetMemoryFunctions"),
            aligned_alloc                              = apiGetFunctionAddress(SDL, "SDL_aligned_alloc"),
            aligned_free                               = apiGetFunctionAddress(SDL, "SDL_aligned_free"),
            GetNumAllocations                          = apiGetFunctionAddress(SDL, "SDL_GetNumAllocations"),
            abs                                        = apiGetFunctionAddress(SDL, "SDL_abs"),
            isalpha                                    = apiGetFunctionAddress(SDL, "SDL_isalpha"),
            isalnum                                    = apiGetFunctionAddress(SDL, "SDL_isalnum"),
            isblank                                    = apiGetFunctionAddress(SDL, "SDL_isblank"),
            iscntrl                                    = apiGetFunctionAddress(SDL, "SDL_iscntrl"),
            isdigit                                    = apiGetFunctionAddress(SDL, "SDL_isdigit"),
            isxdigit                                   = apiGetFunctionAddress(SDL, "SDL_isxdigit"),
            ispunct                                    = apiGetFunctionAddress(SDL, "SDL_ispunct"),
            isspace                                    = apiGetFunctionAddress(SDL, "SDL_isspace"),
            isupper                                    = apiGetFunctionAddress(SDL, "SDL_isupper"),
            islower                                    = apiGetFunctionAddress(SDL, "SDL_islower"),
            isprint                                    = apiGetFunctionAddress(SDL, "SDL_isprint"),
            isgraph                                    = apiGetFunctionAddress(SDL, "SDL_isgraph"),
            toupper                                    = apiGetFunctionAddress(SDL, "SDL_toupper"),
            tolower                                    = apiGetFunctionAddress(SDL, "SDL_tolower"),
            crc16                                      = apiGetFunctionAddress(SDL, "SDL_crc16"),
            crc32                                      = apiGetFunctionAddress(SDL, "SDL_crc32"),
            murmur3_32                                 = apiGetFunctionAddress(SDL, "SDL_murmur3_32"),
            srand                                      = apiGetFunctionAddress(SDL, "SDL_srand"),
            rand                                       = apiGetFunctionAddress(SDL, "SDL_rand"),
            randf                                      = apiGetFunctionAddress(SDL, "SDL_randf"),
            rand_bits                                  = apiGetFunctionAddress(SDL, "SDL_rand_bits"),
            rand_r                                     = apiGetFunctionAddress(SDL, "SDL_rand_r"),
            randf_r                                    = apiGetFunctionAddress(SDL, "SDL_randf_r"),
            rand_bits_r                                = apiGetFunctionAddress(SDL, "SDL_rand_bits_r"),
            acos                                       = apiGetFunctionAddress(SDL, "SDL_acos"),
            acosf                                      = apiGetFunctionAddress(SDL, "SDL_acosf"),
            asin                                       = apiGetFunctionAddress(SDL, "SDL_asin"),
            asinf                                      = apiGetFunctionAddress(SDL, "SDL_asinf"),
            atan                                       = apiGetFunctionAddress(SDL, "SDL_atan"),
            atanf                                      = apiGetFunctionAddress(SDL, "SDL_atanf"),
            atan2                                      = apiGetFunctionAddress(SDL, "SDL_atan2"),
            atan2f                                     = apiGetFunctionAddress(SDL, "SDL_atan2f"),
            ceil                                       = apiGetFunctionAddress(SDL, "SDL_ceil"),
            ceilf                                      = apiGetFunctionAddress(SDL, "SDL_ceilf"),
            copysign                                   = apiGetFunctionAddress(SDL, "SDL_copysign"),
            copysignf                                  = apiGetFunctionAddress(SDL, "SDL_copysignf"),
            cos                                        = apiGetFunctionAddress(SDL, "SDL_cos"),
            cosf                                       = apiGetFunctionAddress(SDL, "SDL_cosf"),
            exp                                        = apiGetFunctionAddress(SDL, "SDL_exp"),
            expf                                       = apiGetFunctionAddress(SDL, "SDL_expf"),
            fabs                                       = apiGetFunctionAddress(SDL, "SDL_fabs"),
            fabsf                                      = apiGetFunctionAddress(SDL, "SDL_fabsf"),
            floor                                      = apiGetFunctionAddress(SDL, "SDL_floor"),
            floorf                                     = apiGetFunctionAddress(SDL, "SDL_floorf"),
            trunc                                      = apiGetFunctionAddress(SDL, "SDL_trunc"),
            truncf                                     = apiGetFunctionAddress(SDL, "SDL_truncf"),
            fmod                                       = apiGetFunctionAddress(SDL, "SDL_fmod"),
            fmodf                                      = apiGetFunctionAddress(SDL, "SDL_fmodf"),
            isinf                                      = apiGetFunctionAddress(SDL, "SDL_isinf"),
            isinff                                     = apiGetFunctionAddress(SDL, "SDL_isinff"),
            isnan                                      = apiGetFunctionAddress(SDL, "SDL_isnan"),
            isnanf                                     = apiGetFunctionAddress(SDL, "SDL_isnanf"),
            log                                        = apiGetFunctionAddress(SDL, "SDL_log"),
            logf                                       = apiGetFunctionAddress(SDL, "SDL_logf"),
            log10                                      = apiGetFunctionAddress(SDL, "SDL_log10"),
            log10f                                     = apiGetFunctionAddress(SDL, "SDL_log10f"),
            modf                                       = apiGetFunctionAddress(SDL, "SDL_modf"),
            modff                                      = apiGetFunctionAddress(SDL, "SDL_modff"),
            pow                                        = apiGetFunctionAddress(SDL, "SDL_pow"),
            powf                                       = apiGetFunctionAddress(SDL, "SDL_powf"),
            round                                      = apiGetFunctionAddress(SDL, "SDL_round"),
            roundf                                     = apiGetFunctionAddress(SDL, "SDL_roundf"),
            lround                                     = apiGetFunctionAddress(SDL, "SDL_lround"),
            lroundf                                    = apiGetFunctionAddress(SDL, "SDL_lroundf"),
            scalbn                                     = apiGetFunctionAddress(SDL, "SDL_scalbn"),
            scalbnf                                    = apiGetFunctionAddress(SDL, "SDL_scalbnf"),
            sin                                        = apiGetFunctionAddress(SDL, "SDL_sin"),
            sinf                                       = apiGetFunctionAddress(SDL, "SDL_sinf"),
            sqrt                                       = apiGetFunctionAddress(SDL, "SDL_sqrt"),
            sqrtf                                      = apiGetFunctionAddress(SDL, "SDL_sqrtf"),
            tan                                        = apiGetFunctionAddress(SDL, "SDL_tan"),
            tanf                                       = apiGetFunctionAddress(SDL, "SDL_tanf"),
            OpenTitleStorage                           = apiGetFunctionAddress(SDL, "SDL_OpenTitleStorage"),
            OpenUserStorage                            = apiGetFunctionAddress(SDL, "SDL_OpenUserStorage"),
            OpenFileStorage                            = apiGetFunctionAddress(SDL, "SDL_OpenFileStorage"),
            OpenStorage                                = apiGetFunctionAddress(SDL, "SDL_OpenStorage"),
            CloseStorage                               = apiGetFunctionAddress(SDL, "SDL_CloseStorage"),
            StorageReady                               = apiGetFunctionAddress(SDL, "SDL_StorageReady"),
            GetStorageFileSize                         = apiGetFunctionAddress(SDL, "SDL_GetStorageFileSize"),
            ReadStorageFile                            = apiGetFunctionAddress(SDL, "SDL_ReadStorageFile"),
            WriteStorageFile                           = apiGetFunctionAddress(SDL, "SDL_WriteStorageFile"),
            CreateStorageDirectory                     = apiGetFunctionAddress(SDL, "SDL_CreateStorageDirectory"),
            EnumerateStorageDirectory                  = apiGetFunctionAddress(SDL, "SDL_EnumerateStorageDirectory"),
            RemoveStoragePath                          = apiGetFunctionAddress(SDL, "SDL_RemoveStoragePath"),
            RenameStoragePath                          = apiGetFunctionAddress(SDL, "SDL_RenameStoragePath"),
            CopyStorageFile                            = apiGetFunctionAddress(SDL, "SDL_CopyStorageFile"),
            GetStoragePathInfo                         = apiGetFunctionAddress(SDL, "SDL_GetStoragePathInfo"),
            GetStorageSpaceRemaining                   = apiGetFunctionAddress(SDL, "SDL_GetStorageSpaceRemaining"),
            GlobStorageDirectory                       = apiGetFunctionAddress(SDL, "SDL_GlobStorageDirectory"),
            CreateSurface                              = apiGetFunctionAddress(SDL, "SDL_CreateSurface"),
            CreateSurfaceFrom                          = apiGetFunctionAddress(SDL, "SDL_CreateSurfaceFrom"),
            DestroySurface                             = apiGetFunctionAddress(SDL, "SDL_DestroySurface"),
            GetSurfaceProperties                       = apiGetFunctionAddress(SDL, "SDL_GetSurfaceProperties"),
            SetSurfaceColorspace                       = apiGetFunctionAddress(SDL, "SDL_SetSurfaceColorspace"),
            GetSurfaceColorspace                       = apiGetFunctionAddress(SDL, "SDL_GetSurfaceColorspace"),
            CreateSurfacePalette                       = apiGetFunctionAddress(SDL, "SDL_CreateSurfacePalette"),
            SetSurfacePalette                          = apiGetFunctionAddress(SDL, "SDL_SetSurfacePalette"),
            GetSurfacePalette                          = apiGetFunctionAddress(SDL, "SDL_GetSurfacePalette"),
            AddSurfaceAlternateImage                   = apiGetFunctionAddress(SDL, "SDL_AddSurfaceAlternateImage"),
            SurfaceHasAlternateImages                  = apiGetFunctionAddress(SDL, "SDL_SurfaceHasAlternateImages"),
            GetSurfaceImages                           = apiGetFunctionAddress(SDL, "SDL_GetSurfaceImages"),
            RemoveSurfaceAlternateImages               = apiGetFunctionAddress(SDL, "SDL_RemoveSurfaceAlternateImages"),
            LockSurface                                = apiGetFunctionAddress(SDL, "SDL_LockSurface"),
            UnlockSurface                              = apiGetFunctionAddress(SDL, "SDL_UnlockSurface"),
            LoadBMP_IO                                 = apiGetFunctionAddress(SDL, "SDL_LoadBMP_IO"),
            LoadBMP                                    = apiGetFunctionAddress(SDL, "SDL_LoadBMP"),
            SaveBMP_IO                                 = apiGetFunctionAddress(SDL, "SDL_SaveBMP_IO"),
            SaveBMP                                    = apiGetFunctionAddress(SDL, "SDL_SaveBMP"),
            SetSurfaceRLE                              = apiGetFunctionAddress(SDL, "SDL_SetSurfaceRLE"),
            SurfaceHasRLE                              = apiGetFunctionAddress(SDL, "SDL_SurfaceHasRLE"),
            SetSurfaceColorKey                         = apiGetFunctionAddress(SDL, "SDL_SetSurfaceColorKey"),
            SurfaceHasColorKey                         = apiGetFunctionAddress(SDL, "SDL_SurfaceHasColorKey"),
            GetSurfaceColorKey                         = apiGetFunctionAddress(SDL, "SDL_GetSurfaceColorKey"),
            SetSurfaceColorMod                         = apiGetFunctionAddress(SDL, "SDL_SetSurfaceColorMod"),
            GetSurfaceColorMod                         = apiGetFunctionAddress(SDL, "SDL_GetSurfaceColorMod"),
            SetSurfaceAlphaMod                         = apiGetFunctionAddress(SDL, "SDL_SetSurfaceAlphaMod"),
            GetSurfaceAlphaMod                         = apiGetFunctionAddress(SDL, "SDL_GetSurfaceAlphaMod"),
            SetSurfaceBlendMode                        = apiGetFunctionAddress(SDL, "SDL_SetSurfaceBlendMode"),
            GetSurfaceBlendMode                        = apiGetFunctionAddress(SDL, "SDL_GetSurfaceBlendMode"),
            SetSurfaceClipRect                         = apiGetFunctionAddress(SDL, "SDL_SetSurfaceClipRect"),
            GetSurfaceClipRect                         = apiGetFunctionAddress(SDL, "SDL_GetSurfaceClipRect"),
            FlipSurface                                = apiGetFunctionAddress(SDL, "SDL_FlipSurface"),
            DuplicateSurface                           = apiGetFunctionAddress(SDL, "SDL_DuplicateSurface"),
            ScaleSurface                               = apiGetFunctionAddress(SDL, "SDL_ScaleSurface"),
            ConvertSurface                             = apiGetFunctionAddress(SDL, "SDL_ConvertSurface"),
            ConvertSurfaceAndColorspace                = apiGetFunctionAddress(SDL, "SDL_ConvertSurfaceAndColorspace"),
            ConvertPixels                              = apiGetFunctionAddress(SDL, "SDL_ConvertPixels"),
            ConvertPixelsAndColorspace                 = apiGetFunctionAddress(SDL, "SDL_ConvertPixelsAndColorspace"),
            PremultiplyAlpha                           = apiGetFunctionAddress(SDL, "SDL_PremultiplyAlpha"),
            PremultiplySurfaceAlpha                    = apiGetFunctionAddress(SDL, "SDL_PremultiplySurfaceAlpha"),
            ClearSurface                               = apiGetFunctionAddress(SDL, "SDL_ClearSurface"),
            FillSurfaceRect                            = apiGetFunctionAddress(SDL, "SDL_FillSurfaceRect"),
            FillSurfaceRects                           = apiGetFunctionAddress(SDL, "SDL_FillSurfaceRects"),
            BlitSurface                                = apiGetFunctionAddress(SDL, "SDL_BlitSurface"),
            BlitSurfaceUnchecked                       = apiGetFunctionAddress(SDL, "SDL_BlitSurfaceUnchecked"),
            BlitSurfaceScaled                          = apiGetFunctionAddress(SDL, "SDL_BlitSurfaceScaled"),
            BlitSurfaceUncheckedScaled                 = apiGetFunctionAddress(SDL, "SDL_BlitSurfaceUncheckedScaled"),
            BlitSurfaceTiled                           = apiGetFunctionAddress(SDL, "SDL_BlitSurfaceTiled"),
            BlitSurfaceTiledWithScale                  = apiGetFunctionAddress(SDL, "SDL_BlitSurfaceTiledWithScale"),
            BlitSurface9Grid                           = apiGetFunctionAddress(SDL, "SDL_BlitSurface9Grid"),
            MapSurfaceRGB                              = apiGetFunctionAddress(SDL, "SDL_MapSurfaceRGB"),
            MapSurfaceRGBA                             = apiGetFunctionAddress(SDL, "SDL_MapSurfaceRGBA"),
            ReadSurfacePixel                           = apiGetFunctionAddress(SDL, "SDL_ReadSurfacePixel"),
            ReadSurfacePixelFloat                      = apiGetFunctionAddress(SDL, "SDL_ReadSurfacePixelFloat"),
            WriteSurfacePixel                          = apiGetFunctionAddress(SDL, "SDL_WriteSurfacePixel"),
            WriteSurfacePixelFloat                     = apiGetFunctionAddress(SDL, "SDL_WriteSurfacePixelFloat"),
            SetWindowsMessageHook                      = apiGetFunctionAddressOptional(SDL, "SDL_SetWindowsMessageHook"),
            GetDirect3D9AdapterIndex                   = apiGetFunctionAddressOptional(SDL, "SDL_GetDirect3D9AdapterIndex"),
            GetDXGIOutputInfo                          = apiGetFunctionAddressOptional(SDL, "SDL_GetDXGIOutputInfo"),
            SetX11EventHook                            = apiGetFunctionAddressOptional(SDL, "SDL_SetX11EventHook"),
            SetLinuxThreadPriority                     = apiGetFunctionAddressOptional(SDL, "SDL_SetLinuxThreadPriority"),
            SetLinuxThreadPriorityAndPolicy            = apiGetFunctionAddressOptional(SDL, "SDL_SetLinuxThreadPriorityAndPolicy"),
            SetiOSAnimationCallback                    = apiGetFunctionAddressOptional(SDL, "SDL_SetiOSAnimationCallback"),
            SetiOSEventPump                            = apiGetFunctionAddressOptional(SDL, "SDL_SetiOSEventPump"),
            GetAndroidJNIEnv                           = apiGetFunctionAddressOptional(SDL, "SDL_GetAndroidJNIEnv"),
            GetAndroidActivity                         = apiGetFunctionAddressOptional(SDL, "SDL_GetAndroidActivity"),
            GetAndroidSDKVersion                       = apiGetFunctionAddressOptional(SDL, "SDL_GetAndroidSDKVersion"),
            IsChromebook                               = apiGetFunctionAddressOptional(SDL, "SDL_IsChromebook"),
            IsDeXMode                                  = apiGetFunctionAddressOptional(SDL, "SDL_IsDeXMode"),
            SendAndroidBackButton                      = apiGetFunctionAddressOptional(SDL, "SDL_SendAndroidBackButton"),
            GetAndroidInternalStoragePath              = apiGetFunctionAddressOptional(SDL, "SDL_GetAndroidInternalStoragePath"),
            GetAndroidExternalStorageState             = apiGetFunctionAddressOptional(SDL, "SDL_GetAndroidExternalStorageState"),
            GetAndroidExternalStoragePath              = apiGetFunctionAddressOptional(SDL, "SDL_GetAndroidExternalStoragePath"),
            GetAndroidCachePath                        = apiGetFunctionAddressOptional(SDL, "SDL_GetAndroidCachePath"),
            RequestAndroidPermission                   = apiGetFunctionAddressOptional(SDL, "SDL_RequestAndroidPermission"),
            ShowAndroidToast                           = apiGetFunctionAddressOptional(SDL, "SDL_ShowAndroidToast"),
            SendAndroidMessage                         = apiGetFunctionAddressOptional(SDL, "SDL_SendAndroidMessage"),
            IsTablet                                   = apiGetFunctionAddress(SDL, "SDL_IsTablet"),
            IsTV                                       = apiGetFunctionAddress(SDL, "SDL_IsTV"),
            GetSandbox                                 = apiGetFunctionAddress(SDL, "SDL_GetSandbox"),
            OnApplicationWillTerminate                 = apiGetFunctionAddressOptional(SDL, "SDL_OnApplicationWillTerminate"),
            OnApplicationDidReceiveMemoryWarning       = apiGetFunctionAddressOptional(SDL, "SDL_OnApplicationDidReceiveMemoryWarning"),
            OnApplicationWillEnterBackground           = apiGetFunctionAddressOptional(SDL, "SDL_OnApplicationWillEnterBackground"),
            OnApplicationDidEnterBackground            = apiGetFunctionAddressOptional(SDL, "SDL_OnApplicationDidEnterBackground"),
            OnApplicationWillEnterForeground           = apiGetFunctionAddressOptional(SDL, "SDL_OnApplicationWillEnterForeground"),
            OnApplicationDidEnterForeground            = apiGetFunctionAddressOptional(SDL, "SDL_OnApplicationDidEnterForeground"),
            OnApplicationDidChangeStatusBarOrientation = apiGetFunctionAddressOptional(SDL, "SDL_OnApplicationDidChangeStatusBarOrientation"),
            GetGDKTaskQueue                            = apiGetFunctionAddressOptional(SDL, "SDL_GetGDKTaskQueue"),
            GetGDKDefaultUser                          = apiGetFunctionAddressOptional(SDL, "SDL_GetGDKDefaultUser"),
            GetThreadName                              = apiGetFunctionAddress(SDL, "SDL_GetThreadName"),
            GetCurrentThreadID                         = apiGetFunctionAddress(SDL, "SDL_GetCurrentThreadID"),
            GetThreadID                                = apiGetFunctionAddress(SDL, "SDL_GetThreadID"),
            SetCurrentThreadPriority                   = apiGetFunctionAddress(SDL, "SDL_SetCurrentThreadPriority"),
            WaitThread                                 = apiGetFunctionAddress(SDL, "SDL_WaitThread"),
            GetThreadState                             = apiGetFunctionAddress(SDL, "SDL_GetThreadState"),
            DetachThread                               = apiGetFunctionAddress(SDL, "SDL_DetachThread"),
            GetTLS                                     = apiGetFunctionAddress(SDL, "SDL_GetTLS"),
            SetTLS                                     = apiGetFunctionAddress(SDL, "SDL_SetTLS"),
            CleanupTLS                                 = apiGetFunctionAddress(SDL, "SDL_CleanupTLS"),
            GetDateTimeLocalePreferences               = apiGetFunctionAddress(SDL, "SDL_GetDateTimeLocalePreferences"),
            GetCurrentTime                             = apiGetFunctionAddress(SDL, "SDL_GetCurrentTime"),
            TimeToDateTime                             = apiGetFunctionAddress(SDL, "SDL_TimeToDateTime"),
            DateTimeToTime                             = apiGetFunctionAddress(SDL, "SDL_DateTimeToTime"),
            TimeToWindows                              = apiGetFunctionAddress(SDL, "SDL_TimeToWindows"),
            TimeFromWindows                            = apiGetFunctionAddress(SDL, "SDL_TimeFromWindows"),
            GetDaysInMonth                             = apiGetFunctionAddress(SDL, "SDL_GetDaysInMonth"),
            GetDayOfYear                               = apiGetFunctionAddress(SDL, "SDL_GetDayOfYear"),
            GetDayOfWeek                               = apiGetFunctionAddress(SDL, "SDL_GetDayOfWeek"),
            GetTicks                                   = apiGetFunctionAddress(SDL, "SDL_GetTicks"),
            GetTicksNS                                 = apiGetFunctionAddress(SDL, "SDL_GetTicksNS"),
            GetPerformanceCounter                      = apiGetFunctionAddress(SDL, "SDL_GetPerformanceCounter"),
            GetPerformanceFrequency                    = apiGetFunctionAddress(SDL, "SDL_GetPerformanceFrequency"),
            Delay                                      = apiGetFunctionAddress(SDL, "SDL_Delay"),
            DelayNS                                    = apiGetFunctionAddress(SDL, "SDL_DelayNS"),
            DelayPrecise                               = apiGetFunctionAddress(SDL, "SDL_DelayPrecise"),
            AddTimer                                   = apiGetFunctionAddress(SDL, "SDL_AddTimer"),
            AddTimerNS                                 = apiGetFunctionAddress(SDL, "SDL_AddTimerNS"),
            RemoveTimer                                = apiGetFunctionAddress(SDL, "SDL_RemoveTimer"),
            GetTouchDevices                            = apiGetFunctionAddress(SDL, "SDL_GetTouchDevices"),
            GetTouchDeviceName                         = apiGetFunctionAddress(SDL, "SDL_GetTouchDeviceName"),
            GetTouchDeviceType                         = apiGetFunctionAddress(SDL, "SDL_GetTouchDeviceType"),
            GetTouchFingers                            = apiGetFunctionAddress(SDL, "SDL_GetTouchFingers"),
            CreateTray                                 = apiGetFunctionAddress(SDL, "SDL_CreateTray"),
            SetTrayIcon                                = apiGetFunctionAddress(SDL, "SDL_SetTrayIcon"),
            SetTrayTooltip                             = apiGetFunctionAddress(SDL, "SDL_SetTrayTooltip"),
            CreateTrayMenu                             = apiGetFunctionAddress(SDL, "SDL_CreateTrayMenu"),
            CreateTraySubmenu                          = apiGetFunctionAddress(SDL, "SDL_CreateTraySubmenu"),
            GetTrayMenu                                = apiGetFunctionAddress(SDL, "SDL_GetTrayMenu"),
            GetTraySubmenu                             = apiGetFunctionAddress(SDL, "SDL_GetTraySubmenu"),
            GetTrayEntries                             = apiGetFunctionAddress(SDL, "SDL_GetTrayEntries"),
            RemoveTrayEntry                            = apiGetFunctionAddress(SDL, "SDL_RemoveTrayEntry"),
            InsertTrayEntryAt                          = apiGetFunctionAddress(SDL, "SDL_InsertTrayEntryAt"),
            SetTrayEntryLabel                          = apiGetFunctionAddress(SDL, "SDL_SetTrayEntryLabel"),
            GetTrayEntryLabel                          = apiGetFunctionAddress(SDL, "SDL_GetTrayEntryLabel"),
            SetTrayEntryChecked                        = apiGetFunctionAddress(SDL, "SDL_SetTrayEntryChecked"),
            GetTrayEntryChecked                        = apiGetFunctionAddress(SDL, "SDL_GetTrayEntryChecked"),
            SetTrayEntryEnabled                        = apiGetFunctionAddress(SDL, "SDL_SetTrayEntryEnabled"),
            GetTrayEntryEnabled                        = apiGetFunctionAddress(SDL, "SDL_GetTrayEntryEnabled"),
            SetTrayEntryCallback                       = apiGetFunctionAddress(SDL, "SDL_SetTrayEntryCallback"),
            DestroyTray                                = apiGetFunctionAddress(SDL, "SDL_DestroyTray"),
            GetTrayEntryParent                         = apiGetFunctionAddress(SDL, "SDL_GetTrayEntryParent"),
            GetTrayMenuParentEntry                     = apiGetFunctionAddress(SDL, "SDL_GetTrayMenuParentEntry"),
            GetTrayMenuParentTray                      = apiGetFunctionAddress(SDL, "SDL_GetTrayMenuParentTray"),
            GetVersion                                 = apiGetFunctionAddress(SDL, "SDL_GetVersion"),
            GetRevision                                = apiGetFunctionAddress(SDL, "SDL_GetRevision"),
            GetNumVideoDrivers                         = apiGetFunctionAddress(SDL, "SDL_GetNumVideoDrivers"),
            GetVideoDriver                             = apiGetFunctionAddress(SDL, "SDL_GetVideoDriver"),
            GetCurrentVideoDriver                      = apiGetFunctionAddress(SDL, "SDL_GetCurrentVideoDriver"),
            GetSystemTheme                             = apiGetFunctionAddress(SDL, "SDL_GetSystemTheme"),
            GetDisplays                                = apiGetFunctionAddress(SDL, "SDL_GetDisplays"),
            GetPrimaryDisplay                          = apiGetFunctionAddress(SDL, "SDL_GetPrimaryDisplay"),
            GetDisplayProperties                       = apiGetFunctionAddress(SDL, "SDL_GetDisplayProperties"),
            GetDisplayName                             = apiGetFunctionAddress(SDL, "SDL_GetDisplayName"),
            GetDisplayBounds                           = apiGetFunctionAddress(SDL, "SDL_GetDisplayBounds"),
            GetDisplayUsableBounds                     = apiGetFunctionAddress(SDL, "SDL_GetDisplayUsableBounds"),
            GetNaturalDisplayOrientation               = apiGetFunctionAddress(SDL, "SDL_GetNaturalDisplayOrientation"),
            GetCurrentDisplayOrientation               = apiGetFunctionAddress(SDL, "SDL_GetCurrentDisplayOrientation"),
            GetDisplayContentScale                     = apiGetFunctionAddress(SDL, "SDL_GetDisplayContentScale"),
            GetFullscreenDisplayModes                  = apiGetFunctionAddress(SDL, "SDL_GetFullscreenDisplayModes"),
            GetClosestFullscreenDisplayMode            = apiGetFunctionAddress(SDL, "SDL_GetClosestFullscreenDisplayMode"),
            GetDesktopDisplayMode                      = apiGetFunctionAddress(SDL, "SDL_GetDesktopDisplayMode"),
            GetCurrentDisplayMode                      = apiGetFunctionAddress(SDL, "SDL_GetCurrentDisplayMode"),
            GetDisplayForPoint                         = apiGetFunctionAddress(SDL, "SDL_GetDisplayForPoint"),
            GetDisplayForRect                          = apiGetFunctionAddress(SDL, "SDL_GetDisplayForRect"),
            GetDisplayForWindow                        = apiGetFunctionAddress(SDL, "SDL_GetDisplayForWindow"),
            GetWindowPixelDensity                      = apiGetFunctionAddress(SDL, "SDL_GetWindowPixelDensity"),
            GetWindowDisplayScale                      = apiGetFunctionAddress(SDL, "SDL_GetWindowDisplayScale"),
            SetWindowFullscreenMode                    = apiGetFunctionAddress(SDL, "SDL_SetWindowFullscreenMode"),
            GetWindowFullscreenMode                    = apiGetFunctionAddress(SDL, "SDL_GetWindowFullscreenMode"),
            GetWindowICCProfile                        = apiGetFunctionAddress(SDL, "SDL_GetWindowICCProfile"),
            GetWindowPixelFormat                       = apiGetFunctionAddress(SDL, "SDL_GetWindowPixelFormat"),
            GetWindows                                 = apiGetFunctionAddress(SDL, "SDL_GetWindows"),
            CreateWindow                               = apiGetFunctionAddress(SDL, "SDL_CreateWindow"),
            CreatePopupWindow                          = apiGetFunctionAddress(SDL, "SDL_CreatePopupWindow"),
            CreateWindowWithProperties                 = apiGetFunctionAddress(SDL, "SDL_CreateWindowWithProperties"),
            GetWindowID                                = apiGetFunctionAddress(SDL, "SDL_GetWindowID"),
            GetWindowFromID                            = apiGetFunctionAddress(SDL, "SDL_GetWindowFromID"),
            GetWindowParent                            = apiGetFunctionAddress(SDL, "SDL_GetWindowParent"),
            GetWindowProperties                        = apiGetFunctionAddress(SDL, "SDL_GetWindowProperties"),
            GetWindowFlags                             = apiGetFunctionAddress(SDL, "SDL_GetWindowFlags"),
            SetWindowTitle                             = apiGetFunctionAddress(SDL, "SDL_SetWindowTitle"),
            GetWindowTitle                             = apiGetFunctionAddress(SDL, "SDL_GetWindowTitle"),
            SetWindowIcon                              = apiGetFunctionAddress(SDL, "SDL_SetWindowIcon"),
            SetWindowPosition                          = apiGetFunctionAddress(SDL, "SDL_SetWindowPosition"),
            GetWindowPosition                          = apiGetFunctionAddress(SDL, "SDL_GetWindowPosition"),
            SetWindowSize                              = apiGetFunctionAddress(SDL, "SDL_SetWindowSize"),
            GetWindowSize                              = apiGetFunctionAddress(SDL, "SDL_GetWindowSize"),
            GetWindowSafeArea                          = apiGetFunctionAddress(SDL, "SDL_GetWindowSafeArea"),
            SetWindowAspectRatio                       = apiGetFunctionAddress(SDL, "SDL_SetWindowAspectRatio"),
            GetWindowAspectRatio                       = apiGetFunctionAddress(SDL, "SDL_GetWindowAspectRatio"),
            GetWindowBordersSize                       = apiGetFunctionAddress(SDL, "SDL_GetWindowBordersSize"),
            GetWindowSizeInPixels                      = apiGetFunctionAddress(SDL, "SDL_GetWindowSizeInPixels"),
            SetWindowMinimumSize                       = apiGetFunctionAddress(SDL, "SDL_SetWindowMinimumSize"),
            GetWindowMinimumSize                       = apiGetFunctionAddress(SDL, "SDL_GetWindowMinimumSize"),
            SetWindowMaximumSize                       = apiGetFunctionAddress(SDL, "SDL_SetWindowMaximumSize"),
            GetWindowMaximumSize                       = apiGetFunctionAddress(SDL, "SDL_GetWindowMaximumSize"),
            SetWindowBordered                          = apiGetFunctionAddress(SDL, "SDL_SetWindowBordered"),
            SetWindowResizable                         = apiGetFunctionAddress(SDL, "SDL_SetWindowResizable"),
            SetWindowAlwaysOnTop                       = apiGetFunctionAddress(SDL, "SDL_SetWindowAlwaysOnTop"),
            ShowWindow                                 = apiGetFunctionAddress(SDL, "SDL_ShowWindow"),
            HideWindow                                 = apiGetFunctionAddress(SDL, "SDL_HideWindow"),
            RaiseWindow                                = apiGetFunctionAddress(SDL, "SDL_RaiseWindow"),
            MaximizeWindow                             = apiGetFunctionAddress(SDL, "SDL_MaximizeWindow"),
            MinimizeWindow                             = apiGetFunctionAddress(SDL, "SDL_MinimizeWindow"),
            RestoreWindow                              = apiGetFunctionAddress(SDL, "SDL_RestoreWindow"),
            SetWindowFullscreen                        = apiGetFunctionAddress(SDL, "SDL_SetWindowFullscreen"),
            SyncWindow                                 = apiGetFunctionAddress(SDL, "SDL_SyncWindow"),
            WindowHasSurface                           = apiGetFunctionAddress(SDL, "SDL_WindowHasSurface"),
            GetWindowSurface                           = apiGetFunctionAddress(SDL, "SDL_GetWindowSurface"),
            SetWindowSurfaceVSync                      = apiGetFunctionAddress(SDL, "SDL_SetWindowSurfaceVSync"),
            GetWindowSurfaceVSync                      = apiGetFunctionAddress(SDL, "SDL_GetWindowSurfaceVSync"),
            UpdateWindowSurface                        = apiGetFunctionAddress(SDL, "SDL_UpdateWindowSurface"),
            UpdateWindowSurfaceRects                   = apiGetFunctionAddress(SDL, "SDL_UpdateWindowSurfaceRects"),
            DestroyWindowSurface                       = apiGetFunctionAddress(SDL, "SDL_DestroyWindowSurface"),
            SetWindowKeyboardGrab                      = apiGetFunctionAddress(SDL, "SDL_SetWindowKeyboardGrab"),
            SetWindowMouseGrab                         = apiGetFunctionAddress(SDL, "SDL_SetWindowMouseGrab"),
            GetWindowKeyboardGrab                      = apiGetFunctionAddress(SDL, "SDL_GetWindowKeyboardGrab"),
            GetWindowMouseGrab                         = apiGetFunctionAddress(SDL, "SDL_GetWindowMouseGrab"),
            GetGrabbedWindow                           = apiGetFunctionAddress(SDL, "SDL_GetGrabbedWindow"),
            SetWindowMouseRect                         = apiGetFunctionAddress(SDL, "SDL_SetWindowMouseRect"),
            GetWindowMouseRect                         = apiGetFunctionAddress(SDL, "SDL_GetWindowMouseRect"),
            SetWindowOpacity                           = apiGetFunctionAddress(SDL, "SDL_SetWindowOpacity"),
            GetWindowOpacity                           = apiGetFunctionAddress(SDL, "SDL_GetWindowOpacity"),
            SetWindowParent                            = apiGetFunctionAddress(SDL, "SDL_SetWindowParent"),
            SetWindowModal                             = apiGetFunctionAddress(SDL, "SDL_SetWindowModal"),
            SetWindowFocusable                         = apiGetFunctionAddress(SDL, "SDL_SetWindowFocusable"),
            ShowWindowSystemMenu                       = apiGetFunctionAddress(SDL, "SDL_ShowWindowSystemMenu"),
            SetWindowHitTest                           = apiGetFunctionAddress(SDL, "SDL_SetWindowHitTest"),
            SetWindowShape                             = apiGetFunctionAddress(SDL, "SDL_SetWindowShape"),
            FlashWindow                                = apiGetFunctionAddress(SDL, "SDL_FlashWindow"),
            DestroyWindow                              = apiGetFunctionAddress(SDL, "SDL_DestroyWindow"),
            ScreenSaverEnabled                         = apiGetFunctionAddress(SDL, "SDL_ScreenSaverEnabled"),
            EnableScreenSaver                          = apiGetFunctionAddress(SDL, "SDL_EnableScreenSaver"),
            DisableScreenSaver                         = apiGetFunctionAddress(SDL, "SDL_DisableScreenSaver"),
            GL_LoadLibrary                             = apiGetFunctionAddress(SDL, "SDL_GL_LoadLibrary"),
            GL_GetProcAddress                          = apiGetFunctionAddress(SDL, "SDL_GL_GetProcAddress"),
            EGL_GetProcAddress                         = apiGetFunctionAddress(SDL, "SDL_EGL_GetProcAddress"),
            GL_UnloadLibrary                           = apiGetFunctionAddress(SDL, "SDL_GL_UnloadLibrary"),
            GL_ExtensionSupported                      = apiGetFunctionAddress(SDL, "SDL_GL_ExtensionSupported"),
            GL_ResetAttributes                         = apiGetFunctionAddress(SDL, "SDL_GL_ResetAttributes"),
            GL_SetAttribute                            = apiGetFunctionAddress(SDL, "SDL_GL_SetAttribute"),
            GL_GetAttribute                            = apiGetFunctionAddress(SDL, "SDL_GL_GetAttribute"),
            GL_CreateContext                           = apiGetFunctionAddress(SDL, "SDL_GL_CreateContext"),
            GL_MakeCurrent                             = apiGetFunctionAddress(SDL, "SDL_GL_MakeCurrent"),
            GL_GetCurrentWindow                        = apiGetFunctionAddress(SDL, "SDL_GL_GetCurrentWindow"),
            GL_GetCurrentContext                       = apiGetFunctionAddress(SDL, "SDL_GL_GetCurrentContext"),
            EGL_GetCurrentDisplay                      = apiGetFunctionAddress(SDL, "SDL_EGL_GetCurrentDisplay"),
            EGL_GetCurrentConfig                       = apiGetFunctionAddress(SDL, "SDL_EGL_GetCurrentConfig"),
            EGL_GetWindowSurface                       = apiGetFunctionAddress(SDL, "SDL_EGL_GetWindowSurface"),
            EGL_SetAttributeCallbacks                  = apiGetFunctionAddress(SDL, "SDL_EGL_SetAttributeCallbacks"),
            GL_SetSwapInterval                         = apiGetFunctionAddress(SDL, "SDL_GL_SetSwapInterval"),
            GL_GetSwapInterval                         = apiGetFunctionAddress(SDL, "SDL_GL_GetSwapInterval"),
            GL_SwapWindow                              = apiGetFunctionAddress(SDL, "SDL_GL_SwapWindow"),
            GL_DestroyContext                          = apiGetFunctionAddress(SDL, "SDL_GL_DestroyContext");

    }

    /** Returns the sdl {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SDL;
    }

    public static final int
        SDL_ASYNCIO_TASK_READ  = 0,
        SDL_ASYNCIO_TASK_WRITE = 1,
        SDL_ASYNCIO_TASK_CLOSE = 2;

    public static final int
        SDL_ASYNCIO_COMPLETE = 0,
        SDL_ASYNCIO_FAILURE  = 1,
        SDL_ASYNCIO_CANCELED = 2;

    public static final int
        SDL_AUDIO_MASK_BITSIZE    = 0xFF,
        SDL_AUDIO_MASK_FLOAT      = 1 << 8,
        SDL_AUDIO_MASK_BIG_ENDIAN = 1 << 12,
        SDL_AUDIO_MASK_SIGNED     = 1 << 15;

    public static final int
        SDL_AUDIO_UNKNOWN = 0x0000,
        SDL_AUDIO_U8      = 0x0008,
        SDL_AUDIO_S8      = 0x8008,
        SDL_AUDIO_S16LE   = 0x8010,
        SDL_AUDIO_S16BE   = 0x9010,
        SDL_AUDIO_S32LE   = 0x8020,
        SDL_AUDIO_S32BE   = 0x9020,
        SDL_AUDIO_F32LE   = 0x8120,
        SDL_AUDIO_F32BE   = 0x9120,
        SDL_AUDIO_S16     = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_AUDIO_S16LE : SDL_AUDIO_S16BE,
        SDL_AUDIO_S32     = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_AUDIO_S32LE : SDL_AUDIO_S32BE,
        SDL_AUDIO_F32     = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_AUDIO_S32LE : SDL_AUDIO_S32BE;

    public static final int
        SDL_AUDIO_DEVICE_DEFAULT_PLAYBACK  = 0xFFFFFFFF,
        SDL_AUDIO_DEVICE_DEFAULT_RECORDING = 0xFFFFFFFE;

    public static final int
        SDL_BLENDMODE_NONE                = 0x00000000,
        SDL_BLENDMODE_BLEND               = 0x00000001,
        SDL_BLENDMODE_BLEND_PREMULTIPLIED = 0x00000010,
        SDL_BLENDMODE_ADD                 = 0x00000002,
        SDL_BLENDMODE_ADD_PREMULTIPLIED   = 0x00000020,
        SDL_BLENDMODE_MOD                 = 0x00000004,
        SDL_BLENDMODE_MUL                 = 0x00000008,
        SDL_BLENDMODE_INVALID             = 0x7FFFFFFF;

    public static final int
        SDL_BLENDOPERATION_ADD          = 0x1,
        SDL_BLENDOPERATION_SUBTRACT     = 0x2,
        SDL_BLENDOPERATION_REV_SUBTRACT = 0x3,
        SDL_BLENDOPERATION_MINIMUM      = 0x4,
        SDL_BLENDOPERATION_MAXIMUM      = 0x5;

    public static final int
        SDL_BLENDFACTOR_ZERO                = 0x1,
        SDL_BLENDFACTOR_ONE                 = 0x2,
        SDL_BLENDFACTOR_SRC_COLOR           = 0x3,
        SDL_BLENDFACTOR_ONE_MINUS_SRC_COLOR = 0x4,
        SDL_BLENDFACTOR_SRC_ALPHA           = 0x5,
        SDL_BLENDFACTOR_ONE_MINUS_SRC_ALPHA = 0x6,
        SDL_BLENDFACTOR_DST_COLOR           = 0x7,
        SDL_BLENDFACTOR_ONE_MINUS_DST_COLOR = 0x8,
        SDL_BLENDFACTOR_DST_ALPHA           = 0x9,
        SDL_BLENDFACTOR_ONE_MINUS_DST_ALPHA = 0xA;

    public static final int
        SDL_CAMERA_POSITION_UNKNOWN      = 0,
        SDL_CAMERA_POSITION_FRONT_FACING = 1,
        SDL_CAMERA_POSITION_BACK_FACING  = 2;

    public static final int SDL_CACHELINE_SIZE = 128;

    public static final String
        SDL_PROP_FILE_DIALOG_FILTERS_POINTER = "SDL.filedialog.filters",
        SDL_PROP_FILE_DIALOG_NFILTERS_NUMBER = "SDL.filedialog.nfilters",
        SDL_PROP_FILE_DIALOG_WINDOW_POINTER  = "SDL.filedialog.window",
        SDL_PROP_FILE_DIALOG_LOCATION_STRING = "SDL.filedialog.location",
        SDL_PROP_FILE_DIALOG_MANY_BOOLEAN    = "SDL.filedialog.many",
        SDL_PROP_FILE_DIALOG_TITLE_STRING    = "SDL.filedialog.title",
        SDL_PROP_FILE_DIALOG_ACCEPT_STRING   = "SDL.filedialog.accept",
        SDL_PROP_FILE_DIALOG_CANCEL_STRING   = "SDL.filedialog.cancel";

    public static final int
        SDL_FILEDIALOG_OPENFILE   = 0,
        SDL_FILEDIALOG_SAVEFILE   = 1,
        SDL_FILEDIALOG_OPENFOLDER = 2;

    public static final int
        SDL_EVENT_FIRST                         = 0,
        SDL_EVENT_QUIT                          = 0x100,
        SDL_EVENT_TERMINATING                   = 0x101,
        SDL_EVENT_LOW_MEMORY                    = 0x102,
        SDL_EVENT_WILL_ENTER_BACKGROUND         = 0x103,
        SDL_EVENT_DID_ENTER_BACKGROUND          = 0x104,
        SDL_EVENT_WILL_ENTER_FOREGROUND         = 0x105,
        SDL_EVENT_DID_ENTER_FOREGROUND          = 0x106,
        SDL_EVENT_LOCALE_CHANGED                = 0x107,
        SDL_EVENT_SYSTEM_THEME_CHANGED          = 0x108,
        SDL_EVENT_DISPLAY_ORIENTATION           = 0x151,
        SDL_EVENT_DISPLAY_ADDED                 = 0x152,
        SDL_EVENT_DISPLAY_REMOVED               = 0x153,
        SDL_EVENT_DISPLAY_MOVED                 = 0x154,
        SDL_EVENT_DISPLAY_DESKTOP_MODE_CHANGED  = 0x155,
        SDL_EVENT_DISPLAY_CURRENT_MODE_CHANGED  = 0x156,
        SDL_EVENT_DISPLAY_CONTENT_SCALE_CHANGED = 0x157,
        SDL_EVENT_DISPLAY_FIRST                 = SDL_EVENT_DISPLAY_ORIENTATION,
        SDL_EVENT_DISPLAY_LAST                  = SDL_EVENT_DISPLAY_CONTENT_SCALE_CHANGED,
        SDL_EVENT_WINDOW_SHOWN                  = 0x202,
        SDL_EVENT_WINDOW_HIDDEN                 = 0x203,
        SDL_EVENT_WINDOW_EXPOSED                = 0x204,
        SDL_EVENT_WINDOW_MOVED                  = 0x205,
        SDL_EVENT_WINDOW_RESIZED                = 0x206,
        SDL_EVENT_WINDOW_PIXEL_SIZE_CHANGED     = 0x207,
        SDL_EVENT_WINDOW_METAL_VIEW_RESIZED     = 0x208,
        SDL_EVENT_WINDOW_MINIMIZED              = 0x209,
        SDL_EVENT_WINDOW_MAXIMIZED              = 0x20A,
        SDL_EVENT_WINDOW_RESTORED               = 0x20B,
        SDL_EVENT_WINDOW_MOUSE_ENTER            = 0x20C,
        SDL_EVENT_WINDOW_MOUSE_LEAVE            = 0x20D,
        SDL_EVENT_WINDOW_FOCUS_GAINED           = 0x20E,
        SDL_EVENT_WINDOW_FOCUS_LOST             = 0x20F,
        SDL_EVENT_WINDOW_CLOSE_REQUESTED        = 0x210,
        SDL_EVENT_WINDOW_HIT_TEST               = 0x211,
        SDL_EVENT_WINDOW_ICCPROF_CHANGED        = 0x212,
        SDL_EVENT_WINDOW_DISPLAY_CHANGED        = 0x213,
        SDL_EVENT_WINDOW_DISPLAY_SCALE_CHANGED  = 0x214,
        SDL_EVENT_WINDOW_SAFE_AREA_CHANGED      = 0x215,
        SDL_EVENT_WINDOW_OCCLUDED               = 0x216,
        SDL_EVENT_WINDOW_ENTER_FULLSCREEN       = 0x217,
        SDL_EVENT_WINDOW_LEAVE_FULLSCREEN       = 0x218,
        SDL_EVENT_WINDOW_DESTROYED              = 0x219,
        SDL_EVENT_WINDOW_HDR_STATE_CHANGED      = 0x21A,
        SDL_EVENT_WINDOW_FIRST                  = SDL_EVENT_WINDOW_SHOWN,
        SDL_EVENT_WINDOW_LAST                   = SDL_EVENT_WINDOW_HDR_STATE_CHANGED,
        SDL_EVENT_KEY_DOWN                      = 0x300,
        SDL_EVENT_KEY_UP                        = 0x301,
        SDL_EVENT_TEXT_EDITING                  = 0x302,
        SDL_EVENT_TEXT_INPUT                    = 0x303,
        SDL_EVENT_KEYMAP_CHANGED                = 0x304,
        SDL_EVENT_KEYBOARD_ADDED                = 0x305,
        SDL_EVENT_KEYBOARD_REMOVED              = 0x306,
        SDL_EVENT_TEXT_EDITING_CANDIDATES       = 0x307,
        SDL_EVENT_MOUSE_MOTION                  = 0x400,
        SDL_EVENT_MOUSE_BUTTON_DOWN             = 0x401,
        SDL_EVENT_MOUSE_BUTTON_UP               = 0x402,
        SDL_EVENT_MOUSE_WHEEL                   = 0x403,
        SDL_EVENT_MOUSE_ADDED                   = 0x404,
        SDL_EVENT_MOUSE_REMOVED                 = 0x405,
        SDL_EVENT_JOYSTICK_AXIS_MOTION          = 0x600,
        SDL_EVENT_JOYSTICK_BALL_MOTION          = 0x601,
        SDL_EVENT_JOYSTICK_HAT_MOTION           = 0x602,
        SDL_EVENT_JOYSTICK_BUTTON_DOWN          = 0x603,
        SDL_EVENT_JOYSTICK_BUTTON_UP            = 0x604,
        SDL_EVENT_JOYSTICK_ADDED                = 0x605,
        SDL_EVENT_JOYSTICK_REMOVED              = 0x606,
        SDL_EVENT_JOYSTICK_BATTERY_UPDATED      = 0x607,
        SDL_EVENT_JOYSTICK_UPDATE_COMPLETE      = 0x608,
        SDL_EVENT_GAMEPAD_AXIS_MOTION           = 0x650,
        SDL_EVENT_GAMEPAD_BUTTON_DOWN           = 0x651,
        SDL_EVENT_GAMEPAD_BUTTON_UP             = 0x652,
        SDL_EVENT_GAMEPAD_ADDED                 = 0x653,
        SDL_EVENT_GAMEPAD_REMOVED               = 0x654,
        SDL_EVENT_GAMEPAD_REMAPPED              = 0x655,
        SDL_EVENT_GAMEPAD_TOUCHPAD_DOWN         = 0x656,
        SDL_EVENT_GAMEPAD_TOUCHPAD_MOTION       = 0x657,
        SDL_EVENT_GAMEPAD_TOUCHPAD_UP           = 0x658,
        SDL_EVENT_GAMEPAD_SENSOR_UPDATE         = 0x659,
        SDL_EVENT_GAMEPAD_UPDATE_COMPLETE       = 0x65A,
        SDL_EVENT_GAMEPAD_STEAM_HANDLE_UPDATED  = 0x65B,
        SDL_EVENT_FINGER_DOWN                   = 0x700,
        SDL_EVENT_FINGER_UP                     = 0x701,
        SDL_EVENT_FINGER_MOTION                 = 0x702,
        SDL_EVENT_FINGER_CANCELED               = 0x703,
        SDL_EVENT_CLIPBOARD_UPDATE              = 0x900,
        SDL_EVENT_DROP_FILE                     = 0x1000,
        SDL_EVENT_DROP_TEXT                     = 0x1001,
        SDL_EVENT_DROP_BEGIN                    = 0x1002,
        SDL_EVENT_DROP_COMPLETE                 = 0x1003,
        SDL_EVENT_DROP_POSITION                 = 0x1004,
        SDL_EVENT_AUDIO_DEVICE_ADDED            = 0x1100,
        SDL_EVENT_AUDIO_DEVICE_REMOVED          = 0x1101,
        SDL_EVENT_AUDIO_DEVICE_FORMAT_CHANGED   = 0x1102,
        SDL_EVENT_SENSOR_UPDATE                 = 0x1200,
        SDL_EVENT_PEN_PROXIMITY_IN              = 0x1300,
        SDL_EVENT_PEN_PROXIMITY_OUT             = 0x1301,
        SDL_EVENT_PEN_DOWN                      = 0x1302,
        SDL_EVENT_PEN_UP                        = 0x1303,
        SDL_EVENT_PEN_BUTTON_DOWN               = 0x1304,
        SDL_EVENT_PEN_BUTTON_UP                 = 0x1305,
        SDL_EVENT_PEN_MOTION                    = 0x1306,
        SDL_EVENT_PEN_AXIS                      = 0x1307,
        SDL_EVENT_CAMERA_DEVICE_ADDED           = 0x1400,
        SDL_EVENT_CAMERA_DEVICE_REMOVED         = 0x1401,
        SDL_EVENT_CAMERA_DEVICE_APPROVED        = 0x1402,
        SDL_EVENT_CAMERA_DEVICE_DENIED          = 0x1403,
        SDL_EVENT_RENDER_TARGETS_RESET          = 0x2000,
        SDL_EVENT_RENDER_DEVICE_RESET           = 0x2001,
        SDL_EVENT_RENDER_DEVICE_LOST            = 0x2002,
        SDL_EVENT_PRIVATE0                      = 0x4000,
        SDL_EVENT_PRIVATE1                      = 0x4001,
        SDL_EVENT_PRIVATE2                      = 0x4002,
        SDL_EVENT_PRIVATE3                      = 0x4003,
        SDL_EVENT_POLL_SENTINEL                 = 0x7F00,
        SDL_EVENT_USER                          = 0x8000,
        SDL_EVENT_LAST                          = 0xFFFF,
        SDL_EVENT_ENUM_PADDING                  = 0x7FFFFFFF;

    public static final int
        SDL_ADDEVENT  = 0,
        SDL_PEEKEVENT = 1,
        SDL_GETEVENT  = 2;

    public static final int
        SDL_FOLDER_HOME        = 0,
        SDL_FOLDER_DESKTOP     = 1,
        SDL_FOLDER_DOCUMENTS   = 2,
        SDL_FOLDER_DOWNLOADS   = 3,
        SDL_FOLDER_MUSIC       = 4,
        SDL_FOLDER_PICTURES    = 5,
        SDL_FOLDER_PUBLICSHARE = 6,
        SDL_FOLDER_SAVEDGAMES  = 7,
        SDL_FOLDER_SCREENSHOTS = 8,
        SDL_FOLDER_TEMPLATES   = 9,
        SDL_FOLDER_VIDEOS      = 10,
        SDL_FOLDER_COUNT       = 11;

    public static final int
        SDL_PATHTYPE_NONE      = 0,
        SDL_PATHTYPE_FILE      = 1,
        SDL_PATHTYPE_DIRECTORY = 2,
        SDL_PATHTYPE_OTHER     = 3;

    public static final int
        SDL_ENUM_CONTINUE = 0,
        SDL_ENUM_SUCCESS  = 1,
        SDL_ENUM_FAILURE  = 2;

    public static final int
        SDL_GPU_PRIMITIVETYPE_TRIANGLELIST  = 0,
        SDL_GPU_PRIMITIVETYPE_TRIANGLESTRIP = 1,
        SDL_GPU_PRIMITIVETYPE_LINELIST      = 2,
        SDL_GPU_PRIMITIVETYPE_LINESTRIP     = 3,
        SDL_GPU_PRIMITIVETYPE_POINTLIST     = 4;

    public static final int
        SDL_GPU_LOADOP_LOAD      = 0,
        SDL_GPU_LOADOP_CLEAR     = 1,
        SDL_GPU_LOADOP_DONT_CARE = 2;

    public static final int
        SDL_GPU_STOREOP_STORE             = 0,
        SDL_GPU_STOREOP_DONT_CARE         = 1,
        SDL_GPU_STOREOP_RESOLVE           = 2,
        SDL_GPU_STOREOP_RESOLVE_AND_STORE = 3;

    public static final int
        SDL_GPU_INDEXELEMENTSIZE_16BIT = 0,
        SDL_GPU_INDEXELEMENTSIZE_32BIT = 1;

    public static final int
        SDL_GPU_TEXTUREFORMAT_INVALID               = 0,
        SDL_GPU_TEXTUREFORMAT_A8_UNORM              = 1,
        SDL_GPU_TEXTUREFORMAT_R8_UNORM              = 2,
        SDL_GPU_TEXTUREFORMAT_R8G8_UNORM            = 3,
        SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM        = 4,
        SDL_GPU_TEXTUREFORMAT_R16_UNORM             = 5,
        SDL_GPU_TEXTUREFORMAT_R16G16_UNORM          = 6,
        SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UNORM    = 7,
        SDL_GPU_TEXTUREFORMAT_R10G10B10A2_UNORM     = 8,
        SDL_GPU_TEXTUREFORMAT_B5G6R5_UNORM          = 9,
        SDL_GPU_TEXTUREFORMAT_B5G5R5A1_UNORM        = 10,
        SDL_GPU_TEXTUREFORMAT_B4G4R4A4_UNORM        = 11,
        SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM        = 12,
        SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM        = 13,
        SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM        = 14,
        SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM        = 15,
        SDL_GPU_TEXTUREFORMAT_BC4_R_UNORM           = 16,
        SDL_GPU_TEXTUREFORMAT_BC5_RG_UNORM          = 17,
        SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM        = 18,
        SDL_GPU_TEXTUREFORMAT_BC6H_RGB_FLOAT        = 19,
        SDL_GPU_TEXTUREFORMAT_BC6H_RGB_UFLOAT       = 20,
        SDL_GPU_TEXTUREFORMAT_R8_SNORM              = 21,
        SDL_GPU_TEXTUREFORMAT_R8G8_SNORM            = 22,
        SDL_GPU_TEXTUREFORMAT_R8G8B8A8_SNORM        = 23,
        SDL_GPU_TEXTUREFORMAT_R16_SNORM             = 24,
        SDL_GPU_TEXTUREFORMAT_R16G16_SNORM          = 25,
        SDL_GPU_TEXTUREFORMAT_R16G16B16A16_SNORM    = 26,
        SDL_GPU_TEXTUREFORMAT_R16_FLOAT             = 27,
        SDL_GPU_TEXTUREFORMAT_R16G16_FLOAT          = 28,
        SDL_GPU_TEXTUREFORMAT_R16G16B16A16_FLOAT    = 29,
        SDL_GPU_TEXTUREFORMAT_R32_FLOAT             = 30,
        SDL_GPU_TEXTUREFORMAT_R32G32_FLOAT          = 31,
        SDL_GPU_TEXTUREFORMAT_R32G32B32A32_FLOAT    = 32,
        SDL_GPU_TEXTUREFORMAT_R11G11B10_UFLOAT      = 33,
        SDL_GPU_TEXTUREFORMAT_R8_UINT               = 34,
        SDL_GPU_TEXTUREFORMAT_R8G8_UINT             = 35,
        SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UINT         = 36,
        SDL_GPU_TEXTUREFORMAT_R16_UINT              = 37,
        SDL_GPU_TEXTUREFORMAT_R16G16_UINT           = 38,
        SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UINT     = 39,
        SDL_GPU_TEXTUREFORMAT_R32_UINT              = 40,
        SDL_GPU_TEXTUREFORMAT_R32G32_UINT           = 41,
        SDL_GPU_TEXTUREFORMAT_R32G32B32A32_UINT     = 42,
        SDL_GPU_TEXTUREFORMAT_R8_INT                = 43,
        SDL_GPU_TEXTUREFORMAT_R8G8_INT              = 44,
        SDL_GPU_TEXTUREFORMAT_R8G8B8A8_INT          = 45,
        SDL_GPU_TEXTUREFORMAT_R16_INT               = 46,
        SDL_GPU_TEXTUREFORMAT_R16G16_INT            = 47,
        SDL_GPU_TEXTUREFORMAT_R16G16B16A16_INT      = 48,
        SDL_GPU_TEXTUREFORMAT_R32_INT               = 49,
        SDL_GPU_TEXTUREFORMAT_R32G32_INT            = 50,
        SDL_GPU_TEXTUREFORMAT_R32G32B32A32_INT      = 51,
        SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM_SRGB   = 52,
        SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM_SRGB   = 53,
        SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM_SRGB   = 54,
        SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM_SRGB   = 55,
        SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM_SRGB   = 56,
        SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM_SRGB   = 57,
        SDL_GPU_TEXTUREFORMAT_D16_UNORM             = 58,
        SDL_GPU_TEXTUREFORMAT_D24_UNORM             = 59,
        SDL_GPU_TEXTUREFORMAT_D32_FLOAT             = 60,
        SDL_GPU_TEXTUREFORMAT_D24_UNORM_S8_UINT     = 61,
        SDL_GPU_TEXTUREFORMAT_D32_FLOAT_S8_UINT     = 62,
        SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM        = 63,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM        = 64,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM        = 65,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM        = 66,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM        = 67,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM        = 68,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM        = 69,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM        = 70,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM       = 71,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM       = 72,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM       = 73,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM      = 74,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM      = 75,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM      = 76,
        SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM_SRGB   = 77,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM_SRGB   = 78,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM_SRGB   = 79,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM_SRGB   = 80,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM_SRGB   = 81,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM_SRGB   = 82,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM_SRGB   = 83,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM_SRGB   = 84,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM_SRGB  = 85,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM_SRGB  = 86,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM_SRGB  = 87,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM_SRGB = 88,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM_SRGB = 89,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM_SRGB = 90,
        SDL_GPU_TEXTUREFORMAT_ASTC_4x4_FLOAT        = 91,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x4_FLOAT        = 92,
        SDL_GPU_TEXTUREFORMAT_ASTC_5x5_FLOAT        = 93,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x5_FLOAT        = 94,
        SDL_GPU_TEXTUREFORMAT_ASTC_6x6_FLOAT        = 95,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x5_FLOAT        = 96,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x6_FLOAT        = 97,
        SDL_GPU_TEXTUREFORMAT_ASTC_8x8_FLOAT        = 98,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x5_FLOAT       = 99,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x6_FLOAT       = 100,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x8_FLOAT       = 101,
        SDL_GPU_TEXTUREFORMAT_ASTC_10x10_FLOAT      = 102,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x10_FLOAT      = 103,
        SDL_GPU_TEXTUREFORMAT_ASTC_12x12_FLOAT      = 104;

    public static final int
        SDL_GPU_TEXTUREUSAGE_SAMPLER                                 = (1 << 0),
        SDL_GPU_TEXTUREUSAGE_COLOR_TARGET                            = (1 << 1),
        SDL_GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET                    = (1 << 2),
        SDL_GPU_TEXTUREUSAGE_GRAPHICS_STORAGE_READ                   = (1 << 3),
        SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_READ                    = (1 << 4),
        SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_WRITE                   = (1 << 5),
        SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_SIMULTANEOUS_READ_WRITE = (1 << 6);

    public static final int
        SDL_GPU_TEXTURETYPE_2D         = 0,
        SDL_GPU_TEXTURETYPE_2D_ARRAY   = 1,
        SDL_GPU_TEXTURETYPE_3D         = 2,
        SDL_GPU_TEXTURETYPE_CUBE       = 3,
        SDL_GPU_TEXTURETYPE_CUBE_ARRAY = 4;

    public static final int
        SDL_GPU_SAMPLECOUNT_1 = 0,
        SDL_GPU_SAMPLECOUNT_2 = 1,
        SDL_GPU_SAMPLECOUNT_4 = 2,
        SDL_GPU_SAMPLECOUNT_8 = 3;

    public static final int
        SDL_GPU_CUBEMAPFACE_POSITIVEX = 0,
        SDL_GPU_CUBEMAPFACE_NEGATIVEX = 1,
        SDL_GPU_CUBEMAPFACE_POSITIVEY = 2,
        SDL_GPU_CUBEMAPFACE_NEGATIVEY = 3,
        SDL_GPU_CUBEMAPFACE_POSITIVEZ = 4,
        SDL_GPU_CUBEMAPFACE_NEGATIVEZ = 5;

    public static final int
        SDL_GPU_BUFFERUSAGE_VERTEX                = (1 << 0),
        SDL_GPU_BUFFERUSAGE_INDEX                 = (1 << 1),
        SDL_GPU_BUFFERUSAGE_INDIRECT              = (1 << 2),
        SDL_GPU_BUFFERUSAGE_GRAPHICS_STORAGE_READ = (1 << 3),
        SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_READ  = (1 << 4),
        SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_WRITE = (1 << 5);

    public static final int
        SDL_GPU_TRANSFERBUFFERUSAGE_UPLOAD   = 0,
        SDL_GPU_TRANSFERBUFFERUSAGE_DOWNLOAD = 1;

    public static final int
        SDL_GPU_SHADERSTAGE_VERTEX   = 0,
        SDL_GPU_SHADERSTAGE_FRAGMENT = 1;

    public static final int
        SDL_GPU_SHADERFORMAT_INVALID  = 0,
        SDL_GPU_SHADERFORMAT_PRIVATE  = (1 << 0),
        SDL_GPU_SHADERFORMAT_SPIRV    = (1 << 1),
        SDL_GPU_SHADERFORMAT_DXBC     = (1 << 2),
        SDL_GPU_SHADERFORMAT_DXIL     = (1 << 3),
        SDL_GPU_SHADERFORMAT_MSL      = (1 << 4),
        SDL_GPU_SHADERFORMAT_METALLIB = (1 << 5);

    public static final int
        SDL_GPU_VERTEXELEMENTFORMAT_INVALID      = 0,
        SDL_GPU_VERTEXELEMENTFORMAT_INT          = 1,
        SDL_GPU_VERTEXELEMENTFORMAT_INT2         = 2,
        SDL_GPU_VERTEXELEMENTFORMAT_INT3         = 3,
        SDL_GPU_VERTEXELEMENTFORMAT_INT4         = 4,
        SDL_GPU_VERTEXELEMENTFORMAT_UINT         = 5,
        SDL_GPU_VERTEXELEMENTFORMAT_UINT2        = 6,
        SDL_GPU_VERTEXELEMENTFORMAT_UINT3        = 7,
        SDL_GPU_VERTEXELEMENTFORMAT_UINT4        = 8,
        SDL_GPU_VERTEXELEMENTFORMAT_FLOAT        = 9,
        SDL_GPU_VERTEXELEMENTFORMAT_FLOAT2       = 10,
        SDL_GPU_VERTEXELEMENTFORMAT_FLOAT3       = 11,
        SDL_GPU_VERTEXELEMENTFORMAT_FLOAT4       = 12,
        SDL_GPU_VERTEXELEMENTFORMAT_BYTE2        = 13,
        SDL_GPU_VERTEXELEMENTFORMAT_BYTE4        = 14,
        SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2       = 15,
        SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4       = 16,
        SDL_GPU_VERTEXELEMENTFORMAT_BYTE2_NORM   = 17,
        SDL_GPU_VERTEXELEMENTFORMAT_BYTE4_NORM   = 18,
        SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2_NORM  = 19,
        SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4_NORM  = 20,
        SDL_GPU_VERTEXELEMENTFORMAT_SHORT2       = 21,
        SDL_GPU_VERTEXELEMENTFORMAT_SHORT4       = 22,
        SDL_GPU_VERTEXELEMENTFORMAT_USHORT2      = 23,
        SDL_GPU_VERTEXELEMENTFORMAT_USHORT4      = 24,
        SDL_GPU_VERTEXELEMENTFORMAT_SHORT2_NORM  = 25,
        SDL_GPU_VERTEXELEMENTFORMAT_SHORT4_NORM  = 26,
        SDL_GPU_VERTEXELEMENTFORMAT_USHORT2_NORM = 27,
        SDL_GPU_VERTEXELEMENTFORMAT_USHORT4_NORM = 28,
        SDL_GPU_VERTEXELEMENTFORMAT_HALF2        = 29,
        SDL_GPU_VERTEXELEMENTFORMAT_HALF4        = 30;

    public static final int
        SDL_GPU_VERTEXINPUTRATE_VERTEX   = 0,
        SDL_GPU_VERTEXINPUTRATE_INSTANCE = 1;

    public static final int
        SDL_GPU_FILLMODE_FILL = 0,
        SDL_GPU_FILLMODE_LINE = 1;

    public static final int
        SDL_GPU_CULLMODE_NONE  = 0,
        SDL_GPU_CULLMODE_FRONT = 1,
        SDL_GPU_CULLMODE_BACK  = 2;

    public static final int
        SDL_GPU_FRONTFACE_COUNTER_CLOCKWISE = 0,
        SDL_GPU_FRONTFACE_CLOCKWISE         = 1;

    public static final int
        SDL_GPU_COMPAREOP_INVALID          = 0,
        SDL_GPU_COMPAREOP_NEVER            = 1,
        SDL_GPU_COMPAREOP_LESS             = 2,
        SDL_GPU_COMPAREOP_EQUAL            = 3,
        SDL_GPU_COMPAREOP_LESS_OR_EQUAL    = 4,
        SDL_GPU_COMPAREOP_GREATER          = 5,
        SDL_GPU_COMPAREOP_NOT_EQUAL        = 6,
        SDL_GPU_COMPAREOP_GREATER_OR_EQUAL = 7,
        SDL_GPU_COMPAREOP_ALWAYS           = 8;

    public static final int
        SDL_GPU_STENCILOP_INVALID             = 0,
        SDL_GPU_STENCILOP_KEEP                = 1,
        SDL_GPU_STENCILOP_ZERO                = 2,
        SDL_GPU_STENCILOP_REPLACE             = 3,
        SDL_GPU_STENCILOP_INCREMENT_AND_CLAMP = 4,
        SDL_GPU_STENCILOP_DECREMENT_AND_CLAMP = 5,
        SDL_GPU_STENCILOP_INVERT              = 6,
        SDL_GPU_STENCILOP_INCREMENT_AND_WRAP  = 7,
        SDL_GPU_STENCILOP_DECREMENT_AND_WRAP  = 8;

    public static final int
        SDL_GPU_BLENDOP_INVALID          = 0,
        SDL_GPU_BLENDOP_ADD              = 1,
        SDL_GPU_BLENDOP_SUBTRACT         = 2,
        SDL_GPU_BLENDOP_REVERSE_SUBTRACT = 3,
        SDL_GPU_BLENDOP_MIN              = 4,
        SDL_GPU_BLENDOP_MAX              = 5;

    public static final int
        SDL_GPU_BLENDFACTOR_INVALID                  = 0,
        SDL_GPU_BLENDFACTOR_ZERO                     = 1,
        SDL_GPU_BLENDFACTOR_ONE                      = 2,
        SDL_GPU_BLENDFACTOR_SRC_COLOR                = 3,
        SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_COLOR      = 4,
        SDL_GPU_BLENDFACTOR_DST_COLOR                = 5,
        SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_COLOR      = 6,
        SDL_GPU_BLENDFACTOR_SRC_ALPHA                = 7,
        SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA      = 8,
        SDL_GPU_BLENDFACTOR_DST_ALPHA                = 9,
        SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_ALPHA      = 10,
        SDL_GPU_BLENDFACTOR_CONSTANT_COLOR           = 11,
        SDL_GPU_BLENDFACTOR_ONE_MINUS_CONSTANT_COLOR = 12,
        SDL_GPU_BLENDFACTOR_SRC_ALPHA_SATURATE       = 13;

    public static final int
        SDL_GPU_COLORCOMPONENT_R = (1 << 0),
        SDL_GPU_COLORCOMPONENT_G = (1 << 1),
        SDL_GPU_COLORCOMPONENT_B = (1 << 2),
        SDL_GPU_COLORCOMPONENT_A = (1 << 3);

    public static final int
        SDL_GPU_FILTER_NEAREST = 0,
        SDL_GPU_FILTER_LINEAR  = 1;

    public static final int
        SDL_GPU_SAMPLERMIPMAPMODE_NEAREST = 0,
        SDL_GPU_SAMPLERMIPMAPMODE_LINEAR  = 1;

    public static final int
        SDL_GPU_SAMPLERADDRESSMODE_REPEAT          = 0,
        SDL_GPU_SAMPLERADDRESSMODE_MIRRORED_REPEAT = 1,
        SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE   = 2;

    public static final int
        SDL_GPU_PRESENTMODE_VSYNC     = 0,
        SDL_GPU_PRESENTMODE_IMMEDIATE = 1,
        SDL_GPU_PRESENTMODE_MAILBOX   = 2;

    public static final int
        SDL_GPU_SWAPCHAINCOMPOSITION_SDR                 = 0,
        SDL_GPU_SWAPCHAINCOMPOSITION_SDR_LINEAR          = 1,
        SDL_GPU_SWAPCHAINCOMPOSITION_HDR_EXTENDED_LINEAR = 2,
        SDL_GPU_SWAPCHAINCOMPOSITION_HDR10_ST2084        = 3;

    public static final String
        SDL_PROP_GPU_DEVICE_CREATE_DEBUGMODE_BOOLEAN          = "SDL.gpu.device.create.debugmode",
        SDL_PROP_GPU_DEVICE_CREATE_PREFERLOWPOWER_BOOLEAN     = "SDL.gpu.device.create.preferlowpower",
        SDL_PROP_GPU_DEVICE_CREATE_NAME_STRING                = "SDL.gpu.device.create.name",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_PRIVATE_BOOLEAN    = "SDL.gpu.device.create.shaders.private",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_SPIRV_BOOLEAN      = "SDL.gpu.device.create.shaders.spirv",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXBC_BOOLEAN       = "SDL.gpu.device.create.shaders.dxbc",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_DXIL_BOOLEAN       = "SDL.gpu.device.create.shaders.dxil",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_MSL_BOOLEAN        = "SDL.gpu.device.create.shaders.msl",
        SDL_PROP_GPU_DEVICE_CREATE_SHADERS_METALLIB_BOOLEAN   = "SDL.gpu.device.create.shaders.metallib",
        SDL_PROP_GPU_DEVICE_CREATE_D3D12_SEMANTIC_NAME_STRING = "SDL.gpu.device.create.d3d12.semantic";

    public static final String
        SDL_PROP_GPU_CREATETEXTURE_D3D12_CLEAR_R_FLOAT       = "SDL.gpu.createtexture.d3d12.clear.r",
        SDL_PROP_GPU_CREATETEXTURE_D3D12_CLEAR_G_FLOAT       = "SDL.gpu.createtexture.d3d12.clear.g",
        SDL_PROP_GPU_CREATETEXTURE_D3D12_CLEAR_B_FLOAT       = "SDL.gpu.createtexture.d3d12.clear.b",
        SDL_PROP_GPU_CREATETEXTURE_D3D12_CLEAR_A_FLOAT       = "SDL.gpu.createtexture.d3d12.clear.a",
        SDL_PROP_GPU_CREATETEXTURE_D3D12_CLEAR_DEPTH_FLOAT   = "SDL.gpu.createtexture.d3d12.clear.depth",
        SDL_PROP_GPU_CREATETEXTURE_D3D12_CLEAR_STENCIL_UINT8 = "SDL.gpu.createtexture.d3d12.clear.stencil";

    public static final int SDL_HAPTIC_CONSTANT = (1<<0);

    public static final int SDL_HAPTIC_SINE = (1<<1);

    public static final int SDL_HAPTIC_SQUARE = (1<<2);

    public static final int SDL_HAPTIC_TRIANGLE = (1<<3);

    public static final int SDL_HAPTIC_SAWTOOTHUP = (1<<4);

    public static final int SDL_HAPTIC_SAWTOOTHDOWN = (1<<5);

    public static final int SDL_HAPTIC_RAMP = (1<<6);

    public static final int SDL_HAPTIC_SPRING = (1<<7);

    public static final int SDL_HAPTIC_DAMPER = (1<<8);

    public static final int SDL_HAPTIC_INERTIA = (1<<9);

    public static final int SDL_HAPTIC_FRICTION = (1<<10);

    public static final int SDL_HAPTIC_LEFTRIGHT = (1<<11);

    public static final int SDL_HAPTIC_RESERVED1 = (1<<12);

    public static final int SDL_HAPTIC_RESERVED2 = (1<<13);

    public static final int SDL_HAPTIC_RESERVED3 = (1<<14);

    public static final int SDL_HAPTIC_CUSTOM = (1<<15);

    public static final int SDL_HAPTIC_GAIN = (1<<16);

    public static final int SDL_HAPTIC_AUTOCENTER = (1<<17);

    public static final int SDL_HAPTIC_STATUS = (1<<18);

    public static final int SDL_HAPTIC_PAUSE = (1<<19);

    public static final int SDL_HAPTIC_POLAR = 0;

    public static final int SDL_HAPTIC_CARTESIAN = 1;

    public static final int SDL_HAPTIC_SPHERICAL = 2;

    public static final int SDL_HAPTIC_STEERING_AXIS = 3;

    public static final int SDL_HAPTIC_INFINITY = 0xffffffff;

    public static final int
        SDL_HID_API_BUS_UNKNOWN   = 0x00,
        SDL_HID_API_BUS_USB       = 0x01,
        SDL_HID_API_BUS_BLUETOOTH = 0x02,
        SDL_HID_API_BUS_I2C       = 0x03,
        SDL_HID_API_BUS_SPI       = 0x04;

    public static final String SDL_HINT_ALLOW_ALT_TAB_WHILE_GRABBED = "SDL_ALLOW_ALT_TAB_WHILE_GRABBED";

    public static final String SDL_HINT_ANDROID_ALLOW_RECREATE_ACTIVITY = "SDL_ANDROID_ALLOW_RECREATE_ACTIVITY";

    public static final String SDL_HINT_ANDROID_BLOCK_ON_PAUSE = "SDL_ANDROID_BLOCK_ON_PAUSE";

    public static final String SDL_HINT_ANDROID_LOW_LATENCY_AUDIO = "SDL_ANDROID_LOW_LATENCY_AUDIO";

    public static final String SDL_HINT_ANDROID_TRAP_BACK_BUTTON = "SDL_ANDROID_TRAP_BACK_BUTTON";

    public static final String SDL_HINT_APP_ID = "SDL_APP_ID";

    public static final String SDL_HINT_APP_NAME = "SDL_APP_NAME";

    public static final String SDL_HINT_APPLE_TV_CONTROLLER_UI_EVENTS = "SDL_APPLE_TV_CONTROLLER_UI_EVENTS";

    public static final String SDL_HINT_APPLE_TV_REMOTE_ALLOW_ROTATION = "SDL_APPLE_TV_REMOTE_ALLOW_ROTATION";

    public static final String SDL_HINT_AUDIO_ALSA_DEFAULT_DEVICE = "SDL_AUDIO_ALSA_DEFAULT_DEVICE";

    public static final String SDL_HINT_AUDIO_ALSA_DEFAULT_PLAYBACK_DEVICE = "SDL_AUDIO_ALSA_DEFAULT_PLAYBACK_DEVICE";

    public static final String SDL_HINT_AUDIO_ALSA_DEFAULT_RECORDING_DEVICE = "SDL_AUDIO_ALSA_DEFAULT_RECORDING_DEVICE";

    public static final String SDL_HINT_AUDIO_CATEGORY = "SDL_AUDIO_CATEGORY";

    public static final String SDL_HINT_AUDIO_CHANNELS = "SDL_AUDIO_CHANNELS";

    public static final String SDL_HINT_AUDIO_DEVICE_APP_ICON_NAME = "SDL_AUDIO_DEVICE_APP_ICON_NAME";

    public static final String SDL_HINT_AUDIO_DEVICE_SAMPLE_FRAMES = "SDL_AUDIO_DEVICE_SAMPLE_FRAMES";

    public static final String SDL_HINT_AUDIO_DEVICE_STREAM_NAME = "SDL_AUDIO_DEVICE_STREAM_NAME";

    public static final String SDL_HINT_AUDIO_DEVICE_STREAM_ROLE = "SDL_AUDIO_DEVICE_STREAM_ROLE";

    public static final String SDL_HINT_AUDIO_DISK_INPUT_FILE = "SDL_AUDIO_DISK_INPUT_FILE";

    public static final String SDL_HINT_AUDIO_DISK_OUTPUT_FILE = "SDL_AUDIO_DISK_OUTPUT_FILE";

    public static final String SDL_HINT_AUDIO_DISK_TIMESCALE = "SDL_AUDIO_DISK_TIMESCALE";

    public static final String SDL_HINT_AUDIO_DRIVER = "SDL_AUDIO_DRIVER";

    public static final String SDL_HINT_AUDIO_DUMMY_TIMESCALE = "SDL_AUDIO_DUMMY_TIMESCALE";

    public static final String SDL_HINT_AUDIO_FORMAT = "SDL_AUDIO_FORMAT";

    public static final String SDL_HINT_AUDIO_FREQUENCY = "SDL_AUDIO_FREQUENCY";

    public static final String SDL_HINT_AUDIO_INCLUDE_MONITORS = "SDL_AUDIO_INCLUDE_MONITORS";

    public static final String SDL_HINT_AUTO_UPDATE_JOYSTICKS = "SDL_AUTO_UPDATE_JOYSTICKS";

    public static final String SDL_HINT_AUTO_UPDATE_SENSORS = "SDL_AUTO_UPDATE_SENSORS";

    public static final String SDL_HINT_BMP_SAVE_LEGACY_FORMAT = "SDL_BMP_SAVE_LEGACY_FORMAT";

    public static final String SDL_HINT_CAMERA_DRIVER = "SDL_CAMERA_DRIVER";

    public static final String SDL_HINT_CPU_FEATURE_MASK = "SDL_CPU_FEATURE_MASK";

    public static final String SDL_HINT_JOYSTICK_DIRECTINPUT = "SDL_JOYSTICK_DIRECTINPUT";

    public static final String SDL_HINT_FILE_DIALOG_DRIVER = "SDL_FILE_DIALOG_DRIVER";

    public static final String SDL_HINT_DISPLAY_USABLE_BOUNDS = "SDL_DISPLAY_USABLE_BOUNDS";

    public static final String SDL_HINT_EMSCRIPTEN_ASYNCIFY = "SDL_EMSCRIPTEN_ASYNCIFY";

    public static final String SDL_HINT_EMSCRIPTEN_CANVAS_SELECTOR = "SDL_EMSCRIPTEN_CANVAS_SELECTOR";

    public static final String SDL_HINT_EMSCRIPTEN_KEYBOARD_ELEMENT = "SDL_EMSCRIPTEN_KEYBOARD_ELEMENT";

    public static final String SDL_HINT_ENABLE_SCREEN_KEYBOARD = "SDL_ENABLE_SCREEN_KEYBOARD";

    public static final String SDL_HINT_EVDEV_DEVICES = "SDL_EVDEV_DEVICES";

    public static final String SDL_HINT_EVENT_LOGGING = "SDL_EVENT_LOGGING";

    public static final String SDL_HINT_FORCE_RAISEWINDOW = "SDL_FORCE_RAISEWINDOW";

    public static final String SDL_HINT_FRAMEBUFFER_ACCELERATION = "SDL_FRAMEBUFFER_ACCELERATION";

    public static final String SDL_HINT_GAMECONTROLLERCONFIG = "SDL_GAMECONTROLLERCONFIG";

    public static final String SDL_HINT_GAMECONTROLLERCONFIG_FILE = "SDL_GAMECONTROLLERCONFIG_FILE";

    public static final String SDL_HINT_GAMECONTROLLERTYPE = "SDL_GAMECONTROLLERTYPE";

    public static final String SDL_HINT_GAMECONTROLLER_IGNORE_DEVICES = "SDL_GAMECONTROLLER_IGNORE_DEVICES";

    public static final String SDL_HINT_GAMECONTROLLER_IGNORE_DEVICES_EXCEPT = "SDL_GAMECONTROLLER_IGNORE_DEVICES_EXCEPT";

    public static final String SDL_HINT_GAMECONTROLLER_SENSOR_FUSION = "SDL_GAMECONTROLLER_SENSOR_FUSION";

    public static final String SDL_HINT_GDK_TEXTINPUT_DEFAULT_TEXT = "SDL_GDK_TEXTINPUT_DEFAULT_TEXT";

    public static final String SDL_HINT_GDK_TEXTINPUT_DESCRIPTION = "SDL_GDK_TEXTINPUT_DESCRIPTION";

    public static final String SDL_HINT_GDK_TEXTINPUT_MAX_LENGTH = "SDL_GDK_TEXTINPUT_MAX_LENGTH";

    public static final String SDL_HINT_GDK_TEXTINPUT_SCOPE = "SDL_GDK_TEXTINPUT_SCOPE";

    public static final String SDL_HINT_GDK_TEXTINPUT_TITLE = "SDL_GDK_TEXTINPUT_TITLE";

    public static final String SDL_HINT_HIDAPI_LIBUSB = "SDL_HIDAPI_LIBUSB";

    public static final String SDL_HINT_HIDAPI_LIBUSB_WHITELIST = "SDL_HIDAPI_LIBUSB_WHITELIST";

    public static final String SDL_HINT_HIDAPI_UDEV = "SDL_HIDAPI_UDEV";

    public static final String SDL_HINT_GPU_DRIVER = "SDL_GPU_DRIVER";

    public static final String SDL_HINT_HIDAPI_ENUMERATE_ONLY_CONTROLLERS = "SDL_HIDAPI_ENUMERATE_ONLY_CONTROLLERS";

    public static final String SDL_HINT_HIDAPI_IGNORE_DEVICES = "SDL_HIDAPI_IGNORE_DEVICES";

    public static final String SDL_HINT_IME_IMPLEMENTED_UI = "SDL_IME_IMPLEMENTED_UI";

    public static final String SDL_HINT_IOS_HIDE_HOME_INDICATOR = "SDL_IOS_HIDE_HOME_INDICATOR";

    public static final String SDL_HINT_JOYSTICK_ALLOW_BACKGROUND_EVENTS = "SDL_JOYSTICK_ALLOW_BACKGROUND_EVENTS";

    public static final String SDL_HINT_JOYSTICK_ARCADESTICK_DEVICES = "SDL_JOYSTICK_ARCADESTICK_DEVICES";

    public static final String SDL_HINT_JOYSTICK_ARCADESTICK_DEVICES_EXCLUDED = "SDL_JOYSTICK_ARCADESTICK_DEVICES_EXCLUDED";

    public static final String SDL_HINT_JOYSTICK_BLACKLIST_DEVICES = "SDL_JOYSTICK_BLACKLIST_DEVICES";

    public static final String SDL_HINT_JOYSTICK_BLACKLIST_DEVICES_EXCLUDED = "SDL_JOYSTICK_BLACKLIST_DEVICES_EXCLUDED";

    public static final String SDL_HINT_JOYSTICK_DEVICE = "SDL_JOYSTICK_DEVICE";

    public static final String SDL_HINT_JOYSTICK_ENHANCED_REPORTS = "SDL_JOYSTICK_ENHANCED_REPORTS";

    public static final String SDL_HINT_JOYSTICK_FLIGHTSTICK_DEVICES = "SDL_JOYSTICK_FLIGHTSTICK_DEVICES";

    public static final String SDL_HINT_JOYSTICK_FLIGHTSTICK_DEVICES_EXCLUDED = "SDL_JOYSTICK_FLIGHTSTICK_DEVICES_EXCLUDED";

    public static final String SDL_HINT_JOYSTICK_GAMEINPUT = "SDL_JOYSTICK_GAMEINPUT";

    public static final String SDL_HINT_JOYSTICK_GAMECUBE_DEVICES = "SDL_JOYSTICK_GAMECUBE_DEVICES";

    public static final String SDL_HINT_JOYSTICK_GAMECUBE_DEVICES_EXCLUDED = "SDL_JOYSTICK_GAMECUBE_DEVICES_EXCLUDED";

    public static final String SDL_HINT_JOYSTICK_HIDAPI = "SDL_JOYSTICK_HIDAPI";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_COMBINE_JOY_CONS = "SDL_JOYSTICK_HIDAPI_COMBINE_JOY_CONS";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_GAMECUBE = "SDL_JOYSTICK_HIDAPI_GAMECUBE";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_GAMECUBE_RUMBLE_BRAKE = "SDL_JOYSTICK_HIDAPI_GAMECUBE_RUMBLE_BRAKE";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_JOY_CONS = "SDL_JOYSTICK_HIDAPI_JOY_CONS";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_JOYCON_HOME_LED = "SDL_JOYSTICK_HIDAPI_JOYCON_HOME_LED";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_LUNA = "SDL_JOYSTICK_HIDAPI_LUNA";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_NINTENDO_CLASSIC = "SDL_JOYSTICK_HIDAPI_NINTENDO_CLASSIC";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_PS3 = "SDL_JOYSTICK_HIDAPI_PS3";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_PS3_SIXAXIS_DRIVER = "SDL_JOYSTICK_HIDAPI_PS3_SIXAXIS_DRIVER";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_PS4 = "SDL_JOYSTICK_HIDAPI_PS4";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_PS4_REPORT_INTERVAL = "SDL_JOYSTICK_HIDAPI_PS4_REPORT_INTERVAL";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_PS5 = "SDL_JOYSTICK_HIDAPI_PS5";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_PS5_PLAYER_LED = "SDL_JOYSTICK_HIDAPI_PS5_PLAYER_LED";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_SHIELD = "SDL_JOYSTICK_HIDAPI_SHIELD";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_STADIA = "SDL_JOYSTICK_HIDAPI_STADIA";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_STEAM = "SDL_JOYSTICK_HIDAPI_STEAM";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_STEAM_HOME_LED = "SDL_JOYSTICK_HIDAPI_STEAM_HOME_LED";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_STEAMDECK = "SDL_JOYSTICK_HIDAPI_STEAMDECK";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_STEAM_HORI = "SDL_JOYSTICK_HIDAPI_STEAM_HORI";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_SWITCH = "SDL_JOYSTICK_HIDAPI_SWITCH";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_SWITCH_HOME_LED = "SDL_JOYSTICK_HIDAPI_SWITCH_HOME_LED";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_SWITCH_PLAYER_LED = "SDL_JOYSTICK_HIDAPI_SWITCH_PLAYER_LED";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_VERTICAL_JOY_CONS = "SDL_JOYSTICK_HIDAPI_VERTICAL_JOY_CONS";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_WII = "SDL_JOYSTICK_HIDAPI_WII";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_WII_PLAYER_LED = "SDL_JOYSTICK_HIDAPI_WII_PLAYER_LED";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_XBOX = "SDL_JOYSTICK_HIDAPI_XBOX";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_XBOX_360 = "SDL_JOYSTICK_HIDAPI_XBOX_360";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_XBOX_360_PLAYER_LED = "SDL_JOYSTICK_HIDAPI_XBOX_360_PLAYER_LED";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_XBOX_360_WIRELESS = "SDL_JOYSTICK_HIDAPI_XBOX_360_WIRELESS";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_XBOX_ONE = "SDL_JOYSTICK_HIDAPI_XBOX_ONE";

    public static final String SDL_HINT_JOYSTICK_HIDAPI_XBOX_ONE_HOME_LED = "SDL_JOYSTICK_HIDAPI_XBOX_ONE_HOME_LED";

    public static final String SDL_HINT_JOYSTICK_IOKIT = "SDL_JOYSTICK_IOKIT";

    public static final String SDL_HINT_JOYSTICK_LINUX_CLASSIC = "SDL_JOYSTICK_LINUX_CLASSIC";

    public static final String SDL_HINT_JOYSTICK_LINUX_DEADZONES = "SDL_JOYSTICK_LINUX_DEADZONES";

    public static final String SDL_HINT_JOYSTICK_LINUX_DIGITAL_HATS = "SDL_JOYSTICK_LINUX_DIGITAL_HATS";

    public static final String SDL_HINT_JOYSTICK_LINUX_HAT_DEADZONES = "SDL_JOYSTICK_LINUX_HAT_DEADZONES";

    public static final String SDL_HINT_JOYSTICK_MFI = "SDL_JOYSTICK_MFI";

    public static final String SDL_HINT_JOYSTICK_RAWINPUT = "SDL_JOYSTICK_RAWINPUT";

    public static final String SDL_HINT_JOYSTICK_RAWINPUT_CORRELATE_XINPUT = "SDL_JOYSTICK_RAWINPUT_CORRELATE_XINPUT";

    public static final String SDL_HINT_JOYSTICK_ROG_CHAKRAM = "SDL_JOYSTICK_ROG_CHAKRAM";

    public static final String SDL_HINT_JOYSTICK_THREAD = "SDL_JOYSTICK_THREAD";

    public static final String SDL_HINT_JOYSTICK_THROTTLE_DEVICES = "SDL_JOYSTICK_THROTTLE_DEVICES";

    public static final String SDL_HINT_JOYSTICK_THROTTLE_DEVICES_EXCLUDED = "SDL_JOYSTICK_THROTTLE_DEVICES_EXCLUDED";

    public static final String SDL_HINT_JOYSTICK_WGI = "SDL_JOYSTICK_WGI";

    public static final String SDL_HINT_JOYSTICK_WHEEL_DEVICES = "SDL_JOYSTICK_WHEEL_DEVICES";

    public static final String SDL_HINT_JOYSTICK_WHEEL_DEVICES_EXCLUDED = "SDL_JOYSTICK_WHEEL_DEVICES_EXCLUDED";

    public static final String SDL_HINT_JOYSTICK_ZERO_CENTERED_DEVICES = "SDL_JOYSTICK_ZERO_CENTERED_DEVICES";

    public static final String SDL_HINT_KEYCODE_OPTIONS = "SDL_KEYCODE_OPTIONS";

    public static final String SDL_HINT_KMSDRM_DEVICE_INDEX = "SDL_KMSDRM_DEVICE_INDEX";

    public static final String SDL_HINT_KMSDRM_REQUIRE_DRM_MASTER = "SDL_KMSDRM_REQUIRE_DRM_MASTER";

    public static final String SDL_HINT_LOGGING = "SDL_LOGGING";

    public static final String SDL_HINT_MAC_BACKGROUND_APP = "SDL_MAC_BACKGROUND_APP";

    public static final String SDL_HINT_MAC_CTRL_CLICK_EMULATE_RIGHT_CLICK = "SDL_MAC_CTRL_CLICK_EMULATE_RIGHT_CLICK";

    public static final String SDL_HINT_MAC_OPENGL_ASYNC_DISPATCH = "SDL_MAC_OPENGL_ASYNC_DISPATCH";

    public static final String SDL_HINT_MAC_SCROLL_MOMENTUM = "SDL_MAC_SCROLL_MOMENTUM";

    public static final String SDL_HINT_MAIN_CALLBACK_RATE = "SDL_MAIN_CALLBACK_RATE";

    public static final String SDL_HINT_MOUSE_AUTO_CAPTURE = "SDL_MOUSE_AUTO_CAPTURE";

    public static final String SDL_HINT_MOUSE_DOUBLE_CLICK_RADIUS = "SDL_MOUSE_DOUBLE_CLICK_RADIUS";

    public static final String SDL_HINT_MOUSE_DOUBLE_CLICK_TIME = "SDL_MOUSE_DOUBLE_CLICK_TIME";

    public static final String SDL_HINT_MOUSE_DEFAULT_SYSTEM_CURSOR = "SDL_MOUSE_DEFAULT_SYSTEM_CURSOR";

    public static final String SDL_HINT_MOUSE_EMULATE_WARP_WITH_RELATIVE = "SDL_MOUSE_EMULATE_WARP_WITH_RELATIVE";

    public static final String SDL_HINT_MOUSE_FOCUS_CLICKTHROUGH = "SDL_MOUSE_FOCUS_CLICKTHROUGH";

    public static final String SDL_HINT_MOUSE_NORMAL_SPEED_SCALE = "SDL_MOUSE_NORMAL_SPEED_SCALE";

    public static final String SDL_HINT_MOUSE_RELATIVE_MODE_CENTER = "SDL_MOUSE_RELATIVE_MODE_CENTER";

    public static final String SDL_HINT_MOUSE_RELATIVE_SPEED_SCALE = "SDL_MOUSE_RELATIVE_SPEED_SCALE";

    public static final String SDL_HINT_MOUSE_RELATIVE_SYSTEM_SCALE = "SDL_MOUSE_RELATIVE_SYSTEM_SCALE";

    public static final String SDL_HINT_MOUSE_RELATIVE_WARP_MOTION = "SDL_MOUSE_RELATIVE_WARP_MOTION";

    public static final String SDL_HINT_MOUSE_RELATIVE_CURSOR_VISIBLE = "SDL_MOUSE_RELATIVE_CURSOR_VISIBLE";

    public static final String SDL_HINT_MOUSE_TOUCH_EVENTS = "SDL_MOUSE_TOUCH_EVENTS";

    public static final String SDL_HINT_MUTE_CONSOLE_KEYBOARD = "SDL_MUTE_CONSOLE_KEYBOARD";

    public static final String SDL_HINT_NO_SIGNAL_HANDLERS = "SDL_NO_SIGNAL_HANDLERS";

    public static final String SDL_HINT_OPENGL_LIBRARY = "SDL_OPENGL_LIBRARY";

    public static final String SDL_HINT_EGL_LIBRARY = "SDL_EGL_LIBRARY";

    public static final String SDL_HINT_OPENGL_ES_DRIVER = "SDL_OPENGL_ES_DRIVER";

    public static final String SDL_HINT_OPENVR_LIBRARY = "SDL_OPENVR_LIBRARY";

    public static final String SDL_HINT_ORIENTATIONS = "SDL_ORIENTATIONS";

    public static final String SDL_HINT_POLL_SENTINEL = "SDL_POLL_SENTINEL";

    public static final String SDL_HINT_PREFERRED_LOCALES = "SDL_PREFERRED_LOCALES";

    public static final String SDL_HINT_QUIT_ON_LAST_WINDOW_CLOSE = "SDL_QUIT_ON_LAST_WINDOW_CLOSE";

    public static final String SDL_HINT_RENDER_DIRECT3D_THREADSAFE = "SDL_RENDER_DIRECT3D_THREADSAFE";

    public static final String SDL_HINT_RENDER_DIRECT3D11_DEBUG = "SDL_RENDER_DIRECT3D11_DEBUG";

    public static final String SDL_HINT_RENDER_VULKAN_DEBUG = "SDL_RENDER_VULKAN_DEBUG";

    public static final String SDL_HINT_RENDER_GPU_DEBUG = "SDL_RENDER_GPU_DEBUG";

    public static final String SDL_HINT_RENDER_GPU_LOW_POWER = "SDL_RENDER_GPU_LOW_POWER";

    public static final String SDL_HINT_RENDER_DRIVER = "SDL_RENDER_DRIVER";

    public static final String SDL_HINT_RENDER_LINE_METHOD = "SDL_RENDER_LINE_METHOD";

    public static final String SDL_HINT_RENDER_METAL_PREFER_LOW_POWER_DEVICE = "SDL_RENDER_METAL_PREFER_LOW_POWER_DEVICE";

    public static final String SDL_HINT_RENDER_VSYNC = "SDL_RENDER_VSYNC";

    public static final String SDL_HINT_RETURN_KEY_HIDES_IME = "SDL_RETURN_KEY_HIDES_IME";

    public static final String SDL_HINT_ROG_GAMEPAD_MICE = "SDL_ROG_GAMEPAD_MICE";

    public static final String SDL_HINT_ROG_GAMEPAD_MICE_EXCLUDED = "SDL_ROG_GAMEPAD_MICE_EXCLUDED";

    public static final String SDL_HINT_RPI_VIDEO_LAYER = "SDL_RPI_VIDEO_LAYER";

    public static final String SDL_HINT_SCREENSAVER_INHIBIT_ACTIVITY_NAME = "SDL_SCREENSAVER_INHIBIT_ACTIVITY_NAME";

    public static final String SDL_HINT_SHUTDOWN_DBUS_ON_QUIT = "SDL_SHUTDOWN_DBUS_ON_QUIT";

    public static final String SDL_HINT_STORAGE_TITLE_DRIVER = "SDL_STORAGE_TITLE_DRIVER";

    public static final String SDL_HINT_STORAGE_USER_DRIVER = "SDL_STORAGE_USER_DRIVER";

    public static final String SDL_HINT_THREAD_FORCE_REALTIME_TIME_CRITICAL = "SDL_THREAD_FORCE_REALTIME_TIME_CRITICAL";

    public static final String SDL_HINT_THREAD_PRIORITY_POLICY = "SDL_THREAD_PRIORITY_POLICY";

    public static final String SDL_HINT_TIMER_RESOLUTION = "SDL_TIMER_RESOLUTION";

    public static final String SDL_HINT_TOUCH_MOUSE_EVENTS = "SDL_TOUCH_MOUSE_EVENTS";

    public static final String SDL_HINT_TRACKPAD_IS_TOUCH_ONLY = "SDL_TRACKPAD_IS_TOUCH_ONLY";

    public static final String SDL_HINT_TV_REMOTE_AS_JOYSTICK = "SDL_TV_REMOTE_AS_JOYSTICK";

    public static final String SDL_HINT_VIDEO_ALLOW_SCREENSAVER = "SDL_VIDEO_ALLOW_SCREENSAVER";

    public static final String SDL_HINT_VIDEO_DISPLAY_PRIORITY = "SDL_VIDEO_DISPLAY_PRIORITY";

    public static final String SDL_HINT_VIDEO_DOUBLE_BUFFER = "SDL_VIDEO_DOUBLE_BUFFER";

    public static final String SDL_HINT_VIDEO_DRIVER = "SDL_VIDEO_DRIVER";

    public static final String SDL_HINT_VIDEO_DUMMY_SAVE_FRAMES = "SDL_VIDEO_DUMMY_SAVE_FRAMES";

    public static final String SDL_HINT_VIDEO_EGL_ALLOW_GETDISPLAY_FALLBACK = "SDL_VIDEO_EGL_ALLOW_GETDISPLAY_FALLBACK";

    public static final String SDL_HINT_VIDEO_FORCE_EGL = "SDL_VIDEO_FORCE_EGL";

    public static final String SDL_HINT_VIDEO_MAC_FULLSCREEN_SPACES = "SDL_VIDEO_MAC_FULLSCREEN_SPACES";

    public static final String SDL_HINT_VIDEO_MINIMIZE_ON_FOCUS_LOSS = "SDL_VIDEO_MINIMIZE_ON_FOCUS_LOSS";

    public static final String SDL_HINT_VIDEO_OFFSCREEN_SAVE_FRAMES = "SDL_VIDEO_OFFSCREEN_SAVE_FRAMES";

    public static final String SDL_HINT_VIDEO_SYNC_WINDOW_OPERATIONS = "SDL_VIDEO_SYNC_WINDOW_OPERATIONS";

    public static final String SDL_HINT_VIDEO_WAYLAND_ALLOW_LIBDECOR = "SDL_VIDEO_WAYLAND_ALLOW_LIBDECOR";

    public static final String SDL_HINT_VIDEO_WAYLAND_MODE_EMULATION = "SDL_VIDEO_WAYLAND_MODE_EMULATION";

    public static final String SDL_HINT_VIDEO_WAYLAND_MODE_SCALING = "SDL_VIDEO_WAYLAND_MODE_SCALING";

    public static final String SDL_HINT_VIDEO_WAYLAND_PREFER_LIBDECOR = "SDL_VIDEO_WAYLAND_PREFER_LIBDECOR";

    public static final String SDL_HINT_VIDEO_WAYLAND_SCALE_TO_DISPLAY = "SDL_VIDEO_WAYLAND_SCALE_TO_DISPLAY";

    public static final String SDL_HINT_VIDEO_WIN_D3DCOMPILER = "SDL_VIDEO_WIN_D3DCOMPILER";

    public static final String SDL_HINT_VIDEO_X11_NET_WM_BYPASS_COMPOSITOR = "SDL_VIDEO_X11_NET_WM_BYPASS_COMPOSITOR";

    public static final String SDL_HINT_VIDEO_X11_NET_WM_PING = "SDL_VIDEO_X11_NET_WM_PING";

    public static final String SDL_HINT_VIDEO_X11_NODIRECTCOLOR = "SDL_VIDEO_X11_NODIRECTCOLOR";

    public static final String SDL_HINT_VIDEO_X11_SCALING_FACTOR = "SDL_VIDEO_X11_SCALING_FACTOR";

    public static final String SDL_HINT_VIDEO_X11_VISUALID = "SDL_VIDEO_X11_VISUALID";

    public static final String SDL_HINT_VIDEO_X11_WINDOW_VISUALID = "SDL_VIDEO_X11_WINDOW_VISUALID";

    public static final String SDL_HINT_VIDEO_X11_XRANDR = "SDL_VIDEO_X11_XRANDR";

    public static final String SDL_HINT_VITA_ENABLE_BACK_TOUCH = "SDL_VITA_ENABLE_BACK_TOUCH";

    public static final String SDL_HINT_VITA_ENABLE_FRONT_TOUCH = "SDL_VITA_ENABLE_FRONT_TOUCH";

    public static final String SDL_HINT_VITA_MODULE_PATH = "SDL_VITA_MODULE_PATH";

    public static final String SDL_HINT_VITA_PVR_INIT = "SDL_VITA_PVR_INIT";

    public static final String SDL_HINT_VITA_RESOLUTION = "SDL_VITA_RESOLUTION";

    public static final String SDL_HINT_VITA_PVR_OPENGL = "SDL_VITA_PVR_OPENGL";

    public static final String SDL_HINT_VITA_TOUCH_MOUSE_DEVICE = "SDL_VITA_TOUCH_MOUSE_DEVICE";

    public static final String SDL_HINT_VULKAN_DISPLAY = "SDL_VULKAN_DISPLAY";

    public static final String SDL_HINT_VULKAN_LIBRARY = "SDL_VULKAN_LIBRARY";

    public static final String SDL_HINT_WAVE_FACT_CHUNK = "SDL_WAVE_FACT_CHUNK";

    public static final String SDL_HINT_WAVE_CHUNK_LIMIT = "SDL_WAVE_CHUNK_LIMIT";

    public static final String SDL_HINT_WAVE_RIFF_CHUNK_SIZE = "SDL_WAVE_RIFF_CHUNK_SIZE";

    public static final String SDL_HINT_WAVE_TRUNCATION = "SDL_WAVE_TRUNCATION";

    public static final String SDL_HINT_WINDOW_ACTIVATE_WHEN_RAISED = "SDL_WINDOW_ACTIVATE_WHEN_RAISED";

    public static final String SDL_HINT_WINDOW_ACTIVATE_WHEN_SHOWN = "SDL_WINDOW_ACTIVATE_WHEN_SHOWN";

    public static final String SDL_HINT_WINDOW_ALLOW_TOPMOST = "SDL_WINDOW_ALLOW_TOPMOST";

    public static final String SDL_HINT_WINDOW_FRAME_USABLE_WHILE_CURSOR_HIDDEN = "SDL_WINDOW_FRAME_USABLE_WHILE_CURSOR_HIDDEN";

    public static final String SDL_HINT_WINDOWS_CLOSE_ON_ALT_F4 = "SDL_WINDOWS_CLOSE_ON_ALT_F4";

    public static final String SDL_HINT_WINDOWS_ENABLE_MENU_MNEMONICS = "SDL_WINDOWS_ENABLE_MENU_MNEMONICS";

    public static final String SDL_HINT_WINDOWS_ENABLE_MESSAGELOOP = "SDL_WINDOWS_ENABLE_MESSAGELOOP";

    public static final String SDL_HINT_WINDOWS_GAMEINPUT = "SDL_WINDOWS_GAMEINPUT";

    public static final String SDL_HINT_WINDOWS_RAW_KEYBOARD = "SDL_WINDOWS_RAW_KEYBOARD";

    public static final String SDL_HINT_WINDOWS_FORCE_SEMAPHORE_KERNEL = "SDL_WINDOWS_FORCE_SEMAPHORE_KERNEL";

    public static final String SDL_HINT_WINDOWS_INTRESOURCE_ICON = "SDL_WINDOWS_INTRESOURCE_ICON";

    public static final String SDL_HINT_WINDOWS_INTRESOURCE_ICON_SMALL = "SDL_WINDOWS_INTRESOURCE_ICON_SMALL";

    public static final String SDL_HINT_WINDOWS_USE_D3D9EX = "SDL_WINDOWS_USE_D3D9EX";

    public static final String SDL_HINT_WINDOWS_ERASE_BACKGROUND_MODE = "SDL_WINDOWS_ERASE_BACKGROUND_MODE";

    public static final String SDL_HINT_X11_FORCE_OVERRIDE_REDIRECT = "SDL_X11_FORCE_OVERRIDE_REDIRECT";

    public static final String SDL_HINT_X11_WINDOW_TYPE = "SDL_X11_WINDOW_TYPE";

    public static final String SDL_HINT_X11_XCB_LIBRARY = "SDL_X11_XCB_LIBRARY";

    public static final String SDL_HINT_XINPUT_ENABLED = "SDL_XINPUT_ENABLED";

    public static final String SDL_HINT_ASSERT = "SDL_ASSERT";

    public static final int
        SDL_HINT_DEFAULT  = 0,
        SDL_HINT_NORMAL   = 1,
        SDL_HINT_OVERRIDE = 2;

    public static final int SDL_INIT_AUDIO = 0x00000010;

    public static final int SDL_INIT_VIDEO = 0x00000020;

    public static final int SDL_INIT_JOYSTICK = 0x00000200;

    public static final int SDL_INIT_HAPTIC = 0x00001000;

    public static final int SDL_INIT_GAMEPAD = 0x00002000;

    public static final int SDL_INIT_EVENTS = 0x00004000;

    public static final int SDL_INIT_SENSOR = 0x00008000;

    public static final int SDL_INIT_CAMERA = 0x00010000;

    public static final String SDL_PROP_APP_METADATA_NAME_STRING = "SDL.app.metadata.name";

    public static final String SDL_PROP_APP_METADATA_VERSION_STRING = "SDL.app.metadata.version";

    public static final String SDL_PROP_APP_METADATA_IDENTIFIER_STRING = "SDL.app.metadata.identifier";

    public static final String SDL_PROP_APP_METADATA_CREATOR_STRING = "SDL.app.metadata.creator";

    public static final String SDL_PROP_APP_METADATA_COPYRIGHT_STRING = "SDL.app.metadata.copyright";

    public static final String SDL_PROP_APP_METADATA_URL_STRING = "SDL.app.metadata.url";

    public static final String SDL_PROP_APP_METADATA_TYPE_STRING = "SDL.app.metadata.type";

    public static final int
        SDL_APP_CONTINUE = 0,
        SDL_APP_SUCCESS  = 1,
        SDL_APP_FAILURE  = 2;

    public static final String SDL_PROP_IOSTREAM_WINDOWS_HANDLE_POINTER = "SDL.iostream.windows.handle";

    public static final String SDL_PROP_IOSTREAM_STDIO_FILE_POINTER = "SDL.iostream.stdio.file";

    public static final String SDL_PROP_IOSTREAM_FILE_DESCRIPTOR_NUMBER = "SDL.iostream.file_descriptor";

    public static final String SDL_PROP_IOSTREAM_ANDROID_AASSET_POINTER = "SDL.iostream.android.aasset";

    public static final String SDL_PROP_IOSTREAM_MEMORY_POINTER = "SDL.iostream.memory.base";

    public static final String SDL_PROP_IOSTREAM_MEMORY_SIZE_NUMBER = "SDL.iostream.memory.size";

    public static final String SDL_PROP_IOSTREAM_DYNAMIC_MEMORY_POINTER = "SDL.iostream.dynamic.memory";

    public static final String SDL_PROP_IOSTREAM_DYNAMIC_CHUNKSIZE_NUMBER = "SDL.iostream.dynamic.chunksize";

    public static final int
        SDL_IO_STATUS_READY     = 0x0,
        SDL_IO_STATUS_ERROR     = 0x1,
        SDL_IO_STATUS_EOF       = 0x2,
        SDL_IO_STATUS_NOT_READY = 0x3,
        SDL_IO_STATUS_READONLY  = 0x4,
        SDL_IO_STATUS_WRITEONLY = 0x5;

    public static final int
        SDL_IO_SEEK_SET = 0x0,
        SDL_IO_SEEK_CUR = 0x1,
        SDL_IO_SEEK_END = 0x2;

    public static final int SDL_JOYSTICK_AXIS_MAX = 32767;

    public static final int SDL_JOYSTICK_AXIS_MIN = -32768;

    public static final String SDL_PROP_JOYSTICK_CAP_MONO_LED_BOOLEAN = "SDL.joystick.cap.mono_led";

    public static final String SDL_PROP_JOYSTICK_CAP_RGB_LED_BOOLEAN = "SDL.joystick.cap.rgb_led";

    public static final String SDL_PROP_JOYSTICK_CAP_PLAYER_LED_BOOLEAN = "SDL.joystick.cap.player_led";

    public static final String SDL_PROP_JOYSTICK_CAP_RUMBLE_BOOLEAN = "SDL.joystick.cap.rumble";

    public static final String SDL_PROP_JOYSTICK_CAP_TRIGGER_RUMBLE_BOOLEAN = "SDL.joystick.cap.trigger_rumble";

    public static final int SDL_HAT_CENTERED = 0x00;

    public static final int SDL_HAT_UP = 0x01;

    public static final int SDL_HAT_RIGHT = 0x02;

    public static final int SDL_HAT_DOWN = 0x04;

    public static final int SDL_HAT_LEFT = 0x08;

    public static final int SDL_HAT_RIGHTUP = (SDL_HAT_RIGHT|SDL_HAT_UP);

    public static final int SDL_HAT_RIGHTDOWN = (SDL_HAT_RIGHT|SDL_HAT_DOWN);

    public static final int SDL_HAT_LEFTUP = (SDL_HAT_LEFT|SDL_HAT_UP);

    public static final int SDL_HAT_LEFTDOWN = (SDL_HAT_LEFT|SDL_HAT_DOWN);

    public static final int
        SDL_JOYSTICK_TYPE_UNKNOWN      = 0,
        SDL_JOYSTICK_TYPE_GAMEPAD      = 1,
        SDL_JOYSTICK_TYPE_WHEEL        = 2,
        SDL_JOYSTICK_TYPE_ARCADE_STICK = 3,
        SDL_JOYSTICK_TYPE_FLIGHT_STICK = 4,
        SDL_JOYSTICK_TYPE_DANCE_PAD    = 5,
        SDL_JOYSTICK_TYPE_GUITAR       = 6,
        SDL_JOYSTICK_TYPE_DRUM_KIT     = 7,
        SDL_JOYSTICK_TYPE_ARCADE_PAD   = 8,
        SDL_JOYSTICK_TYPE_THROTTLE     = 9,
        SDL_JOYSTICK_TYPE_COUNT        = 10;

    public static final int
        SDL_JOYSTICK_CONNECTION_INVALID  = -1,
        SDL_JOYSTICK_CONNECTION_UNKNOWN  = 0,
        SDL_JOYSTICK_CONNECTION_WIRED    = 1,
        SDL_JOYSTICK_CONNECTION_WIRELESS = 2;

    public static final String
        SDL_PROP_GAMEPAD_CAP_MONO_LED_BOOLEAN       = SDL_PROP_JOYSTICK_CAP_MONO_LED_BOOLEAN,
        SDL_PROP_GAMEPAD_CAP_RGB_LED_BOOLEAN        = SDL_PROP_JOYSTICK_CAP_RGB_LED_BOOLEAN,
        SDL_PROP_GAMEPAD_CAP_PLAYER_LED_BOOLEAN     = SDL_PROP_JOYSTICK_CAP_PLAYER_LED_BOOLEAN,
        SDL_PROP_GAMEPAD_CAP_RUMBLE_BOOLEAN         = SDL_PROP_JOYSTICK_CAP_RUMBLE_BOOLEAN,
        SDL_PROP_GAMEPAD_CAP_TRIGGER_RUMBLE_BOOLEAN = SDL_PROP_JOYSTICK_CAP_TRIGGER_RUMBLE_BOOLEAN;

    public static final int
        SDL_GAMEPAD_TYPE_UNKNOWN                      = 0,
        SDL_GAMEPAD_TYPE_STANDARD                     = 1,
        SDL_GAMEPAD_TYPE_XBOX360                      = 2,
        SDL_GAMEPAD_TYPE_XBOXONE                      = 3,
        SDL_GAMEPAD_TYPE_PS3                          = 4,
        SDL_GAMEPAD_TYPE_PS4                          = 5,
        SDL_GAMEPAD_TYPE_PS5                          = 6,
        SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_PRO          = 7,
        SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_LEFT  = 8,
        SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT = 9,
        SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_PAIR  = 10,
        SDL_GAMEPAD_TYPE_COUNT                        = 11;

    public static final int
        SDL_GAMEPAD_BUTTON_INVALID        = -1,
        SDL_GAMEPAD_BUTTON_SOUTH          = 0,
        SDL_GAMEPAD_BUTTON_EAST           = 1,
        SDL_GAMEPAD_BUTTON_WEST           = 2,
        SDL_GAMEPAD_BUTTON_NORTH          = 3,
        SDL_GAMEPAD_BUTTON_BACK           = 4,
        SDL_GAMEPAD_BUTTON_GUIDE          = 5,
        SDL_GAMEPAD_BUTTON_START          = 6,
        SDL_GAMEPAD_BUTTON_LEFT_STICK     = 7,
        SDL_GAMEPAD_BUTTON_RIGHT_STICK    = 8,
        SDL_GAMEPAD_BUTTON_LEFT_SHOULDER  = 9,
        SDL_GAMEPAD_BUTTON_RIGHT_SHOULDER = 10,
        SDL_GAMEPAD_BUTTON_DPAD_UP        = 11,
        SDL_GAMEPAD_BUTTON_DPAD_DOWN      = 12,
        SDL_GAMEPAD_BUTTON_DPAD_LEFT      = 13,
        SDL_GAMEPAD_BUTTON_DPAD_RIGHT     = 14,
        SDL_GAMEPAD_BUTTON_MISC1          = 15,
        SDL_GAMEPAD_BUTTON_RIGHT_PADDLE1  = 16,
        SDL_GAMEPAD_BUTTON_LEFT_PADDLE1   = 17,
        SDL_GAMEPAD_BUTTON_RIGHT_PADDLE2  = 18,
        SDL_GAMEPAD_BUTTON_LEFT_PADDLE2   = 19,
        SDL_GAMEPAD_BUTTON_TOUCHPAD       = 20,
        SDL_GAMEPAD_BUTTON_MISC2          = 21,
        SDL_GAMEPAD_BUTTON_MISC3          = 22,
        SDL_GAMEPAD_BUTTON_MISC4          = 23,
        SDL_GAMEPAD_BUTTON_MISC5          = 24,
        SDL_GAMEPAD_BUTTON_MISC6          = 25,
        SDL_GAMEPAD_BUTTON_COUNT          = 26;

    public static final int
        SDL_GAMEPAD_BUTTON_LABEL_UNKNOWN  = 0,
        SDL_GAMEPAD_BUTTON_LABEL_A        = 1,
        SDL_GAMEPAD_BUTTON_LABEL_B        = 2,
        SDL_GAMEPAD_BUTTON_LABEL_X        = 3,
        SDL_GAMEPAD_BUTTON_LABEL_Y        = 4,
        SDL_GAMEPAD_BUTTON_LABEL_CROSS    = 5,
        SDL_GAMEPAD_BUTTON_LABEL_CIRCLE   = 6,
        SDL_GAMEPAD_BUTTON_LABEL_SQUARE   = 7,
        SDL_GAMEPAD_BUTTON_LABEL_TRIANGLE = 8;

    public static final int
        SDL_GAMEPAD_AXIS_INVALID       = -1,
        SDL_GAMEPAD_AXIS_LEFTX         = 0,
        SDL_GAMEPAD_AXIS_LEFTY         = 1,
        SDL_GAMEPAD_AXIS_RIGHTX        = 2,
        SDL_GAMEPAD_AXIS_RIGHTY        = 3,
        SDL_GAMEPAD_AXIS_LEFT_TRIGGER  = 4,
        SDL_GAMEPAD_AXIS_RIGHT_TRIGGER = 5,
        SDL_GAMEPAD_AXIS_COUNT         = 6;

    public static final int
        SDL_GAMEPAD_BINDTYPE_NONE   = 0,
        SDL_GAMEPAD_BINDTYPE_BUTTON = 1,
        SDL_GAMEPAD_BINDTYPE_AXIS   = 2,
        SDL_GAMEPAD_BINDTYPE_HAT    = 3;

    public static final String SDL_PROP_TEXTINPUT_TYPE_NUMBER = "SDL.textinput.type";

    public static final String SDL_PROP_TEXTINPUT_CAPITALIZATION_NUMBER = "SDL.textinput.capitalization";

    public static final String SDL_PROP_TEXTINPUT_AUTOCORRECT_BOOLEAN = "SDL.textinput.autocorrect";

    public static final String SDL_PROP_TEXTINPUT_MULTILINE_BOOLEAN = "SDL.textinput.multiline";

    public static final String SDL_PROP_TEXTINPUT_ANDROID_INPUTTYPE_NUMBER = "SDL.textinput.android.inputtype";

    public static final int
        SDL_TEXTINPUT_TYPE_TEXT                    = 0,
        SDL_TEXTINPUT_TYPE_TEXT_NAME               = 1,
        SDL_TEXTINPUT_TYPE_TEXT_EMAIL              = 2,
        SDL_TEXTINPUT_TYPE_TEXT_USERNAME           = 3,
        SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_HIDDEN    = 4,
        SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_VISIBLE   = 5,
        SDL_TEXTINPUT_TYPE_NUMBER                  = 6,
        SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_HIDDEN  = 7,
        SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_VISIBLE = 8;

    public static final int
        SDL_CAPITALIZE_NONE      = 0,
        SDL_CAPITALIZE_SENTENCES = 1,
        SDL_CAPITALIZE_WORDS     = 2,
        SDL_CAPITALIZE_LETTERS   = 3;

    public static final int SDLK_SCANCODE_MASK = 1 << 30;

    public static final int SDLK_UNKNOWN = 0x00000000;

    public static final int SDLK_RETURN = 0x0000000d;

    public static final int SDLK_ESCAPE = 0x0000001b;

    public static final int SDLK_BACKSPACE = 0x00000008;

    public static final int SDLK_TAB = 0x00000009;

    public static final int SDLK_SPACE = 0x00000020;

    public static final int SDLK_EXCLAIM = 0x00000021;

    public static final int SDLK_DBLAPOSTROPHE = 0x00000022;

    public static final int SDLK_HASH = 0x00000023;

    public static final int SDLK_DOLLAR = 0x00000024;

    public static final int SDLK_PERCENT = 0x00000025;

    public static final int SDLK_AMPERSAND = 0x00000026;

    public static final int SDLK_APOSTROPHE = 0x00000027;

    public static final int SDLK_LEFTPAREN = 0x00000028;

    public static final int SDLK_RIGHTPAREN = 0x00000029;

    public static final int SDLK_ASTERISK = 0x0000002a;

    public static final int SDLK_PLUS = 0x0000002b;

    public static final int SDLK_COMMA = 0x0000002c;

    public static final int SDLK_MINUS = 0x0000002d;

    public static final int SDLK_PERIOD = 0x0000002e;

    public static final int SDLK_SLASH = 0x0000002f;

    public static final int SDLK_0 = 0x00000030;

    public static final int SDLK_1 = 0x00000031;

    public static final int SDLK_2 = 0x00000032;

    public static final int SDLK_3 = 0x00000033;

    public static final int SDLK_4 = 0x00000034;

    public static final int SDLK_5 = 0x00000035;

    public static final int SDLK_6 = 0x00000036;

    public static final int SDLK_7 = 0x00000037;

    public static final int SDLK_8 = 0x00000038;

    public static final int SDLK_9 = 0x00000039;

    public static final int SDLK_COLON = 0x0000003a;

    public static final int SDLK_SEMICOLON = 0x0000003b;

    public static final int SDLK_LESS = 0x0000003c;

    public static final int SDLK_EQUALS = 0x0000003d;

    public static final int SDLK_GREATER = 0x0000003e;

    public static final int SDLK_QUESTION = 0x0000003f;

    public static final int SDLK_AT = 0x00000040;

    public static final int SDLK_LEFTBRACKET = 0x0000005b;

    public static final int SDLK_BACKSLASH = 0x0000005c;

    public static final int SDLK_RIGHTBRACKET = 0x0000005d;

    public static final int SDLK_CARET = 0x0000005e;

    public static final int SDLK_UNDERSCORE = 0x0000005f;

    public static final int SDLK_GRAVE = 0x00000060;

    public static final int SDLK_A = 0x00000061;

    public static final int SDLK_B = 0x00000062;

    public static final int SDLK_C = 0x00000063;

    public static final int SDLK_D = 0x00000064;

    public static final int SDLK_E = 0x00000065;

    public static final int SDLK_F = 0x00000066;

    public static final int SDLK_G = 0x00000067;

    public static final int SDLK_H = 0x00000068;

    public static final int SDLK_I = 0x00000069;

    public static final int SDLK_J = 0x0000006a;

    public static final int SDLK_K = 0x0000006b;

    public static final int SDLK_L = 0x0000006c;

    public static final int SDLK_M = 0x0000006d;

    public static final int SDLK_N = 0x0000006e;

    public static final int SDLK_O = 0x0000006f;

    public static final int SDLK_P = 0x00000070;

    public static final int SDLK_Q = 0x00000071;

    public static final int SDLK_R = 0x00000072;

    public static final int SDLK_S = 0x00000073;

    public static final int SDLK_T = 0x00000074;

    public static final int SDLK_U = 0x00000075;

    public static final int SDLK_V = 0x00000076;

    public static final int SDLK_W = 0x00000077;

    public static final int SDLK_X = 0x00000078;

    public static final int SDLK_Y = 0x00000079;

    public static final int SDLK_Z = 0x0000007a;

    public static final int SDLK_LEFTBRACE = 0x0000007b;

    public static final int SDLK_PIPE = 0x0000007c;

    public static final int SDLK_RIGHTBRACE = 0x0000007d;

    public static final int SDLK_TILDE = 0x0000007e;

    public static final int SDLK_DELETE = 0x0000007f;

    public static final int SDLK_PLUSMINUS = 0x000000b1;

    public static final int SDLK_CAPSLOCK = 0x40000039;

    public static final int SDLK_F1 = 0x4000003a;

    public static final int SDLK_F2 = 0x4000003b;

    public static final int SDLK_F3 = 0x4000003c;

    public static final int SDLK_F4 = 0x4000003d;

    public static final int SDLK_F5 = 0x4000003e;

    public static final int SDLK_F6 = 0x4000003f;

    public static final int SDLK_F7 = 0x40000040;

    public static final int SDLK_F8 = 0x40000041;

    public static final int SDLK_F9 = 0x40000042;

    public static final int SDLK_F10 = 0x40000043;

    public static final int SDLK_F11 = 0x40000044;

    public static final int SDLK_F12 = 0x40000045;

    public static final int SDLK_PRINTSCREEN = 0x40000046;

    public static final int SDLK_SCROLLLOCK = 0x40000047;

    public static final int SDLK_PAUSE = 0x40000048;

    public static final int SDLK_INSERT = 0x40000049;

    public static final int SDLK_HOME = 0x4000004a;

    public static final int SDLK_PAGEUP = 0x4000004b;

    public static final int SDLK_END = 0x4000004d;

    public static final int SDLK_PAGEDOWN = 0x4000004e;

    public static final int SDLK_RIGHT = 0x4000004f;

    public static final int SDLK_LEFT = 0x40000050;

    public static final int SDLK_DOWN = 0x40000051;

    public static final int SDLK_UP = 0x40000052;

    public static final int SDLK_NUMLOCKCLEAR = 0x40000053;

    public static final int SDLK_KP_DIVIDE = 0x40000054;

    public static final int SDLK_KP_MULTIPLY = 0x40000055;

    public static final int SDLK_KP_MINUS = 0x40000056;

    public static final int SDLK_KP_PLUS = 0x40000057;

    public static final int SDLK_KP_ENTER = 0x40000058;

    public static final int SDLK_KP_1 = 0x40000059;

    public static final int SDLK_KP_2 = 0x4000005a;

    public static final int SDLK_KP_3 = 0x4000005b;

    public static final int SDLK_KP_4 = 0x4000005c;

    public static final int SDLK_KP_5 = 0x4000005d;

    public static final int SDLK_KP_6 = 0x4000005e;

    public static final int SDLK_KP_7 = 0x4000005f;

    public static final int SDLK_KP_8 = 0x40000060;

    public static final int SDLK_KP_9 = 0x40000061;

    public static final int SDLK_KP_0 = 0x40000062;

    public static final int SDLK_KP_PERIOD = 0x40000063;

    public static final int SDLK_APPLICATION = 0x40000065;

    public static final int SDLK_POWER = 0x40000066;

    public static final int SDLK_KP_EQUALS = 0x40000067;

    public static final int SDLK_F13 = 0x40000068;

    public static final int SDLK_F14 = 0x40000069;

    public static final int SDLK_F15 = 0x4000006a;

    public static final int SDLK_F16 = 0x4000006b;

    public static final int SDLK_F17 = 0x4000006c;

    public static final int SDLK_F18 = 0x4000006d;

    public static final int SDLK_F19 = 0x4000006e;

    public static final int SDLK_F20 = 0x4000006f;

    public static final int SDLK_F21 = 0x40000070;

    public static final int SDLK_F22 = 0x40000071;

    public static final int SDLK_F23 = 0x40000072;

    public static final int SDLK_F24 = 0x40000073;

    public static final int SDLK_EXECUTE = 0x40000074;

    public static final int SDLK_HELP = 0x40000075;

    public static final int SDLK_MENU = 0x40000076;

    public static final int SDLK_SELECT = 0x40000077;

    public static final int SDLK_STOP = 0x40000078;

    public static final int SDLK_AGAIN = 0x40000079;

    public static final int SDLK_UNDO = 0x4000007a;

    public static final int SDLK_CUT = 0x4000007b;

    public static final int SDLK_COPY = 0x4000007c;

    public static final int SDLK_PASTE = 0x4000007d;

    public static final int SDLK_FIND = 0x4000007e;

    public static final int SDLK_MUTE = 0x4000007f;

    public static final int SDLK_VOLUMEUP = 0x40000080;

    public static final int SDLK_VOLUMEDOWN = 0x40000081;

    public static final int SDLK_KP_COMMA = 0x40000085;

    public static final int SDLK_KP_EQUALSAS400 = 0x40000086;

    public static final int SDLK_ALTERASE = 0x40000099;

    public static final int SDLK_SYSREQ = 0x4000009a;

    public static final int SDLK_CANCEL = 0x4000009b;

    public static final int SDLK_CLEAR = 0x4000009c;

    public static final int SDLK_PRIOR = 0x4000009d;

    public static final int SDLK_RETURN2 = 0x4000009e;

    public static final int SDLK_SEPARATOR = 0x4000009f;

    public static final int SDLK_OUT = 0x400000a0;

    public static final int SDLK_OPER = 0x400000a1;

    public static final int SDLK_CLEARAGAIN = 0x400000a2;

    public static final int SDLK_CRSEL = 0x400000a3;

    public static final int SDLK_EXSEL = 0x400000a4;

    public static final int SDLK_KP_00 = 0x400000b0;

    public static final int SDLK_KP_000 = 0x400000b1;

    public static final int SDLK_THOUSANDSSEPARATOR = 0x400000b2;

    public static final int SDLK_DECIMALSEPARATOR = 0x400000b3;

    public static final int SDLK_CURRENCYUNIT = 0x400000b4;

    public static final int SDLK_CURRENCYSUBUNIT = 0x400000b5;

    public static final int SDLK_KP_LEFTPAREN = 0x400000b6;

    public static final int SDLK_KP_RIGHTPAREN = 0x400000b7;

    public static final int SDLK_KP_LEFTBRACE = 0x400000b8;

    public static final int SDLK_KP_RIGHTBRACE = 0x400000b9;

    public static final int SDLK_KP_TAB = 0x400000ba;

    public static final int SDLK_KP_BACKSPACE = 0x400000bb;

    public static final int SDLK_KP_A = 0x400000bc;

    public static final int SDLK_KP_B = 0x400000bd;

    public static final int SDLK_KP_C = 0x400000be;

    public static final int SDLK_KP_D = 0x400000bf;

    public static final int SDLK_KP_E = 0x400000c0;

    public static final int SDLK_KP_F = 0x400000c1;

    public static final int SDLK_KP_XOR = 0x400000c2;

    public static final int SDLK_KP_POWER = 0x400000c3;

    public static final int SDLK_KP_PERCENT = 0x400000c4;

    public static final int SDLK_KP_LESS = 0x400000c5;

    public static final int SDLK_KP_GREATER = 0x400000c6;

    public static final int SDLK_KP_AMPERSAND = 0x400000c7;

    public static final int SDLK_KP_DBLAMPERSAND = 0x400000c8;

    public static final int SDLK_KP_VERTICALBAR = 0x400000c9;

    public static final int SDLK_KP_DBLVERTICALBAR = 0x400000ca;

    public static final int SDLK_KP_COLON = 0x400000cb;

    public static final int SDLK_KP_HASH = 0x400000cc;

    public static final int SDLK_KP_SPACE = 0x400000cd;

    public static final int SDLK_KP_AT = 0x400000ce;

    public static final int SDLK_KP_EXCLAM = 0x400000cf;

    public static final int SDLK_KP_MEMSTORE = 0x400000d0;

    public static final int SDLK_KP_MEMRECALL = 0x400000d1;

    public static final int SDLK_KP_MEMCLEAR = 0x400000d2;

    public static final int SDLK_KP_MEMADD = 0x400000d3;

    public static final int SDLK_KP_MEMSUBTRACT = 0x400000d4;

    public static final int SDLK_KP_MEMMULTIPLY = 0x400000d5;

    public static final int SDLK_KP_MEMDIVIDE = 0x400000d6;

    public static final int SDLK_KP_PLUSMINUS = 0x400000d7;

    public static final int SDLK_KP_CLEAR = 0x400000d8;

    public static final int SDLK_KP_CLEARENTRY = 0x400000d9;

    public static final int SDLK_KP_BINARY = 0x400000da;

    public static final int SDLK_KP_OCTAL = 0x400000db;

    public static final int SDLK_KP_DECIMAL = 0x400000dc;

    public static final int SDLK_KP_HEXADECIMAL = 0x400000dd;

    public static final int SDLK_LCTRL = 0x400000e0;

    public static final int SDLK_LSHIFT = 0x400000e1;

    public static final int SDLK_LALT = 0x400000e2;

    public static final int SDLK_LGUI = 0x400000e3;

    public static final int SDLK_RCTRL = 0x400000e4;

    public static final int SDLK_RSHIFT = 0x400000e5;

    public static final int SDLK_RALT = 0x400000e6;

    public static final int SDLK_RGUI = 0x400000e7;

    public static final int SDLK_MODE = 0x40000101;

    public static final int SDLK_SLEEP = 0x40000102;

    public static final int SDLK_WAKE = 0x40000103;

    public static final int SDLK_CHANNEL_INCREMENT = 0x40000104;

    public static final int SDLK_CHANNEL_DECREMENT = 0x40000105;

    public static final int SDLK_MEDIA_PLAY = 0x40000106;

    public static final int SDLK_MEDIA_PAUSE = 0x40000107;

    public static final int SDLK_MEDIA_RECORD = 0x40000108;

    public static final int SDLK_MEDIA_FAST_FORWARD = 0x40000109;

    public static final int SDLK_MEDIA_REWIND = 0x4000010a;

    public static final int SDLK_MEDIA_NEXT_TRACK = 0x4000010b;

    public static final int SDLK_MEDIA_PREVIOUS_TRACK = 0x4000010c;

    public static final int SDLK_MEDIA_STOP = 0x4000010d;

    public static final int SDLK_MEDIA_EJECT = 0x4000010e;

    public static final int SDLK_MEDIA_PLAY_PAUSE = 0x4000010f;

    public static final int SDLK_MEDIA_SELECT = 0x40000110;

    public static final int SDLK_AC_NEW = 0x40000111;

    public static final int SDLK_AC_OPEN = 0x40000112;

    public static final int SDLK_AC_CLOSE = 0x40000113;

    public static final int SDLK_AC_EXIT = 0x40000114;

    public static final int SDLK_AC_SAVE = 0x40000115;

    public static final int SDLK_AC_PRINT = 0x40000116;

    public static final int SDLK_AC_PROPERTIES = 0x40000117;

    public static final int SDLK_AC_SEARCH = 0x40000118;

    public static final int SDLK_AC_HOME = 0x40000119;

    public static final int SDLK_AC_BACK = 0x4000011a;

    public static final int SDLK_AC_FORWARD = 0x4000011b;

    public static final int SDLK_AC_STOP = 0x4000011c;

    public static final int SDLK_AC_REFRESH = 0x4000011d;

    public static final int SDLK_AC_BOOKMARKS = 0x4000011e;

    public static final int SDLK_SOFTLEFT = 0x4000011f;

    public static final int SDLK_SOFTRIGHT = 0x40000120;

    public static final int SDLK_CALL = 0x40000121;

    public static final int SDLK_ENDCALL = 0x40000122;

    public static final int SDL_KMOD_NONE = 0x0000;

    public static final int SDL_KMOD_LSHIFT = 0x0001;

    public static final int SDL_KMOD_RSHIFT = 0x0002;

    public static final int SDL_KMOD_LCTRL = 0x0040;

    public static final int SDL_KMOD_RCTRL = 0x0080;

    public static final int SDL_KMOD_LALT = 0x0100;

    public static final int SDL_KMOD_RALT = 0x0200;

    public static final int SDL_KMOD_LGUI = 0x0400;

    public static final int SDL_KMOD_RGUI = 0x0800;

    public static final int SDL_KMOD_NUM = 0x1000;

    public static final int SDL_KMOD_CAPS = 0x2000;

    public static final int SDL_KMOD_MODE = 0x4000;

    public static final int SDL_KMOD_SCROLL = 0x8000;

    public static final int SDL_KMOD_CTRL = (SDL_KMOD_LCTRL | SDL_KMOD_RCTRL);

    public static final int SDL_KMOD_SHIFT = (SDL_KMOD_LSHIFT | SDL_KMOD_RSHIFT);

    public static final int SDL_KMOD_ALT = (SDL_KMOD_LALT | SDL_KMOD_RALT);

    public static final int SDL_KMOD_GUI = (SDL_KMOD_LGUI | SDL_KMOD_RGUI);

    public static final int
        SDL_LOG_CATEGORY_APPLICATION = 0,
        SDL_LOG_CATEGORY_ERROR       = 1,
        SDL_LOG_CATEGORY_ASSERT      = 2,
        SDL_LOG_CATEGORY_SYSTEM      = 3,
        SDL_LOG_CATEGORY_AUDIO       = 4,
        SDL_LOG_CATEGORY_VIDEO       = 5,
        SDL_LOG_CATEGORY_RENDER      = 6,
        SDL_LOG_CATEGORY_INPUT       = 7,
        SDL_LOG_CATEGORY_TEST        = 8,
        SDL_LOG_CATEGORY_GPU         = 9,
        SDL_LOG_CATEGORY_RESERVED2   = 10,
        SDL_LOG_CATEGORY_RESERVED3   = 11,
        SDL_LOG_CATEGORY_RESERVED4   = 12,
        SDL_LOG_CATEGORY_RESERVED5   = 13,
        SDL_LOG_CATEGORY_RESERVED6   = 14,
        SDL_LOG_CATEGORY_RESERVED7   = 15,
        SDL_LOG_CATEGORY_RESERVED8   = 16,
        SDL_LOG_CATEGORY_RESERVED9   = 17,
        SDL_LOG_CATEGORY_RESERVED10  = 18,
        SDL_LOG_CATEGORY_CUSTOM      = 19;

    public static final int
        SDL_LOG_PRIORITY_INVALID  = 0,
        SDL_LOG_PRIORITY_TRACE    = 1,
        SDL_LOG_PRIORITY_VERBOSE  = 2,
        SDL_LOG_PRIORITY_DEBUG    = 3,
        SDL_LOG_PRIORITY_INFO     = 4,
        SDL_LOG_PRIORITY_WARN     = 5,
        SDL_LOG_PRIORITY_ERROR    = 6,
        SDL_LOG_PRIORITY_CRITICAL = 7,
        SDL_LOG_PRIORITY_COUNT    = 8;

    public static final int SDL_MESSAGEBOX_ERROR = 0x10;

    public static final int SDL_MESSAGEBOX_WARNING = 0x20;

    public static final int SDL_MESSAGEBOX_INFORMATION = 0x40;

    public static final int SDL_MESSAGEBOX_BUTTONS_LEFT_TO_RIGHT = 0x80;

    public static final int SDL_MESSAGEBOX_BUTTONS_RIGHT_TO_LEFT = 0x100;

    public static final int SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT = 0x1;

    public static final int SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT = 0x2;

    public static final int
        SDL_MESSAGEBOX_COLOR_BACKGROUND        = 0x0,
        SDL_MESSAGEBOX_COLOR_TEXT              = 0x1,
        SDL_MESSAGEBOX_COLOR_BUTTON_BORDER     = 0x2,
        SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND = 0x3,
        SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED   = 0x4,
        SDL_MESSAGEBOX_COLOR_COUNT             = 0x5;

    public static final int SDL_BUTTON_LEFT = 1;

    public static final int SDL_BUTTON_MIDDLE = 2;

    public static final int SDL_BUTTON_RIGHT = 3;

    public static final int SDL_BUTTON_X1 = 4;

    public static final int SDL_BUTTON_X2 = 5;

    public static final int
        SDL_SYSTEM_CURSOR_DEFAULT     = 0,
        SDL_SYSTEM_CURSOR_TEXT        = 1,
        SDL_SYSTEM_CURSOR_WAIT        = 2,
        SDL_SYSTEM_CURSOR_CROSSHAIR   = 3,
        SDL_SYSTEM_CURSOR_PROGRESS    = 4,
        SDL_SYSTEM_CURSOR_NWSE_RESIZE = 5,
        SDL_SYSTEM_CURSOR_NESW_RESIZE = 6,
        SDL_SYSTEM_CURSOR_EW_RESIZE   = 7,
        SDL_SYSTEM_CURSOR_NS_RESIZE   = 8,
        SDL_SYSTEM_CURSOR_MOVE        = 9,
        SDL_SYSTEM_CURSOR_NOT_ALLOWED = 10,
        SDL_SYSTEM_CURSOR_POINTER     = 11,
        SDL_SYSTEM_CURSOR_NW_RESIZE   = 12,
        SDL_SYSTEM_CURSOR_N_RESIZE    = 13,
        SDL_SYSTEM_CURSOR_NE_RESIZE   = 14,
        SDL_SYSTEM_CURSOR_E_RESIZE    = 15,
        SDL_SYSTEM_CURSOR_SE_RESIZE   = 16,
        SDL_SYSTEM_CURSOR_S_RESIZE    = 17,
        SDL_SYSTEM_CURSOR_SW_RESIZE   = 18,
        SDL_SYSTEM_CURSOR_W_RESIZE    = 19,
        SDL_SYSTEM_CURSOR_COUNT       = 20;

    public static final int
        SDL_MOUSEWHEEL_NORMAL  = 0,
        SDL_MOUSEWHEEL_FLIPPED = 1;

    public static final int SDL_PEN_INPUT_DOWN = (1 << 0);

    public static final int SDL_PEN_INPUT_BUTTON_1 = (1 << 1);

    public static final int SDL_PEN_INPUT_BUTTON_2 = (1 << 2);

    public static final int SDL_PEN_INPUT_BUTTON_3 = (1 << 3);

    public static final int SDL_PEN_INPUT_BUTTON_4 = (1 << 4);

    public static final int SDL_PEN_INPUT_BUTTON_5 = (1 << 5);

    public static final int SDL_PEN_INPUT_ERASER_TIP = (1 << 30);

    public static final int
        SDL_PEN_AXIS_PRESSURE            = 0,
        SDL_PEN_AXIS_XTILT               = 1,
        SDL_PEN_AXIS_YTILT               = 2,
        SDL_PEN_AXIS_DISTANCE            = 3,
        SDL_PEN_AXIS_ROTATION            = 4,
        SDL_PEN_AXIS_SLIDER              = 5,
        SDL_PEN_AXIS_TANGENTIAL_PRESSURE = 6,
        SDL_PEN_AXIS_COUNT               = 7;

    public static final int SDL_ALPHA_OPAQUE = 255;

    public static final float SDL_ALPHA_OPAQUE_FLOAT = 1.0f;

    public static final int SDL_ALPHA_TRANSPARENT = 0;

    public static final float SDL_ALPHA_TRANSPARENT_FLOAT = 0.0f;

    public static final int
        SDL_PIXELTYPE_UNKNOWN  = 0,
        SDL_PIXELTYPE_INDEX1   = 1,
        SDL_PIXELTYPE_INDEX4   = 2,
        SDL_PIXELTYPE_INDEX8   = 3,
        SDL_PIXELTYPE_PACKED8  = 4,
        SDL_PIXELTYPE_PACKED16 = 5,
        SDL_PIXELTYPE_PACKED32 = 6,
        SDL_PIXELTYPE_ARRAYU8  = 7,
        SDL_PIXELTYPE_ARRAYU16 = 8,
        SDL_PIXELTYPE_ARRAYU32 = 9,
        SDL_PIXELTYPE_ARRAYF16 = 10,
        SDL_PIXELTYPE_ARRAYF32 = 11,
        SDL_PIXELTYPE_INDEX2   = 12;

    public static final int
        SDL_BITMAPORDER_NONE = 0,
        SDL_BITMAPORDER_4321 = 1,
        SDL_BITMAPORDER_1234 = 2;

    public static final int
        SDL_PACKEDORDER_NONE = 0,
        SDL_PACKEDORDER_XRGB = 1,
        SDL_PACKEDORDER_RGBX = 2,
        SDL_PACKEDORDER_ARGB = 3,
        SDL_PACKEDORDER_RGBA = 4,
        SDL_PACKEDORDER_XBGR = 5,
        SDL_PACKEDORDER_BGRX = 6,
        SDL_PACKEDORDER_ABGR = 7,
        SDL_PACKEDORDER_BGRA = 8;

    public static final int
        SDL_ARRAYORDER_NONE = 0,
        SDL_ARRAYORDER_RGB  = 1,
        SDL_ARRAYORDER_RGBA = 2,
        SDL_ARRAYORDER_ARGB = 3,
        SDL_ARRAYORDER_BGR  = 4,
        SDL_ARRAYORDER_BGRA = 5,
        SDL_ARRAYORDER_ABGR = 6;

    public static final int
        SDL_PACKEDLAYOUT_NONE    = 0,
        SDL_PACKEDLAYOUT_332     = 1,
        SDL_PACKEDLAYOUT_4444    = 2,
        SDL_PACKEDLAYOUT_1555    = 3,
        SDL_PACKEDLAYOUT_5551    = 4,
        SDL_PACKEDLAYOUT_565     = 5,
        SDL_PACKEDLAYOUT_8888    = 6,
        SDL_PACKEDLAYOUT_2101010 = 7,
        SDL_PACKEDLAYOUT_1010102 = 8;

    public static final int
        SDL_PIXELFORMAT_UNKNOWN       = 0,
        SDL_PIXELFORMAT_INDEX1LSB     = 0x11100100,
        SDL_PIXELFORMAT_INDEX1MSB     = 0x11200100,
        SDL_PIXELFORMAT_INDEX2LSB     = 0x1c100200,
        SDL_PIXELFORMAT_INDEX2MSB     = 0x1c200200,
        SDL_PIXELFORMAT_INDEX4LSB     = 0x12100400,
        SDL_PIXELFORMAT_INDEX4MSB     = 0x12200400,
        SDL_PIXELFORMAT_INDEX8        = 0x13000801,
        SDL_PIXELFORMAT_RGB332        = 0x14110801,
        SDL_PIXELFORMAT_XRGB4444      = 0x15120c02,
        SDL_PIXELFORMAT_XBGR4444      = 0x15520c02,
        SDL_PIXELFORMAT_XRGB1555      = 0x15130f02,
        SDL_PIXELFORMAT_XBGR1555      = 0x15530f02,
        SDL_PIXELFORMAT_ARGB4444      = 0x15321002,
        SDL_PIXELFORMAT_RGBA4444      = 0x15421002,
        SDL_PIXELFORMAT_ABGR4444      = 0x15721002,
        SDL_PIXELFORMAT_BGRA4444      = 0x15821002,
        SDL_PIXELFORMAT_ARGB1555      = 0x15331002,
        SDL_PIXELFORMAT_RGBA5551      = 0x15441002,
        SDL_PIXELFORMAT_ABGR1555      = 0x15731002,
        SDL_PIXELFORMAT_BGRA5551      = 0x15841002,
        SDL_PIXELFORMAT_RGB565        = 0x15151002,
        SDL_PIXELFORMAT_BGR565        = 0x15551002,
        SDL_PIXELFORMAT_RGB24         = 0x17101803,
        SDL_PIXELFORMAT_BGR24         = 0x17401803,
        SDL_PIXELFORMAT_XRGB8888      = 0x16161804,
        SDL_PIXELFORMAT_RGBX8888      = 0x16261804,
        SDL_PIXELFORMAT_XBGR8888      = 0x16561804,
        SDL_PIXELFORMAT_BGRX8888      = 0x16661804,
        SDL_PIXELFORMAT_ARGB8888      = 0x16362004,
        SDL_PIXELFORMAT_RGBA8888      = 0x16462004,
        SDL_PIXELFORMAT_ABGR8888      = 0x16762004,
        SDL_PIXELFORMAT_BGRA8888      = 0x16862004,
        SDL_PIXELFORMAT_XRGB2101010   = 0x16172004,
        SDL_PIXELFORMAT_XBGR2101010   = 0x16572004,
        SDL_PIXELFORMAT_ARGB2101010   = 0x16372004,
        SDL_PIXELFORMAT_ABGR2101010   = 0x16772004,
        SDL_PIXELFORMAT_RGB48         = 0x18103006,
        SDL_PIXELFORMAT_BGR48         = 0x18403006,
        SDL_PIXELFORMAT_RGBA64        = 0x18204008,
        SDL_PIXELFORMAT_ARGB64        = 0x18304008,
        SDL_PIXELFORMAT_BGRA64        = 0x18504008,
        SDL_PIXELFORMAT_ABGR64        = 0x18604008,
        SDL_PIXELFORMAT_RGB48_FLOAT   = 0x1a103006,
        SDL_PIXELFORMAT_BGR48_FLOAT   = 0x1a403006,
        SDL_PIXELFORMAT_RGBA64_FLOAT  = 0x1a204008,
        SDL_PIXELFORMAT_ARGB64_FLOAT  = 0x1a304008,
        SDL_PIXELFORMAT_BGRA64_FLOAT  = 0x1a504008,
        SDL_PIXELFORMAT_ABGR64_FLOAT  = 0x1a604008,
        SDL_PIXELFORMAT_RGB96_FLOAT   = 0x1b10600c,
        SDL_PIXELFORMAT_BGR96_FLOAT   = 0x1b40600c,
        SDL_PIXELFORMAT_RGBA128_FLOAT = 0x1b208010,
        SDL_PIXELFORMAT_ARGB128_FLOAT = 0x1b308010,
        SDL_PIXELFORMAT_BGRA128_FLOAT = 0x1b508010,
        SDL_PIXELFORMAT_ABGR128_FLOAT = 0x1b608010,
        SDL_PIXELFORMAT_YV12          = 0x32315659,
        SDL_PIXELFORMAT_IYUV          = 0x56555949,
        SDL_PIXELFORMAT_YUY2          = 0x32595559,
        SDL_PIXELFORMAT_UYVY          = 0x59565955,
        SDL_PIXELFORMAT_YVYU          = 0x55595659,
        SDL_PIXELFORMAT_NV12          = 0x3231564e,
        SDL_PIXELFORMAT_NV21          = 0x3132564e,
        SDL_PIXELFORMAT_P010          = 0x30313050,
        SDL_PIXELFORMAT_EXTERNAL_OES  = 0x2053454f,
        SDL_PIXELFORMAT_RGBA32        = SDL_PIXELFORMAT_ABGR8888,
        SDL_PIXELFORMAT_ARGB32        = SDL_PIXELFORMAT_BGRA8888,
        SDL_PIXELFORMAT_BGRA32        = SDL_PIXELFORMAT_ARGB8888,
        SDL_PIXELFORMAT_ABGR32        = SDL_PIXELFORMAT_RGBA8888,
        SDL_PIXELFORMAT_RGBX32        = SDL_PIXELFORMAT_XBGR8888,
        SDL_PIXELFORMAT_XRGB32        = SDL_PIXELFORMAT_BGRX8888,
        SDL_PIXELFORMAT_BGRX32        = SDL_PIXELFORMAT_XRGB8888,
        SDL_PIXELFORMAT_XBGR32        = SDL_PIXELFORMAT_RGBX8888;

    public static final int
        SDL_COLOR_TYPE_UNKNOWN = 0,
        SDL_COLOR_TYPE_RGB     = 1,
        SDL_COLOR_TYPE_YCBCR   = 2;

    public static final int
        SDL_COLOR_RANGE_UNKNOWN = 0,
        SDL_COLOR_RANGE_LIMITED = 1,
        SDL_COLOR_RANGE_FULL    = 2;

    public static final int
        SDL_COLOR_PRIMARIES_UNKNOWN      = 0,
        SDL_COLOR_PRIMARIES_BT709        = 1,
        SDL_COLOR_PRIMARIES_UNSPECIFIED  = 2,
        SDL_COLOR_PRIMARIES_BT470M       = 4,
        SDL_COLOR_PRIMARIES_BT470BG      = 5,
        SDL_COLOR_PRIMARIES_BT601        = 6,
        SDL_COLOR_PRIMARIES_SMPTE240     = 7,
        SDL_COLOR_PRIMARIES_GENERIC_FILM = 8,
        SDL_COLOR_PRIMARIES_BT2020       = 9,
        SDL_COLOR_PRIMARIES_XYZ          = 10,
        SDL_COLOR_PRIMARIES_SMPTE431     = 11,
        SDL_COLOR_PRIMARIES_SMPTE432     = 12,
        SDL_COLOR_PRIMARIES_EBU3213      = 22,
        SDL_COLOR_PRIMARIES_CUSTOM       = 31;

    public static final int
        SDL_TRANSFER_CHARACTERISTICS_UNKNOWN       = 0,
        SDL_TRANSFER_CHARACTERISTICS_BT709         = 1,
        SDL_TRANSFER_CHARACTERISTICS_UNSPECIFIED   = 2,
        SDL_TRANSFER_CHARACTERISTICS_GAMMA22       = 4,
        SDL_TRANSFER_CHARACTERISTICS_GAMMA28       = 5,
        SDL_TRANSFER_CHARACTERISTICS_BT601         = 6,
        SDL_TRANSFER_CHARACTERISTICS_SMPTE240      = 7,
        SDL_TRANSFER_CHARACTERISTICS_LINEAR        = 8,
        SDL_TRANSFER_CHARACTERISTICS_LOG100        = 9,
        SDL_TRANSFER_CHARACTERISTICS_LOG100_SQRT10 = 10,
        SDL_TRANSFER_CHARACTERISTICS_IEC61966      = 11,
        SDL_TRANSFER_CHARACTERISTICS_BT1361        = 12,
        SDL_TRANSFER_CHARACTERISTICS_SRGB          = 13,
        SDL_TRANSFER_CHARACTERISTICS_BT2020_10BIT  = 14,
        SDL_TRANSFER_CHARACTERISTICS_BT2020_12BIT  = 15,
        SDL_TRANSFER_CHARACTERISTICS_PQ            = 16,
        SDL_TRANSFER_CHARACTERISTICS_SMPTE428      = 17,
        SDL_TRANSFER_CHARACTERISTICS_HLG           = 18,
        SDL_TRANSFER_CHARACTERISTICS_CUSTOM        = 31;

    public static final int
        SDL_MATRIX_COEFFICIENTS_IDENTITY           = 0,
        SDL_MATRIX_COEFFICIENTS_BT709              = 1,
        SDL_MATRIX_COEFFICIENTS_UNSPECIFIED        = 2,
        SDL_MATRIX_COEFFICIENTS_FCC                = 4,
        SDL_MATRIX_COEFFICIENTS_BT470BG            = 5,
        SDL_MATRIX_COEFFICIENTS_BT601              = 6,
        SDL_MATRIX_COEFFICIENTS_SMPTE240           = 7,
        SDL_MATRIX_COEFFICIENTS_YCGCO              = 8,
        SDL_MATRIX_COEFFICIENTS_BT2020_NCL         = 9,
        SDL_MATRIX_COEFFICIENTS_BT2020_CL          = 10,
        SDL_MATRIX_COEFFICIENTS_SMPTE2085          = 11,
        SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_NCL = 12,
        SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_CL  = 13,
        SDL_MATRIX_COEFFICIENTS_ICTCP              = 14,
        SDL_MATRIX_COEFFICIENTS_CUSTOM             = 31;

    public static final int
        SDL_CHROMA_LOCATION_NONE    = 0,
        SDL_CHROMA_LOCATION_LEFT    = 1,
        SDL_CHROMA_LOCATION_CENTER  = 2,
        SDL_CHROMA_LOCATION_TOPLEFT = 3;

    public static final int
        SDL_COLORSPACE_UNKNOWN        = 0,
        SDL_COLORSPACE_SRGB           = 0x120005a0,
        SDL_COLORSPACE_SRGB_LINEAR    = 0x12000500,
        SDL_COLORSPACE_HDR10          = 0x12002600,
        SDL_COLORSPACE_JPEG           = 0x220004c6,
        SDL_COLORSPACE_BT601_LIMITED  = 0x211018c6,
        SDL_COLORSPACE_BT601_FULL     = 0x221018c6,
        SDL_COLORSPACE_BT709_LIMITED  = 0x21100421,
        SDL_COLORSPACE_BT709_FULL     = 0x22100421,
        SDL_COLORSPACE_BT2020_LIMITED = 0x21102609,
        SDL_COLORSPACE_BT2020_FULL    = 0x22102609,
        SDL_COLORSPACE_RGB_DEFAULT    = SDL_COLORSPACE_SRGB,
        SDL_COLORSPACE_YUV_DEFAULT    = SDL_COLORSPACE_JPEG;

    public static final int
        SDL_POWERSTATE_ERROR      = -1,
        SDL_POWERSTATE_UNKNOWN    = 0,
        SDL_POWERSTATE_ON_BATTERY = 1,
        SDL_POWERSTATE_NO_BATTERY = 2,
        SDL_POWERSTATE_CHARGING   = 3,
        SDL_POWERSTATE_CHARGED    = 4;

    public static final int
        SDL_PROPERTY_TYPE_INVALID = 0x0,
        SDL_PROPERTY_TYPE_POINTER = 0x1,
        SDL_PROPERTY_TYPE_STRING  = 0x2,
        SDL_PROPERTY_TYPE_NUMBER  = 0x3,
        SDL_PROPERTY_TYPE_FLOAT   = 0x4,
        SDL_PROPERTY_TYPE_BOOLEAN = 0x5;

    public static final String SDL_SOFTWARE_RENDERER = "software";

    public static final String SDL_PROP_RENDERER_CREATE_NAME_STRING = "SDL.renderer.create.name";

    public static final String SDL_PROP_RENDERER_CREATE_WINDOW_POINTER = "SDL.renderer.create.window";

    public static final String SDL_PROP_RENDERER_CREATE_SURFACE_POINTER = "SDL.renderer.create.surface";

    public static final String SDL_PROP_RENDERER_CREATE_OUTPUT_COLORSPACE_NUMBER = "SDL.renderer.create.output_colorspace";

    public static final String SDL_PROP_RENDERER_CREATE_PRESENT_VSYNC_NUMBER = "SDL.renderer.create.present_vsync";

    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_INSTANCE_POINTER = "SDL.renderer.create.vulkan.instance";

    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_SURFACE_NUMBER = "SDL.renderer.create.vulkan.surface";

    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_PHYSICAL_DEVICE_POINTER = "SDL.renderer.create.vulkan.physical_device";

    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_DEVICE_POINTER = "SDL.renderer.create.vulkan.device";

    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER = "SDL.renderer.create.vulkan.graphics_queue_family_index";

    public static final String SDL_PROP_RENDERER_CREATE_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER = "SDL.renderer.create.vulkan.present_queue_family_index";

    public static final String SDL_PROP_RENDERER_NAME_STRING = "SDL.renderer.name";

    public static final String SDL_PROP_RENDERER_WINDOW_POINTER = "SDL.renderer.window";

    public static final String SDL_PROP_RENDERER_SURFACE_POINTER = "SDL.renderer.surface";

    public static final String SDL_PROP_RENDERER_VSYNC_NUMBER = "SDL.renderer.vsync";

    public static final String SDL_PROP_RENDERER_MAX_TEXTURE_SIZE_NUMBER = "SDL.renderer.max_texture_size";

    public static final String SDL_PROP_RENDERER_TEXTURE_FORMATS_POINTER = "SDL.renderer.texture_formats";

    public static final String SDL_PROP_RENDERER_OUTPUT_COLORSPACE_NUMBER = "SDL.renderer.output_colorspace";

    public static final String SDL_PROP_RENDERER_HDR_ENABLED_BOOLEAN = "SDL.renderer.HDR_enabled";

    public static final String SDL_PROP_RENDERER_SDR_WHITE_POINT_FLOAT = "SDL.renderer.SDR_white_point";

    public static final String SDL_PROP_RENDERER_HDR_HEADROOM_FLOAT = "SDL.renderer.HDR_headroom";

    public static final String SDL_PROP_RENDERER_D3D9_DEVICE_POINTER = "SDL.renderer.d3d9.device";

    public static final String SDL_PROP_RENDERER_D3D11_DEVICE_POINTER = "SDL.renderer.d3d11.device";

    public static final String SDL_PROP_RENDERER_D3D11_SWAPCHAIN_POINTER = "SDL.renderer.d3d11.swap_chain";

    public static final String SDL_PROP_RENDERER_D3D12_DEVICE_POINTER = "SDL.renderer.d3d12.device";

    public static final String SDL_PROP_RENDERER_D3D12_SWAPCHAIN_POINTER = "SDL.renderer.d3d12.swap_chain";

    public static final String SDL_PROP_RENDERER_D3D12_COMMAND_QUEUE_POINTER = "SDL.renderer.d3d12.command_queue";

    public static final String SDL_PROP_RENDERER_VULKAN_INSTANCE_POINTER = "SDL.renderer.vulkan.instance";

    public static final String SDL_PROP_RENDERER_VULKAN_SURFACE_NUMBER = "SDL.renderer.vulkan.surface";

    public static final String SDL_PROP_RENDERER_VULKAN_PHYSICAL_DEVICE_POINTER = "SDL.renderer.vulkan.physical_device";

    public static final String SDL_PROP_RENDERER_VULKAN_DEVICE_POINTER = "SDL.renderer.vulkan.device";

    public static final String SDL_PROP_RENDERER_VULKAN_GRAPHICS_QUEUE_FAMILY_INDEX_NUMBER = "SDL.renderer.vulkan.graphics_queue_family_index";

    public static final String SDL_PROP_RENDERER_VULKAN_PRESENT_QUEUE_FAMILY_INDEX_NUMBER = "SDL.renderer.vulkan.present_queue_family_index";

    public static final String SDL_PROP_RENDERER_VULKAN_SWAPCHAIN_IMAGE_COUNT_NUMBER = "SDL.renderer.vulkan.swapchain_image_count";

    public static final String SDL_PROP_RENDERER_GPU_DEVICE_POINTER = "SDL.renderer.gpu.device";

    public static final String SDL_PROP_TEXTURE_CREATE_COLORSPACE_NUMBER = "SDL.texture.create.colorspace";

    public static final String SDL_PROP_TEXTURE_CREATE_FORMAT_NUMBER = "SDL.texture.create.format";

    public static final String SDL_PROP_TEXTURE_CREATE_ACCESS_NUMBER = "SDL.texture.create.access";

    public static final String SDL_PROP_TEXTURE_CREATE_WIDTH_NUMBER = "SDL.texture.create.width";

    public static final String SDL_PROP_TEXTURE_CREATE_HEIGHT_NUMBER = "SDL.texture.create.height";

    public static final String SDL_PROP_TEXTURE_CREATE_SDR_WHITE_POINT_FLOAT = "SDL.texture.create.SDR_white_point";

    public static final String SDL_PROP_TEXTURE_CREATE_HDR_HEADROOM_FLOAT = "SDL.texture.create.HDR_headroom";

    public static final String SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_POINTER = "SDL.texture.create.d3d11.texture";

    public static final String SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_U_POINTER = "SDL.texture.create.d3d11.texture_u";

    public static final String SDL_PROP_TEXTURE_CREATE_D3D11_TEXTURE_V_POINTER = "SDL.texture.create.d3d11.texture_v";

    public static final String SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_POINTER = "SDL.texture.create.d3d12.texture";

    public static final String SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_U_POINTER = "SDL.texture.create.d3d12.texture_u";

    public static final String SDL_PROP_TEXTURE_CREATE_D3D12_TEXTURE_V_POINTER = "SDL.texture.create.d3d12.texture_v";

    public static final String SDL_PROP_TEXTURE_CREATE_METAL_PIXELBUFFER_POINTER = "SDL.texture.create.metal.pixelbuffer";

    public static final String SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_NUMBER = "SDL.texture.create.opengl.texture";

    public static final String SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_UV_NUMBER = "SDL.texture.create.opengl.texture_uv";

    public static final String SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_U_NUMBER = "SDL.texture.create.opengl.texture_u";

    public static final String SDL_PROP_TEXTURE_CREATE_OPENGL_TEXTURE_V_NUMBER = "SDL.texture.create.opengl.texture_v";

    public static final String SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_NUMBER = "SDL.texture.create.opengles2.texture";

    public static final String SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_UV_NUMBER = "SDL.texture.create.opengles2.texture_uv";

    public static final String SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_U_NUMBER = "SDL.texture.create.opengles2.texture_u";

    public static final String SDL_PROP_TEXTURE_CREATE_OPENGLES2_TEXTURE_V_NUMBER = "SDL.texture.create.opengles2.texture_v";

    public static final String SDL_PROP_TEXTURE_CREATE_VULKAN_TEXTURE_NUMBER = "SDL.texture.create.vulkan.texture";

    public static final String SDL_PROP_TEXTURE_COLORSPACE_NUMBER = "SDL.texture.colorspace";

    public static final String SDL_PROP_TEXTURE_FORMAT_NUMBER = "SDL.texture.format";

    public static final String SDL_PROP_TEXTURE_ACCESS_NUMBER = "SDL.texture.access";

    public static final String SDL_PROP_TEXTURE_WIDTH_NUMBER = "SDL.texture.width";

    public static final String SDL_PROP_TEXTURE_HEIGHT_NUMBER = "SDL.texture.height";

    public static final String SDL_PROP_TEXTURE_SDR_WHITE_POINT_FLOAT = "SDL.texture.SDR_white_point";

    public static final String SDL_PROP_TEXTURE_HDR_HEADROOM_FLOAT = "SDL.texture.HDR_headroom";

    public static final String SDL_PROP_TEXTURE_D3D11_TEXTURE_POINTER = "SDL.texture.d3d11.texture";

    public static final String SDL_PROP_TEXTURE_D3D11_TEXTURE_U_POINTER = "SDL.texture.d3d11.texture_u";

    public static final String SDL_PROP_TEXTURE_D3D11_TEXTURE_V_POINTER = "SDL.texture.d3d11.texture_v";

    public static final String SDL_PROP_TEXTURE_D3D12_TEXTURE_POINTER = "SDL.texture.d3d12.texture";

    public static final String SDL_PROP_TEXTURE_D3D12_TEXTURE_U_POINTER = "SDL.texture.d3d12.texture_u";

    public static final String SDL_PROP_TEXTURE_D3D12_TEXTURE_V_POINTER = "SDL.texture.d3d12.texture_v";

    public static final String SDL_PROP_TEXTURE_OPENGL_TEXTURE_NUMBER = "SDL.texture.opengl.texture";

    public static final String SDL_PROP_TEXTURE_OPENGL_TEXTURE_UV_NUMBER = "SDL.texture.opengl.texture_uv";

    public static final String SDL_PROP_TEXTURE_OPENGL_TEXTURE_U_NUMBER = "SDL.texture.opengl.texture_u";

    public static final String SDL_PROP_TEXTURE_OPENGL_TEXTURE_V_NUMBER = "SDL.texture.opengl.texture_v";

    public static final String SDL_PROP_TEXTURE_OPENGL_TEXTURE_TARGET_NUMBER = "SDL.texture.opengl.target";

    public static final String SDL_PROP_TEXTURE_OPENGL_TEX_W_FLOAT = "SDL.texture.opengl.tex_w";

    public static final String SDL_PROP_TEXTURE_OPENGL_TEX_H_FLOAT = "SDL.texture.opengl.tex_h";

    public static final String SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_NUMBER = "SDL.texture.opengles2.texture";

    public static final String SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_UV_NUMBER = "SDL.texture.opengles2.texture_uv";

    public static final String SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_U_NUMBER = "SDL.texture.opengles2.texture_u";

    public static final String SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_V_NUMBER = "SDL.texture.opengles2.texture_v";

    public static final String SDL_PROP_TEXTURE_OPENGLES2_TEXTURE_TARGET_NUMBER = "SDL.texture.opengles2.target";

    public static final String SDL_PROP_TEXTURE_VULKAN_TEXTURE_NUMBER = "SDL.texture.vulkan.texture";

    public static final int SDL_RENDERER_VSYNC_DISABLED = 0;

    public static final int SDL_RENDERER_VSYNC_ADAPTIVE = -1;

    public static final int SDL_DEBUG_TEXT_FONT_CHARACTER_SIZE = 8;

    public static final int
        SDL_TEXTUREACCESS_STATIC    = 0,
        SDL_TEXTUREACCESS_STREAMING = 1,
        SDL_TEXTUREACCESS_TARGET    = 2;

    public static final int
        SDL_LOGICAL_PRESENTATION_DISABLED      = 0,
        SDL_LOGICAL_PRESENTATION_STRETCH       = 1,
        SDL_LOGICAL_PRESENTATION_LETTERBOX     = 2,
        SDL_LOGICAL_PRESENTATION_OVERSCAN      = 3,
        SDL_LOGICAL_PRESENTATION_INTEGER_SCALE = 4;

    public static final int
        SDL_SCANCODE_UNKNOWN              = 0,
        SDL_SCANCODE_A                    = 4,
        SDL_SCANCODE_B                    = 5,
        SDL_SCANCODE_C                    = 6,
        SDL_SCANCODE_D                    = 7,
        SDL_SCANCODE_E                    = 8,
        SDL_SCANCODE_F                    = 9,
        SDL_SCANCODE_G                    = 10,
        SDL_SCANCODE_H                    = 11,
        SDL_SCANCODE_I                    = 12,
        SDL_SCANCODE_J                    = 13,
        SDL_SCANCODE_K                    = 14,
        SDL_SCANCODE_L                    = 15,
        SDL_SCANCODE_M                    = 16,
        SDL_SCANCODE_N                    = 17,
        SDL_SCANCODE_O                    = 18,
        SDL_SCANCODE_P                    = 19,
        SDL_SCANCODE_Q                    = 20,
        SDL_SCANCODE_R                    = 21,
        SDL_SCANCODE_S                    = 22,
        SDL_SCANCODE_T                    = 23,
        SDL_SCANCODE_U                    = 24,
        SDL_SCANCODE_V                    = 25,
        SDL_SCANCODE_W                    = 26,
        SDL_SCANCODE_X                    = 27,
        SDL_SCANCODE_Y                    = 28,
        SDL_SCANCODE_Z                    = 29,
        SDL_SCANCODE_1                    = 30,
        SDL_SCANCODE_2                    = 31,
        SDL_SCANCODE_3                    = 32,
        SDL_SCANCODE_4                    = 33,
        SDL_SCANCODE_5                    = 34,
        SDL_SCANCODE_6                    = 35,
        SDL_SCANCODE_7                    = 36,
        SDL_SCANCODE_8                    = 37,
        SDL_SCANCODE_9                    = 38,
        SDL_SCANCODE_0                    = 39,
        SDL_SCANCODE_RETURN               = 40,
        SDL_SCANCODE_ESCAPE               = 41,
        SDL_SCANCODE_BACKSPACE            = 42,
        SDL_SCANCODE_TAB                  = 43,
        SDL_SCANCODE_SPACE                = 44,
        SDL_SCANCODE_MINUS                = 45,
        SDL_SCANCODE_EQUALS               = 46,
        SDL_SCANCODE_LEFTBRACKET          = 47,
        SDL_SCANCODE_RIGHTBRACKET         = 48,
        SDL_SCANCODE_BACKSLASH            = 49,
        SDL_SCANCODE_NONUSHASH            = 50,
        SDL_SCANCODE_SEMICOLON            = 51,
        SDL_SCANCODE_APOSTROPHE           = 52,
        SDL_SCANCODE_GRAVE                = 53,
        SDL_SCANCODE_COMMA                = 54,
        SDL_SCANCODE_PERIOD               = 55,
        SDL_SCANCODE_SLASH                = 56,
        SDL_SCANCODE_CAPSLOCK             = 57,
        SDL_SCANCODE_F1                   = 58,
        SDL_SCANCODE_F2                   = 59,
        SDL_SCANCODE_F3                   = 60,
        SDL_SCANCODE_F4                   = 61,
        SDL_SCANCODE_F5                   = 62,
        SDL_SCANCODE_F6                   = 63,
        SDL_SCANCODE_F7                   = 64,
        SDL_SCANCODE_F8                   = 65,
        SDL_SCANCODE_F9                   = 66,
        SDL_SCANCODE_F10                  = 67,
        SDL_SCANCODE_F11                  = 68,
        SDL_SCANCODE_F12                  = 69,
        SDL_SCANCODE_PRINTSCREEN          = 70,
        SDL_SCANCODE_SCROLLLOCK           = 71,
        SDL_SCANCODE_PAUSE                = 72,
        SDL_SCANCODE_INSERT               = 73,
        SDL_SCANCODE_HOME                 = 74,
        SDL_SCANCODE_PAGEUP               = 75,
        SDL_SCANCODE_DELETE               = 76,
        SDL_SCANCODE_END                  = 77,
        SDL_SCANCODE_PAGEDOWN             = 78,
        SDL_SCANCODE_RIGHT                = 79,
        SDL_SCANCODE_LEFT                 = 80,
        SDL_SCANCODE_DOWN                 = 81,
        SDL_SCANCODE_UP                   = 82,
        SDL_SCANCODE_NUMLOCKCLEAR         = 83,
        SDL_SCANCODE_KP_DIVIDE            = 84,
        SDL_SCANCODE_KP_MULTIPLY          = 85,
        SDL_SCANCODE_KP_MINUS             = 86,
        SDL_SCANCODE_KP_PLUS              = 87,
        SDL_SCANCODE_KP_ENTER             = 88,
        SDL_SCANCODE_KP_1                 = 89,
        SDL_SCANCODE_KP_2                 = 90,
        SDL_SCANCODE_KP_3                 = 91,
        SDL_SCANCODE_KP_4                 = 92,
        SDL_SCANCODE_KP_5                 = 93,
        SDL_SCANCODE_KP_6                 = 94,
        SDL_SCANCODE_KP_7                 = 95,
        SDL_SCANCODE_KP_8                 = 96,
        SDL_SCANCODE_KP_9                 = 97,
        SDL_SCANCODE_KP_0                 = 98,
        SDL_SCANCODE_KP_PERIOD            = 99,
        SDL_SCANCODE_NONUSBACKSLASH       = 100,
        SDL_SCANCODE_APPLICATION          = 101,
        SDL_SCANCODE_POWER                = 102,
        SDL_SCANCODE_KP_EQUALS            = 103,
        SDL_SCANCODE_F13                  = 104,
        SDL_SCANCODE_F14                  = 105,
        SDL_SCANCODE_F15                  = 106,
        SDL_SCANCODE_F16                  = 107,
        SDL_SCANCODE_F17                  = 108,
        SDL_SCANCODE_F18                  = 109,
        SDL_SCANCODE_F19                  = 110,
        SDL_SCANCODE_F20                  = 111,
        SDL_SCANCODE_F21                  = 112,
        SDL_SCANCODE_F22                  = 113,
        SDL_SCANCODE_F23                  = 114,
        SDL_SCANCODE_F24                  = 115,
        SDL_SCANCODE_EXECUTE              = 116,
        SDL_SCANCODE_HELP                 = 117,
        SDL_SCANCODE_MENU                 = 118,
        SDL_SCANCODE_SELECT               = 119,
        SDL_SCANCODE_STOP                 = 120,
        SDL_SCANCODE_AGAIN                = 121,
        SDL_SCANCODE_UNDO                 = 122,
        SDL_SCANCODE_CUT                  = 123,
        SDL_SCANCODE_COPY                 = 124,
        SDL_SCANCODE_PASTE                = 125,
        SDL_SCANCODE_FIND                 = 126,
        SDL_SCANCODE_MUTE                 = 127,
        SDL_SCANCODE_VOLUMEUP             = 128,
        SDL_SCANCODE_VOLUMEDOWN           = 129,
        SDL_SCANCODE_KP_COMMA             = 133,
        SDL_SCANCODE_KP_EQUALSAS400       = 134,
        SDL_SCANCODE_INTERNATIONAL1       = 135,
        SDL_SCANCODE_INTERNATIONAL2       = 136,
        SDL_SCANCODE_INTERNATIONAL3       = 137,
        SDL_SCANCODE_INTERNATIONAL4       = 138,
        SDL_SCANCODE_INTERNATIONAL5       = 139,
        SDL_SCANCODE_INTERNATIONAL6       = 140,
        SDL_SCANCODE_INTERNATIONAL7       = 141,
        SDL_SCANCODE_INTERNATIONAL8       = 142,
        SDL_SCANCODE_INTERNATIONAL9       = 143,
        SDL_SCANCODE_LANG1                = 144,
        SDL_SCANCODE_LANG2                = 145,
        SDL_SCANCODE_LANG3                = 146,
        SDL_SCANCODE_LANG4                = 147,
        SDL_SCANCODE_LANG5                = 148,
        SDL_SCANCODE_LANG6                = 149,
        SDL_SCANCODE_LANG7                = 150,
        SDL_SCANCODE_LANG8                = 151,
        SDL_SCANCODE_LANG9                = 152,
        SDL_SCANCODE_ALTERASE             = 153,
        SDL_SCANCODE_SYSREQ               = 154,
        SDL_SCANCODE_CANCEL               = 155,
        SDL_SCANCODE_CLEAR                = 156,
        SDL_SCANCODE_PRIOR                = 157,
        SDL_SCANCODE_RETURN2              = 158,
        SDL_SCANCODE_SEPARATOR            = 159,
        SDL_SCANCODE_OUT                  = 160,
        SDL_SCANCODE_OPER                 = 161,
        SDL_SCANCODE_CLEARAGAIN           = 162,
        SDL_SCANCODE_CRSEL                = 163,
        SDL_SCANCODE_EXSEL                = 164,
        SDL_SCANCODE_KP_00                = 176,
        SDL_SCANCODE_KP_000               = 177,
        SDL_SCANCODE_THOUSANDSSEPARATOR   = 178,
        SDL_SCANCODE_DECIMALSEPARATOR     = 179,
        SDL_SCANCODE_CURRENCYUNIT         = 180,
        SDL_SCANCODE_CURRENCYSUBUNIT      = 181,
        SDL_SCANCODE_KP_LEFTPAREN         = 182,
        SDL_SCANCODE_KP_RIGHTPAREN        = 183,
        SDL_SCANCODE_KP_LEFTBRACE         = 184,
        SDL_SCANCODE_KP_RIGHTBRACE        = 185,
        SDL_SCANCODE_KP_TAB               = 186,
        SDL_SCANCODE_KP_BACKSPACE         = 187,
        SDL_SCANCODE_KP_A                 = 188,
        SDL_SCANCODE_KP_B                 = 189,
        SDL_SCANCODE_KP_C                 = 190,
        SDL_SCANCODE_KP_D                 = 191,
        SDL_SCANCODE_KP_E                 = 192,
        SDL_SCANCODE_KP_F                 = 193,
        SDL_SCANCODE_KP_XOR               = 194,
        SDL_SCANCODE_KP_POWER             = 195,
        SDL_SCANCODE_KP_PERCENT           = 196,
        SDL_SCANCODE_KP_LESS              = 197,
        SDL_SCANCODE_KP_GREATER           = 198,
        SDL_SCANCODE_KP_AMPERSAND         = 199,
        SDL_SCANCODE_KP_DBLAMPERSAND      = 200,
        SDL_SCANCODE_KP_VERTICALBAR       = 201,
        SDL_SCANCODE_KP_DBLVERTICALBAR    = 202,
        SDL_SCANCODE_KP_COLON             = 203,
        SDL_SCANCODE_KP_HASH              = 204,
        SDL_SCANCODE_KP_SPACE             = 205,
        SDL_SCANCODE_KP_AT                = 206,
        SDL_SCANCODE_KP_EXCLAM            = 207,
        SDL_SCANCODE_KP_MEMSTORE          = 208,
        SDL_SCANCODE_KP_MEMRECALL         = 209,
        SDL_SCANCODE_KP_MEMCLEAR          = 210,
        SDL_SCANCODE_KP_MEMADD            = 211,
        SDL_SCANCODE_KP_MEMSUBTRACT       = 212,
        SDL_SCANCODE_KP_MEMMULTIPLY       = 213,
        SDL_SCANCODE_KP_MEMDIVIDE         = 214,
        SDL_SCANCODE_KP_PLUSMINUS         = 215,
        SDL_SCANCODE_KP_CLEAR             = 216,
        SDL_SCANCODE_KP_CLEARENTRY        = 217,
        SDL_SCANCODE_KP_BINARY            = 218,
        SDL_SCANCODE_KP_OCTAL             = 219,
        SDL_SCANCODE_KP_DECIMAL           = 220,
        SDL_SCANCODE_KP_HEXADECIMAL       = 221,
        SDL_SCANCODE_LCTRL                = 224,
        SDL_SCANCODE_LSHIFT               = 225,
        SDL_SCANCODE_LALT                 = 226,
        SDL_SCANCODE_LGUI                 = 227,
        SDL_SCANCODE_RCTRL                = 228,
        SDL_SCANCODE_RSHIFT               = 229,
        SDL_SCANCODE_RALT                 = 230,
        SDL_SCANCODE_RGUI                 = 231,
        SDL_SCANCODE_MODE                 = 257,
        SDL_SCANCODE_SLEEP                = 258,
        SDL_SCANCODE_WAKE                 = 259,
        SDL_SCANCODE_CHANNEL_INCREMENT    = 260,
        SDL_SCANCODE_CHANNEL_DECREMENT    = 261,
        SDL_SCANCODE_MEDIA_PLAY           = 262,
        SDL_SCANCODE_MEDIA_PAUSE          = 263,
        SDL_SCANCODE_MEDIA_RECORD         = 264,
        SDL_SCANCODE_MEDIA_FAST_FORWARD   = 265,
        SDL_SCANCODE_MEDIA_REWIND         = 266,
        SDL_SCANCODE_MEDIA_NEXT_TRACK     = 267,
        SDL_SCANCODE_MEDIA_PREVIOUS_TRACK = 268,
        SDL_SCANCODE_MEDIA_STOP           = 269,
        SDL_SCANCODE_MEDIA_EJECT          = 270,
        SDL_SCANCODE_MEDIA_PLAY_PAUSE     = 271,
        SDL_SCANCODE_MEDIA_SELECT         = 272,
        SDL_SCANCODE_AC_NEW               = 273,
        SDL_SCANCODE_AC_OPEN              = 274,
        SDL_SCANCODE_AC_CLOSE             = 275,
        SDL_SCANCODE_AC_EXIT              = 276,
        SDL_SCANCODE_AC_SAVE              = 277,
        SDL_SCANCODE_AC_PRINT             = 278,
        SDL_SCANCODE_AC_PROPERTIES        = 279,
        SDL_SCANCODE_AC_SEARCH            = 280,
        SDL_SCANCODE_AC_HOME              = 281,
        SDL_SCANCODE_AC_BACK              = 282,
        SDL_SCANCODE_AC_FORWARD           = 283,
        SDL_SCANCODE_AC_STOP              = 284,
        SDL_SCANCODE_AC_REFRESH           = 285,
        SDL_SCANCODE_AC_BOOKMARKS         = 286,
        SDL_SCANCODE_SOFTLEFT             = 287,
        SDL_SCANCODE_SOFTRIGHT            = 288,
        SDL_SCANCODE_CALL                 = 289,
        SDL_SCANCODE_ENDCALL              = 290,
        SDL_SCANCODE_RESERVED             = 400,
        SDL_SCANCODE_COUNT                = 512;

    public static final float SDL_STANDARD_GRAVITY = 9.80665f;

    public static final int
        SDL_SENSOR_INVALID = -1,
        SDL_SENSOR_UNKNOWN = 0,
        SDL_SENSOR_ACCEL   = 1,
        SDL_SENSOR_GYRO    = 2,
        SDL_SENSOR_ACCEL_L = 3,
        SDL_SENSOR_GYRO_L  = 4,
        SDL_SENSOR_ACCEL_R = 5,
        SDL_SENSOR_GYRO_R  = 6;

    public static final float SDL_FLT_EPSILON = 1.1920929E-7f;

    public static final int SDL_INVALID_UNICODE_CODEPOINT = 0xFFFD;

    public static final int DUMMY_ENUM_VALUE = 0;

    public static final int SDL_SURFACE_PREALLOCATED = 0x00000001;

    public static final int SDL_SURFACE_LOCK_NEEDED = 0x00000002;

    public static final int SDL_SURFACE_LOCKED = 0x00000004;

    public static final int SDL_SURFACE_SIMD_ALIGNED = 0x00000008;

    public static final String SDL_PROP_SURFACE_SDR_WHITE_POINT_FLOAT = "SDL.surface.SDR_white_point";

    public static final String SDL_PROP_SURFACE_HDR_HEADROOM_FLOAT = "SDL.surface.HDR_headroom";

    public static final String SDL_PROP_SURFACE_TONEMAP_OPERATOR_STRING = "SDL.surface.tonemap";

    public static final int
        SDL_SCALEMODE_NEAREST = 0,
        SDL_SCALEMODE_LINEAR  = 1;

    public static final int
        SDL_FLIP_NONE       = 0,
        SDL_FLIP_HORIZONTAL = 1,
        SDL_FLIP_VERTICAL   = 2;

    public static final int
        SDL_ANDROID_EXTERNAL_STORAGE_READ  = 0x01,
        SDL_ANDROID_EXTERNAL_STORAGE_WRITE = 0x02;

    public static final int
        SDL_SANDBOX_NONE              = 0,
        SDL_SANDBOX_UNKNOWN_CONTAINER = 1,
        SDL_SANDBOX_FLATPAK           = 2,
        SDL_SANDBOX_SNAP              = 3,
        SDL_SANDBOX_MACOS             = 4;

    public static final String SDL_PROP_THREAD_CREATE_ENTRY_FUNCTION_POINTER = "SDL.thread.create.entry_function";

    public static final String SDL_PROP_THREAD_CREATE_NAME_STRING = "SDL.thread.create.name";

    public static final String SDL_PROP_THREAD_CREATE_USERDATA_POINTER = "SDL.thread.create.userdata";

    public static final String SDL_PROP_THREAD_CREATE_STACKSIZE_NUMBER = "SDL.thread.create.stacksize";

    public static final int
        SDL_THREAD_PRIORITY_LOW           = 0,
        SDL_THREAD_PRIORITY_NORMAL        = 1,
        SDL_THREAD_PRIORITY_HIGH          = 2,
        SDL_THREAD_PRIORITY_TIME_CRITICAL = 3;

    public static final int
        SDL_THREAD_UNKNOWN  = 0,
        SDL_THREAD_ALIVE    = 1,
        SDL_THREAD_DETACHED = 2,
        SDL_THREAD_COMPLETE = 3;

    public static final int
        SDL_DATE_FORMAT_YYYYMMDD = 0,
        SDL_DATE_FORMAT_DDMMYYYY = 1,
        SDL_DATE_FORMAT_MMDDYYYY = 2;

    public static final int
        SDL_TIME_FORMAT_24HR = 0,
        SDL_TIME_FORMAT_12HR = 1;

    public static final int SDL_MS_PER_SECOND = 1000;

    public static final int SDL_US_PER_SECOND = 1000000;

    public static final long SDL_NS_PER_SECOND = 1000000000;

    public static final int SDL_NS_PER_MS = 1000000;

    public static final int SDL_NS_PER_US = 1000;

    public static final int SDL_TOUCH_MOUSEID = -1;

    public static final int SDL_MOUSE_TOUCHID = -1;

    public static final int
        SDL_TOUCH_DEVICE_INVALID           = -1,
        SDL_TOUCH_DEVICE_DIRECT            = 0,
        SDL_TOUCH_DEVICE_INDIRECT_ABSOLUTE = 1,
        SDL_TOUCH_DEVICE_INDIRECT_RELATIVE = 2;

    public static final int SDL_TRAYENTRY_BUTTON = 0x00000001;

    public static final int SDL_TRAYENTRY_CHECKBOX = 0x00000002;

    public static final int SDL_TRAYENTRY_SUBMENU = 0x00000004;

    public static final int SDL_TRAYENTRY_DISABLED = 0x80000000;

    public static final int SDL_TRAYENTRY_CHECKED = 0x40000000;

    public static final int SDL_MAJOR_VERSION = 3;

    public static final int SDL_MINOR_VERSION = 1;

    public static final int SDL_MICRO_VERSION = 8;

    public static final int SDL_VERSION = SDL_VERSIONNUM(SDL_MAJOR_VERSION, SDL_MINOR_VERSION, SDL_MICRO_VERSION);

    public static final String SDL_PROP_GLOBAL_VIDEO_WAYLAND_WL_DISPLAY_POINTER = "SDL.video.wayland.wl_display";

    public static final long SDL_WINDOW_FULLSCREEN = 0x0000000000000001L;

    public static final long SDL_WINDOW_OPENGL = 0x0000000000000002L;

    public static final long SDL_WINDOW_OCCLUDED = 0x0000000000000004L;

    public static final long SDL_WINDOW_HIDDEN = 0x0000000000000008L;

    public static final long SDL_WINDOW_BORDERLESS = 0x0000000000000010L;

    public static final long SDL_WINDOW_RESIZABLE = 0x0000000000000020L;

    public static final long SDL_WINDOW_MINIMIZED = 0x0000000000000040L;

    public static final long SDL_WINDOW_MAXIMIZED = 0x0000000000000080L;

    public static final long SDL_WINDOW_MOUSE_GRABBED = 0x0000000000000100L;

    public static final long SDL_WINDOW_INPUT_FOCUS = 0x0000000000000200L;

    public static final long SDL_WINDOW_MOUSE_FOCUS = 0x0000000000000400L;

    public static final long SDL_WINDOW_EXTERNAL = 0x0000000000000800L;

    public static final long SDL_WINDOW_MODAL = 0x0000000000001000L;

    public static final long SDL_WINDOW_HIGH_PIXEL_DENSITY = 0x0000000000002000L;

    public static final long SDL_WINDOW_MOUSE_CAPTURE = 0x0000000000004000L;

    public static final long SDL_WINDOW_MOUSE_RELATIVE_MODE = 0x0000000000008000L;

    public static final long SDL_WINDOW_ALWAYS_ON_TOP = 0x0000000000010000L;

    public static final long SDL_WINDOW_UTILITY = 0x0000000000020000L;

    public static final long SDL_WINDOW_TOOLTIP = 0x0000000000040000L;

    public static final long SDL_WINDOW_POPUP_MENU = 0x0000000000080000L;

    public static final long SDL_WINDOW_KEYBOARD_GRABBED = 0x0000000000100000L;

    public static final long SDL_WINDOW_VULKAN = 0x0000000010000000L;

    public static final long SDL_WINDOW_METAL = 0x0000000020000000L;

    public static final long SDL_WINDOW_TRANSPARENT = 0x0000000040000000L;

    public static final long SDL_WINDOW_NOT_FOCUSABLE = 0x0000000080000000L;

    public static final int SDL_WINDOWPOS_UNDEFINED_MASK = 0x1FFF0000;

    public static final int SDL_WINDOWPOS_UNDEFINED = SDL_WINDOWPOS_UNDEFINED_MASK;

    public static final int SDL_WINDOWPOS_CENTERED_MASK = 0x2FFF0000;

    public static final int SDL_WINDOWPOS_CENTERED = SDL_WINDOWPOS_CENTERED_MASK;

    public static final int SDL_GL_CONTEXT_PROFILE_CORE = 0x0001;

    public static final int SDL_GL_CONTEXT_PROFILE_COMPATIBILITY = 0x0002;

    public static final int SDL_GL_CONTEXT_PROFILE_ES = 0x0004;

    public static final int SDL_GL_CONTEXT_DEBUG_FLAG = 0x0001;

    public static final int SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG = 0x0002;

    public static final int SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG = 0x0004;

    public static final int SDL_GL_CONTEXT_RESET_ISOLATION_FLAG = 0x0008;

    public static final int SDL_GL_CONTEXT_RELEASE_BEHAVIOR_NONE = 0x0000;

    public static final int SDL_GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x0001;

    public static final int SDL_GL_CONTEXT_RESET_NO_NOTIFICATION = 0x0000;

    public static final int SDL_GL_CONTEXT_RESET_LOSE_CONTEXT = 0x0001;

    public static final String SDL_PROP_DISPLAY_HDR_ENABLED_BOOLEAN = "SDL.display.HDR_enabled";

    public static final String SDL_PROP_DISPLAY_KMSDRM_PANEL_ORIENTATION_NUMBER = "SDL.display.KMSDRM.panel_orientation";

    public static final String SDL_PROP_WINDOW_CREATE_ALWAYS_ON_TOP_BOOLEAN = "SDL.window.create.always_on_top";

    public static final String SDL_PROP_WINDOW_CREATE_BORDERLESS_BOOLEAN = "SDL.window.create.borderless";

    public static final String SDL_PROP_WINDOW_CREATE_FOCUSABLE_BOOLEAN = "SDL.window.create.focusable";

    public static final String SDL_PROP_WINDOW_CREATE_EXTERNAL_GRAPHICS_CONTEXT_BOOLEAN = "SDL.window.create.external_graphics_context";

    public static final String SDL_PROP_WINDOW_CREATE_FLAGS_NUMBER = "SDL.window.create.flags";

    public static final String SDL_PROP_WINDOW_CREATE_FULLSCREEN_BOOLEAN = "SDL.window.create.fullscreen";

    public static final String SDL_PROP_WINDOW_CREATE_HEIGHT_NUMBER = "SDL.window.create.height";

    public static final String SDL_PROP_WINDOW_CREATE_HIDDEN_BOOLEAN = "SDL.window.create.hidden";

    public static final String SDL_PROP_WINDOW_CREATE_HIGH_PIXEL_DENSITY_BOOLEAN = "SDL.window.create.high_pixel_density";

    public static final String SDL_PROP_WINDOW_CREATE_MAXIMIZED_BOOLEAN = "SDL.window.create.maximized";

    public static final String SDL_PROP_WINDOW_CREATE_MENU_BOOLEAN = "SDL.window.create.menu";

    public static final String SDL_PROP_WINDOW_CREATE_METAL_BOOLEAN = "SDL.window.create.metal";

    public static final String SDL_PROP_WINDOW_CREATE_MINIMIZED_BOOLEAN = "SDL.window.create.minimized";

    public static final String SDL_PROP_WINDOW_CREATE_MODAL_BOOLEAN = "SDL.window.create.modal";

    public static final String SDL_PROP_WINDOW_CREATE_MOUSE_GRABBED_BOOLEAN = "SDL.window.create.mouse_grabbed";

    public static final String SDL_PROP_WINDOW_CREATE_OPENGL_BOOLEAN = "SDL.window.create.opengl";

    public static final String SDL_PROP_WINDOW_CREATE_PARENT_POINTER = "SDL.window.create.parent";

    public static final String SDL_PROP_WINDOW_CREATE_RESIZABLE_BOOLEAN = "SDL.window.create.resizable";

    public static final String SDL_PROP_WINDOW_CREATE_TITLE_STRING = "SDL.window.create.title";

    public static final String SDL_PROP_WINDOW_CREATE_TRANSPARENT_BOOLEAN = "SDL.window.create.transparent";

    public static final String SDL_PROP_WINDOW_CREATE_TOOLTIP_BOOLEAN = "SDL.window.create.tooltip";

    public static final String SDL_PROP_WINDOW_CREATE_UTILITY_BOOLEAN = "SDL.window.create.utility";

    public static final String SDL_PROP_WINDOW_CREATE_VULKAN_BOOLEAN = "SDL.window.create.vulkan";

    public static final String SDL_PROP_WINDOW_CREATE_WIDTH_NUMBER = "SDL.window.create.width";

    public static final String SDL_PROP_WINDOW_CREATE_X_NUMBER = "SDL.window.create.x";

    public static final String SDL_PROP_WINDOW_CREATE_Y_NUMBER = "SDL.window.create.y";

    public static final String SDL_PROP_WINDOW_CREATE_COCOA_WINDOW_POINTER = "SDL.window.create.cocoa.window";

    public static final String SDL_PROP_WINDOW_CREATE_COCOA_VIEW_POINTER = "SDL.window.create.cocoa.view";

    public static final String SDL_PROP_WINDOW_CREATE_WAYLAND_SURFACE_ROLE_CUSTOM_BOOLEAN = "SDL.window.create.wayland.surface_role_custom";

    public static final String SDL_PROP_WINDOW_CREATE_WAYLAND_CREATE_EGL_WINDOW_BOOLEAN = "SDL.window.create.wayland.create_egl_window";

    public static final String SDL_PROP_WINDOW_CREATE_WAYLAND_WL_SURFACE_POINTER = "SDL.window.create.wayland.wl_surface";

    public static final String SDL_PROP_WINDOW_CREATE_WIN32_HWND_POINTER = "SDL.window.create.win32.hwnd";

    public static final String SDL_PROP_WINDOW_CREATE_WIN32_PIXEL_FORMAT_HWND_POINTER = "SDL.window.create.win32.pixel_format_hwnd";

    public static final String SDL_PROP_WINDOW_CREATE_X11_WINDOW_NUMBER = "SDL.window.create.x11.window";

    public static final String SDL_PROP_WINDOW_SHAPE_POINTER = "SDL.window.shape";

    public static final String SDL_PROP_WINDOW_HDR_ENABLED_BOOLEAN = "SDL.window.HDR_enabled";

    public static final String SDL_PROP_WINDOW_SDR_WHITE_LEVEL_FLOAT = "SDL.window.SDR_white_level";

    public static final String SDL_PROP_WINDOW_HDR_HEADROOM_FLOAT = "SDL.window.HDR_headroom";

    public static final String SDL_PROP_WINDOW_ANDROID_WINDOW_POINTER = "SDL.window.android.window";

    public static final String SDL_PROP_WINDOW_ANDROID_SURFACE_POINTER = "SDL.window.android.surface";

    public static final String SDL_PROP_WINDOW_UIKIT_WINDOW_POINTER = "SDL.window.uikit.window";

    public static final String SDL_PROP_WINDOW_UIKIT_METAL_VIEW_TAG_NUMBER = "SDL.window.uikit.metal_view_tag";

    public static final String SDL_PROP_WINDOW_UIKIT_OPENGL_FRAMEBUFFER_NUMBER = "SDL.window.uikit.opengl.framebuffer";

    public static final String SDL_PROP_WINDOW_UIKIT_OPENGL_RENDERBUFFER_NUMBER = "SDL.window.uikit.opengl.renderbuffer";

    public static final String SDL_PROP_WINDOW_UIKIT_OPENGL_RESOLVE_FRAMEBUFFER_NUMBER = "SDL.window.uikit.opengl.resolve_framebuffer";

    public static final String SDL_PROP_WINDOW_KMSDRM_DEVICE_INDEX_NUMBER = "SDL.window.kmsdrm.dev_index";

    public static final String SDL_PROP_WINDOW_KMSDRM_DRM_FD_NUMBER = "SDL.window.kmsdrm.drm_fd";

    public static final String SDL_PROP_WINDOW_KMSDRM_GBM_DEVICE_POINTER = "SDL.window.kmsdrm.gbm_dev";

    public static final String SDL_PROP_WINDOW_COCOA_WINDOW_POINTER = "SDL.window.cocoa.window";

    public static final String SDL_PROP_WINDOW_COCOA_METAL_VIEW_TAG_NUMBER = "SDL.window.cocoa.metal_view_tag";

    public static final String SDL_PROP_WINDOW_OPENVR_OVERLAY_ID = "SDL.window.openvr.overlay_id";

    public static final String SDL_PROP_WINDOW_VIVANTE_DISPLAY_POINTER = "SDL.window.vivante.display";

    public static final String SDL_PROP_WINDOW_VIVANTE_WINDOW_POINTER = "SDL.window.vivante.window";

    public static final String SDL_PROP_WINDOW_VIVANTE_SURFACE_POINTER = "SDL.window.vivante.surface";

    public static final String SDL_PROP_WINDOW_WIN32_HWND_POINTER = "SDL.window.win32.hwnd";

    public static final String SDL_PROP_WINDOW_WIN32_HDC_POINTER = "SDL.window.win32.hdc";

    public static final String SDL_PROP_WINDOW_WIN32_INSTANCE_POINTER = "SDL.window.win32.instance";

    public static final String SDL_PROP_WINDOW_WAYLAND_DISPLAY_POINTER = "SDL.window.wayland.display";

    public static final String SDL_PROP_WINDOW_WAYLAND_SURFACE_POINTER = "SDL.window.wayland.surface";

    public static final String SDL_PROP_WINDOW_WAYLAND_VIEWPORT_POINTER = "SDL.window.wayland.viewport";

    public static final String SDL_PROP_WINDOW_WAYLAND_EGL_WINDOW_POINTER = "SDL.window.wayland.egl_window";

    public static final String SDL_PROP_WINDOW_WAYLAND_XDG_SURFACE_POINTER = "SDL.window.wayland.xdg_surface";

    public static final String SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_POINTER = "SDL.window.wayland.xdg_toplevel";

    public static final String SDL_PROP_WINDOW_WAYLAND_XDG_TOPLEVEL_EXPORT_HANDLE_STRING = "SDL.window.wayland.xdg_toplevel_export_handle";

    public static final String SDL_PROP_WINDOW_WAYLAND_XDG_POPUP_POINTER = "SDL.window.wayland.xdg_popup";

    public static final String SDL_PROP_WINDOW_WAYLAND_XDG_POSITIONER_POINTER = "SDL.window.wayland.xdg_positioner";

    public static final String SDL_PROP_WINDOW_X11_DISPLAY_POINTER = "SDL.window.x11.display";

    public static final String SDL_PROP_WINDOW_X11_SCREEN_NUMBER = "SDL.window.x11.screen";

    public static final String SDL_PROP_WINDOW_X11_WINDOW_NUMBER = "SDL.window.x11.window";

    public static final int SDL_WINDOW_SURFACE_VSYNC_DISABLED = 0;

    public static final int SDL_WINDOW_SURFACE_VSYNC_ADAPTIVE = -1;

    public static final int
        SDL_SYSTEM_THEME_UNKNOWN = 0,
        SDL_SYSTEM_THEME_LIGHT   = 1,
        SDL_SYSTEM_THEME_DARK    = 2;

    public static final int
        SDL_ORIENTATION_UNKNOWN           = 0,
        SDL_ORIENTATION_LANDSCAPE         = 1,
        SDL_ORIENTATION_LANDSCAPE_FLIPPED = 2,
        SDL_ORIENTATION_PORTRAIT          = 3,
        SDL_ORIENTATION_PORTRAIT_FLIPPED  = 4;

    public static final int
        SDL_FLASH_CANCEL        = 0,
        SDL_FLASH_BRIEFLY       = 1,
        SDL_FLASH_UNTIL_FOCUSED = 2;

    public static final int
        SDL_GL_RED_SIZE                   = 0,
        SDL_GL_GREEN_SIZE                 = 1,
        SDL_GL_BLUE_SIZE                  = 2,
        SDL_GL_ALPHA_SIZE                 = 3,
        SDL_GL_BUFFER_SIZE                = 4,
        SDL_GL_DOUBLEBUFFER               = 5,
        SDL_GL_DEPTH_SIZE                 = 6,
        SDL_GL_STENCIL_SIZE               = 7,
        SDL_GL_ACCUM_RED_SIZE             = 8,
        SDL_GL_ACCUM_GREEN_SIZE           = 9,
        SDL_GL_ACCUM_BLUE_SIZE            = 10,
        SDL_GL_ACCUM_ALPHA_SIZE           = 11,
        SDL_GL_STEREO                     = 12,
        SDL_GL_MULTISAMPLEBUFFERS         = 13,
        SDL_GL_MULTISAMPLESAMPLES         = 14,
        SDL_GL_ACCELERATED_VISUAL         = 15,
        SDL_GL_RETAINED_BACKING           = 16,
        SDL_GL_CONTEXT_MAJOR_VERSION      = 17,
        SDL_GL_CONTEXT_MINOR_VERSION      = 18,
        SDL_GL_CONTEXT_FLAGS              = 19,
        SDL_GL_CONTEXT_PROFILE_MASK       = 20,
        SDL_GL_SHARE_WITH_CURRENT_CONTEXT = 21,
        SDL_GL_FRAMEBUFFER_SRGB_CAPABLE   = 22,
        SDL_GL_CONTEXT_RELEASE_BEHAVIOR   = 23,
        SDL_GL_CONTEXT_RESET_NOTIFICATION = 24,
        SDL_GL_CONTEXT_NO_ERROR           = 25,
        SDL_GL_FLOATBUFFERS               = 26,
        SDL_GL_EGL_PLATFORM               = 27;

    public static final int
        SDL_HITTEST_NORMAL             = 0,
        SDL_HITTEST_DRAGGABLE          = 1,
        SDL_HITTEST_RESIZE_TOPLEFT     = 2,
        SDL_HITTEST_RESIZE_TOP         = 3,
        SDL_HITTEST_RESIZE_TOPRIGHT    = 4,
        SDL_HITTEST_RESIZE_RIGHT       = 5,
        SDL_HITTEST_RESIZE_BOTTOMRIGHT = 6,
        SDL_HITTEST_RESIZE_BOTTOM      = 7,
        SDL_HITTEST_RESIZE_BOTTOMLEFT  = 8,
        SDL_HITTEST_RESIZE_LEFT        = 9;

    protected SDL() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_AsyncIOFromFile ] ---

    /** {@code SDL_AsyncIO * SDL_AsyncIOFromFile(char const * file, char const * mode)} */
    public static long nSDL_AsyncIOFromFile(long file, long mode) {
        long __functionAddress = Functions.AsyncIOFromFile;
        return invokePPP(file, mode, __functionAddress);
    }

    /** {@code SDL_AsyncIO * SDL_AsyncIOFromFile(char const * file, char const * mode)} */
    @NativeType("SDL_AsyncIO *")
    public static long SDL_AsyncIOFromFile(@NativeType("char const *") ByteBuffer file, @NativeType("char const *") ByteBuffer mode) {
        if (CHECKS) {
            checkNT1(file);
            checkNT1(mode);
        }
        return nSDL_AsyncIOFromFile(memAddress(file), memAddress(mode));
    }

    /** {@code SDL_AsyncIO * SDL_AsyncIOFromFile(char const * file, char const * mode)} */
    @NativeType("SDL_AsyncIO *")
    public static long SDL_AsyncIOFromFile(@NativeType("char const *") CharSequence file, @NativeType("char const *") CharSequence mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            stack.nASCII(mode, true);
            long modeEncoded = stack.getPointerAddress();
            return nSDL_AsyncIOFromFile(fileEncoded, modeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetAsyncIOSize ] ---

    /** {@code Sint64 SDL_GetAsyncIOSize(SDL_AsyncIO * asyncio)} */
    @NativeType("Sint64")
    public static long SDL_GetAsyncIOSize(@NativeType("SDL_AsyncIO *") long asyncio) {
        long __functionAddress = Functions.GetAsyncIOSize;
        if (CHECKS) {
            check(asyncio);
        }
        return invokePJ(asyncio, __functionAddress);
    }

    // --- [ SDL_ReadAsyncIO ] ---

    /** {@code bool SDL_ReadAsyncIO(SDL_AsyncIO * asyncio, void * ptr, Uint64 offset, Uint64 size, SDL_AsyncIOQueue * queue, void * userdata)} */
    public static boolean nSDL_ReadAsyncIO(long asyncio, long ptr, long offset, long size, long queue, long userdata) {
        long __functionAddress = Functions.ReadAsyncIO;
        if (CHECKS) {
            check(asyncio);
            check(queue);
        }
        return invokePPJJPPZ(asyncio, ptr, offset, size, queue, userdata, __functionAddress);
    }

    /** {@code bool SDL_ReadAsyncIO(SDL_AsyncIO * asyncio, void * ptr, Uint64 offset, Uint64 size, SDL_AsyncIOQueue * queue, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_ReadAsyncIO(@NativeType("SDL_AsyncIO *") long asyncio, @NativeType("void *") ByteBuffer ptr, @NativeType("Uint64") long offset, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        return nSDL_ReadAsyncIO(asyncio, memAddress(ptr), offset, ptr.remaining(), queue, userdata);
    }

    // --- [ SDL_WriteAsyncIO ] ---

    /** {@code bool SDL_WriteAsyncIO(SDL_AsyncIO * asyncio, void * ptr, Uint64 offset, Uint64 size, SDL_AsyncIOQueue * queue, void * userdata)} */
    public static boolean nSDL_WriteAsyncIO(long asyncio, long ptr, long offset, long size, long queue, long userdata) {
        long __functionAddress = Functions.WriteAsyncIO;
        if (CHECKS) {
            check(asyncio);
            check(queue);
        }
        return invokePPJJPPZ(asyncio, ptr, offset, size, queue, userdata, __functionAddress);
    }

    /** {@code bool SDL_WriteAsyncIO(SDL_AsyncIO * asyncio, void * ptr, Uint64 offset, Uint64 size, SDL_AsyncIOQueue * queue, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_WriteAsyncIO(@NativeType("SDL_AsyncIO *") long asyncio, @NativeType("void *") ByteBuffer ptr, @NativeType("Uint64") long offset, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        return nSDL_WriteAsyncIO(asyncio, memAddress(ptr), offset, ptr.remaining(), queue, userdata);
    }

    // --- [ SDL_CloseAsyncIO ] ---

    /** {@code bool SDL_CloseAsyncIO(SDL_AsyncIO * asyncio, bool flush, SDL_AsyncIOQueue * queue, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_CloseAsyncIO(@NativeType("SDL_AsyncIO *") long asyncio, @NativeType("bool") boolean flush, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.CloseAsyncIO;
        if (CHECKS) {
            check(asyncio);
            check(queue);
        }
        return invokePPPZ(asyncio, flush, queue, userdata, __functionAddress);
    }

    // --- [ SDL_CreateAsyncIOQueue ] ---

    /** {@code SDL_AsyncIOQueue * SDL_CreateAsyncIOQueue(void)} */
    @NativeType("SDL_AsyncIOQueue *")
    public static long SDL_CreateAsyncIOQueue() {
        long __functionAddress = Functions.CreateAsyncIOQueue;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_DestroyAsyncIOQueue ] ---

    /** {@code void SDL_DestroyAsyncIOQueue(SDL_AsyncIOQueue * queue)} */
    public static void SDL_DestroyAsyncIOQueue(@NativeType("SDL_AsyncIOQueue *") long queue) {
        long __functionAddress = Functions.DestroyAsyncIOQueue;
        if (CHECKS) {
            check(queue);
        }
        invokePV(queue, __functionAddress);
    }

    // --- [ SDL_GetAsyncIOResult ] ---

    /** {@code bool SDL_GetAsyncIOResult(SDL_AsyncIOQueue * queue, SDL_AsyncIOOutcome * outcome)} */
    public static boolean nSDL_GetAsyncIOResult(long queue, long outcome) {
        long __functionAddress = Functions.GetAsyncIOResult;
        if (CHECKS) {
            check(queue);
        }
        return invokePPZ(queue, outcome, __functionAddress);
    }

    /** {@code bool SDL_GetAsyncIOResult(SDL_AsyncIOQueue * queue, SDL_AsyncIOOutcome * outcome)} */
    @NativeType("bool")
    public static boolean SDL_GetAsyncIOResult(@NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("SDL_AsyncIOOutcome *") SDL_AsyncIOOutcome outcome) {
        return nSDL_GetAsyncIOResult(queue, outcome.address());
    }

    // --- [ SDL_WaitAsyncIOResult ] ---

    /** {@code bool SDL_WaitAsyncIOResult(SDL_AsyncIOQueue * queue, SDL_AsyncIOOutcome * outcome, Sint32 timeoutMS)} */
    public static boolean nSDL_WaitAsyncIOResult(long queue, long outcome, int timeoutMS) {
        long __functionAddress = Functions.WaitAsyncIOResult;
        if (CHECKS) {
            check(queue);
        }
        return invokePPZ(queue, outcome, timeoutMS, __functionAddress);
    }

    /** {@code bool SDL_WaitAsyncIOResult(SDL_AsyncIOQueue * queue, SDL_AsyncIOOutcome * outcome, Sint32 timeoutMS)} */
    @NativeType("bool")
    public static boolean SDL_WaitAsyncIOResult(@NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("SDL_AsyncIOOutcome *") SDL_AsyncIOOutcome outcome, @NativeType("Sint32") int timeoutMS) {
        return nSDL_WaitAsyncIOResult(queue, outcome.address(), timeoutMS);
    }

    // --- [ SDL_SignalAsyncIOQueue ] ---

    /** {@code void SDL_SignalAsyncIOQueue(SDL_AsyncIOQueue * queue)} */
    public static void SDL_SignalAsyncIOQueue(@NativeType("SDL_AsyncIOQueue *") long queue) {
        long __functionAddress = Functions.SignalAsyncIOQueue;
        if (CHECKS) {
            check(queue);
        }
        invokePV(queue, __functionAddress);
    }

    // --- [ SDL_LoadFileAsync ] ---

    /** {@code bool SDL_LoadFileAsync(char const * file, SDL_AsyncIOQueue * queue, void * userdata)} */
    public static boolean nSDL_LoadFileAsync(long file, long queue, long userdata) {
        long __functionAddress = Functions.LoadFileAsync;
        if (CHECKS) {
            check(queue);
        }
        return invokePPPZ(file, queue, userdata, __functionAddress);
    }

    /** {@code bool SDL_LoadFileAsync(char const * file, SDL_AsyncIOQueue * queue, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_LoadFileAsync(@NativeType("char const *") ByteBuffer file, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1(file);
        }
        return nSDL_LoadFileAsync(memAddress(file), queue, userdata);
    }

    /** {@code bool SDL_LoadFileAsync(char const * file, SDL_AsyncIOQueue * queue, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_LoadFileAsync(@NativeType("char const *") CharSequence file, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            return nSDL_LoadFileAsync(fileEncoded, queue, userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_DEFINE_AUDIO_FORMAT ] ---

    /** {@code uint32_t SDL_DEFINE_AUDIO_FORMAT(uint32_t signed, uint32_t bigendian, uint32_t flt, uint32_t size)} */
    @NativeType("uint32_t")
    public static int SDL_DEFINE_AUDIO_FORMAT(@NativeType("uint32_t") int signed, @NativeType("uint32_t") int bigendian, @NativeType("uint32_t") int flt, @NativeType("uint32_t") int size) {
        return ((signed & 1) << 15) | ((bigendian & 1) << 12) | ((flt & 1) << 8) | (size & SDL_AUDIO_MASK_BITSIZE);
    }

    // --- [ SDL_AUDIO_BITSIZE ] ---

    /** {@code uint32_t SDL_AUDIO_BITSIZE(SDL_AudioFormat x)} */
    @NativeType("uint32_t")
    public static int SDL_AUDIO_BITSIZE(@NativeType("SDL_AudioFormat") int x) {
        return x & SDL_AUDIO_MASK_BITSIZE;
    }

    // --- [ SDL_AUDIO_BYTESIZE ] ---

    /** {@code uint32_t SDL_AUDIO_BYTESIZE(SDL_AudioFormat x)} */
    @NativeType("uint32_t")
    public static int SDL_AUDIO_BYTESIZE(@NativeType("SDL_AudioFormat") int x) {
        return SDL_AUDIO_BITSIZE(x) / 8;
    }

    // --- [ SDL_AUDIO_ISFLOAT ] ---

    /** {@code bool SDL_AUDIO_ISFLOAT(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISFLOAT(@NativeType("SDL_AudioFormat") int x) {
        return (x & SDL_AUDIO_MASK_FLOAT) != 0;
    }

    // --- [ SDL_AUDIO_ISBIGENDIAN ] ---

    /** {@code bool SDL_AUDIO_ISBIGENDIAN(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISBIGENDIAN(@NativeType("SDL_AudioFormat") int x) {
        return (x & SDL_AUDIO_MASK_BIG_ENDIAN) != 0;
    }

    // --- [ SDL_AUDIO_ISLITTLEENDIAN ] ---

    /** {@code bool SDL_AUDIO_ISLITTLEENDIAN(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISLITTLEENDIAN(@NativeType("SDL_AudioFormat") int x) {
        return !SDL_AUDIO_ISBIGENDIAN(x);
    }

    // --- [ SDL_AUDIO_ISSIGNED ] ---

    /** {@code bool SDL_AUDIO_ISSIGNED(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISSIGNED(@NativeType("SDL_AudioFormat") int x) {
        return (x & SDL_AUDIO_MASK_SIGNED) != 0;
    }

    // --- [ SDL_AUDIO_ISINT ] ---

    /** {@code bool SDL_AUDIO_ISINT(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISINT(@NativeType("SDL_AudioFormat") int x) {
        return !SDL_AUDIO_ISFLOAT(x);
    }

    // --- [ SDL_AUDIO_ISUNSIGNED ] ---

    /** {@code bool SDL_AUDIO_ISUNSIGNED(SDL_AudioFormat x)} */
    @NativeType("bool")
    public static boolean SDL_AUDIO_ISUNSIGNED(@NativeType("SDL_AudioFormat") int x) {
        return !SDL_AUDIO_ISSIGNED(x);
    }

    // --- [ SDL_AUDIO_FRAMESIZE ] ---

    /** {@code uint32_t SDL_AUDIO_FRAMESIZE(SDL_AudioSpec x)} */
    @NativeType("uint32_t")
    public static int SDL_AUDIO_FRAMESIZE(SDL_AudioSpec x) {
        return SDL_AUDIO_BYTESIZE(x.format()) * x.channels();
    }

    // --- [ SDL_GetNumAudioDrivers ] ---

    /** {@code int SDL_GetNumAudioDrivers(void)} */
    public static int SDL_GetNumAudioDrivers() {
        long __functionAddress = Functions.GetNumAudioDrivers;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetAudioDriver ] ---

    /** {@code char const * SDL_GetAudioDriver(int index)} */
    public static long nSDL_GetAudioDriver(int index) {
        long __functionAddress = Functions.GetAudioDriver;
        return invokeP(index, __functionAddress);
    }

    /** {@code char const * SDL_GetAudioDriver(int index)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAudioDriver(int index) {
        long __result = nSDL_GetAudioDriver(index);
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetCurrentAudioDriver ] ---

    /** {@code char const * SDL_GetCurrentAudioDriver(void)} */
    public static long nSDL_GetCurrentAudioDriver() {
        long __functionAddress = Functions.GetCurrentAudioDriver;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetCurrentAudioDriver(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetCurrentAudioDriver() {
        long __result = nSDL_GetCurrentAudioDriver();
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetAudioPlaybackDevices ] ---

    /** {@code SDL_AudioDeviceID * SDL_GetAudioPlaybackDevices(int * count)} */
    public static long nSDL_GetAudioPlaybackDevices(long count) {
        long __functionAddress = Functions.GetAudioPlaybackDevices;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_AudioDeviceID * SDL_GetAudioPlaybackDevices(int * count)} */
    @NativeType("SDL_AudioDeviceID *")
    public static @Nullable IntBuffer SDL_GetAudioPlaybackDevices() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioPlaybackDevices(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetAudioRecordingDevices ] ---

    /** {@code SDL_AudioDeviceID * SDL_GetAudioRecordingDevices(int * count)} */
    public static long nSDL_GetAudioRecordingDevices(long count) {
        long __functionAddress = Functions.GetAudioRecordingDevices;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_AudioDeviceID * SDL_GetAudioRecordingDevices(int * count)} */
    @NativeType("SDL_AudioDeviceID *")
    public static @Nullable IntBuffer SDL_GetAudioRecordingDevices() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioRecordingDevices(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetAudioDeviceName ] ---

    /** {@code char const * SDL_GetAudioDeviceName(SDL_AudioDeviceID devid)} */
    public static long nSDL_GetAudioDeviceName(int devid) {
        long __functionAddress = Functions.GetAudioDeviceName;
        return invokeP(devid, __functionAddress);
    }

    /** {@code char const * SDL_GetAudioDeviceName(SDL_AudioDeviceID devid)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAudioDeviceName(@NativeType("SDL_AudioDeviceID") int devid) {
        long __result = nSDL_GetAudioDeviceName(devid);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetAudioDeviceFormat ] ---

    /** {@code bool SDL_GetAudioDeviceFormat(SDL_AudioDeviceID devid, SDL_AudioSpec * spec, int * sample_frames)} */
    public static boolean nSDL_GetAudioDeviceFormat(int devid, long spec, long sample_frames) {
        long __functionAddress = Functions.GetAudioDeviceFormat;
        return invokePPZ(devid, spec, sample_frames, __functionAddress);
    }

    /** {@code bool SDL_GetAudioDeviceFormat(SDL_AudioDeviceID devid, SDL_AudioSpec * spec, int * sample_frames)} */
    @NativeType("bool")
    public static boolean SDL_GetAudioDeviceFormat(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("int *") IntBuffer sample_frames) {
        if (CHECKS) {
            check(sample_frames, 1);
        }
        return nSDL_GetAudioDeviceFormat(devid, spec.address(), memAddress(sample_frames));
    }

    // --- [ SDL_GetAudioDeviceChannelMap ] ---

    /** {@code int * SDL_GetAudioDeviceChannelMap(SDL_AudioDeviceID devid, int * count)} */
    public static long nSDL_GetAudioDeviceChannelMap(int devid, long count) {
        long __functionAddress = Functions.GetAudioDeviceChannelMap;
        return invokePP(devid, count, __functionAddress);
    }

    /** {@code int * SDL_GetAudioDeviceChannelMap(SDL_AudioDeviceID devid, int * count)} */
    @NativeType("int *")
    public static @Nullable IntBuffer SDL_GetAudioDeviceChannelMap(@NativeType("SDL_AudioDeviceID") int devid) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioDeviceChannelMap(devid, memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_OpenAudioDevice ] ---

    /** {@code SDL_AudioDeviceID SDL_OpenAudioDevice(SDL_AudioDeviceID devid, SDL_AudioSpec const * spec)} */
    public static int nSDL_OpenAudioDevice(int devid, long spec) {
        long __functionAddress = Functions.OpenAudioDevice;
        return invokePI(devid, spec, __functionAddress);
    }

    /** {@code SDL_AudioDeviceID SDL_OpenAudioDevice(SDL_AudioDeviceID devid, SDL_AudioSpec const * spec)} */
    @NativeType("SDL_AudioDeviceID")
    public static int SDL_OpenAudioDevice(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioSpec const *") @Nullable SDL_AudioSpec spec) {
        return nSDL_OpenAudioDevice(devid, memAddressSafe(spec));
    }

    // --- [ SDL_IsAudioDevicePhysical ] ---

    /** {@code bool SDL_IsAudioDevicePhysical(SDL_AudioDeviceID devid)} */
    @NativeType("bool")
    public static boolean SDL_IsAudioDevicePhysical(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.IsAudioDevicePhysical;
        return invokeZ(devid, __functionAddress);
    }

    // --- [ SDL_IsAudioDevicePlayback ] ---

    /** {@code bool SDL_IsAudioDevicePlayback(SDL_AudioDeviceID devid)} */
    @NativeType("bool")
    public static boolean SDL_IsAudioDevicePlayback(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.IsAudioDevicePlayback;
        return invokeZ(devid, __functionAddress);
    }

    // --- [ SDL_PauseAudioDevice ] ---

    /** {@code bool SDL_PauseAudioDevice(SDL_AudioDeviceID dev)} */
    @NativeType("bool")
    public static boolean SDL_PauseAudioDevice(@NativeType("SDL_AudioDeviceID") int dev) {
        long __functionAddress = Functions.PauseAudioDevice;
        return invokeZ(dev, __functionAddress);
    }

    // --- [ SDL_ResumeAudioDevice ] ---

    /** {@code bool SDL_ResumeAudioDevice(SDL_AudioDeviceID dev)} */
    @NativeType("bool")
    public static boolean SDL_ResumeAudioDevice(@NativeType("SDL_AudioDeviceID") int dev) {
        long __functionAddress = Functions.ResumeAudioDevice;
        return invokeZ(dev, __functionAddress);
    }

    // --- [ SDL_AudioDevicePaused ] ---

    /** {@code bool SDL_AudioDevicePaused(SDL_AudioDeviceID dev)} */
    @NativeType("bool")
    public static boolean SDL_AudioDevicePaused(@NativeType("SDL_AudioDeviceID") int dev) {
        long __functionAddress = Functions.AudioDevicePaused;
        return invokeZ(dev, __functionAddress);
    }

    // --- [ SDL_GetAudioDeviceGain ] ---

    /** {@code float SDL_GetAudioDeviceGain(SDL_AudioDeviceID devid)} */
    public static float SDL_GetAudioDeviceGain(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.GetAudioDeviceGain;
        return invokeF(devid, __functionAddress);
    }

    // --- [ SDL_SetAudioDeviceGain ] ---

    /** {@code bool SDL_SetAudioDeviceGain(SDL_AudioDeviceID devid, float gain)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioDeviceGain(@NativeType("SDL_AudioDeviceID") int devid, float gain) {
        long __functionAddress = Functions.SetAudioDeviceGain;
        return invokeZ(devid, gain, __functionAddress);
    }

    // --- [ SDL_CloseAudioDevice ] ---

    /** {@code void SDL_CloseAudioDevice(SDL_AudioDeviceID devid)} */
    public static void SDL_CloseAudioDevice(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.CloseAudioDevice;
        invokeV(devid, __functionAddress);
    }

    // --- [ SDL_BindAudioStreams ] ---

    /** {@code bool SDL_BindAudioStreams(SDL_AudioDeviceID devid, SDL_AudioStream * const * streams, int num_streams)} */
    public static boolean nSDL_BindAudioStreams(int devid, long streams, int num_streams) {
        long __functionAddress = Functions.BindAudioStreams;
        return invokePZ(devid, streams, num_streams, __functionAddress);
    }

    /** {@code bool SDL_BindAudioStreams(SDL_AudioDeviceID devid, SDL_AudioStream * const * streams, int num_streams)} */
    @NativeType("bool")
    public static boolean SDL_BindAudioStreams(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioStream * const *") PointerBuffer streams) {
        return nSDL_BindAudioStreams(devid, memAddress(streams), streams.remaining());
    }

    // --- [ SDL_BindAudioStream ] ---

    /** {@code bool SDL_BindAudioStream(SDL_AudioDeviceID devid, SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_BindAudioStream(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.BindAudioStream;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(devid, stream, __functionAddress);
    }

    // --- [ SDL_UnbindAudioStreams ] ---

    /** {@code void SDL_UnbindAudioStreams(SDL_AudioStream * const * streams, int num_streams)} */
    public static void nSDL_UnbindAudioStreams(long streams, int num_streams) {
        long __functionAddress = Functions.UnbindAudioStreams;
        invokePV(streams, num_streams, __functionAddress);
    }

    /** {@code void SDL_UnbindAudioStreams(SDL_AudioStream * const * streams, int num_streams)} */
    public static void SDL_UnbindAudioStreams(@NativeType("SDL_AudioStream * const *") @Nullable PointerBuffer streams) {
        nSDL_UnbindAudioStreams(memAddressSafe(streams), remainingSafe(streams));
    }

    // --- [ SDL_UnbindAudioStream ] ---

    /** {@code void SDL_UnbindAudioStream(SDL_AudioStream * stream)} */
    public static void SDL_UnbindAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.UnbindAudioStream;
        invokePV(stream, __functionAddress);
    }

    // --- [ SDL_GetAudioStreamDevice ] ---

    /** {@code SDL_AudioDeviceID SDL_GetAudioStreamDevice(SDL_AudioStream * stream)} */
    @NativeType("SDL_AudioDeviceID")
    public static int SDL_GetAudioStreamDevice(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamDevice;
        if (CHECKS) {
            check(stream);
        }
        return invokePI(stream, __functionAddress);
    }

    // --- [ SDL_CreateAudioStream ] ---

    /** {@code SDL_AudioStream * SDL_CreateAudioStream(SDL_AudioSpec const * src_spec, SDL_AudioSpec const * dst_spec)} */
    public static long nSDL_CreateAudioStream(long src_spec, long dst_spec) {
        long __functionAddress = Functions.CreateAudioStream;
        return invokePPP(src_spec, dst_spec, __functionAddress);
    }

    /** {@code SDL_AudioStream * SDL_CreateAudioStream(SDL_AudioSpec const * src_spec, SDL_AudioSpec const * dst_spec)} */
    @NativeType("SDL_AudioStream *")
    public static long SDL_CreateAudioStream(@NativeType("SDL_AudioSpec const *") SDL_AudioSpec src_spec, @NativeType("SDL_AudioSpec const *") SDL_AudioSpec dst_spec) {
        return nSDL_CreateAudioStream(src_spec.address(), dst_spec.address());
    }

    // --- [ SDL_GetAudioStreamProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetAudioStreamProperties(SDL_AudioStream * stream)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetAudioStreamProperties(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamProperties;
        if (CHECKS) {
            check(stream);
        }
        return invokePI(stream, __functionAddress);
    }

    // --- [ SDL_GetAudioStreamFormat ] ---

    /** {@code bool SDL_GetAudioStreamFormat(SDL_AudioStream * stream, SDL_AudioSpec * src_spec, SDL_AudioSpec * dst_spec)} */
    public static boolean nSDL_GetAudioStreamFormat(long stream, long src_spec, long dst_spec) {
        long __functionAddress = Functions.GetAudioStreamFormat;
        if (CHECKS) {
            check(stream);
        }
        return invokePPPZ(stream, src_spec, dst_spec, __functionAddress);
    }

    /** {@code bool SDL_GetAudioStreamFormat(SDL_AudioStream * stream, SDL_AudioSpec * src_spec, SDL_AudioSpec * dst_spec)} */
    @NativeType("bool")
    public static boolean SDL_GetAudioStreamFormat(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioSpec *") @Nullable SDL_AudioSpec src_spec, @NativeType("SDL_AudioSpec *") @Nullable SDL_AudioSpec dst_spec) {
        return nSDL_GetAudioStreamFormat(stream, memAddressSafe(src_spec), memAddressSafe(dst_spec));
    }

    // --- [ SDL_SetAudioStreamFormat ] ---

    /** {@code bool SDL_SetAudioStreamFormat(SDL_AudioStream * stream, SDL_AudioSpec const * src_spec, SDL_AudioSpec const * dst_spec)} */
    public static boolean nSDL_SetAudioStreamFormat(long stream, long src_spec, long dst_spec) {
        long __functionAddress = Functions.SetAudioStreamFormat;
        if (CHECKS) {
            check(stream);
        }
        return invokePPPZ(stream, src_spec, dst_spec, __functionAddress);
    }

    /** {@code bool SDL_SetAudioStreamFormat(SDL_AudioStream * stream, SDL_AudioSpec const * src_spec, SDL_AudioSpec const * dst_spec)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamFormat(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioSpec const *") @Nullable SDL_AudioSpec src_spec, @NativeType("SDL_AudioSpec const *") @Nullable SDL_AudioSpec dst_spec) {
        return nSDL_SetAudioStreamFormat(stream, memAddressSafe(src_spec), memAddressSafe(dst_spec));
    }

    // --- [ SDL_GetAudioStreamFrequencyRatio ] ---

    /** {@code float SDL_GetAudioStreamFrequencyRatio(SDL_AudioStream * stream)} */
    public static float SDL_GetAudioStreamFrequencyRatio(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamFrequencyRatio;
        if (CHECKS) {
            check(stream);
        }
        return invokePF(stream, __functionAddress);
    }

    // --- [ SDL_SetAudioStreamFrequencyRatio ] ---

    /** {@code bool SDL_SetAudioStreamFrequencyRatio(SDL_AudioStream * stream, float ratio)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamFrequencyRatio(@NativeType("SDL_AudioStream *") long stream, float ratio) {
        long __functionAddress = Functions.SetAudioStreamFrequencyRatio;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, ratio, __functionAddress);
    }

    // --- [ SDL_GetAudioStreamGain ] ---

    /** {@code float SDL_GetAudioStreamGain(SDL_AudioStream * stream)} */
    public static float SDL_GetAudioStreamGain(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamGain;
        if (CHECKS) {
            check(stream);
        }
        return invokePF(stream, __functionAddress);
    }

    // --- [ SDL_SetAudioStreamGain ] ---

    /** {@code bool SDL_SetAudioStreamGain(SDL_AudioStream * stream, float gain)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamGain(@NativeType("SDL_AudioStream *") long stream, float gain) {
        long __functionAddress = Functions.SetAudioStreamGain;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, gain, __functionAddress);
    }

    // --- [ SDL_GetAudioStreamInputChannelMap ] ---

    /** {@code int * SDL_GetAudioStreamInputChannelMap(SDL_AudioStream * stream, int * count)} */
    public static long nSDL_GetAudioStreamInputChannelMap(long stream, long count) {
        long __functionAddress = Functions.GetAudioStreamInputChannelMap;
        if (CHECKS) {
            check(stream);
        }
        return invokePPP(stream, count, __functionAddress);
    }

    /** {@code int * SDL_GetAudioStreamInputChannelMap(SDL_AudioStream * stream, int * count)} */
    @NativeType("int *")
    public static @Nullable IntBuffer SDL_GetAudioStreamInputChannelMap(@NativeType("SDL_AudioStream *") long stream) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioStreamInputChannelMap(stream, memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetAudioStreamOutputChannelMap ] ---

    /** {@code int * SDL_GetAudioStreamOutputChannelMap(SDL_AudioStream * stream, int * count)} */
    public static long nSDL_GetAudioStreamOutputChannelMap(long stream, long count) {
        long __functionAddress = Functions.GetAudioStreamOutputChannelMap;
        if (CHECKS) {
            check(stream);
        }
        return invokePPP(stream, count, __functionAddress);
    }

    /** {@code int * SDL_GetAudioStreamOutputChannelMap(SDL_AudioStream * stream, int * count)} */
    @NativeType("int *")
    public static @Nullable IntBuffer SDL_GetAudioStreamOutputChannelMap(@NativeType("SDL_AudioStream *") long stream) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioStreamOutputChannelMap(stream, memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetAudioStreamInputChannelMap ] ---

    /** {@code bool SDL_SetAudioStreamInputChannelMap(SDL_AudioStream * stream, int const * chmap, int count)} */
    public static boolean nSDL_SetAudioStreamInputChannelMap(long stream, long chmap, int count) {
        long __functionAddress = Functions.SetAudioStreamInputChannelMap;
        if (CHECKS) {
            check(stream);
        }
        return invokePPZ(stream, chmap, count, __functionAddress);
    }

    /** {@code bool SDL_SetAudioStreamInputChannelMap(SDL_AudioStream * stream, int const * chmap, int count)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamInputChannelMap(@NativeType("SDL_AudioStream *") long stream, @NativeType("int const *") @Nullable IntBuffer chmap) {
        return nSDL_SetAudioStreamInputChannelMap(stream, memAddressSafe(chmap), remainingSafe(chmap));
    }

    // --- [ SDL_SetAudioStreamOutputChannelMap ] ---

    /** {@code bool SDL_SetAudioStreamOutputChannelMap(SDL_AudioStream * stream, int const * chmap, int count)} */
    public static boolean nSDL_SetAudioStreamOutputChannelMap(long stream, long chmap, int count) {
        long __functionAddress = Functions.SetAudioStreamOutputChannelMap;
        if (CHECKS) {
            check(stream);
        }
        return invokePPZ(stream, chmap, count, __functionAddress);
    }

    /** {@code bool SDL_SetAudioStreamOutputChannelMap(SDL_AudioStream * stream, int const * chmap, int count)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamOutputChannelMap(@NativeType("SDL_AudioStream *") long stream, @NativeType("int const *") @Nullable IntBuffer chmap) {
        return nSDL_SetAudioStreamOutputChannelMap(stream, memAddressSafe(chmap), remainingSafe(chmap));
    }

    // --- [ SDL_PutAudioStreamData ] ---

    /** {@code bool SDL_PutAudioStreamData(SDL_AudioStream * stream, void const * buf, int len)} */
    public static boolean nSDL_PutAudioStreamData(long stream, long buf, int len) {
        long __functionAddress = Functions.PutAudioStreamData;
        if (CHECKS) {
            check(stream);
        }
        return invokePPZ(stream, buf, len, __functionAddress);
    }

    /** {@code bool SDL_PutAudioStreamData(SDL_AudioStream * stream, void const * buf, int len)} */
    @NativeType("bool")
    public static boolean SDL_PutAudioStreamData(@NativeType("SDL_AudioStream *") long stream, @NativeType("void const *") ByteBuffer buf) {
        return nSDL_PutAudioStreamData(stream, memAddress(buf), buf.remaining());
    }

    // --- [ SDL_GetAudioStreamData ] ---

    /** {@code int SDL_GetAudioStreamData(SDL_AudioStream * stream, void * buf, int len)} */
    public static int nSDL_GetAudioStreamData(long stream, long buf, int len) {
        long __functionAddress = Functions.GetAudioStreamData;
        if (CHECKS) {
            check(stream);
        }
        return invokePPI(stream, buf, len, __functionAddress);
    }

    /** {@code int SDL_GetAudioStreamData(SDL_AudioStream * stream, void * buf, int len)} */
    public static int SDL_GetAudioStreamData(@NativeType("SDL_AudioStream *") long stream, @NativeType("void *") ByteBuffer buf) {
        return nSDL_GetAudioStreamData(stream, memAddress(buf), buf.remaining());
    }

    // --- [ SDL_GetAudioStreamAvailable ] ---

    /** {@code int SDL_GetAudioStreamAvailable(SDL_AudioStream * stream)} */
    public static int SDL_GetAudioStreamAvailable(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamAvailable;
        if (CHECKS) {
            check(stream);
        }
        return invokePI(stream, __functionAddress);
    }

    // --- [ SDL_GetAudioStreamQueued ] ---

    /** {@code int SDL_GetAudioStreamQueued(SDL_AudioStream * stream)} */
    public static int SDL_GetAudioStreamQueued(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamQueued;
        if (CHECKS) {
            check(stream);
        }
        return invokePI(stream, __functionAddress);
    }

    // --- [ SDL_FlushAudioStream ] ---

    /** {@code bool SDL_FlushAudioStream(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_FlushAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.FlushAudioStream;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_ClearAudioStream ] ---

    /** {@code bool SDL_ClearAudioStream(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_ClearAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.ClearAudioStream;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_PauseAudioStreamDevice ] ---

    /** {@code bool SDL_PauseAudioStreamDevice(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_PauseAudioStreamDevice(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.PauseAudioStreamDevice;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_ResumeAudioStreamDevice ] ---

    /** {@code bool SDL_ResumeAudioStreamDevice(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_ResumeAudioStreamDevice(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.ResumeAudioStreamDevice;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_LockAudioStream ] ---

    /** {@code bool SDL_LockAudioStream(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_LockAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.LockAudioStream;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_UnlockAudioStream ] ---

    /** {@code bool SDL_UnlockAudioStream(SDL_AudioStream * stream)} */
    @NativeType("bool")
    public static boolean SDL_UnlockAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.UnlockAudioStream;
        if (CHECKS) {
            check(stream);
        }
        return invokePZ(stream, __functionAddress);
    }

    // --- [ SDL_SetAudioStreamGetCallback ] ---

    /** {@code bool SDL_SetAudioStreamGetCallback(SDL_AudioStream * stream, SDL_AudioStreamCallback callback, void * userdata)} */
    public static boolean nSDL_SetAudioStreamGetCallback(long stream, long callback, long userdata) {
        long __functionAddress = Functions.SetAudioStreamGetCallback;
        if (CHECKS) {
            check(stream);
        }
        return invokePPPZ(stream, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_SetAudioStreamGetCallback(SDL_AudioStream * stream, SDL_AudioStreamCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamGetCallback(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioStreamCallback") @Nullable SDL_AudioStreamCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_SetAudioStreamGetCallback(stream, memAddressSafe(callback), userdata);
    }

    // --- [ SDL_SetAudioStreamPutCallback ] ---

    /** {@code bool SDL_SetAudioStreamPutCallback(SDL_AudioStream * stream, SDL_AudioStreamCallback callback, void * userdata)} */
    public static boolean nSDL_SetAudioStreamPutCallback(long stream, long callback, long userdata) {
        long __functionAddress = Functions.SetAudioStreamPutCallback;
        if (CHECKS) {
            check(stream);
        }
        return invokePPPZ(stream, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_SetAudioStreamPutCallback(SDL_AudioStream * stream, SDL_AudioStreamCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioStreamPutCallback(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioStreamCallback") @Nullable SDL_AudioStreamCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_SetAudioStreamPutCallback(stream, memAddressSafe(callback), userdata);
    }

    // --- [ SDL_DestroyAudioStream ] ---

    /** {@code void SDL_DestroyAudioStream(SDL_AudioStream * stream)} */
    public static void SDL_DestroyAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.DestroyAudioStream;
        if (CHECKS) {
            check(stream);
        }
        invokePV(stream, __functionAddress);
    }

    // --- [ SDL_OpenAudioDeviceStream ] ---

    /** {@code SDL_AudioStream * SDL_OpenAudioDeviceStream(SDL_AudioDeviceID devid, SDL_AudioSpec const * spec, SDL_AudioStreamCallback callback, void * userdata)} */
    public static long nSDL_OpenAudioDeviceStream(int devid, long spec, long callback, long userdata) {
        long __functionAddress = Functions.OpenAudioDeviceStream;
        return invokePPPP(devid, spec, callback, userdata, __functionAddress);
    }

    /** {@code SDL_AudioStream * SDL_OpenAudioDeviceStream(SDL_AudioDeviceID devid, SDL_AudioSpec const * spec, SDL_AudioStreamCallback callback, void * userdata)} */
    @NativeType("SDL_AudioStream *")
    public static long SDL_OpenAudioDeviceStream(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioSpec const *") @Nullable SDL_AudioSpec spec, @NativeType("SDL_AudioStreamCallback") @Nullable SDL_AudioStreamCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_OpenAudioDeviceStream(devid, memAddressSafe(spec), memAddressSafe(callback), userdata);
    }

    // --- [ SDL_SetAudioPostmixCallback ] ---

    /** {@code bool SDL_SetAudioPostmixCallback(SDL_AudioDeviceID devid, SDL_AudioPostmixCallback callback, void * userdata)} */
    public static boolean nSDL_SetAudioPostmixCallback(int devid, long callback, long userdata) {
        long __functionAddress = Functions.SetAudioPostmixCallback;
        return invokePPZ(devid, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_SetAudioPostmixCallback(SDL_AudioDeviceID devid, SDL_AudioPostmixCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_SetAudioPostmixCallback(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioPostmixCallback") @Nullable SDL_AudioPostmixCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_SetAudioPostmixCallback(devid, memAddressSafe(callback), userdata);
    }

    // --- [ SDL_LoadWAV_IO ] ---

    /** {@code bool SDL_LoadWAV_IO(SDL_IOStream * src, bool closeio, SDL_AudioSpec * spec, Uint8 ** audio_buf, Uint32 * audio_len)} */
    public static boolean nSDL_LoadWAV_IO(long src, boolean closeio, long spec, long audio_buf, long audio_len) {
        long __functionAddress = Functions.LoadWAV_IO;
        if (CHECKS) {
            check(src);
        }
        return invokePPPPZ(src, closeio, spec, audio_buf, audio_len, __functionAddress);
    }

    /** {@code bool SDL_LoadWAV_IO(SDL_IOStream * src, bool closeio, SDL_AudioSpec * spec, Uint8 ** audio_buf, Uint32 * audio_len)} */
    @NativeType("bool")
    public static boolean SDL_LoadWAV_IO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("Uint8 **") PointerBuffer audio_buf, @NativeType("Uint32 *") IntBuffer audio_len) {
        if (CHECKS) {
            check(audio_buf, 1);
            check(audio_len, 1);
        }
        return nSDL_LoadWAV_IO(src, closeio, spec.address(), memAddress(audio_buf), memAddress(audio_len));
    }

    // --- [ SDL_LoadWAV ] ---

    /** {@code bool SDL_LoadWAV(char const * path, SDL_AudioSpec * spec, Uint8 ** audio_buf, Uint32 * audio_len)} */
    public static boolean nSDL_LoadWAV(long path, long spec, long audio_buf, long audio_len) {
        long __functionAddress = Functions.LoadWAV;
        return invokePPPPZ(path, spec, audio_buf, audio_len, __functionAddress);
    }

    /** {@code bool SDL_LoadWAV(char const * path, SDL_AudioSpec * spec, Uint8 ** audio_buf, Uint32 * audio_len)} */
    @NativeType("bool")
    public static boolean SDL_LoadWAV(@NativeType("char const *") ByteBuffer path, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("Uint8 **") PointerBuffer audio_buf, @NativeType("Uint32 *") IntBuffer audio_len) {
        if (CHECKS) {
            checkNT1(path);
            check(audio_buf, 1);
            check(audio_len, 1);
        }
        return nSDL_LoadWAV(memAddress(path), spec.address(), memAddress(audio_buf), memAddress(audio_len));
    }

    /** {@code bool SDL_LoadWAV(char const * path, SDL_AudioSpec * spec, Uint8 ** audio_buf, Uint32 * audio_len)} */
    @NativeType("bool")
    public static boolean SDL_LoadWAV(@NativeType("char const *") CharSequence path, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("Uint8 **") PointerBuffer audio_buf, @NativeType("Uint32 *") IntBuffer audio_len) {
        if (CHECKS) {
            check(audio_buf, 1);
            check(audio_len, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_LoadWAV(pathEncoded, spec.address(), memAddress(audio_buf), memAddress(audio_len));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_MixAudio ] ---

    /** {@code bool SDL_MixAudio(Uint8 * dst, Uint8 const * src, SDL_AudioFormat format, Uint32 len, float volume)} */
    public static boolean nSDL_MixAudio(long dst, long src, int format, int len, float volume) {
        long __functionAddress = Functions.MixAudio;
        return invokePPZ(dst, src, format, len, volume, __functionAddress);
    }

    /** {@code bool SDL_MixAudio(Uint8 * dst, Uint8 const * src, SDL_AudioFormat format, Uint32 len, float volume)} */
    @NativeType("bool")
    public static boolean SDL_MixAudio(@NativeType("Uint8 *") ByteBuffer dst, @NativeType("Uint8 const *") ByteBuffer src, @NativeType("SDL_AudioFormat") int format, float volume) {
        if (CHECKS) {
            check(dst, src.remaining());
        }
        return nSDL_MixAudio(memAddress(dst), memAddress(src), format, src.remaining(), volume);
    }

    // --- [ SDL_ConvertAudioSamples ] ---

    /** {@code bool SDL_ConvertAudioSamples(SDL_AudioSpec const * src_spec, Uint8 const * src_data, int src_len, SDL_AudioSpec const * dst_spec, Uint8 ** dst_data, int * dst_len)} */
    public static boolean nSDL_ConvertAudioSamples(long src_spec, long src_data, int src_len, long dst_spec, long dst_data, long dst_len) {
        long __functionAddress = Functions.ConvertAudioSamples;
        return invokePPPPPZ(src_spec, src_data, src_len, dst_spec, dst_data, dst_len, __functionAddress);
    }

    /** {@code bool SDL_ConvertAudioSamples(SDL_AudioSpec const * src_spec, Uint8 const * src_data, int src_len, SDL_AudioSpec const * dst_spec, Uint8 ** dst_data, int * dst_len)} */
    @NativeType("bool")
    public static boolean SDL_ConvertAudioSamples(@NativeType("SDL_AudioSpec const *") SDL_AudioSpec src_spec, @NativeType("Uint8 const *") ByteBuffer src_data, @NativeType("SDL_AudioSpec const *") SDL_AudioSpec dst_spec, @NativeType("Uint8 **") PointerBuffer dst_data, @NativeType("int *") IntBuffer dst_len) {
        if (CHECKS) {
            check(dst_data, 1);
            check(dst_len, 1);
        }
        return nSDL_ConvertAudioSamples(src_spec.address(), memAddress(src_data), src_data.remaining(), dst_spec.address(), memAddress(dst_data), memAddress(dst_len));
    }

    // --- [ SDL_GetAudioFormatName ] ---

    /** {@code char const * SDL_GetAudioFormatName(SDL_AudioFormat format)} */
    public static long nSDL_GetAudioFormatName(int format) {
        long __functionAddress = Functions.GetAudioFormatName;
        return invokeP(format, __functionAddress);
    }

    /** {@code char const * SDL_GetAudioFormatName(SDL_AudioFormat format)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAudioFormatName(@NativeType("SDL_AudioFormat") int format) {
        long __result = nSDL_GetAudioFormatName(format);
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetSilenceValueForFormat ] ---

    /** {@code int SDL_GetSilenceValueForFormat(SDL_AudioFormat format)} */
    public static int SDL_GetSilenceValueForFormat(@NativeType("SDL_AudioFormat") int format) {
        long __functionAddress = Functions.GetSilenceValueForFormat;
        return invokeI(format, __functionAddress);
    }

    // --- [ SDL_ComposeCustomBlendMode ] ---

    /** {@code SDL_BlendMode SDL_ComposeCustomBlendMode(SDL_BlendFactor srcColorFactor, SDL_BlendFactor dstColorFactor, SDL_BlendOperation colorOperation, SDL_BlendFactor srcAlphaFactor, SDL_BlendFactor dstAlphaFactor, SDL_BlendOperation alphaOperation)} */
    @NativeType("SDL_BlendMode")
    public static int SDL_ComposeCustomBlendMode(@NativeType("SDL_BlendFactor") int srcColorFactor, @NativeType("SDL_BlendFactor") int dstColorFactor, @NativeType("SDL_BlendOperation") int colorOperation, @NativeType("SDL_BlendFactor") int srcAlphaFactor, @NativeType("SDL_BlendFactor") int dstAlphaFactor, @NativeType("SDL_BlendOperation") int alphaOperation) {
        long __functionAddress = Functions.ComposeCustomBlendMode;
        return invokeI(srcColorFactor, dstColorFactor, colorOperation, srcAlphaFactor, dstAlphaFactor, alphaOperation, __functionAddress);
    }

    // --- [ SDL_GetNumCameraDrivers ] ---

    /** {@code int SDL_GetNumCameraDrivers(void)} */
    public static int SDL_GetNumCameraDrivers() {
        long __functionAddress = Functions.GetNumCameraDrivers;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetCameraDriver ] ---

    /** {@code char const * SDL_GetCameraDriver(int index)} */
    public static long nSDL_GetCameraDriver(int index) {
        long __functionAddress = Functions.GetCameraDriver;
        return invokeP(index, __functionAddress);
    }

    /** {@code char const * SDL_GetCameraDriver(int index)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetCameraDriver(int index) {
        long __result = nSDL_GetCameraDriver(index);
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetCurrentCameraDriver ] ---

    /** {@code char const * SDL_GetCurrentCameraDriver(void)} */
    public static long nSDL_GetCurrentCameraDriver() {
        long __functionAddress = Functions.GetCurrentCameraDriver;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetCurrentCameraDriver(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetCurrentCameraDriver() {
        long __result = nSDL_GetCurrentCameraDriver();
        return memASCIISafe(__result);
    }

    // --- [ SDL_GetCameras ] ---

    /** {@code SDL_CameraID * SDL_GetCameras(int * count)} */
    public static long nSDL_GetCameras(long count) {
        long __functionAddress = Functions.GetCameras;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_CameraID * SDL_GetCameras(int * count)} */
    @NativeType("SDL_CameraID *")
    public static @Nullable IntBuffer SDL_GetCameras() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetCameras(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetCameraSupportedFormats ] ---

    /** {@code SDL_CameraSpec ** SDL_GetCameraSupportedFormats(SDL_CameraID devid, int * count)} */
    public static long nSDL_GetCameraSupportedFormats(int devid, long count) {
        long __functionAddress = Functions.GetCameraSupportedFormats;
        return invokePP(devid, count, __functionAddress);
    }

    /** {@code SDL_CameraSpec ** SDL_GetCameraSupportedFormats(SDL_CameraID devid, int * count)} */
    @NativeType("SDL_CameraSpec **")
    public static @Nullable PointerBuffer SDL_GetCameraSupportedFormats(@NativeType("SDL_CameraID") int devid) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetCameraSupportedFormats(devid, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetCameraName ] ---

    /** {@code char const * SDL_GetCameraName(SDL_CameraID instance_id)} */
    public static long nSDL_GetCameraName(int instance_id) {
        long __functionAddress = Functions.GetCameraName;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetCameraName(SDL_CameraID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetCameraName(@NativeType("SDL_CameraID") int instance_id) {
        long __result = nSDL_GetCameraName(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetCameraPosition ] ---

    /** {@code SDL_CameraPosition SDL_GetCameraPosition(SDL_CameraID instance_id)} */
    @NativeType("SDL_CameraPosition")
    public static int SDL_GetCameraPosition(@NativeType("SDL_CameraID") int instance_id) {
        long __functionAddress = Functions.GetCameraPosition;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_OpenCamera ] ---

    /** {@code SDL_Camera * SDL_OpenCamera(SDL_CameraID instance_id, SDL_CameraSpec const * spec)} */
    public static long nSDL_OpenCamera(int instance_id, long spec) {
        long __functionAddress = Functions.OpenCamera;
        return invokePP(instance_id, spec, __functionAddress);
    }

    /** {@code SDL_Camera * SDL_OpenCamera(SDL_CameraID instance_id, SDL_CameraSpec const * spec)} */
    @NativeType("SDL_Camera *")
    public static long SDL_OpenCamera(@NativeType("SDL_CameraID") int instance_id, @NativeType("SDL_CameraSpec const *") @Nullable SDL_CameraSpec spec) {
        return nSDL_OpenCamera(instance_id, memAddressSafe(spec));
    }

    // --- [ SDL_GetCameraPermissionState ] ---

    /** {@code int SDL_GetCameraPermissionState(SDL_Camera * camera)} */
    public static int SDL_GetCameraPermissionState(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.GetCameraPermissionState;
        if (CHECKS) {
            check(camera);
        }
        return invokePI(camera, __functionAddress);
    }

    // --- [ SDL_GetCameraID ] ---

    /** {@code SDL_CameraID SDL_GetCameraID(SDL_Camera * camera)} */
    @NativeType("SDL_CameraID")
    public static int SDL_GetCameraID(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.GetCameraID;
        if (CHECKS) {
            check(camera);
        }
        return invokePI(camera, __functionAddress);
    }

    // --- [ SDL_GetCameraProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetCameraProperties(SDL_Camera * camera)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetCameraProperties(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.GetCameraProperties;
        if (CHECKS) {
            check(camera);
        }
        return invokePI(camera, __functionAddress);
    }

    // --- [ SDL_GetCameraFormat ] ---

    /** {@code bool SDL_GetCameraFormat(SDL_Camera * camera, SDL_CameraSpec * spec)} */
    public static boolean nSDL_GetCameraFormat(long camera, long spec) {
        long __functionAddress = Functions.GetCameraFormat;
        if (CHECKS) {
            check(camera);
        }
        return invokePPZ(camera, spec, __functionAddress);
    }

    /** {@code bool SDL_GetCameraFormat(SDL_Camera * camera, SDL_CameraSpec * spec)} */
    @NativeType("bool")
    public static boolean SDL_GetCameraFormat(@NativeType("SDL_Camera *") long camera, @NativeType("SDL_CameraSpec *") SDL_CameraSpec spec) {
        return nSDL_GetCameraFormat(camera, spec.address());
    }

    // --- [ SDL_AcquireCameraFrame ] ---

    /** {@code SDL_Surface * SDL_AcquireCameraFrame(SDL_Camera * camera, Uint64 * timestampNS)} */
    public static long nSDL_AcquireCameraFrame(long camera, long timestampNS) {
        long __functionAddress = Functions.AcquireCameraFrame;
        if (CHECKS) {
            check(camera);
        }
        return invokePPP(camera, timestampNS, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_AcquireCameraFrame(SDL_Camera * camera, Uint64 * timestampNS)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_AcquireCameraFrame(@NativeType("SDL_Camera *") long camera, @NativeType("Uint64 *") @Nullable LongBuffer timestampNS) {
        if (CHECKS) {
            checkSafe(timestampNS, 1);
        }
        long __result = nSDL_AcquireCameraFrame(camera, memAddressSafe(timestampNS));
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_ReleaseCameraFrame ] ---

    /** {@code void SDL_ReleaseCameraFrame(SDL_Camera * camera, SDL_Surface * frame)} */
    public static void nSDL_ReleaseCameraFrame(long camera, long frame) {
        long __functionAddress = Functions.ReleaseCameraFrame;
        if (CHECKS) {
            check(camera);
        }
        invokePPV(camera, frame, __functionAddress);
    }

    /** {@code void SDL_ReleaseCameraFrame(SDL_Camera * camera, SDL_Surface * frame)} */
    public static void SDL_ReleaseCameraFrame(@NativeType("SDL_Camera *") long camera, @NativeType("SDL_Surface *") SDL_Surface frame) {
        nSDL_ReleaseCameraFrame(camera, frame.address());
    }

    // --- [ SDL_CloseCamera ] ---

    /** {@code void SDL_CloseCamera(SDL_Camera * camera)} */
    public static void SDL_CloseCamera(@NativeType("SDL_Camera *") long camera) {
        long __functionAddress = Functions.CloseCamera;
        if (CHECKS) {
            check(camera);
        }
        invokePV(camera, __functionAddress);
    }

    // --- [ SDL_SetClipboardText ] ---

    /** {@code bool SDL_SetClipboardText(char const * text)} */
    public static boolean nSDL_SetClipboardText(long text) {
        long __functionAddress = Functions.SetClipboardText;
        return invokePZ(text, __functionAddress);
    }

    /** {@code bool SDL_SetClipboardText(char const * text)} */
    @NativeType("bool")
    public static boolean SDL_SetClipboardText(@NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nSDL_SetClipboardText(memAddress(text));
    }

    /** {@code bool SDL_SetClipboardText(char const * text)} */
    @NativeType("bool")
    public static boolean SDL_SetClipboardText(@NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nSDL_SetClipboardText(textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetClipboardText ] ---

    /** {@code char * SDL_GetClipboardText(void)} */
    public static long nSDL_GetClipboardText() {
        long __functionAddress = Functions.GetClipboardText;
        return invokeP(__functionAddress);
    }

    /** {@code char * SDL_GetClipboardText(void)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetClipboardText() {
        long __result = NULL;
        try {
            __result = nSDL_GetClipboardText();
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    // --- [ SDL_HasClipboardText ] ---

    /** {@code bool SDL_HasClipboardText(void)} */
    @NativeType("bool")
    public static boolean SDL_HasClipboardText() {
        long __functionAddress = Functions.HasClipboardText;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_SetPrimarySelectionText ] ---

    /** {@code bool SDL_SetPrimarySelectionText(char const * text)} */
    public static boolean nSDL_SetPrimarySelectionText(long text) {
        long __functionAddress = Functions.SetPrimarySelectionText;
        return invokePZ(text, __functionAddress);
    }

    /** {@code bool SDL_SetPrimarySelectionText(char const * text)} */
    @NativeType("bool")
    public static boolean SDL_SetPrimarySelectionText(@NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nSDL_SetPrimarySelectionText(memAddress(text));
    }

    /** {@code bool SDL_SetPrimarySelectionText(char const * text)} */
    @NativeType("bool")
    public static boolean SDL_SetPrimarySelectionText(@NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nSDL_SetPrimarySelectionText(textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetPrimarySelectionText ] ---

    /** {@code char * SDL_GetPrimarySelectionText(void)} */
    public static long nSDL_GetPrimarySelectionText() {
        long __functionAddress = Functions.GetPrimarySelectionText;
        return invokeP(__functionAddress);
    }

    /** {@code char * SDL_GetPrimarySelectionText(void)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetPrimarySelectionText() {
        long __result = NULL;
        try {
            __result = nSDL_GetPrimarySelectionText();
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    // --- [ SDL_HasPrimarySelectionText ] ---

    /** {@code bool SDL_HasPrimarySelectionText(void)} */
    @NativeType("bool")
    public static boolean SDL_HasPrimarySelectionText() {
        long __functionAddress = Functions.HasPrimarySelectionText;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_SetClipboardData ] ---

    /** {@code bool SDL_SetClipboardData(SDL_ClipboardDataCallback callback, SDL_ClipboardCleanupCallback cleanup, void * userdata, char const ** mime_types, size_t num_mime_types)} */
    public static boolean nSDL_SetClipboardData(long callback, long cleanup, long userdata, long mime_types, long num_mime_types) {
        long __functionAddress = Functions.SetClipboardData;
        return invokePPPPPZ(callback, cleanup, userdata, mime_types, num_mime_types, __functionAddress);
    }

    /** {@code bool SDL_SetClipboardData(SDL_ClipboardDataCallback callback, SDL_ClipboardCleanupCallback cleanup, void * userdata, char const ** mime_types, size_t num_mime_types)} */
    @NativeType("bool")
    public static boolean SDL_SetClipboardData(@NativeType("SDL_ClipboardDataCallback") SDL_ClipboardDataCallbackI callback, @NativeType("SDL_ClipboardCleanupCallback") SDL_ClipboardCleanupCallbackI cleanup, @NativeType("void *") long userdata, @NativeType("char const **") PointerBuffer mime_types) {
        return nSDL_SetClipboardData(callback.address(), cleanup.address(), userdata, memAddress(mime_types), mime_types.remaining());
    }

    // --- [ SDL_ClearClipboardData ] ---

    /** {@code bool SDL_ClearClipboardData(void)} */
    @NativeType("bool")
    public static boolean SDL_ClearClipboardData() {
        long __functionAddress = Functions.ClearClipboardData;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetClipboardData ] ---

    /** {@code void * SDL_GetClipboardData(char const * mime_type, size_t * size)} */
    public static long nSDL_GetClipboardData(long mime_type, long size) {
        long __functionAddress = Functions.GetClipboardData;
        return invokePPP(mime_type, size, __functionAddress);
    }

    /** {@code void * SDL_GetClipboardData(char const * mime_type, size_t * size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_GetClipboardData(@NativeType("char const *") ByteBuffer mime_type) {
        if (CHECKS) {
            checkNT1(mime_type);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer size = stack.callocPointer(1);
        try {
            long __result = nSDL_GetClipboardData(memAddress(mime_type), memAddress(size));
            return memByteBufferSafe(__result, (int)size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void * SDL_GetClipboardData(char const * mime_type, size_t * size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_GetClipboardData(@NativeType("char const *") CharSequence mime_type) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer size = stack.callocPointer(1);
            stack.nASCII(mime_type, true);
            long mime_typeEncoded = stack.getPointerAddress();
            long __result = nSDL_GetClipboardData(mime_typeEncoded, memAddress(size));
            return memByteBufferSafe(__result, (int)size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_HasClipboardData ] ---

    /** {@code bool SDL_HasClipboardData(char const * mime_type)} */
    public static boolean nSDL_HasClipboardData(long mime_type) {
        long __functionAddress = Functions.HasClipboardData;
        return invokePZ(mime_type, __functionAddress);
    }

    /** {@code bool SDL_HasClipboardData(char const * mime_type)} */
    @NativeType("bool")
    public static boolean SDL_HasClipboardData(@NativeType("char const *") ByteBuffer mime_type) {
        if (CHECKS) {
            checkNT1(mime_type);
        }
        return nSDL_HasClipboardData(memAddress(mime_type));
    }

    /** {@code bool SDL_HasClipboardData(char const * mime_type)} */
    @NativeType("bool")
    public static boolean SDL_HasClipboardData(@NativeType("char const *") CharSequence mime_type) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(mime_type, true);
            long mime_typeEncoded = stack.getPointerAddress();
            return nSDL_HasClipboardData(mime_typeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetClipboardMimeTypes ] ---

    /** {@code char ** SDL_GetClipboardMimeTypes(size_t * num_mime_types)} */
    public static long nSDL_GetClipboardMimeTypes(long num_mime_types) {
        long __functionAddress = Functions.GetClipboardMimeTypes;
        return invokePP(num_mime_types, __functionAddress);
    }

    /** {@code char ** SDL_GetClipboardMimeTypes(size_t * num_mime_types)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GetClipboardMimeTypes() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer num_mime_types = stack.callocPointer(1);
        try {
            long __result = nSDL_GetClipboardMimeTypes(memAddress(num_mime_types));
            return memPointerBufferSafe(__result, (int)num_mime_types.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetNumLogicalCPUCores ] ---

    /** {@code int SDL_GetNumLogicalCPUCores(void)} */
    public static int SDL_GetNumLogicalCPUCores() {
        long __functionAddress = Functions.GetNumLogicalCPUCores;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetCPUCacheLineSize ] ---

    /** {@code int SDL_GetCPUCacheLineSize(void)} */
    public static int SDL_GetCPUCacheLineSize() {
        long __functionAddress = Functions.GetCPUCacheLineSize;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_HasAltiVec ] ---

    /** {@code bool SDL_HasAltiVec(void)} */
    @NativeType("bool")
    public static boolean SDL_HasAltiVec() {
        long __functionAddress = Functions.HasAltiVec;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasMMX ] ---

    /** {@code bool SDL_HasMMX(void)} */
    @NativeType("bool")
    public static boolean SDL_HasMMX() {
        long __functionAddress = Functions.HasMMX;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasSSE ] ---

    /** {@code bool SDL_HasSSE(void)} */
    @NativeType("bool")
    public static boolean SDL_HasSSE() {
        long __functionAddress = Functions.HasSSE;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasSSE2 ] ---

    /** {@code bool SDL_HasSSE2(void)} */
    @NativeType("bool")
    public static boolean SDL_HasSSE2() {
        long __functionAddress = Functions.HasSSE2;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasSSE3 ] ---

    /** {@code bool SDL_HasSSE3(void)} */
    @NativeType("bool")
    public static boolean SDL_HasSSE3() {
        long __functionAddress = Functions.HasSSE3;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasSSE41 ] ---

    /** {@code bool SDL_HasSSE41(void)} */
    @NativeType("bool")
    public static boolean SDL_HasSSE41() {
        long __functionAddress = Functions.HasSSE41;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasSSE42 ] ---

    /** {@code bool SDL_HasSSE42(void)} */
    @NativeType("bool")
    public static boolean SDL_HasSSE42() {
        long __functionAddress = Functions.HasSSE42;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasAVX ] ---

    /** {@code bool SDL_HasAVX(void)} */
    @NativeType("bool")
    public static boolean SDL_HasAVX() {
        long __functionAddress = Functions.HasAVX;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasAVX2 ] ---

    /** {@code bool SDL_HasAVX2(void)} */
    @NativeType("bool")
    public static boolean SDL_HasAVX2() {
        long __functionAddress = Functions.HasAVX2;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasAVX512F ] ---

    /** {@code bool SDL_HasAVX512F(void)} */
    @NativeType("bool")
    public static boolean SDL_HasAVX512F() {
        long __functionAddress = Functions.HasAVX512F;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasARMSIMD ] ---

    /** {@code bool SDL_HasARMSIMD(void)} */
    @NativeType("bool")
    public static boolean SDL_HasARMSIMD() {
        long __functionAddress = Functions.HasARMSIMD;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasNEON ] ---

    /** {@code bool SDL_HasNEON(void)} */
    @NativeType("bool")
    public static boolean SDL_HasNEON() {
        long __functionAddress = Functions.HasNEON;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasLSX ] ---

    /** {@code bool SDL_HasLSX(void)} */
    @NativeType("bool")
    public static boolean SDL_HasLSX() {
        long __functionAddress = Functions.HasLSX;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HasLASX ] ---

    /** {@code bool SDL_HasLASX(void)} */
    @NativeType("bool")
    public static boolean SDL_HasLASX() {
        long __functionAddress = Functions.HasLASX;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetSystemRAM ] ---

    /** {@code int SDL_GetSystemRAM(void)} */
    public static int SDL_GetSystemRAM() {
        long __functionAddress = Functions.GetSystemRAM;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetSIMDAlignment ] ---

    /** {@code size_t SDL_GetSIMDAlignment(void)} */
    @NativeType("size_t")
    public static long SDL_GetSIMDAlignment() {
        long __functionAddress = Functions.GetSIMDAlignment;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_ShowOpenFileDialog ] ---

    /** {@code void SDL_ShowOpenFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location, bool allow_many)} */
    public static void nSDL_ShowOpenFileDialog(long callback, long userdata, long window, long filters, int nfilters, long default_location, boolean allow_many) {
        long __functionAddress = Functions.ShowOpenFileDialog;
        if (CHECKS) {
            if (filters != NULL) { Struct.validate(filters, nfilters, SDL_DialogFileFilter.SIZEOF, SDL_DialogFileFilter::validate); }
        }
        invokePPPPPV(callback, userdata, window, filters, nfilters, default_location, allow_many, __functionAddress);
    }

    /** {@code void SDL_ShowOpenFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location, bool allow_many)} */
    public static void SDL_ShowOpenFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.@Nullable Buffer filters, @NativeType("char const *") @Nullable ByteBuffer default_location, @NativeType("bool") boolean allow_many) {
        if (CHECKS) {
            checkNT1Safe(default_location);
        }
        nSDL_ShowOpenFileDialog(callback.address(), userdata, window, memAddressSafe(filters), remainingSafe(filters), memAddressSafe(default_location), allow_many);
    }

    /** {@code void SDL_ShowOpenFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location, bool allow_many)} */
    public static void SDL_ShowOpenFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.@Nullable Buffer filters, @NativeType("char const *") @Nullable CharSequence default_location, @NativeType("bool") boolean allow_many) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(default_location, true);
            long default_locationEncoded = default_location == null ? NULL : stack.getPointerAddress();
            nSDL_ShowOpenFileDialog(callback.address(), userdata, window, memAddressSafe(filters), remainingSafe(filters), default_locationEncoded, allow_many);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ShowSaveFileDialog ] ---

    /** {@code void SDL_ShowSaveFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location)} */
    public static void nSDL_ShowSaveFileDialog(long callback, long userdata, long window, long filters, int nfilters, long default_location) {
        long __functionAddress = Functions.ShowSaveFileDialog;
        if (CHECKS) {
            if (filters != NULL) { Struct.validate(filters, nfilters, SDL_DialogFileFilter.SIZEOF, SDL_DialogFileFilter::validate); }
        }
        invokePPPPPV(callback, userdata, window, filters, nfilters, default_location, __functionAddress);
    }

    /** {@code void SDL_ShowSaveFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location)} */
    public static void SDL_ShowSaveFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.@Nullable Buffer filters, @NativeType("char const *") @Nullable ByteBuffer default_location) {
        if (CHECKS) {
            checkNT1Safe(default_location);
        }
        nSDL_ShowSaveFileDialog(callback.address(), userdata, window, memAddressSafe(filters), remainingSafe(filters), memAddressSafe(default_location));
    }

    /** {@code void SDL_ShowSaveFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location)} */
    public static void SDL_ShowSaveFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.@Nullable Buffer filters, @NativeType("char const *") @Nullable CharSequence default_location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(default_location, true);
            long default_locationEncoded = default_location == null ? NULL : stack.getPointerAddress();
            nSDL_ShowSaveFileDialog(callback.address(), userdata, window, memAddressSafe(filters), remainingSafe(filters), default_locationEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ShowOpenFolderDialog ] ---

    /** {@code void SDL_ShowOpenFolderDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, char const * default_location, bool allow_many)} */
    public static void nSDL_ShowOpenFolderDialog(long callback, long userdata, long window, long default_location, boolean allow_many) {
        long __functionAddress = Functions.ShowOpenFolderDialog;
        invokePPPPV(callback, userdata, window, default_location, allow_many, __functionAddress);
    }

    /** {@code void SDL_ShowOpenFolderDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, char const * default_location, bool allow_many)} */
    public static void SDL_ShowOpenFolderDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("char const *") @Nullable ByteBuffer default_location, @NativeType("bool") boolean allow_many) {
        if (CHECKS) {
            checkNT1Safe(default_location);
        }
        nSDL_ShowOpenFolderDialog(callback.address(), userdata, window, memAddressSafe(default_location), allow_many);
    }

    /** {@code void SDL_ShowOpenFolderDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, char const * default_location, bool allow_many)} */
    public static void SDL_ShowOpenFolderDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("char const *") @Nullable CharSequence default_location, @NativeType("bool") boolean allow_many) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(default_location, true);
            long default_locationEncoded = default_location == null ? NULL : stack.getPointerAddress();
            nSDL_ShowOpenFolderDialog(callback.address(), userdata, window, default_locationEncoded, allow_many);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ShowFileDialogWithProperties ] ---

    /** {@code void SDL_ShowFileDialogWithProperties(SDL_FileDialogType type, SDL_DialogFileCallback callback, void * userdata, SDL_PropertiesID props)} */
    public static void nSDL_ShowFileDialogWithProperties(int type, long callback, long userdata, int props) {
        long __functionAddress = Functions.ShowFileDialogWithProperties;
        invokePPV(type, callback, userdata, props, __functionAddress);
    }

    /** {@code void SDL_ShowFileDialogWithProperties(SDL_FileDialogType type, SDL_DialogFileCallback callback, void * userdata, SDL_PropertiesID props)} */
    public static void SDL_ShowFileDialogWithProperties(@NativeType("SDL_FileDialogType") int type, @NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_PropertiesID") int props) {
        nSDL_ShowFileDialogWithProperties(type, callback.address(), userdata, props);
    }

    // --- [ SDL_SetError ] ---

    /** {@code bool SDL_SetError(char const * fmt)} */
    public static boolean nSDL_SetError(long fmt) {
        long __functionAddress = Functions.SetError;
        return invokePZ(fmt, __functionAddress);
    }

    /** {@code bool SDL_SetError(char const * fmt)} */
    @NativeType("bool")
    public static boolean SDL_SetError(@NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        return nSDL_SetError(memAddress(fmt));
    }

    /** {@code bool SDL_SetError(char const * fmt)} */
    @NativeType("bool")
    public static boolean SDL_SetError(@NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            return nSDL_SetError(fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetErrorV ] ---

    /** {@code bool SDL_SetErrorV(char const * fmt, va_list ap)} */
    public static boolean nSDL_SetErrorV(long fmt, long ap) {
        long __functionAddress = Functions.SetErrorV;
        if (CHECKS) {
            check(ap);
        }
        return invokePPZ(fmt, ap, __functionAddress);
    }

    /** {@code bool SDL_SetErrorV(char const * fmt, va_list ap)} */
    @NativeType("bool")
    public static boolean SDL_SetErrorV(@NativeType("char const *") ByteBuffer fmt, @NativeType("va_list") long ap) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        return nSDL_SetErrorV(memAddress(fmt), ap);
    }

    /** {@code bool SDL_SetErrorV(char const * fmt, va_list ap)} */
    @NativeType("bool")
    public static boolean SDL_SetErrorV(@NativeType("char const *") CharSequence fmt, @NativeType("va_list") long ap) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            return nSDL_SetErrorV(fmtEncoded, ap);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_OutOfMemory ] ---

    /** {@code bool SDL_OutOfMemory(void)} */
    @NativeType("bool")
    public static boolean SDL_OutOfMemory() {
        long __functionAddress = Functions.OutOfMemory;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetError ] ---

    /** {@code char const * SDL_GetError(void)} */
    public static long nSDL_GetError() {
        long __functionAddress = Functions.GetError;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetError(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetError() {
        long __result = nSDL_GetError();
        return memUTF8Safe(__result);
    }

    // --- [ SDL_ClearError ] ---

    /** {@code bool SDL_ClearError(void)} */
    @NativeType("bool")
    public static boolean SDL_ClearError() {
        long __functionAddress = Functions.ClearError;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_PumpEvents ] ---

    /** {@code void SDL_PumpEvents(void)} */
    public static void SDL_PumpEvents() {
        long __functionAddress = Functions.PumpEvents;
        invokeV(__functionAddress);
    }

    // --- [ SDL_PeepEvents ] ---

    /** {@code int SDL_PeepEvents(SDL_Event * events, int numevents, SDL_EventAction action, Uint32 minType, Uint32 maxType)} */
    public static int nSDL_PeepEvents(long events, int numevents, int action, int minType, int maxType) {
        long __functionAddress = Functions.PeepEvents;
        return invokePI(events, numevents, action, minType, maxType, __functionAddress);
    }

    /** {@code int SDL_PeepEvents(SDL_Event * events, int numevents, SDL_EventAction action, Uint32 minType, Uint32 maxType)} */
    public static int SDL_PeepEvents(@NativeType("SDL_Event *") SDL_Event.@Nullable Buffer events, @NativeType("SDL_EventAction") int action, @NativeType("Uint32") int minType, @NativeType("Uint32") int maxType) {
        return nSDL_PeepEvents(memAddressSafe(events), remainingSafe(events), action, minType, maxType);
    }

    // --- [ SDL_HasEvent ] ---

    /** {@code bool SDL_HasEvent(Uint32 type)} */
    @NativeType("bool")
    public static boolean SDL_HasEvent(@NativeType("Uint32") int type) {
        long __functionAddress = Functions.HasEvent;
        return invokeZ(type, __functionAddress);
    }

    // --- [ SDL_HasEvents ] ---

    /** {@code bool SDL_HasEvents(Uint32 minType, Uint32 maxType)} */
    @NativeType("bool")
    public static boolean SDL_HasEvents(@NativeType("Uint32") int minType, @NativeType("Uint32") int maxType) {
        long __functionAddress = Functions.HasEvents;
        return invokeZ(minType, maxType, __functionAddress);
    }

    // --- [ SDL_FlushEvent ] ---

    /** {@code void SDL_FlushEvent(Uint32 type)} */
    public static void SDL_FlushEvent(@NativeType("Uint32") int type) {
        long __functionAddress = Functions.FlushEvent;
        invokeV(type, __functionAddress);
    }

    // --- [ SDL_FlushEvents ] ---

    /** {@code void SDL_FlushEvents(Uint32 minType, Uint32 maxType)} */
    public static void SDL_FlushEvents(@NativeType("Uint32") int minType, @NativeType("Uint32") int maxType) {
        long __functionAddress = Functions.FlushEvents;
        invokeV(minType, maxType, __functionAddress);
    }

    // --- [ SDL_PollEvent ] ---

    /** {@code bool SDL_PollEvent(SDL_Event * event)} */
    public static boolean nSDL_PollEvent(long event) {
        long __functionAddress = Functions.PollEvent;
        return invokePZ(event, __functionAddress);
    }

    /** {@code bool SDL_PollEvent(SDL_Event * event)} */
    @NativeType("bool")
    public static boolean SDL_PollEvent(@NativeType("SDL_Event *") @Nullable SDL_Event event) {
        return nSDL_PollEvent(memAddressSafe(event));
    }

    // --- [ SDL_WaitEvent ] ---

    /** {@code bool SDL_WaitEvent(SDL_Event * event)} */
    public static boolean nSDL_WaitEvent(long event) {
        long __functionAddress = Functions.WaitEvent;
        return invokePZ(event, __functionAddress);
    }

    /** {@code bool SDL_WaitEvent(SDL_Event * event)} */
    @NativeType("bool")
    public static boolean SDL_WaitEvent(@NativeType("SDL_Event *") @Nullable SDL_Event event) {
        return nSDL_WaitEvent(memAddressSafe(event));
    }

    // --- [ SDL_WaitEventTimeout ] ---

    /** {@code bool SDL_WaitEventTimeout(SDL_Event * event, Sint32 timeoutMS)} */
    public static boolean nSDL_WaitEventTimeout(long event, int timeoutMS) {
        long __functionAddress = Functions.WaitEventTimeout;
        return invokePZ(event, timeoutMS, __functionAddress);
    }

    /** {@code bool SDL_WaitEventTimeout(SDL_Event * event, Sint32 timeoutMS)} */
    @NativeType("bool")
    public static boolean SDL_WaitEventTimeout(@NativeType("SDL_Event *") @Nullable SDL_Event event, @NativeType("Sint32") int timeoutMS) {
        return nSDL_WaitEventTimeout(memAddressSafe(event), timeoutMS);
    }

    // --- [ SDL_PushEvent ] ---

    /** {@code bool SDL_PushEvent(SDL_Event * event)} */
    public static boolean nSDL_PushEvent(long event) {
        long __functionAddress = Functions.PushEvent;
        return invokePZ(event, __functionAddress);
    }

    /** {@code bool SDL_PushEvent(SDL_Event * event)} */
    @NativeType("bool")
    public static boolean SDL_PushEvent(@NativeType("SDL_Event *") SDL_Event event) {
        return nSDL_PushEvent(event.address());
    }

    // --- [ SDL_SetEventFilter ] ---

    /** {@code void SDL_SetEventFilter(SDL_EventFilter filter, void * userdata)} */
    public static void nSDL_SetEventFilter(long filter, long userdata) {
        long __functionAddress = Functions.SetEventFilter;
        invokePPV(filter, userdata, __functionAddress);
    }

    /** {@code void SDL_SetEventFilter(SDL_EventFilter filter, void * userdata)} */
    public static void SDL_SetEventFilter(@NativeType("SDL_EventFilter") @Nullable SDL_EventFilterI filter, @NativeType("void *") long userdata) {
        nSDL_SetEventFilter(memAddressSafe(filter), userdata);
    }

    // --- [ SDL_GetEventFilter ] ---

    /** {@code bool SDL_GetEventFilter(SDL_EventFilter * filter, void ** userdata)} */
    public static boolean nSDL_GetEventFilter(long filter, long userdata) {
        long __functionAddress = Functions.GetEventFilter;
        return invokePPZ(filter, userdata, __functionAddress);
    }

    /** {@code bool SDL_GetEventFilter(SDL_EventFilter * filter, void ** userdata)} */
    @NativeType("bool")
    public static boolean SDL_GetEventFilter(@NativeType("SDL_EventFilter *") @Nullable PointerBuffer filter, @NativeType("void **") @Nullable PointerBuffer userdata) {
        if (CHECKS) {
            checkSafe(filter, 1);
            checkSafe(userdata, 1);
        }
        return nSDL_GetEventFilter(memAddressSafe(filter), memAddressSafe(userdata));
    }

    // --- [ SDL_AddEventWatch ] ---

    /** {@code bool SDL_AddEventWatch(SDL_EventFilter filter, void * userdata)} */
    public static boolean nSDL_AddEventWatch(long filter, long userdata) {
        long __functionAddress = Functions.AddEventWatch;
        return invokePPZ(filter, userdata, __functionAddress);
    }

    /** {@code bool SDL_AddEventWatch(SDL_EventFilter filter, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_AddEventWatch(@NativeType("SDL_EventFilter") SDL_EventFilterI filter, @NativeType("void *") long userdata) {
        return nSDL_AddEventWatch(filter.address(), userdata);
    }

    // --- [ SDL_RemoveEventWatch ] ---

    /** {@code void SDL_RemoveEventWatch(SDL_EventFilter filter, void * userdata)} */
    public static void nSDL_RemoveEventWatch(long filter, long userdata) {
        long __functionAddress = Functions.RemoveEventWatch;
        invokePPV(filter, userdata, __functionAddress);
    }

    /** {@code void SDL_RemoveEventWatch(SDL_EventFilter filter, void * userdata)} */
    public static void SDL_RemoveEventWatch(@NativeType("SDL_EventFilter") SDL_EventFilterI filter, @NativeType("void *") long userdata) {
        nSDL_RemoveEventWatch(filter.address(), userdata);
    }

    // --- [ SDL_FilterEvents ] ---

    /** {@code void SDL_FilterEvents(SDL_EventFilter filter, void * userdata)} */
    public static void nSDL_FilterEvents(long filter, long userdata) {
        long __functionAddress = Functions.FilterEvents;
        invokePPV(filter, userdata, __functionAddress);
    }

    /** {@code void SDL_FilterEvents(SDL_EventFilter filter, void * userdata)} */
    public static void SDL_FilterEvents(@NativeType("SDL_EventFilter") SDL_EventFilterI filter, @NativeType("void *") long userdata) {
        nSDL_FilterEvents(filter.address(), userdata);
    }

    // --- [ SDL_SetEventEnabled ] ---

    /** {@code void SDL_SetEventEnabled(Uint32 type, bool enabled)} */
    public static void SDL_SetEventEnabled(@NativeType("Uint32") int type, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetEventEnabled;
        invokeV(type, enabled, __functionAddress);
    }

    // --- [ SDL_EventEnabled ] ---

    /** {@code bool SDL_EventEnabled(Uint32 type)} */
    @NativeType("bool")
    public static boolean SDL_EventEnabled(@NativeType("Uint32") int type) {
        long __functionAddress = Functions.EventEnabled;
        return invokeZ(type, __functionAddress);
    }

    // --- [ SDL_RegisterEvents ] ---

    /** {@code Uint32 SDL_RegisterEvents(int numevents)} */
    @NativeType("Uint32")
    public static int SDL_RegisterEvents(int numevents) {
        long __functionAddress = Functions.RegisterEvents;
        return invokeI(numevents, __functionAddress);
    }

    // --- [ SDL_GetWindowFromEvent ] ---

    /** {@code SDL_Window * SDL_GetWindowFromEvent(SDL_Event const * event)} */
    public static long nSDL_GetWindowFromEvent(long event) {
        long __functionAddress = Functions.GetWindowFromEvent;
        return invokePP(event, __functionAddress);
    }

    /** {@code SDL_Window * SDL_GetWindowFromEvent(SDL_Event const * event)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetWindowFromEvent(@NativeType("SDL_Event const *") SDL_Event event) {
        return nSDL_GetWindowFromEvent(event.address());
    }

    // --- [ SDL_GetBasePath ] ---

    /** {@code char const * SDL_GetBasePath(void)} */
    public static long nSDL_GetBasePath() {
        long __functionAddress = Functions.GetBasePath;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetBasePath(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetBasePath() {
        long __result = nSDL_GetBasePath();
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetPrefPath ] ---

    /** {@code char * SDL_GetPrefPath(char const * org, char const * app)} */
    public static long nSDL_GetPrefPath(long org, long app) {
        long __functionAddress = Functions.GetPrefPath;
        return invokePPP(org, app, __functionAddress);
    }

    /** {@code char * SDL_GetPrefPath(char const * org, char const * app)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetPrefPath(@NativeType("char const *") ByteBuffer org, @NativeType("char const *") ByteBuffer app) {
        if (CHECKS) {
            checkNT1(org);
            checkNT1(app);
        }
        long __result = NULL;
        try {
            __result = nSDL_GetPrefPath(memAddress(org), memAddress(app));
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    /** {@code char * SDL_GetPrefPath(char const * org, char const * app)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetPrefPath(@NativeType("char const *") CharSequence org, @NativeType("char const *") CharSequence app) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        long __result = NULL;
        try {
            stack.nUTF8(org, true);
            long orgEncoded = stack.getPointerAddress();
            stack.nUTF8(app, true);
            long appEncoded = stack.getPointerAddress();
            __result = nSDL_GetPrefPath(orgEncoded, appEncoded);
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetUserFolder ] ---

    /** {@code char const * SDL_GetUserFolder(SDL_Folder folder)} */
    public static long nSDL_GetUserFolder(int folder) {
        long __functionAddress = Functions.GetUserFolder;
        return invokeP(folder, __functionAddress);
    }

    /** {@code char const * SDL_GetUserFolder(SDL_Folder folder)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetUserFolder(@NativeType("SDL_Folder") int folder) {
        long __result = nSDL_GetUserFolder(folder);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_CreateDirectory ] ---

    /** {@code bool SDL_CreateDirectory(char const * path)} */
    public static boolean nSDL_CreateDirectory(long path) {
        long __functionAddress = Functions.CreateDirectory;
        return invokePZ(path, __functionAddress);
    }

    /** {@code bool SDL_CreateDirectory(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_CreateDirectory(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_CreateDirectory(memAddress(path));
    }

    /** {@code bool SDL_CreateDirectory(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_CreateDirectory(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_CreateDirectory(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_EnumerateDirectory ] ---

    /** {@code bool SDL_EnumerateDirectory(char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    public static boolean nSDL_EnumerateDirectory(long path, long callback, long userdata) {
        long __functionAddress = Functions.EnumerateDirectory;
        return invokePPPZ(path, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_EnumerateDirectory(char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_EnumerateDirectory(@NativeType("char const *") ByteBuffer path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_EnumerateDirectory(memAddress(path), callback.address(), userdata);
    }

    /** {@code bool SDL_EnumerateDirectory(char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_EnumerateDirectory(@NativeType("char const *") CharSequence path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_EnumerateDirectory(pathEncoded, callback.address(), userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RemovePath ] ---

    /** {@code bool SDL_RemovePath(char const * path)} */
    public static boolean nSDL_RemovePath(long path) {
        long __functionAddress = Functions.RemovePath;
        return invokePZ(path, __functionAddress);
    }

    /** {@code bool SDL_RemovePath(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_RemovePath(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_RemovePath(memAddress(path));
    }

    /** {@code bool SDL_RemovePath(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_RemovePath(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_RemovePath(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RenamePath ] ---

    /** {@code bool SDL_RenamePath(char const * oldpath, char const * newpath)} */
    public static boolean nSDL_RenamePath(long oldpath, long newpath) {
        long __functionAddress = Functions.RenamePath;
        return invokePPZ(oldpath, newpath, __functionAddress);
    }

    /** {@code bool SDL_RenamePath(char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_RenamePath(@NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        return nSDL_RenamePath(memAddress(oldpath), memAddress(newpath));
    }

    /** {@code bool SDL_RenamePath(char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_RenamePath(@NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            return nSDL_RenamePath(oldpathEncoded, newpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CopyFile ] ---

    /** {@code bool SDL_CopyFile(char const * oldpath, char const * newpath)} */
    public static boolean nSDL_CopyFile(long oldpath, long newpath) {
        long __functionAddress = Functions.CopyFile;
        return invokePPZ(oldpath, newpath, __functionAddress);
    }

    /** {@code bool SDL_CopyFile(char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_CopyFile(@NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        return nSDL_CopyFile(memAddress(oldpath), memAddress(newpath));
    }

    /** {@code bool SDL_CopyFile(char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_CopyFile(@NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            return nSDL_CopyFile(oldpathEncoded, newpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetPathInfo ] ---

    /** {@code bool SDL_GetPathInfo(char const * path, SDL_PathInfo * info)} */
    public static boolean nSDL_GetPathInfo(long path, long info) {
        long __functionAddress = Functions.GetPathInfo;
        return invokePPZ(path, info, __functionAddress);
    }

    /** {@code bool SDL_GetPathInfo(char const * path, SDL_PathInfo * info)} */
    @NativeType("bool")
    public static boolean SDL_GetPathInfo(@NativeType("char const *") ByteBuffer path, @NativeType("SDL_PathInfo *") @Nullable SDL_PathInfo info) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_GetPathInfo(memAddress(path), memAddressSafe(info));
    }

    /** {@code bool SDL_GetPathInfo(char const * path, SDL_PathInfo * info)} */
    @NativeType("bool")
    public static boolean SDL_GetPathInfo(@NativeType("char const *") CharSequence path, @NativeType("SDL_PathInfo *") @Nullable SDL_PathInfo info) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_GetPathInfo(pathEncoded, memAddressSafe(info));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GlobDirectory ] ---

    /** {@code char ** SDL_GlobDirectory(char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    public static long nSDL_GlobDirectory(long path, long pattern, int flags, long count) {
        long __functionAddress = Functions.GlobDirectory;
        return invokePPPP(path, pattern, flags, count, __functionAddress);
    }

    /** {@code char ** SDL_GlobDirectory(char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GlobDirectory(@NativeType("char const *") ByteBuffer path, @NativeType("char const *") @Nullable ByteBuffer pattern, @NativeType("SDL_GlobFlags") int flags) {
        if (CHECKS) {
            checkNT1(path);
            checkNT1Safe(pattern);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GlobDirectory(memAddress(path), memAddressSafe(pattern), flags, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code char ** SDL_GlobDirectory(char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GlobDirectory(@NativeType("char const *") CharSequence path, @NativeType("char const *") @Nullable CharSequence pattern, @NativeType("SDL_GlobFlags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer count = stack.callocInt(1);
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(pattern, true);
            long patternEncoded = pattern == null ? NULL : stack.getPointerAddress();
            long __result = nSDL_GlobDirectory(pathEncoded, patternEncoded, flags, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetCurrentDirectory ] ---

    /** {@code char * SDL_GetCurrentDirectory(void)} */
    public static long nSDL_GetCurrentDirectory() {
        long __functionAddress = Functions.GetCurrentDirectory;
        return invokeP(__functionAddress);
    }

    /** {@code char * SDL_GetCurrentDirectory(void)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetCurrentDirectory() {
        long __result = NULL;
        try {
            __result = nSDL_GetCurrentDirectory();
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    // --- [ SDL_GPUSupportsShaderFormats ] ---

    /** {@code bool SDL_GPUSupportsShaderFormats(SDL_GPUShaderFormat format_flags, char const * name)} */
    public static boolean nSDL_GPUSupportsShaderFormats(int format_flags, long name) {
        long __functionAddress = Functions.GPUSupportsShaderFormats;
        return invokePZ(format_flags, name, __functionAddress);
    }

    /** {@code bool SDL_GPUSupportsShaderFormats(SDL_GPUShaderFormat format_flags, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_GPUSupportsShaderFormats(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("char const *") @Nullable ByteBuffer name) {
        if (CHECKS) {
            checkNT1Safe(name);
        }
        return nSDL_GPUSupportsShaderFormats(format_flags, memAddressSafe(name));
    }

    /** {@code bool SDL_GPUSupportsShaderFormats(SDL_GPUShaderFormat format_flags, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_GPUSupportsShaderFormats(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("char const *") @Nullable CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nSDL_GPUSupportsShaderFormats(format_flags, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GPUSupportsProperties ] ---

    /** {@code bool SDL_GPUSupportsProperties(SDL_PropertiesID props)} */
    @NativeType("bool")
    public static boolean SDL_GPUSupportsProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.GPUSupportsProperties;
        return invokeZ(props, __functionAddress);
    }

    // --- [ SDL_CreateGPUDevice ] ---

    /** {@code SDL_GPUDevice * SDL_CreateGPUDevice(SDL_GPUShaderFormat format_flags, bool debug_mode, char const * name)} */
    public static long nSDL_CreateGPUDevice(int format_flags, boolean debug_mode, long name) {
        long __functionAddress = Functions.CreateGPUDevice;
        return invokePP(format_flags, debug_mode, name, __functionAddress);
    }

    /** {@code SDL_GPUDevice * SDL_CreateGPUDevice(SDL_GPUShaderFormat format_flags, bool debug_mode, char const * name)} */
    @NativeType("SDL_GPUDevice *")
    public static long SDL_CreateGPUDevice(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("bool") boolean debug_mode, @NativeType("char const *") @Nullable ByteBuffer name) {
        if (CHECKS) {
            checkNT1Safe(name);
        }
        return nSDL_CreateGPUDevice(format_flags, debug_mode, memAddressSafe(name));
    }

    /** {@code SDL_GPUDevice * SDL_CreateGPUDevice(SDL_GPUShaderFormat format_flags, bool debug_mode, char const * name)} */
    @NativeType("SDL_GPUDevice *")
    public static long SDL_CreateGPUDevice(@NativeType("SDL_GPUShaderFormat") int format_flags, @NativeType("bool") boolean debug_mode, @NativeType("char const *") @Nullable CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nSDL_CreateGPUDevice(format_flags, debug_mode, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateGPUDeviceWithProperties ] ---

    /** {@code SDL_GPUDevice * SDL_CreateGPUDeviceWithProperties(SDL_PropertiesID props)} */
    @NativeType("SDL_GPUDevice *")
    public static long SDL_CreateGPUDeviceWithProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.CreateGPUDeviceWithProperties;
        return invokeP(props, __functionAddress);
    }

    // --- [ SDL_DestroyGPUDevice ] ---

    /** {@code void SDL_DestroyGPUDevice(SDL_GPUDevice * device)} */
    public static void SDL_DestroyGPUDevice(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.DestroyGPUDevice;
        if (CHECKS) {
            check(device);
        }
        invokePV(device, __functionAddress);
    }

    // --- [ SDL_GetNumGPUDrivers ] ---

    /** {@code int SDL_GetNumGPUDrivers(void)} */
    public static int SDL_GetNumGPUDrivers() {
        long __functionAddress = Functions.GetNumGPUDrivers;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetGPUDriver ] ---

    /** {@code char const * SDL_GetGPUDriver(int index)} */
    public static long nSDL_GetGPUDriver(int index) {
        long __functionAddress = Functions.GetGPUDriver;
        return invokeP(index, __functionAddress);
    }

    /** {@code char const * SDL_GetGPUDriver(int index)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGPUDriver(int index) {
        long __result = nSDL_GetGPUDriver(index);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGPUDeviceDriver ] ---

    /** {@code char const * SDL_GetGPUDeviceDriver(SDL_GPUDevice * device)} */
    public static long nSDL_GetGPUDeviceDriver(long device) {
        long __functionAddress = Functions.GetGPUDeviceDriver;
        if (CHECKS) {
            check(device);
        }
        return invokePP(device, __functionAddress);
    }

    /** {@code char const * SDL_GetGPUDeviceDriver(SDL_GPUDevice * device)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGPUDeviceDriver(@NativeType("SDL_GPUDevice *") long device) {
        long __result = nSDL_GetGPUDeviceDriver(device);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGPUShaderFormats ] ---

    /** {@code SDL_GPUShaderFormat SDL_GetGPUShaderFormats(SDL_GPUDevice * device)} */
    @NativeType("SDL_GPUShaderFormat")
    public static int SDL_GetGPUShaderFormats(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.GetGPUShaderFormats;
        if (CHECKS) {
            check(device);
        }
        return invokePI(device, __functionAddress);
    }

    // --- [ SDL_CreateGPUComputePipeline ] ---

    /** {@code SDL_GPUComputePipeline * SDL_CreateGPUComputePipeline(SDL_GPUDevice * device, SDL_GPUComputePipelineCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUComputePipeline(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUComputePipeline;
        if (CHECKS) {
            check(device);
            SDL_GPUComputePipelineCreateInfo.validate(createinfo);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUComputePipeline * SDL_CreateGPUComputePipeline(SDL_GPUDevice * device, SDL_GPUComputePipelineCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUComputePipeline *")
    public static long SDL_CreateGPUComputePipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUComputePipelineCreateInfo const *") SDL_GPUComputePipelineCreateInfo createinfo) {
        return nSDL_CreateGPUComputePipeline(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUGraphicsPipeline ] ---

    /** {@code SDL_GPUGraphicsPipeline * SDL_CreateGPUGraphicsPipeline(SDL_GPUDevice * device, SDL_GPUGraphicsPipelineCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUGraphicsPipeline(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUGraphicsPipeline;
        if (CHECKS) {
            check(device);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUGraphicsPipeline * SDL_CreateGPUGraphicsPipeline(SDL_GPUDevice * device, SDL_GPUGraphicsPipelineCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUGraphicsPipeline *")
    public static long SDL_CreateGPUGraphicsPipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUGraphicsPipelineCreateInfo const *") SDL_GPUGraphicsPipelineCreateInfo createinfo) {
        return nSDL_CreateGPUGraphicsPipeline(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUSampler ] ---

    /** {@code SDL_GPUSampler * SDL_CreateGPUSampler(SDL_GPUDevice * device, SDL_GPUSamplerCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUSampler(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUSampler;
        if (CHECKS) {
            check(device);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUSampler * SDL_CreateGPUSampler(SDL_GPUDevice * device, SDL_GPUSamplerCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUSampler *")
    public static long SDL_CreateGPUSampler(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUSamplerCreateInfo const *") SDL_GPUSamplerCreateInfo createinfo) {
        return nSDL_CreateGPUSampler(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUShader ] ---

    /** {@code SDL_GPUShader * SDL_CreateGPUShader(SDL_GPUDevice * device, SDL_GPUShaderCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUShader(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUShader;
        if (CHECKS) {
            check(device);
            SDL_GPUShaderCreateInfo.validate(createinfo);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUShader * SDL_CreateGPUShader(SDL_GPUDevice * device, SDL_GPUShaderCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUShader *")
    public static long SDL_CreateGPUShader(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUShaderCreateInfo const *") SDL_GPUShaderCreateInfo createinfo) {
        return nSDL_CreateGPUShader(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUTexture ] ---

    /** {@code SDL_GPUTexture * SDL_CreateGPUTexture(SDL_GPUDevice * device, SDL_GPUTextureCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUTexture(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUTexture;
        if (CHECKS) {
            check(device);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUTexture * SDL_CreateGPUTexture(SDL_GPUDevice * device, SDL_GPUTextureCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUTexture *")
    public static long SDL_CreateGPUTexture(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTextureCreateInfo const *") SDL_GPUTextureCreateInfo createinfo) {
        return nSDL_CreateGPUTexture(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUBuffer ] ---

    /** {@code SDL_GPUBuffer * SDL_CreateGPUBuffer(SDL_GPUDevice * device, SDL_GPUBufferCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUBuffer(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUBuffer;
        if (CHECKS) {
            check(device);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUBuffer * SDL_CreateGPUBuffer(SDL_GPUDevice * device, SDL_GPUBufferCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUBuffer *")
    public static long SDL_CreateGPUBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBufferCreateInfo const *") SDL_GPUBufferCreateInfo createinfo) {
        return nSDL_CreateGPUBuffer(device, createinfo.address());
    }

    // --- [ SDL_CreateGPUTransferBuffer ] ---

    /** {@code SDL_GPUTransferBuffer * SDL_CreateGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBufferCreateInfo const * createinfo)} */
    public static long nSDL_CreateGPUTransferBuffer(long device, long createinfo) {
        long __functionAddress = Functions.CreateGPUTransferBuffer;
        if (CHECKS) {
            check(device);
        }
        return invokePPP(device, createinfo, __functionAddress);
    }

    /** {@code SDL_GPUTransferBuffer * SDL_CreateGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBufferCreateInfo const * createinfo)} */
    @NativeType("SDL_GPUTransferBuffer *")
    public static long SDL_CreateGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBufferCreateInfo const *") SDL_GPUTransferBufferCreateInfo createinfo) {
        return nSDL_CreateGPUTransferBuffer(device, createinfo.address());
    }

    // --- [ SDL_SetGPUBufferName ] ---

    /** {@code void SDL_SetGPUBufferName(SDL_GPUDevice * device, SDL_GPUBuffer * buffer, char const * text)} */
    public static void nSDL_SetGPUBufferName(long device, long buffer, long text) {
        long __functionAddress = Functions.SetGPUBufferName;
        if (CHECKS) {
            check(device);
            check(buffer);
        }
        invokePPPV(device, buffer, text, __functionAddress);
    }

    /** {@code void SDL_SetGPUBufferName(SDL_GPUDevice * device, SDL_GPUBuffer * buffer, char const * text)} */
    public static void SDL_SetGPUBufferName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        nSDL_SetGPUBufferName(device, buffer, memAddress(text));
    }

    /** {@code void SDL_SetGPUBufferName(SDL_GPUDevice * device, SDL_GPUBuffer * buffer, char const * text)} */
    public static void SDL_SetGPUBufferName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nSDL_SetGPUBufferName(device, buffer, textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetGPUTextureName ] ---

    /** {@code void SDL_SetGPUTextureName(SDL_GPUDevice * device, SDL_GPUTexture * texture, char const * text)} */
    public static void nSDL_SetGPUTextureName(long device, long texture, long text) {
        long __functionAddress = Functions.SetGPUTextureName;
        if (CHECKS) {
            check(device);
            check(texture);
        }
        invokePPPV(device, texture, text, __functionAddress);
    }

    /** {@code void SDL_SetGPUTextureName(SDL_GPUDevice * device, SDL_GPUTexture * texture, char const * text)} */
    public static void SDL_SetGPUTextureName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTexture *") long texture, @NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        nSDL_SetGPUTextureName(device, texture, memAddress(text));
    }

    /** {@code void SDL_SetGPUTextureName(SDL_GPUDevice * device, SDL_GPUTexture * texture, char const * text)} */
    public static void SDL_SetGPUTextureName(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTexture *") long texture, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nSDL_SetGPUTextureName(device, texture, textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_InsertGPUDebugLabel ] ---

    /** {@code void SDL_InsertGPUDebugLabel(SDL_GPUCommandBuffer * command_buffer, char const * text)} */
    public static void nSDL_InsertGPUDebugLabel(long command_buffer, long text) {
        long __functionAddress = Functions.InsertGPUDebugLabel;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePPV(command_buffer, text, __functionAddress);
    }

    /** {@code void SDL_InsertGPUDebugLabel(SDL_GPUCommandBuffer * command_buffer, char const * text)} */
    public static void SDL_InsertGPUDebugLabel(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        nSDL_InsertGPUDebugLabel(command_buffer, memAddress(text));
    }

    /** {@code void SDL_InsertGPUDebugLabel(SDL_GPUCommandBuffer * command_buffer, char const * text)} */
    public static void SDL_InsertGPUDebugLabel(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nSDL_InsertGPUDebugLabel(command_buffer, textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_PushGPUDebugGroup ] ---

    /** {@code void SDL_PushGPUDebugGroup(SDL_GPUCommandBuffer * command_buffer, char const * name)} */
    public static void nSDL_PushGPUDebugGroup(long command_buffer, long name) {
        long __functionAddress = Functions.PushGPUDebugGroup;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePPV(command_buffer, name, __functionAddress);
    }

    /** {@code void SDL_PushGPUDebugGroup(SDL_GPUCommandBuffer * command_buffer, char const * name)} */
    public static void SDL_PushGPUDebugGroup(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nSDL_PushGPUDebugGroup(command_buffer, memAddress(name));
    }

    /** {@code void SDL_PushGPUDebugGroup(SDL_GPUCommandBuffer * command_buffer, char const * name)} */
    public static void SDL_PushGPUDebugGroup(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nSDL_PushGPUDebugGroup(command_buffer, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_PopGPUDebugGroup ] ---

    /** {@code void SDL_PopGPUDebugGroup(SDL_GPUCommandBuffer * command_buffer)} */
    public static void SDL_PopGPUDebugGroup(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.PopGPUDebugGroup;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePV(command_buffer, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUTexture ] ---

    /** {@code void SDL_ReleaseGPUTexture(SDL_GPUDevice * device, SDL_GPUTexture * texture)} */
    public static void SDL_ReleaseGPUTexture(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTexture *") long texture) {
        long __functionAddress = Functions.ReleaseGPUTexture;
        if (CHECKS) {
            check(device);
            check(texture);
        }
        invokePPV(device, texture, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUSampler ] ---

    /** {@code void SDL_ReleaseGPUSampler(SDL_GPUDevice * device, SDL_GPUSampler * sampler)} */
    public static void SDL_ReleaseGPUSampler(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUSampler *") long sampler) {
        long __functionAddress = Functions.ReleaseGPUSampler;
        if (CHECKS) {
            check(device);
            check(sampler);
        }
        invokePPV(device, sampler, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUBuffer ] ---

    /** {@code void SDL_ReleaseGPUBuffer(SDL_GPUDevice * device, SDL_GPUBuffer * buffer)} */
    public static void SDL_ReleaseGPUBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUBuffer *") long buffer) {
        long __functionAddress = Functions.ReleaseGPUBuffer;
        if (CHECKS) {
            check(device);
            check(buffer);
        }
        invokePPV(device, buffer, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUTransferBuffer ] ---

    /** {@code void SDL_ReleaseGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBuffer * transfer_buffer)} */
    public static void SDL_ReleaseGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBuffer *") long transfer_buffer) {
        long __functionAddress = Functions.ReleaseGPUTransferBuffer;
        if (CHECKS) {
            check(device);
            check(transfer_buffer);
        }
        invokePPV(device, transfer_buffer, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUComputePipeline ] ---

    /** {@code void SDL_ReleaseGPUComputePipeline(SDL_GPUDevice * device, SDL_GPUComputePipeline * compute_pipeline)} */
    public static void SDL_ReleaseGPUComputePipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUComputePipeline *") long compute_pipeline) {
        long __functionAddress = Functions.ReleaseGPUComputePipeline;
        if (CHECKS) {
            check(device);
            check(compute_pipeline);
        }
        invokePPV(device, compute_pipeline, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUShader ] ---

    /** {@code void SDL_ReleaseGPUShader(SDL_GPUDevice * device, SDL_GPUShader * shader)} */
    public static void SDL_ReleaseGPUShader(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUShader *") long shader) {
        long __functionAddress = Functions.ReleaseGPUShader;
        if (CHECKS) {
            check(device);
            check(shader);
        }
        invokePPV(device, shader, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUGraphicsPipeline ] ---

    /** {@code void SDL_ReleaseGPUGraphicsPipeline(SDL_GPUDevice * device, SDL_GPUGraphicsPipeline * graphics_pipeline)} */
    public static void SDL_ReleaseGPUGraphicsPipeline(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUGraphicsPipeline *") long graphics_pipeline) {
        long __functionAddress = Functions.ReleaseGPUGraphicsPipeline;
        if (CHECKS) {
            check(device);
            check(graphics_pipeline);
        }
        invokePPV(device, graphics_pipeline, __functionAddress);
    }

    // --- [ SDL_AcquireGPUCommandBuffer ] ---

    /** {@code SDL_GPUCommandBuffer * SDL_AcquireGPUCommandBuffer(SDL_GPUDevice * device)} */
    @NativeType("SDL_GPUCommandBuffer *")
    public static long SDL_AcquireGPUCommandBuffer(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.AcquireGPUCommandBuffer;
        if (CHECKS) {
            check(device);
        }
        return invokePP(device, __functionAddress);
    }

    // --- [ SDL_PushGPUVertexUniformData ] ---

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void nSDL_PushGPUVertexUniformData(long command_buffer, int slot_index, long data, int length) {
        long __functionAddress = Functions.PushGPUVertexUniformData;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePPV(command_buffer, slot_index, data, length, __functionAddress);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ByteBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining());
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ShortBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 1);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") IntBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") LongBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") FloatBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") DoubleBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUVertexUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUVertexUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") PointerBuffer data) {
        nSDL_PushGPUVertexUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << POINTER_SHIFT);
    }

    // --- [ SDL_PushGPUFragmentUniformData ] ---

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void nSDL_PushGPUFragmentUniformData(long command_buffer, int slot_index, long data, int length) {
        long __functionAddress = Functions.PushGPUFragmentUniformData;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePPV(command_buffer, slot_index, data, length, __functionAddress);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ByteBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining());
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ShortBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 1);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") IntBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") LongBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") FloatBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") DoubleBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUFragmentUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUFragmentUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") PointerBuffer data) {
        nSDL_PushGPUFragmentUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << POINTER_SHIFT);
    }

    // --- [ SDL_PushGPUComputeUniformData ] ---

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void nSDL_PushGPUComputeUniformData(long command_buffer, int slot_index, long data, int length) {
        long __functionAddress = Functions.PushGPUComputeUniformData;
        if (CHECKS) {
            check(command_buffer);
        }
        invokePPV(command_buffer, slot_index, data, length, __functionAddress);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ByteBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining());
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") ShortBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 1);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") IntBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") LongBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") FloatBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 2);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") DoubleBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << 3);
    }

    /** {@code void SDL_PushGPUComputeUniformData(SDL_GPUCommandBuffer * command_buffer, Uint32 slot_index, void const * data, Uint32 length)} */
    public static void SDL_PushGPUComputeUniformData(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("Uint32") int slot_index, @NativeType("void const *") PointerBuffer data) {
        nSDL_PushGPUComputeUniformData(command_buffer, slot_index, memAddress(data), data.remaining() << POINTER_SHIFT);
    }

    // --- [ SDL_BeginGPURenderPass ] ---

    /** {@code SDL_GPURenderPass * SDL_BeginGPURenderPass(SDL_GPUCommandBuffer * command_buffer, SDL_GPUColorTargetInfo const * color_target_infos, Uint32 num_color_targets, SDL_GPUDepthStencilTargetInfo const * depth_stencil_target_info)} */
    public static long nSDL_BeginGPURenderPass(long command_buffer, long color_target_infos, int num_color_targets, long depth_stencil_target_info) {
        long __functionAddress = Functions.BeginGPURenderPass;
        if (CHECKS) {
            check(command_buffer);
            if (color_target_infos != NULL) { Struct.validate(color_target_infos, num_color_targets, SDL_GPUColorTargetInfo.SIZEOF, SDL_GPUColorTargetInfo::validate); }
            if (depth_stencil_target_info != NULL) { SDL_GPUDepthStencilTargetInfo.validate(depth_stencil_target_info); }
        }
        return invokePPPP(command_buffer, color_target_infos, num_color_targets, depth_stencil_target_info, __functionAddress);
    }

    /** {@code SDL_GPURenderPass * SDL_BeginGPURenderPass(SDL_GPUCommandBuffer * command_buffer, SDL_GPUColorTargetInfo const * color_target_infos, Uint32 num_color_targets, SDL_GPUDepthStencilTargetInfo const * depth_stencil_target_info)} */
    @NativeType("SDL_GPURenderPass *")
    public static long SDL_BeginGPURenderPass(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUColorTargetInfo const *") SDL_GPUColorTargetInfo.@Nullable Buffer color_target_infos, @NativeType("SDL_GPUDepthStencilTargetInfo const *") @Nullable SDL_GPUDepthStencilTargetInfo depth_stencil_target_info) {
        return nSDL_BeginGPURenderPass(command_buffer, memAddressSafe(color_target_infos), remainingSafe(color_target_infos), memAddressSafe(depth_stencil_target_info));
    }

    // --- [ SDL_BindGPUGraphicsPipeline ] ---

    /** {@code void SDL_BindGPUGraphicsPipeline(SDL_GPURenderPass * render_pass, SDL_GPUGraphicsPipeline * graphics_pipeline)} */
    public static void SDL_BindGPUGraphicsPipeline(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUGraphicsPipeline *") long graphics_pipeline) {
        long __functionAddress = Functions.BindGPUGraphicsPipeline;
        if (CHECKS) {
            check(render_pass);
            check(graphics_pipeline);
        }
        invokePPV(render_pass, graphics_pipeline, __functionAddress);
    }

    // --- [ SDL_SetGPUViewport ] ---

    /** {@code void SDL_SetGPUViewport(SDL_GPURenderPass * render_pass, SDL_GPUViewport const * viewport)} */
    public static void nSDL_SetGPUViewport(long render_pass, long viewport) {
        long __functionAddress = Functions.SetGPUViewport;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, viewport, __functionAddress);
    }

    /** {@code void SDL_SetGPUViewport(SDL_GPURenderPass * render_pass, SDL_GPUViewport const * viewport)} */
    public static void SDL_SetGPUViewport(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUViewport const *") SDL_GPUViewport viewport) {
        nSDL_SetGPUViewport(render_pass, viewport.address());
    }

    // --- [ SDL_SetGPUScissor ] ---

    /** {@code void SDL_SetGPUScissor(SDL_GPURenderPass * render_pass, SDL_Rect const * scissor)} */
    public static void nSDL_SetGPUScissor(long render_pass, long scissor) {
        long __functionAddress = Functions.SetGPUScissor;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, scissor, __functionAddress);
    }

    /** {@code void SDL_SetGPUScissor(SDL_GPURenderPass * render_pass, SDL_Rect const * scissor)} */
    public static void SDL_SetGPUScissor(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_Rect const *") SDL_Rect scissor) {
        nSDL_SetGPUScissor(render_pass, scissor.address());
    }

    // --- [ SDL_SetGPUBlendConstants ] ---

    private static final FFICIF SDL_SetGPUBlendConstantsCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_void,
        ffi_type_pointer, apiCreateStruct(ffi_type_float, ffi_type_float, ffi_type_float, ffi_type_float)
    );

    /** {@code void SDL_SetGPUBlendConstants(SDL_GPURenderPass * render_pass, SDL_FColor blend_constants)} */
    public static void nSDL_SetGPUBlendConstants(long render_pass, long blend_constants) {
        long __functionAddress = Functions.SetGPUBlendConstants;
        if (CHECKS) {
            check(render_pass);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 2);
            memPutAddress(arguments, stack.npointer(render_pass));
            memPutAddress(arguments + POINTER_SIZE, blend_constants);

            nffi_call(SDL_SetGPUBlendConstantsCIF.address(), __functionAddress, NULL, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void SDL_SetGPUBlendConstants(SDL_GPURenderPass * render_pass, SDL_FColor blend_constants)} */
    public static void SDL_SetGPUBlendConstants(@NativeType("SDL_GPURenderPass *") long render_pass, SDL_FColor blend_constants) {
        nSDL_SetGPUBlendConstants(render_pass, blend_constants.address());
    }

    // --- [ SDL_SetGPUStencilReference ] ---

    /** {@code void SDL_SetGPUStencilReference(SDL_GPURenderPass * render_pass, Uint8 reference)} */
    public static void SDL_SetGPUStencilReference(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint8") byte reference) {
        long __functionAddress = Functions.SetGPUStencilReference;
        if (CHECKS) {
            check(render_pass);
        }
        invokePUV(render_pass, reference, __functionAddress);
    }

    // --- [ SDL_BindGPUVertexBuffers ] ---

    /** {@code void SDL_BindGPUVertexBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBufferBinding const * bindings, Uint32 num_bindings)} */
    public static void nSDL_BindGPUVertexBuffers(long render_pass, int first_slot, long bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexBuffers;
        if (CHECKS) {
            check(render_pass);
            if (bindings != NULL) { Struct.validate(bindings, num_bindings, SDL_GPUBufferBinding.SIZEOF, SDL_GPUBufferBinding::validate); }
        }
        invokePPV(render_pass, first_slot, bindings, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUVertexBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBufferBinding const * bindings, Uint32 num_bindings)} */
    public static void SDL_BindGPUVertexBuffers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBufferBinding const *") SDL_GPUBufferBinding.@Nullable Buffer bindings) {
        nSDL_BindGPUVertexBuffers(render_pass, first_slot, memAddressSafe(bindings), remainingSafe(bindings));
    }

    // --- [ SDL_BindGPUIndexBuffer ] ---

    /** {@code void SDL_BindGPUIndexBuffer(SDL_GPURenderPass * render_pass, SDL_GPUBufferBinding const * binding, SDL_GPUIndexElementSize index_element_size)} */
    public static void nSDL_BindGPUIndexBuffer(long render_pass, long binding, int index_element_size) {
        long __functionAddress = Functions.BindGPUIndexBuffer;
        if (CHECKS) {
            check(render_pass);
            SDL_GPUBufferBinding.validate(binding);
        }
        invokePPV(render_pass, binding, index_element_size, __functionAddress);
    }

    /** {@code void SDL_BindGPUIndexBuffer(SDL_GPURenderPass * render_pass, SDL_GPUBufferBinding const * binding, SDL_GPUIndexElementSize index_element_size)} */
    public static void SDL_BindGPUIndexBuffer(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUBufferBinding const *") SDL_GPUBufferBinding binding, @NativeType("SDL_GPUIndexElementSize") int index_element_size) {
        nSDL_BindGPUIndexBuffer(render_pass, binding.address(), index_element_size);
    }

    // --- [ SDL_BindGPUVertexSamplers ] ---

    /** {@code void SDL_BindGPUVertexSamplers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void nSDL_BindGPUVertexSamplers(long render_pass, int first_slot, long texture_sampler_bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexSamplers;
        if (CHECKS) {
            check(render_pass);
            if (texture_sampler_bindings != NULL) { Struct.validate(texture_sampler_bindings, num_bindings, SDL_GPUTextureSamplerBinding.SIZEOF, SDL_GPUTextureSamplerBinding::validate); }
        }
        invokePPV(render_pass, first_slot, texture_sampler_bindings, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUVertexSamplers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void SDL_BindGPUVertexSamplers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.@Nullable Buffer texture_sampler_bindings) {
        nSDL_BindGPUVertexSamplers(render_pass, first_slot, memAddressSafe(texture_sampler_bindings), remainingSafe(texture_sampler_bindings));
    }

    // --- [ SDL_BindGPUVertexStorageTextures ] ---

    /** {@code void SDL_BindGPUVertexStorageTextures(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void nSDL_BindGPUVertexStorageTextures(long render_pass, int first_slot, long storage_textures, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexStorageTextures;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, first_slot, storage_textures, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUVertexStorageTextures(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void SDL_BindGPUVertexStorageTextures(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTexture * const *") @Nullable PointerBuffer storage_textures) {
        nSDL_BindGPUVertexStorageTextures(render_pass, first_slot, memAddressSafe(storage_textures), remainingSafe(storage_textures));
    }

    // --- [ SDL_BindGPUVertexStorageBuffers ] ---

    /** {@code void SDL_BindGPUVertexStorageBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void nSDL_BindGPUVertexStorageBuffers(long render_pass, int first_slot, long storage_buffers, int num_bindings) {
        long __functionAddress = Functions.BindGPUVertexStorageBuffers;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, first_slot, storage_buffers, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUVertexStorageBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void SDL_BindGPUVertexStorageBuffers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBuffer * const *") @Nullable PointerBuffer storage_buffers) {
        nSDL_BindGPUVertexStorageBuffers(render_pass, first_slot, memAddressSafe(storage_buffers), remainingSafe(storage_buffers));
    }

    // --- [ SDL_BindGPUFragmentSamplers ] ---

    /** {@code void SDL_BindGPUFragmentSamplers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void nSDL_BindGPUFragmentSamplers(long render_pass, int first_slot, long texture_sampler_bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUFragmentSamplers;
        if (CHECKS) {
            check(render_pass);
            if (texture_sampler_bindings != NULL) { Struct.validate(texture_sampler_bindings, num_bindings, SDL_GPUTextureSamplerBinding.SIZEOF, SDL_GPUTextureSamplerBinding::validate); }
        }
        invokePPV(render_pass, first_slot, texture_sampler_bindings, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUFragmentSamplers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void SDL_BindGPUFragmentSamplers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.@Nullable Buffer texture_sampler_bindings) {
        nSDL_BindGPUFragmentSamplers(render_pass, first_slot, memAddressSafe(texture_sampler_bindings), remainingSafe(texture_sampler_bindings));
    }

    // --- [ SDL_BindGPUFragmentStorageTextures ] ---

    /** {@code void SDL_BindGPUFragmentStorageTextures(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void nSDL_BindGPUFragmentStorageTextures(long render_pass, int first_slot, long storage_textures, int num_bindings) {
        long __functionAddress = Functions.BindGPUFragmentStorageTextures;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, first_slot, storage_textures, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUFragmentStorageTextures(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void SDL_BindGPUFragmentStorageTextures(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTexture * const *") @Nullable PointerBuffer storage_textures) {
        nSDL_BindGPUFragmentStorageTextures(render_pass, first_slot, memAddressSafe(storage_textures), remainingSafe(storage_textures));
    }

    // --- [ SDL_BindGPUFragmentStorageBuffers ] ---

    /** {@code void SDL_BindGPUFragmentStorageBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void nSDL_BindGPUFragmentStorageBuffers(long render_pass, int first_slot, long storage_buffers, int num_bindings) {
        long __functionAddress = Functions.BindGPUFragmentStorageBuffers;
        if (CHECKS) {
            check(render_pass);
        }
        invokePPV(render_pass, first_slot, storage_buffers, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUFragmentStorageBuffers(SDL_GPURenderPass * render_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void SDL_BindGPUFragmentStorageBuffers(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBuffer * const *") @Nullable PointerBuffer storage_buffers) {
        nSDL_BindGPUFragmentStorageBuffers(render_pass, first_slot, memAddressSafe(storage_buffers), remainingSafe(storage_buffers));
    }

    // --- [ SDL_DrawGPUIndexedPrimitives ] ---

    /** {@code void SDL_DrawGPUIndexedPrimitives(SDL_GPURenderPass * render_pass, Uint32 num_indices, Uint32 num_instances, Uint32 first_index, Sint32 vertex_offset, Uint32 first_instance)} */
    public static void SDL_DrawGPUIndexedPrimitives(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int num_indices, @NativeType("Uint32") int num_instances, @NativeType("Uint32") int first_index, @NativeType("Sint32") int vertex_offset, @NativeType("Uint32") int first_instance) {
        long __functionAddress = Functions.DrawGPUIndexedPrimitives;
        if (CHECKS) {
            check(render_pass);
        }
        invokePV(render_pass, num_indices, num_instances, first_index, vertex_offset, first_instance, __functionAddress);
    }

    // --- [ SDL_DrawGPUPrimitives ] ---

    /** {@code void SDL_DrawGPUPrimitives(SDL_GPURenderPass * render_pass, Uint32 num_vertices, Uint32 num_instances, Uint32 first_vertex, Uint32 first_instance)} */
    public static void SDL_DrawGPUPrimitives(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("Uint32") int num_vertices, @NativeType("Uint32") int num_instances, @NativeType("Uint32") int first_vertex, @NativeType("Uint32") int first_instance) {
        long __functionAddress = Functions.DrawGPUPrimitives;
        if (CHECKS) {
            check(render_pass);
        }
        invokePV(render_pass, num_vertices, num_instances, first_vertex, first_instance, __functionAddress);
    }

    // --- [ SDL_DrawGPUPrimitivesIndirect ] ---

    /** {@code void SDL_DrawGPUPrimitivesIndirect(SDL_GPURenderPass * render_pass, SDL_GPUBuffer * buffer, Uint32 offset, Uint32 draw_count)} */
    public static void SDL_DrawGPUPrimitivesIndirect(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("Uint32") int offset, @NativeType("Uint32") int draw_count) {
        long __functionAddress = Functions.DrawGPUPrimitivesIndirect;
        if (CHECKS) {
            check(render_pass);
            check(buffer);
        }
        invokePPV(render_pass, buffer, offset, draw_count, __functionAddress);
    }

    // --- [ SDL_DrawGPUIndexedPrimitivesIndirect ] ---

    /** {@code void SDL_DrawGPUIndexedPrimitivesIndirect(SDL_GPURenderPass * render_pass, SDL_GPUBuffer * buffer, Uint32 offset, Uint32 draw_count)} */
    public static void SDL_DrawGPUIndexedPrimitivesIndirect(@NativeType("SDL_GPURenderPass *") long render_pass, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("Uint32") int offset, @NativeType("Uint32") int draw_count) {
        long __functionAddress = Functions.DrawGPUIndexedPrimitivesIndirect;
        if (CHECKS) {
            check(render_pass);
            check(buffer);
        }
        invokePPV(render_pass, buffer, offset, draw_count, __functionAddress);
    }

    // --- [ SDL_EndGPURenderPass ] ---

    /** {@code void SDL_EndGPURenderPass(SDL_GPURenderPass * render_pass)} */
    public static void SDL_EndGPURenderPass(@NativeType("SDL_GPURenderPass *") long render_pass) {
        long __functionAddress = Functions.EndGPURenderPass;
        if (CHECKS) {
            check(render_pass);
        }
        invokePV(render_pass, __functionAddress);
    }

    // --- [ SDL_BeginGPUComputePass ] ---

    /** {@code SDL_GPUComputePass * SDL_BeginGPUComputePass(SDL_GPUCommandBuffer * command_buffer, SDL_GPUStorageTextureReadWriteBinding const * storage_texture_bindings, Uint32 num_storage_texture_bindings, SDL_GPUStorageBufferReadWriteBinding const * storage_buffer_bindings, Uint32 num_storage_buffer_bindings)} */
    public static long nSDL_BeginGPUComputePass(long command_buffer, long storage_texture_bindings, int num_storage_texture_bindings, long storage_buffer_bindings, int num_storage_buffer_bindings) {
        long __functionAddress = Functions.BeginGPUComputePass;
        if (CHECKS) {
            check(command_buffer);
            if (storage_texture_bindings != NULL) { Struct.validate(storage_texture_bindings, num_storage_texture_bindings, SDL_GPUStorageTextureReadWriteBinding.SIZEOF, SDL_GPUStorageTextureReadWriteBinding::validate); }
            if (storage_buffer_bindings != NULL) { Struct.validate(storage_buffer_bindings, num_storage_buffer_bindings, SDL_GPUStorageBufferReadWriteBinding.SIZEOF, SDL_GPUStorageBufferReadWriteBinding::validate); }
        }
        return invokePPPP(command_buffer, storage_texture_bindings, num_storage_texture_bindings, storage_buffer_bindings, num_storage_buffer_bindings, __functionAddress);
    }

    /** {@code SDL_GPUComputePass * SDL_BeginGPUComputePass(SDL_GPUCommandBuffer * command_buffer, SDL_GPUStorageTextureReadWriteBinding const * storage_texture_bindings, Uint32 num_storage_texture_bindings, SDL_GPUStorageBufferReadWriteBinding const * storage_buffer_bindings, Uint32 num_storage_buffer_bindings)} */
    @NativeType("SDL_GPUComputePass *")
    public static long SDL_BeginGPUComputePass(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUStorageTextureReadWriteBinding const *") SDL_GPUStorageTextureReadWriteBinding.@Nullable Buffer storage_texture_bindings, @NativeType("SDL_GPUStorageBufferReadWriteBinding const *") SDL_GPUStorageBufferReadWriteBinding.@Nullable Buffer storage_buffer_bindings) {
        return nSDL_BeginGPUComputePass(command_buffer, memAddressSafe(storage_texture_bindings), remainingSafe(storage_texture_bindings), memAddressSafe(storage_buffer_bindings), remainingSafe(storage_buffer_bindings));
    }

    // --- [ SDL_BindGPUComputePipeline ] ---

    /** {@code void SDL_BindGPUComputePipeline(SDL_GPUComputePass * compute_pass, SDL_GPUComputePipeline * compute_pipeline)} */
    public static void SDL_BindGPUComputePipeline(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("SDL_GPUComputePipeline *") long compute_pipeline) {
        long __functionAddress = Functions.BindGPUComputePipeline;
        if (CHECKS) {
            check(compute_pass);
            check(compute_pipeline);
        }
        invokePPV(compute_pass, compute_pipeline, __functionAddress);
    }

    // --- [ SDL_BindGPUComputeSamplers ] ---

    /** {@code void SDL_BindGPUComputeSamplers(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void nSDL_BindGPUComputeSamplers(long compute_pass, int first_slot, long texture_sampler_bindings, int num_bindings) {
        long __functionAddress = Functions.BindGPUComputeSamplers;
        if (CHECKS) {
            check(compute_pass);
            if (texture_sampler_bindings != NULL) { Struct.validate(texture_sampler_bindings, num_bindings, SDL_GPUTextureSamplerBinding.SIZEOF, SDL_GPUTextureSamplerBinding::validate); }
        }
        invokePPV(compute_pass, first_slot, texture_sampler_bindings, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUComputeSamplers(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUTextureSamplerBinding const * texture_sampler_bindings, Uint32 num_bindings)} */
    public static void SDL_BindGPUComputeSamplers(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTextureSamplerBinding const *") SDL_GPUTextureSamplerBinding.@Nullable Buffer texture_sampler_bindings) {
        nSDL_BindGPUComputeSamplers(compute_pass, first_slot, memAddressSafe(texture_sampler_bindings), remainingSafe(texture_sampler_bindings));
    }

    // --- [ SDL_BindGPUComputeStorageTextures ] ---

    /** {@code void SDL_BindGPUComputeStorageTextures(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void nSDL_BindGPUComputeStorageTextures(long compute_pass, int first_slot, long storage_textures, int num_bindings) {
        long __functionAddress = Functions.BindGPUComputeStorageTextures;
        if (CHECKS) {
            check(compute_pass);
        }
        invokePPV(compute_pass, first_slot, storage_textures, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUComputeStorageTextures(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUTexture * const * storage_textures, Uint32 num_bindings)} */
    public static void SDL_BindGPUComputeStorageTextures(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUTexture * const *") @Nullable PointerBuffer storage_textures) {
        nSDL_BindGPUComputeStorageTextures(compute_pass, first_slot, memAddressSafe(storage_textures), remainingSafe(storage_textures));
    }

    // --- [ SDL_BindGPUComputeStorageBuffers ] ---

    /** {@code void SDL_BindGPUComputeStorageBuffers(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void nSDL_BindGPUComputeStorageBuffers(long compute_pass, int first_slot, long storage_buffers, int num_bindings) {
        long __functionAddress = Functions.BindGPUComputeStorageBuffers;
        if (CHECKS) {
            check(compute_pass);
        }
        invokePPV(compute_pass, first_slot, storage_buffers, num_bindings, __functionAddress);
    }

    /** {@code void SDL_BindGPUComputeStorageBuffers(SDL_GPUComputePass * compute_pass, Uint32 first_slot, SDL_GPUBuffer * const * storage_buffers, Uint32 num_bindings)} */
    public static void SDL_BindGPUComputeStorageBuffers(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int first_slot, @NativeType("SDL_GPUBuffer * const *") @Nullable PointerBuffer storage_buffers) {
        nSDL_BindGPUComputeStorageBuffers(compute_pass, first_slot, memAddressSafe(storage_buffers), remainingSafe(storage_buffers));
    }

    // --- [ SDL_DispatchGPUCompute ] ---

    /** {@code void SDL_DispatchGPUCompute(SDL_GPUComputePass * compute_pass, Uint32 groupcount_x, Uint32 groupcount_y, Uint32 groupcount_z)} */
    public static void SDL_DispatchGPUCompute(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("Uint32") int groupcount_x, @NativeType("Uint32") int groupcount_y, @NativeType("Uint32") int groupcount_z) {
        long __functionAddress = Functions.DispatchGPUCompute;
        if (CHECKS) {
            check(compute_pass);
        }
        invokePV(compute_pass, groupcount_x, groupcount_y, groupcount_z, __functionAddress);
    }

    // --- [ SDL_DispatchGPUComputeIndirect ] ---

    /** {@code void SDL_DispatchGPUComputeIndirect(SDL_GPUComputePass * compute_pass, SDL_GPUBuffer * buffer, Uint32 offset)} */
    public static void SDL_DispatchGPUComputeIndirect(@NativeType("SDL_GPUComputePass *") long compute_pass, @NativeType("SDL_GPUBuffer *") long buffer, @NativeType("Uint32") int offset) {
        long __functionAddress = Functions.DispatchGPUComputeIndirect;
        if (CHECKS) {
            check(compute_pass);
            check(buffer);
        }
        invokePPV(compute_pass, buffer, offset, __functionAddress);
    }

    // --- [ SDL_EndGPUComputePass ] ---

    /** {@code void SDL_EndGPUComputePass(SDL_GPUComputePass * compute_pass)} */
    public static void SDL_EndGPUComputePass(@NativeType("SDL_GPUComputePass *") long compute_pass) {
        long __functionAddress = Functions.EndGPUComputePass;
        if (CHECKS) {
            check(compute_pass);
        }
        invokePV(compute_pass, __functionAddress);
    }

    // --- [ SDL_MapGPUTransferBuffer ] ---

    /** {@code void * SDL_MapGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBuffer * transfer_buffer, bool cycle, size_t buffer_size)} */
    public static long nSDL_MapGPUTransferBuffer(long device, long transfer_buffer, boolean cycle) {
        long __functionAddress = Functions.MapGPUTransferBuffer;
        if (CHECKS) {
            check(device);
            check(transfer_buffer);
        }
        return invokePPP(device, transfer_buffer, cycle, __functionAddress);
    }

    /** {@code void * SDL_MapGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBuffer * transfer_buffer, bool cycle, size_t buffer_size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_MapGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBuffer *") long transfer_buffer, @NativeType("bool") boolean cycle, @NativeType("size_t") long buffer_size) {
        long __result = nSDL_MapGPUTransferBuffer(device, transfer_buffer, cycle);
        return memByteBufferSafe(__result, (int)buffer_size);
    }

    // --- [ SDL_UnmapGPUTransferBuffer ] ---

    /** {@code void SDL_UnmapGPUTransferBuffer(SDL_GPUDevice * device, SDL_GPUTransferBuffer * transfer_buffer)} */
    public static void SDL_UnmapGPUTransferBuffer(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTransferBuffer *") long transfer_buffer) {
        long __functionAddress = Functions.UnmapGPUTransferBuffer;
        if (CHECKS) {
            check(device);
            check(transfer_buffer);
        }
        invokePPV(device, transfer_buffer, __functionAddress);
    }

    // --- [ SDL_BeginGPUCopyPass ] ---

    /** {@code SDL_GPUCopyPass * SDL_BeginGPUCopyPass(SDL_GPUCommandBuffer * command_buffer)} */
    @NativeType("SDL_GPUCopyPass *")
    public static long SDL_BeginGPUCopyPass(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.BeginGPUCopyPass;
        if (CHECKS) {
            check(command_buffer);
        }
        return invokePP(command_buffer, __functionAddress);
    }

    // --- [ SDL_UploadToGPUTexture ] ---

    /** {@code void SDL_UploadToGPUTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureTransferInfo const * source, SDL_GPUTextureRegion const * destination, bool cycle)} */
    public static void nSDL_UploadToGPUTexture(long copy_pass, long source, long destination, boolean cycle) {
        long __functionAddress = Functions.UploadToGPUTexture;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUTextureTransferInfo.validate(source);
            SDL_GPUTextureRegion.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, cycle, __functionAddress);
    }

    /** {@code void SDL_UploadToGPUTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureTransferInfo const * source, SDL_GPUTextureRegion const * destination, bool cycle)} */
    public static void SDL_UploadToGPUTexture(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTextureTransferInfo const *") SDL_GPUTextureTransferInfo source, @NativeType("SDL_GPUTextureRegion const *") SDL_GPUTextureRegion destination, @NativeType("bool") boolean cycle) {
        nSDL_UploadToGPUTexture(copy_pass, source.address(), destination.address(), cycle);
    }

    // --- [ SDL_UploadToGPUBuffer ] ---

    /** {@code void SDL_UploadToGPUBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUTransferBufferLocation const * source, SDL_GPUBufferRegion const * destination, bool cycle)} */
    public static void nSDL_UploadToGPUBuffer(long copy_pass, long source, long destination, boolean cycle) {
        long __functionAddress = Functions.UploadToGPUBuffer;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUTransferBufferLocation.validate(source);
            SDL_GPUBufferRegion.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, cycle, __functionAddress);
    }

    /** {@code void SDL_UploadToGPUBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUTransferBufferLocation const * source, SDL_GPUBufferRegion const * destination, bool cycle)} */
    public static void SDL_UploadToGPUBuffer(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTransferBufferLocation const *") SDL_GPUTransferBufferLocation source, @NativeType("SDL_GPUBufferRegion const *") SDL_GPUBufferRegion destination, @NativeType("bool") boolean cycle) {
        nSDL_UploadToGPUBuffer(copy_pass, source.address(), destination.address(), cycle);
    }

    // --- [ SDL_CopyGPUTextureToTexture ] ---

    /** {@code void SDL_CopyGPUTextureToTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureLocation const * source, SDL_GPUTextureLocation const * destination, Uint32 w, Uint32 h, Uint32 d, bool cycle)} */
    public static void nSDL_CopyGPUTextureToTexture(long copy_pass, long source, long destination, int w, int h, int d, boolean cycle) {
        long __functionAddress = Functions.CopyGPUTextureToTexture;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUTextureLocation.validate(source);
            SDL_GPUTextureLocation.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, w, h, d, cycle, __functionAddress);
    }

    /** {@code void SDL_CopyGPUTextureToTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureLocation const * source, SDL_GPUTextureLocation const * destination, Uint32 w, Uint32 h, Uint32 d, bool cycle)} */
    public static void SDL_CopyGPUTextureToTexture(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTextureLocation const *") SDL_GPUTextureLocation source, @NativeType("SDL_GPUTextureLocation const *") SDL_GPUTextureLocation destination, @NativeType("Uint32") int w, @NativeType("Uint32") int h, @NativeType("Uint32") int d, @NativeType("bool") boolean cycle) {
        nSDL_CopyGPUTextureToTexture(copy_pass, source.address(), destination.address(), w, h, d, cycle);
    }

    // --- [ SDL_CopyGPUBufferToBuffer ] ---

    /** {@code void SDL_CopyGPUBufferToBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUBufferLocation const * source, SDL_GPUBufferLocation const * destination, Uint32 size, bool cycle)} */
    public static void nSDL_CopyGPUBufferToBuffer(long copy_pass, long source, long destination, int size, boolean cycle) {
        long __functionAddress = Functions.CopyGPUBufferToBuffer;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUBufferLocation.validate(source);
            SDL_GPUBufferLocation.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, size, cycle, __functionAddress);
    }

    /** {@code void SDL_CopyGPUBufferToBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUBufferLocation const * source, SDL_GPUBufferLocation const * destination, Uint32 size, bool cycle)} */
    public static void SDL_CopyGPUBufferToBuffer(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUBufferLocation const *") SDL_GPUBufferLocation source, @NativeType("SDL_GPUBufferLocation const *") SDL_GPUBufferLocation destination, @NativeType("Uint32") int size, @NativeType("bool") boolean cycle) {
        nSDL_CopyGPUBufferToBuffer(copy_pass, source.address(), destination.address(), size, cycle);
    }

    // --- [ SDL_DownloadFromGPUTexture ] ---

    /** {@code void SDL_DownloadFromGPUTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureRegion const * source, SDL_GPUTextureTransferInfo const * destination)} */
    public static void nSDL_DownloadFromGPUTexture(long copy_pass, long source, long destination) {
        long __functionAddress = Functions.DownloadFromGPUTexture;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUTextureRegion.validate(source);
            SDL_GPUTextureTransferInfo.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, __functionAddress);
    }

    /** {@code void SDL_DownloadFromGPUTexture(SDL_GPUCopyPass * copy_pass, SDL_GPUTextureRegion const * source, SDL_GPUTextureTransferInfo const * destination)} */
    public static void SDL_DownloadFromGPUTexture(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUTextureRegion const *") SDL_GPUTextureRegion source, @NativeType("SDL_GPUTextureTransferInfo const *") SDL_GPUTextureTransferInfo destination) {
        nSDL_DownloadFromGPUTexture(copy_pass, source.address(), destination.address());
    }

    // --- [ SDL_DownloadFromGPUBuffer ] ---

    /** {@code void SDL_DownloadFromGPUBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUBufferRegion const * source, SDL_GPUTransferBufferLocation const * destination)} */
    public static void nSDL_DownloadFromGPUBuffer(long copy_pass, long source, long destination) {
        long __functionAddress = Functions.DownloadFromGPUBuffer;
        if (CHECKS) {
            check(copy_pass);
            SDL_GPUBufferRegion.validate(source);
            SDL_GPUTransferBufferLocation.validate(destination);
        }
        invokePPPV(copy_pass, source, destination, __functionAddress);
    }

    /** {@code void SDL_DownloadFromGPUBuffer(SDL_GPUCopyPass * copy_pass, SDL_GPUBufferRegion const * source, SDL_GPUTransferBufferLocation const * destination)} */
    public static void SDL_DownloadFromGPUBuffer(@NativeType("SDL_GPUCopyPass *") long copy_pass, @NativeType("SDL_GPUBufferRegion const *") SDL_GPUBufferRegion source, @NativeType("SDL_GPUTransferBufferLocation const *") SDL_GPUTransferBufferLocation destination) {
        nSDL_DownloadFromGPUBuffer(copy_pass, source.address(), destination.address());
    }

    // --- [ SDL_EndGPUCopyPass ] ---

    /** {@code void SDL_EndGPUCopyPass(SDL_GPUCopyPass * copy_pass)} */
    public static void SDL_EndGPUCopyPass(@NativeType("SDL_GPUCopyPass *") long copy_pass) {
        long __functionAddress = Functions.EndGPUCopyPass;
        if (CHECKS) {
            check(copy_pass);
        }
        invokePV(copy_pass, __functionAddress);
    }

    // --- [ SDL_GenerateMipmapsForGPUTexture ] ---

    /** {@code void SDL_GenerateMipmapsForGPUTexture(SDL_GPUCommandBuffer * command_buffer, SDL_GPUTexture * texture)} */
    public static void SDL_GenerateMipmapsForGPUTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUTexture *") long texture) {
        long __functionAddress = Functions.GenerateMipmapsForGPUTexture;
        if (CHECKS) {
            check(command_buffer);
            check(texture);
        }
        invokePPV(command_buffer, texture, __functionAddress);
    }

    // --- [ SDL_BlitGPUTexture ] ---

    /** {@code void SDL_BlitGPUTexture(SDL_GPUCommandBuffer * command_buffer, SDL_GPUBlitInfo const * info)} */
    public static void nSDL_BlitGPUTexture(long command_buffer, long info) {
        long __functionAddress = Functions.BlitGPUTexture;
        if (CHECKS) {
            check(command_buffer);
            SDL_GPUBlitInfo.validate(info);
        }
        invokePPV(command_buffer, info, __functionAddress);
    }

    /** {@code void SDL_BlitGPUTexture(SDL_GPUCommandBuffer * command_buffer, SDL_GPUBlitInfo const * info)} */
    public static void SDL_BlitGPUTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_GPUBlitInfo const *") SDL_GPUBlitInfo info) {
        nSDL_BlitGPUTexture(command_buffer, info.address());
    }

    // --- [ SDL_WindowSupportsGPUSwapchainComposition ] ---

    /** {@code bool SDL_WindowSupportsGPUSwapchainComposition(SDL_GPUDevice * device, SDL_Window * window, SDL_GPUSwapchainComposition swapchain_composition)} */
    @NativeType("bool")
    public static boolean SDL_WindowSupportsGPUSwapchainComposition(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUSwapchainComposition") int swapchain_composition) {
        long __functionAddress = Functions.WindowSupportsGPUSwapchainComposition;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPZ(device, window, swapchain_composition, __functionAddress);
    }

    // --- [ SDL_WindowSupportsGPUPresentMode ] ---

    /** {@code bool SDL_WindowSupportsGPUPresentMode(SDL_GPUDevice * device, SDL_Window * window, SDL_GPUPresentMode present_mode)} */
    @NativeType("bool")
    public static boolean SDL_WindowSupportsGPUPresentMode(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUPresentMode") int present_mode) {
        long __functionAddress = Functions.WindowSupportsGPUPresentMode;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPZ(device, window, present_mode, __functionAddress);
    }

    // --- [ SDL_ClaimWindowForGPUDevice ] ---

    /** {@code bool SDL_ClaimWindowForGPUDevice(SDL_GPUDevice * device, SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ClaimWindowForGPUDevice(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ClaimWindowForGPUDevice;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPZ(device, window, __functionAddress);
    }

    // --- [ SDL_ReleaseWindowFromGPUDevice ] ---

    /** {@code void SDL_ReleaseWindowFromGPUDevice(SDL_GPUDevice * device, SDL_Window * window)} */
    public static void SDL_ReleaseWindowFromGPUDevice(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ReleaseWindowFromGPUDevice;
        if (CHECKS) {
            check(device);
            check(window);
        }
        invokePPV(device, window, __functionAddress);
    }

    // --- [ SDL_SetGPUSwapchainParameters ] ---

    /** {@code bool SDL_SetGPUSwapchainParameters(SDL_GPUDevice * device, SDL_Window * window, SDL_GPUSwapchainComposition swapchain_composition, SDL_GPUPresentMode present_mode)} */
    @NativeType("bool")
    public static boolean SDL_SetGPUSwapchainParameters(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUSwapchainComposition") int swapchain_composition, @NativeType("SDL_GPUPresentMode") int present_mode) {
        long __functionAddress = Functions.SetGPUSwapchainParameters;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPZ(device, window, swapchain_composition, present_mode, __functionAddress);
    }

    // --- [ SDL_SetGPUAllowedFramesInFlight ] ---

    /** {@code bool SDL_SetGPUAllowedFramesInFlight(SDL_GPUDevice * device, Uint32 allowed_frames_in_flight)} */
    @NativeType("bool")
    public static boolean SDL_SetGPUAllowedFramesInFlight(@NativeType("SDL_GPUDevice *") long device, @NativeType("Uint32") int allowed_frames_in_flight) {
        long __functionAddress = Functions.SetGPUAllowedFramesInFlight;
        if (CHECKS) {
            check(device);
        }
        return invokePZ(device, allowed_frames_in_flight, __functionAddress);
    }

    // --- [ SDL_GetGPUSwapchainTextureFormat ] ---

    /** {@code SDL_GPUTextureFormat SDL_GetGPUSwapchainTextureFormat(SDL_GPUDevice * device, SDL_Window * window)} */
    @NativeType("SDL_GPUTextureFormat")
    public static int SDL_GetGPUSwapchainTextureFormat(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetGPUSwapchainTextureFormat;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPI(device, window, __functionAddress);
    }

    // --- [ SDL_AcquireGPUSwapchainTexture ] ---

    /** {@code bool SDL_AcquireGPUSwapchainTexture(SDL_GPUCommandBuffer * command_buffer, SDL_Window * window, SDL_GPUTexture ** swapchain_texture, Uint32 * swapchain_texture_width, Uint32 * swapchain_texture_height)} */
    public static boolean nSDL_AcquireGPUSwapchainTexture(long command_buffer, long window, long swapchain_texture, long swapchain_texture_width, long swapchain_texture_height) {
        long __functionAddress = Functions.AcquireGPUSwapchainTexture;
        if (CHECKS) {
            check(command_buffer);
            check(window);
        }
        return invokePPPPPZ(command_buffer, window, swapchain_texture, swapchain_texture_width, swapchain_texture_height, __functionAddress);
    }

    /** {@code bool SDL_AcquireGPUSwapchainTexture(SDL_GPUCommandBuffer * command_buffer, SDL_Window * window, SDL_GPUTexture ** swapchain_texture, Uint32 * swapchain_texture_width, Uint32 * swapchain_texture_height)} */
    @NativeType("bool")
    public static boolean SDL_AcquireGPUSwapchainTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUTexture **") PointerBuffer swapchain_texture, @NativeType("Uint32 *") @Nullable IntBuffer swapchain_texture_width, @NativeType("Uint32 *") @Nullable IntBuffer swapchain_texture_height) {
        if (CHECKS) {
            check(swapchain_texture, 1);
            checkSafe(swapchain_texture_width, 1);
            checkSafe(swapchain_texture_height, 1);
        }
        return nSDL_AcquireGPUSwapchainTexture(command_buffer, window, memAddress(swapchain_texture), memAddressSafe(swapchain_texture_width), memAddressSafe(swapchain_texture_height));
    }

    // --- [ SDL_WaitForGPUSwapchain ] ---

    /** {@code bool SDL_WaitForGPUSwapchain(SDL_GPUDevice * device, SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_WaitForGPUSwapchain(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.WaitForGPUSwapchain;
        if (CHECKS) {
            check(device);
            check(window);
        }
        return invokePPZ(device, window, __functionAddress);
    }

    // --- [ SDL_WaitAndAcquireGPUSwapchainTexture ] ---

    /** {@code bool SDL_WaitAndAcquireGPUSwapchainTexture(SDL_GPUCommandBuffer * command_buffer, SDL_Window * window, SDL_GPUTexture ** swapchain_texture, Uint32 * swapchain_texture_width, Uint32 * swapchain_texture_height)} */
    public static boolean nSDL_WaitAndAcquireGPUSwapchainTexture(long command_buffer, long window, long swapchain_texture, long swapchain_texture_width, long swapchain_texture_height) {
        long __functionAddress = Functions.WaitAndAcquireGPUSwapchainTexture;
        if (CHECKS) {
            check(command_buffer);
            check(window);
        }
        return invokePPPPPZ(command_buffer, window, swapchain_texture, swapchain_texture_width, swapchain_texture_height, __functionAddress);
    }

    /** {@code bool SDL_WaitAndAcquireGPUSwapchainTexture(SDL_GPUCommandBuffer * command_buffer, SDL_Window * window, SDL_GPUTexture ** swapchain_texture, Uint32 * swapchain_texture_width, Uint32 * swapchain_texture_height)} */
    @NativeType("bool")
    public static boolean SDL_WaitAndAcquireGPUSwapchainTexture(@NativeType("SDL_GPUCommandBuffer *") long command_buffer, @NativeType("SDL_Window *") long window, @NativeType("SDL_GPUTexture **") PointerBuffer swapchain_texture, @NativeType("Uint32 *") @Nullable IntBuffer swapchain_texture_width, @NativeType("Uint32 *") @Nullable IntBuffer swapchain_texture_height) {
        if (CHECKS) {
            check(swapchain_texture, 1);
            checkSafe(swapchain_texture_width, 1);
            checkSafe(swapchain_texture_height, 1);
        }
        return nSDL_WaitAndAcquireGPUSwapchainTexture(command_buffer, window, memAddress(swapchain_texture), memAddressSafe(swapchain_texture_width), memAddressSafe(swapchain_texture_height));
    }

    // --- [ SDL_SubmitGPUCommandBuffer ] ---

    /** {@code bool SDL_SubmitGPUCommandBuffer(SDL_GPUCommandBuffer * command_buffer)} */
    @NativeType("bool")
    public static boolean SDL_SubmitGPUCommandBuffer(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.SubmitGPUCommandBuffer;
        if (CHECKS) {
            check(command_buffer);
        }
        return invokePZ(command_buffer, __functionAddress);
    }

    // --- [ SDL_SubmitGPUCommandBufferAndAcquireFence ] ---

    /** {@code SDL_GPUFence * SDL_SubmitGPUCommandBufferAndAcquireFence(SDL_GPUCommandBuffer * command_buffer)} */
    @NativeType("SDL_GPUFence *")
    public static long SDL_SubmitGPUCommandBufferAndAcquireFence(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.SubmitGPUCommandBufferAndAcquireFence;
        if (CHECKS) {
            check(command_buffer);
        }
        return invokePP(command_buffer, __functionAddress);
    }

    // --- [ SDL_CancelGPUCommandBuffer ] ---

    /** {@code bool SDL_CancelGPUCommandBuffer(SDL_GPUCommandBuffer * command_buffer)} */
    @NativeType("bool")
    public static boolean SDL_CancelGPUCommandBuffer(@NativeType("SDL_GPUCommandBuffer *") long command_buffer) {
        long __functionAddress = Functions.CancelGPUCommandBuffer;
        if (CHECKS) {
            check(command_buffer);
        }
        return invokePZ(command_buffer, __functionAddress);
    }

    // --- [ SDL_WaitForGPUIdle ] ---

    /** {@code bool SDL_WaitForGPUIdle(SDL_GPUDevice * device)} */
    @NativeType("bool")
    public static boolean SDL_WaitForGPUIdle(@NativeType("SDL_GPUDevice *") long device) {
        long __functionAddress = Functions.WaitForGPUIdle;
        if (CHECKS) {
            check(device);
        }
        return invokePZ(device, __functionAddress);
    }

    // --- [ SDL_WaitForGPUFences ] ---

    /** {@code bool SDL_WaitForGPUFences(SDL_GPUDevice * device, bool wait_all, SDL_GPUFence * const * fences, Uint32 num_fences)} */
    public static boolean nSDL_WaitForGPUFences(long device, boolean wait_all, long fences, int num_fences) {
        long __functionAddress = Functions.WaitForGPUFences;
        if (CHECKS) {
            check(device);
        }
        return invokePPZ(device, wait_all, fences, num_fences, __functionAddress);
    }

    /** {@code bool SDL_WaitForGPUFences(SDL_GPUDevice * device, bool wait_all, SDL_GPUFence * const * fences, Uint32 num_fences)} */
    @NativeType("bool")
    public static boolean SDL_WaitForGPUFences(@NativeType("SDL_GPUDevice *") long device, @NativeType("bool") boolean wait_all, @NativeType("SDL_GPUFence * const *") @Nullable PointerBuffer fences) {
        return nSDL_WaitForGPUFences(device, wait_all, memAddressSafe(fences), remainingSafe(fences));
    }

    // --- [ SDL_QueryGPUFence ] ---

    /** {@code bool SDL_QueryGPUFence(SDL_GPUDevice * device, SDL_GPUFence * fence)} */
    @NativeType("bool")
    public static boolean SDL_QueryGPUFence(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUFence *") long fence) {
        long __functionAddress = Functions.QueryGPUFence;
        if (CHECKS) {
            check(device);
            check(fence);
        }
        return invokePPZ(device, fence, __functionAddress);
    }

    // --- [ SDL_ReleaseGPUFence ] ---

    /** {@code void SDL_ReleaseGPUFence(SDL_GPUDevice * device, SDL_GPUFence * fence)} */
    public static void SDL_ReleaseGPUFence(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUFence *") long fence) {
        long __functionAddress = Functions.ReleaseGPUFence;
        if (CHECKS) {
            check(device);
            check(fence);
        }
        invokePPV(device, fence, __functionAddress);
    }

    // --- [ SDL_GPUTextureFormatTexelBlockSize ] ---

    /** {@code Uint32 SDL_GPUTextureFormatTexelBlockSize(SDL_GPUTextureFormat format)} */
    @NativeType("Uint32")
    public static int SDL_GPUTextureFormatTexelBlockSize(@NativeType("SDL_GPUTextureFormat") int format) {
        long __functionAddress = Functions.GPUTextureFormatTexelBlockSize;
        return invokeI(format, __functionAddress);
    }

    // --- [ SDL_GPUTextureSupportsFormat ] ---

    /** {@code bool SDL_GPUTextureSupportsFormat(SDL_GPUDevice * device, SDL_GPUTextureFormat format, SDL_GPUTextureType type, SDL_GPUTextureUsageFlags usage)} */
    @NativeType("bool")
    public static boolean SDL_GPUTextureSupportsFormat(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTextureFormat") int format, @NativeType("SDL_GPUTextureType") int type, @NativeType("SDL_GPUTextureUsageFlags") int usage) {
        long __functionAddress = Functions.GPUTextureSupportsFormat;
        if (CHECKS) {
            check(device);
        }
        return invokePZ(device, format, type, usage, __functionAddress);
    }

    // --- [ SDL_GPUTextureSupportsSampleCount ] ---

    /** {@code bool SDL_GPUTextureSupportsSampleCount(SDL_GPUDevice * device, SDL_GPUTextureFormat format, SDL_GPUSampleCount sample_count)} */
    @NativeType("bool")
    public static boolean SDL_GPUTextureSupportsSampleCount(@NativeType("SDL_GPUDevice *") long device, @NativeType("SDL_GPUTextureFormat") int format, @NativeType("SDL_GPUSampleCount") int sample_count) {
        long __functionAddress = Functions.GPUTextureSupportsSampleCount;
        if (CHECKS) {
            check(device);
        }
        return invokePZ(device, format, sample_count, __functionAddress);
    }

    // --- [ SDL_CalculateGPUTextureFormatSize ] ---

    /** {@code Uint32 SDL_CalculateGPUTextureFormatSize(SDL_GPUTextureFormat format, Uint32 width, Uint32 height, Uint32 depth_or_layer_count)} */
    @NativeType("Uint32")
    public static int SDL_CalculateGPUTextureFormatSize(@NativeType("SDL_GPUTextureFormat") int format, @NativeType("Uint32") int width, @NativeType("Uint32") int height, @NativeType("Uint32") int depth_or_layer_count) {
        long __functionAddress = Functions.CalculateGPUTextureFormatSize;
        return invokeI(format, width, height, depth_or_layer_count, __functionAddress);
    }

    // --- [ SDL_GUIDToString ] ---

    private static final FFICIF SDL_GUIDToStringCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_void,
        apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)), ffi_type_pointer, ffi_type_sint32
    );

    /** {@code void SDL_GUIDToString(SDL_GUID guid, char * pszGUID, int cbGUID)} */
    public static void nSDL_GUIDToString(long guid, long pszGUID, int cbGUID) {
        long __functionAddress = Functions.GUIDToString;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 3);
            memPutAddress(arguments, guid);
            memPutAddress(arguments + POINTER_SIZE, stack.npointer(pszGUID));
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.nint(cbGUID));

            nffi_call(SDL_GUIDToStringCIF.address(), __functionAddress, NULL, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void SDL_GUIDToString(SDL_GUID guid, char * pszGUID, int cbGUID)} */
    public static void SDL_GUIDToString(SDL_GUID guid, @NativeType("char *") ByteBuffer pszGUID, int cbGUID) {
        if (CHECKS) {
            checkNT1(pszGUID);
        }
        nSDL_GUIDToString(guid.address(), memAddress(pszGUID), cbGUID);
    }

    // --- [ SDL_StringToGUID ] ---

    private static final FFICIF SDL_StringToGUIDCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)),
        ffi_type_pointer
    );

    /** {@code SDL_GUID SDL_StringToGUID(char const * pchGUID)} */
    public static void nSDL_StringToGUID(long pchGUID, long __result) {
        long __functionAddress = Functions.StringToGUID;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, stack.npointer(pchGUID));

            nffi_call(SDL_StringToGUIDCIF.address(), __functionAddress, __result, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code SDL_GUID SDL_StringToGUID(char const * pchGUID)} */
    public static SDL_GUID SDL_StringToGUID(@NativeType("char const *") ByteBuffer pchGUID, SDL_GUID __result) {
        if (CHECKS) {
            checkNT1(pchGUID);
        }
        nSDL_StringToGUID(memAddress(pchGUID), __result.address());
        return __result;
    }

    /** {@code SDL_GUID SDL_StringToGUID(char const * pchGUID)} */
    public static SDL_GUID SDL_StringToGUID(@NativeType("char const *") CharSequence pchGUID, SDL_GUID __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchGUID, true);
            long pchGUIDEncoded = stack.getPointerAddress();
            nSDL_StringToGUID(pchGUIDEncoded, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetHaptics ] ---

    /** {@code SDL_HapticID * SDL_GetHaptics(int * count)} */
    public static long nSDL_GetHaptics(long count) {
        long __functionAddress = Functions.GetHaptics;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_HapticID * SDL_GetHaptics(int * count)} */
    @NativeType("SDL_HapticID *")
    public static @Nullable IntBuffer SDL_GetHaptics() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetHaptics(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetHapticNameForID ] ---

    /** {@code char const * SDL_GetHapticNameForID(SDL_HapticID instance_id)} */
    public static long nSDL_GetHapticNameForID(int instance_id) {
        long __functionAddress = Functions.GetHapticNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetHapticNameForID(SDL_HapticID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetHapticNameForID(@NativeType("SDL_HapticID") int instance_id) {
        long __result = nSDL_GetHapticNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_OpenHaptic ] ---

    /** {@code SDL_Haptic * SDL_OpenHaptic(SDL_HapticID instance_id)} */
    @NativeType("SDL_Haptic *")
    public static long SDL_OpenHaptic(@NativeType("SDL_HapticID") int instance_id) {
        long __functionAddress = Functions.OpenHaptic;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetHapticFromID ] ---

    /** {@code SDL_Haptic * SDL_GetHapticFromID(SDL_HapticID instance_id)} */
    @NativeType("SDL_Haptic *")
    public static long SDL_GetHapticFromID(@NativeType("SDL_HapticID") int instance_id) {
        long __functionAddress = Functions.GetHapticFromID;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetHapticID ] ---

    /** {@code SDL_HapticID SDL_GetHapticID(SDL_Haptic * haptic)} */
    @NativeType("SDL_HapticID")
    public static int SDL_GetHapticID(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetHapticID;
        if (CHECKS) {
            check(haptic);
        }
        return invokePI(haptic, __functionAddress);
    }

    // --- [ SDL_GetHapticName ] ---

    /** {@code char const * SDL_GetHapticName(SDL_Haptic * haptic)} */
    public static long nSDL_GetHapticName(long haptic) {
        long __functionAddress = Functions.GetHapticName;
        if (CHECKS) {
            check(haptic);
        }
        return invokePP(haptic, __functionAddress);
    }

    /** {@code char const * SDL_GetHapticName(SDL_Haptic * haptic)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetHapticName(@NativeType("SDL_Haptic *") long haptic) {
        long __result = nSDL_GetHapticName(haptic);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_IsMouseHaptic ] ---

    /** {@code bool SDL_IsMouseHaptic(void)} */
    @NativeType("bool")
    public static boolean SDL_IsMouseHaptic() {
        long __functionAddress = Functions.IsMouseHaptic;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_OpenHapticFromMouse ] ---

    /** {@code SDL_Haptic * SDL_OpenHapticFromMouse(void)} */
    @NativeType("SDL_Haptic *")
    public static long SDL_OpenHapticFromMouse() {
        long __functionAddress = Functions.OpenHapticFromMouse;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_IsJoystickHaptic ] ---

    /** {@code bool SDL_IsJoystickHaptic(SDL_Joystick * joystick)} */
    @NativeType("bool")
    public static boolean SDL_IsJoystickHaptic(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.IsJoystickHaptic;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, __functionAddress);
    }

    // --- [ SDL_OpenHapticFromJoystick ] ---

    /** {@code SDL_Haptic * SDL_OpenHapticFromJoystick(SDL_Joystick * joystick)} */
    @NativeType("SDL_Haptic *")
    public static long SDL_OpenHapticFromJoystick(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.OpenHapticFromJoystick;
        if (CHECKS) {
            check(joystick);
        }
        return invokePP(joystick, __functionAddress);
    }

    // --- [ SDL_CloseHaptic ] ---

    /** {@code void SDL_CloseHaptic(SDL_Haptic * haptic)} */
    public static void SDL_CloseHaptic(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.CloseHaptic;
        if (CHECKS) {
            check(haptic);
        }
        invokePV(haptic, __functionAddress);
    }

    // --- [ SDL_GetMaxHapticEffects ] ---

    /** {@code int SDL_GetMaxHapticEffects(SDL_Haptic * haptic)} */
    public static int SDL_GetMaxHapticEffects(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetMaxHapticEffects;
        if (CHECKS) {
            check(haptic);
        }
        return invokePI(haptic, __functionAddress);
    }

    // --- [ SDL_GetMaxHapticEffectsPlaying ] ---

    /** {@code int SDL_GetMaxHapticEffectsPlaying(SDL_Haptic * haptic)} */
    public static int SDL_GetMaxHapticEffectsPlaying(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetMaxHapticEffectsPlaying;
        if (CHECKS) {
            check(haptic);
        }
        return invokePI(haptic, __functionAddress);
    }

    // --- [ SDL_GetHapticFeatures ] ---

    /** {@code Uint32 SDL_GetHapticFeatures(SDL_Haptic * haptic)} */
    @NativeType("Uint32")
    public static int SDL_GetHapticFeatures(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetHapticFeatures;
        if (CHECKS) {
            check(haptic);
        }
        return invokePI(haptic, __functionAddress);
    }

    // --- [ SDL_GetNumHapticAxes ] ---

    /** {@code int SDL_GetNumHapticAxes(SDL_Haptic * haptic)} */
    public static int SDL_GetNumHapticAxes(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetNumHapticAxes;
        if (CHECKS) {
            check(haptic);
        }
        return invokePI(haptic, __functionAddress);
    }

    // --- [ SDL_HapticEffectSupported ] ---

    /** {@code bool SDL_HapticEffectSupported(SDL_Haptic * haptic, SDL_HapticEffect const * effect)} */
    public static boolean nSDL_HapticEffectSupported(long haptic, long effect) {
        long __functionAddress = Functions.HapticEffectSupported;
        if (CHECKS) {
            check(haptic);
        }
        return invokePPZ(haptic, effect, __functionAddress);
    }

    /** {@code bool SDL_HapticEffectSupported(SDL_Haptic * haptic, SDL_HapticEffect const * effect)} */
    @NativeType("bool")
    public static boolean SDL_HapticEffectSupported(@NativeType("SDL_Haptic *") long haptic, @NativeType("SDL_HapticEffect const *") SDL_HapticEffect.Buffer effect) {
        if (CHECKS) {
            check(effect, 1);
        }
        return nSDL_HapticEffectSupported(haptic, effect.address());
    }

    // --- [ SDL_CreateHapticEffect ] ---

    /** {@code int SDL_CreateHapticEffect(SDL_Haptic * haptic, SDL_HapticEffect const * effect)} */
    public static int nSDL_CreateHapticEffect(long haptic, long effect) {
        long __functionAddress = Functions.CreateHapticEffect;
        if (CHECKS) {
            check(haptic);
        }
        return invokePPI(haptic, effect, __functionAddress);
    }

    /** {@code int SDL_CreateHapticEffect(SDL_Haptic * haptic, SDL_HapticEffect const * effect)} */
    public static int SDL_CreateHapticEffect(@NativeType("SDL_Haptic *") long haptic, @NativeType("SDL_HapticEffect const *") SDL_HapticEffect.Buffer effect) {
        if (CHECKS) {
            check(effect, 1);
        }
        return nSDL_CreateHapticEffect(haptic, effect.address());
    }

    // --- [ SDL_UpdateHapticEffect ] ---

    /** {@code bool SDL_UpdateHapticEffect(SDL_Haptic * haptic, int effect, SDL_HapticEffect const * data)} */
    public static boolean nSDL_UpdateHapticEffect(long haptic, int effect, long data) {
        long __functionAddress = Functions.UpdateHapticEffect;
        if (CHECKS) {
            check(haptic);
        }
        return invokePPZ(haptic, effect, data, __functionAddress);
    }

    /** {@code bool SDL_UpdateHapticEffect(SDL_Haptic * haptic, int effect, SDL_HapticEffect const * data)} */
    @NativeType("bool")
    public static boolean SDL_UpdateHapticEffect(@NativeType("SDL_Haptic *") long haptic, int effect, @NativeType("SDL_HapticEffect const *") SDL_HapticEffect.Buffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        return nSDL_UpdateHapticEffect(haptic, effect, data.address());
    }

    // --- [ SDL_RunHapticEffect ] ---

    /** {@code bool SDL_RunHapticEffect(SDL_Haptic * haptic, int effect, Uint32 iterations)} */
    @NativeType("bool")
    public static boolean SDL_RunHapticEffect(@NativeType("SDL_Haptic *") long haptic, int effect, @NativeType("Uint32") int iterations) {
        long __functionAddress = Functions.RunHapticEffect;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, effect, iterations, __functionAddress);
    }

    // --- [ SDL_StopHapticEffect ] ---

    /** {@code bool SDL_StopHapticEffect(SDL_Haptic * haptic, int effect)} */
    @NativeType("bool")
    public static boolean SDL_StopHapticEffect(@NativeType("SDL_Haptic *") long haptic, int effect) {
        long __functionAddress = Functions.StopHapticEffect;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, effect, __functionAddress);
    }

    // --- [ SDL_DestroyHapticEffect ] ---

    /** {@code void SDL_DestroyHapticEffect(SDL_Haptic * haptic, int effect)} */
    public static void SDL_DestroyHapticEffect(@NativeType("SDL_Haptic *") long haptic, int effect) {
        long __functionAddress = Functions.DestroyHapticEffect;
        if (CHECKS) {
            check(haptic);
        }
        invokePV(haptic, effect, __functionAddress);
    }

    // --- [ SDL_GetHapticEffectStatus ] ---

    /** {@code bool SDL_GetHapticEffectStatus(SDL_Haptic * haptic, int effect)} */
    @NativeType("bool")
    public static boolean SDL_GetHapticEffectStatus(@NativeType("SDL_Haptic *") long haptic, int effect) {
        long __functionAddress = Functions.GetHapticEffectStatus;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, effect, __functionAddress);
    }

    // --- [ SDL_SetHapticGain ] ---

    /** {@code bool SDL_SetHapticGain(SDL_Haptic * haptic, int gain)} */
    @NativeType("bool")
    public static boolean SDL_SetHapticGain(@NativeType("SDL_Haptic *") long haptic, int gain) {
        long __functionAddress = Functions.SetHapticGain;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, gain, __functionAddress);
    }

    // --- [ SDL_SetHapticAutocenter ] ---

    /** {@code bool SDL_SetHapticAutocenter(SDL_Haptic * haptic, int autocenter)} */
    @NativeType("bool")
    public static boolean SDL_SetHapticAutocenter(@NativeType("SDL_Haptic *") long haptic, int autocenter) {
        long __functionAddress = Functions.SetHapticAutocenter;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, autocenter, __functionAddress);
    }

    // --- [ SDL_PauseHaptic ] ---

    /** {@code bool SDL_PauseHaptic(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_PauseHaptic(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.PauseHaptic;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

    // --- [ SDL_ResumeHaptic ] ---

    /** {@code bool SDL_ResumeHaptic(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_ResumeHaptic(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.ResumeHaptic;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

    // --- [ SDL_StopHapticEffects ] ---

    /** {@code bool SDL_StopHapticEffects(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_StopHapticEffects(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.StopHapticEffects;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

    // --- [ SDL_HapticRumbleSupported ] ---

    /** {@code bool SDL_HapticRumbleSupported(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_HapticRumbleSupported(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.HapticRumbleSupported;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

    // --- [ SDL_InitHapticRumble ] ---

    /** {@code bool SDL_InitHapticRumble(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_InitHapticRumble(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.InitHapticRumble;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

    // --- [ SDL_PlayHapticRumble ] ---

    /** {@code bool SDL_PlayHapticRumble(SDL_Haptic * haptic, float strength, Uint32 length)} */
    @NativeType("bool")
    public static boolean SDL_PlayHapticRumble(@NativeType("SDL_Haptic *") long haptic, float strength, @NativeType("Uint32") int length) {
        long __functionAddress = Functions.PlayHapticRumble;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, strength, length, __functionAddress);
    }

    // --- [ SDL_StopHapticRumble ] ---

    /** {@code bool SDL_StopHapticRumble(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_StopHapticRumble(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.StopHapticRumble;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

    // --- [ SDL_hid_init ] ---

    /** {@code int SDL_hid_init(void)} */
    public static int SDL_hid_init() {
        long __functionAddress = Functions.hid_init;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_hid_exit ] ---

    /** {@code int SDL_hid_exit(void)} */
    public static int SDL_hid_exit() {
        long __functionAddress = Functions.hid_exit;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_hid_device_change_count ] ---

    /** {@code Uint32 SDL_hid_device_change_count(void)} */
    @NativeType("Uint32")
    public static int SDL_hid_device_change_count() {
        long __functionAddress = Functions.hid_device_change_count;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_hid_enumerate ] ---

    /** {@code SDL_hid_device_info * SDL_hid_enumerate(unsigned short vendor_id, unsigned short product_id)} */
    public static long nSDL_hid_enumerate(short vendor_id, short product_id) {
        long __functionAddress = Functions.hid_enumerate;
        return invokeCCP(vendor_id, product_id, __functionAddress);
    }

    /** {@code SDL_hid_device_info * SDL_hid_enumerate(unsigned short vendor_id, unsigned short product_id)} */
    @NativeType("SDL_hid_device_info *")
    public static @Nullable SDL_hid_device_info SDL_hid_enumerate(@NativeType("unsigned short") short vendor_id, @NativeType("unsigned short") short product_id) {
        long __result = nSDL_hid_enumerate(vendor_id, product_id);
        return SDL_hid_device_info.createSafe(__result);
    }

    // --- [ SDL_hid_free_enumeration ] ---

    /** {@code void SDL_hid_free_enumeration(SDL_hid_device_info * devs)} */
    public static void nSDL_hid_free_enumeration(long devs) {
        long __functionAddress = Functions.hid_free_enumeration;
        invokePV(devs, __functionAddress);
    }

    /** {@code void SDL_hid_free_enumeration(SDL_hid_device_info * devs)} */
    public static void SDL_hid_free_enumeration(@NativeType("SDL_hid_device_info *") SDL_hid_device_info.Buffer devs) {
        if (CHECKS) {
            check(devs, 1);
        }
        nSDL_hid_free_enumeration(devs.address());
    }

    // --- [ SDL_hid_open ] ---

    /** {@code SDL_hid_device * SDL_hid_open(unsigned short vendor_id, unsigned short product_id, wchar_t const * serial_number)} */
    public static long nSDL_hid_open(short vendor_id, short product_id, long serial_number) {
        long __functionAddress = Functions.hid_open;
        return invokeCCPP(vendor_id, product_id, serial_number, __functionAddress);
    }

    /** {@code SDL_hid_device * SDL_hid_open(unsigned short vendor_id, unsigned short product_id, wchar_t const * serial_number)} */
    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open(@NativeType("unsigned short") short vendor_id, @NativeType("unsigned short") short product_id, @NativeType("wchar_t const *") ByteBuffer serial_number) {
        if (CHECKS) {
            checkNT2(serial_number);
        }
        return nSDL_hid_open(vendor_id, product_id, memAddress(serial_number));
    }

    /** {@code SDL_hid_device * SDL_hid_open(unsigned short vendor_id, unsigned short product_id, wchar_t const * serial_number)} */
    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open(@NativeType("unsigned short") short vendor_id, @NativeType("unsigned short") short product_id, @NativeType("wchar_t const *") CharSequence serial_number) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16(serial_number, true);
            long serial_numberEncoded = stack.getPointerAddress();
            return nSDL_hid_open(vendor_id, product_id, serial_numberEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_hid_open_path ] ---

    /** {@code SDL_hid_device * SDL_hid_open_path(char const * path)} */
    public static long nSDL_hid_open_path(long path) {
        long __functionAddress = Functions.hid_open_path;
        return invokePP(path, __functionAddress);
    }

    /** {@code SDL_hid_device * SDL_hid_open_path(char const * path)} */
    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open_path(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_hid_open_path(memAddress(path));
    }

    /** {@code SDL_hid_device * SDL_hid_open_path(char const * path)} */
    @NativeType("SDL_hid_device *")
    public static long SDL_hid_open_path(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_hid_open_path(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_hid_write ] ---

    /** {@code int SDL_hid_write(SDL_hid_device * dev, unsigned char const * data, size_t length)} */
    public static int nSDL_hid_write(long dev, long data, long length) {
        long __functionAddress = Functions.hid_write;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, __functionAddress);
    }

    /** {@code int SDL_hid_write(SDL_hid_device * dev, unsigned char const * data, size_t length)} */
    public static int SDL_hid_write(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char const *") ByteBuffer data) {
        return nSDL_hid_write(dev, memAddress(data), data.remaining());
    }

    // --- [ SDL_hid_read_timeout ] ---

    /** {@code int SDL_hid_read_timeout(SDL_hid_device * dev, unsigned char const * data, size_t length, int milliseconds)} */
    public static int nSDL_hid_read_timeout(long dev, long data, long length, int milliseconds) {
        long __functionAddress = Functions.hid_read_timeout;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, milliseconds, __functionAddress);
    }

    /** {@code int SDL_hid_read_timeout(SDL_hid_device * dev, unsigned char const * data, size_t length, int milliseconds)} */
    public static int SDL_hid_read_timeout(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char const *") ByteBuffer data, int milliseconds) {
        return nSDL_hid_read_timeout(dev, memAddress(data), data.remaining(), milliseconds);
    }

    // --- [ SDL_hid_read ] ---

    /** {@code int SDL_hid_read(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int nSDL_hid_read(long dev, long data, long length) {
        long __functionAddress = Functions.hid_read;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, __functionAddress);
    }

    /** {@code int SDL_hid_read(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int SDL_hid_read(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer data) {
        return nSDL_hid_read(dev, memAddress(data), data.remaining());
    }

    // --- [ SDL_hid_set_nonblocking ] ---

    /** {@code int SDL_hid_set_nonblocking(SDL_hid_device * dev, int nonblock)} */
    public static int SDL_hid_set_nonblocking(@NativeType("SDL_hid_device *") long dev, int nonblock) {
        long __functionAddress = Functions.hid_set_nonblocking;
        if (CHECKS) {
            check(dev);
        }
        return invokePI(dev, nonblock, __functionAddress);
    }

    // --- [ SDL_hid_send_feature_report ] ---

    /** {@code int SDL_hid_send_feature_report(SDL_hid_device * dev, unsigned char const * data, size_t length)} */
    public static int nSDL_hid_send_feature_report(long dev, long data, long length) {
        long __functionAddress = Functions.hid_send_feature_report;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, __functionAddress);
    }

    /** {@code int SDL_hid_send_feature_report(SDL_hid_device * dev, unsigned char const * data, size_t length)} */
    public static int SDL_hid_send_feature_report(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char const *") ByteBuffer data) {
        return nSDL_hid_send_feature_report(dev, memAddress(data), data.remaining());
    }

    // --- [ SDL_hid_get_feature_report ] ---

    /** {@code int SDL_hid_get_feature_report(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int nSDL_hid_get_feature_report(long dev, long data, long length) {
        long __functionAddress = Functions.hid_get_feature_report;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, __functionAddress);
    }

    /** {@code int SDL_hid_get_feature_report(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int SDL_hid_get_feature_report(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer data) {
        return nSDL_hid_get_feature_report(dev, memAddress(data), data.remaining());
    }

    // --- [ SDL_hid_get_input_report ] ---

    /** {@code int SDL_hid_get_input_report(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int nSDL_hid_get_input_report(long dev, long data, long length) {
        long __functionAddress = Functions.hid_get_input_report;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, data, length, __functionAddress);
    }

    /** {@code int SDL_hid_get_input_report(SDL_hid_device * dev, unsigned char * data, size_t length)} */
    public static int SDL_hid_get_input_report(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer data) {
        return nSDL_hid_get_input_report(dev, memAddress(data), data.remaining());
    }

    // --- [ SDL_hid_close ] ---

    /** {@code int SDL_hid_close(SDL_hid_device * dev)} */
    public static int SDL_hid_close(@NativeType("SDL_hid_device *") long dev) {
        long __functionAddress = Functions.hid_close;
        if (CHECKS) {
            check(dev);
        }
        return invokePI(dev, __functionAddress);
    }

    // --- [ SDL_hid_get_manufacturer_string ] ---

    /** {@code int SDL_hid_get_manufacturer_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int nSDL_hid_get_manufacturer_string(long dev, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_manufacturer_string;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, string, maxlen, __functionAddress);
    }

    /** {@code int SDL_hid_get_manufacturer_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int SDL_hid_get_manufacturer_string(@NativeType("SDL_hid_device *") long dev, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_manufacturer_string(dev, memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    // --- [ SDL_hid_get_product_string ] ---

    /** {@code int SDL_hid_get_product_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int nSDL_hid_get_product_string(long dev, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_product_string;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, string, maxlen, __functionAddress);
    }

    /** {@code int SDL_hid_get_product_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int SDL_hid_get_product_string(@NativeType("SDL_hid_device *") long dev, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_product_string(dev, memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    // --- [ SDL_hid_get_serial_number_string ] ---

    /** {@code int SDL_hid_get_serial_number_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int nSDL_hid_get_serial_number_string(long dev, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_serial_number_string;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, string, maxlen, __functionAddress);
    }

    /** {@code int SDL_hid_get_serial_number_string(SDL_hid_device * dev, wchar_t * string, size_t maxlen)} */
    public static int SDL_hid_get_serial_number_string(@NativeType("SDL_hid_device *") long dev, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_serial_number_string(dev, memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    // --- [ SDL_hid_get_indexed_string ] ---

    /** {@code int SDL_hid_get_indexed_string(SDL_hid_device * dev, int string_index, wchar_t * string, size_t maxlen)} */
    public static int nSDL_hid_get_indexed_string(long dev, int string_index, long string, long maxlen) {
        long __functionAddress = Functions.hid_get_indexed_string;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, string_index, string, maxlen, __functionAddress);
    }

    /** {@code int SDL_hid_get_indexed_string(SDL_hid_device * dev, int string_index, wchar_t * string, size_t maxlen)} */
    public static int SDL_hid_get_indexed_string(@NativeType("SDL_hid_device *") long dev, int string_index, @NativeType("wchar_t *") ByteBuffer string) {
        return nSDL_hid_get_indexed_string(dev, string_index, memAddress(string), Integer.toUnsignedLong(string.remaining()) >> 1);
    }

    // --- [ SDL_hid_get_device_info ] ---

    /** {@code SDL_hid_device_info * SDL_hid_get_device_info(SDL_hid_device * dev)} */
    public static long nSDL_hid_get_device_info(long dev) {
        long __functionAddress = Functions.hid_get_device_info;
        if (CHECKS) {
            check(dev);
        }
        return invokePP(dev, __functionAddress);
    }

    /** {@code SDL_hid_device_info * SDL_hid_get_device_info(SDL_hid_device * dev)} */
    @NativeType("SDL_hid_device_info *")
    public static @Nullable SDL_hid_device_info SDL_hid_get_device_info(@NativeType("SDL_hid_device *") long dev) {
        long __result = nSDL_hid_get_device_info(dev);
        return SDL_hid_device_info.createSafe(__result);
    }

    // --- [ SDL_hid_get_report_descriptor ] ---

    /** {@code int SDL_hid_get_report_descriptor(SDL_hid_device * dev, unsigned char * buf, size_t buf_size)} */
    public static int nSDL_hid_get_report_descriptor(long dev, long buf, long buf_size) {
        long __functionAddress = Functions.hid_get_report_descriptor;
        if (CHECKS) {
            check(dev);
        }
        return invokePPPI(dev, buf, buf_size, __functionAddress);
    }

    /** {@code int SDL_hid_get_report_descriptor(SDL_hid_device * dev, unsigned char * buf, size_t buf_size)} */
    public static int SDL_hid_get_report_descriptor(@NativeType("SDL_hid_device *") long dev, @NativeType("unsigned char *") ByteBuffer buf) {
        return nSDL_hid_get_report_descriptor(dev, memAddress(buf), buf.remaining());
    }

    // --- [ SDL_hid_ble_scan ] ---

    /** {@code void SDL_hid_ble_scan(bool active)} */
    public static void SDL_hid_ble_scan(@NativeType("bool") boolean active) {
        long __functionAddress = Functions.hid_ble_scan;
        invokeV(active, __functionAddress);
    }

    // --- [ SDL_SetHintWithPriority ] ---

    /** {@code bool SDL_SetHintWithPriority(char const * name, char const * value, SDL_HintPriority priority)} */
    public static boolean nSDL_SetHintWithPriority(long name, long value, int priority) {
        long __functionAddress = Functions.SetHintWithPriority;
        return invokePPZ(name, value, priority, __functionAddress);
    }

    /** {@code bool SDL_SetHintWithPriority(char const * name, char const * value, SDL_HintPriority priority)} */
    @NativeType("bool")
    public static boolean SDL_SetHintWithPriority(@NativeType("char const *") ByteBuffer name, @NativeType("char const *") @Nullable ByteBuffer value, @NativeType("SDL_HintPriority") int priority) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1Safe(value);
        }
        return nSDL_SetHintWithPriority(memAddress(name), memAddressSafe(value), priority);
    }

    /** {@code bool SDL_SetHintWithPriority(char const * name, char const * value, SDL_HintPriority priority)} */
    @NativeType("bool")
    public static boolean SDL_SetHintWithPriority(@NativeType("char const *") CharSequence name, @NativeType("char const *") @Nullable CharSequence value, @NativeType("SDL_HintPriority") int priority) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(value, true);
            long valueEncoded = value == null ? NULL : stack.getPointerAddress();
            return nSDL_SetHintWithPriority(nameEncoded, valueEncoded, priority);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetHint ] ---

    /** {@code bool SDL_SetHint(char const * name, char const * value)} */
    public static boolean nSDL_SetHint(long name, long value) {
        long __functionAddress = Functions.SetHint;
        return invokePPZ(name, value, __functionAddress);
    }

    /** {@code bool SDL_SetHint(char const * name, char const * value)} */
    @NativeType("bool")
    public static boolean SDL_SetHint(@NativeType("char const *") ByteBuffer name, @NativeType("char const *") @Nullable ByteBuffer value) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1Safe(value);
        }
        return nSDL_SetHint(memAddress(name), memAddressSafe(value));
    }

    /** {@code bool SDL_SetHint(char const * name, char const * value)} */
    @NativeType("bool")
    public static boolean SDL_SetHint(@NativeType("char const *") CharSequence name, @NativeType("char const *") @Nullable CharSequence value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(value, true);
            long valueEncoded = value == null ? NULL : stack.getPointerAddress();
            return nSDL_SetHint(nameEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ResetHint ] ---

    /** {@code bool SDL_ResetHint(char const * name)} */
    public static boolean nSDL_ResetHint(long name) {
        long __functionAddress = Functions.ResetHint;
        return invokePZ(name, __functionAddress);
    }

    /** {@code bool SDL_ResetHint(char const * name)} */
    @NativeType("bool")
    public static boolean SDL_ResetHint(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_ResetHint(memAddress(name));
    }

    /** {@code bool SDL_ResetHint(char const * name)} */
    @NativeType("bool")
    public static boolean SDL_ResetHint(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_ResetHint(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ResetHints ] ---

    /** {@code void SDL_ResetHints(void)} */
    public static void SDL_ResetHints() {
        long __functionAddress = Functions.ResetHints;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GetHint ] ---

    /** {@code char const * SDL_GetHint(char const * name)} */
    public static long nSDL_GetHint(long name) {
        long __functionAddress = Functions.GetHint;
        return invokePP(name, __functionAddress);
    }

    /** {@code char const * SDL_GetHint(char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetHint(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        long __result = nSDL_GetHint(memAddress(name));
        return memUTF8Safe(__result);
    }

    /** {@code char const * SDL_GetHint(char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetHint(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nSDL_GetHint(nameEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetHintBoolean ] ---

    /** {@code bool SDL_GetHintBoolean(char const * name, bool default_value)} */
    public static boolean nSDL_GetHintBoolean(long name, boolean default_value) {
        long __functionAddress = Functions.GetHintBoolean;
        return invokePZ(name, default_value, __functionAddress);
    }

    /** {@code bool SDL_GetHintBoolean(char const * name, bool default_value)} */
    @NativeType("bool")
    public static boolean SDL_GetHintBoolean(@NativeType("char const *") ByteBuffer name, @NativeType("bool") boolean default_value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetHintBoolean(memAddress(name), default_value);
    }

    /** {@code bool SDL_GetHintBoolean(char const * name, bool default_value)} */
    @NativeType("bool")
    public static boolean SDL_GetHintBoolean(@NativeType("char const *") CharSequence name, @NativeType("bool") boolean default_value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetHintBoolean(nameEncoded, default_value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_AddHintCallback ] ---

    /** {@code bool SDL_AddHintCallback(char const * name, SDL_HintCallback callback, void * userdata)} */
    public static boolean nSDL_AddHintCallback(long name, long callback, long userdata) {
        long __functionAddress = Functions.AddHintCallback;
        return invokePPPZ(name, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_AddHintCallback(char const * name, SDL_HintCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_AddHintCallback(@NativeType("char const *") ByteBuffer name, @NativeType("SDL_HintCallback") SDL_HintCallbackI callback, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_AddHintCallback(memAddress(name), callback.address(), userdata);
    }

    /** {@code bool SDL_AddHintCallback(char const * name, SDL_HintCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_AddHintCallback(@NativeType("char const *") CharSequence name, @NativeType("SDL_HintCallback") SDL_HintCallbackI callback, @NativeType("void *") long userdata) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_AddHintCallback(nameEncoded, callback.address(), userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RemoveHintCallback ] ---

    /** {@code void SDL_RemoveHintCallback(char const * name, SDL_HintCallback callback, void * userdata)} */
    public static void nSDL_RemoveHintCallback(long name, long callback, long userdata) {
        long __functionAddress = Functions.RemoveHintCallback;
        invokePPPV(name, callback, userdata, __functionAddress);
    }

    /** {@code void SDL_RemoveHintCallback(char const * name, SDL_HintCallback callback, void * userdata)} */
    public static void SDL_RemoveHintCallback(@NativeType("char const *") ByteBuffer name, @NativeType("SDL_HintCallback") SDL_HintCallbackI callback, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1(name);
        }
        nSDL_RemoveHintCallback(memAddress(name), callback.address(), userdata);
    }

    /** {@code void SDL_RemoveHintCallback(char const * name, SDL_HintCallback callback, void * userdata)} */
    public static void SDL_RemoveHintCallback(@NativeType("char const *") CharSequence name, @NativeType("SDL_HintCallback") SDL_HintCallbackI callback, @NativeType("void *") long userdata) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nSDL_RemoveHintCallback(nameEncoded, callback.address(), userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_Init ] ---

    /** {@code bool SDL_Init(SDL_InitFlags flags)} */
    @NativeType("bool")
    public static boolean SDL_Init(@NativeType("SDL_InitFlags") int flags) {
        long __functionAddress = Functions.Init;
        return invokeZ(flags, __functionAddress);
    }

    // --- [ SDL_InitSubSystem ] ---

    /** {@code bool SDL_InitSubSystem(SDL_InitFlags flags)} */
    @NativeType("bool")
    public static boolean SDL_InitSubSystem(@NativeType("SDL_InitFlags") int flags) {
        long __functionAddress = Functions.InitSubSystem;
        return invokeZ(flags, __functionAddress);
    }

    // --- [ SDL_QuitSubSystem ] ---

    /** {@code void SDL_QuitSubSystem(SDL_InitFlags flags)} */
    public static void SDL_QuitSubSystem(@NativeType("SDL_InitFlags") int flags) {
        long __functionAddress = Functions.QuitSubSystem;
        invokeV(flags, __functionAddress);
    }

    // --- [ SDL_WasInit ] ---

    /** {@code SDL_InitFlags SDL_WasInit(SDL_InitFlags flags)} */
    @NativeType("SDL_InitFlags")
    public static int SDL_WasInit(@NativeType("SDL_InitFlags") int flags) {
        long __functionAddress = Functions.WasInit;
        return invokeI(flags, __functionAddress);
    }

    // --- [ SDL_Quit ] ---

    /** {@code void SDL_Quit(void)} */
    public static void SDL_Quit() {
        long __functionAddress = Functions.Quit;
        invokeV(__functionAddress);
    }

    // --- [ SDL_IsMainThread ] ---

    /** {@code bool SDL_IsMainThread(void)} */
    @NativeType("bool")
    public static boolean SDL_IsMainThread() {
        long __functionAddress = Functions.IsMainThread;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_RunOnMainThread ] ---

    /** {@code bool SDL_RunOnMainThread(SDL_MainThreadCallback callback, void * userdata, bool wait_complete)} */
    public static boolean nSDL_RunOnMainThread(long callback, long userdata, boolean wait_complete) {
        long __functionAddress = Functions.RunOnMainThread;
        return invokePPZ(callback, userdata, wait_complete, __functionAddress);
    }

    /** {@code bool SDL_RunOnMainThread(SDL_MainThreadCallback callback, void * userdata, bool wait_complete)} */
    @NativeType("bool")
    public static boolean SDL_RunOnMainThread(@NativeType("SDL_MainThreadCallback") SDL_MainThreadCallbackI callback, @NativeType("void *") long userdata, @NativeType("bool") boolean wait_complete) {
        return nSDL_RunOnMainThread(callback.address(), userdata, wait_complete);
    }

    // --- [ SDL_SetAppMetadata ] ---

    /** {@code bool SDL_SetAppMetadata(char const * appname, char const * appversion, char const * appidentifier)} */
    public static boolean nSDL_SetAppMetadata(long appname, long appversion, long appidentifier) {
        long __functionAddress = Functions.SetAppMetadata;
        return invokePPPZ(appname, appversion, appidentifier, __functionAddress);
    }

    /** {@code bool SDL_SetAppMetadata(char const * appname, char const * appversion, char const * appidentifier)} */
    @NativeType("bool")
    public static boolean SDL_SetAppMetadata(@NativeType("char const *") ByteBuffer appname, @NativeType("char const *") ByteBuffer appversion, @NativeType("char const *") ByteBuffer appidentifier) {
        if (CHECKS) {
            checkNT1(appname);
            checkNT1(appversion);
            checkNT1(appidentifier);
        }
        return nSDL_SetAppMetadata(memAddress(appname), memAddress(appversion), memAddress(appidentifier));
    }

    /** {@code bool SDL_SetAppMetadata(char const * appname, char const * appversion, char const * appidentifier)} */
    @NativeType("bool")
    public static boolean SDL_SetAppMetadata(@NativeType("char const *") CharSequence appname, @NativeType("char const *") CharSequence appversion, @NativeType("char const *") CharSequence appidentifier) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(appname, true);
            long appnameEncoded = stack.getPointerAddress();
            stack.nUTF8(appversion, true);
            long appversionEncoded = stack.getPointerAddress();
            stack.nUTF8(appidentifier, true);
            long appidentifierEncoded = stack.getPointerAddress();
            return nSDL_SetAppMetadata(appnameEncoded, appversionEncoded, appidentifierEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetAppMetadataProperty ] ---

    /** {@code bool SDL_SetAppMetadataProperty(char const * name, char const * value)} */
    public static boolean nSDL_SetAppMetadataProperty(long name, long value) {
        long __functionAddress = Functions.SetAppMetadataProperty;
        return invokePPZ(name, value, __functionAddress);
    }

    /** {@code bool SDL_SetAppMetadataProperty(char const * name, char const * value)} */
    @NativeType("bool")
    public static boolean SDL_SetAppMetadataProperty(@NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(value);
        }
        return nSDL_SetAppMetadataProperty(memAddress(name), memAddress(value));
    }

    /** {@code bool SDL_SetAppMetadataProperty(char const * name, char const * value)} */
    @NativeType("bool")
    public static boolean SDL_SetAppMetadataProperty(@NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(value, true);
            long valueEncoded = stack.getPointerAddress();
            return nSDL_SetAppMetadataProperty(nameEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetAppMetadataProperty ] ---

    /** {@code char const * SDL_GetAppMetadataProperty(char const * name)} */
    public static long nSDL_GetAppMetadataProperty(long name) {
        long __functionAddress = Functions.GetAppMetadataProperty;
        return invokePP(name, __functionAddress);
    }

    /** {@code char const * SDL_GetAppMetadataProperty(char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAppMetadataProperty(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        long __result = nSDL_GetAppMetadataProperty(memAddress(name));
        return memUTF8Safe(__result);
    }

    /** {@code char const * SDL_GetAppMetadataProperty(char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAppMetadataProperty(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nSDL_GetAppMetadataProperty(nameEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_IOFromFile ] ---

    /** {@code SDL_IOStream * SDL_IOFromFile(char const * file, char const * mode)} */
    public static long nSDL_IOFromFile(long file, long mode) {
        long __functionAddress = Functions.IOFromFile;
        return invokePPP(file, mode, __functionAddress);
    }

    /** {@code SDL_IOStream * SDL_IOFromFile(char const * file, char const * mode)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromFile(@NativeType("char const *") ByteBuffer file, @NativeType("char const *") ByteBuffer mode) {
        if (CHECKS) {
            checkNT1(file);
            checkNT1(mode);
        }
        return nSDL_IOFromFile(memAddress(file), memAddress(mode));
    }

    /** {@code SDL_IOStream * SDL_IOFromFile(char const * file, char const * mode)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromFile(@NativeType("char const *") CharSequence file, @NativeType("char const *") CharSequence mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            stack.nASCII(mode, true);
            long modeEncoded = stack.getPointerAddress();
            return nSDL_IOFromFile(fileEncoded, modeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_IOFromMem ] ---

    /** {@code SDL_IOStream * SDL_IOFromMem(void * mem, size_t size)} */
    public static long nSDL_IOFromMem(long mem, long size) {
        long __functionAddress = Functions.IOFromMem;
        return invokePPP(mem, size, __functionAddress);
    }

    /** {@code SDL_IOStream * SDL_IOFromMem(void * mem, size_t size)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromMem(@NativeType("void *") ByteBuffer mem) {
        return nSDL_IOFromMem(memAddress(mem), mem.remaining());
    }

    // --- [ SDL_IOFromConstMem ] ---

    /** {@code SDL_IOStream * SDL_IOFromConstMem(void const * mem, size_t size)} */
    public static long nSDL_IOFromConstMem(long mem, long size) {
        long __functionAddress = Functions.IOFromConstMem;
        return invokePPP(mem, size, __functionAddress);
    }

    /** {@code SDL_IOStream * SDL_IOFromConstMem(void const * mem, size_t size)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromConstMem(@NativeType("void const *") ByteBuffer mem) {
        return nSDL_IOFromConstMem(memAddress(mem), mem.remaining());
    }

    // --- [ SDL_IOFromDynamicMem ] ---

    /** {@code SDL_IOStream * SDL_IOFromDynamicMem(void)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromDynamicMem() {
        long __functionAddress = Functions.IOFromDynamicMem;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_OpenIO ] ---

    /** {@code SDL_IOStream * SDL_OpenIO(SDL_IOStreamInterface const * iface, void * userdata)} */
    public static long nSDL_OpenIO(long iface, long userdata) {
        long __functionAddress = Functions.OpenIO;
        if (CHECKS) {
            SDL_IOStreamInterface.validate(iface);
        }
        return invokePPP(iface, userdata, __functionAddress);
    }

    /** {@code SDL_IOStream * SDL_OpenIO(SDL_IOStreamInterface const * iface, void * userdata)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_OpenIO(@NativeType("SDL_IOStreamInterface const *") SDL_IOStreamInterface iface, @NativeType("void *") long userdata) {
        return nSDL_OpenIO(iface.address(), userdata);
    }

    // --- [ SDL_CloseIO ] ---

    /** {@code bool SDL_CloseIO(SDL_IOStream * context)} */
    @NativeType("bool")
    public static boolean SDL_CloseIO(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.CloseIO;
        if (CHECKS) {
            check(context);
        }
        return invokePZ(context, __functionAddress);
    }

    // --- [ SDL_GetIOProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetIOProperties(SDL_IOStream * context)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetIOProperties(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.GetIOProperties;
        if (CHECKS) {
            check(context);
        }
        return invokePI(context, __functionAddress);
    }

    // --- [ SDL_GetIOStatus ] ---

    /** {@code SDL_IOStatus SDL_GetIOStatus(SDL_IOStream * context)} */
    @NativeType("SDL_IOStatus")
    public static int SDL_GetIOStatus(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.GetIOStatus;
        if (CHECKS) {
            check(context);
        }
        return invokePI(context, __functionAddress);
    }

    // --- [ SDL_GetIOSize ] ---

    /** {@code Sint64 SDL_GetIOSize(SDL_IOStream * context)} */
    @NativeType("Sint64")
    public static long SDL_GetIOSize(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.GetIOSize;
        if (CHECKS) {
            check(context);
        }
        return invokePJ(context, __functionAddress);
    }

    // --- [ SDL_SeekIO ] ---

    /** {@code Sint64 SDL_SeekIO(SDL_IOStream * context, Sint64 offset, SDL_IOWhence whence)} */
    @NativeType("Sint64")
    public static long SDL_SeekIO(@NativeType("SDL_IOStream *") long context, @NativeType("Sint64") long offset, @NativeType("SDL_IOWhence") int whence) {
        long __functionAddress = Functions.SeekIO;
        if (CHECKS) {
            check(context);
        }
        return invokePJJ(context, offset, whence, __functionAddress);
    }

    // --- [ SDL_TellIO ] ---

    /** {@code Sint64 SDL_TellIO(SDL_IOStream * context)} */
    @NativeType("Sint64")
    public static long SDL_TellIO(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.TellIO;
        if (CHECKS) {
            check(context);
        }
        return invokePJ(context, __functionAddress);
    }

    // --- [ SDL_ReadIO ] ---

    /** {@code size_t SDL_ReadIO(SDL_IOStream * context, void * ptr, size_t size)} */
    public static long nSDL_ReadIO(long context, long ptr, long size) {
        long __functionAddress = Functions.ReadIO;
        if (CHECKS) {
            check(context);
        }
        return invokePPPP(context, ptr, size, __functionAddress);
    }

    /** {@code size_t SDL_ReadIO(SDL_IOStream * context, void * ptr, size_t size)} */
    @NativeType("size_t")
    public static long SDL_ReadIO(@NativeType("SDL_IOStream *") long context, @NativeType("void *") ByteBuffer ptr) {
        return nSDL_ReadIO(context, memAddress(ptr), ptr.remaining());
    }

    // --- [ SDL_WriteIO ] ---

    /** {@code size_t SDL_WriteIO(SDL_IOStream * context, void const * ptr, size_t size)} */
    public static long nSDL_WriteIO(long context, long ptr, long size) {
        long __functionAddress = Functions.WriteIO;
        if (CHECKS) {
            check(context);
        }
        return invokePPPP(context, ptr, size, __functionAddress);
    }

    /** {@code size_t SDL_WriteIO(SDL_IOStream * context, void const * ptr, size_t size)} */
    @NativeType("size_t")
    public static long SDL_WriteIO(@NativeType("SDL_IOStream *") long context, @NativeType("void const *") ByteBuffer ptr) {
        return nSDL_WriteIO(context, memAddress(ptr), ptr.remaining());
    }

    // --- [ SDL_IOprintf ] ---

    /** {@code size_t SDL_IOprintf(SDL_IOStream * context, char const * fmt)} */
    public static long nSDL_IOprintf(long context, long fmt) {
        long __functionAddress = Functions.IOprintf;
        if (CHECKS) {
            check(context);
        }
        return invokePPP(context, fmt, __functionAddress);
    }

    /** {@code size_t SDL_IOprintf(SDL_IOStream * context, char const * fmt)} */
    @NativeType("size_t")
    public static long SDL_IOprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        return nSDL_IOprintf(context, memAddress(fmt));
    }

    /** {@code size_t SDL_IOprintf(SDL_IOStream * context, char const * fmt)} */
    @NativeType("size_t")
    public static long SDL_IOprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            return nSDL_IOprintf(context, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_IOvprintf ] ---

    /** {@code size_t SDL_IOvprintf(SDL_IOStream * context, char const * fmt, va_list ap)} */
    public static long nSDL_IOvprintf(long context, long fmt, long ap) {
        long __functionAddress = Functions.IOvprintf;
        if (CHECKS) {
            check(context);
            check(ap);
        }
        return invokePPPP(context, fmt, ap, __functionAddress);
    }

    /** {@code size_t SDL_IOvprintf(SDL_IOStream * context, char const * fmt, va_list ap)} */
    @NativeType("size_t")
    public static long SDL_IOvprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") ByteBuffer fmt, @NativeType("va_list") long ap) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        return nSDL_IOvprintf(context, memAddress(fmt), ap);
    }

    /** {@code size_t SDL_IOvprintf(SDL_IOStream * context, char const * fmt, va_list ap)} */
    @NativeType("size_t")
    public static long SDL_IOvprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") CharSequence fmt, @NativeType("va_list") long ap) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            return nSDL_IOvprintf(context, fmtEncoded, ap);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_FlushIO ] ---

    /** {@code bool SDL_FlushIO(SDL_IOStream * context)} */
    @NativeType("bool")
    public static boolean SDL_FlushIO(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.FlushIO;
        if (CHECKS) {
            check(context);
        }
        return invokePZ(context, __functionAddress);
    }

    // --- [ SDL_LoadFile_IO ] ---

    /** {@code void * SDL_LoadFile_IO(SDL_IOStream * src, size_t * datasize, bool closeio)} */
    public static long nSDL_LoadFile_IO(long src, long datasize, boolean closeio) {
        long __functionAddress = Functions.LoadFile_IO;
        if (CHECKS) {
            check(src);
        }
        return invokePPP(src, datasize, closeio, __functionAddress);
    }

    /** {@code void * SDL_LoadFile_IO(SDL_IOStream * src, size_t * datasize, bool closeio)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_LoadFile_IO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer datasize = stack.callocPointer(1);
        try {
            long __result = nSDL_LoadFile_IO(src, memAddress(datasize), closeio);
            return memByteBufferSafe(__result, (int)datasize.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LoadFile ] ---

    /** {@code void * SDL_LoadFile(char const * file, size_t * datasize)} */
    public static long nSDL_LoadFile(long file, long datasize) {
        long __functionAddress = Functions.LoadFile;
        return invokePPP(file, datasize, __functionAddress);
    }

    /** {@code void * SDL_LoadFile(char const * file, size_t * datasize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_LoadFile(@NativeType("char const *") ByteBuffer file) {
        if (CHECKS) {
            checkNT1(file);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer datasize = stack.callocPointer(1);
        try {
            long __result = nSDL_LoadFile(memAddress(file), memAddress(datasize));
            return memByteBufferSafe(__result, (int)datasize.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void * SDL_LoadFile(char const * file, size_t * datasize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_LoadFile(@NativeType("char const *") CharSequence file) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer datasize = stack.callocPointer(1);
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            long __result = nSDL_LoadFile(fileEncoded, memAddress(datasize));
            return memByteBufferSafe(__result, (int)datasize.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SaveFile_IO ] ---

    /** {@code bool SDL_SaveFile_IO(SDL_IOStream * src, void const * data, size_t datasize, bool closeio)} */
    public static boolean nSDL_SaveFile_IO(long src, long data, long datasize, boolean closeio) {
        long __functionAddress = Functions.SaveFile_IO;
        if (CHECKS) {
            check(src);
        }
        return invokePPPZ(src, data, datasize, closeio, __functionAddress);
    }

    /** {@code bool SDL_SaveFile_IO(SDL_IOStream * src, void const * data, size_t datasize, bool closeio)} */
    @NativeType("bool")
    public static boolean SDL_SaveFile_IO(@NativeType("SDL_IOStream *") long src, @NativeType("void const *") ByteBuffer data, @NativeType("bool") boolean closeio) {
        return nSDL_SaveFile_IO(src, memAddress(data), data.remaining(), closeio);
    }

    // --- [ SDL_SaveFile ] ---

    /** {@code bool SDL_SaveFile(char const * file, void const * data, size_t datasize)} */
    public static boolean nSDL_SaveFile(long file, long data, long datasize) {
        long __functionAddress = Functions.SaveFile;
        return invokePPPZ(file, data, datasize, __functionAddress);
    }

    /** {@code bool SDL_SaveFile(char const * file, void const * data, size_t datasize)} */
    @NativeType("bool")
    public static boolean SDL_SaveFile(@NativeType("char const *") ByteBuffer file, @NativeType("void const *") ByteBuffer data) {
        if (CHECKS) {
            checkNT1(file);
        }
        return nSDL_SaveFile(memAddress(file), memAddress(data), data.remaining());
    }

    /** {@code bool SDL_SaveFile(char const * file, void const * data, size_t datasize)} */
    @NativeType("bool")
    public static boolean SDL_SaveFile(@NativeType("char const *") CharSequence file, @NativeType("void const *") ByteBuffer data) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            return nSDL_SaveFile(fileEncoded, memAddress(data), data.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ReadU8 ] ---

    /** {@code bool SDL_ReadU8(SDL_IOStream * src, Uint8 * value)} */
    public static boolean nSDL_ReadU8(long src, long value) {
        long __functionAddress = Functions.ReadU8;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU8(SDL_IOStream * src, Uint8 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU8(@NativeType("SDL_IOStream *") long src, @NativeType("Uint8 *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU8(src, memAddress(value));
    }

    // --- [ SDL_ReadS8 ] ---

    /** {@code bool SDL_ReadS8(SDL_IOStream * src, Sint8 * value)} */
    public static boolean nSDL_ReadS8(long src, long value) {
        long __functionAddress = Functions.ReadS8;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS8(SDL_IOStream * src, Sint8 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS8(@NativeType("SDL_IOStream *") long src, @NativeType("Sint8 *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS8(src, memAddress(value));
    }

    // --- [ SDL_ReadU16LE ] ---

    /** {@code bool SDL_ReadU16LE(SDL_IOStream * src, Uint16 * value)} */
    public static boolean nSDL_ReadU16LE(long src, long value) {
        long __functionAddress = Functions.ReadU16LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU16LE(SDL_IOStream * src, Uint16 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU16LE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint16 *") ShortBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU16LE(src, memAddress(value));
    }

    // --- [ SDL_ReadS16LE ] ---

    /** {@code bool SDL_ReadS16LE(SDL_IOStream * src, Sint16 * value)} */
    public static boolean nSDL_ReadS16LE(long src, long value) {
        long __functionAddress = Functions.ReadS16LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS16LE(SDL_IOStream * src, Sint16 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS16LE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint16 *") ShortBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS16LE(src, memAddress(value));
    }

    // --- [ SDL_ReadU16BE ] ---

    /** {@code bool SDL_ReadU16BE(SDL_IOStream * src, Uint16 * value)} */
    public static boolean nSDL_ReadU16BE(long src, long value) {
        long __functionAddress = Functions.ReadU16BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU16BE(SDL_IOStream * src, Uint16 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU16BE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint16 *") ShortBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU16BE(src, memAddress(value));
    }

    // --- [ SDL_ReadS16BE ] ---

    /** {@code bool SDL_ReadS16BE(SDL_IOStream * src, Sint16 * value)} */
    public static boolean nSDL_ReadS16BE(long src, long value) {
        long __functionAddress = Functions.ReadS16BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS16BE(SDL_IOStream * src, Sint16 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS16BE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint16 *") ShortBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS16BE(src, memAddress(value));
    }

    // --- [ SDL_ReadU32LE ] ---

    /** {@code bool SDL_ReadU32LE(SDL_IOStream * src, Uint32 * value)} */
    public static boolean nSDL_ReadU32LE(long src, long value) {
        long __functionAddress = Functions.ReadU32LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU32LE(SDL_IOStream * src, Uint32 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU32LE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint32 *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU32LE(src, memAddress(value));
    }

    // --- [ SDL_ReadS32LE ] ---

    /** {@code bool SDL_ReadS32LE(SDL_IOStream * src, Sint32 * value)} */
    public static boolean nSDL_ReadS32LE(long src, long value) {
        long __functionAddress = Functions.ReadS32LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS32LE(SDL_IOStream * src, Sint32 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS32LE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint32 *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS32LE(src, memAddress(value));
    }

    // --- [ SDL_ReadU32BE ] ---

    /** {@code bool SDL_ReadU32BE(SDL_IOStream * src, Uint32 * value)} */
    public static boolean nSDL_ReadU32BE(long src, long value) {
        long __functionAddress = Functions.ReadU32BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU32BE(SDL_IOStream * src, Uint32 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU32BE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint32 *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU32BE(src, memAddress(value));
    }

    // --- [ SDL_ReadS32BE ] ---

    /** {@code bool SDL_ReadS32BE(SDL_IOStream * src, Sint32 * value)} */
    public static boolean nSDL_ReadS32BE(long src, long value) {
        long __functionAddress = Functions.ReadS32BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS32BE(SDL_IOStream * src, Sint32 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS32BE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint32 *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS32BE(src, memAddress(value));
    }

    // --- [ SDL_ReadU64LE ] ---

    /** {@code bool SDL_ReadU64LE(SDL_IOStream * src, Uint64 * value)} */
    public static boolean nSDL_ReadU64LE(long src, long value) {
        long __functionAddress = Functions.ReadU64LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU64LE(SDL_IOStream * src, Uint64 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU64LE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint64 *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU64LE(src, memAddress(value));
    }

    // --- [ SDL_ReadS64LE ] ---

    /** {@code bool SDL_ReadS64LE(SDL_IOStream * src, Sint64 * value)} */
    public static boolean nSDL_ReadS64LE(long src, long value) {
        long __functionAddress = Functions.ReadS64LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS64LE(SDL_IOStream * src, Sint64 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS64LE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint64 *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS64LE(src, memAddress(value));
    }

    // --- [ SDL_ReadU64BE ] ---

    /** {@code bool SDL_ReadU64BE(SDL_IOStream * src, Uint64 * value)} */
    public static boolean nSDL_ReadU64BE(long src, long value) {
        long __functionAddress = Functions.ReadU64BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU64BE(SDL_IOStream * src, Uint64 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU64BE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint64 *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU64BE(src, memAddress(value));
    }

    // --- [ SDL_ReadS64BE ] ---

    /** {@code bool SDL_ReadS64BE(SDL_IOStream * src, Sint64 * value)} */
    public static boolean nSDL_ReadS64BE(long src, long value) {
        long __functionAddress = Functions.ReadS64BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS64BE(SDL_IOStream * src, Sint64 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS64BE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint64 *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS64BE(src, memAddress(value));
    }

    // --- [ SDL_WriteU8 ] ---

    /** {@code bool SDL_WriteU8(SDL_IOStream * dst, Uint8 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU8(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint8") byte value) {
        long __functionAddress = Functions.WriteU8;
        if (CHECKS) {
            check(dst);
        }
        return invokePUZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS8 ] ---

    /** {@code bool SDL_WriteS8(SDL_IOStream * dst, Sint8 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS8(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint8") byte value) {
        long __functionAddress = Functions.WriteS8;
        if (CHECKS) {
            check(dst);
        }
        return invokePBZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU16LE ] ---

    /** {@code bool SDL_WriteU16LE(SDL_IOStream * dst, Uint16 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU16LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint16") short value) {
        long __functionAddress = Functions.WriteU16LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePCZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS16LE ] ---

    /** {@code bool SDL_WriteS16LE(SDL_IOStream * dst, Sint16 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS16LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint16") short value) {
        long __functionAddress = Functions.WriteS16LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePSZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU16BE ] ---

    /** {@code bool SDL_WriteU16BE(SDL_IOStream * dst, Uint16 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU16BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint16") short value) {
        long __functionAddress = Functions.WriteU16BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePCZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS16BE ] ---

    /** {@code bool SDL_WriteS16BE(SDL_IOStream * dst, Sint16 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS16BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint16") short value) {
        long __functionAddress = Functions.WriteS16BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePSZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU32LE ] ---

    /** {@code bool SDL_WriteU32LE(SDL_IOStream * dst, Uint32 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU32LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint32") int value) {
        long __functionAddress = Functions.WriteU32LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS32LE ] ---

    /** {@code bool SDL_WriteS32LE(SDL_IOStream * dst, Sint32 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS32LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint32") int value) {
        long __functionAddress = Functions.WriteS32LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU32BE ] ---

    /** {@code bool SDL_WriteU32BE(SDL_IOStream * dst, Uint32 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU32BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint32") int value) {
        long __functionAddress = Functions.WriteU32BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS32BE ] ---

    /** {@code bool SDL_WriteS32BE(SDL_IOStream * dst, Sint32 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS32BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint32") int value) {
        long __functionAddress = Functions.WriteS32BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU64LE ] ---

    /** {@code bool SDL_WriteU64LE(SDL_IOStream * dst, Uint64 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU64LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint64") long value) {
        long __functionAddress = Functions.WriteU64LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePJZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS64LE ] ---

    /** {@code bool SDL_WriteS64LE(SDL_IOStream * dst, Sint64 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS64LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint64") long value) {
        long __functionAddress = Functions.WriteS64LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePJZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU64BE ] ---

    /** {@code bool SDL_WriteU64BE(SDL_IOStream * dst, Uint64 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU64BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint64") long value) {
        long __functionAddress = Functions.WriteU64BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePJZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS64BE ] ---

    /** {@code bool SDL_WriteS64BE(SDL_IOStream * dst, Sint64 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS64BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint64") long value) {
        long __functionAddress = Functions.WriteS64BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePJZ(dst, value, __functionAddress);
    }

    // --- [ SDL_LockJoysticks ] ---

    /** {@code void SDL_LockJoysticks(void)} */
    public static void SDL_LockJoysticks() {
        long __functionAddress = Functions.LockJoysticks;
        invokeV(__functionAddress);
    }

    // --- [ SDL_UnlockJoysticks ] ---

    /** {@code void SDL_UnlockJoysticks(void)} */
    public static void SDL_UnlockJoysticks() {
        long __functionAddress = Functions.UnlockJoysticks;
        invokeV(__functionAddress);
    }

    // --- [ SDL_HasJoystick ] ---

    /** {@code bool SDL_HasJoystick(void)} */
    @NativeType("bool")
    public static boolean SDL_HasJoystick() {
        long __functionAddress = Functions.HasJoystick;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetJoysticks ] ---

    /** {@code SDL_JoystickID * SDL_GetJoysticks(int * count)} */
    public static long nSDL_GetJoysticks(long count) {
        long __functionAddress = Functions.GetJoysticks;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_JoystickID * SDL_GetJoysticks(int * count)} */
    @NativeType("SDL_JoystickID *")
    public static @Nullable IntBuffer SDL_GetJoysticks() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetJoysticks(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetJoystickNameForID ] ---

    /** {@code char const * SDL_GetJoystickNameForID(SDL_JoystickID instance_id)} */
    public static long nSDL_GetJoystickNameForID(int instance_id) {
        long __functionAddress = Functions.GetJoystickNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetJoystickNameForID(SDL_JoystickID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetJoystickNameForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetJoystickNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetJoystickPathForID ] ---

    /** {@code char const * SDL_GetJoystickPathForID(SDL_JoystickID instance_id)} */
    public static long nSDL_GetJoystickPathForID(int instance_id) {
        long __functionAddress = Functions.GetJoystickPathForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetJoystickPathForID(SDL_JoystickID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetJoystickPathForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetJoystickPathForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetJoystickPlayerIndexForID ] ---

    /** {@code int SDL_GetJoystickPlayerIndexForID(SDL_JoystickID instance_id)} */
    public static int SDL_GetJoystickPlayerIndexForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickPlayerIndexForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickGUIDForID ] ---

    private static final FFICIF SDL_GetJoystickGUIDForIDCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)),
        ffi_type_uint32
    );

    /** {@code SDL_GUID SDL_GetJoystickGUIDForID(SDL_JoystickID instance_id)} */
    public static void nSDL_GetJoystickGUIDForID(int instance_id, long __result) {
        long __functionAddress = Functions.GetJoystickGUIDForID;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, stack.nint(instance_id));

            nffi_call(SDL_GetJoystickGUIDForIDCIF.address(), __functionAddress, __result, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code SDL_GUID SDL_GetJoystickGUIDForID(SDL_JoystickID instance_id)} */
    public static SDL_GUID SDL_GetJoystickGUIDForID(@NativeType("SDL_JoystickID") int instance_id, SDL_GUID __result) {
        nSDL_GetJoystickGUIDForID(instance_id, __result.address());
        return __result;
    }

    // --- [ SDL_GetJoystickVendorForID ] ---

    /** {@code Uint16 SDL_GetJoystickVendorForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickVendorForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickVendorForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickProductForID ] ---

    /** {@code Uint16 SDL_GetJoystickProductForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickProductForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickProductForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickProductVersionForID ] ---

    /** {@code Uint16 SDL_GetJoystickProductVersionForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickProductVersionForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickProductVersionForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickTypeForID ] ---

    /** {@code SDL_JoystickType SDL_GetJoystickTypeForID(SDL_JoystickID instance_id)} */
    @NativeType("SDL_JoystickType")
    public static int SDL_GetJoystickTypeForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickTypeForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_OpenJoystick ] ---

    /** {@code SDL_Joystick * SDL_OpenJoystick(SDL_JoystickID instance_id)} */
    @NativeType("SDL_Joystick *")
    public static long SDL_OpenJoystick(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.OpenJoystick;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickFromID ] ---

    /** {@code SDL_Joystick * SDL_GetJoystickFromID(SDL_JoystickID instance_id)} */
    @NativeType("SDL_Joystick *")
    public static long SDL_GetJoystickFromID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickFromID;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickFromPlayerIndex ] ---

    /** {@code SDL_Joystick * SDL_GetJoystickFromPlayerIndex(int player_index)} */
    @NativeType("SDL_Joystick *")
    public static long SDL_GetJoystickFromPlayerIndex(int player_index) {
        long __functionAddress = Functions.GetJoystickFromPlayerIndex;
        return invokeP(player_index, __functionAddress);
    }

    // --- [ SDL_AttachVirtualJoystick ] ---

    /** {@code SDL_JoystickID SDL_AttachVirtualJoystick(SDL_VirtualJoystickDesc const * desc)} */
    public static int nSDL_AttachVirtualJoystick(long desc) {
        long __functionAddress = Functions.AttachVirtualJoystick;
        if (CHECKS) {
            Struct.validate(desc, 1, SDL_VirtualJoystickDesc.SIZEOF, SDL_VirtualJoystickDesc::validate);
        }
        return invokePI(desc, __functionAddress);
    }

    /** {@code SDL_JoystickID SDL_AttachVirtualJoystick(SDL_VirtualJoystickDesc const * desc)} */
    @NativeType("SDL_JoystickID")
    public static int SDL_AttachVirtualJoystick(@NativeType("SDL_VirtualJoystickDesc const *") SDL_VirtualJoystickDesc.Buffer desc) {
        if (CHECKS) {
            check(desc, 1);
        }
        return nSDL_AttachVirtualJoystick(desc.address());
    }

    // --- [ SDL_DetachVirtualJoystick ] ---

    /** {@code bool SDL_DetachVirtualJoystick(SDL_JoystickID instance_id)} */
    @NativeType("bool")
    public static boolean SDL_DetachVirtualJoystick(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.DetachVirtualJoystick;
        return invokeZ(instance_id, __functionAddress);
    }

    // --- [ SDL_IsJoystickVirtual ] ---

    /** {@code bool SDL_IsJoystickVirtual(SDL_JoystickID instance_id)} */
    @NativeType("bool")
    public static boolean SDL_IsJoystickVirtual(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.IsJoystickVirtual;
        return invokeZ(instance_id, __functionAddress);
    }

    // --- [ SDL_SetJoystickVirtualAxis ] ---

    /** {@code bool SDL_SetJoystickVirtualAxis(SDL_Joystick * joystick, int axis, Sint16 value)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualAxis(@NativeType("SDL_Joystick *") long joystick, int axis, @NativeType("Sint16") short value) {
        long __functionAddress = Functions.SetJoystickVirtualAxis;
        if (CHECKS) {
            check(joystick);
        }
        return invokePSZ(joystick, axis, value, __functionAddress);
    }

    // --- [ SDL_SetJoystickVirtualBall ] ---

    /** {@code bool SDL_SetJoystickVirtualBall(SDL_Joystick * joystick, int ball, Sint16 xrel, Sint16 yrel)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualBall(@NativeType("SDL_Joystick *") long joystick, int ball, @NativeType("Sint16") short xrel, @NativeType("Sint16") short yrel) {
        long __functionAddress = Functions.SetJoystickVirtualBall;
        if (CHECKS) {
            check(joystick);
        }
        return invokePSSZ(joystick, ball, xrel, yrel, __functionAddress);
    }

    // --- [ SDL_SetJoystickVirtualButton ] ---

    /** {@code bool SDL_SetJoystickVirtualButton(SDL_Joystick * joystick, int button, bool down)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualButton(@NativeType("SDL_Joystick *") long joystick, int button, @NativeType("bool") boolean down) {
        long __functionAddress = Functions.SetJoystickVirtualButton;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, button, down, __functionAddress);
    }

    // --- [ SDL_SetJoystickVirtualHat ] ---

    /** {@code bool SDL_SetJoystickVirtualHat(SDL_Joystick * joystick, int hat, Uint8 value)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualHat(@NativeType("SDL_Joystick *") long joystick, int hat, @NativeType("Uint8") byte value) {
        long __functionAddress = Functions.SetJoystickVirtualHat;
        if (CHECKS) {
            check(joystick);
        }
        return invokePUZ(joystick, hat, value, __functionAddress);
    }

    // --- [ SDL_SetJoystickVirtualTouchpad ] ---

    /** {@code bool SDL_SetJoystickVirtualTouchpad(SDL_Joystick * joystick, int touchpad, int finger, bool down, float x, float y, float pressure)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualTouchpad(@NativeType("SDL_Joystick *") long joystick, int touchpad, int finger, @NativeType("bool") boolean down, float x, float y, float pressure) {
        long __functionAddress = Functions.SetJoystickVirtualTouchpad;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, touchpad, finger, down, x, y, pressure, __functionAddress);
    }

    // --- [ SDL_SendJoystickVirtualSensorData ] ---

    /** {@code bool SDL_SendJoystickVirtualSensorData(SDL_Joystick * joystick, SDL_SensorType type, Uint64 sensor_timestamp, float const * data, int num_values)} */
    public static boolean nSDL_SendJoystickVirtualSensorData(long joystick, int type, long sensor_timestamp, long data, int num_values) {
        long __functionAddress = Functions.SendJoystickVirtualSensorData;
        if (CHECKS) {
            check(joystick);
        }
        return invokePJPZ(joystick, type, sensor_timestamp, data, num_values, __functionAddress);
    }

    /** {@code bool SDL_SendJoystickVirtualSensorData(SDL_Joystick * joystick, SDL_SensorType type, Uint64 sensor_timestamp, float const * data, int num_values)} */
    @NativeType("bool")
    public static boolean SDL_SendJoystickVirtualSensorData(@NativeType("SDL_Joystick *") long joystick, @NativeType("SDL_SensorType") int type, @NativeType("Uint64") long sensor_timestamp, @NativeType("float const *") FloatBuffer data) {
        return nSDL_SendJoystickVirtualSensorData(joystick, type, sensor_timestamp, memAddress(data), data.remaining());
    }

    // --- [ SDL_GetJoystickProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetJoystickProperties(SDL_Joystick * joystick)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetJoystickProperties(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickProperties;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickName ] ---

    /** {@code char const * SDL_GetJoystickName(SDL_Joystick * joystick)} */
    public static long nSDL_GetJoystickName(long joystick) {
        long __functionAddress = Functions.GetJoystickName;
        if (CHECKS) {
            check(joystick);
        }
        return invokePP(joystick, __functionAddress);
    }

    /** {@code char const * SDL_GetJoystickName(SDL_Joystick * joystick)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetJoystickName(@NativeType("SDL_Joystick *") long joystick) {
        long __result = nSDL_GetJoystickName(joystick);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetJoystickPath ] ---

    /** {@code char const * SDL_GetJoystickPath(SDL_Joystick * joystick)} */
    public static long nSDL_GetJoystickPath(long joystick) {
        long __functionAddress = Functions.GetJoystickPath;
        if (CHECKS) {
            check(joystick);
        }
        return invokePP(joystick, __functionAddress);
    }

    /** {@code char const * SDL_GetJoystickPath(SDL_Joystick * joystick)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetJoystickPath(@NativeType("SDL_Joystick *") long joystick) {
        long __result = nSDL_GetJoystickPath(joystick);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetJoystickPlayerIndex ] ---

    /** {@code int SDL_GetJoystickPlayerIndex(SDL_Joystick * joystick)} */
    public static int SDL_GetJoystickPlayerIndex(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickPlayerIndex;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_SetJoystickPlayerIndex ] ---

    /** {@code bool SDL_SetJoystickPlayerIndex(SDL_Joystick * joystick, int player_index)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickPlayerIndex(@NativeType("SDL_Joystick *") long joystick, int player_index) {
        long __functionAddress = Functions.SetJoystickPlayerIndex;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, player_index, __functionAddress);
    }

    // --- [ SDL_GetJoystickGUID ] ---

    private static final FFICIF SDL_GetJoystickGUIDCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)),
        ffi_type_pointer
    );

    /** {@code SDL_GUID SDL_GetJoystickGUID(SDL_Joystick * joystick)} */
    public static void nSDL_GetJoystickGUID(long joystick, long __result) {
        long __functionAddress = Functions.GetJoystickGUID;
        if (CHECKS) {
            check(joystick);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, stack.npointer(joystick));

            nffi_call(SDL_GetJoystickGUIDCIF.address(), __functionAddress, __result, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code SDL_GUID SDL_GetJoystickGUID(SDL_Joystick * joystick)} */
    public static SDL_GUID SDL_GetJoystickGUID(@NativeType("SDL_Joystick *") long joystick, SDL_GUID __result) {
        nSDL_GetJoystickGUID(joystick, __result.address());
        return __result;
    }

    // --- [ SDL_GetJoystickVendor ] ---

    /** {@code Uint16 SDL_GetJoystickVendor(SDL_Joystick * joystick)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickVendor(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickVendor;
        if (CHECKS) {
            check(joystick);
        }
        return invokePC(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickProduct ] ---

    /** {@code Uint16 SDL_GetJoystickProduct(SDL_Joystick * joystick)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickProduct(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickProduct;
        if (CHECKS) {
            check(joystick);
        }
        return invokePC(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickProductVersion ] ---

    /** {@code Uint16 SDL_GetJoystickProductVersion(SDL_Joystick * joystick)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickProductVersion(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickProductVersion;
        if (CHECKS) {
            check(joystick);
        }
        return invokePC(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickFirmwareVersion ] ---

    /** {@code Uint16 SDL_GetJoystickFirmwareVersion(SDL_Joystick * joystick)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickFirmwareVersion(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickFirmwareVersion;
        if (CHECKS) {
            check(joystick);
        }
        return invokePC(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickSerial ] ---

    /** {@code char const * SDL_GetJoystickSerial(SDL_Joystick * joystick)} */
    public static long nSDL_GetJoystickSerial(long joystick) {
        long __functionAddress = Functions.GetJoystickSerial;
        if (CHECKS) {
            check(joystick);
        }
        return invokePP(joystick, __functionAddress);
    }

    /** {@code char const * SDL_GetJoystickSerial(SDL_Joystick * joystick)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetJoystickSerial(@NativeType("SDL_Joystick *") long joystick) {
        long __result = nSDL_GetJoystickSerial(joystick);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetJoystickType ] ---

    /** {@code SDL_JoystickType SDL_GetJoystickType(SDL_Joystick * joystick)} */
    @NativeType("SDL_JoystickType")
    public static int SDL_GetJoystickType(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickType;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickGUIDInfo ] ---

    private static final FFICIF SDL_GetJoystickGUIDInfoCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_void,
        apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)), ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    /** {@code void SDL_GetJoystickGUIDInfo(SDL_GUID guid, Uint16 * vendor, Uint16 * product, Uint16 * version, Uint16 * crc16)} */
    public static void nSDL_GetJoystickGUIDInfo(long guid, long vendor, long product, long version, long crc16) {
        long __functionAddress = Functions.GetJoystickGUIDInfo;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 5);
            memPutAddress(arguments, guid);
            memPutAddress(arguments + POINTER_SIZE, stack.npointer(vendor));
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.npointer(product));
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.npointer(version));
            memPutAddress(arguments + 4 * POINTER_SIZE, stack.npointer(crc16));

            nffi_call(SDL_GetJoystickGUIDInfoCIF.address(), __functionAddress, NULL, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void SDL_GetJoystickGUIDInfo(SDL_GUID guid, Uint16 * vendor, Uint16 * product, Uint16 * version, Uint16 * crc16)} */
    public static void SDL_GetJoystickGUIDInfo(SDL_GUID guid, @NativeType("Uint16 *") ShortBuffer vendor, @NativeType("Uint16 *") ShortBuffer product, @NativeType("Uint16 *") ShortBuffer version, @NativeType("Uint16 *") ShortBuffer crc16) {
        if (CHECKS) {
            check(vendor, 1);
            check(product, 1);
            check(version, 1);
            check(crc16, 1);
        }
        nSDL_GetJoystickGUIDInfo(guid.address(), memAddress(vendor), memAddress(product), memAddress(version), memAddress(crc16));
    }

    // --- [ SDL_JoystickConnected ] ---

    /** {@code bool SDL_JoystickConnected(SDL_Joystick * joystick)} */
    @NativeType("bool")
    public static boolean SDL_JoystickConnected(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.JoystickConnected;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickID ] ---

    /** {@code SDL_JoystickID SDL_GetJoystickID(SDL_Joystick * joystick)} */
    @NativeType("SDL_JoystickID")
    public static int SDL_GetJoystickID(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickID;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetNumJoystickAxes ] ---

    /** {@code int SDL_GetNumJoystickAxes(SDL_Joystick * joystick)} */
    public static int SDL_GetNumJoystickAxes(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickAxes;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetNumJoystickBalls ] ---

    /** {@code int SDL_GetNumJoystickBalls(SDL_Joystick * joystick)} */
    public static int SDL_GetNumJoystickBalls(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickBalls;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetNumJoystickHats ] ---

    /** {@code int SDL_GetNumJoystickHats(SDL_Joystick * joystick)} */
    public static int SDL_GetNumJoystickHats(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickHats;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetNumJoystickButtons ] ---

    /** {@code int SDL_GetNumJoystickButtons(SDL_Joystick * joystick)} */
    public static int SDL_GetNumJoystickButtons(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickButtons;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_SetJoystickEventsEnabled ] ---

    /** {@code void SDL_SetJoystickEventsEnabled(bool enabled)} */
    public static void SDL_SetJoystickEventsEnabled(@NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetJoystickEventsEnabled;
        invokeV(enabled, __functionAddress);
    }

    // --- [ SDL_JoystickEventsEnabled ] ---

    /** {@code bool SDL_JoystickEventsEnabled(void)} */
    @NativeType("bool")
    public static boolean SDL_JoystickEventsEnabled() {
        long __functionAddress = Functions.JoystickEventsEnabled;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_UpdateJoysticks ] ---

    /** {@code void SDL_UpdateJoysticks(void)} */
    public static void SDL_UpdateJoysticks() {
        long __functionAddress = Functions.UpdateJoysticks;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GetJoystickAxis ] ---

    /** {@code Sint16 SDL_GetJoystickAxis(SDL_Joystick * joystick, int axis)} */
    @NativeType("Sint16")
    public static short SDL_GetJoystickAxis(@NativeType("SDL_Joystick *") long joystick, int axis) {
        long __functionAddress = Functions.GetJoystickAxis;
        if (CHECKS) {
            check(joystick);
        }
        return invokePS(joystick, axis, __functionAddress);
    }

    // --- [ SDL_GetJoystickAxisInitialState ] ---

    /** {@code bool SDL_GetJoystickAxisInitialState(SDL_Joystick * joystick, int axis, Sint16 * state)} */
    public static boolean nSDL_GetJoystickAxisInitialState(long joystick, int axis, long state) {
        long __functionAddress = Functions.GetJoystickAxisInitialState;
        if (CHECKS) {
            check(joystick);
        }
        return invokePPZ(joystick, axis, state, __functionAddress);
    }

    /** {@code bool SDL_GetJoystickAxisInitialState(SDL_Joystick * joystick, int axis, Sint16 * state)} */
    @NativeType("bool")
    public static boolean SDL_GetJoystickAxisInitialState(@NativeType("SDL_Joystick *") long joystick, int axis, @NativeType("Sint16 *") ShortBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nSDL_GetJoystickAxisInitialState(joystick, axis, memAddress(state));
    }

    // --- [ SDL_GetJoystickBall ] ---

    /** {@code bool SDL_GetJoystickBall(SDL_Joystick * joystick, int ball, int * dx, int * dy)} */
    public static boolean nSDL_GetJoystickBall(long joystick, int ball, long dx, long dy) {
        long __functionAddress = Functions.GetJoystickBall;
        if (CHECKS) {
            check(joystick);
        }
        return invokePPPZ(joystick, ball, dx, dy, __functionAddress);
    }

    /** {@code bool SDL_GetJoystickBall(SDL_Joystick * joystick, int ball, int * dx, int * dy)} */
    @NativeType("bool")
    public static boolean SDL_GetJoystickBall(@NativeType("SDL_Joystick *") long joystick, int ball, @NativeType("int *") IntBuffer dx, @NativeType("int *") IntBuffer dy) {
        if (CHECKS) {
            check(dx, 1);
            check(dy, 1);
        }
        return nSDL_GetJoystickBall(joystick, ball, memAddress(dx), memAddress(dy));
    }

    // --- [ SDL_GetJoystickHat ] ---

    /** {@code Uint8 SDL_GetJoystickHat(SDL_Joystick * joystick, int hat)} */
    @NativeType("Uint8")
    public static byte SDL_GetJoystickHat(@NativeType("SDL_Joystick *") long joystick, int hat) {
        long __functionAddress = Functions.GetJoystickHat;
        if (CHECKS) {
            check(joystick);
        }
        return invokePU(joystick, hat, __functionAddress);
    }

    // --- [ SDL_GetJoystickButton ] ---

    /** {@code bool SDL_GetJoystickButton(SDL_Joystick * joystick, int button)} */
    @NativeType("bool")
    public static boolean SDL_GetJoystickButton(@NativeType("SDL_Joystick *") long joystick, int button) {
        long __functionAddress = Functions.GetJoystickButton;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, button, __functionAddress);
    }

    // --- [ SDL_RumbleJoystick ] ---

    /** {@code bool SDL_RumbleJoystick(SDL_Joystick * joystick, Uint16 low_frequency_rumble, Uint16 high_frequency_rumble, Uint32 duration_ms)} */
    @NativeType("bool")
    public static boolean SDL_RumbleJoystick(@NativeType("SDL_Joystick *") long joystick, @NativeType("Uint16") short low_frequency_rumble, @NativeType("Uint16") short high_frequency_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleJoystick;
        if (CHECKS) {
            check(joystick);
        }
        return invokePCCZ(joystick, low_frequency_rumble, high_frequency_rumble, duration_ms, __functionAddress);
    }

    // --- [ SDL_RumbleJoystickTriggers ] ---

    /** {@code bool SDL_RumbleJoystickTriggers(SDL_Joystick * joystick, Uint16 left_rumble, Uint16 right_rumble, Uint32 duration_ms)} */
    @NativeType("bool")
    public static boolean SDL_RumbleJoystickTriggers(@NativeType("SDL_Joystick *") long joystick, @NativeType("Uint16") short left_rumble, @NativeType("Uint16") short right_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleJoystickTriggers;
        if (CHECKS) {
            check(joystick);
        }
        return invokePCCZ(joystick, left_rumble, right_rumble, duration_ms, __functionAddress);
    }

    // --- [ SDL_SetJoystickLED ] ---

    /** {@code bool SDL_SetJoystickLED(SDL_Joystick * joystick, Uint8 red, Uint8 green, Uint8 blue)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickLED(@NativeType("SDL_Joystick *") long joystick, @NativeType("Uint8") byte red, @NativeType("Uint8") byte green, @NativeType("Uint8") byte blue) {
        long __functionAddress = Functions.SetJoystickLED;
        if (CHECKS) {
            check(joystick);
        }
        return invokePUUUZ(joystick, red, green, blue, __functionAddress);
    }

    // --- [ SDL_SendJoystickEffect ] ---

    /** {@code bool SDL_SendJoystickEffect(SDL_Joystick * joystick, void const * data, int size)} */
    public static boolean nSDL_SendJoystickEffect(long joystick, long data, int size) {
        long __functionAddress = Functions.SendJoystickEffect;
        if (CHECKS) {
            check(joystick);
        }
        return invokePPZ(joystick, data, size, __functionAddress);
    }

    /** {@code bool SDL_SendJoystickEffect(SDL_Joystick * joystick, void const * data, int size)} */
    @NativeType("bool")
    public static boolean SDL_SendJoystickEffect(@NativeType("SDL_Joystick *") long joystick, @NativeType("void const *") ByteBuffer data) {
        return nSDL_SendJoystickEffect(joystick, memAddress(data), data.remaining());
    }

    // --- [ SDL_CloseJoystick ] ---

    /** {@code void SDL_CloseJoystick(SDL_Joystick * joystick)} */
    public static void SDL_CloseJoystick(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.CloseJoystick;
        if (CHECKS) {
            check(joystick);
        }
        invokePV(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickConnectionState ] ---

    /** {@code SDL_JoystickConnectionState SDL_GetJoystickConnectionState(SDL_Joystick * joystick)} */
    @NativeType("SDL_JoystickConnectionState")
    public static int SDL_GetJoystickConnectionState(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickConnectionState;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickPowerInfo ] ---

    /** {@code SDL_PowerState SDL_GetJoystickPowerInfo(SDL_Joystick * joystick, int * percent)} */
    public static int nSDL_GetJoystickPowerInfo(long joystick, long percent) {
        long __functionAddress = Functions.GetJoystickPowerInfo;
        if (CHECKS) {
            check(joystick);
        }
        return invokePPI(joystick, percent, __functionAddress);
    }

    /** {@code SDL_PowerState SDL_GetJoystickPowerInfo(SDL_Joystick * joystick, int * percent)} */
    @NativeType("SDL_PowerState")
    public static int SDL_GetJoystickPowerInfo(@NativeType("SDL_Joystick *") long joystick, @NativeType("int *") IntBuffer percent) {
        if (CHECKS) {
            check(percent, 1);
        }
        return nSDL_GetJoystickPowerInfo(joystick, memAddress(percent));
    }

    // --- [ SDL_AddGamepadMapping ] ---

    /** {@code int SDL_AddGamepadMapping(char const * mapping)} */
    public static int nSDL_AddGamepadMapping(long mapping) {
        long __functionAddress = Functions.AddGamepadMapping;
        return invokePI(mapping, __functionAddress);
    }

    /** {@code int SDL_AddGamepadMapping(char const * mapping)} */
    public static int SDL_AddGamepadMapping(@NativeType("char const *") ByteBuffer mapping) {
        if (CHECKS) {
            checkNT1(mapping);
        }
        return nSDL_AddGamepadMapping(memAddress(mapping));
    }

    /** {@code int SDL_AddGamepadMapping(char const * mapping)} */
    public static int SDL_AddGamepadMapping(@NativeType("char const *") CharSequence mapping) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(mapping, true);
            long mappingEncoded = stack.getPointerAddress();
            return nSDL_AddGamepadMapping(mappingEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_AddGamepadMappingsFromIO ] ---

    /** {@code int SDL_AddGamepadMappingsFromIO(SDL_IOStream * src, bool closeio)} */
    public static int SDL_AddGamepadMappingsFromIO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio) {
        long __functionAddress = Functions.AddGamepadMappingsFromIO;
        if (CHECKS) {
            check(src);
        }
        return invokePI(src, closeio, __functionAddress);
    }

    // --- [ SDL_AddGamepadMappingsFromFile ] ---

    /** {@code int SDL_AddGamepadMappingsFromFile(char const * file)} */
    public static int nSDL_AddGamepadMappingsFromFile(long file) {
        long __functionAddress = Functions.AddGamepadMappingsFromFile;
        return invokePI(file, __functionAddress);
    }

    /** {@code int SDL_AddGamepadMappingsFromFile(char const * file)} */
    public static int SDL_AddGamepadMappingsFromFile(@NativeType("char const *") ByteBuffer file) {
        if (CHECKS) {
            checkNT1(file);
        }
        return nSDL_AddGamepadMappingsFromFile(memAddress(file));
    }

    /** {@code int SDL_AddGamepadMappingsFromFile(char const * file)} */
    public static int SDL_AddGamepadMappingsFromFile(@NativeType("char const *") CharSequence file) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            return nSDL_AddGamepadMappingsFromFile(fileEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ReloadGamepadMappings ] ---

    /** {@code bool SDL_ReloadGamepadMappings(void)} */
    @NativeType("bool")
    public static boolean SDL_ReloadGamepadMappings() {
        long __functionAddress = Functions.ReloadGamepadMappings;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetGamepadMappings ] ---

    /** {@code char ** SDL_GetGamepadMappings(int * count)} */
    public static long nSDL_GetGamepadMappings(long count) {
        long __functionAddress = Functions.GetGamepadMappings;
        return invokePP(count, __functionAddress);
    }

    /** {@code char ** SDL_GetGamepadMappings(int * count)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GetGamepadMappings() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetGamepadMappings(memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetGamepadMappingForGUID ] ---

    private static final FFICIF SDL_GetGamepadMappingForGUIDCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_pointer,
        apiCreateStruct(apiCreateArray(ffi_type_uint8, 16))
    );

    /** {@code char * SDL_GetGamepadMappingForGUID(SDL_GUID guid)} */
    public static long nSDL_GetGamepadMappingForGUID(long guid) {
        long __functionAddress = Functions.GetGamepadMappingForGUID;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.npointer(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, guid);

            nffi_call(SDL_GetGamepadMappingForGUIDCIF.address(), __functionAddress, __result, arguments);

            return memGetAddress(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code char * SDL_GetGamepadMappingForGUID(SDL_GUID guid)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetGamepadMappingForGUID(SDL_GUID guid) {
        long __result = NULL;
        try {
            __result = nSDL_GetGamepadMappingForGUID(guid.address());
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    // --- [ SDL_GetGamepadMapping ] ---

    /** {@code char * SDL_GetGamepadMapping(SDL_Gamepad * gamepad)} */
    public static long nSDL_GetGamepadMapping(long gamepad) {
        long __functionAddress = Functions.GetGamepadMapping;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, __functionAddress);
    }

    /** {@code char * SDL_GetGamepadMapping(SDL_Gamepad * gamepad)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetGamepadMapping(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = NULL;
        try {
            __result = nSDL_GetGamepadMapping(gamepad);
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    // --- [ SDL_SetGamepadMapping ] ---

    /** {@code bool SDL_SetGamepadMapping(SDL_JoystickID instance_id, char const * mapping)} */
    public static boolean nSDL_SetGamepadMapping(int instance_id, long mapping) {
        long __functionAddress = Functions.SetGamepadMapping;
        return invokePZ(instance_id, mapping, __functionAddress);
    }

    /** {@code bool SDL_SetGamepadMapping(SDL_JoystickID instance_id, char const * mapping)} */
    @NativeType("bool")
    public static boolean SDL_SetGamepadMapping(@NativeType("SDL_JoystickID") int instance_id, @NativeType("char const *") ByteBuffer mapping) {
        if (CHECKS) {
            checkNT1(mapping);
        }
        return nSDL_SetGamepadMapping(instance_id, memAddress(mapping));
    }

    /** {@code bool SDL_SetGamepadMapping(SDL_JoystickID instance_id, char const * mapping)} */
    @NativeType("bool")
    public static boolean SDL_SetGamepadMapping(@NativeType("SDL_JoystickID") int instance_id, @NativeType("char const *") CharSequence mapping) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(mapping, true);
            long mappingEncoded = stack.getPointerAddress();
            return nSDL_SetGamepadMapping(instance_id, mappingEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_HasGamepad ] ---

    /** {@code bool SDL_HasGamepad(void)} */
    @NativeType("bool")
    public static boolean SDL_HasGamepad() {
        long __functionAddress = Functions.HasGamepad;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetGamepads ] ---

    /** {@code SDL_JoystickID * SDL_GetGamepads(int * count)} */
    public static long nSDL_GetGamepads(long count) {
        long __functionAddress = Functions.GetGamepads;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_JoystickID * SDL_GetGamepads(int * count)} */
    @NativeType("SDL_JoystickID *")
    public static @Nullable IntBuffer SDL_GetGamepads() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetGamepads(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_IsGamepad ] ---

    /** {@code bool SDL_IsGamepad(SDL_JoystickID instance_id)} */
    @NativeType("bool")
    public static boolean SDL_IsGamepad(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.IsGamepad;
        return invokeZ(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadNameForID ] ---

    /** {@code char const * SDL_GetGamepadNameForID(SDL_JoystickID instance_id)} */
    public static long nSDL_GetGamepadNameForID(int instance_id) {
        long __functionAddress = Functions.GetGamepadNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadNameForID(SDL_JoystickID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadNameForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetGamepadNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadPathForID ] ---

    /** {@code char const * SDL_GetGamepadPathForID(SDL_JoystickID instance_id)} */
    public static long nSDL_GetGamepadPathForID(int instance_id) {
        long __functionAddress = Functions.GetGamepadPathForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadPathForID(SDL_JoystickID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadPathForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetGamepadPathForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadPlayerIndexForID ] ---

    /** {@code int SDL_GetGamepadPlayerIndexForID(SDL_JoystickID instance_id)} */
    public static int SDL_GetGamepadPlayerIndexForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadPlayerIndexForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadGUIDForID ] ---

    private static final FFICIF SDL_GetGamepadGUIDForIDCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)),
        ffi_type_uint32
    );

    /** {@code SDL_GUID SDL_GetGamepadGUIDForID(SDL_JoystickID instance_id)} */
    public static void nSDL_GetGamepadGUIDForID(int instance_id, long __result) {
        long __functionAddress = Functions.GetGamepadGUIDForID;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, stack.nint(instance_id));

            nffi_call(SDL_GetGamepadGUIDForIDCIF.address(), __functionAddress, __result, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code SDL_GUID SDL_GetGamepadGUIDForID(SDL_JoystickID instance_id)} */
    public static SDL_GUID SDL_GetGamepadGUIDForID(@NativeType("SDL_JoystickID") int instance_id, SDL_GUID __result) {
        nSDL_GetGamepadGUIDForID(instance_id, __result.address());
        return __result;
    }

    // --- [ SDL_GetGamepadVendorForID ] ---

    /** {@code Uint16 SDL_GetGamepadVendorForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadVendorForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadVendorForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadProductForID ] ---

    /** {@code Uint16 SDL_GetGamepadProductForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadProductForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadProductForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadProductVersionForID ] ---

    /** {@code Uint16 SDL_GetGamepadProductVersionForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadProductVersionForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadProductVersionForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadTypeForID ] ---

    /** {@code SDL_GamepadType SDL_GetGamepadTypeForID(SDL_JoystickID instance_id)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadTypeForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadTypeForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_GetRealGamepadTypeForID ] ---

    /** {@code SDL_GamepadType SDL_GetRealGamepadTypeForID(SDL_JoystickID instance_id)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetRealGamepadTypeForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetRealGamepadTypeForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadMappingForID ] ---

    /** {@code char * SDL_GetGamepadMappingForID(SDL_JoystickID instance_id)} */
    public static long nSDL_GetGamepadMappingForID(int instance_id) {
        long __functionAddress = Functions.GetGamepadMappingForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char * SDL_GetGamepadMappingForID(SDL_JoystickID instance_id)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetGamepadMappingForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = NULL;
        try {
            __result = nSDL_GetGamepadMappingForID(instance_id);
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    // --- [ SDL_OpenGamepad ] ---

    /** {@code SDL_Gamepad * SDL_OpenGamepad(SDL_JoystickID instance_id)} */
    @NativeType("SDL_Gamepad *")
    public static long SDL_OpenGamepad(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.OpenGamepad;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadFromID ] ---

    /** {@code SDL_Gamepad * SDL_GetGamepadFromID(SDL_JoystickID instance_id)} */
    @NativeType("SDL_Gamepad *")
    public static long SDL_GetGamepadFromID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadFromID;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadFromPlayerIndex ] ---

    /** {@code SDL_Gamepad * SDL_GetGamepadFromPlayerIndex(int player_index)} */
    @NativeType("SDL_Gamepad *")
    public static long SDL_GetGamepadFromPlayerIndex(int player_index) {
        long __functionAddress = Functions.GetGamepadFromPlayerIndex;
        return invokeP(player_index, __functionAddress);
    }

    // --- [ SDL_GetGamepadProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetGamepadProperties(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetGamepadProperties(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadProperties;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadID ] ---

    /** {@code SDL_JoystickID SDL_GetGamepadID(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_JoystickID")
    public static int SDL_GetGamepadID(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadID;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadName ] ---

    /** {@code char const * SDL_GetGamepadName(SDL_Gamepad * gamepad)} */
    public static long nSDL_GetGamepadName(long gamepad) {
        long __functionAddress = Functions.GetGamepadName;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadName(SDL_Gamepad * gamepad)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadName(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = nSDL_GetGamepadName(gamepad);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadPath ] ---

    /** {@code char const * SDL_GetGamepadPath(SDL_Gamepad * gamepad)} */
    public static long nSDL_GetGamepadPath(long gamepad) {
        long __functionAddress = Functions.GetGamepadPath;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadPath(SDL_Gamepad * gamepad)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadPath(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = nSDL_GetGamepadPath(gamepad);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadType ] ---

    /** {@code SDL_GamepadType SDL_GetGamepadType(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadType(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadType;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetRealGamepadType ] ---

    /** {@code SDL_GamepadType SDL_GetRealGamepadType(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetRealGamepadType(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetRealGamepadType;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadPlayerIndex ] ---

    /** {@code int SDL_GetGamepadPlayerIndex(SDL_Gamepad * gamepad)} */
    public static int SDL_GetGamepadPlayerIndex(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadPlayerIndex;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_SetGamepadPlayerIndex ] ---

    /** {@code bool SDL_SetGamepadPlayerIndex(SDL_Gamepad * gamepad, int player_index)} */
    @NativeType("bool")
    public static boolean SDL_SetGamepadPlayerIndex(@NativeType("SDL_Gamepad *") long gamepad, int player_index) {
        long __functionAddress = Functions.SetGamepadPlayerIndex;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, player_index, __functionAddress);
    }

    // --- [ SDL_GetGamepadVendor ] ---

    /** {@code Uint16 SDL_GetGamepadVendor(SDL_Gamepad * gamepad)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadVendor(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadVendor;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePC(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadProduct ] ---

    /** {@code Uint16 SDL_GetGamepadProduct(SDL_Gamepad * gamepad)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadProduct(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadProduct;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePC(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadProductVersion ] ---

    /** {@code Uint16 SDL_GetGamepadProductVersion(SDL_Gamepad * gamepad)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadProductVersion(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadProductVersion;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePC(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadFirmwareVersion ] ---

    /** {@code Uint16 SDL_GetGamepadFirmwareVersion(SDL_Gamepad * gamepad)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadFirmwareVersion(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadFirmwareVersion;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePC(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadSerial ] ---

    /** {@code char const * SDL_GetGamepadSerial(SDL_Gamepad * gamepad)} */
    public static long nSDL_GetGamepadSerial(long gamepad) {
        long __functionAddress = Functions.GetGamepadSerial;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadSerial(SDL_Gamepad * gamepad)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadSerial(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = nSDL_GetGamepadSerial(gamepad);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadSteamHandle ] ---

    /** {@code Uint64 SDL_GetGamepadSteamHandle(SDL_Gamepad * gamepad)} */
    @NativeType("Uint64")
    public static long SDL_GetGamepadSteamHandle(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadSteamHandle;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePJ(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadConnectionState ] ---

    /** {@code SDL_JoystickConnectionState SDL_GetGamepadConnectionState(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_JoystickConnectionState")
    public static int SDL_GetGamepadConnectionState(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadConnectionState;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadPowerInfo ] ---

    /** {@code SDL_PowerState SDL_GetGamepadPowerInfo(SDL_Gamepad * gamepad, int * percent)} */
    public static int nSDL_GetGamepadPowerInfo(long gamepad, long percent) {
        long __functionAddress = Functions.GetGamepadPowerInfo;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePPI(gamepad, percent, __functionAddress);
    }

    /** {@code SDL_PowerState SDL_GetGamepadPowerInfo(SDL_Gamepad * gamepad, int * percent)} */
    @NativeType("SDL_PowerState")
    public static int SDL_GetGamepadPowerInfo(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("int *") @Nullable IntBuffer percent) {
        if (CHECKS) {
            checkSafe(percent, 1);
        }
        return nSDL_GetGamepadPowerInfo(gamepad, memAddressSafe(percent));
    }

    // --- [ SDL_GamepadConnected ] ---

    /** {@code bool SDL_GamepadConnected(SDL_Gamepad * gamepad)} */
    @NativeType("bool")
    public static boolean SDL_GamepadConnected(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GamepadConnected;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadJoystick ] ---

    /** {@code SDL_Joystick * SDL_GetGamepadJoystick(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_Joystick *")
    public static long SDL_GetGamepadJoystick(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadJoystick;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, __functionAddress);
    }

    // --- [ SDL_SetGamepadEventsEnabled ] ---

    /** {@code void SDL_SetGamepadEventsEnabled(bool enabled)} */
    public static void SDL_SetGamepadEventsEnabled(@NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetGamepadEventsEnabled;
        invokeV(enabled, __functionAddress);
    }

    // --- [ SDL_GamepadEventsEnabled ] ---

    /** {@code bool SDL_GamepadEventsEnabled(void)} */
    @NativeType("bool")
    public static boolean SDL_GamepadEventsEnabled() {
        long __functionAddress = Functions.GamepadEventsEnabled;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetGamepadBindings ] ---

    /** {@code SDL_GamepadBinding ** SDL_GetGamepadBindings(SDL_Gamepad * gamepad, int * count)} */
    public static long nSDL_GetGamepadBindings(long gamepad, long count) {
        long __functionAddress = Functions.GetGamepadBindings;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePPP(gamepad, count, __functionAddress);
    }

    /** {@code SDL_GamepadBinding ** SDL_GetGamepadBindings(SDL_Gamepad * gamepad, int * count)} */
    @NativeType("SDL_GamepadBinding **")
    public static @Nullable PointerBuffer SDL_GetGamepadBindings(@NativeType("SDL_Gamepad *") long gamepad) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetGamepadBindings(gamepad, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_UpdateGamepads ] ---

    /** {@code void SDL_UpdateGamepads(void)} */
    public static void SDL_UpdateGamepads() {
        long __functionAddress = Functions.UpdateGamepads;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GetGamepadTypeFromString ] ---

    /** {@code SDL_GamepadType SDL_GetGamepadTypeFromString(char const * str)} */
    public static int nSDL_GetGamepadTypeFromString(long str) {
        long __functionAddress = Functions.GetGamepadTypeFromString;
        return invokePI(str, __functionAddress);
    }

    /** {@code SDL_GamepadType SDL_GetGamepadTypeFromString(char const * str)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadTypeFromString(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nSDL_GetGamepadTypeFromString(memAddress(str));
    }

    /** {@code SDL_GamepadType SDL_GetGamepadTypeFromString(char const * str)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadTypeFromString(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nSDL_GetGamepadTypeFromString(strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetGamepadStringForType ] ---

    /** {@code char const * SDL_GetGamepadStringForType(SDL_GamepadType type)} */
    public static long nSDL_GetGamepadStringForType(int type) {
        long __functionAddress = Functions.GetGamepadStringForType;
        return invokeP(type, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadStringForType(SDL_GamepadType type)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadStringForType(@NativeType("SDL_GamepadType") int type) {
        long __result = nSDL_GetGamepadStringForType(type);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadAxisFromString ] ---

    /** {@code SDL_GamepadAxis SDL_GetGamepadAxisFromString(char const * str)} */
    public static int nSDL_GetGamepadAxisFromString(long str) {
        long __functionAddress = Functions.GetGamepadAxisFromString;
        return invokePI(str, __functionAddress);
    }

    /** {@code SDL_GamepadAxis SDL_GetGamepadAxisFromString(char const * str)} */
    @NativeType("SDL_GamepadAxis")
    public static int SDL_GetGamepadAxisFromString(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nSDL_GetGamepadAxisFromString(memAddress(str));
    }

    /** {@code SDL_GamepadAxis SDL_GetGamepadAxisFromString(char const * str)} */
    @NativeType("SDL_GamepadAxis")
    public static int SDL_GetGamepadAxisFromString(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nSDL_GetGamepadAxisFromString(strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetGamepadStringForAxis ] ---

    /** {@code char const * SDL_GetGamepadStringForAxis(SDL_GamepadAxis axis)} */
    public static long nSDL_GetGamepadStringForAxis(int axis) {
        long __functionAddress = Functions.GetGamepadStringForAxis;
        return invokeP(axis, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadStringForAxis(SDL_GamepadAxis axis)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadStringForAxis(@NativeType("SDL_GamepadAxis") int axis) {
        long __result = nSDL_GetGamepadStringForAxis(axis);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GamepadHasAxis ] ---

    /** {@code bool SDL_GamepadHasAxis(SDL_Gamepad * gamepad, SDL_GamepadAxis axis)} */
    @NativeType("bool")
    public static boolean SDL_GamepadHasAxis(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadAxis") int axis) {
        long __functionAddress = Functions.GamepadHasAxis;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, axis, __functionAddress);
    }

    // --- [ SDL_GetGamepadAxis ] ---

    /** {@code Sint16 SDL_GetGamepadAxis(SDL_Gamepad * gamepad, SDL_GamepadAxis axis)} */
    @NativeType("Sint16")
    public static short SDL_GetGamepadAxis(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadAxis") int axis) {
        long __functionAddress = Functions.GetGamepadAxis;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePS(gamepad, axis, __functionAddress);
    }

    // --- [ SDL_GetGamepadButtonFromString ] ---

    /** {@code SDL_GamepadButton SDL_GetGamepadButtonFromString(char const * str)} */
    public static int nSDL_GetGamepadButtonFromString(long str) {
        long __functionAddress = Functions.GetGamepadButtonFromString;
        return invokePI(str, __functionAddress);
    }

    /** {@code SDL_GamepadButton SDL_GetGamepadButtonFromString(char const * str)} */
    @NativeType("SDL_GamepadButton")
    public static int SDL_GetGamepadButtonFromString(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nSDL_GetGamepadButtonFromString(memAddress(str));
    }

    /** {@code SDL_GamepadButton SDL_GetGamepadButtonFromString(char const * str)} */
    @NativeType("SDL_GamepadButton")
    public static int SDL_GetGamepadButtonFromString(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nSDL_GetGamepadButtonFromString(strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetGamepadStringForButton ] ---

    /** {@code char const * SDL_GetGamepadStringForButton(SDL_GamepadButton button)} */
    public static long nSDL_GetGamepadStringForButton(int button) {
        long __functionAddress = Functions.GetGamepadStringForButton;
        return invokeP(button, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadStringForButton(SDL_GamepadButton button)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadStringForButton(@NativeType("SDL_GamepadButton") int button) {
        long __result = nSDL_GetGamepadStringForButton(button);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GamepadHasButton ] ---

    /** {@code bool SDL_GamepadHasButton(SDL_Gamepad * gamepad, SDL_GamepadButton button)} */
    @NativeType("bool")
    public static boolean SDL_GamepadHasButton(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GamepadHasButton;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, button, __functionAddress);
    }

    // --- [ SDL_GetGamepadButton ] ---

    /** {@code bool SDL_GetGamepadButton(SDL_Gamepad * gamepad, SDL_GamepadButton button)} */
    @NativeType("bool")
    public static boolean SDL_GetGamepadButton(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GetGamepadButton;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, button, __functionAddress);
    }

    // --- [ SDL_GetGamepadButtonLabelForType ] ---

    /** {@code SDL_GamepadButtonLabel SDL_GetGamepadButtonLabelForType(SDL_GamepadType type, SDL_GamepadButton button)} */
    @NativeType("SDL_GamepadButtonLabel")
    public static int SDL_GetGamepadButtonLabelForType(@NativeType("SDL_GamepadType") int type, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GetGamepadButtonLabelForType;
        return invokeI(type, button, __functionAddress);
    }

    // --- [ SDL_GetGamepadButtonLabel ] ---

    /** {@code SDL_GamepadButtonLabel SDL_GetGamepadButtonLabel(SDL_Gamepad * gamepad, SDL_GamepadButton button)} */
    @NativeType("SDL_GamepadButtonLabel")
    public static int SDL_GetGamepadButtonLabel(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GetGamepadButtonLabel;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, button, __functionAddress);
    }

    // --- [ SDL_GetNumGamepadTouchpads ] ---

    /** {@code int SDL_GetNumGamepadTouchpads(SDL_Gamepad * gamepad)} */
    public static int SDL_GetNumGamepadTouchpads(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetNumGamepadTouchpads;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetNumGamepadTouchpadFingers ] ---

    /** {@code int SDL_GetNumGamepadTouchpadFingers(SDL_Gamepad * gamepad, int touchpad)} */
    public static int SDL_GetNumGamepadTouchpadFingers(@NativeType("SDL_Gamepad *") long gamepad, int touchpad) {
        long __functionAddress = Functions.GetNumGamepadTouchpadFingers;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, touchpad, __functionAddress);
    }

    // --- [ SDL_GetGamepadTouchpadFinger ] ---

    /** {@code bool SDL_GetGamepadTouchpadFinger(SDL_Gamepad * gamepad, int touchpad, int finger, bool * down, float * x, float * y, float * pressure)} */
    public static boolean nSDL_GetGamepadTouchpadFinger(long gamepad, int touchpad, int finger, long down, long x, long y, long pressure) {
        long __functionAddress = Functions.GetGamepadTouchpadFinger;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePPPPPZ(gamepad, touchpad, finger, down, x, y, pressure, __functionAddress);
    }

    /** {@code bool SDL_GetGamepadTouchpadFinger(SDL_Gamepad * gamepad, int touchpad, int finger, bool * down, float * x, float * y, float * pressure)} */
    @NativeType("bool")
    public static boolean SDL_GetGamepadTouchpadFinger(@NativeType("SDL_Gamepad *") long gamepad, int touchpad, int finger, @NativeType("bool *") @Nullable ByteBuffer down, @NativeType("float *") @Nullable FloatBuffer x, @NativeType("float *") @Nullable FloatBuffer y, @NativeType("float *") @Nullable FloatBuffer pressure) {
        if (CHECKS) {
            checkSafe(down, 1);
            checkSafe(x, 1);
            checkSafe(y, 1);
            checkSafe(pressure, 1);
        }
        return nSDL_GetGamepadTouchpadFinger(gamepad, touchpad, finger, memAddressSafe(down), memAddressSafe(x), memAddressSafe(y), memAddressSafe(pressure));
    }

    // --- [ SDL_GamepadHasSensor ] ---

    /** {@code bool SDL_GamepadHasSensor(SDL_Gamepad * gamepad, SDL_SensorType type)} */
    @NativeType("bool")
    public static boolean SDL_GamepadHasSensor(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type) {
        long __functionAddress = Functions.GamepadHasSensor;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, type, __functionAddress);
    }

    // --- [ SDL_SetGamepadSensorEnabled ] ---

    /** {@code bool SDL_SetGamepadSensorEnabled(SDL_Gamepad * gamepad, SDL_SensorType type, bool enabled)} */
    @NativeType("bool")
    public static boolean SDL_SetGamepadSensorEnabled(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetGamepadSensorEnabled;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, type, enabled, __functionAddress);
    }

    // --- [ SDL_GamepadSensorEnabled ] ---

    /** {@code bool SDL_GamepadSensorEnabled(SDL_Gamepad * gamepad, SDL_SensorType type)} */
    @NativeType("bool")
    public static boolean SDL_GamepadSensorEnabled(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type) {
        long __functionAddress = Functions.GamepadSensorEnabled;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, type, __functionAddress);
    }

    // --- [ SDL_GetGamepadSensorDataRate ] ---

    /** {@code float SDL_GetGamepadSensorDataRate(SDL_Gamepad * gamepad, SDL_SensorType type)} */
    public static float SDL_GetGamepadSensorDataRate(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type) {
        long __functionAddress = Functions.GetGamepadSensorDataRate;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePF(gamepad, type, __functionAddress);
    }

    // --- [ SDL_GetGamepadSensorData ] ---

    /** {@code bool SDL_GetGamepadSensorData(SDL_Gamepad * gamepad, SDL_SensorType type, float * data, int num_values)} */
    public static boolean nSDL_GetGamepadSensorData(long gamepad, int type, long data, int num_values) {
        long __functionAddress = Functions.GetGamepadSensorData;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePPZ(gamepad, type, data, num_values, __functionAddress);
    }

    /** {@code bool SDL_GetGamepadSensorData(SDL_Gamepad * gamepad, SDL_SensorType type, float * data, int num_values)} */
    @NativeType("bool")
    public static boolean SDL_GetGamepadSensorData(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type, @NativeType("float *") FloatBuffer data) {
        return nSDL_GetGamepadSensorData(gamepad, type, memAddress(data), data.remaining());
    }

    // --- [ SDL_RumbleGamepad ] ---

    /** {@code bool SDL_RumbleGamepad(SDL_Gamepad * gamepad, Uint16 low_frequency_rumble, Uint16 high_frequency_rumble, Uint32 duration_ms)} */
    @NativeType("bool")
    public static boolean SDL_RumbleGamepad(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("Uint16") short low_frequency_rumble, @NativeType("Uint16") short high_frequency_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleGamepad;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePCCZ(gamepad, low_frequency_rumble, high_frequency_rumble, duration_ms, __functionAddress);
    }

    // --- [ SDL_RumbleGamepadTriggers ] ---

    /** {@code bool SDL_RumbleGamepadTriggers(SDL_Gamepad * gamepad, Uint16 left_rumble, Uint16 right_rumble, Uint32 duration_ms)} */
    @NativeType("bool")
    public static boolean SDL_RumbleGamepadTriggers(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("Uint16") short left_rumble, @NativeType("Uint16") short right_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleGamepadTriggers;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePCCZ(gamepad, left_rumble, right_rumble, duration_ms, __functionAddress);
    }

    // --- [ SDL_SetGamepadLED ] ---

    /** {@code bool SDL_SetGamepadLED(SDL_Gamepad * gamepad, Uint8 red, Uint8 green, Uint8 blue)} */
    @NativeType("bool")
    public static boolean SDL_SetGamepadLED(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("Uint8") byte red, @NativeType("Uint8") byte green, @NativeType("Uint8") byte blue) {
        long __functionAddress = Functions.SetGamepadLED;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePUUUZ(gamepad, red, green, blue, __functionAddress);
    }

    // --- [ SDL_SendGamepadEffect ] ---

    /** {@code bool SDL_SendGamepadEffect(SDL_Gamepad * gamepad, void const * data, int size)} */
    public static boolean nSDL_SendGamepadEffect(long gamepad, long data, int size) {
        long __functionAddress = Functions.SendGamepadEffect;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePPZ(gamepad, data, size, __functionAddress);
    }

    /** {@code bool SDL_SendGamepadEffect(SDL_Gamepad * gamepad, void const * data, int size)} */
    @NativeType("bool")
    public static boolean SDL_SendGamepadEffect(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("void const *") ByteBuffer data) {
        return nSDL_SendGamepadEffect(gamepad, memAddress(data), data.remaining());
    }

    // --- [ SDL_CloseGamepad ] ---

    /** {@code void SDL_CloseGamepad(SDL_Gamepad * gamepad)} */
    public static void SDL_CloseGamepad(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.CloseGamepad;
        if (CHECKS) {
            check(gamepad);
        }
        invokePV(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadAppleSFSymbolsNameForButton ] ---

    /** {@code char const * SDL_GetGamepadAppleSFSymbolsNameForButton(SDL_Gamepad * gamepad, SDL_GamepadButton button)} */
    public static long nSDL_GetGamepadAppleSFSymbolsNameForButton(long gamepad, int button) {
        long __functionAddress = Functions.GetGamepadAppleSFSymbolsNameForButton;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, button, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadAppleSFSymbolsNameForButton(SDL_Gamepad * gamepad, SDL_GamepadButton button)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadAppleSFSymbolsNameForButton(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __result = nSDL_GetGamepadAppleSFSymbolsNameForButton(gamepad, button);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadAppleSFSymbolsNameForAxis ] ---

    /** {@code char const * SDL_GetGamepadAppleSFSymbolsNameForAxis(SDL_Gamepad * gamepad, SDL_GamepadAxis axis)} */
    public static long nSDL_GetGamepadAppleSFSymbolsNameForAxis(long gamepad, int axis) {
        long __functionAddress = Functions.GetGamepadAppleSFSymbolsNameForAxis;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, axis, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadAppleSFSymbolsNameForAxis(SDL_Gamepad * gamepad, SDL_GamepadAxis axis)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadAppleSFSymbolsNameForAxis(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadAxis") int axis) {
        long __result = nSDL_GetGamepadAppleSFSymbolsNameForAxis(gamepad, axis);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_HasKeyboard ] ---

    /** {@code bool SDL_HasKeyboard(void)} */
    @NativeType("bool")
    public static boolean SDL_HasKeyboard() {
        long __functionAddress = Functions.HasKeyboard;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetKeyboards ] ---

    /** {@code SDL_KeyboardID * SDL_GetKeyboards(int * count)} */
    public static long nSDL_GetKeyboards(long count) {
        long __functionAddress = Functions.GetKeyboards;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_KeyboardID * SDL_GetKeyboards(int * count)} */
    @NativeType("SDL_KeyboardID *")
    public static @Nullable IntBuffer SDL_GetKeyboards() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetKeyboards(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetKeyboardNameForID ] ---

    /** {@code char const * SDL_GetKeyboardNameForID(SDL_KeyboardID instance_id)} */
    public static long nSDL_GetKeyboardNameForID(int instance_id) {
        long __functionAddress = Functions.GetKeyboardNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetKeyboardNameForID(SDL_KeyboardID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetKeyboardNameForID(@NativeType("SDL_KeyboardID") int instance_id) {
        long __result = nSDL_GetKeyboardNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetKeyboardFocus ] ---

    /** {@code SDL_Window * SDL_GetKeyboardFocus(void)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetKeyboardFocus() {
        long __functionAddress = Functions.GetKeyboardFocus;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_GetKeyboardState ] ---

    /** {@code bool const * SDL_GetKeyboardState(int * numkeys)} */
    public static long nSDL_GetKeyboardState(long numkeys) {
        long __functionAddress = Functions.GetKeyboardState;
        return invokePP(numkeys, __functionAddress);
    }

    /** {@code bool const * SDL_GetKeyboardState(int * numkeys)} */
    @NativeType("bool const *")
    public static @Nullable ByteBuffer SDL_GetKeyboardState() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer numkeys = stack.callocInt(1);
        try {
            long __result = nSDL_GetKeyboardState(memAddress(numkeys));
            return memByteBufferSafe(__result, numkeys.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ResetKeyboard ] ---

    /** {@code void SDL_ResetKeyboard(void)} */
    public static void SDL_ResetKeyboard() {
        long __functionAddress = Functions.ResetKeyboard;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GetModState ] ---

    /** {@code SDL_Keymod SDL_GetModState(void)} */
    @NativeType("SDL_Keymod")
    public static short SDL_GetModState() {
        long __functionAddress = Functions.GetModState;
        return invokeC(__functionAddress);
    }

    // --- [ SDL_SetModState ] ---

    /** {@code void SDL_SetModState(SDL_Keymod modstate)} */
    public static void SDL_SetModState(@NativeType("SDL_Keymod") short modstate) {
        long __functionAddress = Functions.SetModState;
        invokeCV(modstate, __functionAddress);
    }

    // --- [ SDL_GetKeyFromScancode ] ---

    /** {@code SDL_Keycode SDL_GetKeyFromScancode(SDL_Scancode scancode, SDL_Keymod modstate, bool key_event)} */
    @NativeType("SDL_Keycode")
    public static int SDL_GetKeyFromScancode(@NativeType("SDL_Scancode") int scancode, @NativeType("SDL_Keymod") short modstate, @NativeType("bool") boolean key_event) {
        long __functionAddress = Functions.GetKeyFromScancode;
        return invokeCI(scancode, modstate, key_event, __functionAddress);
    }

    // --- [ SDL_GetScancodeFromKey ] ---

    /** {@code SDL_Scancode SDL_GetScancodeFromKey(SDL_Keycode key, SDL_Keymod * modstate)} */
    public static int nSDL_GetScancodeFromKey(int key, long modstate) {
        long __functionAddress = Functions.GetScancodeFromKey;
        return invokePI(key, modstate, __functionAddress);
    }

    /** {@code SDL_Scancode SDL_GetScancodeFromKey(SDL_Keycode key, SDL_Keymod * modstate)} */
    @NativeType("SDL_Scancode")
    public static int SDL_GetScancodeFromKey(@NativeType("SDL_Keycode") int key, @NativeType("SDL_Keymod *") @Nullable ShortBuffer modstate) {
        if (CHECKS) {
            checkSafe(modstate, 1);
        }
        return nSDL_GetScancodeFromKey(key, memAddressSafe(modstate));
    }

    // --- [ SDL_SetScancodeName ] ---

    /** {@code bool SDL_SetScancodeName(SDL_Scancode scancode, char const * name)} */
    public static boolean nSDL_SetScancodeName(int scancode, long name) {
        long __functionAddress = Functions.SetScancodeName;
        return invokePZ(scancode, name, __functionAddress);
    }

    /** {@code bool SDL_SetScancodeName(SDL_Scancode scancode, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_SetScancodeName(@NativeType("SDL_Scancode") int scancode, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetScancodeName(scancode, memAddress(name));
    }

    // --- [ SDL_GetScancodeName ] ---

    /** {@code char const * SDL_GetScancodeName(SDL_Scancode scancode)} */
    public static long nSDL_GetScancodeName(int scancode) {
        long __functionAddress = Functions.GetScancodeName;
        return invokeP(scancode, __functionAddress);
    }

    /** {@code char const * SDL_GetScancodeName(SDL_Scancode scancode)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetScancodeName(@NativeType("SDL_Scancode") int scancode) {
        long __result = nSDL_GetScancodeName(scancode);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetScancodeFromName ] ---

    /** {@code SDL_Scancode SDL_GetScancodeFromName(char const * name)} */
    public static int nSDL_GetScancodeFromName(long name) {
        long __functionAddress = Functions.GetScancodeFromName;
        return invokePI(name, __functionAddress);
    }

    /** {@code SDL_Scancode SDL_GetScancodeFromName(char const * name)} */
    @NativeType("SDL_Scancode")
    public static int SDL_GetScancodeFromName(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetScancodeFromName(memAddress(name));
    }

    /** {@code SDL_Scancode SDL_GetScancodeFromName(char const * name)} */
    @NativeType("SDL_Scancode")
    public static int SDL_GetScancodeFromName(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetScancodeFromName(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetKeyName ] ---

    /** {@code char const * SDL_GetKeyName(SDL_Keycode key)} */
    public static long nSDL_GetKeyName(int key) {
        long __functionAddress = Functions.GetKeyName;
        return invokeP(key, __functionAddress);
    }

    /** {@code char const * SDL_GetKeyName(SDL_Keycode key)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetKeyName(@NativeType("SDL_Keycode") int key) {
        long __result = nSDL_GetKeyName(key);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetKeyFromName ] ---

    /** {@code SDL_Keycode SDL_GetKeyFromName(char const * name)} */
    public static int nSDL_GetKeyFromName(long name) {
        long __functionAddress = Functions.GetKeyFromName;
        return invokePI(name, __functionAddress);
    }

    /** {@code SDL_Keycode SDL_GetKeyFromName(char const * name)} */
    @NativeType("SDL_Keycode")
    public static int SDL_GetKeyFromName(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetKeyFromName(memAddress(name));
    }

    /** {@code SDL_Keycode SDL_GetKeyFromName(char const * name)} */
    @NativeType("SDL_Keycode")
    public static int SDL_GetKeyFromName(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetKeyFromName(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_StartTextInput ] ---

    /** {@code bool SDL_StartTextInput(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_StartTextInput(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.StartTextInput;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_StartTextInputWithProperties ] ---

    /** {@code bool SDL_StartTextInputWithProperties(SDL_Window * window, SDL_PropertiesID props)} */
    @NativeType("bool")
    public static boolean SDL_StartTextInputWithProperties(@NativeType("SDL_Window *") long window, @NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.StartTextInputWithProperties;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, props, __functionAddress);
    }

    // --- [ SDL_TextInputActive ] ---

    /** {@code bool SDL_TextInputActive(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_TextInputActive(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.TextInputActive;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_StopTextInput ] ---

    /** {@code bool SDL_StopTextInput(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_StopTextInput(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.StopTextInput;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_ClearComposition ] ---

    /** {@code bool SDL_ClearComposition(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ClearComposition(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ClearComposition;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_SetTextInputArea ] ---

    /** {@code bool SDL_SetTextInputArea(SDL_Window * window, SDL_Rect const * rect, int cursor)} */
    public static boolean nSDL_SetTextInputArea(long window, long rect, int cursor) {
        long __functionAddress = Functions.SetTextInputArea;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, rect, cursor, __functionAddress);
    }

    /** {@code bool SDL_SetTextInputArea(SDL_Window * window, SDL_Rect const * rect, int cursor)} */
    @NativeType("bool")
    public static boolean SDL_SetTextInputArea(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer rect, int cursor) {
        if (CHECKS) {
            checkSafe(rect, 1);
        }
        return nSDL_SetTextInputArea(window, memAddressSafe(rect), cursor);
    }

    // --- [ SDL_GetTextInputArea ] ---

    /** {@code bool SDL_GetTextInputArea(SDL_Window * window, SDL_Rect * rect, int * cursor)} */
    public static boolean nSDL_GetTextInputArea(long window, long rect, long cursor) {
        long __functionAddress = Functions.GetTextInputArea;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, rect, cursor, __functionAddress);
    }

    /** {@code bool SDL_GetTextInputArea(SDL_Window * window, SDL_Rect * rect, int * cursor)} */
    @NativeType("bool")
    public static boolean SDL_GetTextInputArea(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect *") SDL_Rect.@Nullable Buffer rect, @NativeType("int *") IntBuffer cursor) {
        if (CHECKS) {
            checkSafe(rect, 1);
            check(cursor, 1);
        }
        return nSDL_GetTextInputArea(window, memAddressSafe(rect), memAddress(cursor));
    }

    // --- [ SDL_HasScreenKeyboardSupport ] ---

    /** {@code bool SDL_HasScreenKeyboardSupport(void)} */
    @NativeType("bool")
    public static boolean SDL_HasScreenKeyboardSupport() {
        long __functionAddress = Functions.HasScreenKeyboardSupport;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_ScreenKeyboardShown ] ---

    /** {@code bool SDL_ScreenKeyboardShown(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ScreenKeyboardShown(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ScreenKeyboardShown;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_SCANCODE_TO_KEYCODE ] ---

    /** {@code uint32_t SDL_SCANCODE_TO_KEYCODE(uint16_t X)} */
    @NativeType("uint32_t")
    public static int SDL_SCANCODE_TO_KEYCODE(@NativeType("uint16_t") short X) {
        return (((int)X) & 0xFFFF) | SDLK_SCANCODE_MASK;
    }

    // --- [ SDL_GetPreferredLocales ] ---

    /** {@code SDL_Locale ** SDL_GetPreferredLocales(int * count)} */
    public static long nSDL_GetPreferredLocales(long count) {
        long __functionAddress = Functions.GetPreferredLocales;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_Locale ** SDL_GetPreferredLocales(int * count)} */
    @NativeType("SDL_Locale **")
    public static @Nullable PointerBuffer SDL_GetPreferredLocales() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetPreferredLocales(memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetLogPriorities ] ---

    /** {@code void SDL_SetLogPriorities(SDL_LogPriority priority)} */
    public static void SDL_SetLogPriorities(@NativeType("SDL_LogPriority") int priority) {
        long __functionAddress = Functions.SetLogPriorities;
        invokeV(priority, __functionAddress);
    }

    // --- [ SDL_SetLogPriority ] ---

    /** {@code void SDL_SetLogPriority(int category, SDL_LogPriority priority)} */
    public static void SDL_SetLogPriority(int category, @NativeType("SDL_LogPriority") int priority) {
        long __functionAddress = Functions.SetLogPriority;
        invokeV(category, priority, __functionAddress);
    }

    // --- [ SDL_GetLogPriority ] ---

    /** {@code SDL_LogPriority SDL_GetLogPriority(int category)} */
    @NativeType("SDL_LogPriority")
    public static int SDL_GetLogPriority(int category) {
        long __functionAddress = Functions.GetLogPriority;
        return invokeI(category, __functionAddress);
    }

    // --- [ SDL_ResetLogPriorities ] ---

    /** {@code void SDL_ResetLogPriorities(void)} */
    public static void SDL_ResetLogPriorities() {
        long __functionAddress = Functions.ResetLogPriorities;
        invokeV(__functionAddress);
    }

    // --- [ SDL_SetLogPriorityPrefix ] ---

    /** {@code bool SDL_SetLogPriorityPrefix(SDL_LogPriority priority, char const * prefix)} */
    public static boolean nSDL_SetLogPriorityPrefix(int priority, long prefix) {
        long __functionAddress = Functions.SetLogPriorityPrefix;
        return invokePZ(priority, prefix, __functionAddress);
    }

    /** {@code bool SDL_SetLogPriorityPrefix(SDL_LogPriority priority, char const * prefix)} */
    @NativeType("bool")
    public static boolean SDL_SetLogPriorityPrefix(@NativeType("SDL_LogPriority") int priority, @NativeType("char const *") @Nullable ByteBuffer prefix) {
        if (CHECKS) {
            checkNT1Safe(prefix);
        }
        return nSDL_SetLogPriorityPrefix(priority, memAddressSafe(prefix));
    }

    /** {@code bool SDL_SetLogPriorityPrefix(SDL_LogPriority priority, char const * prefix)} */
    @NativeType("bool")
    public static boolean SDL_SetLogPriorityPrefix(@NativeType("SDL_LogPriority") int priority, @NativeType("char const *") @Nullable CharSequence prefix) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(prefix, true);
            long prefixEncoded = prefix == null ? NULL : stack.getPointerAddress();
            return nSDL_SetLogPriorityPrefix(priority, prefixEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LogMessage ] ---

    /** {@code void SDL_LogMessage(int category, SDL_LogPriority priority, char const * fmt)} */
    public static void nSDL_LogMessage(int category, int priority, long fmt) {
        long __functionAddress = Functions.LogMessage;
        invokePV(category, priority, fmt, __functionAddress);
    }

    /** {@code void SDL_LogMessage(int category, SDL_LogPriority priority, char const * fmt)} */
    public static void SDL_LogMessage(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_LogMessage(category, priority, memAddress(fmt));
    }

    /** {@code void SDL_LogMessage(int category, SDL_LogPriority priority, char const * fmt)} */
    public static void SDL_LogMessage(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogMessage(category, priority, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LogMessageV ] ---

    /** {@code void SDL_LogMessageV(int category, SDL_LogPriority priority, char const * fmt, va_list ap)} */
    public static void nSDL_LogMessageV(int category, int priority, long fmt, long ap) {
        long __functionAddress = Functions.LogMessageV;
        if (CHECKS) {
            check(ap);
        }
        invokePPV(category, priority, fmt, ap, __functionAddress);
    }

    /** {@code void SDL_LogMessageV(int category, SDL_LogPriority priority, char const * fmt, va_list ap)} */
    public static void SDL_LogMessageV(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") ByteBuffer fmt, @NativeType("va_list") long ap) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_LogMessageV(category, priority, memAddress(fmt), ap);
    }

    /** {@code void SDL_LogMessageV(int category, SDL_LogPriority priority, char const * fmt, va_list ap)} */
    public static void SDL_LogMessageV(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") CharSequence fmt, @NativeType("va_list") long ap) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogMessageV(category, priority, fmtEncoded, ap);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetDefaultLogOutputFunction ] ---

    /** {@code SDL_LogOutputFunction SDL_GetDefaultLogOutputFunction(void)} */
    public static long nSDL_GetDefaultLogOutputFunction() {
        long __functionAddress = Functions.GetDefaultLogOutputFunction;
        return invokeP(__functionAddress);
    }

    /** {@code SDL_LogOutputFunction SDL_GetDefaultLogOutputFunction(void)} */
    @NativeType("SDL_LogOutputFunction")
    public static @Nullable SDL_LogOutputFunction SDL_GetDefaultLogOutputFunction() {
        return SDL_LogOutputFunction.createSafe(nSDL_GetDefaultLogOutputFunction());
    }

    // --- [ SDL_GetLogOutputFunction ] ---

    /** {@code void SDL_GetLogOutputFunction(SDL_LogOutputFunction * callback, void ** userdata)} */
    public static void nSDL_GetLogOutputFunction(long callback, long userdata) {
        long __functionAddress = Functions.GetLogOutputFunction;
        invokePPV(callback, userdata, __functionAddress);
    }

    /** {@code void SDL_GetLogOutputFunction(SDL_LogOutputFunction * callback, void ** userdata)} */
    public static void SDL_GetLogOutputFunction(@NativeType("SDL_LogOutputFunction *") PointerBuffer callback, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(callback, 1);
            check(userdata, 1);
        }
        nSDL_GetLogOutputFunction(memAddress(callback), memAddress(userdata));
    }

    /** {@code void SDL_GetLogOutputFunction(SDL_LogOutputFunction * callback, void ** userdata)} */
    @NativeType("void")
    public static long SDL_GetLogOutputFunction(@NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer callback = stack.callocPointer(1);
            nSDL_GetLogOutputFunction(memAddress(callback), memAddress(userdata));
            return callback.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetLogOutputFunction ] ---

    /** {@code void SDL_SetLogOutputFunction(SDL_LogOutputFunction callback, void * userdata)} */
    public static void nSDL_SetLogOutputFunction(long callback, long userdata) {
        long __functionAddress = Functions.SetLogOutputFunction;
        invokePPV(callback, userdata, __functionAddress);
    }

    /** {@code void SDL_SetLogOutputFunction(SDL_LogOutputFunction callback, void * userdata)} */
    public static void SDL_SetLogOutputFunction(@NativeType("SDL_LogOutputFunction") SDL_LogOutputFunctionI callback, @NativeType("void *") long userdata) {
        nSDL_SetLogOutputFunction(callback.address(), userdata);
    }

    // --- [ SDL_ShowMessageBox ] ---

    /** {@code bool SDL_ShowMessageBox(SDL_MessageBoxData const * messageboxdata, int * buttonid)} */
    public static boolean nSDL_ShowMessageBox(long messageboxdata, long buttonid) {
        long __functionAddress = Functions.ShowMessageBox;
        if (CHECKS) {
            Struct.validate(messageboxdata, 1, SDL_MessageBoxData.SIZEOF, SDL_MessageBoxData::validate);
        }
        return invokePPZ(messageboxdata, buttonid, __functionAddress);
    }

    /** {@code bool SDL_ShowMessageBox(SDL_MessageBoxData const * messageboxdata, int * buttonid)} */
    @NativeType("bool")
    public static boolean SDL_ShowMessageBox(@NativeType("SDL_MessageBoxData const *") SDL_MessageBoxData.Buffer messageboxdata, @NativeType("int *") IntBuffer buttonid) {
        if (CHECKS) {
            check(messageboxdata, 1);
            check(buttonid, 1);
        }
        return nSDL_ShowMessageBox(messageboxdata.address(), memAddress(buttonid));
    }

    // --- [ SDL_ShowSimpleMessageBox ] ---

    /** {@code bool SDL_ShowSimpleMessageBox(SDL_MessageBoxFlags flags, char const * title, char const * message, SDL_Window * window)} */
    public static boolean nSDL_ShowSimpleMessageBox(int flags, long title, long message, long window) {
        long __functionAddress = Functions.ShowSimpleMessageBox;
        return invokePPPZ(flags, title, message, window, __functionAddress);
    }

    /** {@code bool SDL_ShowSimpleMessageBox(SDL_MessageBoxFlags flags, char const * title, char const * message, SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ShowSimpleMessageBox(@NativeType("SDL_MessageBoxFlags") int flags, @NativeType("char const *") ByteBuffer title, @NativeType("char const *") ByteBuffer message, @NativeType("SDL_Window *") long window) {
        if (CHECKS) {
            checkNT1(title);
            checkNT1(message);
        }
        return nSDL_ShowSimpleMessageBox(flags, memAddress(title), memAddress(message), window);
    }

    /** {@code bool SDL_ShowSimpleMessageBox(SDL_MessageBoxFlags flags, char const * title, char const * message, SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ShowSimpleMessageBox(@NativeType("SDL_MessageBoxFlags") int flags, @NativeType("char const *") CharSequence title, @NativeType("char const *") CharSequence message, @NativeType("SDL_Window *") long window) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            stack.nUTF8(message, true);
            long messageEncoded = stack.getPointerAddress();
            return nSDL_ShowSimpleMessageBox(flags, titleEncoded, messageEncoded, window);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_OpenURL ] ---

    /** {@code bool SDL_OpenURL(char const * url)} */
    public static boolean nSDL_OpenURL(long url) {
        long __functionAddress = Functions.OpenURL;
        return invokePZ(url, __functionAddress);
    }

    /** {@code bool SDL_OpenURL(char const * url)} */
    @NativeType("bool")
    public static boolean SDL_OpenURL(@NativeType("char const *") ByteBuffer url) {
        if (CHECKS) {
            checkNT1(url);
        }
        return nSDL_OpenURL(memAddress(url));
    }

    /** {@code bool SDL_OpenURL(char const * url)} */
    @NativeType("bool")
    public static boolean SDL_OpenURL(@NativeType("char const *") CharSequence url) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(url, true);
            long urlEncoded = stack.getPointerAddress();
            return nSDL_OpenURL(urlEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_HasMouse ] ---

    /** {@code bool SDL_HasMouse(void)} */
    @NativeType("bool")
    public static boolean SDL_HasMouse() {
        long __functionAddress = Functions.HasMouse;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetMice ] ---

    /** {@code SDL_MouseID * SDL_GetMice(int * count)} */
    public static long nSDL_GetMice(long count) {
        long __functionAddress = Functions.GetMice;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_MouseID * SDL_GetMice(int * count)} */
    @NativeType("SDL_MouseID *")
    public static @Nullable IntBuffer SDL_GetMice() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetMice(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetMouseNameForID ] ---

    /** {@code char const * SDL_GetMouseNameForID(SDL_MouseID instance_id)} */
    public static long nSDL_GetMouseNameForID(int instance_id) {
        long __functionAddress = Functions.GetMouseNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetMouseNameForID(SDL_MouseID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetMouseNameForID(@NativeType("SDL_MouseID") int instance_id) {
        long __result = nSDL_GetMouseNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetMouseFocus ] ---

    /** {@code SDL_Window * SDL_GetMouseFocus(void)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetMouseFocus() {
        long __functionAddress = Functions.GetMouseFocus;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_GetMouseState ] ---

    /** {@code SDL_MouseButtonFlags SDL_GetMouseState(float * x, float * y)} */
    public static int nSDL_GetMouseState(long x, long y) {
        long __functionAddress = Functions.GetMouseState;
        return invokePPI(x, y, __functionAddress);
    }

    /** {@code SDL_MouseButtonFlags SDL_GetMouseState(float * x, float * y)} */
    @NativeType("SDL_MouseButtonFlags")
    public static int SDL_GetMouseState(@NativeType("float *") FloatBuffer x, @NativeType("float *") FloatBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        return nSDL_GetMouseState(memAddress(x), memAddress(y));
    }

    // --- [ SDL_GetGlobalMouseState ] ---

    /** {@code SDL_MouseButtonFlags SDL_GetGlobalMouseState(float * x, float * y)} */
    public static int nSDL_GetGlobalMouseState(long x, long y) {
        long __functionAddress = Functions.GetGlobalMouseState;
        return invokePPI(x, y, __functionAddress);
    }

    /** {@code SDL_MouseButtonFlags SDL_GetGlobalMouseState(float * x, float * y)} */
    @NativeType("SDL_MouseButtonFlags")
    public static int SDL_GetGlobalMouseState(@NativeType("float *") FloatBuffer x, @NativeType("float *") FloatBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        return nSDL_GetGlobalMouseState(memAddress(x), memAddress(y));
    }

    // --- [ SDL_GetRelativeMouseState ] ---

    /** {@code SDL_MouseButtonFlags SDL_GetRelativeMouseState(float * x, float * y)} */
    public static int nSDL_GetRelativeMouseState(long x, long y) {
        long __functionAddress = Functions.GetRelativeMouseState;
        return invokePPI(x, y, __functionAddress);
    }

    /** {@code SDL_MouseButtonFlags SDL_GetRelativeMouseState(float * x, float * y)} */
    @NativeType("SDL_MouseButtonFlags")
    public static int SDL_GetRelativeMouseState(@NativeType("float *") FloatBuffer x, @NativeType("float *") FloatBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        return nSDL_GetRelativeMouseState(memAddress(x), memAddress(y));
    }

    // --- [ SDL_WarpMouseInWindow ] ---

    /** {@code void SDL_WarpMouseInWindow(SDL_Window * window, float x, float y)} */
    public static void SDL_WarpMouseInWindow(@NativeType("SDL_Window *") long window, float x, float y) {
        long __functionAddress = Functions.WarpMouseInWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, x, y, __functionAddress);
    }

    // --- [ SDL_WarpMouseGlobal ] ---

    /** {@code bool SDL_WarpMouseGlobal(float x, float y)} */
    @NativeType("bool")
    public static boolean SDL_WarpMouseGlobal(float x, float y) {
        long __functionAddress = Functions.WarpMouseGlobal;
        return invokeZ(x, y, __functionAddress);
    }

    // --- [ SDL_SetWindowRelativeMouseMode ] ---

    /** {@code bool SDL_SetWindowRelativeMouseMode(SDL_Window * window, bool enabled)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowRelativeMouseMode(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetWindowRelativeMouseMode;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, enabled, __functionAddress);
    }

    // --- [ SDL_GetWindowRelativeMouseMode ] ---

    /** {@code bool SDL_GetWindowRelativeMouseMode(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowRelativeMouseMode(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowRelativeMouseMode;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_CaptureMouse ] ---

    /** {@code bool SDL_CaptureMouse(bool enabled)} */
    @NativeType("bool")
    public static boolean SDL_CaptureMouse(@NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.CaptureMouse;
        return invokeZ(enabled, __functionAddress);
    }

    // --- [ SDL_CreateCursor ] ---

    /** {@code SDL_Cursor * SDL_CreateCursor(Uint8 const * data, Uint8 const * mask, int w, int h, int hot_x, int hot_y)} */
    public static long nSDL_CreateCursor(long data, long mask, int w, int h, int hot_x, int hot_y) {
        long __functionAddress = Functions.CreateCursor;
        return invokePPP(data, mask, w, h, hot_x, hot_y, __functionAddress);
    }

    /** {@code SDL_Cursor * SDL_CreateCursor(Uint8 const * data, Uint8 const * mask, int w, int h, int hot_x, int hot_y)} */
    @NativeType("SDL_Cursor *")
    public static long SDL_CreateCursor(@NativeType("Uint8 const *") ByteBuffer data, @NativeType("Uint8 const *") ByteBuffer mask, int w, int h, int hot_x, int hot_y) {
        if (CHECKS) {
            check(data, w*h/8);
            check(mask, w*h/8);
        }
        return nSDL_CreateCursor(memAddress(data), memAddress(mask), w, h, hot_x, hot_y);
    }

    // --- [ SDL_CreateColorCursor ] ---

    /** {@code SDL_Cursor * SDL_CreateColorCursor(SDL_Surface * surface, int hot_x, int hot_y)} */
    public static long nSDL_CreateColorCursor(long surface, int hot_x, int hot_y) {
        long __functionAddress = Functions.CreateColorCursor;
        return invokePP(surface, hot_x, hot_y, __functionAddress);
    }

    /** {@code SDL_Cursor * SDL_CreateColorCursor(SDL_Surface * surface, int hot_x, int hot_y)} */
    @NativeType("SDL_Cursor *")
    public static long SDL_CreateColorCursor(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, int hot_x, int hot_y) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_CreateColorCursor(surface.address(), hot_x, hot_y);
    }

    // --- [ SDL_CreateSystemCursor ] ---

    /** {@code SDL_Cursor * SDL_CreateSystemCursor(SDL_SystemCursor id)} */
    @NativeType("SDL_Cursor *")
    public static long SDL_CreateSystemCursor(@NativeType("SDL_SystemCursor") int id) {
        long __functionAddress = Functions.CreateSystemCursor;
        return invokeP(id, __functionAddress);
    }

    // --- [ SDL_SetCursor ] ---

    /** {@code bool SDL_SetCursor(SDL_Cursor * cursor)} */
    @NativeType("bool")
    public static boolean SDL_SetCursor(@NativeType("SDL_Cursor *") long cursor) {
        long __functionAddress = Functions.SetCursor;
        if (CHECKS) {
            check(cursor);
        }
        return invokePZ(cursor, __functionAddress);
    }

    // --- [ SDL_GetCursor ] ---

    /** {@code SDL_Cursor * SDL_GetCursor(void)} */
    @NativeType("SDL_Cursor *")
    public static long SDL_GetCursor() {
        long __functionAddress = Functions.GetCursor;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_GetDefaultCursor ] ---

    /** {@code SDL_Cursor * SDL_GetDefaultCursor(void)} */
    @NativeType("SDL_Cursor *")
    public static long SDL_GetDefaultCursor() {
        long __functionAddress = Functions.GetDefaultCursor;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_DestroyCursor ] ---

    /** {@code void SDL_DestroyCursor(SDL_Cursor * cursor)} */
    public static void SDL_DestroyCursor(@NativeType("SDL_Cursor *") long cursor) {
        long __functionAddress = Functions.DestroyCursor;
        if (CHECKS) {
            check(cursor);
        }
        invokePV(cursor, __functionAddress);
    }

    // --- [ SDL_ShowCursor ] ---

    /** {@code bool SDL_ShowCursor(void)} */
    @NativeType("bool")
    public static boolean SDL_ShowCursor() {
        long __functionAddress = Functions.ShowCursor;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HideCursor ] ---

    /** {@code bool SDL_HideCursor(void)} */
    @NativeType("bool")
    public static boolean SDL_HideCursor() {
        long __functionAddress = Functions.HideCursor;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_CursorVisible ] ---

    /** {@code bool SDL_CursorVisible(void)} */
    @NativeType("bool")
    public static boolean SDL_CursorVisible() {
        long __functionAddress = Functions.CursorVisible;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetPixelFormatName ] ---

    /** {@code char const * SDL_GetPixelFormatName(SDL_PixelFormat format)} */
    public static long nSDL_GetPixelFormatName(int format) {
        long __functionAddress = Functions.GetPixelFormatName;
        return invokeP(format, __functionAddress);
    }

    /** {@code char const * SDL_GetPixelFormatName(SDL_PixelFormat format)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetPixelFormatName(@NativeType("SDL_PixelFormat") int format) {
        long __result = nSDL_GetPixelFormatName(format);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetMasksForPixelFormat ] ---

    /** {@code bool SDL_GetMasksForPixelFormat(SDL_PixelFormat format, int * bpp, Uint32 * Rmask, Uint32 * Gmask, Uint32 * Bmask, Uint32 * Amask)} */
    public static boolean nSDL_GetMasksForPixelFormat(int format, long bpp, long Rmask, long Gmask, long Bmask, long Amask) {
        long __functionAddress = Functions.GetMasksForPixelFormat;
        return invokePPPPPZ(format, bpp, Rmask, Gmask, Bmask, Amask, __functionAddress);
    }

    /** {@code bool SDL_GetMasksForPixelFormat(SDL_PixelFormat format, int * bpp, Uint32 * Rmask, Uint32 * Gmask, Uint32 * Bmask, Uint32 * Amask)} */
    @NativeType("bool")
    public static boolean SDL_GetMasksForPixelFormat(@NativeType("SDL_PixelFormat") int format, @NativeType("int *") IntBuffer bpp, @NativeType("Uint32 *") IntBuffer Rmask, @NativeType("Uint32 *") IntBuffer Gmask, @NativeType("Uint32 *") IntBuffer Bmask, @NativeType("Uint32 *") IntBuffer Amask) {
        if (CHECKS) {
            check(bpp, 1);
            check(Rmask, 1);
            check(Gmask, 1);
            check(Bmask, 1);
            check(Amask, 1);
        }
        return nSDL_GetMasksForPixelFormat(format, memAddress(bpp), memAddress(Rmask), memAddress(Gmask), memAddress(Bmask), memAddress(Amask));
    }

    // --- [ SDL_GetPixelFormatForMasks ] ---

    /** {@code SDL_PixelFormat SDL_GetPixelFormatForMasks(int bpp, Uint32 Rmask, Uint32 Gmask, Uint32 Bmask, Uint32 Amask)} */
    @NativeType("SDL_PixelFormat")
    public static int SDL_GetPixelFormatForMasks(int bpp, @NativeType("Uint32") int Rmask, @NativeType("Uint32") int Gmask, @NativeType("Uint32") int Bmask, @NativeType("Uint32") int Amask) {
        long __functionAddress = Functions.GetPixelFormatForMasks;
        return invokeI(bpp, Rmask, Gmask, Bmask, Amask, __functionAddress);
    }

    // --- [ SDL_GetPixelFormatDetails ] ---

    /** {@code SDL_PixelFormatDetails const * SDL_GetPixelFormatDetails(SDL_PixelFormat format)} */
    public static long nSDL_GetPixelFormatDetails(int format) {
        long __functionAddress = Functions.GetPixelFormatDetails;
        return invokeP(format, __functionAddress);
    }

    /** {@code SDL_PixelFormatDetails const * SDL_GetPixelFormatDetails(SDL_PixelFormat format)} */
    @NativeType("SDL_PixelFormatDetails const *")
    public static @Nullable SDL_PixelFormatDetails SDL_GetPixelFormatDetails(@NativeType("SDL_PixelFormat") int format) {
        long __result = nSDL_GetPixelFormatDetails(format);
        return SDL_PixelFormatDetails.createSafe(__result);
    }

    // --- [ SDL_CreatePalette ] ---

    /** {@code SDL_Palette * SDL_CreatePalette(int ncolors)} */
    public static long nSDL_CreatePalette(int ncolors) {
        long __functionAddress = Functions.CreatePalette;
        return invokeP(ncolors, __functionAddress);
    }

    /** {@code SDL_Palette * SDL_CreatePalette(int ncolors)} */
    @NativeType("SDL_Palette *")
    public static @Nullable SDL_Palette SDL_CreatePalette(int ncolors) {
        long __result = nSDL_CreatePalette(ncolors);
        return SDL_Palette.createSafe(__result);
    }

    // --- [ SDL_SetPaletteColors ] ---

    /** {@code bool SDL_SetPaletteColors(SDL_Palette * palette, SDL_Color const * colors, int firstcolor, int ncolors)} */
    public static boolean nSDL_SetPaletteColors(long palette, long colors, int firstcolor, int ncolors) {
        long __functionAddress = Functions.SetPaletteColors;
        return invokePPZ(palette, colors, firstcolor, ncolors, __functionAddress);
    }

    /** {@code bool SDL_SetPaletteColors(SDL_Palette * palette, SDL_Color const * colors, int firstcolor, int ncolors)} */
    @NativeType("bool")
    public static boolean SDL_SetPaletteColors(@NativeType("SDL_Palette *") SDL_Palette.Buffer palette, @NativeType("SDL_Color const *") SDL_Color.Buffer colors, int firstcolor) {
        if (CHECKS) {
            check(palette, 1);
        }
        return nSDL_SetPaletteColors(palette.address(), colors.address(), firstcolor, colors.remaining());
    }

    // --- [ SDL_DestroyPalette ] ---

    /** {@code void SDL_DestroyPalette(SDL_Palette * palette)} */
    public static void nSDL_DestroyPalette(long palette) {
        long __functionAddress = Functions.DestroyPalette;
        invokePV(palette, __functionAddress);
    }

    /** {@code void SDL_DestroyPalette(SDL_Palette * palette)} */
    public static void SDL_DestroyPalette(@NativeType("SDL_Palette *") SDL_Palette.Buffer palette) {
        if (CHECKS) {
            check(palette, 1);
        }
        nSDL_DestroyPalette(palette.address());
    }

    // --- [ SDL_MapRGB ] ---

    /** {@code Uint32 SDL_MapRGB(SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 r, Uint8 g, Uint8 b)} */
    public static int nSDL_MapRGB(long format, long palette, byte r, byte g, byte b) {
        long __functionAddress = Functions.MapRGB;
        if (CHECKS) {
            if (palette != NULL) { Struct.validate(palette, 1, SDL_Palette.SIZEOF, SDL_Palette::validate); }
        }
        return invokePPUUUI(format, palette, r, g, b, __functionAddress);
    }

    /** {@code Uint32 SDL_MapRGB(SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 r, Uint8 g, Uint8 b)} */
    @NativeType("Uint32")
    public static int SDL_MapRGB(@NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails.Buffer format, @NativeType("SDL_Palette const *") SDL_Palette.@Nullable Buffer palette, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        if (CHECKS) {
            check(format, 1);
            checkSafe(palette, 1);
        }
        return nSDL_MapRGB(format.address(), memAddressSafe(palette), r, g, b);
    }

    // --- [ SDL_MapRGBA ] ---

    /** {@code Uint32 SDL_MapRGBA(SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    public static int nSDL_MapRGBA(long format, long palette, byte r, byte g, byte b, byte a) {
        long __functionAddress = Functions.MapRGBA;
        if (CHECKS) {
            if (palette != NULL) { Struct.validate(palette, 1, SDL_Palette.SIZEOF, SDL_Palette::validate); }
        }
        return invokePPUUUUI(format, palette, r, g, b, a, __functionAddress);
    }

    /** {@code Uint32 SDL_MapRGBA(SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    @NativeType("Uint32")
    public static int SDL_MapRGBA(@NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails.Buffer format, @NativeType("SDL_Palette const *") SDL_Palette.@Nullable Buffer palette, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        if (CHECKS) {
            check(format, 1);
            checkSafe(palette, 1);
        }
        return nSDL_MapRGBA(format.address(), memAddressSafe(palette), r, g, b, a);
    }

    // --- [ SDL_GetRGB ] ---

    /** {@code void SDL_GetRGB(Uint32 pixel, SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 * r, Uint8 * g, Uint8 * b)} */
    public static void nSDL_GetRGB(int pixel, long format, long palette, long r, long g, long b) {
        long __functionAddress = Functions.GetRGB;
        if (CHECKS) {
            if (palette != NULL) { Struct.validate(palette, 1, SDL_Palette.SIZEOF, SDL_Palette::validate); }
        }
        invokePPPPPV(pixel, format, palette, r, g, b, __functionAddress);
    }

    /** {@code void SDL_GetRGB(Uint32 pixel, SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 * r, Uint8 * g, Uint8 * b)} */
    public static void SDL_GetRGB(@NativeType("Uint32") int pixel, @NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails.Buffer format, @NativeType("SDL_Palette const *") SDL_Palette.@Nullable Buffer palette, @NativeType("Uint8 *") @Nullable ByteBuffer r, @NativeType("Uint8 *") @Nullable ByteBuffer g, @NativeType("Uint8 *") @Nullable ByteBuffer b) {
        if (CHECKS) {
            check(format, 1);
            checkSafe(palette, 1);
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
        }
        nSDL_GetRGB(pixel, format.address(), memAddressSafe(palette), memAddressSafe(r), memAddressSafe(g), memAddressSafe(b));
    }

    // --- [ SDL_GetRGBA ] ---

    /** {@code void SDL_GetRGBA(Uint32 pixel, SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    public static void nSDL_GetRGBA(int pixel, long format, long palette, long r, long g, long b, long a) {
        long __functionAddress = Functions.GetRGBA;
        if (CHECKS) {
            if (palette != NULL) { Struct.validate(palette, 1, SDL_Palette.SIZEOF, SDL_Palette::validate); }
        }
        invokePPPPPPV(pixel, format, palette, r, g, b, a, __functionAddress);
    }

    /** {@code void SDL_GetRGBA(Uint32 pixel, SDL_PixelFormatDetails const * format, SDL_Palette const * palette, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    public static void SDL_GetRGBA(@NativeType("Uint32") int pixel, @NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails.Buffer format, @NativeType("SDL_Palette const *") SDL_Palette.@Nullable Buffer palette, @NativeType("Uint8 *") @Nullable ByteBuffer r, @NativeType("Uint8 *") @Nullable ByteBuffer g, @NativeType("Uint8 *") @Nullable ByteBuffer b, @NativeType("Uint8 *") @Nullable ByteBuffer a) {
        if (CHECKS) {
            check(format, 1);
            checkSafe(palette, 1);
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
            checkSafe(a, 1);
        }
        nSDL_GetRGBA(pixel, format.address(), memAddressSafe(palette), memAddressSafe(r), memAddressSafe(g), memAddressSafe(b), memAddressSafe(a));
    }

    // --- [ SDL_DEFINE_PIXELFOURCC ] ---

    /** {@code uint32_t SDL_DEFINE_PIXELFOURCC(uint8_t A, uint8_t B, uint8_t C, uint8_t D)} */
    @NativeType("uint32_t")
    public static int SDL_DEFINE_PIXELFOURCC(@NativeType("uint8_t") byte A, @NativeType("uint8_t") byte B, @NativeType("uint8_t") byte C, @NativeType("uint8_t") byte D) {
        return SDL_FOURCC(A, B, C, D);
    }

    // --- [ SDL_DEFINE_PIXELFORMAT ] ---

    /** {@code SDL_PixelFormat SDL_DEFINE_PIXELFORMAT(SDL_PixelType type, SDL_BitmapOrder order, SDL_PackedLayout layout, uint32_t bits, uint32_t bytes)} */
    @NativeType("SDL_PixelFormat")
    public static int SDL_DEFINE_PIXELFORMAT(@NativeType("SDL_PixelType") int type, @NativeType("SDL_BitmapOrder") int order, @NativeType("SDL_PackedLayout") int layout, @NativeType("uint32_t") int bits, @NativeType("uint32_t") int bytes) {
        return ((1 << 28) | ((type) << 24) | ((order) << 20) | ((layout) << 16) | ((bits) << 8) | ((bytes) << 0));
    }

    // --- [ SDL_PIXELFLAG ] ---

    /** {@code uint32_t SDL_PIXELFLAG(SDL_PixelFormat format)} */
    @NativeType("uint32_t")
    public static int SDL_PIXELFLAG(@NativeType("SDL_PixelFormat") int format) {
        return (((format) >> 28) & 0x0F);
    }

    // --- [ SDL_PIXELTYPE ] ---

    /** {@code SDL_PixelType SDL_PIXELTYPE(SDL_PixelFormat format)} */
    @NativeType("SDL_PixelType")
    public static int SDL_PIXELTYPE(@NativeType("SDL_PixelFormat") int format) {
        return (((format) >> 24) & 0x0F);
    }

    // --- [ SDL_PIXELORDER ] ---

    /** {@code SDL_BitmapOrder SDL_PIXELORDER(SDL_PixelFormat format)} */
    @NativeType("SDL_BitmapOrder")
    public static int SDL_PIXELORDER(@NativeType("SDL_PixelFormat") int format) {
        return (((format) >> 20) & 0x0F);
    }

    // --- [ SDL_PIXELLAYOUT ] ---

    /** {@code SDL_PackedLayout SDL_PIXELLAYOUT(SDL_PixelFormat format)} */
    @NativeType("SDL_PackedLayout")
    public static int SDL_PIXELLAYOUT(@NativeType("SDL_PixelFormat") int format) {
        return (((format) >> 16) & 0x0F);
    }

    // --- [ SDL_BITSPERPIXEL ] ---

    /** {@code uint32_t SDL_BITSPERPIXEL(SDL_PixelFormat format)} */
    @NativeType("uint32_t")
    public static int SDL_BITSPERPIXEL(@NativeType("SDL_PixelFormat") int format) {
        return (SDL_ISPIXELFORMAT_FOURCC(format) ? 0 : (((format) >> 8) & 0xFF));
    }

    // --- [ SDL_BYTESPERPIXEL ] ---

    /** {@code uint32_t SDL_BYTESPERPIXEL(SDL_PixelFormat format)} */
    @NativeType("uint32_t")
    public static int SDL_BYTESPERPIXEL(@NativeType("SDL_PixelFormat") int format) {
        return (SDL_ISPIXELFORMAT_FOURCC(format) ? ((((format) == SDL_PIXELFORMAT_YUY2) || ((format) == SDL_PIXELFORMAT_UYVY) || ((format) == SDL_PIXELFORMAT_YVYU) || ((format) == SDL_PIXELFORMAT_P010)) ? 2 : 1) : (((format) >> 0) & 0xFF));
    }

    // --- [ SDL_ISPIXELFORMAT_INDEXED ] ---

    /** {@code bool SDL_ISPIXELFORMAT_INDEXED(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_INDEXED(@NativeType("SDL_PixelFormat") int format) {
        return (!SDL_ISPIXELFORMAT_FOURCC(format) && 
     ((SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX1) || 
      (SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX2) || 
      (SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX4) || 
      (SDL_PIXELTYPE(format) == SDL_PIXELTYPE_INDEX8)));
    }

    // --- [ SDL_ISPIXELFORMAT_PACKED ] ---

    /** {@code bool SDL_ISPIXELFORMAT_PACKED(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_PACKED(@NativeType("SDL_PixelFormat") int format) {
        return (!SDL_ISPIXELFORMAT_FOURCC(format) && 
     ((SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED8) || 
      (SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED16) || 
      (SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED32)));
    }

    // --- [ SDL_ISPIXELFORMAT_ARRAY ] ---

    /** {@code bool SDL_ISPIXELFORMAT_ARRAY(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_ARRAY(@NativeType("SDL_PixelFormat") int format) {
        return (!SDL_ISPIXELFORMAT_FOURCC(format) && 
     ((SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYU8) || 
      (SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYU16) || 
      (SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYU32) || 
      (SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF16) || 
      (SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF32)));
    }

    // --- [ SDL_ISPIXELFORMAT_10BIT ] ---

    /** {@code bool SDL_ISPIXELFORMAT_10BIT(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_10BIT(@NativeType("SDL_PixelFormat") int format) {
        return (!SDL_ISPIXELFORMAT_FOURCC(format) && 
       ((SDL_PIXELTYPE(format) == SDL_PIXELTYPE_PACKED32) && 
        (SDL_PIXELLAYOUT(format) == SDL_PACKEDLAYOUT_2101010)));
    }

    // --- [ SDL_ISPIXELFORMAT_FLOAT ] ---

    /** {@code bool SDL_ISPIXELFORMAT_FLOAT(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_FLOAT(@NativeType("SDL_PixelFormat") int format) {
        return (!SDL_ISPIXELFORMAT_FOURCC(format) && 
       ((SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF16) || 
        (SDL_PIXELTYPE(format) == SDL_PIXELTYPE_ARRAYF32)));
    }

    // --- [ SDL_ISPIXELFORMAT_ALPHA ] ---

    /** {@code bool SDL_ISPIXELFORMAT_ALPHA(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_ALPHA(@NativeType("SDL_PixelFormat") int format) {
        return ((SDL_ISPIXELFORMAT_PACKED(format) && 
      ((SDL_PIXELORDER(format) == SDL_PACKEDORDER_ARGB) || 
       (SDL_PIXELORDER(format) == SDL_PACKEDORDER_RGBA) || 
       (SDL_PIXELORDER(format) == SDL_PACKEDORDER_ABGR) || 
       (SDL_PIXELORDER(format) == SDL_PACKEDORDER_BGRA))) || 
     (SDL_ISPIXELFORMAT_ARRAY(format) && 
      ((SDL_PIXELORDER(format) == SDL_ARRAYORDER_ARGB) || 
       (SDL_PIXELORDER(format) == SDL_ARRAYORDER_RGBA) || 
       (SDL_PIXELORDER(format) == SDL_ARRAYORDER_ABGR) || 
       (SDL_PIXELORDER(format) == SDL_ARRAYORDER_BGRA))));
    }

    // --- [ SDL_ISPIXELFORMAT_FOURCC ] ---

    /** {@code bool SDL_ISPIXELFORMAT_FOURCC(SDL_PixelFormat format)} */
    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_FOURCC(@NativeType("SDL_PixelFormat") int format) {
        return ((format != 0) && (SDL_PIXELFLAG(format) != 1));
    }

    // --- [ SDL_DEFINE_COLORSPACE ] ---

    /** {@code SDL_Colorspace SDL_DEFINE_COLORSPACE(SDL_ColorType type, SDL_ColorRange range, SDL_ColorPrimaries primaries, SDL_TransferCharacteristics transfer, SDL_MatrixCoefficients matrix, SDL_ChromaLocation chroma)} */
    @NativeType("SDL_Colorspace")
    public static int SDL_DEFINE_COLORSPACE(@NativeType("SDL_ColorType") int type, @NativeType("SDL_ColorRange") int range, @NativeType("SDL_ColorPrimaries") int primaries, @NativeType("SDL_TransferCharacteristics") int transfer, @NativeType("SDL_MatrixCoefficients") int matrix, @NativeType("SDL_ChromaLocation") int chroma) {
        return (((type) << 28) | ((range) << 24) | ((chroma) << 20) | ((primaries) << 10) | ((transfer) << 5) | ((matrix) << 0));
    }

    // --- [ SDL_COLORSPACETYPE ] ---

    /** {@code SDL_ColorType SDL_COLORSPACETYPE(SDL_Colorspace cspace)} */
    @NativeType("SDL_ColorType")
    public static int SDL_COLORSPACETYPE(@NativeType("SDL_Colorspace") int cspace) {
        return (((cspace) >> 28) & 0x0F);
    }

    // --- [ SDL_COLORSPACERANGE ] ---

    /** {@code SDL_ColorRange SDL_COLORSPACERANGE(SDL_Colorspace cspace)} */
    @NativeType("SDL_ColorRange")
    public static int SDL_COLORSPACERANGE(@NativeType("SDL_Colorspace") int cspace) {
        return (((cspace) >> 24) & 0x0F);
    }

    // --- [ SDL_COLORSPACECHROMA ] ---

    /** {@code SDL_ChromaLocation SDL_COLORSPACECHROMA(SDL_Colorspace cspace)} */
    @NativeType("SDL_ChromaLocation")
    public static int SDL_COLORSPACECHROMA(@NativeType("SDL_Colorspace") int cspace) {
        return (((cspace) >> 20) & 0x0F);
    }

    // --- [ SDL_COLORSPACEPRIMARIES ] ---

    /** {@code SDL_ColorPrimaries SDL_COLORSPACEPRIMARIES(SDL_Colorspace cspace)} */
    @NativeType("SDL_ColorPrimaries")
    public static int SDL_COLORSPACEPRIMARIES(@NativeType("SDL_Colorspace") int cspace) {
        return (((cspace) >> 10) & 0x1F);
    }

    // --- [ SDL_COLORSPACETRANSFER ] ---

    /** {@code SDL_TransferCharacteristics SDL_COLORSPACETRANSFER(SDL_Colorspace cspace)} */
    @NativeType("SDL_TransferCharacteristics")
    public static int SDL_COLORSPACETRANSFER(@NativeType("SDL_Colorspace") int cspace) {
        return (((cspace) >> 5) & 0x1F);
    }

    // --- [ SDL_COLORSPACEMATRIX ] ---

    /** {@code SDL_MatrixCoefficients SDL_COLORSPACEMATRIX(SDL_Colorspace cspace)} */
    @NativeType("SDL_MatrixCoefficients")
    public static int SDL_COLORSPACEMATRIX(@NativeType("SDL_Colorspace") int cspace) {
        return ((cspace) & 0x1F);
    }

    // --- [ SDL_ISCOLORSPACE_MATRIX_BT601 ] ---

    /** {@code bool SDL_ISCOLORSPACE_MATRIX_BT601(SDL_Colorspace cspace)} */
    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_MATRIX_BT601(@NativeType("SDL_Colorspace") int cspace) {
        return (SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT601 || SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT470BG);
    }

    // --- [ SDL_ISCOLORSPACE_MATRIX_BT709 ] ---

    /** {@code bool SDL_ISCOLORSPACE_MATRIX_BT709(SDL_Colorspace cspace)} */
    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_MATRIX_BT709(@NativeType("SDL_Colorspace") int cspace) {
        return (SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT709);
    }

    // --- [ SDL_ISCOLORSPACE_MATRIX_BT2020_NCL ] ---

    /** {@code bool SDL_ISCOLORSPACE_MATRIX_BT2020_NCL(SDL_Colorspace cspace)} */
    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_MATRIX_BT2020_NCL(@NativeType("SDL_Colorspace") int cspace) {
        return (SDL_COLORSPACEMATRIX(cspace) == SDL_MATRIX_COEFFICIENTS_BT2020_NCL);
    }

    // --- [ SDL_ISCOLORSPACE_LIMITED_RANGE ] ---

    /** {@code bool SDL_ISCOLORSPACE_LIMITED_RANGE(SDL_Colorspace cspace)} */
    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_LIMITED_RANGE(@NativeType("SDL_Colorspace") int cspace) {
        return (SDL_COLORSPACERANGE(cspace) != SDL_COLOR_RANGE_FULL);
    }

    // --- [ SDL_ISCOLORSPACE_FULL_RANGE ] ---

    /** {@code bool SDL_ISCOLORSPACE_FULL_RANGE(SDL_Colorspace cspace)} */
    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_FULL_RANGE(@NativeType("SDL_Colorspace") int cspace) {
        return (SDL_COLORSPACERANGE(cspace) == SDL_COLOR_RANGE_FULL);
    }

    // --- [ SDL_GetPlatform ] ---

    /** {@code char const * SDL_GetPlatform(void)} */
    public static long nSDL_GetPlatform() {
        long __functionAddress = Functions.GetPlatform;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetPlatform(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetPlatform() {
        long __result = nSDL_GetPlatform();
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetPowerInfo ] ---

    /** {@code SDL_PowerState SDL_GetPowerInfo(int * seconds, int * percent)} */
    public static int nSDL_GetPowerInfo(long seconds, long percent) {
        long __functionAddress = Functions.GetPowerInfo;
        return invokePPI(seconds, percent, __functionAddress);
    }

    /** {@code SDL_PowerState SDL_GetPowerInfo(int * seconds, int * percent)} */
    @NativeType("SDL_PowerState")
    public static int SDL_GetPowerInfo(@NativeType("int *") @Nullable IntBuffer seconds, @NativeType("int *") @Nullable IntBuffer percent) {
        if (CHECKS) {
            checkSafe(seconds, 1);
            checkSafe(percent, 1);
        }
        return nSDL_GetPowerInfo(memAddressSafe(seconds), memAddressSafe(percent));
    }

    // --- [ SDL_GetGlobalProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetGlobalProperties(void)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetGlobalProperties() {
        long __functionAddress = Functions.GetGlobalProperties;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_CreateProperties ] ---

    /** {@code SDL_PropertiesID SDL_CreateProperties(void)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_CreateProperties() {
        long __functionAddress = Functions.CreateProperties;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_CopyProperties ] ---

    /** {@code bool SDL_CopyProperties(SDL_PropertiesID src, SDL_PropertiesID dst)} */
    @NativeType("bool")
    public static boolean SDL_CopyProperties(@NativeType("SDL_PropertiesID") int src, @NativeType("SDL_PropertiesID") int dst) {
        long __functionAddress = Functions.CopyProperties;
        return invokeZ(src, dst, __functionAddress);
    }

    // --- [ SDL_LockProperties ] ---

    /** {@code bool SDL_LockProperties(SDL_PropertiesID props)} */
    @NativeType("bool")
    public static boolean SDL_LockProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.LockProperties;
        return invokeZ(props, __functionAddress);
    }

    // --- [ SDL_UnlockProperties ] ---

    /** {@code void SDL_UnlockProperties(SDL_PropertiesID props)} */
    public static void SDL_UnlockProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.UnlockProperties;
        invokeV(props, __functionAddress);
    }

    // --- [ SDL_SetPointerPropertyWithCleanup ] ---

    /** {@code bool SDL_SetPointerPropertyWithCleanup(SDL_PropertiesID props, char const * name, void * value, SDL_CleanupPropertyCallback cleanup, void * userdata)} */
    public static boolean nSDL_SetPointerPropertyWithCleanup(int props, long name, long value, long cleanup, long userdata) {
        long __functionAddress = Functions.SetPointerPropertyWithCleanup;
        return invokePPPPZ(props, name, value, cleanup, userdata, __functionAddress);
    }

    /** {@code bool SDL_SetPointerPropertyWithCleanup(SDL_PropertiesID props, char const * name, void * value, SDL_CleanupPropertyCallback cleanup, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_SetPointerPropertyWithCleanup(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("void *") long value, @NativeType("SDL_CleanupPropertyCallback") SDL_CleanupPropertyCallbackI cleanup, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetPointerPropertyWithCleanup(props, memAddress(name), value, cleanup.address(), userdata);
    }

    /** {@code bool SDL_SetPointerPropertyWithCleanup(SDL_PropertiesID props, char const * name, void * value, SDL_CleanupPropertyCallback cleanup, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_SetPointerPropertyWithCleanup(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("void *") long value, @NativeType("SDL_CleanupPropertyCallback") SDL_CleanupPropertyCallbackI cleanup, @NativeType("void *") long userdata) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_SetPointerPropertyWithCleanup(props, nameEncoded, value, cleanup.address(), userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetPointerProperty ] ---

    /** {@code bool SDL_SetPointerProperty(SDL_PropertiesID props, char const * name, void * value)} */
    public static boolean nSDL_SetPointerProperty(int props, long name, long value) {
        long __functionAddress = Functions.SetPointerProperty;
        return invokePPZ(props, name, value, __functionAddress);
    }

    /** {@code bool SDL_SetPointerProperty(SDL_PropertiesID props, char const * name, void * value)} */
    @NativeType("bool")
    public static boolean SDL_SetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("void *") long value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetPointerProperty(props, memAddress(name), value);
    }

    /** {@code bool SDL_SetPointerProperty(SDL_PropertiesID props, char const * name, void * value)} */
    @NativeType("bool")
    public static boolean SDL_SetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("void *") long value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_SetPointerProperty(props, nameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetStringProperty ] ---

    /** {@code bool SDL_SetStringProperty(SDL_PropertiesID props, char const * name, char const * value)} */
    public static boolean nSDL_SetStringProperty(int props, long name, long value) {
        long __functionAddress = Functions.SetStringProperty;
        return invokePPZ(props, name, value, __functionAddress);
    }

    /** {@code bool SDL_SetStringProperty(SDL_PropertiesID props, char const * name, char const * value)} */
    @NativeType("bool")
    public static boolean SDL_SetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(value);
        }
        return nSDL_SetStringProperty(props, memAddress(name), memAddress(value));
    }

    /** {@code bool SDL_SetStringProperty(SDL_PropertiesID props, char const * name, char const * value)} */
    @NativeType("bool")
    public static boolean SDL_SetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(value, true);
            long valueEncoded = stack.getPointerAddress();
            return nSDL_SetStringProperty(props, nameEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetNumberProperty ] ---

    /** {@code bool SDL_SetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 value)} */
    public static boolean nSDL_SetNumberProperty(int props, long name, long value) {
        long __functionAddress = Functions.SetNumberProperty;
        return invokePJZ(props, name, value, __functionAddress);
    }

    /** {@code bool SDL_SetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 value)} */
    @NativeType("bool")
    public static boolean SDL_SetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("Sint64") long value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetNumberProperty(props, memAddress(name), value);
    }

    /** {@code bool SDL_SetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 value)} */
    @NativeType("bool")
    public static boolean SDL_SetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("Sint64") long value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_SetNumberProperty(props, nameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetFloatProperty ] ---

    /** {@code bool SDL_SetFloatProperty(SDL_PropertiesID props, char const * name, float value)} */
    public static boolean nSDL_SetFloatProperty(int props, long name, float value) {
        long __functionAddress = Functions.SetFloatProperty;
        return invokePZ(props, name, value, __functionAddress);
    }

    /** {@code bool SDL_SetFloatProperty(SDL_PropertiesID props, char const * name, float value)} */
    @NativeType("bool")
    public static boolean SDL_SetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, float value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetFloatProperty(props, memAddress(name), value);
    }

    /** {@code bool SDL_SetFloatProperty(SDL_PropertiesID props, char const * name, float value)} */
    @NativeType("bool")
    public static boolean SDL_SetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, float value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_SetFloatProperty(props, nameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetBooleanProperty ] ---

    /** {@code bool SDL_SetBooleanProperty(SDL_PropertiesID props, char const * name, bool value)} */
    public static boolean nSDL_SetBooleanProperty(int props, long name, boolean value) {
        long __functionAddress = Functions.SetBooleanProperty;
        return invokePZ(props, name, value, __functionAddress);
    }

    /** {@code bool SDL_SetBooleanProperty(SDL_PropertiesID props, char const * name, bool value)} */
    @NativeType("bool")
    public static boolean SDL_SetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("bool") boolean value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetBooleanProperty(props, memAddress(name), value);
    }

    /** {@code bool SDL_SetBooleanProperty(SDL_PropertiesID props, char const * name, bool value)} */
    @NativeType("bool")
    public static boolean SDL_SetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("bool") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_SetBooleanProperty(props, nameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_HasProperty ] ---

    /** {@code bool SDL_HasProperty(SDL_PropertiesID props, char const * name)} */
    public static boolean nSDL_HasProperty(int props, long name) {
        long __functionAddress = Functions.HasProperty;
        return invokePZ(props, name, __functionAddress);
    }

    /** {@code bool SDL_HasProperty(SDL_PropertiesID props, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_HasProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_HasProperty(props, memAddress(name));
    }

    /** {@code bool SDL_HasProperty(SDL_PropertiesID props, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_HasProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_HasProperty(props, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetPropertyType ] ---

    /** {@code SDL_PropertyType SDL_GetPropertyType(SDL_PropertiesID props, char const * name)} */
    public static int nSDL_GetPropertyType(int props, long name) {
        long __functionAddress = Functions.GetPropertyType;
        return invokePI(props, name, __functionAddress);
    }

    /** {@code SDL_PropertyType SDL_GetPropertyType(SDL_PropertiesID props, char const * name)} */
    @NativeType("SDL_PropertyType")
    public static int SDL_GetPropertyType(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetPropertyType(props, memAddress(name));
    }

    /** {@code SDL_PropertyType SDL_GetPropertyType(SDL_PropertiesID props, char const * name)} */
    @NativeType("SDL_PropertyType")
    public static int SDL_GetPropertyType(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetPropertyType(props, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetPointerProperty ] ---

    /** {@code void * SDL_GetPointerProperty(SDL_PropertiesID props, char const * name, void * default_value)} */
    public static long nSDL_GetPointerProperty(int props, long name, long default_value) {
        long __functionAddress = Functions.GetPointerProperty;
        return invokePPP(props, name, default_value, __functionAddress);
    }

    /** {@code void * SDL_GetPointerProperty(SDL_PropertiesID props, char const * name, void * default_value)} */
    @NativeType("void *")
    public static long SDL_GetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("void *") long default_value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetPointerProperty(props, memAddress(name), default_value);
    }

    /** {@code void * SDL_GetPointerProperty(SDL_PropertiesID props, char const * name, void * default_value)} */
    @NativeType("void *")
    public static long SDL_GetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("void *") long default_value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetPointerProperty(props, nameEncoded, default_value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetStringProperty ] ---

    /** {@code char const * SDL_GetStringProperty(SDL_PropertiesID props, char const * name, char const * default_value)} */
    public static long nSDL_GetStringProperty(int props, long name, long default_value) {
        long __functionAddress = Functions.GetStringProperty;
        return invokePPP(props, name, default_value, __functionAddress);
    }

    /** {@code char const * SDL_GetStringProperty(SDL_PropertiesID props, char const * name, char const * default_value)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") @Nullable ByteBuffer default_value) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1Safe(default_value);
        }
        long __result = nSDL_GetStringProperty(props, memAddress(name), memAddressSafe(default_value));
        return memUTF8Safe(__result);
    }

    /** {@code char const * SDL_GetStringProperty(SDL_PropertiesID props, char const * name, char const * default_value)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("char const *") @Nullable CharSequence default_value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(default_value, true);
            long default_valueEncoded = default_value == null ? NULL : stack.getPointerAddress();
            long __result = nSDL_GetStringProperty(props, nameEncoded, default_valueEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetNumberProperty ] ---

    /** {@code Sint64 SDL_GetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 default_value)} */
    public static long nSDL_GetNumberProperty(int props, long name, long default_value) {
        long __functionAddress = Functions.GetNumberProperty;
        return invokePJJ(props, name, default_value, __functionAddress);
    }

    /** {@code Sint64 SDL_GetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 default_value)} */
    @NativeType("Sint64")
    public static long SDL_GetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("Sint64") long default_value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetNumberProperty(props, memAddress(name), default_value);
    }

    /** {@code Sint64 SDL_GetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 default_value)} */
    @NativeType("Sint64")
    public static long SDL_GetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("Sint64") long default_value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetNumberProperty(props, nameEncoded, default_value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetFloatProperty ] ---

    /** {@code float SDL_GetFloatProperty(SDL_PropertiesID props, char const * name, float default_value)} */
    public static float nSDL_GetFloatProperty(int props, long name, float default_value) {
        long __functionAddress = Functions.GetFloatProperty;
        return invokePF(props, name, default_value, __functionAddress);
    }

    /** {@code float SDL_GetFloatProperty(SDL_PropertiesID props, char const * name, float default_value)} */
    public static float SDL_GetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, float default_value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetFloatProperty(props, memAddress(name), default_value);
    }

    /** {@code float SDL_GetFloatProperty(SDL_PropertiesID props, char const * name, float default_value)} */
    public static float SDL_GetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, float default_value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetFloatProperty(props, nameEncoded, default_value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetBooleanProperty ] ---

    /** {@code bool SDL_GetBooleanProperty(SDL_PropertiesID props, char const * name, bool default_value)} */
    public static boolean nSDL_GetBooleanProperty(int props, long name, boolean default_value) {
        long __functionAddress = Functions.GetBooleanProperty;
        return invokePZ(props, name, default_value, __functionAddress);
    }

    /** {@code bool SDL_GetBooleanProperty(SDL_PropertiesID props, char const * name, bool default_value)} */
    @NativeType("bool")
    public static boolean SDL_GetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("bool") boolean default_value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetBooleanProperty(props, memAddress(name), default_value);
    }

    /** {@code bool SDL_GetBooleanProperty(SDL_PropertiesID props, char const * name, bool default_value)} */
    @NativeType("bool")
    public static boolean SDL_GetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("bool") boolean default_value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetBooleanProperty(props, nameEncoded, default_value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ClearProperty ] ---

    /** {@code bool SDL_ClearProperty(SDL_PropertiesID props, char const * name)} */
    public static boolean nSDL_ClearProperty(int props, long name) {
        long __functionAddress = Functions.ClearProperty;
        return invokePZ(props, name, __functionAddress);
    }

    /** {@code bool SDL_ClearProperty(SDL_PropertiesID props, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_ClearProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_ClearProperty(props, memAddress(name));
    }

    /** {@code bool SDL_ClearProperty(SDL_PropertiesID props, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_ClearProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_ClearProperty(props, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_EnumerateProperties ] ---

    /** {@code bool SDL_EnumerateProperties(SDL_PropertiesID props, SDL_EnumeratePropertiesCallback callback, void * userdata)} */
    public static boolean nSDL_EnumerateProperties(int props, long callback, long userdata) {
        long __functionAddress = Functions.EnumerateProperties;
        return invokePPZ(props, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_EnumerateProperties(SDL_PropertiesID props, SDL_EnumeratePropertiesCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_EnumerateProperties(@NativeType("SDL_PropertiesID") int props, @NativeType("SDL_EnumeratePropertiesCallback") SDL_EnumeratePropertiesCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_EnumerateProperties(props, callback.address(), userdata);
    }

    // --- [ SDL_DestroyProperties ] ---

    /** {@code void SDL_DestroyProperties(SDL_PropertiesID props)} */
    public static void SDL_DestroyProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.DestroyProperties;
        invokeV(props, __functionAddress);
    }

    // --- [ SDL_HasRectIntersection ] ---

    /** {@code bool SDL_HasRectIntersection(SDL_Rect const * A, SDL_Rect const * B)} */
    public static boolean nSDL_HasRectIntersection(long A, long B) {
        long __functionAddress = Functions.HasRectIntersection;
        return invokePPZ(A, B, __functionAddress);
    }

    /** {@code bool SDL_HasRectIntersection(SDL_Rect const * A, SDL_Rect const * B)} */
    @NativeType("bool")
    public static boolean SDL_HasRectIntersection(@NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer A, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer B) {
        if (CHECKS) {
            checkSafe(A, 1);
            checkSafe(B, 1);
        }
        return nSDL_HasRectIntersection(memAddressSafe(A), memAddressSafe(B));
    }

    // --- [ SDL_GetRectIntersection ] ---

    /** {@code bool SDL_GetRectIntersection(SDL_Rect const * A, SDL_Rect const * B, SDL_Rect * result)} */
    public static boolean nSDL_GetRectIntersection(long A, long B, long result) {
        long __functionAddress = Functions.GetRectIntersection;
        return invokePPPZ(A, B, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectIntersection(SDL_Rect const * A, SDL_Rect const * B, SDL_Rect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectIntersection(@NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer A, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer B, @NativeType("SDL_Rect *") SDL_Rect.@Nullable Buffer result) {
        if (CHECKS) {
            checkSafe(A, 1);
            checkSafe(B, 1);
            checkSafe(result, 1);
        }
        return nSDL_GetRectIntersection(memAddressSafe(A), memAddressSafe(B), memAddressSafe(result));
    }

    // --- [ SDL_GetRectUnion ] ---

    /** {@code bool SDL_GetRectUnion(SDL_Rect const * A, SDL_Rect const * B, SDL_Rect * result)} */
    public static boolean nSDL_GetRectUnion(long A, long B, long result) {
        long __functionAddress = Functions.GetRectUnion;
        return invokePPPZ(A, B, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectUnion(SDL_Rect const * A, SDL_Rect const * B, SDL_Rect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectUnion(@NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer A, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer B, @NativeType("SDL_Rect *") SDL_Rect.@Nullable Buffer result) {
        if (CHECKS) {
            checkSafe(A, 1);
            checkSafe(B, 1);
            checkSafe(result, 1);
        }
        return nSDL_GetRectUnion(memAddressSafe(A), memAddressSafe(B), memAddressSafe(result));
    }

    // --- [ SDL_GetRectEnclosingPoints ] ---

    /** {@code bool SDL_GetRectEnclosingPoints(SDL_Point const * points, int count, SDL_Rect const * clip, SDL_Rect * result)} */
    public static boolean nSDL_GetRectEnclosingPoints(long points, int count, long clip, long result) {
        long __functionAddress = Functions.GetRectEnclosingPoints;
        return invokePPPZ(points, count, clip, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectEnclosingPoints(SDL_Point const * points, int count, SDL_Rect const * clip, SDL_Rect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectEnclosingPoints(@NativeType("SDL_Point const *") SDL_Point.Buffer points, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer clip, @NativeType("SDL_Rect *") SDL_Rect.Buffer result) {
        if (CHECKS) {
            checkSafe(clip, 1);
            check(result, 1);
        }
        return nSDL_GetRectEnclosingPoints(points.address(), points.remaining(), memAddressSafe(clip), result.address());
    }

    // --- [ SDL_GetRectAndLineIntersection ] ---

    /** {@code bool SDL_GetRectAndLineIntersection(SDL_Rect const * rect, int * X1, int * Y1, int * X2, int * Y2)} */
    public static boolean nSDL_GetRectAndLineIntersection(long rect, long X1, long Y1, long X2, long Y2) {
        long __functionAddress = Functions.GetRectAndLineIntersection;
        return invokePPPPPZ(rect, X1, Y1, X2, Y2, __functionAddress);
    }

    /** {@code bool SDL_GetRectAndLineIntersection(SDL_Rect const * rect, int * X1, int * Y1, int * X2, int * Y2)} */
    @NativeType("bool")
    public static boolean SDL_GetRectAndLineIntersection(@NativeType("SDL_Rect const *") SDL_Rect.Buffer rect, @NativeType("int *") IntBuffer X1, @NativeType("int *") IntBuffer Y1, @NativeType("int *") IntBuffer X2, @NativeType("int *") IntBuffer Y2) {
        if (CHECKS) {
            check(rect, 1);
            check(X1, 1);
            check(Y1, 1);
            check(X2, 1);
            check(Y2, 1);
        }
        return nSDL_GetRectAndLineIntersection(rect.address(), memAddress(X1), memAddress(Y1), memAddress(X2), memAddress(Y2));
    }

    // --- [ SDL_HasRectIntersectionFloat ] ---

    /** {@code bool SDL_HasRectIntersectionFloat(SDL_FRect const * A, SDL_FRect const * B)} */
    public static boolean nSDL_HasRectIntersectionFloat(long A, long B) {
        long __functionAddress = Functions.HasRectIntersectionFloat;
        return invokePPZ(A, B, __functionAddress);
    }

    /** {@code bool SDL_HasRectIntersectionFloat(SDL_FRect const * A, SDL_FRect const * B)} */
    @NativeType("bool")
    public static boolean SDL_HasRectIntersectionFloat(@NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer A, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer B) {
        if (CHECKS) {
            checkSafe(A, 1);
            checkSafe(B, 1);
        }
        return nSDL_HasRectIntersectionFloat(memAddressSafe(A), memAddressSafe(B));
    }

    // --- [ SDL_GetRectIntersectionFloat ] ---

    /** {@code bool SDL_GetRectIntersectionFloat(SDL_FRect const * A, SDL_FRect const * B, SDL_FRect * result)} */
    public static boolean nSDL_GetRectIntersectionFloat(long A, long B, long result) {
        long __functionAddress = Functions.GetRectIntersectionFloat;
        return invokePPPZ(A, B, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectIntersectionFloat(SDL_FRect const * A, SDL_FRect const * B, SDL_FRect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectIntersectionFloat(@NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer A, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer B, @NativeType("SDL_FRect *") SDL_FRect.@Nullable Buffer result) {
        if (CHECKS) {
            checkSafe(A, 1);
            checkSafe(B, 1);
            checkSafe(result, 1);
        }
        return nSDL_GetRectIntersectionFloat(memAddressSafe(A), memAddressSafe(B), memAddressSafe(result));
    }

    // --- [ SDL_GetRectUnionFloat ] ---

    /** {@code bool SDL_GetRectUnionFloat(SDL_FRect const * A, SDL_FRect const * B, SDL_FRect * result)} */
    public static boolean nSDL_GetRectUnionFloat(long A, long B, long result) {
        long __functionAddress = Functions.GetRectUnionFloat;
        return invokePPPZ(A, B, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectUnionFloat(SDL_FRect const * A, SDL_FRect const * B, SDL_FRect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectUnionFloat(@NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer A, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer B, @NativeType("SDL_FRect *") SDL_FRect.Buffer result) {
        if (CHECKS) {
            checkSafe(A, 1);
            checkSafe(B, 1);
            check(result, 1);
        }
        return nSDL_GetRectUnionFloat(memAddressSafe(A), memAddressSafe(B), result.address());
    }

    // --- [ SDL_GetRectEnclosingPointsFloat ] ---

    /** {@code bool SDL_GetRectEnclosingPointsFloat(SDL_FPoint const * points, int count, SDL_FRect const * clip, SDL_FRect * result)} */
    public static boolean nSDL_GetRectEnclosingPointsFloat(long points, int count, long clip, long result) {
        long __functionAddress = Functions.GetRectEnclosingPointsFloat;
        return invokePPPZ(points, count, clip, result, __functionAddress);
    }

    /** {@code bool SDL_GetRectEnclosingPointsFloat(SDL_FPoint const * points, int count, SDL_FRect const * clip, SDL_FRect * result)} */
    @NativeType("bool")
    public static boolean SDL_GetRectEnclosingPointsFloat(@NativeType("SDL_FPoint const *") SDL_FPoint.Buffer points, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer clip, @NativeType("SDL_FRect *") SDL_FRect.Buffer result) {
        if (CHECKS) {
            checkSafe(clip, 1);
            check(result, 1);
        }
        return nSDL_GetRectEnclosingPointsFloat(points.address(), points.remaining(), memAddressSafe(clip), result.address());
    }

    // --- [ SDL_GetRectAndLineIntersectionFloat ] ---

    /** {@code bool SDL_GetRectAndLineIntersectionFloat(SDL_FRect const * rect, float * X1, float * Y1, float * X2, float * Y2)} */
    public static boolean nSDL_GetRectAndLineIntersectionFloat(long rect, long X1, long Y1, long X2, long Y2) {
        long __functionAddress = Functions.GetRectAndLineIntersectionFloat;
        return invokePPPPPZ(rect, X1, Y1, X2, Y2, __functionAddress);
    }

    /** {@code bool SDL_GetRectAndLineIntersectionFloat(SDL_FRect const * rect, float * X1, float * Y1, float * X2, float * Y2)} */
    @NativeType("bool")
    public static boolean SDL_GetRectAndLineIntersectionFloat(@NativeType("SDL_FRect const *") SDL_FRect.Buffer rect, @NativeType("float *") FloatBuffer X1, @NativeType("float *") FloatBuffer Y1, @NativeType("float *") FloatBuffer X2, @NativeType("float *") FloatBuffer Y2) {
        if (CHECKS) {
            check(rect, 1);
            check(X1, 1);
            check(Y1, 1);
            check(X2, 1);
            check(Y2, 1);
        }
        return nSDL_GetRectAndLineIntersectionFloat(rect.address(), memAddress(X1), memAddress(Y1), memAddress(X2), memAddress(Y2));
    }

    // --- [ SDL_GetNumRenderDrivers ] ---

    /** {@code int SDL_GetNumRenderDrivers(void)} */
    public static int SDL_GetNumRenderDrivers() {
        long __functionAddress = Functions.GetNumRenderDrivers;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetRenderDriver ] ---

    /** {@code char const * SDL_GetRenderDriver(int index)} */
    public static long nSDL_GetRenderDriver(int index) {
        long __functionAddress = Functions.GetRenderDriver;
        return invokeP(index, __functionAddress);
    }

    /** {@code char const * SDL_GetRenderDriver(int index)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetRenderDriver(int index) {
        long __result = nSDL_GetRenderDriver(index);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_CreateWindowAndRenderer ] ---

    /** {@code bool SDL_CreateWindowAndRenderer(char const * title, int width, int height, SDL_WindowFlags window_flags, SDL_Window ** window, SDL_Renderer ** renderer)} */
    public static boolean nSDL_CreateWindowAndRenderer(long title, int width, int height, long window_flags, long window, long renderer) {
        long __functionAddress = Functions.CreateWindowAndRenderer;
        return invokePJPPZ(title, width, height, window_flags, window, renderer, __functionAddress);
    }

    /** {@code bool SDL_CreateWindowAndRenderer(char const * title, int width, int height, SDL_WindowFlags window_flags, SDL_Window ** window, SDL_Renderer ** renderer)} */
    @NativeType("bool")
    public static boolean SDL_CreateWindowAndRenderer(@NativeType("char const *") ByteBuffer title, int width, int height, @NativeType("SDL_WindowFlags") long window_flags, @NativeType("SDL_Window **") PointerBuffer window, @NativeType("SDL_Renderer **") PointerBuffer renderer) {
        if (CHECKS) {
            checkNT1(title);
            check(window, 1);
            check(renderer, 1);
        }
        return nSDL_CreateWindowAndRenderer(memAddress(title), width, height, window_flags, memAddress(window), memAddress(renderer));
    }

    /** {@code bool SDL_CreateWindowAndRenderer(char const * title, int width, int height, SDL_WindowFlags window_flags, SDL_Window ** window, SDL_Renderer ** renderer)} */
    @NativeType("bool")
    public static boolean SDL_CreateWindowAndRenderer(@NativeType("char const *") CharSequence title, int width, int height, @NativeType("SDL_WindowFlags") long window_flags, @NativeType("SDL_Window **") PointerBuffer window, @NativeType("SDL_Renderer **") PointerBuffer renderer) {
        if (CHECKS) {
            check(window, 1);
            check(renderer, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nSDL_CreateWindowAndRenderer(titleEncoded, width, height, window_flags, memAddress(window), memAddress(renderer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateRenderer ] ---

    /** {@code SDL_Renderer * SDL_CreateRenderer(SDL_Window * window, char const * name)} */
    public static long nSDL_CreateRenderer(long window, long name) {
        long __functionAddress = Functions.CreateRenderer;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, name, __functionAddress);
    }

    /** {@code SDL_Renderer * SDL_CreateRenderer(SDL_Window * window, char const * name)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_CreateRenderer(@NativeType("SDL_Window *") long window, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_CreateRenderer(window, memAddress(name));
    }

    /** {@code SDL_Renderer * SDL_CreateRenderer(SDL_Window * window, char const * name)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_CreateRenderer(@NativeType("SDL_Window *") long window, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_CreateRenderer(window, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateRendererWithProperties ] ---

    /** {@code SDL_Renderer * SDL_CreateRendererWithProperties(SDL_PropertiesID props)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_CreateRendererWithProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.CreateRendererWithProperties;
        return invokeP(props, __functionAddress);
    }

    // --- [ SDL_CreateSoftwareRenderer ] ---

    /** {@code SDL_Renderer * SDL_CreateSoftwareRenderer(SDL_Surface * surface)} */
    public static long nSDL_CreateSoftwareRenderer(long surface) {
        long __functionAddress = Functions.CreateSoftwareRenderer;
        return invokePP(surface, __functionAddress);
    }

    /** {@code SDL_Renderer * SDL_CreateSoftwareRenderer(SDL_Surface * surface)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_CreateSoftwareRenderer(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_CreateSoftwareRenderer(surface.address());
    }

    // --- [ SDL_GetRenderer ] ---

    /** {@code SDL_Renderer * SDL_GetRenderer(SDL_Window * window)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_GetRenderer(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetRenderer;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ SDL_GetRenderWindow ] ---

    /** {@code SDL_Window * SDL_GetRenderWindow(SDL_Renderer * renderer)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetRenderWindow(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRenderWindow;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    // --- [ SDL_GetRendererName ] ---

    /** {@code char const * SDL_GetRendererName(SDL_Renderer * renderer)} */
    public static long nSDL_GetRendererName(long renderer) {
        long __functionAddress = Functions.GetRendererName;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    /** {@code char const * SDL_GetRendererName(SDL_Renderer * renderer)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetRendererName(@NativeType("SDL_Renderer *") long renderer) {
        long __result = nSDL_GetRendererName(renderer);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetRendererProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetRendererProperties(SDL_Renderer * renderer)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetRendererProperties(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRendererProperties;
        if (CHECKS) {
            check(renderer);
        }
        return invokePI(renderer, __functionAddress);
    }

    // --- [ SDL_GetRenderOutputSize ] ---

    /** {@code bool SDL_GetRenderOutputSize(SDL_Renderer * renderer, int * w, int * h)} */
    public static boolean nSDL_GetRenderOutputSize(long renderer, long w, long h) {
        long __functionAddress = Functions.GetRenderOutputSize;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPZ(renderer, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetRenderOutputSize(SDL_Renderer * renderer, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderOutputSize(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (CHECKS) {
            check(w, 1);
            check(h, 1);
        }
        return nSDL_GetRenderOutputSize(renderer, memAddress(w), memAddress(h));
    }

    // --- [ SDL_GetCurrentRenderOutputSize ] ---

    /** {@code bool SDL_GetCurrentRenderOutputSize(SDL_Renderer * renderer, int * w, int * h)} */
    public static boolean nSDL_GetCurrentRenderOutputSize(long renderer, long w, long h) {
        long __functionAddress = Functions.GetCurrentRenderOutputSize;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPZ(renderer, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetCurrentRenderOutputSize(SDL_Renderer * renderer, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetCurrentRenderOutputSize(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (CHECKS) {
            check(w, 1);
            check(h, 1);
        }
        return nSDL_GetCurrentRenderOutputSize(renderer, memAddress(w), memAddress(h));
    }

    // --- [ SDL_CreateTexture ] ---

    /** {@code SDL_Texture * SDL_CreateTexture(SDL_Renderer * renderer, SDL_PixelFormat format, SDL_TextureAccess access, int w, int h)} */
    public static long nSDL_CreateTexture(long renderer, int format, int access, int w, int h) {
        long __functionAddress = Functions.CreateTexture;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, format, access, w, h, __functionAddress);
    }

    /** {@code SDL_Texture * SDL_CreateTexture(SDL_Renderer * renderer, SDL_PixelFormat format, SDL_TextureAccess access, int w, int h)} */
    @NativeType("SDL_Texture *")
    public static @Nullable SDL_Texture SDL_CreateTexture(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_PixelFormat") int format, @NativeType("SDL_TextureAccess") int access, int w, int h) {
        long __result = nSDL_CreateTexture(renderer, format, access, w, h);
        return SDL_Texture.createSafe(__result);
    }

    // --- [ SDL_CreateTextureFromSurface ] ---

    /** {@code SDL_Texture * SDL_CreateTextureFromSurface(SDL_Renderer * renderer, SDL_Surface * surface)} */
    public static long nSDL_CreateTextureFromSurface(long renderer, long surface) {
        long __functionAddress = Functions.CreateTextureFromSurface;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPP(renderer, surface, __functionAddress);
    }

    /** {@code SDL_Texture * SDL_CreateTextureFromSurface(SDL_Renderer * renderer, SDL_Surface * surface)} */
    @NativeType("SDL_Texture *")
    public static @Nullable SDL_Texture SDL_CreateTextureFromSurface(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        long __result = nSDL_CreateTextureFromSurface(renderer, surface.address());
        return SDL_Texture.createSafe(__result);
    }

    // --- [ SDL_CreateTextureWithProperties ] ---

    /** {@code SDL_Texture * SDL_CreateTextureWithProperties(SDL_Renderer * renderer, SDL_PropertiesID props)} */
    public static long nSDL_CreateTextureWithProperties(long renderer, int props) {
        long __functionAddress = Functions.CreateTextureWithProperties;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, props, __functionAddress);
    }

    /** {@code SDL_Texture * SDL_CreateTextureWithProperties(SDL_Renderer * renderer, SDL_PropertiesID props)} */
    @NativeType("SDL_Texture *")
    public static @Nullable SDL_Texture SDL_CreateTextureWithProperties(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_PropertiesID") int props) {
        long __result = nSDL_CreateTextureWithProperties(renderer, props);
        return SDL_Texture.createSafe(__result);
    }

    // --- [ SDL_GetTextureProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetTextureProperties(SDL_Texture * texture)} */
    public static int nSDL_GetTextureProperties(long texture) {
        long __functionAddress = Functions.GetTextureProperties;
        return invokePI(texture, __functionAddress);
    }

    /** {@code SDL_PropertiesID SDL_GetTextureProperties(SDL_Texture * texture)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetTextureProperties(@NativeType("SDL_Texture *") SDL_Texture texture) {
        return nSDL_GetTextureProperties(texture.address());
    }

    // --- [ SDL_GetRendererFromTexture ] ---

    /** {@code SDL_Renderer * SDL_GetRendererFromTexture(SDL_Texture * texture)} */
    public static long nSDL_GetRendererFromTexture(long texture) {
        long __functionAddress = Functions.GetRendererFromTexture;
        return invokePP(texture, __functionAddress);
    }

    /** {@code SDL_Renderer * SDL_GetRendererFromTexture(SDL_Texture * texture)} */
    @NativeType("SDL_Renderer *")
    public static long SDL_GetRendererFromTexture(@NativeType("SDL_Texture *") SDL_Texture texture) {
        return nSDL_GetRendererFromTexture(texture.address());
    }

    // --- [ SDL_GetTextureSize ] ---

    /** {@code bool SDL_GetTextureSize(SDL_Texture * texture, float * w, float * h)} */
    public static boolean nSDL_GetTextureSize(long texture, long w, long h) {
        long __functionAddress = Functions.GetTextureSize;
        return invokePPPZ(texture, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetTextureSize(SDL_Texture * texture, float * w, float * h)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureSize(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float *") FloatBuffer w, @NativeType("float *") FloatBuffer h) {
        if (CHECKS) {
            check(w, 1);
            check(h, 1);
        }
        return nSDL_GetTextureSize(texture.address(), memAddress(w), memAddress(h));
    }

    // --- [ SDL_SetTextureColorMod ] ---

    /** {@code bool SDL_SetTextureColorMod(SDL_Texture * texture, Uint8 r, Uint8 g, Uint8 b)} */
    public static boolean nSDL_SetTextureColorMod(long texture, byte r, byte g, byte b) {
        long __functionAddress = Functions.SetTextureColorMod;
        return invokePUUUZ(texture, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_SetTextureColorMod(SDL_Texture * texture, Uint8 r, Uint8 g, Uint8 b)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureColorMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        return nSDL_SetTextureColorMod(texture.address(), r, g, b);
    }

    // --- [ SDL_SetTextureColorModFloat ] ---

    /** {@code bool SDL_SetTextureColorModFloat(SDL_Texture * texture, float r, float g, float b)} */
    public static boolean nSDL_SetTextureColorModFloat(long texture, float r, float g, float b) {
        long __functionAddress = Functions.SetTextureColorModFloat;
        return invokePZ(texture, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_SetTextureColorModFloat(SDL_Texture * texture, float r, float g, float b)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureColorModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, float r, float g, float b) {
        return nSDL_SetTextureColorModFloat(texture.address(), r, g, b);
    }

    // --- [ SDL_GetTextureColorMod ] ---

    /** {@code bool SDL_GetTextureColorMod(SDL_Texture * texture, Uint8 * r, Uint8 * g, Uint8 * b)} */
    public static boolean nSDL_GetTextureColorMod(long texture, long r, long g, long b) {
        long __functionAddress = Functions.GetTextureColorMod;
        return invokePPPPZ(texture, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_GetTextureColorMod(SDL_Texture * texture, Uint8 * r, Uint8 * g, Uint8 * b)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureColorMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8 *") ByteBuffer r, @NativeType("Uint8 *") ByteBuffer g, @NativeType("Uint8 *") ByteBuffer b) {
        if (CHECKS) {
            check(r, 1);
            check(g, 1);
            check(b, 1);
        }
        return nSDL_GetTextureColorMod(texture.address(), memAddress(r), memAddress(g), memAddress(b));
    }

    // --- [ SDL_GetTextureColorModFloat ] ---

    /** {@code bool SDL_GetTextureColorModFloat(SDL_Texture * texture, float * r, float * g, float * b)} */
    public static boolean nSDL_GetTextureColorModFloat(long texture, long r, long g, long b) {
        long __functionAddress = Functions.GetTextureColorModFloat;
        return invokePPPPZ(texture, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_GetTextureColorModFloat(SDL_Texture * texture, float * r, float * g, float * b)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureColorModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float *") FloatBuffer r, @NativeType("float *") FloatBuffer g, @NativeType("float *") FloatBuffer b) {
        if (CHECKS) {
            check(r, 1);
            check(g, 1);
            check(b, 1);
        }
        return nSDL_GetTextureColorModFloat(texture.address(), memAddress(r), memAddress(g), memAddress(b));
    }

    // --- [ SDL_SetTextureAlphaMod ] ---

    /** {@code bool SDL_SetTextureAlphaMod(SDL_Texture * texture, Uint8 alpha)} */
    public static boolean nSDL_SetTextureAlphaMod(long texture, byte alpha) {
        long __functionAddress = Functions.SetTextureAlphaMod;
        return invokePUZ(texture, alpha, __functionAddress);
    }

    /** {@code bool SDL_SetTextureAlphaMod(SDL_Texture * texture, Uint8 alpha)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureAlphaMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8") byte alpha) {
        return nSDL_SetTextureAlphaMod(texture.address(), alpha);
    }

    // --- [ SDL_SetTextureAlphaModFloat ] ---

    /** {@code bool SDL_SetTextureAlphaModFloat(SDL_Texture * texture, float alpha)} */
    public static boolean nSDL_SetTextureAlphaModFloat(long texture, float alpha) {
        long __functionAddress = Functions.SetTextureAlphaModFloat;
        return invokePZ(texture, alpha, __functionAddress);
    }

    /** {@code bool SDL_SetTextureAlphaModFloat(SDL_Texture * texture, float alpha)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureAlphaModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, float alpha) {
        return nSDL_SetTextureAlphaModFloat(texture.address(), alpha);
    }

    // --- [ SDL_GetTextureAlphaMod ] ---

    /** {@code bool SDL_GetTextureAlphaMod(SDL_Texture * texture, Uint8 * alpha)} */
    public static boolean nSDL_GetTextureAlphaMod(long texture, long alpha) {
        long __functionAddress = Functions.GetTextureAlphaMod;
        return invokePPZ(texture, alpha, __functionAddress);
    }

    /** {@code bool SDL_GetTextureAlphaMod(SDL_Texture * texture, Uint8 * alpha)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureAlphaMod(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("Uint8 *") ByteBuffer alpha) {
        if (CHECKS) {
            check(alpha, 1);
        }
        return nSDL_GetTextureAlphaMod(texture.address(), memAddress(alpha));
    }

    // --- [ SDL_GetTextureAlphaModFloat ] ---

    /** {@code bool SDL_GetTextureAlphaModFloat(SDL_Texture * texture, float * alpha)} */
    public static boolean nSDL_GetTextureAlphaModFloat(long texture, long alpha) {
        long __functionAddress = Functions.GetTextureAlphaModFloat;
        return invokePPZ(texture, alpha, __functionAddress);
    }

    /** {@code bool SDL_GetTextureAlphaModFloat(SDL_Texture * texture, float * alpha)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureAlphaModFloat(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("float *") FloatBuffer alpha) {
        if (CHECKS) {
            check(alpha, 1);
        }
        return nSDL_GetTextureAlphaModFloat(texture.address(), memAddress(alpha));
    }

    // --- [ SDL_SetTextureBlendMode ] ---

    /** {@code bool SDL_SetTextureBlendMode(SDL_Texture * texture, SDL_BlendMode blendMode)} */
    public static boolean nSDL_SetTextureBlendMode(long texture, int blendMode) {
        long __functionAddress = Functions.SetTextureBlendMode;
        return invokePZ(texture, blendMode, __functionAddress);
    }

    /** {@code bool SDL_SetTextureBlendMode(SDL_Texture * texture, SDL_BlendMode blendMode)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureBlendMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_BlendMode") int blendMode) {
        return nSDL_SetTextureBlendMode(texture.address(), blendMode);
    }

    // --- [ SDL_GetTextureBlendMode ] ---

    /** {@code bool SDL_GetTextureBlendMode(SDL_Texture * texture, SDL_BlendMode * blendMode)} */
    public static boolean nSDL_GetTextureBlendMode(long texture, long blendMode) {
        long __functionAddress = Functions.GetTextureBlendMode;
        return invokePPZ(texture, blendMode, __functionAddress);
    }

    /** {@code bool SDL_GetTextureBlendMode(SDL_Texture * texture, SDL_BlendMode * blendMode)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureBlendMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_BlendMode *") IntBuffer blendMode) {
        if (CHECKS) {
            check(blendMode, 1);
        }
        return nSDL_GetTextureBlendMode(texture.address(), memAddress(blendMode));
    }

    // --- [ SDL_SetTextureScaleMode ] ---

    /** {@code bool SDL_SetTextureScaleMode(SDL_Texture * texture, SDL_ScaleMode scaleMode)} */
    public static boolean nSDL_SetTextureScaleMode(long texture, int scaleMode) {
        long __functionAddress = Functions.SetTextureScaleMode;
        return invokePZ(texture, scaleMode, __functionAddress);
    }

    /** {@code bool SDL_SetTextureScaleMode(SDL_Texture * texture, SDL_ScaleMode scaleMode)} */
    @NativeType("bool")
    public static boolean SDL_SetTextureScaleMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_ScaleMode") int scaleMode) {
        return nSDL_SetTextureScaleMode(texture.address(), scaleMode);
    }

    // --- [ SDL_GetTextureScaleMode ] ---

    /** {@code bool SDL_GetTextureScaleMode(SDL_Texture * texture, SDL_ScaleMode * scaleMode)} */
    public static boolean nSDL_GetTextureScaleMode(long texture, long scaleMode) {
        long __functionAddress = Functions.GetTextureScaleMode;
        return invokePPZ(texture, scaleMode, __functionAddress);
    }

    /** {@code bool SDL_GetTextureScaleMode(SDL_Texture * texture, SDL_ScaleMode * scaleMode)} */
    @NativeType("bool")
    public static boolean SDL_GetTextureScaleMode(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_ScaleMode *") IntBuffer scaleMode) {
        if (CHECKS) {
            check(scaleMode, 1);
        }
        return nSDL_GetTextureScaleMode(texture.address(), memAddress(scaleMode));
    }

    // --- [ SDL_UpdateTexture ] ---

    /** {@code bool SDL_UpdateTexture(SDL_Texture * texture, SDL_Rect const * rect, void const * pixels, int pitch)} */
    public static boolean nSDL_UpdateTexture(long texture, long rect, long pixels, int pitch) {
        long __functionAddress = Functions.UpdateTexture;
        return invokePPPZ(texture, rect, pixels, pitch, __functionAddress);
    }

    /** {@code bool SDL_UpdateTexture(SDL_Texture * texture, SDL_Rect const * rect, void const * pixels, int pitch)} */
    @NativeType("bool")
    public static boolean SDL_UpdateTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer rect, @NativeType("void const *") ByteBuffer pixels, int pitch) {
        if (CHECKS) {
            checkSafe(rect, 1);
        }
        return nSDL_UpdateTexture(texture.address(), memAddressSafe(rect), memAddress(pixels), pitch);
    }

    // --- [ SDL_UpdateYUVTexture ] ---

    /** {@code bool SDL_UpdateYUVTexture(SDL_Texture * texture, SDL_Rect const * rect, Uint8 const * Yplane, int Ypitch, Uint8 const * Uplane, int Upitch, Uint8 const * Vplane, int Vpitch)} */
    public static boolean nSDL_UpdateYUVTexture(long texture, long rect, long Yplane, int Ypitch, long Uplane, int Upitch, long Vplane, int Vpitch) {
        long __functionAddress = Functions.UpdateYUVTexture;
        return invokePPPPPZ(texture, rect, Yplane, Ypitch, Uplane, Upitch, Vplane, Vpitch, __functionAddress);
    }

    /** {@code bool SDL_UpdateYUVTexture(SDL_Texture * texture, SDL_Rect const * rect, Uint8 const * Yplane, int Ypitch, Uint8 const * Uplane, int Upitch, Uint8 const * Vplane, int Vpitch)} */
    @NativeType("bool")
    public static boolean SDL_UpdateYUVTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer rect, @NativeType("Uint8 const *") ByteBuffer Yplane, int Ypitch, @NativeType("Uint8 const *") ByteBuffer Uplane, int Upitch, @NativeType("Uint8 const *") ByteBuffer Vplane, int Vpitch) {
        if (CHECKS) {
            checkSafe(rect, 1);
        }
        return nSDL_UpdateYUVTexture(texture.address(), memAddressSafe(rect), memAddress(Yplane), Ypitch, memAddress(Uplane), Upitch, memAddress(Vplane), Vpitch);
    }

    // --- [ SDL_UpdateNVTexture ] ---

    /** {@code bool SDL_UpdateNVTexture(SDL_Texture * texture, SDL_Rect const * rect, Uint8 const * Yplane, int Ypitch, Uint8 const * UVplane, int UVpitch)} */
    public static boolean nSDL_UpdateNVTexture(long texture, long rect, long Yplane, int Ypitch, long UVplane, int UVpitch) {
        long __functionAddress = Functions.UpdateNVTexture;
        return invokePPPPZ(texture, rect, Yplane, Ypitch, UVplane, UVpitch, __functionAddress);
    }

    /** {@code bool SDL_UpdateNVTexture(SDL_Texture * texture, SDL_Rect const * rect, Uint8 const * Yplane, int Ypitch, Uint8 const * UVplane, int UVpitch)} */
    @NativeType("bool")
    public static boolean SDL_UpdateNVTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer rect, @NativeType("Uint8 const *") ByteBuffer Yplane, int Ypitch, @NativeType("Uint8 const *") ByteBuffer UVplane, int UVpitch) {
        if (CHECKS) {
            checkSafe(rect, 1);
        }
        return nSDL_UpdateNVTexture(texture.address(), memAddressSafe(rect), memAddress(Yplane), Ypitch, memAddress(UVplane), UVpitch);
    }

    // --- [ SDL_LockTexture ] ---

    /** {@code bool SDL_LockTexture(SDL_Texture * texture, SDL_Rect const * rect, void ** pixels, int * pitch)} */
    public static boolean nSDL_LockTexture(long texture, long rect, long pixels, long pitch) {
        long __functionAddress = Functions.LockTexture;
        return invokePPPPZ(texture, rect, pixels, pitch, __functionAddress);
    }

    /** {@code bool SDL_LockTexture(SDL_Texture * texture, SDL_Rect const * rect, void ** pixels, int * pitch)} */
    @NativeType("bool")
    public static boolean SDL_LockTexture(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer rect, @NativeType("void **") PointerBuffer pixels, @NativeType("int *") IntBuffer pitch) {
        if (CHECKS) {
            checkSafe(rect, 1);
            check(pixels, 1);
            check(pitch, 1);
        }
        return nSDL_LockTexture(texture.address(), memAddressSafe(rect), memAddress(pixels), memAddress(pitch));
    }

    // --- [ SDL_LockTextureToSurface ] ---

    /** {@code bool SDL_LockTextureToSurface(SDL_Texture * texture, SDL_Rect const * rect, SDL_Surface ** surface)} */
    public static boolean nSDL_LockTextureToSurface(long texture, long rect, long surface) {
        long __functionAddress = Functions.LockTextureToSurface;
        return invokePPPZ(texture, rect, surface, __functionAddress);
    }

    /** {@code bool SDL_LockTextureToSurface(SDL_Texture * texture, SDL_Rect const * rect, SDL_Surface ** surface)} */
    @NativeType("bool")
    public static boolean SDL_LockTextureToSurface(@NativeType("SDL_Texture *") SDL_Texture texture, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer rect, @NativeType("SDL_Surface **") PointerBuffer surface) {
        if (CHECKS) {
            checkSafe(rect, 1);
            check(surface, 1);
        }
        return nSDL_LockTextureToSurface(texture.address(), memAddressSafe(rect), memAddress(surface));
    }

    // --- [ SDL_UnlockTexture ] ---

    /** {@code void SDL_UnlockTexture(SDL_Texture * texture)} */
    public static void nSDL_UnlockTexture(long texture) {
        long __functionAddress = Functions.UnlockTexture;
        invokePV(texture, __functionAddress);
    }

    /** {@code void SDL_UnlockTexture(SDL_Texture * texture)} */
    public static void SDL_UnlockTexture(@NativeType("SDL_Texture *") SDL_Texture texture) {
        nSDL_UnlockTexture(texture.address());
    }

    // --- [ SDL_SetRenderTarget ] ---

    /** {@code bool SDL_SetRenderTarget(SDL_Renderer * renderer, SDL_Texture * texture)} */
    public static boolean nSDL_SetRenderTarget(long renderer, long texture) {
        long __functionAddress = Functions.SetRenderTarget;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, texture, __functionAddress);
    }

    /** {@code bool SDL_SetRenderTarget(SDL_Renderer * renderer, SDL_Texture * texture)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderTarget(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture.@Nullable Buffer texture) {
        if (CHECKS) {
            checkSafe(texture, 1);
        }
        return nSDL_SetRenderTarget(renderer, memAddressSafe(texture));
    }

    // --- [ SDL_GetRenderTarget ] ---

    /** {@code SDL_Texture * SDL_GetRenderTarget(SDL_Renderer * renderer)} */
    public static long nSDL_GetRenderTarget(long renderer) {
        long __functionAddress = Functions.GetRenderTarget;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    /** {@code SDL_Texture * SDL_GetRenderTarget(SDL_Renderer * renderer)} */
    @NativeType("SDL_Texture *")
    public static @Nullable SDL_Texture SDL_GetRenderTarget(@NativeType("SDL_Renderer *") long renderer) {
        long __result = nSDL_GetRenderTarget(renderer);
        return SDL_Texture.createSafe(__result);
    }

    // --- [ SDL_SetRenderLogicalPresentation ] ---

    /** {@code bool SDL_SetRenderLogicalPresentation(SDL_Renderer * renderer, int w, int h, SDL_RendererLogicalPresentation mode)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderLogicalPresentation(@NativeType("SDL_Renderer *") long renderer, int w, int h, @NativeType("SDL_RendererLogicalPresentation") int mode) {
        long __functionAddress = Functions.SetRenderLogicalPresentation;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, w, h, mode, __functionAddress);
    }

    // --- [ SDL_GetRenderLogicalPresentation ] ---

    /** {@code bool SDL_GetRenderLogicalPresentation(SDL_Renderer * renderer, int * w, int * h, SDL_RendererLogicalPresentation * mode)} */
    public static boolean nSDL_GetRenderLogicalPresentation(long renderer, long w, long h, long mode) {
        long __functionAddress = Functions.GetRenderLogicalPresentation;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPZ(renderer, w, h, mode, __functionAddress);
    }

    /** {@code bool SDL_GetRenderLogicalPresentation(SDL_Renderer * renderer, int * w, int * h, SDL_RendererLogicalPresentation * mode)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderLogicalPresentation(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h, @NativeType("SDL_RendererLogicalPresentation *") IntBuffer mode) {
        if (CHECKS) {
            check(w, 1);
            check(h, 1);
            check(mode, 1);
        }
        return nSDL_GetRenderLogicalPresentation(renderer, memAddress(w), memAddress(h), memAddress(mode));
    }

    // --- [ SDL_GetRenderLogicalPresentationRect ] ---

    /** {@code bool SDL_GetRenderLogicalPresentationRect(SDL_Renderer * renderer, SDL_FRect * rect)} */
    public static boolean nSDL_GetRenderLogicalPresentationRect(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderLogicalPresentationRect;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_GetRenderLogicalPresentationRect(SDL_Renderer * renderer, SDL_FRect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderLogicalPresentationRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect *") SDL_FRect.Buffer rect) {
        if (CHECKS) {
            check(rect, 1);
        }
        return nSDL_GetRenderLogicalPresentationRect(renderer, rect.address());
    }

    // --- [ SDL_RenderCoordinatesFromWindow ] ---

    /** {@code bool SDL_RenderCoordinatesFromWindow(SDL_Renderer * renderer, float window_x, float window_y, float * x, float * y)} */
    public static boolean nSDL_RenderCoordinatesFromWindow(long renderer, float window_x, float window_y, long x, long y) {
        long __functionAddress = Functions.RenderCoordinatesFromWindow;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPZ(renderer, window_x, window_y, x, y, __functionAddress);
    }

    /** {@code bool SDL_RenderCoordinatesFromWindow(SDL_Renderer * renderer, float window_x, float window_y, float * x, float * y)} */
    @NativeType("bool")
    public static boolean SDL_RenderCoordinatesFromWindow(@NativeType("SDL_Renderer *") long renderer, float window_x, float window_y, @NativeType("float *") FloatBuffer x, @NativeType("float *") FloatBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        return nSDL_RenderCoordinatesFromWindow(renderer, window_x, window_y, memAddress(x), memAddress(y));
    }

    // --- [ SDL_RenderCoordinatesToWindow ] ---

    /** {@code bool SDL_RenderCoordinatesToWindow(SDL_Renderer * renderer, float x, float y, float * window_x, float * window_y)} */
    public static boolean nSDL_RenderCoordinatesToWindow(long renderer, float x, float y, long window_x, long window_y) {
        long __functionAddress = Functions.RenderCoordinatesToWindow;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPZ(renderer, x, y, window_x, window_y, __functionAddress);
    }

    /** {@code bool SDL_RenderCoordinatesToWindow(SDL_Renderer * renderer, float x, float y, float * window_x, float * window_y)} */
    @NativeType("bool")
    public static boolean SDL_RenderCoordinatesToWindow(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("float *") FloatBuffer window_x, @NativeType("float *") FloatBuffer window_y) {
        if (CHECKS) {
            check(window_x, 1);
            check(window_y, 1);
        }
        return nSDL_RenderCoordinatesToWindow(renderer, x, y, memAddress(window_x), memAddress(window_y));
    }

    // --- [ SDL_ConvertEventToRenderCoordinates ] ---

    /** {@code bool SDL_ConvertEventToRenderCoordinates(SDL_Renderer * renderer, SDL_Event * event)} */
    public static boolean nSDL_ConvertEventToRenderCoordinates(long renderer, long event) {
        long __functionAddress = Functions.ConvertEventToRenderCoordinates;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, event, __functionAddress);
    }

    /** {@code bool SDL_ConvertEventToRenderCoordinates(SDL_Renderer * renderer, SDL_Event * event)} */
    @NativeType("bool")
    public static boolean SDL_ConvertEventToRenderCoordinates(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Event *") SDL_Event.Buffer event) {
        if (CHECKS) {
            check(event, 1);
        }
        return nSDL_ConvertEventToRenderCoordinates(renderer, event.address());
    }

    // --- [ SDL_SetRenderViewport ] ---

    /** {@code bool SDL_SetRenderViewport(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    public static boolean nSDL_SetRenderViewport(long renderer, long rect) {
        long __functionAddress = Functions.SetRenderViewport;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_SetRenderViewport(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderViewport(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer rect) {
        if (CHECKS) {
            checkSafe(rect, 1);
        }
        return nSDL_SetRenderViewport(renderer, memAddressSafe(rect));
    }

    // --- [ SDL_GetRenderViewport ] ---

    /** {@code bool SDL_GetRenderViewport(SDL_Renderer * renderer, SDL_Rect * rect)} */
    public static boolean nSDL_GetRenderViewport(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderViewport;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_GetRenderViewport(SDL_Renderer * renderer, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderViewport(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect *") SDL_Rect.Buffer rect) {
        if (CHECKS) {
            check(rect, 1);
        }
        return nSDL_GetRenderViewport(renderer, rect.address());
    }

    // --- [ SDL_RenderViewportSet ] ---

    /** {@code bool SDL_RenderViewportSet(SDL_Renderer * renderer)} */
    @NativeType("bool")
    public static boolean SDL_RenderViewportSet(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderViewportSet;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, __functionAddress);
    }

    // --- [ SDL_GetRenderSafeArea ] ---

    /** {@code bool SDL_GetRenderSafeArea(SDL_Renderer * renderer, SDL_Rect * rect)} */
    public static boolean nSDL_GetRenderSafeArea(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderSafeArea;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_GetRenderSafeArea(SDL_Renderer * renderer, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderSafeArea(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect *") SDL_Rect.Buffer rect) {
        if (CHECKS) {
            check(rect, 1);
        }
        return nSDL_GetRenderSafeArea(renderer, rect.address());
    }

    // --- [ SDL_SetRenderClipRect ] ---

    /** {@code bool SDL_SetRenderClipRect(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    public static boolean nSDL_SetRenderClipRect(long renderer, long rect) {
        long __functionAddress = Functions.SetRenderClipRect;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_SetRenderClipRect(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderClipRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer rect) {
        if (CHECKS) {
            checkSafe(rect, 1);
        }
        return nSDL_SetRenderClipRect(renderer, memAddressSafe(rect));
    }

    // --- [ SDL_GetRenderClipRect ] ---

    /** {@code bool SDL_GetRenderClipRect(SDL_Renderer * renderer, SDL_Rect * rect)} */
    public static boolean nSDL_GetRenderClipRect(long renderer, long rect) {
        long __functionAddress = Functions.GetRenderClipRect;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_GetRenderClipRect(SDL_Renderer * renderer, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderClipRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect *") SDL_Rect.Buffer rect) {
        if (CHECKS) {
            check(rect, 1);
        }
        return nSDL_GetRenderClipRect(renderer, rect.address());
    }

    // --- [ SDL_RenderClipEnabled ] ---

    /** {@code bool SDL_RenderClipEnabled(SDL_Renderer * renderer)} */
    @NativeType("bool")
    public static boolean SDL_RenderClipEnabled(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderClipEnabled;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, __functionAddress);
    }

    // --- [ SDL_SetRenderScale ] ---

    /** {@code bool SDL_SetRenderScale(SDL_Renderer * renderer, float scaleX, float scaleY)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderScale(@NativeType("SDL_Renderer *") long renderer, float scaleX, float scaleY) {
        long __functionAddress = Functions.SetRenderScale;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, scaleX, scaleY, __functionAddress);
    }

    // --- [ SDL_GetRenderScale ] ---

    /** {@code bool SDL_GetRenderScale(SDL_Renderer * renderer, float * scaleX, float * scaleY)} */
    public static boolean nSDL_GetRenderScale(long renderer, long scaleX, long scaleY) {
        long __functionAddress = Functions.GetRenderScale;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPZ(renderer, scaleX, scaleY, __functionAddress);
    }

    /** {@code bool SDL_GetRenderScale(SDL_Renderer * renderer, float * scaleX, float * scaleY)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderScale(@NativeType("SDL_Renderer *") long renderer, @NativeType("float *") FloatBuffer scaleX, @NativeType("float *") FloatBuffer scaleY) {
        if (CHECKS) {
            check(scaleX, 1);
            check(scaleY, 1);
        }
        return nSDL_GetRenderScale(renderer, memAddress(scaleX), memAddress(scaleY));
    }

    // --- [ SDL_SetRenderDrawColor ] ---

    /** {@code bool SDL_SetRenderDrawColor(SDL_Renderer * renderer, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderDrawColor(@NativeType("SDL_Renderer *") long renderer, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        long __functionAddress = Functions.SetRenderDrawColor;
        if (CHECKS) {
            check(renderer);
        }
        return invokePUUUUZ(renderer, r, g, b, a, __functionAddress);
    }

    // --- [ SDL_SetRenderDrawColorFloat ] ---

    /** {@code bool SDL_SetRenderDrawColorFloat(SDL_Renderer * renderer, float r, float g, float b, float a)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderDrawColorFloat(@NativeType("SDL_Renderer *") long renderer, float r, float g, float b, float a) {
        long __functionAddress = Functions.SetRenderDrawColorFloat;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, r, g, b, a, __functionAddress);
    }

    // --- [ SDL_GetRenderDrawColor ] ---

    /** {@code bool SDL_GetRenderDrawColor(SDL_Renderer * renderer, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    public static boolean nSDL_GetRenderDrawColor(long renderer, long r, long g, long b, long a) {
        long __functionAddress = Functions.GetRenderDrawColor;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPPZ(renderer, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_GetRenderDrawColor(SDL_Renderer * renderer, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderDrawColor(@NativeType("SDL_Renderer *") long renderer, @NativeType("Uint8 *") ByteBuffer r, @NativeType("Uint8 *") ByteBuffer g, @NativeType("Uint8 *") ByteBuffer b, @NativeType("Uint8 *") ByteBuffer a) {
        if (CHECKS) {
            check(r, 1);
            check(g, 1);
            check(b, 1);
            check(a, 1);
        }
        return nSDL_GetRenderDrawColor(renderer, memAddress(r), memAddress(g), memAddress(b), memAddress(a));
    }

    // --- [ SDL_GetRenderDrawColorFloat ] ---

    /** {@code bool SDL_GetRenderDrawColorFloat(SDL_Renderer * renderer, float * r, float * g, float * b, float * a)} */
    public static boolean nSDL_GetRenderDrawColorFloat(long renderer, long r, long g, long b, long a) {
        long __functionAddress = Functions.GetRenderDrawColorFloat;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPPZ(renderer, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_GetRenderDrawColorFloat(SDL_Renderer * renderer, float * r, float * g, float * b, float * a)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderDrawColorFloat(@NativeType("SDL_Renderer *") long renderer, @NativeType("float *") FloatBuffer r, @NativeType("float *") FloatBuffer g, @NativeType("float *") FloatBuffer b, @NativeType("float *") FloatBuffer a) {
        if (CHECKS) {
            check(r, 1);
            check(g, 1);
            check(b, 1);
            check(a, 1);
        }
        return nSDL_GetRenderDrawColorFloat(renderer, memAddress(r), memAddress(g), memAddress(b), memAddress(a));
    }

    // --- [ SDL_SetRenderColorScale ] ---

    /** {@code bool SDL_SetRenderColorScale(SDL_Renderer * renderer, float scale)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderColorScale(@NativeType("SDL_Renderer *") long renderer, float scale) {
        long __functionAddress = Functions.SetRenderColorScale;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, scale, __functionAddress);
    }

    // --- [ SDL_GetRenderColorScale ] ---

    /** {@code bool SDL_GetRenderColorScale(SDL_Renderer * renderer, float * scale)} */
    public static boolean nSDL_GetRenderColorScale(long renderer, long scale) {
        long __functionAddress = Functions.GetRenderColorScale;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, scale, __functionAddress);
    }

    /** {@code bool SDL_GetRenderColorScale(SDL_Renderer * renderer, float * scale)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderColorScale(@NativeType("SDL_Renderer *") long renderer, @NativeType("float *") FloatBuffer scale) {
        if (CHECKS) {
            check(scale, 1);
        }
        return nSDL_GetRenderColorScale(renderer, memAddress(scale));
    }

    // --- [ SDL_SetRenderDrawBlendMode ] ---

    /** {@code bool SDL_SetRenderDrawBlendMode(SDL_Renderer * renderer, SDL_BlendMode blendMode)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderDrawBlendMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_BlendMode") int blendMode) {
        long __functionAddress = Functions.SetRenderDrawBlendMode;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, blendMode, __functionAddress);
    }

    // --- [ SDL_GetRenderDrawBlendMode ] ---

    /** {@code bool SDL_GetRenderDrawBlendMode(SDL_Renderer * renderer, SDL_BlendMode * blendMode)} */
    public static boolean nSDL_GetRenderDrawBlendMode(long renderer, long blendMode) {
        long __functionAddress = Functions.GetRenderDrawBlendMode;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, blendMode, __functionAddress);
    }

    /** {@code bool SDL_GetRenderDrawBlendMode(SDL_Renderer * renderer, SDL_BlendMode * blendMode)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderDrawBlendMode(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_BlendMode *") IntBuffer blendMode) {
        if (CHECKS) {
            check(blendMode, 1);
        }
        return nSDL_GetRenderDrawBlendMode(renderer, memAddress(blendMode));
    }

    // --- [ SDL_RenderClear ] ---

    /** {@code bool SDL_RenderClear(SDL_Renderer * renderer)} */
    @NativeType("bool")
    public static boolean SDL_RenderClear(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderClear;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, __functionAddress);
    }

    // --- [ SDL_RenderPoint ] ---

    /** {@code bool SDL_RenderPoint(SDL_Renderer * renderer, float x, float y)} */
    @NativeType("bool")
    public static boolean SDL_RenderPoint(@NativeType("SDL_Renderer *") long renderer, float x, float y) {
        long __functionAddress = Functions.RenderPoint;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, x, y, __functionAddress);
    }

    // --- [ SDL_RenderPoints ] ---

    /** {@code bool SDL_RenderPoints(SDL_Renderer * renderer, SDL_FPoint const * points, int count)} */
    public static boolean nSDL_RenderPoints(long renderer, long points, int count) {
        long __functionAddress = Functions.RenderPoints;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, points, count, __functionAddress);
    }

    /** {@code bool SDL_RenderPoints(SDL_Renderer * renderer, SDL_FPoint const * points, int count)} */
    @NativeType("bool")
    public static boolean SDL_RenderPoints(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FPoint const *") SDL_FPoint.Buffer points) {
        return nSDL_RenderPoints(renderer, points.address(), points.remaining());
    }

    // --- [ SDL_RenderLine ] ---

    /** {@code bool SDL_RenderLine(SDL_Renderer * renderer, float x1, float y1, float x2, float y2)} */
    @NativeType("bool")
    public static boolean SDL_RenderLine(@NativeType("SDL_Renderer *") long renderer, float x1, float y1, float x2, float y2) {
        long __functionAddress = Functions.RenderLine;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, x1, y1, x2, y2, __functionAddress);
    }

    // --- [ SDL_RenderLines ] ---

    /** {@code bool SDL_RenderLines(SDL_Renderer * renderer, SDL_FPoint const * points, int count)} */
    public static boolean nSDL_RenderLines(long renderer, long points, int count) {
        long __functionAddress = Functions.RenderLines;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, points, count, __functionAddress);
    }

    /** {@code bool SDL_RenderLines(SDL_Renderer * renderer, SDL_FPoint const * points, int count)} */
    @NativeType("bool")
    public static boolean SDL_RenderLines(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FPoint const *") SDL_FPoint.Buffer points) {
        return nSDL_RenderLines(renderer, points.address(), points.remaining());
    }

    // --- [ SDL_RenderRect ] ---

    /** {@code bool SDL_RenderRect(SDL_Renderer * renderer, SDL_FRect const * rect)} */
    public static boolean nSDL_RenderRect(long renderer, long rect) {
        long __functionAddress = Functions.RenderRect;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_RenderRect(SDL_Renderer * renderer, SDL_FRect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_RenderRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") SDL_FRect.Buffer rect) {
        if (CHECKS) {
            check(rect, 1);
        }
        return nSDL_RenderRect(renderer, rect.address());
    }

    // --- [ SDL_RenderRects ] ---

    /** {@code bool SDL_RenderRects(SDL_Renderer * renderer, SDL_FRect const * rects, int count)} */
    public static boolean nSDL_RenderRects(long renderer, long rects, int count) {
        long __functionAddress = Functions.RenderRects;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rects, count, __functionAddress);
    }

    /** {@code bool SDL_RenderRects(SDL_Renderer * renderer, SDL_FRect const * rects, int count)} */
    @NativeType("bool")
    public static boolean SDL_RenderRects(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") SDL_FRect.Buffer rects) {
        return nSDL_RenderRects(renderer, rects.address(), rects.remaining());
    }

    // --- [ SDL_RenderFillRect ] ---

    /** {@code bool SDL_RenderFillRect(SDL_Renderer * renderer, SDL_FRect const * rect)} */
    public static boolean nSDL_RenderFillRect(long renderer, long rect) {
        long __functionAddress = Functions.RenderFillRect;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rect, __functionAddress);
    }

    /** {@code bool SDL_RenderFillRect(SDL_Renderer * renderer, SDL_FRect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_RenderFillRect(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") SDL_FRect.Buffer rect) {
        if (CHECKS) {
            check(rect, 1);
        }
        return nSDL_RenderFillRect(renderer, rect.address());
    }

    // --- [ SDL_RenderFillRects ] ---

    /** {@code bool SDL_RenderFillRects(SDL_Renderer * renderer, SDL_FRect const * rects, int count)} */
    public static boolean nSDL_RenderFillRects(long renderer, long rects, int count) {
        long __functionAddress = Functions.RenderFillRects;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, rects, count, __functionAddress);
    }

    /** {@code bool SDL_RenderFillRects(SDL_Renderer * renderer, SDL_FRect const * rects, int count)} */
    @NativeType("bool")
    public static boolean SDL_RenderFillRects(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_FRect const *") SDL_FRect.Buffer rects) {
        return nSDL_RenderFillRects(renderer, rects.address(), rects.remaining());
    }

    // --- [ SDL_RenderTexture ] ---

    /** {@code bool SDL_RenderTexture(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FRect const * dstrect)} */
    public static boolean nSDL_RenderTexture(long renderer, long texture, long srcrect, long dstrect) {
        long __functionAddress = Functions.RenderTexture;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPZ(renderer, texture, srcrect, dstrect, __functionAddress);
    }

    /** {@code bool SDL_RenderTexture(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FRect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_RenderTexture(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture.Buffer texture, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer srcrect, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer dstrect) {
        if (CHECKS) {
            check(texture, 1);
            checkSafe(srcrect, 1);
            checkSafe(dstrect, 1);
        }
        return nSDL_RenderTexture(renderer, texture.address(), memAddressSafe(srcrect), memAddressSafe(dstrect));
    }

    // --- [ SDL_RenderTextureRotated ] ---

    /** {@code bool SDL_RenderTextureRotated(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FRect const * dstrect, double angle, SDL_FPoint const * center, SDL_FlipMode flip)} */
    public static boolean nSDL_RenderTextureRotated(long renderer, long texture, long srcrect, long dstrect, double angle, long center, int flip) {
        long __functionAddress = Functions.RenderTextureRotated;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPPZ(renderer, texture, srcrect, dstrect, angle, center, flip, __functionAddress);
    }

    /** {@code bool SDL_RenderTextureRotated(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FRect const * dstrect, double angle, SDL_FPoint const * center, SDL_FlipMode flip)} */
    @NativeType("bool")
    public static boolean SDL_RenderTextureRotated(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture.Buffer texture, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer srcrect, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer dstrect, double angle, @NativeType("SDL_FPoint const *") SDL_FPoint.@Nullable Buffer center, @NativeType("SDL_FlipMode") int flip) {
        if (CHECKS) {
            check(texture, 1);
            checkSafe(srcrect, 1);
            checkSafe(dstrect, 1);
            checkSafe(center, 1);
        }
        return nSDL_RenderTextureRotated(renderer, texture.address(), memAddressSafe(srcrect), memAddressSafe(dstrect), angle, memAddressSafe(center), flip);
    }

    // --- [ SDL_RenderTextureAffine ] ---

    /** {@code bool SDL_RenderTextureAffine(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FPoint const * origin, SDL_FPoint const * right, SDL_FPoint const * down)} */
    public static boolean nSDL_RenderTextureAffine(long renderer, long texture, long srcrect, long origin, long right, long down) {
        long __functionAddress = Functions.RenderTextureAffine;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPPPZ(renderer, texture, srcrect, origin, right, down, __functionAddress);
    }

    /** {@code bool SDL_RenderTextureAffine(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, SDL_FPoint const * origin, SDL_FPoint const * right, SDL_FPoint const * down)} */
    @NativeType("bool")
    public static boolean SDL_RenderTextureAffine(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture.Buffer texture, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer srcrect, @NativeType("SDL_FPoint const *") SDL_FPoint.@Nullable Buffer origin, @NativeType("SDL_FPoint const *") SDL_FPoint.@Nullable Buffer right, @NativeType("SDL_FPoint const *") SDL_FPoint.@Nullable Buffer down) {
        if (CHECKS) {
            check(texture, 1);
            checkSafe(srcrect, 1);
            checkSafe(origin, 1);
            checkSafe(right, 1);
            checkSafe(down, 1);
        }
        return nSDL_RenderTextureAffine(renderer, texture.address(), memAddressSafe(srcrect), memAddressSafe(origin), memAddressSafe(right), memAddressSafe(down));
    }

    // --- [ SDL_RenderTextureTiled ] ---

    /** {@code bool SDL_RenderTextureTiled(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, float scale, SDL_FRect const * dstrect)} */
    public static boolean nSDL_RenderTextureTiled(long renderer, long texture, long srcrect, float scale, long dstrect) {
        long __functionAddress = Functions.RenderTextureTiled;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPZ(renderer, texture, srcrect, scale, dstrect, __functionAddress);
    }

    /** {@code bool SDL_RenderTextureTiled(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, float scale, SDL_FRect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_RenderTextureTiled(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture.Buffer texture, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer srcrect, float scale, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer dstrect) {
        if (CHECKS) {
            check(texture, 1);
            checkSafe(srcrect, 1);
            checkSafe(dstrect, 1);
        }
        return nSDL_RenderTextureTiled(renderer, texture.address(), memAddressSafe(srcrect), scale, memAddressSafe(dstrect));
    }

    // --- [ SDL_RenderTexture9Grid ] ---

    /** {@code bool SDL_RenderTexture9Grid(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, SDL_FRect const * dstrect)} */
    public static boolean nSDL_RenderTexture9Grid(long renderer, long texture, long srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, long dstrect) {
        long __functionAddress = Functions.RenderTexture9Grid;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPZ(renderer, texture, srcrect, left_width, right_width, top_height, bottom_height, scale, dstrect, __functionAddress);
    }

    /** {@code bool SDL_RenderTexture9Grid(SDL_Renderer * renderer, SDL_Texture * texture, SDL_FRect const * srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, SDL_FRect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_RenderTexture9Grid(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture.Buffer texture, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer srcrect, float left_width, float right_width, float top_height, float bottom_height, float scale, @NativeType("SDL_FRect const *") SDL_FRect.@Nullable Buffer dstrect) {
        if (CHECKS) {
            check(texture, 1);
            checkSafe(srcrect, 1);
            checkSafe(dstrect, 1);
        }
        return nSDL_RenderTexture9Grid(renderer, texture.address(), memAddressSafe(srcrect), left_width, right_width, top_height, bottom_height, scale, memAddressSafe(dstrect));
    }

    // --- [ SDL_RenderGeometry ] ---

    /** {@code bool SDL_RenderGeometry(SDL_Renderer * renderer, SDL_Texture * texture, SDL_Vertex const * vertices, int num_vertices, int const * indices, int num_indices)} */
    public static boolean nSDL_RenderGeometry(long renderer, long texture, long vertices, int num_vertices, long indices, int num_indices) {
        long __functionAddress = Functions.RenderGeometry;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPZ(renderer, texture, vertices, num_vertices, indices, num_indices, __functionAddress);
    }

    /** {@code bool SDL_RenderGeometry(SDL_Renderer * renderer, SDL_Texture * texture, SDL_Vertex const * vertices, int num_vertices, int const * indices, int num_indices)} */
    @NativeType("bool")
    public static boolean SDL_RenderGeometry(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture.Buffer texture, @NativeType("SDL_Vertex const *") SDL_Vertex.Buffer vertices, @NativeType("int const *") IntBuffer indices) {
        if (CHECKS) {
            check(texture, 1);
        }
        return nSDL_RenderGeometry(renderer, texture.address(), vertices.address(), vertices.remaining(), memAddress(indices), indices.remaining());
    }

    // --- [ SDL_RenderGeometryRaw ] ---

    /** {@code bool SDL_RenderGeometryRaw(SDL_Renderer * renderer, SDL_Texture * texture, float const * xy, int xy_stride, SDL_FColor const * color, int color_stride, float const * uv, int uv_stride, int num_vertices, void const * indices, int num_indices, int size_indices)} */
    public static boolean nSDL_RenderGeometryRaw(long renderer, long texture, long xy, int xy_stride, long color, int color_stride, long uv, int uv_stride, int num_vertices, long indices, int num_indices, int size_indices) {
        long __functionAddress = Functions.RenderGeometryRaw;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPPPPPZ(renderer, texture, xy, xy_stride, color, color_stride, uv, uv_stride, num_vertices, indices, num_indices, size_indices, __functionAddress);
    }

    /** {@code bool SDL_RenderGeometryRaw(SDL_Renderer * renderer, SDL_Texture * texture, float const * xy, int xy_stride, SDL_FColor const * color, int color_stride, float const * uv, int uv_stride, int num_vertices, void const * indices, int num_indices, int size_indices)} */
    @NativeType("bool")
    public static boolean SDL_RenderGeometryRaw(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture.Buffer texture, @NativeType("float const *") @Nullable FloatBuffer xy, int xy_stride, @NativeType("SDL_FColor const *") SDL_FColor.@Nullable Buffer color, int color_stride, @NativeType("float const *") @Nullable FloatBuffer uv, int uv_stride, int num_vertices, @NativeType("void const *") @Nullable ByteBuffer indices, int num_indices, int size_indices) {
        if (CHECKS) {
            check(texture, 1);
            checkSafe(xy, xy_stride*num_vertices/4);
            checkSafe(color, color_stride*num_vertices/SDL_FColor.SIZEOF);
            checkSafe(uv, uv_stride*num_vertices/4);
            checkSafe(indices, num_indices*size_indices);
        }
        return nSDL_RenderGeometryRaw(renderer, texture.address(), memAddressSafe(xy), xy_stride, memAddressSafe(color), color_stride, memAddressSafe(uv), uv_stride, num_vertices, memAddressSafe(indices), num_indices, size_indices);
    }

    /** {@code bool SDL_RenderGeometryRaw(SDL_Renderer * renderer, SDL_Texture * texture, float const * xy, int xy_stride, SDL_FColor const * color, int color_stride, float const * uv, int uv_stride, int num_vertices, void const * indices, int num_indices, int size_indices)} */
    @NativeType("bool")
    public static boolean SDL_RenderGeometryRaw(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture.Buffer texture, @NativeType("float const *") @Nullable FloatBuffer xy, int xy_stride, @NativeType("SDL_FColor const *") SDL_FColor.@Nullable Buffer color, int color_stride, @NativeType("float const *") @Nullable FloatBuffer uv, int uv_stride, int num_vertices, @NativeType("void const *") @Nullable ShortBuffer indices, int num_indices, int size_indices) {
        if (CHECKS) {
            check(texture, 1);
            checkSafe(xy, xy_stride*num_vertices/4);
            checkSafe(color, color_stride*num_vertices/SDL_FColor.SIZEOF);
            checkSafe(uv, uv_stride*num_vertices/4);
            checkSafe(indices, num_indices*size_indices >> 1);
        }
        return nSDL_RenderGeometryRaw(renderer, texture.address(), memAddressSafe(xy), xy_stride, memAddressSafe(color), color_stride, memAddressSafe(uv), uv_stride, num_vertices, memAddressSafe(indices), num_indices, size_indices);
    }

    /** {@code bool SDL_RenderGeometryRaw(SDL_Renderer * renderer, SDL_Texture * texture, float const * xy, int xy_stride, SDL_FColor const * color, int color_stride, float const * uv, int uv_stride, int num_vertices, void const * indices, int num_indices, int size_indices)} */
    @NativeType("bool")
    public static boolean SDL_RenderGeometryRaw(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Texture *") SDL_Texture.Buffer texture, @NativeType("float const *") @Nullable FloatBuffer xy, int xy_stride, @NativeType("SDL_FColor const *") SDL_FColor.@Nullable Buffer color, int color_stride, @NativeType("float const *") @Nullable FloatBuffer uv, int uv_stride, int num_vertices, @NativeType("void const *") @Nullable IntBuffer indices, int num_indices, int size_indices) {
        if (CHECKS) {
            check(texture, 1);
            checkSafe(xy, xy_stride*num_vertices/4);
            checkSafe(color, color_stride*num_vertices/SDL_FColor.SIZEOF);
            checkSafe(uv, uv_stride*num_vertices/4);
            checkSafe(indices, num_indices*size_indices >> 2);
        }
        return nSDL_RenderGeometryRaw(renderer, texture.address(), memAddressSafe(xy), xy_stride, memAddressSafe(color), color_stride, memAddressSafe(uv), uv_stride, num_vertices, memAddressSafe(indices), num_indices, size_indices);
    }

    // --- [ SDL_RenderReadPixels ] ---

    /** {@code SDL_Surface * SDL_RenderReadPixels(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    public static long nSDL_RenderReadPixels(long renderer, long rect) {
        long __functionAddress = Functions.RenderReadPixels;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPP(renderer, rect, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_RenderReadPixels(SDL_Renderer * renderer, SDL_Rect const * rect)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_RenderReadPixels(@NativeType("SDL_Renderer *") long renderer, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer rect) {
        if (CHECKS) {
            checkSafe(rect, 1);
        }
        long __result = nSDL_RenderReadPixels(renderer, memAddressSafe(rect));
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_RenderPresent ] ---

    /** {@code bool SDL_RenderPresent(SDL_Renderer * renderer)} */
    @NativeType("bool")
    public static boolean SDL_RenderPresent(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.RenderPresent;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, __functionAddress);
    }

    // --- [ SDL_DestroyTexture ] ---

    /** {@code void SDL_DestroyTexture(SDL_Texture * texture)} */
    public static void nSDL_DestroyTexture(long texture) {
        long __functionAddress = Functions.DestroyTexture;
        invokePV(texture, __functionAddress);
    }

    /** {@code void SDL_DestroyTexture(SDL_Texture * texture)} */
    public static void SDL_DestroyTexture(@NativeType("SDL_Texture *") SDL_Texture texture) {
        nSDL_DestroyTexture(texture.address());
    }

    // --- [ SDL_DestroyRenderer ] ---

    /** {@code void SDL_DestroyRenderer(SDL_Renderer * renderer)} */
    public static void SDL_DestroyRenderer(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.DestroyRenderer;
        if (CHECKS) {
            check(renderer);
        }
        invokePV(renderer, __functionAddress);
    }

    // --- [ SDL_FlushRenderer ] ---

    /** {@code bool SDL_FlushRenderer(SDL_Renderer * renderer)} */
    @NativeType("bool")
    public static boolean SDL_FlushRenderer(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.FlushRenderer;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, __functionAddress);
    }

    // --- [ SDL_GetRenderMetalLayer ] ---

    /** {@code void * SDL_GetRenderMetalLayer(SDL_Renderer * renderer)} */
    @NativeType("void *")
    public static long SDL_GetRenderMetalLayer(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRenderMetalLayer;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    // --- [ SDL_GetRenderMetalCommandEncoder ] ---

    /** {@code void * SDL_GetRenderMetalCommandEncoder(SDL_Renderer * renderer)} */
    @NativeType("void *")
    public static long SDL_GetRenderMetalCommandEncoder(@NativeType("SDL_Renderer *") long renderer) {
        long __functionAddress = Functions.GetRenderMetalCommandEncoder;
        if (CHECKS) {
            check(renderer);
        }
        return invokePP(renderer, __functionAddress);
    }

    // --- [ SDL_AddVulkanRenderSemaphores ] ---

    /** {@code bool SDL_AddVulkanRenderSemaphores(SDL_Renderer * renderer, Uint32 wait_stage_mask, Sint64 wait_semaphore, Sint64 signal_semaphore)} */
    @NativeType("bool")
    public static boolean SDL_AddVulkanRenderSemaphores(@NativeType("SDL_Renderer *") long renderer, @NativeType("Uint32") int wait_stage_mask, @NativeType("Sint64") long wait_semaphore, @NativeType("Sint64") long signal_semaphore) {
        long __functionAddress = Functions.AddVulkanRenderSemaphores;
        if (CHECKS) {
            check(renderer);
        }
        return invokePJJZ(renderer, wait_stage_mask, wait_semaphore, signal_semaphore, __functionAddress);
    }

    // --- [ SDL_SetRenderVSync ] ---

    /** {@code bool SDL_SetRenderVSync(SDL_Renderer * renderer, int vsync)} */
    @NativeType("bool")
    public static boolean SDL_SetRenderVSync(@NativeType("SDL_Renderer *") long renderer, int vsync) {
        long __functionAddress = Functions.SetRenderVSync;
        if (CHECKS) {
            check(renderer);
        }
        return invokePZ(renderer, vsync, __functionAddress);
    }

    // --- [ SDL_GetRenderVSync ] ---

    /** {@code bool SDL_GetRenderVSync(SDL_Renderer * renderer, int * vsync)} */
    public static boolean nSDL_GetRenderVSync(long renderer, long vsync) {
        long __functionAddress = Functions.GetRenderVSync;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, vsync, __functionAddress);
    }

    /** {@code bool SDL_GetRenderVSync(SDL_Renderer * renderer, int * vsync)} */
    @NativeType("bool")
    public static boolean SDL_GetRenderVSync(@NativeType("SDL_Renderer *") long renderer, @NativeType("int *") IntBuffer vsync) {
        if (CHECKS) {
            check(vsync, 1);
        }
        return nSDL_GetRenderVSync(renderer, memAddress(vsync));
    }

    // --- [ SDL_RenderDebugText ] ---

    /** {@code bool SDL_RenderDebugText(SDL_Renderer * renderer, float x, float y, char const * str)} */
    public static boolean nSDL_RenderDebugText(long renderer, float x, float y, long str) {
        long __functionAddress = Functions.RenderDebugText;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, x, y, str, __functionAddress);
    }

    /** {@code bool SDL_RenderDebugText(SDL_Renderer * renderer, float x, float y, char const * str)} */
    @NativeType("bool")
    public static boolean SDL_RenderDebugText(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nSDL_RenderDebugText(renderer, x, y, memAddress(str));
    }

    /** {@code bool SDL_RenderDebugText(SDL_Renderer * renderer, float x, float y, char const * str)} */
    @NativeType("bool")
    public static boolean SDL_RenderDebugText(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nSDL_RenderDebugText(renderer, x, y, strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RenderDebugTextFormat ] ---

    /** {@code bool SDL_RenderDebugTextFormat(SDL_Renderer * renderer, float x, float y, char const * fmt)} */
    public static boolean nSDL_RenderDebugTextFormat(long renderer, float x, float y, long fmt) {
        long __functionAddress = Functions.RenderDebugTextFormat;
        if (CHECKS) {
            check(renderer);
        }
        return invokePPZ(renderer, x, y, fmt, __functionAddress);
    }

    /** {@code bool SDL_RenderDebugTextFormat(SDL_Renderer * renderer, float x, float y, char const * fmt)} */
    @NativeType("bool")
    public static boolean SDL_RenderDebugTextFormat(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        return nSDL_RenderDebugTextFormat(renderer, x, y, memAddress(fmt));
    }

    /** {@code bool SDL_RenderDebugTextFormat(SDL_Renderer * renderer, float x, float y, char const * fmt)} */
    @NativeType("bool")
    public static boolean SDL_RenderDebugTextFormat(@NativeType("SDL_Renderer *") long renderer, float x, float y, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            return nSDL_RenderDebugTextFormat(renderer, x, y, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetSensors ] ---

    /** {@code SDL_SensorID * SDL_GetSensors(int * count)} */
    public static long nSDL_GetSensors(long count) {
        long __functionAddress = Functions.GetSensors;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_SensorID * SDL_GetSensors(int * count)} */
    @NativeType("SDL_SensorID *")
    public static @Nullable IntBuffer SDL_GetSensors() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetSensors(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetSensorNameForID ] ---

    /** {@code char const * SDL_GetSensorNameForID(SDL_SensorID instance_id)} */
    public static long nSDL_GetSensorNameForID(int instance_id) {
        long __functionAddress = Functions.GetSensorNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetSensorNameForID(SDL_SensorID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetSensorNameForID(@NativeType("SDL_SensorID") int instance_id) {
        long __result = nSDL_GetSensorNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetSensorTypeForID ] ---

    /** {@code SDL_SensorType SDL_GetSensorTypeForID(SDL_SensorID instance_id)} */
    @NativeType("SDL_SensorType")
    public static int SDL_GetSensorTypeForID(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.GetSensorTypeForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_GetSensorNonPortableTypeForID ] ---

    /** {@code int SDL_GetSensorNonPortableTypeForID(SDL_SensorID instance_id)} */
    public static int SDL_GetSensorNonPortableTypeForID(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.GetSensorNonPortableTypeForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_OpenSensor ] ---

    /** {@code SDL_Sensor * SDL_OpenSensor(SDL_SensorID instance_id)} */
    @NativeType("SDL_Sensor *")
    public static long SDL_OpenSensor(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.OpenSensor;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetSensorFromID ] ---

    /** {@code SDL_Sensor * SDL_GetSensorFromID(SDL_SensorID instance_id)} */
    @NativeType("SDL_Sensor *")
    public static long SDL_GetSensorFromID(@NativeType("SDL_SensorID") int instance_id) {
        long __functionAddress = Functions.GetSensorFromID;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetSensorProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetSensorProperties(SDL_Sensor * sensor)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetSensorProperties(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorProperties;
        if (CHECKS) {
            check(sensor);
        }
        return invokePI(sensor, __functionAddress);
    }

    // --- [ SDL_GetSensorName ] ---

    /** {@code char const * SDL_GetSensorName(SDL_Sensor * sensor)} */
    public static long nSDL_GetSensorName(long sensor) {
        long __functionAddress = Functions.GetSensorName;
        if (CHECKS) {
            check(sensor);
        }
        return invokePP(sensor, __functionAddress);
    }

    /** {@code char const * SDL_GetSensorName(SDL_Sensor * sensor)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetSensorName(@NativeType("SDL_Sensor *") long sensor) {
        long __result = nSDL_GetSensorName(sensor);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetSensorType ] ---

    /** {@code SDL_SensorType SDL_GetSensorType(SDL_Sensor * sensor)} */
    @NativeType("SDL_SensorType")
    public static int SDL_GetSensorType(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorType;
        if (CHECKS) {
            check(sensor);
        }
        return invokePI(sensor, __functionAddress);
    }

    // --- [ SDL_GetSensorNonPortableType ] ---

    /** {@code int SDL_GetSensorNonPortableType(SDL_Sensor * sensor)} */
    public static int SDL_GetSensorNonPortableType(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorNonPortableType;
        if (CHECKS) {
            check(sensor);
        }
        return invokePI(sensor, __functionAddress);
    }

    // --- [ SDL_GetSensorID ] ---

    /** {@code SDL_SensorID SDL_GetSensorID(SDL_Sensor * sensor)} */
    @NativeType("SDL_SensorID")
    public static int SDL_GetSensorID(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.GetSensorID;
        if (CHECKS) {
            check(sensor);
        }
        return invokePI(sensor, __functionAddress);
    }

    // --- [ SDL_GetSensorData ] ---

    /** {@code bool SDL_GetSensorData(SDL_Sensor * sensor, float * data, int num_values)} */
    public static boolean nSDL_GetSensorData(long sensor, long data, int num_values) {
        long __functionAddress = Functions.GetSensorData;
        if (CHECKS) {
            check(sensor);
        }
        return invokePPZ(sensor, data, num_values, __functionAddress);
    }

    /** {@code bool SDL_GetSensorData(SDL_Sensor * sensor, float * data, int num_values)} */
    @NativeType("bool")
    public static boolean SDL_GetSensorData(@NativeType("SDL_Sensor *") long sensor, @NativeType("float *") FloatBuffer data) {
        return nSDL_GetSensorData(sensor, memAddress(data), data.remaining());
    }

    // --- [ SDL_CloseSensor ] ---

    /** {@code void SDL_CloseSensor(SDL_Sensor * sensor)} */
    public static void SDL_CloseSensor(@NativeType("SDL_Sensor *") long sensor) {
        long __functionAddress = Functions.CloseSensor;
        if (CHECKS) {
            check(sensor);
        }
        invokePV(sensor, __functionAddress);
    }

    // --- [ SDL_UpdateSensors ] ---

    /** {@code void SDL_UpdateSensors(void)} */
    public static void SDL_UpdateSensors() {
        long __functionAddress = Functions.UpdateSensors;
        invokeV(__functionAddress);
    }

    // --- [ SDL_malloc ] ---

    /** {@code void * SDL_malloc(size_t size)} */
    public static long nSDL_malloc(long size) {
        long __functionAddress = Functions.malloc;
        return invokePP(size, __functionAddress);
    }

    /** {@code void * SDL_malloc(size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_malloc(@NativeType("size_t") long size) {
        long __result = nSDL_malloc(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ SDL_calloc ] ---

    /** {@code void * SDL_calloc(size_t nmemb, size_t size)} */
    public static long nSDL_calloc(long nmemb, long size) {
        long __functionAddress = Functions.calloc;
        return invokePPP(nmemb, size, __functionAddress);
    }

    /** {@code void * SDL_calloc(size_t nmemb, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_calloc(@NativeType("size_t") long nmemb, @NativeType("size_t") long size) {
        long __result = nSDL_calloc(nmemb, size);
        return memByteBufferSafe(__result, (int)nmemb * (int)size);
    }

    // --- [ SDL_realloc ] ---

    /** {@code void * SDL_realloc(void * mem, size_t size)} */
    public static long nSDL_realloc(long mem, long size) {
        long __functionAddress = Functions.realloc;
        return invokePPP(mem, size, __functionAddress);
    }

    /** {@code void * SDL_realloc(void * mem, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_realloc(@NativeType("void *") @Nullable ByteBuffer mem, @NativeType("size_t") long size) {
        long __result = nSDL_realloc(memAddressSafe(mem), size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ SDL_free ] ---

    /** {@code void SDL_free(void * mem)} */
    public static void nSDL_free(long mem) {
        long __functionAddress = Functions.free;
        invokePV(mem, __functionAddress);
    }

    /** {@code void SDL_free(void * mem)} */
    public static void SDL_free(@NativeType("void *") @Nullable ByteBuffer mem) {
        nSDL_free(memAddressSafe(mem));
    }

    // --- [ SDL_GetOriginalMemoryFunctions ] ---

    /** {@code void SDL_GetOriginalMemoryFunctions(SDL_malloc_func * malloc_func, SDL_calloc_func * calloc_func, SDL_realloc_func * realloc_func, SDL_free_func * free_func)} */
    public static void nSDL_GetOriginalMemoryFunctions(long malloc_func, long calloc_func, long realloc_func, long free_func) {
        long __functionAddress = Functions.GetOriginalMemoryFunctions;
        invokePPPPV(malloc_func, calloc_func, realloc_func, free_func, __functionAddress);
    }

    /** {@code void SDL_GetOriginalMemoryFunctions(SDL_malloc_func * malloc_func, SDL_calloc_func * calloc_func, SDL_realloc_func * realloc_func, SDL_free_func * free_func)} */
    public static void SDL_GetOriginalMemoryFunctions(@NativeType("SDL_malloc_func *") PointerBuffer malloc_func, @NativeType("SDL_calloc_func *") PointerBuffer calloc_func, @NativeType("SDL_realloc_func *") PointerBuffer realloc_func, @NativeType("SDL_free_func *") PointerBuffer free_func) {
        if (CHECKS) {
            check(malloc_func, 1);
            check(calloc_func, 1);
            check(realloc_func, 1);
            check(free_func, 1);
        }
        nSDL_GetOriginalMemoryFunctions(memAddress(malloc_func), memAddress(calloc_func), memAddress(realloc_func), memAddress(free_func));
    }

    // --- [ SDL_GetMemoryFunctions ] ---

    /** {@code void SDL_GetMemoryFunctions(SDL_malloc_func * malloc_func, SDL_calloc_func * calloc_func, SDL_realloc_func * realloc_func, SDL_free_func * free_func)} */
    public static void nSDL_GetMemoryFunctions(long malloc_func, long calloc_func, long realloc_func, long free_func) {
        long __functionAddress = Functions.GetMemoryFunctions;
        invokePPPPV(malloc_func, calloc_func, realloc_func, free_func, __functionAddress);
    }

    /** {@code void SDL_GetMemoryFunctions(SDL_malloc_func * malloc_func, SDL_calloc_func * calloc_func, SDL_realloc_func * realloc_func, SDL_free_func * free_func)} */
    public static void SDL_GetMemoryFunctions(@NativeType("SDL_malloc_func *") PointerBuffer malloc_func, @NativeType("SDL_calloc_func *") PointerBuffer calloc_func, @NativeType("SDL_realloc_func *") PointerBuffer realloc_func, @NativeType("SDL_free_func *") PointerBuffer free_func) {
        if (CHECKS) {
            check(malloc_func, 1);
            check(calloc_func, 1);
            check(realloc_func, 1);
            check(free_func, 1);
        }
        nSDL_GetMemoryFunctions(memAddress(malloc_func), memAddress(calloc_func), memAddress(realloc_func), memAddress(free_func));
    }

    // --- [ SDL_SetMemoryFunctions ] ---

    /** {@code bool SDL_SetMemoryFunctions(SDL_malloc_func malloc_func, SDL_calloc_func calloc_func, SDL_realloc_func realloc_func, SDL_free_func free_func)} */
    public static boolean nSDL_SetMemoryFunctions(long malloc_func, long calloc_func, long realloc_func, long free_func) {
        long __functionAddress = Functions.SetMemoryFunctions;
        return invokePPPPZ(malloc_func, calloc_func, realloc_func, free_func, __functionAddress);
    }

    /** {@code bool SDL_SetMemoryFunctions(SDL_malloc_func malloc_func, SDL_calloc_func calloc_func, SDL_realloc_func realloc_func, SDL_free_func free_func)} */
    @NativeType("bool")
    public static boolean SDL_SetMemoryFunctions(@NativeType("SDL_malloc_func") SDL_malloc_funcI malloc_func, @NativeType("SDL_calloc_func") SDL_calloc_funcI calloc_func, @NativeType("SDL_realloc_func") SDL_realloc_funcI realloc_func, @NativeType("SDL_free_func") SDL_free_funcI free_func) {
        return nSDL_SetMemoryFunctions(malloc_func.address(), calloc_func.address(), realloc_func.address(), free_func.address());
    }

    // --- [ SDL_aligned_alloc ] ---

    /** {@code void * SDL_aligned_alloc(size_t alignment, size_t size)} */
    public static long nSDL_aligned_alloc(long alignment, long size) {
        long __functionAddress = Functions.aligned_alloc;
        return invokePPP(alignment, size, __functionAddress);
    }

    /** {@code void * SDL_aligned_alloc(size_t alignment, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_aligned_alloc(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = nSDL_aligned_alloc(alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ SDL_aligned_free ] ---

    /** {@code void SDL_aligned_free(void * mem)} */
    public static void nSDL_aligned_free(long mem) {
        long __functionAddress = Functions.aligned_free;
        invokePV(mem, __functionAddress);
    }

    /** {@code void SDL_aligned_free(void * mem)} */
    public static void SDL_aligned_free(@NativeType("void *") @Nullable ByteBuffer mem) {
        nSDL_aligned_free(memAddressSafe(mem));
    }

    // --- [ SDL_GetNumAllocations ] ---

    /** {@code int SDL_GetNumAllocations(void)} */
    public static int SDL_GetNumAllocations() {
        long __functionAddress = Functions.GetNumAllocations;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_abs ] ---

    /** {@code int SDL_abs(int x)} */
    public static int SDL_abs(int x) {
        long __functionAddress = Functions.abs;
        return invokeI(x, __functionAddress);
    }

    // --- [ SDL_isalpha ] ---

    /** {@code int SDL_isalpha(int x)} */
    @NativeType("int")
    public static boolean SDL_isalpha(int x) {
        long __functionAddress = Functions.isalpha;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_isalnum ] ---

    /** {@code int SDL_isalnum(int x)} */
    @NativeType("int")
    public static boolean SDL_isalnum(int x) {
        long __functionAddress = Functions.isalnum;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_isblank ] ---

    /** {@code int SDL_isblank(int x)} */
    @NativeType("int")
    public static boolean SDL_isblank(int x) {
        long __functionAddress = Functions.isblank;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_iscntrl ] ---

    /** {@code int SDL_iscntrl(int x)} */
    @NativeType("int")
    public static boolean SDL_iscntrl(int x) {
        long __functionAddress = Functions.iscntrl;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_isdigit ] ---

    /** {@code int SDL_isdigit(int x)} */
    @NativeType("int")
    public static boolean SDL_isdigit(int x) {
        long __functionAddress = Functions.isdigit;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_isxdigit ] ---

    /** {@code int SDL_isxdigit(int x)} */
    @NativeType("int")
    public static boolean SDL_isxdigit(int x) {
        long __functionAddress = Functions.isxdigit;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_ispunct ] ---

    /** {@code int SDL_ispunct(int x)} */
    @NativeType("int")
    public static boolean SDL_ispunct(int x) {
        long __functionAddress = Functions.ispunct;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_isspace ] ---

    /** {@code int SDL_isspace(int x)} */
    @NativeType("int")
    public static boolean SDL_isspace(int x) {
        long __functionAddress = Functions.isspace;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_isupper ] ---

    /** {@code int SDL_isupper(int x)} */
    @NativeType("int")
    public static boolean SDL_isupper(int x) {
        long __functionAddress = Functions.isupper;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_islower ] ---

    /** {@code int SDL_islower(int x)} */
    @NativeType("int")
    public static boolean SDL_islower(int x) {
        long __functionAddress = Functions.islower;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_isprint ] ---

    /** {@code int SDL_isprint(int x)} */
    @NativeType("int")
    public static boolean SDL_isprint(int x) {
        long __functionAddress = Functions.isprint;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_isgraph ] ---

    /** {@code int SDL_isgraph(int x)} */
    @NativeType("int")
    public static boolean SDL_isgraph(int x) {
        long __functionAddress = Functions.isgraph;
        return invokeI(x, __functionAddress) != 0;
    }

    // --- [ SDL_toupper ] ---

    /** {@code int SDL_toupper(int x)} */
    public static int SDL_toupper(int x) {
        long __functionAddress = Functions.toupper;
        return invokeI(x, __functionAddress);
    }

    // --- [ SDL_tolower ] ---

    /** {@code int SDL_tolower(int x)} */
    public static int SDL_tolower(int x) {
        long __functionAddress = Functions.tolower;
        return invokeI(x, __functionAddress);
    }

    // --- [ SDL_crc16 ] ---

    /** {@code Uint16 SDL_crc16(Uint16 crc, void const * data, size_t len)} */
    public static short nSDL_crc16(short crc, long data, long len) {
        long __functionAddress = Functions.crc16;
        return invokeCPPC(crc, data, len, __functionAddress);
    }

    /** {@code Uint16 SDL_crc16(Uint16 crc, void const * data, size_t len)} */
    @NativeType("Uint16")
    public static short SDL_crc16(@NativeType("Uint16") short crc, @NativeType("void const *") ByteBuffer data) {
        return nSDL_crc16(crc, memAddress(data), data.remaining());
    }

    // --- [ SDL_crc32 ] ---

    /** {@code Uint32 SDL_crc32(Uint32 crc, void const * data, size_t len)} */
    public static int nSDL_crc32(int crc, long data, long len) {
        long __functionAddress = Functions.crc32;
        return invokePPI(crc, data, len, __functionAddress);
    }

    /** {@code Uint32 SDL_crc32(Uint32 crc, void const * data, size_t len)} */
    @NativeType("Uint32")
    public static int SDL_crc32(@NativeType("Uint32") int crc, @NativeType("void const *") ByteBuffer data) {
        return nSDL_crc32(crc, memAddress(data), data.remaining());
    }

    // --- [ SDL_murmur3_32 ] ---

    /** {@code Uint32 SDL_murmur3_32(void const * data, size_t len, Uint32 seed)} */
    public static int nSDL_murmur3_32(long data, long len, int seed) {
        long __functionAddress = Functions.murmur3_32;
        return invokePPI(data, len, seed, __functionAddress);
    }

    /** {@code Uint32 SDL_murmur3_32(void const * data, size_t len, Uint32 seed)} */
    @NativeType("Uint32")
    public static int SDL_murmur3_32(@NativeType("void const *") ByteBuffer data, @NativeType("Uint32") int seed) {
        return nSDL_murmur3_32(memAddress(data), data.remaining(), seed);
    }

    // --- [ SDL_srand ] ---

    /** {@code void SDL_srand(Uint64 seed)} */
    public static void SDL_srand(@NativeType("Uint64") long seed) {
        long __functionAddress = Functions.srand;
        invokeJV(seed, __functionAddress);
    }

    // --- [ SDL_rand ] ---

    /** {@code Sint32 SDL_rand(Sint32 n)} */
    @NativeType("Sint32")
    public static int SDL_rand(@NativeType("Sint32") int n) {
        long __functionAddress = Functions.rand;
        return invokeI(n, __functionAddress);
    }

    // --- [ SDL_randf ] ---

    /** {@code float SDL_randf(void)} */
    public static float SDL_randf() {
        long __functionAddress = Functions.randf;
        return invokeF(__functionAddress);
    }

    // --- [ SDL_rand_bits ] ---

    /** {@code Uint32 SDL_rand_bits(void)} */
    @NativeType("Uint32")
    public static int SDL_rand_bits() {
        long __functionAddress = Functions.rand_bits;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_rand_r ] ---

    /** {@code Sint32 SDL_rand_r(Uint64 * state, Sint32 n)} */
    public static int nSDL_rand_r(long state, int n) {
        long __functionAddress = Functions.rand_r;
        return invokePI(state, n, __functionAddress);
    }

    /** {@code Sint32 SDL_rand_r(Uint64 * state, Sint32 n)} */
    @NativeType("Sint32")
    public static int SDL_rand_r(@NativeType("Uint64 *") LongBuffer state, @NativeType("Sint32") int n) {
        if (CHECKS) {
            check(state, 1);
        }
        return nSDL_rand_r(memAddress(state), n);
    }

    // --- [ SDL_randf_r ] ---

    /** {@code float SDL_randf_r(Uint64 * state)} */
    public static float nSDL_randf_r(long state) {
        long __functionAddress = Functions.randf_r;
        return invokePF(state, __functionAddress);
    }

    /** {@code float SDL_randf_r(Uint64 * state)} */
    public static float SDL_randf_r(@NativeType("Uint64 *") LongBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nSDL_randf_r(memAddress(state));
    }

    // --- [ SDL_rand_bits_r ] ---

    /** {@code Uint32 SDL_rand_bits_r(Uint64 * state)} */
    public static int nSDL_rand_bits_r(long state) {
        long __functionAddress = Functions.rand_bits_r;
        return invokePI(state, __functionAddress);
    }

    /** {@code Uint32 SDL_rand_bits_r(Uint64 * state)} */
    @NativeType("Uint32")
    public static int SDL_rand_bits_r(@NativeType("Uint64 *") LongBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nSDL_rand_bits_r(memAddress(state));
    }

    // --- [ SDL_acos ] ---

    /** {@code double SDL_acos(double x)} */
    public static double SDL_acos(double x) {
        long __functionAddress = Functions.acos;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_acosf ] ---

    /** {@code float SDL_acosf(float x)} */
    public static float SDL_acosf(float x) {
        long __functionAddress = Functions.acosf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_asin ] ---

    /** {@code double SDL_asin(double x)} */
    public static double SDL_asin(double x) {
        long __functionAddress = Functions.asin;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_asinf ] ---

    /** {@code float SDL_asinf(float x)} */
    public static float SDL_asinf(float x) {
        long __functionAddress = Functions.asinf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_atan ] ---

    /** {@code double SDL_atan(double x)} */
    public static double SDL_atan(double x) {
        long __functionAddress = Functions.atan;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_atanf ] ---

    /** {@code float SDL_atanf(float x)} */
    public static float SDL_atanf(float x) {
        long __functionAddress = Functions.atanf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_atan2 ] ---

    /** {@code double SDL_atan2(double y, double x)} */
    public static double SDL_atan2(double y, double x) {
        long __functionAddress = Functions.atan2;
        return invokeD(y, x, __functionAddress);
    }

    // --- [ SDL_atan2f ] ---

    /** {@code float SDL_atan2f(float y, float x)} */
    public static float SDL_atan2f(float y, float x) {
        long __functionAddress = Functions.atan2f;
        return invokeF(y, x, __functionAddress);
    }

    // --- [ SDL_ceil ] ---

    /** {@code double SDL_ceil(double x)} */
    public static double SDL_ceil(double x) {
        long __functionAddress = Functions.ceil;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_ceilf ] ---

    /** {@code float SDL_ceilf(float x)} */
    public static float SDL_ceilf(float x) {
        long __functionAddress = Functions.ceilf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_copysign ] ---

    /** {@code double SDL_copysign(double x, double y)} */
    public static double SDL_copysign(double x, double y) {
        long __functionAddress = Functions.copysign;
        return invokeD(x, y, __functionAddress);
    }

    // --- [ SDL_copysignf ] ---

    /** {@code float SDL_copysignf(float x, float y)} */
    public static float SDL_copysignf(float x, float y) {
        long __functionAddress = Functions.copysignf;
        return invokeF(x, y, __functionAddress);
    }

    // --- [ SDL_cos ] ---

    /** {@code double SDL_cos(double x)} */
    public static double SDL_cos(double x) {
        long __functionAddress = Functions.cos;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_cosf ] ---

    /** {@code float SDL_cosf(float x)} */
    public static float SDL_cosf(float x) {
        long __functionAddress = Functions.cosf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_exp ] ---

    /** {@code double SDL_exp(double x)} */
    public static double SDL_exp(double x) {
        long __functionAddress = Functions.exp;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_expf ] ---

    /** {@code float SDL_expf(float x)} */
    public static float SDL_expf(float x) {
        long __functionAddress = Functions.expf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_fabs ] ---

    /** {@code double SDL_fabs(double x)} */
    public static double SDL_fabs(double x) {
        long __functionAddress = Functions.fabs;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_fabsf ] ---

    /** {@code float SDL_fabsf(float x)} */
    public static float SDL_fabsf(float x) {
        long __functionAddress = Functions.fabsf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_floor ] ---

    /** {@code double SDL_floor(double x)} */
    public static double SDL_floor(double x) {
        long __functionAddress = Functions.floor;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_floorf ] ---

    /** {@code float SDL_floorf(float x)} */
    public static float SDL_floorf(float x) {
        long __functionAddress = Functions.floorf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_trunc ] ---

    /** {@code double SDL_trunc(double x)} */
    public static double SDL_trunc(double x) {
        long __functionAddress = Functions.trunc;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_truncf ] ---

    /** {@code float SDL_truncf(float x)} */
    public static float SDL_truncf(float x) {
        long __functionAddress = Functions.truncf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_fmod ] ---

    /** {@code double SDL_fmod(double x, double y)} */
    public static double SDL_fmod(double x, double y) {
        long __functionAddress = Functions.fmod;
        return invokeD(x, y, __functionAddress);
    }

    // --- [ SDL_fmodf ] ---

    /** {@code float SDL_fmodf(float x, float y)} */
    public static float SDL_fmodf(float x, float y) {
        long __functionAddress = Functions.fmodf;
        return invokeF(x, y, __functionAddress);
    }

    // --- [ SDL_isinf ] ---

    /** {@code int SDL_isinf(double x)} */
    public static int SDL_isinf(double x) {
        long __functionAddress = Functions.isinf;
        return invokeI(x, __functionAddress);
    }

    // --- [ SDL_isinff ] ---

    /** {@code int SDL_isinff(float x)} */
    public static int SDL_isinff(float x) {
        long __functionAddress = Functions.isinff;
        return invokeI(x, __functionAddress);
    }

    // --- [ SDL_isnan ] ---

    /** {@code int SDL_isnan(double x)} */
    public static int SDL_isnan(double x) {
        long __functionAddress = Functions.isnan;
        return invokeI(x, __functionAddress);
    }

    // --- [ SDL_isnanf ] ---

    /** {@code int SDL_isnanf(float x)} */
    public static int SDL_isnanf(float x) {
        long __functionAddress = Functions.isnanf;
        return invokeI(x, __functionAddress);
    }

    // --- [ SDL_log ] ---

    /** {@code double SDL_log(double x)} */
    public static double SDL_log(double x) {
        long __functionAddress = Functions.log;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_logf ] ---

    /** {@code float SDL_logf(float x)} */
    public static float SDL_logf(float x) {
        long __functionAddress = Functions.logf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_log10 ] ---

    /** {@code double SDL_log10(double x)} */
    public static double SDL_log10(double x) {
        long __functionAddress = Functions.log10;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_log10f ] ---

    /** {@code float SDL_log10f(float x)} */
    public static float SDL_log10f(float x) {
        long __functionAddress = Functions.log10f;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_modf ] ---

    /** {@code double SDL_modf(double x, double * y)} */
    public static double nSDL_modf(double x, long y) {
        long __functionAddress = Functions.modf;
        return invokePD(x, y, __functionAddress);
    }

    /** {@code double SDL_modf(double x, double * y)} */
    public static double SDL_modf(double x, @NativeType("double *") DoubleBuffer y) {
        if (CHECKS) {
            check(y, 1);
        }
        return nSDL_modf(x, memAddress(y));
    }

    // --- [ SDL_modff ] ---

    /** {@code float SDL_modff(float x, float * y)} */
    public static float nSDL_modff(float x, long y) {
        long __functionAddress = Functions.modff;
        return invokePF(x, y, __functionAddress);
    }

    /** {@code float SDL_modff(float x, float * y)} */
    public static float SDL_modff(float x, @NativeType("float *") FloatBuffer y) {
        if (CHECKS) {
            check(y, 1);
        }
        return nSDL_modff(x, memAddress(y));
    }

    // --- [ SDL_pow ] ---

    /** {@code double SDL_pow(double x, double y)} */
    public static double SDL_pow(double x, double y) {
        long __functionAddress = Functions.pow;
        return invokeD(x, y, __functionAddress);
    }

    // --- [ SDL_powf ] ---

    /** {@code float SDL_powf(float x, float y)} */
    public static float SDL_powf(float x, float y) {
        long __functionAddress = Functions.powf;
        return invokeF(x, y, __functionAddress);
    }

    // --- [ SDL_round ] ---

    /** {@code double SDL_round(double x)} */
    public static double SDL_round(double x) {
        long __functionAddress = Functions.round;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_roundf ] ---

    /** {@code float SDL_roundf(float x)} */
    public static float SDL_roundf(float x) {
        long __functionAddress = Functions.roundf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_lround ] ---

    /** {@code long SDL_lround(double x)} */
    public static long SDL_lround(double x) {
        long __functionAddress = Functions.lround;
        return invokeN(x, __functionAddress);
    }

    // --- [ SDL_lroundf ] ---

    /** {@code long SDL_lroundf(float x)} */
    public static long SDL_lroundf(float x) {
        long __functionAddress = Functions.lroundf;
        return invokeN(x, __functionAddress);
    }

    // --- [ SDL_scalbn ] ---

    /** {@code double SDL_scalbn(double x, int n)} */
    public static double SDL_scalbn(double x, int n) {
        long __functionAddress = Functions.scalbn;
        return invokeD(x, n, __functionAddress);
    }

    // --- [ SDL_scalbnf ] ---

    /** {@code float SDL_scalbnf(float x, int n)} */
    public static float SDL_scalbnf(float x, int n) {
        long __functionAddress = Functions.scalbnf;
        return invokeF(x, n, __functionAddress);
    }

    // --- [ SDL_sin ] ---

    /** {@code double SDL_sin(double x)} */
    public static double SDL_sin(double x) {
        long __functionAddress = Functions.sin;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_sinf ] ---

    /** {@code float SDL_sinf(float x)} */
    public static float SDL_sinf(float x) {
        long __functionAddress = Functions.sinf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_sqrt ] ---

    /** {@code double SDL_sqrt(double x)} */
    public static double SDL_sqrt(double x) {
        long __functionAddress = Functions.sqrt;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_sqrtf ] ---

    /** {@code float SDL_sqrtf(float x)} */
    public static float SDL_sqrtf(float x) {
        long __functionAddress = Functions.sqrtf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_tan ] ---

    /** {@code double SDL_tan(double x)} */
    public static double SDL_tan(double x) {
        long __functionAddress = Functions.tan;
        return invokeD(x, __functionAddress);
    }

    // --- [ SDL_tanf ] ---

    /** {@code float SDL_tanf(float x)} */
    public static float SDL_tanf(float x) {
        long __functionAddress = Functions.tanf;
        return invokeF(x, __functionAddress);
    }

    // --- [ SDL_FOURCC ] ---

    /** {@code uint32_t SDL_FOURCC(uint8_t A, uint8_t B, uint8_t C, uint8_t D)} */
    @NativeType("uint32_t")
    public static int SDL_FOURCC(@NativeType("uint8_t") byte A, @NativeType("uint8_t") byte B, @NativeType("uint8_t") byte C, @NativeType("uint8_t") byte D) {
        return ((((int)A) & 0xFF) << 0) | ((((int)B) & 0xFF) << 8) | ((((int)C) & 0xFF) << 16) | ((((int)D) & 0xFF) << 24);
    }

    // --- [ SDL_OpenTitleStorage ] ---

    /** {@code SDL_Storage * SDL_OpenTitleStorage(char const * override, SDL_PropertiesID props)} */
    public static long nSDL_OpenTitleStorage(long override, int props) {
        long __functionAddress = Functions.OpenTitleStorage;
        return invokePP(override, props, __functionAddress);
    }

    /** {@code SDL_Storage * SDL_OpenTitleStorage(char const * override, SDL_PropertiesID props)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenTitleStorage(@NativeType("char const *") @Nullable ByteBuffer override, @NativeType("SDL_PropertiesID") int props) {
        if (CHECKS) {
            checkNT1Safe(override);
        }
        return nSDL_OpenTitleStorage(memAddressSafe(override), props);
    }

    /** {@code SDL_Storage * SDL_OpenTitleStorage(char const * override, SDL_PropertiesID props)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenTitleStorage(@NativeType("char const *") @Nullable CharSequence override, @NativeType("SDL_PropertiesID") int props) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(override, true);
            long overrideEncoded = override == null ? NULL : stack.getPointerAddress();
            return nSDL_OpenTitleStorage(overrideEncoded, props);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_OpenUserStorage ] ---

    /** {@code SDL_Storage * SDL_OpenUserStorage(char const * org, char const * app, SDL_PropertiesID props)} */
    public static long nSDL_OpenUserStorage(long org, long app, int props) {
        long __functionAddress = Functions.OpenUserStorage;
        return invokePPP(org, app, props, __functionAddress);
    }

    /** {@code SDL_Storage * SDL_OpenUserStorage(char const * org, char const * app, SDL_PropertiesID props)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenUserStorage(@NativeType("char const *") ByteBuffer org, @NativeType("char const *") ByteBuffer app, @NativeType("SDL_PropertiesID") int props) {
        if (CHECKS) {
            checkNT1(org);
            checkNT1(app);
        }
        return nSDL_OpenUserStorage(memAddress(org), memAddress(app), props);
    }

    /** {@code SDL_Storage * SDL_OpenUserStorage(char const * org, char const * app, SDL_PropertiesID props)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenUserStorage(@NativeType("char const *") CharSequence org, @NativeType("char const *") CharSequence app, @NativeType("SDL_PropertiesID") int props) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(org, true);
            long orgEncoded = stack.getPointerAddress();
            stack.nUTF8(app, true);
            long appEncoded = stack.getPointerAddress();
            return nSDL_OpenUserStorage(orgEncoded, appEncoded, props);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_OpenFileStorage ] ---

    /** {@code SDL_Storage * SDL_OpenFileStorage(char const * path)} */
    public static long nSDL_OpenFileStorage(long path) {
        long __functionAddress = Functions.OpenFileStorage;
        return invokePP(path, __functionAddress);
    }

    /** {@code SDL_Storage * SDL_OpenFileStorage(char const * path)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenFileStorage(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_OpenFileStorage(memAddress(path));
    }

    /** {@code SDL_Storage * SDL_OpenFileStorage(char const * path)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenFileStorage(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_OpenFileStorage(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_OpenStorage ] ---

    /** {@code SDL_Storage * SDL_OpenStorage(SDL_StorageInterface const * iface, void * userdata)} */
    public static long nSDL_OpenStorage(long iface, long userdata) {
        long __functionAddress = Functions.OpenStorage;
        if (CHECKS) {
            Struct.validate(iface, 1, SDL_StorageInterface.SIZEOF, SDL_StorageInterface::validate);
        }
        return invokePPP(iface, userdata, __functionAddress);
    }

    /** {@code SDL_Storage * SDL_OpenStorage(SDL_StorageInterface const * iface, void * userdata)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenStorage(@NativeType("SDL_StorageInterface const *") SDL_StorageInterface.Buffer iface, @NativeType("void *") long userdata) {
        if (CHECKS) {
            check(iface, 1);
        }
        return nSDL_OpenStorage(iface.address(), userdata);
    }

    // --- [ SDL_CloseStorage ] ---

    /** {@code bool SDL_CloseStorage(SDL_Storage * storage)} */
    @NativeType("bool")
    public static boolean SDL_CloseStorage(@NativeType("SDL_Storage *") long storage) {
        long __functionAddress = Functions.CloseStorage;
        if (CHECKS) {
            check(storage);
        }
        return invokePZ(storage, __functionAddress);
    }

    // --- [ SDL_StorageReady ] ---

    /** {@code bool SDL_StorageReady(SDL_Storage * storage)} */
    @NativeType("bool")
    public static boolean SDL_StorageReady(@NativeType("SDL_Storage *") long storage) {
        long __functionAddress = Functions.StorageReady;
        if (CHECKS) {
            check(storage);
        }
        return invokePZ(storage, __functionAddress);
    }

    // --- [ SDL_GetStorageFileSize ] ---

    /** {@code bool SDL_GetStorageFileSize(SDL_Storage * storage, char const * path, Uint64 * length)} */
    public static boolean nSDL_GetStorageFileSize(long storage, long path, long length) {
        long __functionAddress = Functions.GetStorageFileSize;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPZ(storage, path, length, __functionAddress);
    }

    /** {@code bool SDL_GetStorageFileSize(SDL_Storage * storage, char const * path, Uint64 * length)} */
    @NativeType("bool")
    public static boolean SDL_GetStorageFileSize(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("Uint64 *") LongBuffer length) {
        if (CHECKS) {
            checkNT1(path);
            check(length, 1);
        }
        return nSDL_GetStorageFileSize(storage, memAddress(path), memAddress(length));
    }

    /** {@code bool SDL_GetStorageFileSize(SDL_Storage * storage, char const * path, Uint64 * length)} */
    @NativeType("bool")
    public static boolean SDL_GetStorageFileSize(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("Uint64 *") LongBuffer length) {
        if (CHECKS) {
            check(length, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_GetStorageFileSize(storage, pathEncoded, memAddress(length));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ReadStorageFile ] ---

    /** {@code bool SDL_ReadStorageFile(SDL_Storage * storage, char const * path, void * destination, Uint64 length)} */
    public static boolean nSDL_ReadStorageFile(long storage, long path, long destination, long length) {
        long __functionAddress = Functions.ReadStorageFile;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPJZ(storage, path, destination, length, __functionAddress);
    }

    /** {@code bool SDL_ReadStorageFile(SDL_Storage * storage, char const * path, void * destination, Uint64 length)} */
    @NativeType("bool")
    public static boolean SDL_ReadStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("void *") ByteBuffer destination) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_ReadStorageFile(storage, memAddress(path), memAddress(destination), destination.remaining());
    }

    /** {@code bool SDL_ReadStorageFile(SDL_Storage * storage, char const * path, void * destination, Uint64 length)} */
    @NativeType("bool")
    public static boolean SDL_ReadStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("void *") ByteBuffer destination) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_ReadStorageFile(storage, pathEncoded, memAddress(destination), destination.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_WriteStorageFile ] ---

    /** {@code bool SDL_WriteStorageFile(SDL_Storage * storage, char const * path, void const * source, Uint64 length)} */
    public static boolean nSDL_WriteStorageFile(long storage, long path, long source, long length) {
        long __functionAddress = Functions.WriteStorageFile;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPJZ(storage, path, source, length, __functionAddress);
    }

    /** {@code bool SDL_WriteStorageFile(SDL_Storage * storage, char const * path, void const * source, Uint64 length)} */
    @NativeType("bool")
    public static boolean SDL_WriteStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("void const *") ByteBuffer source) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_WriteStorageFile(storage, memAddress(path), memAddress(source), source.remaining());
    }

    /** {@code bool SDL_WriteStorageFile(SDL_Storage * storage, char const * path, void const * source, Uint64 length)} */
    @NativeType("bool")
    public static boolean SDL_WriteStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("void const *") ByteBuffer source) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_WriteStorageFile(storage, pathEncoded, memAddress(source), source.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateStorageDirectory ] ---

    /** {@code bool SDL_CreateStorageDirectory(SDL_Storage * storage, char const * path)} */
    public static boolean nSDL_CreateStorageDirectory(long storage, long path) {
        long __functionAddress = Functions.CreateStorageDirectory;
        if (CHECKS) {
            check(storage);
        }
        return invokePPZ(storage, path, __functionAddress);
    }

    /** {@code bool SDL_CreateStorageDirectory(SDL_Storage * storage, char const * path)} */
    @NativeType("bool")
    public static boolean SDL_CreateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_CreateStorageDirectory(storage, memAddress(path));
    }

    /** {@code bool SDL_CreateStorageDirectory(SDL_Storage * storage, char const * path)} */
    @NativeType("bool")
    public static boolean SDL_CreateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_CreateStorageDirectory(storage, pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_EnumerateStorageDirectory ] ---

    /** {@code bool SDL_EnumerateStorageDirectory(SDL_Storage * storage, char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    public static boolean nSDL_EnumerateStorageDirectory(long storage, long path, long callback, long userdata) {
        long __functionAddress = Functions.EnumerateStorageDirectory;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPPZ(storage, path, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_EnumerateStorageDirectory(SDL_Storage * storage, char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_EnumerateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_EnumerateStorageDirectory(storage, memAddress(path), callback.address(), userdata);
    }

    /** {@code bool SDL_EnumerateStorageDirectory(SDL_Storage * storage, char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_EnumerateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_EnumerateStorageDirectory(storage, pathEncoded, callback.address(), userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RemoveStoragePath ] ---

    /** {@code bool SDL_RemoveStoragePath(SDL_Storage * storage, char const * path)} */
    public static boolean nSDL_RemoveStoragePath(long storage, long path) {
        long __functionAddress = Functions.RemoveStoragePath;
        if (CHECKS) {
            check(storage);
        }
        return invokePPZ(storage, path, __functionAddress);
    }

    /** {@code bool SDL_RemoveStoragePath(SDL_Storage * storage, char const * path)} */
    @NativeType("bool")
    public static boolean SDL_RemoveStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_RemoveStoragePath(storage, memAddress(path));
    }

    /** {@code bool SDL_RemoveStoragePath(SDL_Storage * storage, char const * path)} */
    @NativeType("bool")
    public static boolean SDL_RemoveStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_RemoveStoragePath(storage, pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RenameStoragePath ] ---

    /** {@code bool SDL_RenameStoragePath(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    public static boolean nSDL_RenameStoragePath(long storage, long oldpath, long newpath) {
        long __functionAddress = Functions.RenameStoragePath;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPZ(storage, oldpath, newpath, __functionAddress);
    }

    /** {@code bool SDL_RenameStoragePath(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_RenameStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        return nSDL_RenameStoragePath(storage, memAddress(oldpath), memAddress(newpath));
    }

    /** {@code bool SDL_RenameStoragePath(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_RenameStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            return nSDL_RenameStoragePath(storage, oldpathEncoded, newpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CopyStorageFile ] ---

    /** {@code bool SDL_CopyStorageFile(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    public static boolean nSDL_CopyStorageFile(long storage, long oldpath, long newpath) {
        long __functionAddress = Functions.CopyStorageFile;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPZ(storage, oldpath, newpath, __functionAddress);
    }

    /** {@code bool SDL_CopyStorageFile(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_CopyStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        return nSDL_CopyStorageFile(storage, memAddress(oldpath), memAddress(newpath));
    }

    /** {@code bool SDL_CopyStorageFile(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_CopyStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            return nSDL_CopyStorageFile(storage, oldpathEncoded, newpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetStoragePathInfo ] ---

    /** {@code bool SDL_GetStoragePathInfo(SDL_Storage * storage, char const * path, SDL_PathInfo * info)} */
    public static boolean nSDL_GetStoragePathInfo(long storage, long path, long info) {
        long __functionAddress = Functions.GetStoragePathInfo;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPZ(storage, path, info, __functionAddress);
    }

    /** {@code bool SDL_GetStoragePathInfo(SDL_Storage * storage, char const * path, SDL_PathInfo * info)} */
    @NativeType("bool")
    public static boolean SDL_GetStoragePathInfo(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("SDL_PathInfo *") SDL_PathInfo.Buffer info) {
        if (CHECKS) {
            checkNT1(path);
            check(info, 1);
        }
        return nSDL_GetStoragePathInfo(storage, memAddress(path), info.address());
    }

    /** {@code bool SDL_GetStoragePathInfo(SDL_Storage * storage, char const * path, SDL_PathInfo * info)} */
    @NativeType("bool")
    public static boolean SDL_GetStoragePathInfo(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("SDL_PathInfo *") SDL_PathInfo.Buffer info) {
        if (CHECKS) {
            check(info, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_GetStoragePathInfo(storage, pathEncoded, info.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetStorageSpaceRemaining ] ---

    /** {@code Uint64 SDL_GetStorageSpaceRemaining(SDL_Storage * storage)} */
    @NativeType("Uint64")
    public static long SDL_GetStorageSpaceRemaining(@NativeType("SDL_Storage *") long storage) {
        long __functionAddress = Functions.GetStorageSpaceRemaining;
        if (CHECKS) {
            check(storage);
        }
        return invokePJ(storage, __functionAddress);
    }

    // --- [ SDL_GlobStorageDirectory ] ---

    /** {@code char ** SDL_GlobStorageDirectory(SDL_Storage * storage, char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    public static long nSDL_GlobStorageDirectory(long storage, long path, long pattern, int flags, long count) {
        long __functionAddress = Functions.GlobStorageDirectory;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPPP(storage, path, pattern, flags, count, __functionAddress);
    }

    /** {@code char ** SDL_GlobStorageDirectory(SDL_Storage * storage, char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GlobStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("char const *") ByteBuffer pattern, @NativeType("SDL_GlobFlags") int flags) {
        if (CHECKS) {
            checkNT1(path);
            checkNT1(pattern);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GlobStorageDirectory(storage, memAddress(path), memAddress(pattern), flags, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code char ** SDL_GlobStorageDirectory(SDL_Storage * storage, char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GlobStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("char const *") CharSequence pattern, @NativeType("SDL_GlobFlags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer count = stack.callocInt(1);
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            stack.nUTF8(pattern, true);
            long patternEncoded = stack.getPointerAddress();
            long __result = nSDL_GlobStorageDirectory(storage, pathEncoded, patternEncoded, flags, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateSurface ] ---

    /** {@code SDL_Surface * SDL_CreateSurface(int width, int height, SDL_PixelFormat format)} */
    public static long nSDL_CreateSurface(int width, int height, int format) {
        long __functionAddress = Functions.CreateSurface;
        return invokeP(width, height, format, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_CreateSurface(int width, int height, SDL_PixelFormat format)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_CreateSurface(int width, int height, @NativeType("SDL_PixelFormat") int format) {
        long __result = nSDL_CreateSurface(width, height, format);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_CreateSurfaceFrom ] ---

    /** {@code SDL_Surface * SDL_CreateSurfaceFrom(int width, int height, SDL_PixelFormat format, void * pixels, int pitch)} */
    public static long nSDL_CreateSurfaceFrom(int width, int height, int format, long pixels, int pitch) {
        long __functionAddress = Functions.CreateSurfaceFrom;
        return invokePP(width, height, format, pixels, pitch, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_CreateSurfaceFrom(int width, int height, SDL_PixelFormat format, void * pixels, int pitch)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_CreateSurfaceFrom(int width, int height, @NativeType("SDL_PixelFormat") int format, @NativeType("void *") @Nullable ByteBuffer pixels, int pitch) {
        if (CHECKS) {
            checkSafe(pixels, height*pitch);
        }
        long __result = nSDL_CreateSurfaceFrom(width, height, format, memAddressSafe(pixels), pitch);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_DestroySurface ] ---

    /** {@code void SDL_DestroySurface(SDL_Surface * surface)} */
    public static void nSDL_DestroySurface(long surface) {
        long __functionAddress = Functions.DestroySurface;
        invokePV(surface, __functionAddress);
    }

    /** {@code void SDL_DestroySurface(SDL_Surface * surface)} */
    public static void SDL_DestroySurface(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        nSDL_DestroySurface(surface.address());
    }

    // --- [ SDL_GetSurfaceProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetSurfaceProperties(SDL_Surface * surface)} */
    public static int nSDL_GetSurfaceProperties(long surface) {
        long __functionAddress = Functions.GetSurfaceProperties;
        return invokePI(surface, __functionAddress);
    }

    /** {@code SDL_PropertiesID SDL_GetSurfaceProperties(SDL_Surface * surface)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetSurfaceProperties(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_GetSurfaceProperties(surface.address());
    }

    // --- [ SDL_SetSurfaceColorspace ] ---

    /** {@code bool SDL_SetSurfaceColorspace(SDL_Surface * surface, SDL_Colorspace colorspace)} */
    public static boolean nSDL_SetSurfaceColorspace(long surface, int colorspace) {
        long __functionAddress = Functions.SetSurfaceColorspace;
        return invokePZ(surface, colorspace, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceColorspace(SDL_Surface * surface, SDL_Colorspace colorspace)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceColorspace(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("SDL_Colorspace") int colorspace) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_SetSurfaceColorspace(surface.address(), colorspace);
    }

    // --- [ SDL_GetSurfaceColorspace ] ---

    /** {@code SDL_Colorspace SDL_GetSurfaceColorspace(SDL_Surface * surface)} */
    public static int nSDL_GetSurfaceColorspace(long surface) {
        long __functionAddress = Functions.GetSurfaceColorspace;
        return invokePI(surface, __functionAddress);
    }

    /** {@code SDL_Colorspace SDL_GetSurfaceColorspace(SDL_Surface * surface)} */
    @NativeType("SDL_Colorspace")
    public static int SDL_GetSurfaceColorspace(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_GetSurfaceColorspace(surface.address());
    }

    // --- [ SDL_CreateSurfacePalette ] ---

    /** {@code SDL_Palette * SDL_CreateSurfacePalette(SDL_Surface * surface)} */
    public static long nSDL_CreateSurfacePalette(long surface) {
        long __functionAddress = Functions.CreateSurfacePalette;
        return invokePP(surface, __functionAddress);
    }

    /** {@code SDL_Palette * SDL_CreateSurfacePalette(SDL_Surface * surface)} */
    @NativeType("SDL_Palette *")
    public static @Nullable SDL_Palette SDL_CreateSurfacePalette(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        long __result = nSDL_CreateSurfacePalette(surface.address());
        return SDL_Palette.createSafe(__result);
    }

    // --- [ SDL_SetSurfacePalette ] ---

    /** {@code bool SDL_SetSurfacePalette(SDL_Surface * surface, SDL_Palette * palette)} */
    public static boolean nSDL_SetSurfacePalette(long surface, long palette) {
        long __functionAddress = Functions.SetSurfacePalette;
        return invokePPZ(surface, palette, __functionAddress);
    }

    /** {@code bool SDL_SetSurfacePalette(SDL_Surface * surface, SDL_Palette * palette)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfacePalette(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("SDL_Palette *") SDL_Palette.Buffer palette) {
        if (CHECKS) {
            check(surface, 1);
            check(palette, 1);
        }
        return nSDL_SetSurfacePalette(surface.address(), palette.address());
    }

    // --- [ SDL_GetSurfacePalette ] ---

    /** {@code SDL_Palette * SDL_GetSurfacePalette(SDL_Surface * surface)} */
    public static long nSDL_GetSurfacePalette(long surface) {
        long __functionAddress = Functions.GetSurfacePalette;
        return invokePP(surface, __functionAddress);
    }

    /** {@code SDL_Palette * SDL_GetSurfacePalette(SDL_Surface * surface)} */
    @NativeType("SDL_Palette *")
    public static @Nullable SDL_Palette SDL_GetSurfacePalette(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        long __result = nSDL_GetSurfacePalette(surface.address());
        return SDL_Palette.createSafe(__result);
    }

    // --- [ SDL_AddSurfaceAlternateImage ] ---

    /** {@code bool SDL_AddSurfaceAlternateImage(SDL_Surface * surface, SDL_Surface * image)} */
    public static boolean nSDL_AddSurfaceAlternateImage(long surface, long image) {
        long __functionAddress = Functions.AddSurfaceAlternateImage;
        return invokePPZ(surface, image, __functionAddress);
    }

    /** {@code bool SDL_AddSurfaceAlternateImage(SDL_Surface * surface, SDL_Surface * image)} */
    @NativeType("bool")
    public static boolean SDL_AddSurfaceAlternateImage(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("SDL_Surface *") SDL_Surface.Buffer image) {
        if (CHECKS) {
            check(surface, 1);
            check(image, 1);
        }
        return nSDL_AddSurfaceAlternateImage(surface.address(), image.address());
    }

    // --- [ SDL_SurfaceHasAlternateImages ] ---

    /** {@code bool SDL_SurfaceHasAlternateImages(SDL_Surface * surface)} */
    public static boolean nSDL_SurfaceHasAlternateImages(long surface) {
        long __functionAddress = Functions.SurfaceHasAlternateImages;
        return invokePZ(surface, __functionAddress);
    }

    /** {@code bool SDL_SurfaceHasAlternateImages(SDL_Surface * surface)} */
    @NativeType("bool")
    public static boolean SDL_SurfaceHasAlternateImages(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_SurfaceHasAlternateImages(surface.address());
    }

    // --- [ SDL_GetSurfaceImages ] ---

    /** {@code SDL_Surface ** SDL_GetSurfaceImages(SDL_Surface * surface, int * count)} */
    public static long nSDL_GetSurfaceImages(long surface, long count) {
        long __functionAddress = Functions.GetSurfaceImages;
        return invokePPP(surface, count, __functionAddress);
    }

    /** {@code SDL_Surface ** SDL_GetSurfaceImages(SDL_Surface * surface, int * count)} */
    @NativeType("SDL_Surface **")
    public static @Nullable PointerBuffer SDL_GetSurfaceImages(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetSurfaceImages(surface.address(), memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RemoveSurfaceAlternateImages ] ---

    /** {@code void SDL_RemoveSurfaceAlternateImages(SDL_Surface * surface)} */
    public static void nSDL_RemoveSurfaceAlternateImages(long surface) {
        long __functionAddress = Functions.RemoveSurfaceAlternateImages;
        invokePV(surface, __functionAddress);
    }

    /** {@code void SDL_RemoveSurfaceAlternateImages(SDL_Surface * surface)} */
    public static void SDL_RemoveSurfaceAlternateImages(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        nSDL_RemoveSurfaceAlternateImages(surface.address());
    }

    // --- [ SDL_LockSurface ] ---

    /** {@code bool SDL_LockSurface(SDL_Surface * surface)} */
    public static boolean nSDL_LockSurface(long surface) {
        long __functionAddress = Functions.LockSurface;
        return invokePZ(surface, __functionAddress);
    }

    /** {@code bool SDL_LockSurface(SDL_Surface * surface)} */
    @NativeType("bool")
    public static boolean SDL_LockSurface(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_LockSurface(surface.address());
    }

    // --- [ SDL_UnlockSurface ] ---

    /** {@code void SDL_UnlockSurface(SDL_Surface * surface)} */
    public static void nSDL_UnlockSurface(long surface) {
        long __functionAddress = Functions.UnlockSurface;
        invokePV(surface, __functionAddress);
    }

    /** {@code void SDL_UnlockSurface(SDL_Surface * surface)} */
    public static void SDL_UnlockSurface(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        nSDL_UnlockSurface(surface.address());
    }

    // --- [ SDL_LoadBMP_IO ] ---

    /** {@code SDL_Surface * SDL_LoadBMP_IO(SDL_IOStream * src, bool closeio)} */
    public static long nSDL_LoadBMP_IO(long src, boolean closeio) {
        long __functionAddress = Functions.LoadBMP_IO;
        if (CHECKS) {
            check(src);
        }
        return invokePP(src, closeio, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_LoadBMP_IO(SDL_IOStream * src, bool closeio)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_LoadBMP_IO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio) {
        long __result = nSDL_LoadBMP_IO(src, closeio);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_LoadBMP ] ---

    /** {@code SDL_Surface * SDL_LoadBMP(char const * file)} */
    public static long nSDL_LoadBMP(long file) {
        long __functionAddress = Functions.LoadBMP;
        return invokePP(file, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_LoadBMP(char const * file)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_LoadBMP(@NativeType("char const *") ByteBuffer file) {
        if (CHECKS) {
            checkNT1(file);
        }
        long __result = nSDL_LoadBMP(memAddress(file));
        return SDL_Surface.createSafe(__result);
    }

    /** {@code SDL_Surface * SDL_LoadBMP(char const * file)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_LoadBMP(@NativeType("char const *") CharSequence file) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            long __result = nSDL_LoadBMP(fileEncoded);
            return SDL_Surface.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SaveBMP_IO ] ---

    /** {@code bool SDL_SaveBMP_IO(SDL_Surface * surface, SDL_IOStream * dst, bool closeio)} */
    public static boolean nSDL_SaveBMP_IO(long surface, long dst, boolean closeio) {
        long __functionAddress = Functions.SaveBMP_IO;
        if (CHECKS) {
            check(dst);
        }
        return invokePPZ(surface, dst, closeio, __functionAddress);
    }

    /** {@code bool SDL_SaveBMP_IO(SDL_Surface * surface, SDL_IOStream * dst, bool closeio)} */
    @NativeType("bool")
    public static boolean SDL_SaveBMP_IO(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("SDL_IOStream *") long dst, @NativeType("bool") boolean closeio) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_SaveBMP_IO(surface.address(), dst, closeio);
    }

    // --- [ SDL_SaveBMP ] ---

    /** {@code bool SDL_SaveBMP(SDL_Surface * surface, char const * file)} */
    public static boolean nSDL_SaveBMP(long surface, long file) {
        long __functionAddress = Functions.SaveBMP;
        return invokePPZ(surface, file, __functionAddress);
    }

    /** {@code bool SDL_SaveBMP(SDL_Surface * surface, char const * file)} */
    @NativeType("bool")
    public static boolean SDL_SaveBMP(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("char const *") ByteBuffer file) {
        if (CHECKS) {
            check(surface, 1);
            checkNT1(file);
        }
        return nSDL_SaveBMP(surface.address(), memAddress(file));
    }

    /** {@code bool SDL_SaveBMP(SDL_Surface * surface, char const * file)} */
    @NativeType("bool")
    public static boolean SDL_SaveBMP(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("char const *") CharSequence file) {
        if (CHECKS) {
            check(surface, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            return nSDL_SaveBMP(surface.address(), fileEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetSurfaceRLE ] ---

    /** {@code bool SDL_SetSurfaceRLE(SDL_Surface * surface, bool enabled)} */
    public static boolean nSDL_SetSurfaceRLE(long surface, boolean enabled) {
        long __functionAddress = Functions.SetSurfaceRLE;
        return invokePZ(surface, enabled, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceRLE(SDL_Surface * surface, bool enabled)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceRLE(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("bool") boolean enabled) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_SetSurfaceRLE(surface.address(), enabled);
    }

    // --- [ SDL_SurfaceHasRLE ] ---

    /** {@code bool SDL_SurfaceHasRLE(SDL_Surface * surface)} */
    public static boolean nSDL_SurfaceHasRLE(long surface) {
        long __functionAddress = Functions.SurfaceHasRLE;
        return invokePZ(surface, __functionAddress);
    }

    /** {@code bool SDL_SurfaceHasRLE(SDL_Surface * surface)} */
    @NativeType("bool")
    public static boolean SDL_SurfaceHasRLE(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_SurfaceHasRLE(surface.address());
    }

    // --- [ SDL_SetSurfaceColorKey ] ---

    /** {@code bool SDL_SetSurfaceColorKey(SDL_Surface * surface, bool enabled, Uint32 key)} */
    public static boolean nSDL_SetSurfaceColorKey(long surface, boolean enabled, int key) {
        long __functionAddress = Functions.SetSurfaceColorKey;
        return invokePZ(surface, enabled, key, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceColorKey(SDL_Surface * surface, bool enabled, Uint32 key)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceColorKey(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("bool") boolean enabled, @NativeType("Uint32") int key) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_SetSurfaceColorKey(surface.address(), enabled, key);
    }

    // --- [ SDL_SurfaceHasColorKey ] ---

    /** {@code bool SDL_SurfaceHasColorKey(SDL_Surface * surface)} */
    public static boolean nSDL_SurfaceHasColorKey(long surface) {
        long __functionAddress = Functions.SurfaceHasColorKey;
        return invokePZ(surface, __functionAddress);
    }

    /** {@code bool SDL_SurfaceHasColorKey(SDL_Surface * surface)} */
    @NativeType("bool")
    public static boolean SDL_SurfaceHasColorKey(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_SurfaceHasColorKey(surface.address());
    }

    // --- [ SDL_GetSurfaceColorKey ] ---

    /** {@code bool SDL_GetSurfaceColorKey(SDL_Surface * surface, Uint32 * key)} */
    public static boolean nSDL_GetSurfaceColorKey(long surface, long key) {
        long __functionAddress = Functions.GetSurfaceColorKey;
        return invokePPZ(surface, key, __functionAddress);
    }

    /** {@code bool SDL_GetSurfaceColorKey(SDL_Surface * surface, Uint32 * key)} */
    @NativeType("bool")
    public static boolean SDL_GetSurfaceColorKey(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("Uint32 *") IntBuffer key) {
        if (CHECKS) {
            check(surface, 1);
            check(key, 1);
        }
        return nSDL_GetSurfaceColorKey(surface.address(), memAddress(key));
    }

    // --- [ SDL_SetSurfaceColorMod ] ---

    /** {@code bool SDL_SetSurfaceColorMod(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b)} */
    public static boolean nSDL_SetSurfaceColorMod(long surface, byte r, byte g, byte b) {
        long __functionAddress = Functions.SetSurfaceColorMod;
        return invokePUUUZ(surface, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceColorMod(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceColorMod(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_SetSurfaceColorMod(surface.address(), r, g, b);
    }

    // --- [ SDL_GetSurfaceColorMod ] ---

    /** {@code bool SDL_GetSurfaceColorMod(SDL_Surface * surface, Uint8 * r, Uint8 * g, Uint8 * b)} */
    public static boolean nSDL_GetSurfaceColorMod(long surface, long r, long g, long b) {
        long __functionAddress = Functions.GetSurfaceColorMod;
        return invokePPPPZ(surface, r, g, b, __functionAddress);
    }

    /** {@code bool SDL_GetSurfaceColorMod(SDL_Surface * surface, Uint8 * r, Uint8 * g, Uint8 * b)} */
    @NativeType("bool")
    public static boolean SDL_GetSurfaceColorMod(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("Uint8 *") ByteBuffer r, @NativeType("Uint8 *") ByteBuffer g, @NativeType("Uint8 *") ByteBuffer b) {
        if (CHECKS) {
            check(surface, 1);
            check(r, 1);
            check(g, 1);
            check(b, 1);
        }
        return nSDL_GetSurfaceColorMod(surface.address(), memAddress(r), memAddress(g), memAddress(b));
    }

    // --- [ SDL_SetSurfaceAlphaMod ] ---

    /** {@code bool SDL_SetSurfaceAlphaMod(SDL_Surface * surface, Uint8 alpha)} */
    public static boolean nSDL_SetSurfaceAlphaMod(long surface, byte alpha) {
        long __functionAddress = Functions.SetSurfaceAlphaMod;
        return invokePUZ(surface, alpha, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceAlphaMod(SDL_Surface * surface, Uint8 alpha)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceAlphaMod(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("Uint8") byte alpha) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_SetSurfaceAlphaMod(surface.address(), alpha);
    }

    // --- [ SDL_GetSurfaceAlphaMod ] ---

    /** {@code bool SDL_GetSurfaceAlphaMod(SDL_Surface * surface, Uint8 * alpha)} */
    public static boolean nSDL_GetSurfaceAlphaMod(long surface, long alpha) {
        long __functionAddress = Functions.GetSurfaceAlphaMod;
        return invokePPZ(surface, alpha, __functionAddress);
    }

    /** {@code bool SDL_GetSurfaceAlphaMod(SDL_Surface * surface, Uint8 * alpha)} */
    @NativeType("bool")
    public static boolean SDL_GetSurfaceAlphaMod(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("Uint8 *") ByteBuffer alpha) {
        if (CHECKS) {
            check(surface, 1);
            check(alpha, 1);
        }
        return nSDL_GetSurfaceAlphaMod(surface.address(), memAddress(alpha));
    }

    // --- [ SDL_SetSurfaceBlendMode ] ---

    /** {@code bool SDL_SetSurfaceBlendMode(SDL_Surface * surface, SDL_BlendMode blendMode)} */
    public static boolean nSDL_SetSurfaceBlendMode(long surface, int blendMode) {
        long __functionAddress = Functions.SetSurfaceBlendMode;
        return invokePZ(surface, blendMode, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceBlendMode(SDL_Surface * surface, SDL_BlendMode blendMode)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceBlendMode(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("SDL_BlendMode") int blendMode) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_SetSurfaceBlendMode(surface.address(), blendMode);
    }

    // --- [ SDL_GetSurfaceBlendMode ] ---

    /** {@code bool SDL_GetSurfaceBlendMode(SDL_Surface * surface, SDL_BlendMode * blendMode)} */
    public static boolean nSDL_GetSurfaceBlendMode(long surface, long blendMode) {
        long __functionAddress = Functions.GetSurfaceBlendMode;
        return invokePPZ(surface, blendMode, __functionAddress);
    }

    /** {@code bool SDL_GetSurfaceBlendMode(SDL_Surface * surface, SDL_BlendMode * blendMode)} */
    @NativeType("bool")
    public static boolean SDL_GetSurfaceBlendMode(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("SDL_BlendMode *") IntBuffer blendMode) {
        if (CHECKS) {
            check(surface, 1);
            check(blendMode, 1);
        }
        return nSDL_GetSurfaceBlendMode(surface.address(), memAddress(blendMode));
    }

    // --- [ SDL_SetSurfaceClipRect ] ---

    /** {@code bool SDL_SetSurfaceClipRect(SDL_Surface * surface, SDL_Rect const * rect)} */
    public static boolean nSDL_SetSurfaceClipRect(long surface, long rect) {
        long __functionAddress = Functions.SetSurfaceClipRect;
        return invokePPZ(surface, rect, __functionAddress);
    }

    /** {@code bool SDL_SetSurfaceClipRect(SDL_Surface * surface, SDL_Rect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_SetSurfaceClipRect(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("SDL_Rect const *") SDL_Rect.Buffer rect) {
        if (CHECKS) {
            check(surface, 1);
            check(rect, 1);
        }
        return nSDL_SetSurfaceClipRect(surface.address(), rect.address());
    }

    // --- [ SDL_GetSurfaceClipRect ] ---

    /** {@code bool SDL_GetSurfaceClipRect(SDL_Surface * surface, SDL_Rect * rect)} */
    public static boolean nSDL_GetSurfaceClipRect(long surface, long rect) {
        long __functionAddress = Functions.GetSurfaceClipRect;
        return invokePPZ(surface, rect, __functionAddress);
    }

    /** {@code bool SDL_GetSurfaceClipRect(SDL_Surface * surface, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetSurfaceClipRect(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("SDL_Rect *") SDL_Rect.Buffer rect) {
        if (CHECKS) {
            check(surface, 1);
            check(rect, 1);
        }
        return nSDL_GetSurfaceClipRect(surface.address(), rect.address());
    }

    // --- [ SDL_FlipSurface ] ---

    /** {@code bool SDL_FlipSurface(SDL_Surface * surface, SDL_FlipMode flip)} */
    public static boolean nSDL_FlipSurface(long surface, int flip) {
        long __functionAddress = Functions.FlipSurface;
        return invokePZ(surface, flip, __functionAddress);
    }

    /** {@code bool SDL_FlipSurface(SDL_Surface * surface, SDL_FlipMode flip)} */
    @NativeType("bool")
    public static boolean SDL_FlipSurface(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("SDL_FlipMode") int flip) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_FlipSurface(surface.address(), flip);
    }

    // --- [ SDL_DuplicateSurface ] ---

    /** {@code SDL_Surface * SDL_DuplicateSurface(SDL_Surface * surface)} */
    public static long nSDL_DuplicateSurface(long surface) {
        long __functionAddress = Functions.DuplicateSurface;
        return invokePP(surface, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_DuplicateSurface(SDL_Surface * surface)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_DuplicateSurface(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        long __result = nSDL_DuplicateSurface(surface.address());
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_ScaleSurface ] ---

    /** {@code SDL_Surface * SDL_ScaleSurface(SDL_Surface * surface, int width, int height, SDL_ScaleMode scaleMode)} */
    public static long nSDL_ScaleSurface(long surface, int width, int height, int scaleMode) {
        long __functionAddress = Functions.ScaleSurface;
        return invokePP(surface, width, height, scaleMode, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_ScaleSurface(SDL_Surface * surface, int width, int height, SDL_ScaleMode scaleMode)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_ScaleSurface(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, int width, int height, @NativeType("SDL_ScaleMode") int scaleMode) {
        if (CHECKS) {
            check(surface, 1);
        }
        long __result = nSDL_ScaleSurface(surface.address(), width, height, scaleMode);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_ConvertSurface ] ---

    /** {@code SDL_Surface * SDL_ConvertSurface(SDL_Surface * surface, SDL_PixelFormat format)} */
    public static long nSDL_ConvertSurface(long surface, int format) {
        long __functionAddress = Functions.ConvertSurface;
        return invokePP(surface, format, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_ConvertSurface(SDL_Surface * surface, SDL_PixelFormat format)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_ConvertSurface(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("SDL_PixelFormat") int format) {
        if (CHECKS) {
            check(surface, 1);
        }
        long __result = nSDL_ConvertSurface(surface.address(), format);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_ConvertSurfaceAndColorspace ] ---

    /** {@code SDL_Surface * SDL_ConvertSurfaceAndColorspace(SDL_Surface * surface, SDL_PixelFormat format, SDL_Palette * palette, SDL_Colorspace colorspace, SDL_PropertiesID props)} */
    public static long nSDL_ConvertSurfaceAndColorspace(long surface, int format, long palette, int colorspace, int props) {
        long __functionAddress = Functions.ConvertSurfaceAndColorspace;
        return invokePPP(surface, format, palette, colorspace, props, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_ConvertSurfaceAndColorspace(SDL_Surface * surface, SDL_PixelFormat format, SDL_Palette * palette, SDL_Colorspace colorspace, SDL_PropertiesID props)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_ConvertSurfaceAndColorspace(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("SDL_PixelFormat") int format, @NativeType("SDL_Palette *") SDL_Palette.Buffer palette, @NativeType("SDL_Colorspace") int colorspace, @NativeType("SDL_PropertiesID") int props) {
        if (CHECKS) {
            check(surface, 1);
            check(palette, 1);
        }
        long __result = nSDL_ConvertSurfaceAndColorspace(surface.address(), format, palette.address(), colorspace, props);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_ConvertPixels ] ---

    /** {@code bool SDL_ConvertPixels(int width, int height, SDL_PixelFormat src_format, void const * src, int src_pitch, SDL_PixelFormat dst_format, void * dst, int dst_pitch)} */
    public static boolean nSDL_ConvertPixels(int width, int height, int src_format, long src, int src_pitch, int dst_format, long dst, int dst_pitch) {
        long __functionAddress = Functions.ConvertPixels;
        return invokePPZ(width, height, src_format, src, src_pitch, dst_format, dst, dst_pitch, __functionAddress);
    }

    /** {@code bool SDL_ConvertPixels(int width, int height, SDL_PixelFormat src_format, void const * src, int src_pitch, SDL_PixelFormat dst_format, void * dst, int dst_pitch)} */
    @NativeType("bool")
    public static boolean SDL_ConvertPixels(int width, int height, @NativeType("SDL_PixelFormat") int src_format, @NativeType("void const *") ByteBuffer src, int src_pitch, @NativeType("SDL_PixelFormat") int dst_format, @NativeType("void *") ByteBuffer dst, int dst_pitch) {
        if (CHECKS) {
            check(src, height*src_pitch);
            check(dst, height*dst_pitch);
        }
        return nSDL_ConvertPixels(width, height, src_format, memAddress(src), src_pitch, dst_format, memAddress(dst), dst_pitch);
    }

    // --- [ SDL_ConvertPixelsAndColorspace ] ---

    /** {@code bool SDL_ConvertPixelsAndColorspace(int width, int height, SDL_PixelFormat src_format, SDL_Colorspace src_colorspace, SDL_PropertiesID src_properties, void const * src, int src_pitch, SDL_PixelFormat dst_format, SDL_Colorspace dst_colorspace, SDL_PropertiesID dst_properties, void * dst, int dst_pitch)} */
    public static boolean nSDL_ConvertPixelsAndColorspace(int width, int height, int src_format, int src_colorspace, int src_properties, long src, int src_pitch, int dst_format, int dst_colorspace, int dst_properties, long dst, int dst_pitch) {
        long __functionAddress = Functions.ConvertPixelsAndColorspace;
        return invokePPZ(width, height, src_format, src_colorspace, src_properties, src, src_pitch, dst_format, dst_colorspace, dst_properties, dst, dst_pitch, __functionAddress);
    }

    /** {@code bool SDL_ConvertPixelsAndColorspace(int width, int height, SDL_PixelFormat src_format, SDL_Colorspace src_colorspace, SDL_PropertiesID src_properties, void const * src, int src_pitch, SDL_PixelFormat dst_format, SDL_Colorspace dst_colorspace, SDL_PropertiesID dst_properties, void * dst, int dst_pitch)} */
    @NativeType("bool")
    public static boolean SDL_ConvertPixelsAndColorspace(int width, int height, @NativeType("SDL_PixelFormat") int src_format, @NativeType("SDL_Colorspace") int src_colorspace, @NativeType("SDL_PropertiesID") int src_properties, @NativeType("void const *") ByteBuffer src, int src_pitch, @NativeType("SDL_PixelFormat") int dst_format, @NativeType("SDL_Colorspace") int dst_colorspace, @NativeType("SDL_PropertiesID") int dst_properties, @NativeType("void *") ByteBuffer dst, int dst_pitch) {
        if (CHECKS) {
            check(src, height*src_pitch);
            check(dst, height*dst_pitch);
        }
        return nSDL_ConvertPixelsAndColorspace(width, height, src_format, src_colorspace, src_properties, memAddress(src), src_pitch, dst_format, dst_colorspace, dst_properties, memAddress(dst), dst_pitch);
    }

    // --- [ SDL_PremultiplyAlpha ] ---

    /** {@code bool SDL_PremultiplyAlpha(int width, int height, SDL_PixelFormat src_format, void const * src, int src_pitch, SDL_PixelFormat dst_format, void * dst, int dst_pitch, bool linear)} */
    public static boolean nSDL_PremultiplyAlpha(int width, int height, int src_format, long src, int src_pitch, int dst_format, long dst, int dst_pitch, boolean linear) {
        long __functionAddress = Functions.PremultiplyAlpha;
        return invokePPZ(width, height, src_format, src, src_pitch, dst_format, dst, dst_pitch, linear, __functionAddress);
    }

    /** {@code bool SDL_PremultiplyAlpha(int width, int height, SDL_PixelFormat src_format, void const * src, int src_pitch, SDL_PixelFormat dst_format, void * dst, int dst_pitch, bool linear)} */
    @NativeType("bool")
    public static boolean SDL_PremultiplyAlpha(int width, int height, @NativeType("SDL_PixelFormat") int src_format, @NativeType("void const *") ByteBuffer src, int src_pitch, @NativeType("SDL_PixelFormat") int dst_format, @NativeType("void *") ByteBuffer dst, int dst_pitch, @NativeType("bool") boolean linear) {
        if (CHECKS) {
            check(src, height*src_pitch);
            check(dst, height*dst_pitch);
        }
        return nSDL_PremultiplyAlpha(width, height, src_format, memAddress(src), src_pitch, dst_format, memAddress(dst), dst_pitch, linear);
    }

    // --- [ SDL_PremultiplySurfaceAlpha ] ---

    /** {@code bool SDL_PremultiplySurfaceAlpha(SDL_Surface * surface, bool linear)} */
    public static boolean nSDL_PremultiplySurfaceAlpha(long surface, boolean linear) {
        long __functionAddress = Functions.PremultiplySurfaceAlpha;
        return invokePZ(surface, linear, __functionAddress);
    }

    /** {@code bool SDL_PremultiplySurfaceAlpha(SDL_Surface * surface, bool linear)} */
    @NativeType("bool")
    public static boolean SDL_PremultiplySurfaceAlpha(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("bool") boolean linear) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_PremultiplySurfaceAlpha(surface.address(), linear);
    }

    // --- [ SDL_ClearSurface ] ---

    /** {@code bool SDL_ClearSurface(SDL_Surface * surface, float r, float g, float b, float a)} */
    public static boolean nSDL_ClearSurface(long surface, float r, float g, float b, float a) {
        long __functionAddress = Functions.ClearSurface;
        return invokePZ(surface, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_ClearSurface(SDL_Surface * surface, float r, float g, float b, float a)} */
    @NativeType("bool")
    public static boolean SDL_ClearSurface(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, float r, float g, float b, float a) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_ClearSurface(surface.address(), r, g, b, a);
    }

    // --- [ SDL_FillSurfaceRect ] ---

    /** {@code bool SDL_FillSurfaceRect(SDL_Surface * dst, SDL_Rect const * rect, Uint32 color)} */
    public static boolean nSDL_FillSurfaceRect(long dst, long rect, int color) {
        long __functionAddress = Functions.FillSurfaceRect;
        return invokePPZ(dst, rect, color, __functionAddress);
    }

    /** {@code bool SDL_FillSurfaceRect(SDL_Surface * dst, SDL_Rect const * rect, Uint32 color)} */
    @NativeType("bool")
    public static boolean SDL_FillSurfaceRect(@NativeType("SDL_Surface *") SDL_Surface.Buffer dst, @NativeType("SDL_Rect const *") SDL_Rect.Buffer rect, @NativeType("Uint32") int color) {
        if (CHECKS) {
            check(dst, 1);
            check(rect, 1);
        }
        return nSDL_FillSurfaceRect(dst.address(), rect.address(), color);
    }

    // --- [ SDL_FillSurfaceRects ] ---

    /** {@code bool SDL_FillSurfaceRects(SDL_Surface * dst, SDL_Rect const * rects, int count, Uint32 color)} */
    public static boolean nSDL_FillSurfaceRects(long dst, long rects, int count, int color) {
        long __functionAddress = Functions.FillSurfaceRects;
        return invokePPZ(dst, rects, count, color, __functionAddress);
    }

    /** {@code bool SDL_FillSurfaceRects(SDL_Surface * dst, SDL_Rect const * rects, int count, Uint32 color)} */
    @NativeType("bool")
    public static boolean SDL_FillSurfaceRects(@NativeType("SDL_Surface *") SDL_Surface.Buffer dst, @NativeType("SDL_Rect const *") SDL_Rect.Buffer rects, @NativeType("Uint32") int color) {
        if (CHECKS) {
            check(dst, 1);
        }
        return nSDL_FillSurfaceRects(dst.address(), rects.address(), rects.remaining(), color);
    }

    // --- [ SDL_BlitSurface ] ---

    /** {@code bool SDL_BlitSurface(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    public static boolean nSDL_BlitSurface(long src, long srcrect, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurface;
        return invokePPPPZ(src, srcrect, dst, dstrect, __functionAddress);
    }

    /** {@code bool SDL_BlitSurface(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurface(@NativeType("SDL_Surface *") SDL_Surface.Buffer src, @NativeType("SDL_Rect const *") SDL_Rect.Buffer srcrect, @NativeType("SDL_Surface *") SDL_Surface.Buffer dst, @NativeType("SDL_Rect const *") SDL_Rect.Buffer dstrect) {
        if (CHECKS) {
            check(src, 1);
            check(srcrect, 1);
            check(dst, 1);
            check(dstrect, 1);
        }
        return nSDL_BlitSurface(src.address(), srcrect.address(), dst.address(), dstrect.address());
    }

    // --- [ SDL_BlitSurfaceUnchecked ] ---

    /** {@code bool SDL_BlitSurfaceUnchecked(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    public static boolean nSDL_BlitSurfaceUnchecked(long src, long srcrect, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurfaceUnchecked;
        return invokePPPPZ(src, srcrect, dst, dstrect, __functionAddress);
    }

    /** {@code bool SDL_BlitSurfaceUnchecked(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurfaceUnchecked(@NativeType("SDL_Surface *") SDL_Surface.Buffer src, @NativeType("SDL_Rect const *") SDL_Rect.Buffer srcrect, @NativeType("SDL_Surface *") SDL_Surface.Buffer dst, @NativeType("SDL_Rect const *") SDL_Rect.Buffer dstrect) {
        if (CHECKS) {
            check(src, 1);
            check(srcrect, 1);
            check(dst, 1);
            check(dstrect, 1);
        }
        return nSDL_BlitSurfaceUnchecked(src.address(), srcrect.address(), dst.address(), dstrect.address());
    }

    // --- [ SDL_BlitSurfaceScaled ] ---

    /** {@code bool SDL_BlitSurfaceScaled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect, SDL_ScaleMode scaleMode)} */
    public static boolean nSDL_BlitSurfaceScaled(long src, long srcrect, long dst, long dstrect, int scaleMode) {
        long __functionAddress = Functions.BlitSurfaceScaled;
        return invokePPPPZ(src, srcrect, dst, dstrect, scaleMode, __functionAddress);
    }

    /** {@code bool SDL_BlitSurfaceScaled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect, SDL_ScaleMode scaleMode)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurfaceScaled(@NativeType("SDL_Surface *") SDL_Surface.Buffer src, @NativeType("SDL_Rect const *") SDL_Rect.Buffer srcrect, @NativeType("SDL_Surface *") SDL_Surface.Buffer dst, @NativeType("SDL_Rect const *") SDL_Rect.Buffer dstrect, @NativeType("SDL_ScaleMode") int scaleMode) {
        if (CHECKS) {
            check(src, 1);
            check(srcrect, 1);
            check(dst, 1);
            check(dstrect, 1);
        }
        return nSDL_BlitSurfaceScaled(src.address(), srcrect.address(), dst.address(), dstrect.address(), scaleMode);
    }

    // --- [ SDL_BlitSurfaceUncheckedScaled ] ---

    /** {@code bool SDL_BlitSurfaceUncheckedScaled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect, SDL_ScaleMode scaleMode)} */
    public static boolean nSDL_BlitSurfaceUncheckedScaled(long src, long srcrect, long dst, long dstrect, int scaleMode) {
        long __functionAddress = Functions.BlitSurfaceUncheckedScaled;
        return invokePPPPZ(src, srcrect, dst, dstrect, scaleMode, __functionAddress);
    }

    /** {@code bool SDL_BlitSurfaceUncheckedScaled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect, SDL_ScaleMode scaleMode)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurfaceUncheckedScaled(@NativeType("SDL_Surface *") SDL_Surface.Buffer src, @NativeType("SDL_Rect const *") SDL_Rect.Buffer srcrect, @NativeType("SDL_Surface *") SDL_Surface.Buffer dst, @NativeType("SDL_Rect const *") SDL_Rect.Buffer dstrect, @NativeType("SDL_ScaleMode") int scaleMode) {
        if (CHECKS) {
            check(src, 1);
            check(srcrect, 1);
            check(dst, 1);
            check(dstrect, 1);
        }
        return nSDL_BlitSurfaceUncheckedScaled(src.address(), srcrect.address(), dst.address(), dstrect.address(), scaleMode);
    }

    // --- [ SDL_BlitSurfaceTiled ] ---

    /** {@code bool SDL_BlitSurfaceTiled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    public static boolean nSDL_BlitSurfaceTiled(long src, long srcrect, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurfaceTiled;
        return invokePPPPZ(src, srcrect, dst, dstrect, __functionAddress);
    }

    /** {@code bool SDL_BlitSurfaceTiled(SDL_Surface * src, SDL_Rect const * srcrect, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurfaceTiled(@NativeType("SDL_Surface *") SDL_Surface.Buffer src, @NativeType("SDL_Rect const *") SDL_Rect.Buffer srcrect, @NativeType("SDL_Surface *") SDL_Surface.Buffer dst, @NativeType("SDL_Rect const *") SDL_Rect.Buffer dstrect) {
        if (CHECKS) {
            check(src, 1);
            check(srcrect, 1);
            check(dst, 1);
            check(dstrect, 1);
        }
        return nSDL_BlitSurfaceTiled(src.address(), srcrect.address(), dst.address(), dstrect.address());
    }

    // --- [ SDL_BlitSurfaceTiledWithScale ] ---

    /** {@code bool SDL_BlitSurfaceTiledWithScale(SDL_Surface * src, SDL_Rect const * srcrect, float scale, SDL_ScaleMode scaleMode, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    public static boolean nSDL_BlitSurfaceTiledWithScale(long src, long srcrect, float scale, int scaleMode, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurfaceTiledWithScale;
        return invokePPPPZ(src, srcrect, scale, scaleMode, dst, dstrect, __functionAddress);
    }

    /** {@code bool SDL_BlitSurfaceTiledWithScale(SDL_Surface * src, SDL_Rect const * srcrect, float scale, SDL_ScaleMode scaleMode, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurfaceTiledWithScale(@NativeType("SDL_Surface *") SDL_Surface.Buffer src, @NativeType("SDL_Rect const *") SDL_Rect.Buffer srcrect, float scale, @NativeType("SDL_ScaleMode") int scaleMode, @NativeType("SDL_Surface *") SDL_Surface.Buffer dst, @NativeType("SDL_Rect const *") SDL_Rect.Buffer dstrect) {
        if (CHECKS) {
            check(src, 1);
            check(srcrect, 1);
            check(dst, 1);
            check(dstrect, 1);
        }
        return nSDL_BlitSurfaceTiledWithScale(src.address(), srcrect.address(), scale, scaleMode, dst.address(), dstrect.address());
    }

    // --- [ SDL_BlitSurface9Grid ] ---

    /** {@code bool SDL_BlitSurface9Grid(SDL_Surface * src, SDL_Rect const * srcrect, int left_width, int right_width, int top_height, int bottom_height, float scale, SDL_ScaleMode scaleMode, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    public static boolean nSDL_BlitSurface9Grid(long src, long srcrect, int left_width, int right_width, int top_height, int bottom_height, float scale, int scaleMode, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurface9Grid;
        return invokePPPPZ(src, srcrect, left_width, right_width, top_height, bottom_height, scale, scaleMode, dst, dstrect, __functionAddress);
    }

    /** {@code bool SDL_BlitSurface9Grid(SDL_Surface * src, SDL_Rect const * srcrect, int left_width, int right_width, int top_height, int bottom_height, float scale, SDL_ScaleMode scaleMode, SDL_Surface * dst, SDL_Rect const * dstrect)} */
    @NativeType("bool")
    public static boolean SDL_BlitSurface9Grid(@NativeType("SDL_Surface *") SDL_Surface.Buffer src, @NativeType("SDL_Rect const *") SDL_Rect.Buffer srcrect, int left_width, int right_width, int top_height, int bottom_height, float scale, @NativeType("SDL_ScaleMode") int scaleMode, @NativeType("SDL_Surface *") SDL_Surface.Buffer dst, @NativeType("SDL_Rect const *") SDL_Rect.Buffer dstrect) {
        if (CHECKS) {
            check(src, 1);
            check(srcrect, 1);
            check(dst, 1);
            check(dstrect, 1);
        }
        return nSDL_BlitSurface9Grid(src.address(), srcrect.address(), left_width, right_width, top_height, bottom_height, scale, scaleMode, dst.address(), dstrect.address());
    }

    // --- [ SDL_MapSurfaceRGB ] ---

    /** {@code Uint32 SDL_MapSurfaceRGB(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b)} */
    public static int nSDL_MapSurfaceRGB(long surface, byte r, byte g, byte b) {
        long __functionAddress = Functions.MapSurfaceRGB;
        return invokePUUUI(surface, r, g, b, __functionAddress);
    }

    /** {@code Uint32 SDL_MapSurfaceRGB(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b)} */
    @NativeType("Uint32")
    public static int SDL_MapSurfaceRGB(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_MapSurfaceRGB(surface.address(), r, g, b);
    }

    // --- [ SDL_MapSurfaceRGBA ] ---

    /** {@code Uint32 SDL_MapSurfaceRGBA(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    public static int nSDL_MapSurfaceRGBA(long surface, byte r, byte g, byte b, byte a) {
        long __functionAddress = Functions.MapSurfaceRGBA;
        return invokePUUUUI(surface, r, g, b, a, __functionAddress);
    }

    /** {@code Uint32 SDL_MapSurfaceRGBA(SDL_Surface * surface, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    @NativeType("Uint32")
    public static int SDL_MapSurfaceRGBA(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_MapSurfaceRGBA(surface.address(), r, g, b, a);
    }

    // --- [ SDL_ReadSurfacePixel ] ---

    /** {@code bool SDL_ReadSurfacePixel(SDL_Surface * surface, int x, int y, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    public static boolean nSDL_ReadSurfacePixel(long surface, int x, int y, long r, long g, long b, long a) {
        long __functionAddress = Functions.ReadSurfacePixel;
        return invokePPPPPZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_ReadSurfacePixel(SDL_Surface * surface, int x, int y, Uint8 * r, Uint8 * g, Uint8 * b, Uint8 * a)} */
    @NativeType("bool")
    public static boolean SDL_ReadSurfacePixel(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, int x, int y, @NativeType("Uint8 *") @Nullable ByteBuffer r, @NativeType("Uint8 *") @Nullable ByteBuffer g, @NativeType("Uint8 *") @Nullable ByteBuffer b, @NativeType("Uint8 *") @Nullable ByteBuffer a) {
        if (CHECKS) {
            check(surface, 1);
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
            checkSafe(a, 1);
        }
        return nSDL_ReadSurfacePixel(surface.address(), x, y, memAddressSafe(r), memAddressSafe(g), memAddressSafe(b), memAddressSafe(a));
    }

    // --- [ SDL_ReadSurfacePixelFloat ] ---

    /** {@code bool SDL_ReadSurfacePixelFloat(SDL_Surface * surface, int x, int y, float * r, float * g, float * b, float * a)} */
    public static boolean nSDL_ReadSurfacePixelFloat(long surface, int x, int y, long r, long g, long b, long a) {
        long __functionAddress = Functions.ReadSurfacePixelFloat;
        return invokePPPPPZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_ReadSurfacePixelFloat(SDL_Surface * surface, int x, int y, float * r, float * g, float * b, float * a)} */
    @NativeType("bool")
    public static boolean SDL_ReadSurfacePixelFloat(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, int x, int y, @NativeType("float *") @Nullable FloatBuffer r, @NativeType("float *") @Nullable FloatBuffer g, @NativeType("float *") @Nullable FloatBuffer b, @NativeType("float *") @Nullable FloatBuffer a) {
        if (CHECKS) {
            check(surface, 1);
            checkSafe(r, 1);
            checkSafe(g, 1);
            checkSafe(b, 1);
            checkSafe(a, 1);
        }
        return nSDL_ReadSurfacePixelFloat(surface.address(), x, y, memAddressSafe(r), memAddressSafe(g), memAddressSafe(b), memAddressSafe(a));
    }

    // --- [ SDL_WriteSurfacePixel ] ---

    /** {@code bool SDL_WriteSurfacePixel(SDL_Surface * surface, int x, int y, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    public static boolean nSDL_WriteSurfacePixel(long surface, int x, int y, byte r, byte g, byte b, byte a) {
        long __functionAddress = Functions.WriteSurfacePixel;
        return invokePUUUUZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_WriteSurfacePixel(SDL_Surface * surface, int x, int y, Uint8 r, Uint8 g, Uint8 b, Uint8 a)} */
    @NativeType("bool")
    public static boolean SDL_WriteSurfacePixel(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, int x, int y, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_WriteSurfacePixel(surface.address(), x, y, r, g, b, a);
    }

    // --- [ SDL_WriteSurfacePixelFloat ] ---

    /** {@code bool SDL_WriteSurfacePixelFloat(SDL_Surface * surface, int x, int y, float r, float g, float b, float a)} */
    public static boolean nSDL_WriteSurfacePixelFloat(long surface, int x, int y, float r, float g, float b, float a) {
        long __functionAddress = Functions.WriteSurfacePixelFloat;
        return invokePZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    /** {@code bool SDL_WriteSurfacePixelFloat(SDL_Surface * surface, int x, int y, float r, float g, float b, float a)} */
    @NativeType("bool")
    public static boolean SDL_WriteSurfacePixelFloat(@NativeType("SDL_Surface *") SDL_Surface.Buffer surface, int x, int y, float r, float g, float b, float a) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nSDL_WriteSurfacePixelFloat(surface.address(), x, y, r, g, b, a);
    }

    // --- [ SDL_MUSTLOCK ] ---

    /** {@code bool SDL_MUSTLOCK(SDL_Surface S)} */
    @NativeType("bool")
    public static boolean SDL_MUSTLOCK(SDL_Surface S) {
        return ((S.flags() & SDL_SURFACE_LOCK_NEEDED) == SDL_SURFACE_LOCK_NEEDED);
    }

    // --- [ SDL_SetWindowsMessageHook ] ---

    /** {@code void SDL_SetWindowsMessageHook(SDL_WindowsMessageHook callback, void * userdata)} */
    public static void nSDL_SetWindowsMessageHook(long callback, long userdata) {
        long __functionAddress = Functions.SetWindowsMessageHook;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(callback, userdata, __functionAddress);
    }

    /** {@code void SDL_SetWindowsMessageHook(SDL_WindowsMessageHook callback, void * userdata)} */
    public static void SDL_SetWindowsMessageHook(@NativeType("SDL_WindowsMessageHook") @Nullable SDL_WindowsMessageHookI callback, @NativeType("void *") long userdata) {
        nSDL_SetWindowsMessageHook(memAddressSafe(callback), userdata);
    }

    // --- [ SDL_GetDirect3D9AdapterIndex ] ---

    /** {@code int SDL_GetDirect3D9AdapterIndex(SDL_DisplayID displayID)} */
    public static int SDL_GetDirect3D9AdapterIndex(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetDirect3D9AdapterIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(displayID, __functionAddress);
    }

    // --- [ SDL_GetDXGIOutputInfo ] ---

    /** {@code bool SDL_GetDXGIOutputInfo(SDL_DisplayID displayID, int * adapterIndex, int * outputIndex)} */
    public static boolean nSDL_GetDXGIOutputInfo(int displayID, long adapterIndex, long outputIndex) {
        long __functionAddress = Functions.GetDXGIOutputInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPZ(displayID, adapterIndex, outputIndex, __functionAddress);
    }

    /** {@code bool SDL_GetDXGIOutputInfo(SDL_DisplayID displayID, int * adapterIndex, int * outputIndex)} */
    @NativeType("bool")
    public static boolean SDL_GetDXGIOutputInfo(@NativeType("SDL_DisplayID") int displayID, @NativeType("int *") IntBuffer adapterIndex, @NativeType("int *") IntBuffer outputIndex) {
        if (CHECKS) {
            check(adapterIndex, 1);
            check(outputIndex, 1);
        }
        return nSDL_GetDXGIOutputInfo(displayID, memAddress(adapterIndex), memAddress(outputIndex));
    }

    // --- [ SDL_SetX11EventHook ] ---

    /** {@code void SDL_SetX11EventHook(SDL_X11EventHook callback, void * userdata)} */
    public static void nSDL_SetX11EventHook(long callback, long userdata) {
        long __functionAddress = Functions.SetX11EventHook;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(callback, userdata, __functionAddress);
    }

    /** {@code void SDL_SetX11EventHook(SDL_X11EventHook callback, void * userdata)} */
    public static void SDL_SetX11EventHook(@NativeType("SDL_X11EventHook") @Nullable SDL_X11EventHookI callback, @NativeType("void *") long userdata) {
        nSDL_SetX11EventHook(memAddressSafe(callback), userdata);
    }

    // --- [ SDL_SetLinuxThreadPriority ] ---

    /** {@code bool SDL_SetLinuxThreadPriority(Sint64 threadID, int priority)} */
    @NativeType("bool")
    public static boolean SDL_SetLinuxThreadPriority(@NativeType("Sint64") long threadID, int priority) {
        long __functionAddress = Functions.SetLinuxThreadPriority;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeJZ(threadID, priority, __functionAddress);
    }

    // --- [ SDL_SetLinuxThreadPriorityAndPolicy ] ---

    /** {@code bool SDL_SetLinuxThreadPriorityAndPolicy(Sint64 threadID, int sdlPriority, int schedPolicy)} */
    @NativeType("bool")
    public static boolean SDL_SetLinuxThreadPriorityAndPolicy(@NativeType("Sint64") long threadID, int sdlPriority, int schedPolicy) {
        long __functionAddress = Functions.SetLinuxThreadPriorityAndPolicy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeJZ(threadID, sdlPriority, schedPolicy, __functionAddress);
    }

    // --- [ SDL_SetiOSAnimationCallback ] ---

    /** {@code bool SDL_SetiOSAnimationCallback(SDL_Window * window, int interval, SDL_iOSAnimationCallback callback, void * callbackParam)} */
    public static boolean nSDL_SetiOSAnimationCallback(long window, int interval, long callback, long callbackParam) {
        long __functionAddress = Functions.SetiOSAnimationCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(window);
        }
        return invokePPPZ(window, interval, callback, callbackParam, __functionAddress);
    }

    /** {@code bool SDL_SetiOSAnimationCallback(SDL_Window * window, int interval, SDL_iOSAnimationCallback callback, void * callbackParam)} */
    @NativeType("bool")
    public static boolean SDL_SetiOSAnimationCallback(@NativeType("SDL_Window *") long window, int interval, @NativeType("SDL_iOSAnimationCallback") @Nullable SDL_iOSAnimationCallbackI callback, @NativeType("void *") long callbackParam) {
        return nSDL_SetiOSAnimationCallback(window, interval, memAddressSafe(callback), callbackParam);
    }

    // --- [ SDL_SetiOSEventPump ] ---

    /** {@code void SDL_SetiOSEventPump(bool enabled)} */
    public static void SDL_SetiOSEventPump(@NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetiOSEventPump;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(enabled, __functionAddress);
    }

    // --- [ SDL_GetAndroidJNIEnv ] ---

    /** {@code void * SDL_GetAndroidJNIEnv(void)} */
    @NativeType("void *")
    public static long SDL_GetAndroidJNIEnv() {
        long __functionAddress = Functions.GetAndroidJNIEnv;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ SDL_GetAndroidActivity ] ---

    /** {@code void * SDL_GetAndroidActivity(void)} */
    @NativeType("void *")
    public static long SDL_GetAndroidActivity() {
        long __functionAddress = Functions.GetAndroidActivity;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ SDL_GetAndroidSDKVersion ] ---

    /** {@code int SDL_GetAndroidSDKVersion(void)} */
    public static int SDL_GetAndroidSDKVersion() {
        long __functionAddress = Functions.GetAndroidSDKVersion;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(__functionAddress);
    }

    // --- [ SDL_IsChromebook ] ---

    /** {@code bool SDL_IsChromebook(void)} */
    @NativeType("bool")
    public static boolean SDL_IsChromebook() {
        long __functionAddress = Functions.IsChromebook;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_IsDeXMode ] ---

    /** {@code bool SDL_IsDeXMode(void)} */
    @NativeType("bool")
    public static boolean SDL_IsDeXMode() {
        long __functionAddress = Functions.IsDeXMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_SendAndroidBackButton ] ---

    /** {@code void SDL_SendAndroidBackButton(void)} */
    public static void SDL_SendAndroidBackButton() {
        long __functionAddress = Functions.SendAndroidBackButton;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ SDL_GetAndroidInternalStoragePath ] ---

    /** {@code char const * SDL_GetAndroidInternalStoragePath(void)} */
    public static long nSDL_GetAndroidInternalStoragePath() {
        long __functionAddress = Functions.GetAndroidInternalStoragePath;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetAndroidInternalStoragePath(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAndroidInternalStoragePath() {
        long __result = nSDL_GetAndroidInternalStoragePath();
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetAndroidExternalStorageState ] ---

    /** {@code Uint32 SDL_GetAndroidExternalStorageState(void)} */
    @NativeType("Uint32")
    public static int SDL_GetAndroidExternalStorageState() {
        long __functionAddress = Functions.GetAndroidExternalStorageState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetAndroidExternalStoragePath ] ---

    /** {@code char const * SDL_GetAndroidExternalStoragePath(void)} */
    public static long nSDL_GetAndroidExternalStoragePath() {
        long __functionAddress = Functions.GetAndroidExternalStoragePath;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetAndroidExternalStoragePath(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAndroidExternalStoragePath() {
        long __result = nSDL_GetAndroidExternalStoragePath();
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetAndroidCachePath ] ---

    /** {@code char const * SDL_GetAndroidCachePath(void)} */
    public static long nSDL_GetAndroidCachePath() {
        long __functionAddress = Functions.GetAndroidCachePath;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetAndroidCachePath(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAndroidCachePath() {
        long __result = nSDL_GetAndroidCachePath();
        return memUTF8Safe(__result);
    }

    // --- [ SDL_RequestAndroidPermission ] ---

    /** {@code bool SDL_RequestAndroidPermission(char const * permission, SDL_RequestAndroidPermissionCallback cb, void * userdata)} */
    public static boolean nSDL_RequestAndroidPermission(long permission, long cb, long userdata) {
        long __functionAddress = Functions.RequestAndroidPermission;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPPZ(permission, cb, userdata, __functionAddress);
    }

    /** {@code bool SDL_RequestAndroidPermission(char const * permission, SDL_RequestAndroidPermissionCallback cb, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_RequestAndroidPermission(@NativeType("char const *") ByteBuffer permission, @NativeType("SDL_RequestAndroidPermissionCallback") SDL_RequestAndroidPermissionCallbackI cb, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1(permission);
        }
        return nSDL_RequestAndroidPermission(memAddress(permission), cb.address(), userdata);
    }

    /** {@code bool SDL_RequestAndroidPermission(char const * permission, SDL_RequestAndroidPermissionCallback cb, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_RequestAndroidPermission(@NativeType("char const *") CharSequence permission, @NativeType("SDL_RequestAndroidPermissionCallback") SDL_RequestAndroidPermissionCallbackI cb, @NativeType("void *") long userdata) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(permission, true);
            long permissionEncoded = stack.getPointerAddress();
            return nSDL_RequestAndroidPermission(permissionEncoded, cb.address(), userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ShowAndroidToast ] ---

    /** {@code bool SDL_ShowAndroidToast(char const * message, int duration, int gravity, int xoffset, int yoffset)} */
    public static boolean nSDL_ShowAndroidToast(long message, int duration, int gravity, int xoffset, int yoffset) {
        long __functionAddress = Functions.ShowAndroidToast;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePZ(message, duration, gravity, xoffset, yoffset, __functionAddress);
    }

    /** {@code bool SDL_ShowAndroidToast(char const * message, int duration, int gravity, int xoffset, int yoffset)} */
    @NativeType("bool")
    public static boolean SDL_ShowAndroidToast(@NativeType("char const *") ByteBuffer message, int duration, int gravity, int xoffset, int yoffset) {
        if (CHECKS) {
            checkNT1(message);
        }
        return nSDL_ShowAndroidToast(memAddress(message), duration, gravity, xoffset, yoffset);
    }

    /** {@code bool SDL_ShowAndroidToast(char const * message, int duration, int gravity, int xoffset, int yoffset)} */
    @NativeType("bool")
    public static boolean SDL_ShowAndroidToast(@NativeType("char const *") CharSequence message, int duration, int gravity, int xoffset, int yoffset) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(message, true);
            long messageEncoded = stack.getPointerAddress();
            return nSDL_ShowAndroidToast(messageEncoded, duration, gravity, xoffset, yoffset);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SendAndroidMessage ] ---

    /** {@code bool SDL_SendAndroidMessage(Uint32 command, int param)} */
    @NativeType("bool")
    public static boolean SDL_SendAndroidMessage(@NativeType("Uint32") int command, int param) {
        long __functionAddress = Functions.SendAndroidMessage;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeZ(command, param, __functionAddress);
    }

    // --- [ SDL_IsTablet ] ---

    /** {@code bool SDL_IsTablet(void)} */
    @NativeType("bool")
    public static boolean SDL_IsTablet() {
        long __functionAddress = Functions.IsTablet;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_IsTV ] ---

    /** {@code bool SDL_IsTV(void)} */
    @NativeType("bool")
    public static boolean SDL_IsTV() {
        long __functionAddress = Functions.IsTV;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetSandbox ] ---

    /** {@code SDL_Sandbox SDL_GetSandbox(void)} */
    @NativeType("SDL_Sandbox")
    public static int SDL_GetSandbox() {
        long __functionAddress = Functions.GetSandbox;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_OnApplicationWillTerminate ] ---

    /** {@code void SDL_OnApplicationWillTerminate(void)} */
    public static void SDL_OnApplicationWillTerminate() {
        long __functionAddress = Functions.OnApplicationWillTerminate;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ SDL_OnApplicationDidReceiveMemoryWarning ] ---

    /** {@code void SDL_OnApplicationDidReceiveMemoryWarning(void)} */
    public static void SDL_OnApplicationDidReceiveMemoryWarning() {
        long __functionAddress = Functions.OnApplicationDidReceiveMemoryWarning;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ SDL_OnApplicationWillEnterBackground ] ---

    /** {@code void SDL_OnApplicationWillEnterBackground(void)} */
    public static void SDL_OnApplicationWillEnterBackground() {
        long __functionAddress = Functions.OnApplicationWillEnterBackground;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ SDL_OnApplicationDidEnterBackground ] ---

    /** {@code void SDL_OnApplicationDidEnterBackground(void)} */
    public static void SDL_OnApplicationDidEnterBackground() {
        long __functionAddress = Functions.OnApplicationDidEnterBackground;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ SDL_OnApplicationWillEnterForeground ] ---

    /** {@code void SDL_OnApplicationWillEnterForeground(void)} */
    public static void SDL_OnApplicationWillEnterForeground() {
        long __functionAddress = Functions.OnApplicationWillEnterForeground;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ SDL_OnApplicationDidEnterForeground ] ---

    /** {@code void SDL_OnApplicationDidEnterForeground(void)} */
    public static void SDL_OnApplicationDidEnterForeground() {
        long __functionAddress = Functions.OnApplicationDidEnterForeground;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ SDL_OnApplicationDidChangeStatusBarOrientation ] ---

    /** {@code void SDL_OnApplicationDidChangeStatusBarOrientation(void)} */
    public static void SDL_OnApplicationDidChangeStatusBarOrientation() {
        long __functionAddress = Functions.OnApplicationDidChangeStatusBarOrientation;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ SDL_GetGDKTaskQueue ] ---

    /** {@code bool SDL_GetGDKTaskQueue(XTaskQueueHandle * outTaskQueue)} */
    public static boolean nSDL_GetGDKTaskQueue(long outTaskQueue) {
        long __functionAddress = Functions.GetGDKTaskQueue;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePZ(outTaskQueue, __functionAddress);
    }

    /** {@code bool SDL_GetGDKTaskQueue(XTaskQueueHandle * outTaskQueue)} */
    @NativeType("bool")
    public static boolean SDL_GetGDKTaskQueue(@NativeType("XTaskQueueHandle *") PointerBuffer outTaskQueue) {
        if (CHECKS) {
            check(outTaskQueue, 1);
        }
        return nSDL_GetGDKTaskQueue(memAddress(outTaskQueue));
    }

    // --- [ SDL_GetGDKDefaultUser ] ---

    /** {@code bool SDL_GetGDKDefaultUser(XUserHandle * outUserHandle)} */
    public static boolean nSDL_GetGDKDefaultUser(long outUserHandle) {
        long __functionAddress = Functions.GetGDKDefaultUser;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePZ(outUserHandle, __functionAddress);
    }

    /** {@code bool SDL_GetGDKDefaultUser(XUserHandle * outUserHandle)} */
    @NativeType("bool")
    public static boolean SDL_GetGDKDefaultUser(@NativeType("XUserHandle *") PointerBuffer outUserHandle) {
        if (CHECKS) {
            check(outUserHandle, 1);
        }
        return nSDL_GetGDKDefaultUser(memAddress(outUserHandle));
    }

    // --- [ SDL_GetThreadName ] ---

    /** {@code char const * SDL_GetThreadName(SDL_Thread * thread)} */
    public static long nSDL_GetThreadName(long thread) {
        long __functionAddress = Functions.GetThreadName;
        if (CHECKS) {
            check(thread);
        }
        return invokePP(thread, __functionAddress);
    }

    /** {@code char const * SDL_GetThreadName(SDL_Thread * thread)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetThreadName(@NativeType("SDL_Thread *") long thread) {
        long __result = nSDL_GetThreadName(thread);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetCurrentThreadID ] ---

    /** {@code SDL_ThreadID SDL_GetCurrentThreadID(void)} */
    @NativeType("SDL_ThreadID")
    public static long SDL_GetCurrentThreadID() {
        long __functionAddress = Functions.GetCurrentThreadID;
        return invokeJ(__functionAddress);
    }

    // --- [ SDL_GetThreadID ] ---

    /** {@code SDL_ThreadID SDL_GetThreadID(SDL_Thread * thread)} */
    @NativeType("SDL_ThreadID")
    public static long SDL_GetThreadID(@NativeType("SDL_Thread *") long thread) {
        long __functionAddress = Functions.GetThreadID;
        if (CHECKS) {
            check(thread);
        }
        return invokePJ(thread, __functionAddress);
    }

    // --- [ SDL_SetCurrentThreadPriority ] ---

    /** {@code bool SDL_SetCurrentThreadPriority(SDL_ThreadPriority priority)} */
    @NativeType("bool")
    public static boolean SDL_SetCurrentThreadPriority(@NativeType("SDL_ThreadPriority") int priority) {
        long __functionAddress = Functions.SetCurrentThreadPriority;
        return invokeZ(priority, __functionAddress);
    }

    // --- [ SDL_WaitThread ] ---

    /** {@code void SDL_WaitThread(SDL_Thread * thread, int * status)} */
    public static void nSDL_WaitThread(long thread, long status) {
        long __functionAddress = Functions.WaitThread;
        if (CHECKS) {
            check(thread);
        }
        invokePPV(thread, status, __functionAddress);
    }

    /** {@code void SDL_WaitThread(SDL_Thread * thread, int * status)} */
    public static void SDL_WaitThread(@NativeType("SDL_Thread *") long thread, @NativeType("int *") @Nullable IntBuffer status) {
        if (CHECKS) {
            checkSafe(status, 1);
        }
        nSDL_WaitThread(thread, memAddressSafe(status));
    }

    // --- [ SDL_GetThreadState ] ---

    /** {@code SDL_ThreadState SDL_GetThreadState(SDL_Thread * thread)} */
    @NativeType("SDL_ThreadState")
    public static int SDL_GetThreadState(@NativeType("SDL_Thread *") long thread) {
        long __functionAddress = Functions.GetThreadState;
        if (CHECKS) {
            check(thread);
        }
        return invokePI(thread, __functionAddress);
    }

    // --- [ SDL_DetachThread ] ---

    /** {@code void SDL_DetachThread(SDL_Thread * thread)} */
    public static void SDL_DetachThread(@NativeType("SDL_Thread *") long thread) {
        long __functionAddress = Functions.DetachThread;
        if (CHECKS) {
            check(thread);
        }
        invokePV(thread, __functionAddress);
    }

    // --- [ SDL_GetTLS ] ---

    /** {@code void * SDL_GetTLS(SDL_TLSID * id)} */
    public static long nSDL_GetTLS(long id) {
        long __functionAddress = Functions.GetTLS;
        return invokePP(id, __functionAddress);
    }

    /** {@code void * SDL_GetTLS(SDL_TLSID * id)} */
    @NativeType("void *")
    public static long SDL_GetTLS(@NativeType("SDL_TLSID *") @Nullable IntBuffer id) {
        if (CHECKS) {
            checkSafe(id, 1);
        }
        return nSDL_GetTLS(memAddressSafe(id));
    }

    // --- [ SDL_SetTLS ] ---

    /** {@code bool SDL_SetTLS(SDL_TLSID * id, void * value, SDL_TLSDestructorCallback destructor)} */
    public static boolean nSDL_SetTLS(long id, long value, long destructor) {
        long __functionAddress = Functions.SetTLS;
        if (CHECKS) {
            check(value);
        }
        return invokePPPZ(id, value, destructor, __functionAddress);
    }

    /** {@code bool SDL_SetTLS(SDL_TLSID * id, void * value, SDL_TLSDestructorCallback destructor)} */
    @NativeType("bool")
    public static boolean SDL_SetTLS(@NativeType("SDL_TLSID *") @Nullable IntBuffer id, @NativeType("void *") long value, @NativeType("SDL_TLSDestructorCallback") SDL_TLSDestructorCallbackI destructor) {
        if (CHECKS) {
            checkSafe(id, 1);
        }
        return nSDL_SetTLS(memAddressSafe(id), value, destructor.address());
    }

    // --- [ SDL_CleanupTLS ] ---

    /** {@code void SDL_CleanupTLS(void)} */
    public static void SDL_CleanupTLS() {
        long __functionAddress = Functions.CleanupTLS;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GetDateTimeLocalePreferences ] ---

    /** {@code bool SDL_GetDateTimeLocalePreferences(SDL_DateFormat * dateFormat, SDL_TimeFormat * timeFormat)} */
    public static boolean nSDL_GetDateTimeLocalePreferences(long dateFormat, long timeFormat) {
        long __functionAddress = Functions.GetDateTimeLocalePreferences;
        return invokePPZ(dateFormat, timeFormat, __functionAddress);
    }

    /** {@code bool SDL_GetDateTimeLocalePreferences(SDL_DateFormat * dateFormat, SDL_TimeFormat * timeFormat)} */
    @NativeType("bool")
    public static boolean SDL_GetDateTimeLocalePreferences(@NativeType("SDL_DateFormat *") IntBuffer dateFormat, @NativeType("SDL_TimeFormat *") IntBuffer timeFormat) {
        if (CHECKS) {
            check(dateFormat, 1);
            check(timeFormat, 1);
        }
        return nSDL_GetDateTimeLocalePreferences(memAddress(dateFormat), memAddress(timeFormat));
    }

    // --- [ SDL_GetCurrentTime ] ---

    /** {@code bool SDL_GetCurrentTime(SDL_Time * ticks)} */
    public static boolean nSDL_GetCurrentTime(long ticks) {
        long __functionAddress = Functions.GetCurrentTime;
        return invokePZ(ticks, __functionAddress);
    }

    /** {@code bool SDL_GetCurrentTime(SDL_Time * ticks)} */
    @NativeType("bool")
    public static boolean SDL_GetCurrentTime(@NativeType("SDL_Time *") LongBuffer ticks) {
        if (CHECKS) {
            check(ticks, 1);
        }
        return nSDL_GetCurrentTime(memAddress(ticks));
    }

    // --- [ SDL_TimeToDateTime ] ---

    /** {@code bool SDL_TimeToDateTime(SDL_Time ticks, SDL_DateTime * dt, bool localTime)} */
    public static boolean nSDL_TimeToDateTime(long ticks, long dt, boolean localTime) {
        long __functionAddress = Functions.TimeToDateTime;
        return invokeJPZ(ticks, dt, localTime, __functionAddress);
    }

    /** {@code bool SDL_TimeToDateTime(SDL_Time ticks, SDL_DateTime * dt, bool localTime)} */
    @NativeType("bool")
    public static boolean SDL_TimeToDateTime(@NativeType("SDL_Time") long ticks, @NativeType("SDL_DateTime *") SDL_DateTime.Buffer dt, @NativeType("bool") boolean localTime) {
        if (CHECKS) {
            check(dt, 1);
        }
        return nSDL_TimeToDateTime(ticks, dt.address(), localTime);
    }

    // --- [ SDL_DateTimeToTime ] ---

    /** {@code bool SDL_DateTimeToTime(SDL_DateTime const * dt, SDL_Time * ticks)} */
    public static boolean nSDL_DateTimeToTime(long dt, long ticks) {
        long __functionAddress = Functions.DateTimeToTime;
        return invokePPZ(dt, ticks, __functionAddress);
    }

    /** {@code bool SDL_DateTimeToTime(SDL_DateTime const * dt, SDL_Time * ticks)} */
    @NativeType("bool")
    public static boolean SDL_DateTimeToTime(@NativeType("SDL_DateTime const *") SDL_DateTime.Buffer dt, @NativeType("SDL_Time *") LongBuffer ticks) {
        if (CHECKS) {
            check(dt, 1);
            check(ticks, 1);
        }
        return nSDL_DateTimeToTime(dt.address(), memAddress(ticks));
    }

    // --- [ SDL_TimeToWindows ] ---

    /** {@code void SDL_TimeToWindows(SDL_Time ticks, Uint32 * dwLowDateTime, Uint32 * dwHighDateTime)} */
    public static void nSDL_TimeToWindows(long ticks, long dwLowDateTime, long dwHighDateTime) {
        long __functionAddress = Functions.TimeToWindows;
        invokeJPPV(ticks, dwLowDateTime, dwHighDateTime, __functionAddress);
    }

    /** {@code void SDL_TimeToWindows(SDL_Time ticks, Uint32 * dwLowDateTime, Uint32 * dwHighDateTime)} */
    public static void SDL_TimeToWindows(@NativeType("SDL_Time") long ticks, @NativeType("Uint32 *") IntBuffer dwLowDateTime, @NativeType("Uint32 *") IntBuffer dwHighDateTime) {
        if (CHECKS) {
            check(dwLowDateTime, 1);
            check(dwHighDateTime, 1);
        }
        nSDL_TimeToWindows(ticks, memAddress(dwLowDateTime), memAddress(dwHighDateTime));
    }

    // --- [ SDL_TimeFromWindows ] ---

    /** {@code SDL_Time SDL_TimeFromWindows(Uint32 dwLowDateTime, Uint32 dwHighDateTime)} */
    @NativeType("SDL_Time")
    public static long SDL_TimeFromWindows(@NativeType("Uint32") int dwLowDateTime, @NativeType("Uint32") int dwHighDateTime) {
        long __functionAddress = Functions.TimeFromWindows;
        return invokeJ(dwLowDateTime, dwHighDateTime, __functionAddress);
    }

    // --- [ SDL_GetDaysInMonth ] ---

    /** {@code int SDL_GetDaysInMonth(int year, int month)} */
    public static int SDL_GetDaysInMonth(int year, int month) {
        long __functionAddress = Functions.GetDaysInMonth;
        return invokeI(year, month, __functionAddress);
    }

    // --- [ SDL_GetDayOfYear ] ---

    /** {@code int SDL_GetDayOfYear(int year, int month, int day)} */
    public static int SDL_GetDayOfYear(int year, int month, int day) {
        long __functionAddress = Functions.GetDayOfYear;
        return invokeI(year, month, day, __functionAddress);
    }

    // --- [ SDL_GetDayOfWeek ] ---

    /** {@code int SDL_GetDayOfWeek(int year, int month, int day)} */
    public static int SDL_GetDayOfWeek(int year, int month, int day) {
        long __functionAddress = Functions.GetDayOfWeek;
        return invokeI(year, month, day, __functionAddress);
    }

    // --- [ SDL_GetTicks ] ---

    /** {@code Uint64 SDL_GetTicks(void)} */
    @NativeType("Uint64")
    public static long SDL_GetTicks() {
        long __functionAddress = Functions.GetTicks;
        return invokeJ(__functionAddress);
    }

    // --- [ SDL_GetTicksNS ] ---

    /** {@code Uint64 SDL_GetTicksNS(void)} */
    @NativeType("Uint64")
    public static long SDL_GetTicksNS() {
        long __functionAddress = Functions.GetTicksNS;
        return invokeJ(__functionAddress);
    }

    // --- [ SDL_GetPerformanceCounter ] ---

    /** {@code Uint64 SDL_GetPerformanceCounter(void)} */
    @NativeType("Uint64")
    public static long SDL_GetPerformanceCounter() {
        long __functionAddress = Functions.GetPerformanceCounter;
        return invokeJ(__functionAddress);
    }

    // --- [ SDL_GetPerformanceFrequency ] ---

    /** {@code Uint64 SDL_GetPerformanceFrequency(void)} */
    @NativeType("Uint64")
    public static long SDL_GetPerformanceFrequency() {
        long __functionAddress = Functions.GetPerformanceFrequency;
        return invokeJ(__functionAddress);
    }

    // --- [ SDL_Delay ] ---

    /** {@code void SDL_Delay(Uint32 ms)} */
    public static void SDL_Delay(@NativeType("Uint32") int ms) {
        long __functionAddress = Functions.Delay;
        invokeV(ms, __functionAddress);
    }

    // --- [ SDL_DelayNS ] ---

    /** {@code void SDL_DelayNS(Uint64 ns)} */
    public static void SDL_DelayNS(@NativeType("Uint64") long ns) {
        long __functionAddress = Functions.DelayNS;
        invokeJV(ns, __functionAddress);
    }

    // --- [ SDL_DelayPrecise ] ---

    /** {@code void SDL_DelayPrecise(Uint64 ns)} */
    public static void SDL_DelayPrecise(@NativeType("Uint64") long ns) {
        long __functionAddress = Functions.DelayPrecise;
        invokeJV(ns, __functionAddress);
    }

    // --- [ SDL_AddTimer ] ---

    /** {@code SDL_TimerID SDL_AddTimer(Uint32 interval, SDL_TimerCallback callback, void * userdata)} */
    public static int nSDL_AddTimer(int interval, long callback, long userdata) {
        long __functionAddress = Functions.AddTimer;
        return invokePPI(interval, callback, userdata, __functionAddress);
    }

    /** {@code SDL_TimerID SDL_AddTimer(Uint32 interval, SDL_TimerCallback callback, void * userdata)} */
    @NativeType("SDL_TimerID")
    public static int SDL_AddTimer(@NativeType("Uint32") int interval, @NativeType("SDL_TimerCallback") SDL_TimerCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_AddTimer(interval, callback.address(), userdata);
    }

    // --- [ SDL_AddTimerNS ] ---

    /** {@code SDL_TimerID SDL_AddTimerNS(Uint64 interval, SDL_NSTimerCallback callback, void * userdata)} */
    public static int nSDL_AddTimerNS(long interval, long callback, long userdata) {
        long __functionAddress = Functions.AddTimerNS;
        return invokeJPPI(interval, callback, userdata, __functionAddress);
    }

    /** {@code SDL_TimerID SDL_AddTimerNS(Uint64 interval, SDL_NSTimerCallback callback, void * userdata)} */
    @NativeType("SDL_TimerID")
    public static int SDL_AddTimerNS(@NativeType("Uint64") long interval, @NativeType("SDL_NSTimerCallback") SDL_NSTimerCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_AddTimerNS(interval, callback.address(), userdata);
    }

    // --- [ SDL_RemoveTimer ] ---

    /** {@code bool SDL_RemoveTimer(SDL_TimerID id)} */
    @NativeType("bool")
    public static boolean SDL_RemoveTimer(@NativeType("SDL_TimerID") int id) {
        long __functionAddress = Functions.RemoveTimer;
        return invokeZ(id, __functionAddress);
    }

    // --- [ SDL_SECONDS_TO_NS ] ---

    /** {@code Uint64 SDL_SECONDS_TO_NS(Uint64 S)} */
    @NativeType("Uint64")
    public static long SDL_SECONDS_TO_NS(@NativeType("Uint64") long S) {
        return S * SDL_NS_PER_SECOND;
    }

    // --- [ SDL_NS_TO_SECONDS ] ---

    /** {@code Uint64 SDL_NS_TO_SECONDS(Uint64 NS)} */
    @NativeType("Uint64")
    public static long SDL_NS_TO_SECONDS(@NativeType("Uint64") long NS) {
        return NS / SDL_NS_PER_SECOND;
    }

    // --- [ SDL_MS_TO_NS ] ---

    /** {@code Uint64 SDL_MS_TO_NS(Uint64 MS)} */
    @NativeType("Uint64")
    public static long SDL_MS_TO_NS(@NativeType("Uint64") long MS) {
        return MS * SDL_NS_PER_MS;
    }

    // --- [ SDL_NS_TO_MS ] ---

    /** {@code Uint64 SDL_NS_TO_MS(Uint64 NS)} */
    @NativeType("Uint64")
    public static long SDL_NS_TO_MS(@NativeType("Uint64") long NS) {
        return NS / SDL_NS_PER_MS;
    }

    // --- [ SDL_US_TO_NS ] ---

    /** {@code Uint64 SDL_US_TO_NS(Uint64 US)} */
    @NativeType("Uint64")
    public static long SDL_US_TO_NS(@NativeType("Uint64") long US) {
        return US * SDL_NS_PER_US;
    }

    // --- [ SDL_NS_TO_US ] ---

    /** {@code Uint64 SDL_NS_TO_US(Uint64 NS)} */
    @NativeType("Uint64")
    public static long SDL_NS_TO_US(@NativeType("Uint64") long NS) {
        return NS / SDL_NS_PER_US;
    }

    // --- [ SDL_GetTouchDevices ] ---

    /** {@code SDL_TouchID * SDL_GetTouchDevices(int * count)} */
    public static long nSDL_GetTouchDevices(long count) {
        long __functionAddress = Functions.GetTouchDevices;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_TouchID * SDL_GetTouchDevices(int * count)} */
    @NativeType("SDL_TouchID *")
    public static @Nullable LongBuffer SDL_GetTouchDevices() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetTouchDevices(memAddress(count));
            return memLongBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetTouchDeviceName ] ---

    /** {@code char const * SDL_GetTouchDeviceName(SDL_TouchID touchID)} */
    public static long nSDL_GetTouchDeviceName(long touchID) {
        long __functionAddress = Functions.GetTouchDeviceName;
        return invokeJP(touchID, __functionAddress);
    }

    /** {@code char const * SDL_GetTouchDeviceName(SDL_TouchID touchID)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetTouchDeviceName(@NativeType("SDL_TouchID") long touchID) {
        long __result = nSDL_GetTouchDeviceName(touchID);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetTouchDeviceType ] ---

    /** {@code SDL_TouchDeviceType SDL_GetTouchDeviceType(SDL_TouchID touchID)} */
    @NativeType("SDL_TouchDeviceType")
    public static int SDL_GetTouchDeviceType(@NativeType("SDL_TouchID") long touchID) {
        long __functionAddress = Functions.GetTouchDeviceType;
        return invokeJI(touchID, __functionAddress);
    }

    // --- [ SDL_GetTouchFingers ] ---

    /** {@code SDL_Finger ** SDL_GetTouchFingers(SDL_TouchID touchID, int * count)} */
    public static long nSDL_GetTouchFingers(long touchID, long count) {
        long __functionAddress = Functions.GetTouchFingers;
        return invokeJPP(touchID, count, __functionAddress);
    }

    /** {@code SDL_Finger ** SDL_GetTouchFingers(SDL_TouchID touchID, int * count)} */
    @NativeType("SDL_Finger **")
    public static @Nullable PointerBuffer SDL_GetTouchFingers(@NativeType("SDL_TouchID") long touchID) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetTouchFingers(touchID, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateTray ] ---

    /** {@code SDL_Tray * SDL_CreateTray(SDL_Surface * icon, char const * tooltip)} */
    public static long nSDL_CreateTray(long icon, long tooltip) {
        long __functionAddress = Functions.CreateTray;
        return invokePPP(icon, tooltip, __functionAddress);
    }

    /** {@code SDL_Tray * SDL_CreateTray(SDL_Surface * icon, char const * tooltip)} */
    @NativeType("SDL_Tray *")
    public static long SDL_CreateTray(@NativeType("SDL_Surface *") SDL_Surface.@Nullable Buffer icon, @NativeType("char const *") ByteBuffer tooltip) {
        if (CHECKS) {
            checkSafe(icon, 1);
            checkNT1(tooltip);
        }
        return nSDL_CreateTray(memAddressSafe(icon), memAddress(tooltip));
    }

    /** {@code SDL_Tray * SDL_CreateTray(SDL_Surface * icon, char const * tooltip)} */
    @NativeType("SDL_Tray *")
    public static long SDL_CreateTray(@NativeType("SDL_Surface *") SDL_Surface.@Nullable Buffer icon, @NativeType("char const *") CharSequence tooltip) {
        if (CHECKS) {
            checkSafe(icon, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(tooltip, true);
            long tooltipEncoded = stack.getPointerAddress();
            return nSDL_CreateTray(memAddressSafe(icon), tooltipEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetTrayIcon ] ---

    /** {@code void SDL_SetTrayIcon(SDL_Tray * tray, SDL_Surface * icon)} */
    public static void nSDL_SetTrayIcon(long tray, long icon) {
        long __functionAddress = Functions.SetTrayIcon;
        if (CHECKS) {
            check(tray);
        }
        invokePPV(tray, icon, __functionAddress);
    }

    /** {@code void SDL_SetTrayIcon(SDL_Tray * tray, SDL_Surface * icon)} */
    public static void SDL_SetTrayIcon(@NativeType("SDL_Tray *") long tray, @NativeType("SDL_Surface *") SDL_Surface.@Nullable Buffer icon) {
        if (CHECKS) {
            checkSafe(icon, 1);
        }
        nSDL_SetTrayIcon(tray, memAddressSafe(icon));
    }

    // --- [ SDL_SetTrayTooltip ] ---

    /** {@code void SDL_SetTrayTooltip(SDL_Tray * tray, char const * tooltip)} */
    public static void nSDL_SetTrayTooltip(long tray, long tooltip) {
        long __functionAddress = Functions.SetTrayTooltip;
        if (CHECKS) {
            check(tray);
        }
        invokePPV(tray, tooltip, __functionAddress);
    }

    /** {@code void SDL_SetTrayTooltip(SDL_Tray * tray, char const * tooltip)} */
    public static void SDL_SetTrayTooltip(@NativeType("SDL_Tray *") long tray, @NativeType("char const *") @Nullable ByteBuffer tooltip) {
        if (CHECKS) {
            checkNT1Safe(tooltip);
        }
        nSDL_SetTrayTooltip(tray, memAddressSafe(tooltip));
    }

    /** {@code void SDL_SetTrayTooltip(SDL_Tray * tray, char const * tooltip)} */
    public static void SDL_SetTrayTooltip(@NativeType("SDL_Tray *") long tray, @NativeType("char const *") @Nullable CharSequence tooltip) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(tooltip, true);
            long tooltipEncoded = tooltip == null ? NULL : stack.getPointerAddress();
            nSDL_SetTrayTooltip(tray, tooltipEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateTrayMenu ] ---

    /** {@code SDL_TrayMenu * SDL_CreateTrayMenu(SDL_Tray * tray)} */
    @NativeType("SDL_TrayMenu *")
    public static long SDL_CreateTrayMenu(@NativeType("SDL_Tray *") long tray) {
        long __functionAddress = Functions.CreateTrayMenu;
        if (CHECKS) {
            check(tray);
        }
        return invokePP(tray, __functionAddress);
    }

    // --- [ SDL_CreateTraySubmenu ] ---

    /** {@code SDL_TrayMenu * SDL_CreateTraySubmenu(SDL_TrayEntry * entry)} */
    @NativeType("SDL_TrayMenu *")
    public static long SDL_CreateTraySubmenu(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.CreateTraySubmenu;
        if (CHECKS) {
            check(entry);
        }
        return invokePP(entry, __functionAddress);
    }

    // --- [ SDL_GetTrayMenu ] ---

    /** {@code SDL_TrayMenu * SDL_GetTrayMenu(SDL_Tray * tray)} */
    @NativeType("SDL_TrayMenu *")
    public static long SDL_GetTrayMenu(@NativeType("SDL_Tray *") long tray) {
        long __functionAddress = Functions.GetTrayMenu;
        if (CHECKS) {
            check(tray);
        }
        return invokePP(tray, __functionAddress);
    }

    // --- [ SDL_GetTraySubmenu ] ---

    /** {@code SDL_TrayMenu * SDL_GetTraySubmenu(SDL_TrayEntry * entry)} */
    @NativeType("SDL_TrayMenu *")
    public static long SDL_GetTraySubmenu(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTraySubmenu;
        if (CHECKS) {
            check(entry);
        }
        return invokePP(entry, __functionAddress);
    }

    // --- [ SDL_GetTrayEntries ] ---

    /** {@code SDL_TrayEntry const ** SDL_GetTrayEntries(SDL_TrayMenu * menu, int * size)} */
    public static long nSDL_GetTrayEntries(long menu, long size) {
        long __functionAddress = Functions.GetTrayEntries;
        if (CHECKS) {
            check(menu);
        }
        return invokePPP(menu, size, __functionAddress);
    }

    /** {@code SDL_TrayEntry const ** SDL_GetTrayEntries(SDL_TrayMenu * menu, int * size)} */
    @NativeType("SDL_TrayEntry const **")
    public static @Nullable PointerBuffer SDL_GetTrayEntries(@NativeType("SDL_TrayMenu *") long menu) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer size = stack.callocInt(1);
        try {
            long __result = nSDL_GetTrayEntries(menu, memAddress(size));
            return memPointerBufferSafe(__result, size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RemoveTrayEntry ] ---

    /** {@code void SDL_RemoveTrayEntry(SDL_TrayEntry * entry)} */
    public static void SDL_RemoveTrayEntry(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.RemoveTrayEntry;
        if (CHECKS) {
            check(entry);
        }
        invokePV(entry, __functionAddress);
    }

    // --- [ SDL_InsertTrayEntryAt ] ---

    /** {@code SDL_TrayEntry * SDL_InsertTrayEntryAt(SDL_TrayMenu * menu, int pos, char const * label, SDL_TrayEntryFlags flags)} */
    public static long nSDL_InsertTrayEntryAt(long menu, int pos, long label, int flags) {
        long __functionAddress = Functions.InsertTrayEntryAt;
        if (CHECKS) {
            check(menu);
        }
        return invokePPP(menu, pos, label, flags, __functionAddress);
    }

    /** {@code SDL_TrayEntry * SDL_InsertTrayEntryAt(SDL_TrayMenu * menu, int pos, char const * label, SDL_TrayEntryFlags flags)} */
    @NativeType("SDL_TrayEntry *")
    public static long SDL_InsertTrayEntryAt(@NativeType("SDL_TrayMenu *") long menu, int pos, @NativeType("char const *") @Nullable ByteBuffer label, @NativeType("SDL_TrayEntryFlags") int flags) {
        if (CHECKS) {
            checkNT1Safe(label);
        }
        return nSDL_InsertTrayEntryAt(menu, pos, memAddressSafe(label), flags);
    }

    /** {@code SDL_TrayEntry * SDL_InsertTrayEntryAt(SDL_TrayMenu * menu, int pos, char const * label, SDL_TrayEntryFlags flags)} */
    @NativeType("SDL_TrayEntry *")
    public static long SDL_InsertTrayEntryAt(@NativeType("SDL_TrayMenu *") long menu, int pos, @NativeType("char const *") @Nullable CharSequence label, @NativeType("SDL_TrayEntryFlags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            return nSDL_InsertTrayEntryAt(menu, pos, labelEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetTrayEntryLabel ] ---

    /** {@code void SDL_SetTrayEntryLabel(SDL_TrayEntry * entry, char const * label)} */
    public static void nSDL_SetTrayEntryLabel(long entry, long label) {
        long __functionAddress = Functions.SetTrayEntryLabel;
        if (CHECKS) {
            check(entry);
        }
        invokePPV(entry, label, __functionAddress);
    }

    /** {@code void SDL_SetTrayEntryLabel(SDL_TrayEntry * entry, char const * label)} */
    public static void SDL_SetTrayEntryLabel(@NativeType("SDL_TrayEntry *") long entry, @NativeType("char const *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            checkNT1Safe(label);
        }
        nSDL_SetTrayEntryLabel(entry, memAddressSafe(label));
    }

    /** {@code void SDL_SetTrayEntryLabel(SDL_TrayEntry * entry, char const * label)} */
    public static void SDL_SetTrayEntryLabel(@NativeType("SDL_TrayEntry *") long entry, @NativeType("char const *") @Nullable CharSequence label) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nSDL_SetTrayEntryLabel(entry, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetTrayEntryLabel ] ---

    /** {@code char const * SDL_GetTrayEntryLabel(SDL_TrayEntry * entry)} */
    public static long nSDL_GetTrayEntryLabel(long entry) {
        long __functionAddress = Functions.GetTrayEntryLabel;
        if (CHECKS) {
            check(entry);
        }
        return invokePP(entry, __functionAddress);
    }

    /** {@code char const * SDL_GetTrayEntryLabel(SDL_TrayEntry * entry)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetTrayEntryLabel(@NativeType("SDL_TrayEntry *") long entry) {
        long __result = nSDL_GetTrayEntryLabel(entry);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_SetTrayEntryChecked ] ---

    /** {@code void SDL_SetTrayEntryChecked(SDL_TrayEntry * entry, bool checked)} */
    public static void SDL_SetTrayEntryChecked(@NativeType("SDL_TrayEntry *") long entry, @NativeType("bool") boolean checked) {
        long __functionAddress = Functions.SetTrayEntryChecked;
        if (CHECKS) {
            check(entry);
        }
        invokePV(entry, checked, __functionAddress);
    }

    // --- [ SDL_GetTrayEntryChecked ] ---

    /** {@code bool SDL_GetTrayEntryChecked(SDL_TrayEntry * entry)} */
    @NativeType("bool")
    public static boolean SDL_GetTrayEntryChecked(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTrayEntryChecked;
        if (CHECKS) {
            check(entry);
        }
        return invokePZ(entry, __functionAddress);
    }

    // --- [ SDL_SetTrayEntryEnabled ] ---

    /** {@code void SDL_SetTrayEntryEnabled(SDL_TrayEntry * entry, bool enabled)} */
    public static void SDL_SetTrayEntryEnabled(@NativeType("SDL_TrayEntry *") long entry, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetTrayEntryEnabled;
        if (CHECKS) {
            check(entry);
        }
        invokePV(entry, enabled, __functionAddress);
    }

    // --- [ SDL_GetTrayEntryEnabled ] ---

    /** {@code bool SDL_GetTrayEntryEnabled(SDL_TrayEntry * entry)} */
    @NativeType("bool")
    public static boolean SDL_GetTrayEntryEnabled(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTrayEntryEnabled;
        if (CHECKS) {
            check(entry);
        }
        return invokePZ(entry, __functionAddress);
    }

    // --- [ SDL_SetTrayEntryCallback ] ---

    /** {@code void SDL_SetTrayEntryCallback(SDL_TrayEntry * entry, SDL_TrayCallback callback, void * userdata)} */
    public static void nSDL_SetTrayEntryCallback(long entry, long callback, long userdata) {
        long __functionAddress = Functions.SetTrayEntryCallback;
        if (CHECKS) {
            check(entry);
        }
        invokePPPV(entry, callback, userdata, __functionAddress);
    }

    /** {@code void SDL_SetTrayEntryCallback(SDL_TrayEntry * entry, SDL_TrayCallback callback, void * userdata)} */
    public static void SDL_SetTrayEntryCallback(@NativeType("SDL_TrayEntry *") long entry, @NativeType("SDL_TrayCallback") @Nullable SDL_TrayCallbackI callback, @NativeType("void *") long userdata) {
        nSDL_SetTrayEntryCallback(entry, memAddressSafe(callback), userdata);
    }

    // --- [ SDL_DestroyTray ] ---

    /** {@code void SDL_DestroyTray(SDL_Tray * tray)} */
    public static void SDL_DestroyTray(@NativeType("SDL_Tray *") long tray) {
        long __functionAddress = Functions.DestroyTray;
        if (CHECKS) {
            check(tray);
        }
        invokePV(tray, __functionAddress);
    }

    // --- [ SDL_GetTrayEntryParent ] ---

    /** {@code SDL_TrayMenu * SDL_GetTrayEntryParent(SDL_TrayEntry * entry)} */
    @NativeType("SDL_TrayMenu *")
    public static long SDL_GetTrayEntryParent(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTrayEntryParent;
        if (CHECKS) {
            check(entry);
        }
        return invokePP(entry, __functionAddress);
    }

    // --- [ SDL_GetTrayMenuParentEntry ] ---

    /** {@code SDL_TrayEntry * SDL_GetTrayMenuParentEntry(SDL_TrayMenu * menu)} */
    @NativeType("SDL_TrayEntry *")
    public static long SDL_GetTrayMenuParentEntry(@NativeType("SDL_TrayMenu *") long menu) {
        long __functionAddress = Functions.GetTrayMenuParentEntry;
        if (CHECKS) {
            check(menu);
        }
        return invokePP(menu, __functionAddress);
    }

    // --- [ SDL_GetTrayMenuParentTray ] ---

    /** {@code SDL_Tray * SDL_GetTrayMenuParentTray(SDL_TrayMenu * menu)} */
    @NativeType("SDL_Tray *")
    public static long SDL_GetTrayMenuParentTray(@NativeType("SDL_TrayMenu *") long menu) {
        long __functionAddress = Functions.GetTrayMenuParentTray;
        if (CHECKS) {
            check(menu);
        }
        return invokePP(menu, __functionAddress);
    }

    // --- [ SDL_GetVersion ] ---

    /** {@code int SDL_GetVersion(void)} */
    public static int SDL_GetVersion() {
        long __functionAddress = Functions.GetVersion;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetRevision ] ---

    /** {@code char const * SDL_GetRevision(void)} */
    public static long nSDL_GetRevision() {
        long __functionAddress = Functions.GetRevision;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetRevision(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetRevision() {
        long __result = nSDL_GetRevision();
        return memASCIISafe(__result);
    }

    // --- [ SDL_VERSIONNUM ] ---

    /** {@code uint32_t SDL_VERSIONNUM(uint32_t major, uint32_t minor, uint32_t patch)} */
    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return ((major) * 1000000 + (minor) * 1000 + (patch));
    }

    // --- [ SDL_VERSIONNUM_MAJOR ] ---

    /** {@code uint32_t SDL_VERSIONNUM_MAJOR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM_MAJOR(@NativeType("uint32_t") int version) {
        return ((version) / 1000000);
    }

    // --- [ SDL_VERSIONNUM_MINOR ] ---

    /** {@code uint32_t SDL_VERSIONNUM_MINOR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM_MINOR(@NativeType("uint32_t") int version) {
        return (((version) / 1000) % 1000);
    }

    // --- [ SDL_VERSIONNUM_MICRO ] ---

    /** {@code uint32_t SDL_VERSIONNUM_MICRO(uint32_t version)} */
    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM_MICRO(@NativeType("uint32_t") int version) {
        return ((version) % 1000);
    }

    // --- [ SDL_VERSION_ATLEAST ] ---

    /** {@code bool SDL_VERSION_ATLEAST(uint32_t X, uint32_t Y, uint32_t Z)} */
    @NativeType("bool")
    public static boolean SDL_VERSION_ATLEAST(@NativeType("uint32_t") int X, @NativeType("uint32_t") int Y, @NativeType("uint32_t") int Z) {
        return (SDL_VERSION >= SDL_VERSIONNUM(X, Y, Z));
    }

    // --- [ SDL_GetNumVideoDrivers ] ---

    /** {@code int SDL_GetNumVideoDrivers(void)} */
    public static int SDL_GetNumVideoDrivers() {
        long __functionAddress = Functions.GetNumVideoDrivers;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetVideoDriver ] ---

    /** {@code char const * SDL_GetVideoDriver(int index)} */
    public static long nSDL_GetVideoDriver(int index) {
        long __functionAddress = Functions.GetVideoDriver;
        return invokeP(index, __functionAddress);
    }

    /** {@code char const * SDL_GetVideoDriver(int index)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetVideoDriver(int index) {
        long __result = nSDL_GetVideoDriver(index);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetCurrentVideoDriver ] ---

    /** {@code char const * SDL_GetCurrentVideoDriver(void)} */
    public static long nSDL_GetCurrentVideoDriver() {
        long __functionAddress = Functions.GetCurrentVideoDriver;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetCurrentVideoDriver(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetCurrentVideoDriver() {
        long __result = nSDL_GetCurrentVideoDriver();
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetSystemTheme ] ---

    /** {@code SDL_SystemTheme SDL_GetSystemTheme(void)} */
    @NativeType("SDL_SystemTheme")
    public static int SDL_GetSystemTheme() {
        long __functionAddress = Functions.GetSystemTheme;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetDisplays ] ---

    /** {@code SDL_DisplayID * SDL_GetDisplays(int * count)} */
    public static long nSDL_GetDisplays(long count) {
        long __functionAddress = Functions.GetDisplays;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_DisplayID * SDL_GetDisplays(int * count)} */
    @NativeType("SDL_DisplayID *")
    public static @Nullable IntBuffer SDL_GetDisplays() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetDisplays(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetPrimaryDisplay ] ---

    /** {@code SDL_DisplayID SDL_GetPrimaryDisplay(void)} */
    @NativeType("SDL_DisplayID")
    public static int SDL_GetPrimaryDisplay() {
        long __functionAddress = Functions.GetPrimaryDisplay;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetDisplayProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetDisplayProperties(SDL_DisplayID displayID)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetDisplayProperties(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetDisplayProperties;
        return invokeI(displayID, __functionAddress);
    }

    // --- [ SDL_GetDisplayName ] ---

    /** {@code char const * SDL_GetDisplayName(SDL_DisplayID displayID)} */
    public static long nSDL_GetDisplayName(int displayID) {
        long __functionAddress = Functions.GetDisplayName;
        return invokeP(displayID, __functionAddress);
    }

    /** {@code char const * SDL_GetDisplayName(SDL_DisplayID displayID)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetDisplayName(@NativeType("SDL_DisplayID") int displayID) {
        long __result = nSDL_GetDisplayName(displayID);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetDisplayBounds ] ---

    /** {@code bool SDL_GetDisplayBounds(SDL_DisplayID displayID, SDL_Rect * rect)} */
    public static boolean nSDL_GetDisplayBounds(int displayID, long rect) {
        long __functionAddress = Functions.GetDisplayBounds;
        return invokePZ(displayID, rect, __functionAddress);
    }

    /** {@code bool SDL_GetDisplayBounds(SDL_DisplayID displayID, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetDisplayBounds(@NativeType("SDL_DisplayID") int displayID, @NativeType("SDL_Rect *") SDL_Rect.Buffer rect) {
        if (CHECKS) {
            check(rect, 1);
        }
        return nSDL_GetDisplayBounds(displayID, rect.address());
    }

    // --- [ SDL_GetDisplayUsableBounds ] ---

    /** {@code bool SDL_GetDisplayUsableBounds(SDL_DisplayID displayID, SDL_Rect * rect)} */
    public static boolean nSDL_GetDisplayUsableBounds(int displayID, long rect) {
        long __functionAddress = Functions.GetDisplayUsableBounds;
        return invokePZ(displayID, rect, __functionAddress);
    }

    /** {@code bool SDL_GetDisplayUsableBounds(SDL_DisplayID displayID, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetDisplayUsableBounds(@NativeType("SDL_DisplayID") int displayID, @NativeType("SDL_Rect *") SDL_Rect.Buffer rect) {
        if (CHECKS) {
            check(rect, 1);
        }
        return nSDL_GetDisplayUsableBounds(displayID, rect.address());
    }

    // --- [ SDL_GetNaturalDisplayOrientation ] ---

    /** {@code SDL_DisplayOrientation SDL_GetNaturalDisplayOrientation(SDL_DisplayID displayID)} */
    @NativeType("SDL_DisplayOrientation")
    public static int SDL_GetNaturalDisplayOrientation(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetNaturalDisplayOrientation;
        return invokeI(displayID, __functionAddress);
    }

    // --- [ SDL_GetCurrentDisplayOrientation ] ---

    /** {@code SDL_DisplayOrientation SDL_GetCurrentDisplayOrientation(SDL_DisplayID displayID)} */
    @NativeType("SDL_DisplayOrientation")
    public static int SDL_GetCurrentDisplayOrientation(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetCurrentDisplayOrientation;
        return invokeI(displayID, __functionAddress);
    }

    // --- [ SDL_GetDisplayContentScale ] ---

    /** {@code float SDL_GetDisplayContentScale(SDL_DisplayID displayID)} */
    public static float SDL_GetDisplayContentScale(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetDisplayContentScale;
        return invokeF(displayID, __functionAddress);
    }

    // --- [ SDL_GetFullscreenDisplayModes ] ---

    /** {@code SDL_DisplayMode ** SDL_GetFullscreenDisplayModes(SDL_DisplayID displayID, int * count)} */
    public static long nSDL_GetFullscreenDisplayModes(int displayID, long count) {
        long __functionAddress = Functions.GetFullscreenDisplayModes;
        return invokePP(displayID, count, __functionAddress);
    }

    /** {@code SDL_DisplayMode ** SDL_GetFullscreenDisplayModes(SDL_DisplayID displayID, int * count)} */
    @NativeType("SDL_DisplayMode **")
    public static @Nullable PointerBuffer SDL_GetFullscreenDisplayModes(@NativeType("SDL_DisplayID") int displayID) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetFullscreenDisplayModes(displayID, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetClosestFullscreenDisplayMode ] ---

    /** {@code bool SDL_GetClosestFullscreenDisplayMode(SDL_DisplayID displayID, int w, int h, float refresh_rate, bool include_high_density_modes, SDL_DisplayMode * closest)} */
    public static boolean nSDL_GetClosestFullscreenDisplayMode(int displayID, int w, int h, float refresh_rate, boolean include_high_density_modes, long closest) {
        long __functionAddress = Functions.GetClosestFullscreenDisplayMode;
        return invokePZ(displayID, w, h, refresh_rate, include_high_density_modes, closest, __functionAddress);
    }

    /** {@code bool SDL_GetClosestFullscreenDisplayMode(SDL_DisplayID displayID, int w, int h, float refresh_rate, bool include_high_density_modes, SDL_DisplayMode * closest)} */
    @NativeType("bool")
    public static boolean SDL_GetClosestFullscreenDisplayMode(@NativeType("SDL_DisplayID") int displayID, int w, int h, float refresh_rate, @NativeType("bool") boolean include_high_density_modes, @NativeType("SDL_DisplayMode *") SDL_DisplayMode.Buffer closest) {
        if (CHECKS) {
            check(closest, 1);
        }
        return nSDL_GetClosestFullscreenDisplayMode(displayID, w, h, refresh_rate, include_high_density_modes, closest.address());
    }

    // --- [ SDL_GetDesktopDisplayMode ] ---

    /** {@code SDL_DisplayMode const * SDL_GetDesktopDisplayMode(SDL_DisplayID displayID)} */
    public static long nSDL_GetDesktopDisplayMode(int displayID) {
        long __functionAddress = Functions.GetDesktopDisplayMode;
        return invokeP(displayID, __functionAddress);
    }

    /** {@code SDL_DisplayMode const * SDL_GetDesktopDisplayMode(SDL_DisplayID displayID)} */
    @NativeType("SDL_DisplayMode const *")
    public static @Nullable SDL_DisplayMode SDL_GetDesktopDisplayMode(@NativeType("SDL_DisplayID") int displayID) {
        long __result = nSDL_GetDesktopDisplayMode(displayID);
        return SDL_DisplayMode.createSafe(__result);
    }

    // --- [ SDL_GetCurrentDisplayMode ] ---

    /** {@code SDL_DisplayMode const * SDL_GetCurrentDisplayMode(SDL_DisplayID displayID)} */
    public static long nSDL_GetCurrentDisplayMode(int displayID) {
        long __functionAddress = Functions.GetCurrentDisplayMode;
        return invokeP(displayID, __functionAddress);
    }

    /** {@code SDL_DisplayMode const * SDL_GetCurrentDisplayMode(SDL_DisplayID displayID)} */
    @NativeType("SDL_DisplayMode const *")
    public static @Nullable SDL_DisplayMode SDL_GetCurrentDisplayMode(@NativeType("SDL_DisplayID") int displayID) {
        long __result = nSDL_GetCurrentDisplayMode(displayID);
        return SDL_DisplayMode.createSafe(__result);
    }

    // --- [ SDL_GetDisplayForPoint ] ---

    /** {@code SDL_DisplayID SDL_GetDisplayForPoint(SDL_Point const * point)} */
    public static int nSDL_GetDisplayForPoint(long point) {
        long __functionAddress = Functions.GetDisplayForPoint;
        return invokePI(point, __functionAddress);
    }

    /** {@code SDL_DisplayID SDL_GetDisplayForPoint(SDL_Point const * point)} */
    @NativeType("SDL_DisplayID")
    public static int SDL_GetDisplayForPoint(@NativeType("SDL_Point const *") SDL_Point.Buffer point) {
        if (CHECKS) {
            check(point, 1);
        }
        return nSDL_GetDisplayForPoint(point.address());
    }

    // --- [ SDL_GetDisplayForRect ] ---

    /** {@code SDL_DisplayID SDL_GetDisplayForRect(SDL_Rect const * rect)} */
    public static int nSDL_GetDisplayForRect(long rect) {
        long __functionAddress = Functions.GetDisplayForRect;
        return invokePI(rect, __functionAddress);
    }

    /** {@code SDL_DisplayID SDL_GetDisplayForRect(SDL_Rect const * rect)} */
    @NativeType("SDL_DisplayID")
    public static int SDL_GetDisplayForRect(@NativeType("SDL_Rect const *") SDL_Rect.Buffer rect) {
        if (CHECKS) {
            check(rect, 1);
        }
        return nSDL_GetDisplayForRect(rect.address());
    }

    // --- [ SDL_GetDisplayForWindow ] ---

    /** {@code SDL_DisplayID SDL_GetDisplayForWindow(SDL_Window * window)} */
    @NativeType("SDL_DisplayID")
    public static int SDL_GetDisplayForWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetDisplayForWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ SDL_GetWindowPixelDensity ] ---

    /** {@code float SDL_GetWindowPixelDensity(SDL_Window * window)} */
    public static float SDL_GetWindowPixelDensity(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowPixelDensity;
        if (CHECKS) {
            check(window);
        }
        return invokePF(window, __functionAddress);
    }

    // --- [ SDL_GetWindowDisplayScale ] ---

    /** {@code float SDL_GetWindowDisplayScale(SDL_Window * window)} */
    public static float SDL_GetWindowDisplayScale(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowDisplayScale;
        if (CHECKS) {
            check(window);
        }
        return invokePF(window, __functionAddress);
    }

    // --- [ SDL_SetWindowFullscreenMode ] ---

    /** {@code bool SDL_SetWindowFullscreenMode(SDL_Window * window, SDL_DisplayMode const * mode)} */
    public static boolean nSDL_SetWindowFullscreenMode(long window, long mode) {
        long __functionAddress = Functions.SetWindowFullscreenMode;
        if (CHECKS) {
            check(window);
            Struct.validate(mode, 1, SDL_DisplayMode.SIZEOF, SDL_DisplayMode::validate);
        }
        return invokePPZ(window, mode, __functionAddress);
    }

    /** {@code bool SDL_SetWindowFullscreenMode(SDL_Window * window, SDL_DisplayMode const * mode)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowFullscreenMode(@NativeType("SDL_Window *") long window, @NativeType("SDL_DisplayMode const *") SDL_DisplayMode.Buffer mode) {
        if (CHECKS) {
            check(mode, 1);
        }
        return nSDL_SetWindowFullscreenMode(window, mode.address());
    }

    // --- [ SDL_GetWindowFullscreenMode ] ---

    /** {@code SDL_DisplayMode const * SDL_GetWindowFullscreenMode(SDL_Window * window)} */
    public static long nSDL_GetWindowFullscreenMode(long window) {
        long __functionAddress = Functions.GetWindowFullscreenMode;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** {@code SDL_DisplayMode const * SDL_GetWindowFullscreenMode(SDL_Window * window)} */
    @NativeType("SDL_DisplayMode const *")
    public static @Nullable SDL_DisplayMode SDL_GetWindowFullscreenMode(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowFullscreenMode(window);
        return SDL_DisplayMode.createSafe(__result);
    }

    // --- [ SDL_GetWindowICCProfile ] ---

    /** {@code void * SDL_GetWindowICCProfile(SDL_Window * window, size_t * size)} */
    public static long nSDL_GetWindowICCProfile(long window, long size) {
        long __functionAddress = Functions.GetWindowICCProfile;
        if (CHECKS) {
            check(window);
        }
        return invokePPP(window, size, __functionAddress);
    }

    /** {@code void * SDL_GetWindowICCProfile(SDL_Window * window, size_t * size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_GetWindowICCProfile(@NativeType("SDL_Window *") long window) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer size = stack.callocPointer(1);
        try {
            long __result = nSDL_GetWindowICCProfile(window, memAddress(size));
            return memByteBufferSafe(__result, (int)size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetWindowPixelFormat ] ---

    /** {@code SDL_PixelFormat SDL_GetWindowPixelFormat(SDL_Window * window)} */
    @NativeType("SDL_PixelFormat")
    public static int SDL_GetWindowPixelFormat(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowPixelFormat;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ SDL_GetWindows ] ---

    /** {@code SDL_Window ** SDL_GetWindows(int * count)} */
    public static long nSDL_GetWindows(long count) {
        long __functionAddress = Functions.GetWindows;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_Window ** SDL_GetWindows(int * count)} */
    @NativeType("SDL_Window **")
    public static @Nullable PointerBuffer SDL_GetWindows() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetWindows(memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateWindow ] ---

    /** {@code SDL_Window * SDL_CreateWindow(char const * title, int w, int h, SDL_WindowFlags flags)} */
    public static long nSDL_CreateWindow(long title, int w, int h, long flags) {
        long __functionAddress = Functions.CreateWindow;
        return invokePJP(title, w, h, flags, __functionAddress);
    }

    /** {@code SDL_Window * SDL_CreateWindow(char const * title, int w, int h, SDL_WindowFlags flags)} */
    @NativeType("SDL_Window *")
    public static long SDL_CreateWindow(@NativeType("char const *") ByteBuffer title, int w, int h, @NativeType("SDL_WindowFlags") long flags) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nSDL_CreateWindow(memAddress(title), w, h, flags);
    }

    /** {@code SDL_Window * SDL_CreateWindow(char const * title, int w, int h, SDL_WindowFlags flags)} */
    @NativeType("SDL_Window *")
    public static long SDL_CreateWindow(@NativeType("char const *") CharSequence title, int w, int h, @NativeType("SDL_WindowFlags") long flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nSDL_CreateWindow(titleEncoded, w, h, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreatePopupWindow ] ---

    /** {@code SDL_Window * SDL_CreatePopupWindow(SDL_Window * parent, int offset_x, int offset_y, int w, int h, SDL_WindowFlags flags)} */
    @NativeType("SDL_Window *")
    public static long SDL_CreatePopupWindow(@NativeType("SDL_Window *") long parent, int offset_x, int offset_y, int w, int h, @NativeType("SDL_WindowFlags") long flags) {
        long __functionAddress = Functions.CreatePopupWindow;
        if (CHECKS) {
            check(parent);
        }
        return invokePJP(parent, offset_x, offset_y, w, h, flags, __functionAddress);
    }

    // --- [ SDL_CreateWindowWithProperties ] ---

    /** {@code SDL_Window * SDL_CreateWindowWithProperties(SDL_PropertiesID props)} */
    @NativeType("SDL_Window *")
    public static long SDL_CreateWindowWithProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.CreateWindowWithProperties;
        return invokeP(props, __functionAddress);
    }

    // --- [ SDL_GetWindowID ] ---

    /** {@code SDL_WindowID SDL_GetWindowID(SDL_Window * window)} */
    @NativeType("SDL_WindowID")
    public static int SDL_GetWindowID(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowID;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ SDL_GetWindowFromID ] ---

    /** {@code SDL_Window * SDL_GetWindowFromID(SDL_WindowID id)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetWindowFromID(@NativeType("SDL_WindowID") int id) {
        long __functionAddress = Functions.GetWindowFromID;
        return invokeP(id, __functionAddress);
    }

    // --- [ SDL_GetWindowParent ] ---

    /** {@code SDL_Window * SDL_GetWindowParent(SDL_Window * window)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetWindowParent(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowParent;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ SDL_GetWindowProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetWindowProperties(SDL_Window * window)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetWindowProperties(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowProperties;
        if (CHECKS) {
            check(window);
        }
        return invokePI(window, __functionAddress);
    }

    // --- [ SDL_GetWindowFlags ] ---

    /** {@code SDL_WindowFlags SDL_GetWindowFlags(SDL_Window * window)} */
    @NativeType("SDL_WindowFlags")
    public static long SDL_GetWindowFlags(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowFlags;
        if (CHECKS) {
            check(window);
        }
        return invokePJ(window, __functionAddress);
    }

    // --- [ SDL_SetWindowTitle ] ---

    /** {@code bool SDL_SetWindowTitle(SDL_Window * window, char const * title)} */
    public static boolean nSDL_SetWindowTitle(long window, long title) {
        long __functionAddress = Functions.SetWindowTitle;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, title, __functionAddress);
    }

    /** {@code bool SDL_SetWindowTitle(SDL_Window * window, char const * title)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowTitle(@NativeType("SDL_Window *") long window, @NativeType("char const *") ByteBuffer title) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nSDL_SetWindowTitle(window, memAddress(title));
    }

    /** {@code bool SDL_SetWindowTitle(SDL_Window * window, char const * title)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowTitle(@NativeType("SDL_Window *") long window, @NativeType("char const *") CharSequence title) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nSDL_SetWindowTitle(window, titleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetWindowTitle ] ---

    /** {@code char const * SDL_GetWindowTitle(SDL_Window * window)} */
    public static long nSDL_GetWindowTitle(long window) {
        long __functionAddress = Functions.GetWindowTitle;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** {@code char const * SDL_GetWindowTitle(SDL_Window * window)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetWindowTitle(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowTitle(window);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_SetWindowIcon ] ---

    /** {@code bool SDL_SetWindowIcon(SDL_Window * window, SDL_Surface * icon)} */
    public static boolean nSDL_SetWindowIcon(long window, long icon) {
        long __functionAddress = Functions.SetWindowIcon;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, icon, __functionAddress);
    }

    /** {@code bool SDL_SetWindowIcon(SDL_Window * window, SDL_Surface * icon)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowIcon(@NativeType("SDL_Window *") long window, @NativeType("SDL_Surface *") SDL_Surface.Buffer icon) {
        if (CHECKS) {
            check(icon, 1);
        }
        return nSDL_SetWindowIcon(window, icon.address());
    }

    // --- [ SDL_SetWindowPosition ] ---

    /** {@code bool SDL_SetWindowPosition(SDL_Window * window, int x, int y)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowPosition(@NativeType("SDL_Window *") long window, int x, int y) {
        long __functionAddress = Functions.SetWindowPosition;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, x, y, __functionAddress);
    }

    // --- [ SDL_GetWindowPosition ] ---

    /** {@code bool SDL_GetWindowPosition(SDL_Window * window, int * x, int * y)} */
    public static boolean nSDL_GetWindowPosition(long window, long x, long y) {
        long __functionAddress = Functions.GetWindowPosition;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, x, y, __functionAddress);
    }

    /** {@code bool SDL_GetWindowPosition(SDL_Window * window, int * x, int * y)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowPosition(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer x, @NativeType("int *") IntBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        return nSDL_GetWindowPosition(window, memAddress(x), memAddress(y));
    }

    // --- [ SDL_SetWindowSize ] ---

    /** {@code bool SDL_SetWindowSize(SDL_Window * window, int w, int h)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowSize(@NativeType("SDL_Window *") long window, int w, int h) {
        long __functionAddress = Functions.SetWindowSize;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, w, h, __functionAddress);
    }

    // --- [ SDL_GetWindowSize ] ---

    /** {@code bool SDL_GetWindowSize(SDL_Window * window, int * w, int * h)} */
    public static boolean nSDL_GetWindowSize(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowSize;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetWindowSize(SDL_Window * window, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowSize(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (CHECKS) {
            check(w, 1);
            check(h, 1);
        }
        return nSDL_GetWindowSize(window, memAddress(w), memAddress(h));
    }

    // --- [ SDL_GetWindowSafeArea ] ---

    /** {@code bool SDL_GetWindowSafeArea(SDL_Window * window, SDL_Rect * rect)} */
    public static boolean nSDL_GetWindowSafeArea(long window, long rect) {
        long __functionAddress = Functions.GetWindowSafeArea;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, rect, __functionAddress);
    }

    /** {@code bool SDL_GetWindowSafeArea(SDL_Window * window, SDL_Rect * rect)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowSafeArea(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect *") SDL_Rect.Buffer rect) {
        if (CHECKS) {
            check(rect, 1);
        }
        return nSDL_GetWindowSafeArea(window, rect.address());
    }

    // --- [ SDL_SetWindowAspectRatio ] ---

    /** {@code bool SDL_SetWindowAspectRatio(SDL_Window * window, float min_aspect, float max_aspect)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowAspectRatio(@NativeType("SDL_Window *") long window, float min_aspect, float max_aspect) {
        long __functionAddress = Functions.SetWindowAspectRatio;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, min_aspect, max_aspect, __functionAddress);
    }

    // --- [ SDL_GetWindowAspectRatio ] ---

    /** {@code bool SDL_GetWindowAspectRatio(SDL_Window * window, float * min_aspect, float * max_aspect)} */
    public static boolean nSDL_GetWindowAspectRatio(long window, long min_aspect, long max_aspect) {
        long __functionAddress = Functions.GetWindowAspectRatio;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, min_aspect, max_aspect, __functionAddress);
    }

    /** {@code bool SDL_GetWindowAspectRatio(SDL_Window * window, float * min_aspect, float * max_aspect)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowAspectRatio(@NativeType("SDL_Window *") long window, @NativeType("float *") FloatBuffer min_aspect, @NativeType("float *") FloatBuffer max_aspect) {
        if (CHECKS) {
            check(min_aspect, 1);
            check(max_aspect, 1);
        }
        return nSDL_GetWindowAspectRatio(window, memAddress(min_aspect), memAddress(max_aspect));
    }

    // --- [ SDL_GetWindowBordersSize ] ---

    /** {@code bool SDL_GetWindowBordersSize(SDL_Window * window, int * top, int * left, int * bottom, int * right)} */
    public static boolean nSDL_GetWindowBordersSize(long window, long top, long left, long bottom, long right) {
        long __functionAddress = Functions.GetWindowBordersSize;
        if (CHECKS) {
            check(window);
        }
        return invokePPPPPZ(window, top, left, bottom, right, __functionAddress);
    }

    /** {@code bool SDL_GetWindowBordersSize(SDL_Window * window, int * top, int * left, int * bottom, int * right)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowBordersSize(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer top, @NativeType("int *") IntBuffer left, @NativeType("int *") IntBuffer bottom, @NativeType("int *") IntBuffer right) {
        if (CHECKS) {
            check(top, 1);
            check(left, 1);
            check(bottom, 1);
            check(right, 1);
        }
        return nSDL_GetWindowBordersSize(window, memAddress(top), memAddress(left), memAddress(bottom), memAddress(right));
    }

    // --- [ SDL_GetWindowSizeInPixels ] ---

    /** {@code bool SDL_GetWindowSizeInPixels(SDL_Window * window, int * w, int * h)} */
    public static boolean nSDL_GetWindowSizeInPixels(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowSizeInPixels;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetWindowSizeInPixels(SDL_Window * window, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowSizeInPixels(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (CHECKS) {
            check(w, 1);
            check(h, 1);
        }
        return nSDL_GetWindowSizeInPixels(window, memAddress(w), memAddress(h));
    }

    // --- [ SDL_SetWindowMinimumSize ] ---

    /** {@code bool SDL_SetWindowMinimumSize(SDL_Window * window, int min_w, int min_h)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowMinimumSize(@NativeType("SDL_Window *") long window, int min_w, int min_h) {
        long __functionAddress = Functions.SetWindowMinimumSize;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, min_w, min_h, __functionAddress);
    }

    // --- [ SDL_GetWindowMinimumSize ] ---

    /** {@code bool SDL_GetWindowMinimumSize(SDL_Window * window, int * w, int * h)} */
    public static boolean nSDL_GetWindowMinimumSize(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowMinimumSize;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetWindowMinimumSize(SDL_Window * window, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowMinimumSize(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (CHECKS) {
            check(w, 1);
            check(h, 1);
        }
        return nSDL_GetWindowMinimumSize(window, memAddress(w), memAddress(h));
    }

    // --- [ SDL_SetWindowMaximumSize ] ---

    /** {@code bool SDL_SetWindowMaximumSize(SDL_Window * window, int max_w, int max_h)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowMaximumSize(@NativeType("SDL_Window *") long window, int max_w, int max_h) {
        long __functionAddress = Functions.SetWindowMaximumSize;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, max_w, max_h, __functionAddress);
    }

    // --- [ SDL_GetWindowMaximumSize ] ---

    /** {@code bool SDL_GetWindowMaximumSize(SDL_Window * window, int * w, int * h)} */
    public static boolean nSDL_GetWindowMaximumSize(long window, long w, long h) {
        long __functionAddress = Functions.GetWindowMaximumSize;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, w, h, __functionAddress);
    }

    /** {@code bool SDL_GetWindowMaximumSize(SDL_Window * window, int * w, int * h)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowMaximumSize(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer w, @NativeType("int *") IntBuffer h) {
        if (CHECKS) {
            check(w, 1);
            check(h, 1);
        }
        return nSDL_GetWindowMaximumSize(window, memAddress(w), memAddress(h));
    }

    // --- [ SDL_SetWindowBordered ] ---

    /** {@code bool SDL_SetWindowBordered(SDL_Window * window, bool bordered)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowBordered(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean bordered) {
        long __functionAddress = Functions.SetWindowBordered;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, bordered, __functionAddress);
    }

    // --- [ SDL_SetWindowResizable ] ---

    /** {@code bool SDL_SetWindowResizable(SDL_Window * window, bool resizable)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowResizable(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean resizable) {
        long __functionAddress = Functions.SetWindowResizable;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, resizable, __functionAddress);
    }

    // --- [ SDL_SetWindowAlwaysOnTop ] ---

    /** {@code bool SDL_SetWindowAlwaysOnTop(SDL_Window * window, bool on_top)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowAlwaysOnTop(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean on_top) {
        long __functionAddress = Functions.SetWindowAlwaysOnTop;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, on_top, __functionAddress);
    }

    // --- [ SDL_ShowWindow ] ---

    /** {@code bool SDL_ShowWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ShowWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ShowWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_HideWindow ] ---

    /** {@code bool SDL_HideWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_HideWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.HideWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_RaiseWindow ] ---

    /** {@code bool SDL_RaiseWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_RaiseWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.RaiseWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_MaximizeWindow ] ---

    /** {@code bool SDL_MaximizeWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_MaximizeWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.MaximizeWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_MinimizeWindow ] ---

    /** {@code bool SDL_MinimizeWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_MinimizeWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.MinimizeWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_RestoreWindow ] ---

    /** {@code bool SDL_RestoreWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_RestoreWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.RestoreWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_SetWindowFullscreen ] ---

    /** {@code bool SDL_SetWindowFullscreen(SDL_Window * window, bool fullscreen)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowFullscreen(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean fullscreen) {
        long __functionAddress = Functions.SetWindowFullscreen;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, fullscreen, __functionAddress);
    }

    // --- [ SDL_SyncWindow ] ---

    /** {@code bool SDL_SyncWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_SyncWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.SyncWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_WindowHasSurface ] ---

    /** {@code bool SDL_WindowHasSurface(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_WindowHasSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.WindowHasSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_GetWindowSurface ] ---

    /** {@code SDL_Surface * SDL_GetWindowSurface(SDL_Window * window)} */
    public static long nSDL_GetWindowSurface(long window) {
        long __functionAddress = Functions.GetWindowSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** {@code SDL_Surface * SDL_GetWindowSurface(SDL_Window * window)} */
    @NativeType("SDL_Surface *")
    public static @Nullable SDL_Surface SDL_GetWindowSurface(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowSurface(window);
        return SDL_Surface.createSafe(__result);
    }

    // --- [ SDL_SetWindowSurfaceVSync ] ---

    /** {@code bool SDL_SetWindowSurfaceVSync(SDL_Window * window, int vsync)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowSurfaceVSync(@NativeType("SDL_Window *") long window, int vsync) {
        long __functionAddress = Functions.SetWindowSurfaceVSync;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, vsync, __functionAddress);
    }

    // --- [ SDL_GetWindowSurfaceVSync ] ---

    /** {@code bool SDL_GetWindowSurfaceVSync(SDL_Window * window, int * vsync)} */
    public static boolean nSDL_GetWindowSurfaceVSync(long window, long vsync) {
        long __functionAddress = Functions.GetWindowSurfaceVSync;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, vsync, __functionAddress);
    }

    /** {@code bool SDL_GetWindowSurfaceVSync(SDL_Window * window, int * vsync)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowSurfaceVSync(@NativeType("SDL_Window *") long window, @NativeType("int *") IntBuffer vsync) {
        if (CHECKS) {
            check(vsync, 1);
        }
        return nSDL_GetWindowSurfaceVSync(window, memAddress(vsync));
    }

    // --- [ SDL_UpdateWindowSurface ] ---

    /** {@code bool SDL_UpdateWindowSurface(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_UpdateWindowSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.UpdateWindowSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_UpdateWindowSurfaceRects ] ---

    /** {@code bool SDL_UpdateWindowSurfaceRects(SDL_Window * window, SDL_Rect const * rects, int numrects)} */
    public static boolean nSDL_UpdateWindowSurfaceRects(long window, long rects, int numrects) {
        long __functionAddress = Functions.UpdateWindowSurfaceRects;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, rects, numrects, __functionAddress);
    }

    /** {@code bool SDL_UpdateWindowSurfaceRects(SDL_Window * window, SDL_Rect const * rects, int numrects)} */
    @NativeType("bool")
    public static boolean SDL_UpdateWindowSurfaceRects(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect const *") SDL_Rect.Buffer rects) {
        return nSDL_UpdateWindowSurfaceRects(window, rects.address(), rects.remaining());
    }

    // --- [ SDL_DestroyWindowSurface ] ---

    /** {@code bool SDL_DestroyWindowSurface(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_DestroyWindowSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.DestroyWindowSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_SetWindowKeyboardGrab ] ---

    /** {@code bool SDL_SetWindowKeyboardGrab(SDL_Window * window, bool grabbed)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowKeyboardGrab(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean grabbed) {
        long __functionAddress = Functions.SetWindowKeyboardGrab;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, grabbed, __functionAddress);
    }

    // --- [ SDL_SetWindowMouseGrab ] ---

    /** {@code bool SDL_SetWindowMouseGrab(SDL_Window * window, bool grabbed)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowMouseGrab(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean grabbed) {
        long __functionAddress = Functions.SetWindowMouseGrab;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, grabbed, __functionAddress);
    }

    // --- [ SDL_GetWindowKeyboardGrab ] ---

    /** {@code bool SDL_GetWindowKeyboardGrab(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowKeyboardGrab(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowKeyboardGrab;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_GetWindowMouseGrab ] ---

    /** {@code bool SDL_GetWindowMouseGrab(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowMouseGrab(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowMouseGrab;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_GetGrabbedWindow ] ---

    /** {@code SDL_Window * SDL_GetGrabbedWindow(void)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetGrabbedWindow() {
        long __functionAddress = Functions.GetGrabbedWindow;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_SetWindowMouseRect ] ---

    /** {@code bool SDL_SetWindowMouseRect(SDL_Window * window, SDL_Rect const * rect)} */
    public static boolean nSDL_SetWindowMouseRect(long window, long rect) {
        long __functionAddress = Functions.SetWindowMouseRect;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, rect, __functionAddress);
    }

    /** {@code bool SDL_SetWindowMouseRect(SDL_Window * window, SDL_Rect const * rect)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowMouseRect(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect const *") SDL_Rect.Buffer rect) {
        if (CHECKS) {
            check(rect, 1);
        }
        return nSDL_SetWindowMouseRect(window, rect.address());
    }

    // --- [ SDL_GetWindowMouseRect ] ---

    /** {@code SDL_Rect const * SDL_GetWindowMouseRect(SDL_Window * window)} */
    public static long nSDL_GetWindowMouseRect(long window) {
        long __functionAddress = Functions.GetWindowMouseRect;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** {@code SDL_Rect const * SDL_GetWindowMouseRect(SDL_Window * window)} */
    @NativeType("SDL_Rect const *")
    public static @Nullable SDL_Rect SDL_GetWindowMouseRect(@NativeType("SDL_Window *") long window) {
        long __result = nSDL_GetWindowMouseRect(window);
        return SDL_Rect.createSafe(__result);
    }

    // --- [ SDL_SetWindowOpacity ] ---

    /** {@code bool SDL_SetWindowOpacity(SDL_Window * window, float opacity)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowOpacity(@NativeType("SDL_Window *") long window, float opacity) {
        long __functionAddress = Functions.SetWindowOpacity;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, opacity, __functionAddress);
    }

    // --- [ SDL_GetWindowOpacity ] ---

    /** {@code float SDL_GetWindowOpacity(SDL_Window * window)} */
    public static float SDL_GetWindowOpacity(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowOpacity;
        if (CHECKS) {
            check(window);
        }
        return invokePF(window, __functionAddress);
    }

    // --- [ SDL_SetWindowParent ] ---

    /** {@code bool SDL_SetWindowParent(SDL_Window * window, SDL_Window * parent)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowParent(@NativeType("SDL_Window *") long window, @NativeType("SDL_Window *") long parent) {
        long __functionAddress = Functions.SetWindowParent;
        if (CHECKS) {
            check(window);
            check(parent);
        }
        return invokePPZ(window, parent, __functionAddress);
    }

    // --- [ SDL_SetWindowModal ] ---

    /** {@code bool SDL_SetWindowModal(SDL_Window * window, bool modal)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowModal(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean modal) {
        long __functionAddress = Functions.SetWindowModal;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, modal, __functionAddress);
    }

    // --- [ SDL_SetWindowFocusable ] ---

    /** {@code bool SDL_SetWindowFocusable(SDL_Window * window, bool focusable)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowFocusable(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean focusable) {
        long __functionAddress = Functions.SetWindowFocusable;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, focusable, __functionAddress);
    }

    // --- [ SDL_ShowWindowSystemMenu ] ---

    /** {@code bool SDL_ShowWindowSystemMenu(SDL_Window * window, int x, int y)} */
    @NativeType("bool")
    public static boolean SDL_ShowWindowSystemMenu(@NativeType("SDL_Window *") long window, int x, int y) {
        long __functionAddress = Functions.ShowWindowSystemMenu;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, x, y, __functionAddress);
    }

    // --- [ SDL_SetWindowHitTest ] ---

    /** {@code bool SDL_SetWindowHitTest(SDL_Window * window, SDL_HitTest callback, void * callback_data)} */
    public static boolean nSDL_SetWindowHitTest(long window, long callback, long callback_data) {
        long __functionAddress = Functions.SetWindowHitTest;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, callback, callback_data, __functionAddress);
    }

    /** {@code bool SDL_SetWindowHitTest(SDL_Window * window, SDL_HitTest callback, void * callback_data)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowHitTest(@NativeType("SDL_Window *") long window, @NativeType("SDL_HitTest") SDL_HitTestI callback, @NativeType("void *") long callback_data) {
        return nSDL_SetWindowHitTest(window, callback.address(), callback_data);
    }

    // --- [ SDL_SetWindowShape ] ---

    /** {@code bool SDL_SetWindowShape(SDL_Window * window, SDL_Surface * shape)} */
    public static boolean nSDL_SetWindowShape(long window, long shape) {
        long __functionAddress = Functions.SetWindowShape;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, shape, __functionAddress);
    }

    /** {@code bool SDL_SetWindowShape(SDL_Window * window, SDL_Surface * shape)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowShape(@NativeType("SDL_Window *") long window, @NativeType("SDL_Surface *") SDL_Surface.Buffer shape) {
        if (CHECKS) {
            check(shape, 1);
        }
        return nSDL_SetWindowShape(window, shape.address());
    }

    // --- [ SDL_FlashWindow ] ---

    /** {@code bool SDL_FlashWindow(SDL_Window * window, SDL_FlashOperation operation)} */
    @NativeType("bool")
    public static boolean SDL_FlashWindow(@NativeType("SDL_Window *") long window, @NativeType("SDL_FlashOperation") int operation) {
        long __functionAddress = Functions.FlashWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, operation, __functionAddress);
    }

    // --- [ SDL_DestroyWindow ] ---

    /** {@code void SDL_DestroyWindow(SDL_Window * window)} */
    public static void SDL_DestroyWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.DestroyWindow;
        if (CHECKS) {
            check(window);
        }
        invokePV(window, __functionAddress);
    }

    // --- [ SDL_ScreenSaverEnabled ] ---

    /** {@code bool SDL_ScreenSaverEnabled(void)} */
    @NativeType("bool")
    public static boolean SDL_ScreenSaverEnabled() {
        long __functionAddress = Functions.ScreenSaverEnabled;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_EnableScreenSaver ] ---

    /** {@code bool SDL_EnableScreenSaver(void)} */
    @NativeType("bool")
    public static boolean SDL_EnableScreenSaver() {
        long __functionAddress = Functions.EnableScreenSaver;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_DisableScreenSaver ] ---

    /** {@code bool SDL_DisableScreenSaver(void)} */
    @NativeType("bool")
    public static boolean SDL_DisableScreenSaver() {
        long __functionAddress = Functions.DisableScreenSaver;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GL_LoadLibrary ] ---

    /** {@code bool SDL_GL_LoadLibrary(char const * path)} */
    public static boolean nSDL_GL_LoadLibrary(long path) {
        long __functionAddress = Functions.GL_LoadLibrary;
        return invokePZ(path, __functionAddress);
    }

    /** {@code bool SDL_GL_LoadLibrary(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_GL_LoadLibrary(@NativeType("char const *") @Nullable ByteBuffer path) {
        if (CHECKS) {
            checkNT1Safe(path);
        }
        return nSDL_GL_LoadLibrary(memAddressSafe(path));
    }

    /** {@code bool SDL_GL_LoadLibrary(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_GL_LoadLibrary(@NativeType("char const *") @Nullable CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(path, true);
            long pathEncoded = path == null ? NULL : stack.getPointerAddress();
            return nSDL_GL_LoadLibrary(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GL_GetProcAddress ] ---

    /** {@code SDL_FunctionPointer SDL_GL_GetProcAddress(char const * proc)} */
    public static long nSDL_GL_GetProcAddress(long proc) {
        long __functionAddress = Functions.GL_GetProcAddress;
        return invokePP(proc, __functionAddress);
    }

    /** {@code SDL_FunctionPointer SDL_GL_GetProcAddress(char const * proc)} */
    @NativeType("SDL_FunctionPointer")
    public static long SDL_GL_GetProcAddress(@NativeType("char const *") ByteBuffer proc) {
        if (CHECKS) {
            checkNT1(proc);
        }
        return nSDL_GL_GetProcAddress(memAddress(proc));
    }

    /** {@code SDL_FunctionPointer SDL_GL_GetProcAddress(char const * proc)} */
    @NativeType("SDL_FunctionPointer")
    public static long SDL_GL_GetProcAddress(@NativeType("char const *") CharSequence proc) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(proc, true);
            long procEncoded = stack.getPointerAddress();
            return nSDL_GL_GetProcAddress(procEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_EGL_GetProcAddress ] ---

    /** {@code SDL_FunctionPointer SDL_EGL_GetProcAddress(char const * proc)} */
    public static long nSDL_EGL_GetProcAddress(long proc) {
        long __functionAddress = Functions.EGL_GetProcAddress;
        return invokePP(proc, __functionAddress);
    }

    /** {@code SDL_FunctionPointer SDL_EGL_GetProcAddress(char const * proc)} */
    @NativeType("SDL_FunctionPointer")
    public static long SDL_EGL_GetProcAddress(@NativeType("char const *") ByteBuffer proc) {
        if (CHECKS) {
            checkNT1(proc);
        }
        return nSDL_EGL_GetProcAddress(memAddress(proc));
    }

    /** {@code SDL_FunctionPointer SDL_EGL_GetProcAddress(char const * proc)} */
    @NativeType("SDL_FunctionPointer")
    public static long SDL_EGL_GetProcAddress(@NativeType("char const *") CharSequence proc) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(proc, true);
            long procEncoded = stack.getPointerAddress();
            return nSDL_EGL_GetProcAddress(procEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GL_UnloadLibrary ] ---

    /** {@code void SDL_GL_UnloadLibrary(void)} */
    public static void SDL_GL_UnloadLibrary() {
        long __functionAddress = Functions.GL_UnloadLibrary;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GL_ExtensionSupported ] ---

    /** {@code bool SDL_GL_ExtensionSupported(char const * extension)} */
    public static boolean nSDL_GL_ExtensionSupported(long extension) {
        long __functionAddress = Functions.GL_ExtensionSupported;
        return invokePZ(extension, __functionAddress);
    }

    /** {@code bool SDL_GL_ExtensionSupported(char const * extension)} */
    @NativeType("bool")
    public static boolean SDL_GL_ExtensionSupported(@NativeType("char const *") ByteBuffer extension) {
        if (CHECKS) {
            checkNT1(extension);
        }
        return nSDL_GL_ExtensionSupported(memAddress(extension));
    }

    /** {@code bool SDL_GL_ExtensionSupported(char const * extension)} */
    @NativeType("bool")
    public static boolean SDL_GL_ExtensionSupported(@NativeType("char const *") CharSequence extension) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(extension, true);
            long extensionEncoded = stack.getPointerAddress();
            return nSDL_GL_ExtensionSupported(extensionEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GL_ResetAttributes ] ---

    /** {@code void SDL_GL_ResetAttributes(void)} */
    public static void SDL_GL_ResetAttributes() {
        long __functionAddress = Functions.GL_ResetAttributes;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GL_SetAttribute ] ---

    /** {@code bool SDL_GL_SetAttribute(SDL_GLAttr attr, int value)} */
    @NativeType("bool")
    public static boolean SDL_GL_SetAttribute(@NativeType("SDL_GLAttr") int attr, int value) {
        long __functionAddress = Functions.GL_SetAttribute;
        return invokeZ(attr, value, __functionAddress);
    }

    // --- [ SDL_GL_GetAttribute ] ---

    /** {@code bool SDL_GL_GetAttribute(SDL_GLAttr attr, int * value)} */
    public static boolean nSDL_GL_GetAttribute(int attr, long value) {
        long __functionAddress = Functions.GL_GetAttribute;
        return invokePZ(attr, value, __functionAddress);
    }

    /** {@code bool SDL_GL_GetAttribute(SDL_GLAttr attr, int * value)} */
    @NativeType("bool")
    public static boolean SDL_GL_GetAttribute(@NativeType("SDL_GLAttr") int attr, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_GL_GetAttribute(attr, memAddress(value));
    }

    // --- [ SDL_GL_CreateContext ] ---

    /** {@code SDL_GLContext SDL_GL_CreateContext(SDL_Window * window)} */
    @NativeType("SDL_GLContext")
    public static long SDL_GL_CreateContext(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GL_CreateContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ SDL_GL_MakeCurrent ] ---

    /** {@code bool SDL_GL_MakeCurrent(SDL_Window * window, SDL_GLContext context)} */
    @NativeType("bool")
    public static boolean SDL_GL_MakeCurrent(@NativeType("SDL_Window *") long window, @NativeType("SDL_GLContext") long context) {
        long __functionAddress = Functions.GL_MakeCurrent;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, context, __functionAddress);
    }

    // --- [ SDL_GL_GetCurrentWindow ] ---

    /** {@code SDL_Window * SDL_GL_GetCurrentWindow(void)} */
    @NativeType("SDL_Window *")
    public static long SDL_GL_GetCurrentWindow() {
        long __functionAddress = Functions.GL_GetCurrentWindow;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_GL_GetCurrentContext ] ---

    /** {@code SDL_GLContext SDL_GL_GetCurrentContext(void)} */
    @NativeType("SDL_GLContext")
    public static long SDL_GL_GetCurrentContext() {
        long __functionAddress = Functions.GL_GetCurrentContext;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_EGL_GetCurrentDisplay ] ---

    /** {@code SDL_EGLDisplay SDL_EGL_GetCurrentDisplay(void)} */
    @NativeType("SDL_EGLDisplay")
    public static long SDL_EGL_GetCurrentDisplay() {
        long __functionAddress = Functions.EGL_GetCurrentDisplay;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_EGL_GetCurrentConfig ] ---

    /** {@code SDL_EGLConfig SDL_EGL_GetCurrentConfig(void)} */
    @NativeType("SDL_EGLConfig")
    public static long SDL_EGL_GetCurrentConfig() {
        long __functionAddress = Functions.EGL_GetCurrentConfig;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_EGL_GetWindowSurface ] ---

    /** {@code SDL_EGLSurface SDL_EGL_GetWindowSurface(SDL_Window * window)} */
    @NativeType("SDL_EGLSurface")
    public static long SDL_EGL_GetWindowSurface(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.EGL_GetWindowSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ SDL_EGL_SetAttributeCallbacks ] ---

    /** {@code void SDL_EGL_SetAttributeCallbacks(SDL_EGLAttribArrayCallback platformAttribCallback, SDL_EGLIntArrayCallback surfaceAttribCallback, SDL_EGLIntArrayCallback contextAttribCallback, void * userdata)} */
    public static void nSDL_EGL_SetAttributeCallbacks(long platformAttribCallback, long surfaceAttribCallback, long contextAttribCallback, long userdata) {
        long __functionAddress = Functions.EGL_SetAttributeCallbacks;
        invokePPPPV(platformAttribCallback, surfaceAttribCallback, contextAttribCallback, userdata, __functionAddress);
    }

    /** {@code void SDL_EGL_SetAttributeCallbacks(SDL_EGLAttribArrayCallback platformAttribCallback, SDL_EGLIntArrayCallback surfaceAttribCallback, SDL_EGLIntArrayCallback contextAttribCallback, void * userdata)} */
    public static void SDL_EGL_SetAttributeCallbacks(@NativeType("SDL_EGLAttribArrayCallback") SDL_EGLAttribArrayCallbackI platformAttribCallback, @NativeType("SDL_EGLIntArrayCallback") SDL_EGLIntArrayCallbackI surfaceAttribCallback, @NativeType("SDL_EGLIntArrayCallback") SDL_EGLIntArrayCallbackI contextAttribCallback, @NativeType("void *") long userdata) {
        nSDL_EGL_SetAttributeCallbacks(platformAttribCallback.address(), surfaceAttribCallback.address(), contextAttribCallback.address(), userdata);
    }

    // --- [ SDL_GL_SetSwapInterval ] ---

    /** {@code bool SDL_GL_SetSwapInterval(int interval)} */
    @NativeType("bool")
    public static boolean SDL_GL_SetSwapInterval(int interval) {
        long __functionAddress = Functions.GL_SetSwapInterval;
        return invokeZ(interval, __functionAddress);
    }

    // --- [ SDL_GL_GetSwapInterval ] ---

    /** {@code bool SDL_GL_GetSwapInterval(int * interval)} */
    public static boolean nSDL_GL_GetSwapInterval(long interval) {
        long __functionAddress = Functions.GL_GetSwapInterval;
        return invokePZ(interval, __functionAddress);
    }

    /** {@code bool SDL_GL_GetSwapInterval(int * interval)} */
    @NativeType("bool")
    public static boolean SDL_GL_GetSwapInterval(@NativeType("int *") IntBuffer interval) {
        if (CHECKS) {
            check(interval, 1);
        }
        return nSDL_GL_GetSwapInterval(memAddress(interval));
    }

    // --- [ SDL_GL_SwapWindow ] ---

    /** {@code bool SDL_GL_SwapWindow(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_GL_SwapWindow(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GL_SwapWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_GL_DestroyContext ] ---

    /** {@code bool SDL_GL_DestroyContext(SDL_GLContext context)} */
    @NativeType("bool")
    public static boolean SDL_GL_DestroyContext(@NativeType("SDL_GLContext") long context) {
        long __functionAddress = Functions.GL_DestroyContext;
        if (CHECKS) {
            check(context);
        }
        return invokePZ(context, __functionAddress);
    }

    // --- [ SDL_WINDOWPOS_UNDEFINED_DISPLAY ] ---

    /** {@code uint32_t SDL_WINDOWPOS_UNDEFINED_DISPLAY(SDL_DisplayID X)} */
    @NativeType("uint32_t")
    public static int SDL_WINDOWPOS_UNDEFINED_DISPLAY(@NativeType("SDL_DisplayID") int X) {
        return (SDL_WINDOWPOS_UNDEFINED_MASK|(X));
    }

    // --- [ SDL_WINDOWPOS_ISUNDEFINED ] ---

    /** {@code bool SDL_WINDOWPOS_ISUNDEFINED(uint32_t X)} */
    @NativeType("bool")
    public static boolean SDL_WINDOWPOS_ISUNDEFINED(@NativeType("uint32_t") int X) {
        return (((X)&0xFFFF0000) == SDL_WINDOWPOS_UNDEFINED_MASK);
    }

    // --- [ SDL_WINDOWPOS_CENTERED_DISPLAY ] ---

    /** {@code uint32_t SDL_WINDOWPOS_CENTERED_DISPLAY(SDL_DisplayID X)} */
    @NativeType("uint32_t")
    public static int SDL_WINDOWPOS_CENTERED_DISPLAY(@NativeType("SDL_DisplayID") int X) {
        return (SDL_WINDOWPOS_CENTERED_MASK|(X));
    }

    // --- [ SDL_WINDOWPOS_ISCENTERED ] ---

    /** {@code bool SDL_WINDOWPOS_ISCENTERED(uint32_t X)} */
    @NativeType("bool")
    public static boolean SDL_WINDOWPOS_ISCENTERED(@NativeType("uint32_t") int X) {
        return (((X)&0xFFFF0000) == SDL_WINDOWPOS_CENTERED_MASK);
    }

    /** {@code SDL_FORCE_INLINE void SDL_RectToFRect(const SDL_Rect *rect, SDL_FRect *frect)} */
    public static void SDL_RectToFRect(SDL_Rect rectInput, SDL_FRect frectOutput) {
        frectOutput.set(
            (float) rectInput.x(),
            (float) rectInput.y(),
            (float) rectInput.w(),
            (float) rectInput.h()
        );
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_PointInRect(const SDL_Point *p, const SDL_Rect *r)} */
    public static boolean SDL_PointInRect(@Nullable SDL_Point p, @Nullable SDL_Rect r) {
        return ((p != null) && (r != null) && (p.x() >= r.x()) && (p.x() < (r.x() + r.w())) &&
             (p.y() >= r.y()) && (p.y() < (r.y() + r.h())) );
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_RectEmpty(const SDL_Rect *r)} */
    public static boolean SDL_RectEmpty(@Nullable SDL_Rect r) {
        return ((r == null) || (r.w() <= 0) || (r.h() <= 0));
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_RectsEqual(const SDL_Rect *a, const SDL_Rect *b)} */
    public static boolean SDL_RectsEqual(@Nullable SDL_Rect a, @Nullable SDL_Rect b) {
        return ((a != null) && (b != null) && (a.x() == b.x()) && (a.y() == b.y()) &&
            (a.w() == b.w()) && (a.h() == b.h()));
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_PointInRectFloat(const SDL_FPoint *p, const SDL_FRect *r)} */
    public static boolean SDL_PointInRectFloat(@Nullable SDL_FPoint p, @Nullable SDL_FRect r) {
        return ((p != null) && (r != null) && (p.x() >= r.x()) && (p.x() <= (r.x() + r.w())) &&
             (p.y() >= r.y()) && (p.y() <= (r.y() + r.h())) );
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_RectEmptyFloat(const SDL_FRect *r)} */
    public static boolean SDL_RectEmptyFloat(@Nullable SDL_Rect r) {
        return ((r == null) || (r.w() <= 0.0f) || (r.h() <= 0.0f));
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_RectsEqualEpsilon(const SDL_FRect *a, const SDL_FRect *b, const float epsilon)} */
    public static boolean SDL_RectsEqualEpsilon(@Nullable SDL_FRect a, @Nullable SDL_FRect b, float epsilon) {
        return ((a != null) && (b != null) && ((a == b) ||
            ((Math.abs(a.x() - b.x()) <= epsilon) &&
            (Math.abs(a.y() - b.y()) <= epsilon) &&
            (Math.abs(a.w() - b.w()) <= epsilon) &&
            (Math.abs(a.h() - b.h()) <= epsilon))));
    }
    
    /** {@code SDL_FORCE_INLINE bool SDL_RectsEqualFloat(const SDL_FRect *a, const SDL_FRect *b)} */
    public static boolean SDL_RectsEqualFloat(@Nullable SDL_FRect a, @Nullable SDL_FRect b) {
        return SDL_RectsEqualEpsilon(a, b, SDL_FLT_EPSILON);
    }

}