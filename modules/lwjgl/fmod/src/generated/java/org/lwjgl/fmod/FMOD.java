/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class FMOD {

    private static final SharedLibrary FMOD = Library.loadNative(FMOD.class, "org.lwjgl.fmod", Configuration.FMOD_LIBRARY_NAME, "fmod");

    /** Contains the function pointers loaded from the FMOD {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Memory_Initialize                 = apiGetFunctionAddress(FMOD, "FMOD_Memory_Initialize"),
            Memory_GetStats                   = apiGetFunctionAddress(FMOD, "FMOD_Memory_GetStats"),
            Debug_Initialize                  = apiGetFunctionAddress(FMOD, "FMOD_Debug_Initialize"),
            File_SetDiskBusy                  = apiGetFunctionAddress(FMOD, "FMOD_File_SetDiskBusy"),
            File_GetDiskBusy                  = apiGetFunctionAddress(FMOD, "FMOD_File_GetDiskBusy"),
            Thread_SetAttributes              = apiGetFunctionAddress(FMOD, "FMOD_Thread_SetAttributes"),
            System_Create                     = apiGetFunctionAddress(FMOD, "FMOD_System_Create"),
            System_Release                    = apiGetFunctionAddress(FMOD, "FMOD_System_Release"),
            System_SetOutput                  = apiGetFunctionAddress(FMOD, "FMOD_System_SetOutput"),
            System_GetOutput                  = apiGetFunctionAddress(FMOD, "FMOD_System_GetOutput"),
            System_GetNumDrivers              = apiGetFunctionAddress(FMOD, "FMOD_System_GetNumDrivers"),
            System_GetDriverInfo              = apiGetFunctionAddress(FMOD, "FMOD_System_GetDriverInfo"),
            System_SetDriver                  = apiGetFunctionAddress(FMOD, "FMOD_System_SetDriver"),
            System_GetDriver                  = apiGetFunctionAddress(FMOD, "FMOD_System_GetDriver"),
            System_SetSoftwareChannels        = apiGetFunctionAddress(FMOD, "FMOD_System_SetSoftwareChannels"),
            System_GetSoftwareChannels        = apiGetFunctionAddress(FMOD, "FMOD_System_GetSoftwareChannels"),
            System_SetSoftwareFormat          = apiGetFunctionAddress(FMOD, "FMOD_System_SetSoftwareFormat"),
            System_GetSoftwareFormat          = apiGetFunctionAddress(FMOD, "FMOD_System_GetSoftwareFormat"),
            System_SetDSPBufferSize           = apiGetFunctionAddress(FMOD, "FMOD_System_SetDSPBufferSize"),
            System_GetDSPBufferSize           = apiGetFunctionAddress(FMOD, "FMOD_System_GetDSPBufferSize"),
            System_SetFileSystem              = apiGetFunctionAddress(FMOD, "FMOD_System_SetFileSystem"),
            System_AttachFileSystem           = apiGetFunctionAddress(FMOD, "FMOD_System_AttachFileSystem"),
            System_SetAdvancedSettings        = apiGetFunctionAddress(FMOD, "FMOD_System_SetAdvancedSettings"),
            System_GetAdvancedSettings        = apiGetFunctionAddress(FMOD, "FMOD_System_GetAdvancedSettings"),
            System_SetCallback                = apiGetFunctionAddress(FMOD, "FMOD_System_SetCallback"),
            System_SetPluginPath              = apiGetFunctionAddress(FMOD, "FMOD_System_SetPluginPath"),
            System_LoadPlugin                 = apiGetFunctionAddress(FMOD, "FMOD_System_LoadPlugin"),
            System_UnloadPlugin               = apiGetFunctionAddress(FMOD, "FMOD_System_UnloadPlugin"),
            System_GetNumNestedPlugins        = apiGetFunctionAddress(FMOD, "FMOD_System_GetNumNestedPlugins"),
            System_GetNestedPlugin            = apiGetFunctionAddress(FMOD, "FMOD_System_GetNestedPlugin"),
            System_GetNumPlugins              = apiGetFunctionAddress(FMOD, "FMOD_System_GetNumPlugins"),
            System_GetPluginHandle            = apiGetFunctionAddress(FMOD, "FMOD_System_GetPluginHandle"),
            System_GetPluginInfo              = apiGetFunctionAddress(FMOD, "FMOD_System_GetPluginInfo"),
            System_SetOutputByPlugin          = apiGetFunctionAddress(FMOD, "FMOD_System_SetOutputByPlugin"),
            System_GetOutputByPlugin          = apiGetFunctionAddress(FMOD, "FMOD_System_GetOutputByPlugin"),
            System_CreateDSPByPlugin          = apiGetFunctionAddress(FMOD, "FMOD_System_CreateDSPByPlugin"),
            System_GetDSPInfoByPlugin         = apiGetFunctionAddress(FMOD, "FMOD_System_GetDSPInfoByPlugin"),
            System_RegisterCodec              = apiGetFunctionAddress(FMOD, "FMOD_System_RegisterCodec"),
            System_RegisterDSP                = apiGetFunctionAddress(FMOD, "FMOD_System_RegisterDSP"),
            System_RegisterOutput             = apiGetFunctionAddress(FMOD, "FMOD_System_RegisterOutput"),
            System_Init                       = apiGetFunctionAddress(FMOD, "FMOD_System_Init"),
            System_Close                      = apiGetFunctionAddress(FMOD, "FMOD_System_Close"),
            System_Update                     = apiGetFunctionAddress(FMOD, "FMOD_System_Update"),
            System_SetSpeakerPosition         = apiGetFunctionAddress(FMOD, "FMOD_System_SetSpeakerPosition"),
            System_GetSpeakerPosition         = apiGetFunctionAddress(FMOD, "FMOD_System_GetSpeakerPosition"),
            System_SetStreamBufferSize        = apiGetFunctionAddress(FMOD, "FMOD_System_SetStreamBufferSize"),
            System_GetStreamBufferSize        = apiGetFunctionAddress(FMOD, "FMOD_System_GetStreamBufferSize"),
            System_Set3DSettings              = apiGetFunctionAddress(FMOD, "FMOD_System_Set3DSettings"),
            System_Get3DSettings              = apiGetFunctionAddress(FMOD, "FMOD_System_Get3DSettings"),
            System_Set3DNumListeners          = apiGetFunctionAddress(FMOD, "FMOD_System_Set3DNumListeners"),
            System_Get3DNumListeners          = apiGetFunctionAddress(FMOD, "FMOD_System_Get3DNumListeners"),
            System_Set3DListenerAttributes    = apiGetFunctionAddress(FMOD, "FMOD_System_Set3DListenerAttributes"),
            System_Get3DListenerAttributes    = apiGetFunctionAddress(FMOD, "FMOD_System_Get3DListenerAttributes"),
            System_Set3DRolloffCallback       = apiGetFunctionAddress(FMOD, "FMOD_System_Set3DRolloffCallback"),
            System_MixerSuspend               = apiGetFunctionAddress(FMOD, "FMOD_System_MixerSuspend"),
            System_MixerResume                = apiGetFunctionAddress(FMOD, "FMOD_System_MixerResume"),
            System_GetDefaultMixMatrix        = apiGetFunctionAddress(FMOD, "FMOD_System_GetDefaultMixMatrix"),
            System_GetSpeakerModeChannels     = apiGetFunctionAddress(FMOD, "FMOD_System_GetSpeakerModeChannels"),
            System_GetVersion                 = apiGetFunctionAddress(FMOD, "FMOD_System_GetVersion"),
            System_GetOutputHandle            = apiGetFunctionAddress(FMOD, "FMOD_System_GetOutputHandle"),
            System_GetChannelsPlaying         = apiGetFunctionAddress(FMOD, "FMOD_System_GetChannelsPlaying"),
            System_GetCPUUsage                = apiGetFunctionAddress(FMOD, "FMOD_System_GetCPUUsage"),
            System_GetFileUsage               = apiGetFunctionAddress(FMOD, "FMOD_System_GetFileUsage"),
            System_CreateSound                = apiGetFunctionAddress(FMOD, "FMOD_System_CreateSound"),
            System_CreateStream               = apiGetFunctionAddress(FMOD, "FMOD_System_CreateStream"),
            System_CreateDSP                  = apiGetFunctionAddress(FMOD, "FMOD_System_CreateDSP"),
            System_CreateDSPByType            = apiGetFunctionAddress(FMOD, "FMOD_System_CreateDSPByType"),
            System_CreateChannelGroup         = apiGetFunctionAddress(FMOD, "FMOD_System_CreateChannelGroup"),
            System_CreateSoundGroup           = apiGetFunctionAddress(FMOD, "FMOD_System_CreateSoundGroup"),
            System_CreateReverb3D             = apiGetFunctionAddress(FMOD, "FMOD_System_CreateReverb3D"),
            System_PlaySound                  = apiGetFunctionAddress(FMOD, "FMOD_System_PlaySound"),
            System_PlayDSP                    = apiGetFunctionAddress(FMOD, "FMOD_System_PlayDSP"),
            System_GetChannel                 = apiGetFunctionAddress(FMOD, "FMOD_System_GetChannel"),
            System_GetDSPInfoByType           = apiGetFunctionAddress(FMOD, "FMOD_System_GetDSPInfoByType"),
            System_GetMasterChannelGroup      = apiGetFunctionAddress(FMOD, "FMOD_System_GetMasterChannelGroup"),
            System_GetMasterSoundGroup        = apiGetFunctionAddress(FMOD, "FMOD_System_GetMasterSoundGroup"),
            System_AttachChannelGroupToPort   = apiGetFunctionAddress(FMOD, "FMOD_System_AttachChannelGroupToPort"),
            System_DetachChannelGroupFromPort = apiGetFunctionAddress(FMOD, "FMOD_System_DetachChannelGroupFromPort"),
            System_SetReverbProperties        = apiGetFunctionAddress(FMOD, "FMOD_System_SetReverbProperties"),
            System_GetReverbProperties        = apiGetFunctionAddress(FMOD, "FMOD_System_GetReverbProperties"),
            System_LockDSP                    = apiGetFunctionAddress(FMOD, "FMOD_System_LockDSP"),
            System_UnlockDSP                  = apiGetFunctionAddress(FMOD, "FMOD_System_UnlockDSP"),
            System_GetRecordNumDrivers        = apiGetFunctionAddress(FMOD, "FMOD_System_GetRecordNumDrivers"),
            System_GetRecordDriverInfo        = apiGetFunctionAddress(FMOD, "FMOD_System_GetRecordDriverInfo"),
            System_GetRecordPosition          = apiGetFunctionAddress(FMOD, "FMOD_System_GetRecordPosition"),
            System_RecordStart                = apiGetFunctionAddress(FMOD, "FMOD_System_RecordStart"),
            System_RecordStop                 = apiGetFunctionAddress(FMOD, "FMOD_System_RecordStop"),
            System_IsRecording                = apiGetFunctionAddress(FMOD, "FMOD_System_IsRecording"),
            System_CreateGeometry             = apiGetFunctionAddress(FMOD, "FMOD_System_CreateGeometry"),
            System_SetGeometrySettings        = apiGetFunctionAddress(FMOD, "FMOD_System_SetGeometrySettings"),
            System_GetGeometrySettings        = apiGetFunctionAddress(FMOD, "FMOD_System_GetGeometrySettings"),
            System_LoadGeometry               = apiGetFunctionAddress(FMOD, "FMOD_System_LoadGeometry"),
            System_GetGeometryOcclusion       = apiGetFunctionAddress(FMOD, "FMOD_System_GetGeometryOcclusion"),
            System_SetNetworkProxy            = apiGetFunctionAddress(FMOD, "FMOD_System_SetNetworkProxy"),
            System_GetNetworkProxy            = apiGetFunctionAddress(FMOD, "FMOD_System_GetNetworkProxy"),
            System_SetNetworkTimeout          = apiGetFunctionAddress(FMOD, "FMOD_System_SetNetworkTimeout"),
            System_GetNetworkTimeout          = apiGetFunctionAddress(FMOD, "FMOD_System_GetNetworkTimeout"),
            System_SetUserData                = apiGetFunctionAddress(FMOD, "FMOD_System_SetUserData"),
            System_GetUserData                = apiGetFunctionAddress(FMOD, "FMOD_System_GetUserData"),
            Sound_Release                     = apiGetFunctionAddress(FMOD, "FMOD_Sound_Release"),
            Sound_GetSystemObject             = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetSystemObject"),
            Sound_Lock                        = apiGetFunctionAddress(FMOD, "FMOD_Sound_Lock"),
            Sound_Unlock                      = apiGetFunctionAddress(FMOD, "FMOD_Sound_Unlock"),
            Sound_SetDefaults                 = apiGetFunctionAddress(FMOD, "FMOD_Sound_SetDefaults"),
            Sound_GetDefaults                 = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetDefaults"),
            Sound_Set3DMinMaxDistance         = apiGetFunctionAddress(FMOD, "FMOD_Sound_Set3DMinMaxDistance"),
            Sound_Get3DMinMaxDistance         = apiGetFunctionAddress(FMOD, "FMOD_Sound_Get3DMinMaxDistance"),
            Sound_Set3DConeSettings           = apiGetFunctionAddress(FMOD, "FMOD_Sound_Set3DConeSettings"),
            Sound_Get3DConeSettings           = apiGetFunctionAddress(FMOD, "FMOD_Sound_Get3DConeSettings"),
            Sound_Set3DCustomRolloff          = apiGetFunctionAddress(FMOD, "FMOD_Sound_Set3DCustomRolloff"),
            Sound_Get3DCustomRolloff          = apiGetFunctionAddress(FMOD, "FMOD_Sound_Get3DCustomRolloff"),
            Sound_GetSubSound                 = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetSubSound"),
            Sound_GetSubSoundParent           = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetSubSoundParent"),
            Sound_GetName                     = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetName"),
            Sound_GetLength                   = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetLength"),
            Sound_GetFormat                   = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetFormat"),
            Sound_GetNumSubSounds             = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetNumSubSounds"),
            Sound_GetNumTags                  = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetNumTags"),
            Sound_GetTag                      = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetTag"),
            Sound_GetOpenState                = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetOpenState"),
            Sound_ReadData                    = apiGetFunctionAddress(FMOD, "FMOD_Sound_ReadData"),
            Sound_SeekData                    = apiGetFunctionAddress(FMOD, "FMOD_Sound_SeekData"),
            Sound_SetSoundGroup               = apiGetFunctionAddress(FMOD, "FMOD_Sound_SetSoundGroup"),
            Sound_GetSoundGroup               = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetSoundGroup"),
            Sound_GetNumSyncPoints            = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetNumSyncPoints"),
            Sound_GetSyncPoint                = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetSyncPoint"),
            Sound_GetSyncPointInfo            = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetSyncPointInfo"),
            Sound_AddSyncPoint                = apiGetFunctionAddress(FMOD, "FMOD_Sound_AddSyncPoint"),
            Sound_DeleteSyncPoint             = apiGetFunctionAddress(FMOD, "FMOD_Sound_DeleteSyncPoint"),
            Sound_SetMode                     = apiGetFunctionAddress(FMOD, "FMOD_Sound_SetMode"),
            Sound_GetMode                     = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetMode"),
            Sound_SetLoopCount                = apiGetFunctionAddress(FMOD, "FMOD_Sound_SetLoopCount"),
            Sound_GetLoopCount                = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetLoopCount"),
            Sound_SetLoopPoints               = apiGetFunctionAddress(FMOD, "FMOD_Sound_SetLoopPoints"),
            Sound_GetLoopPoints               = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetLoopPoints"),
            Sound_GetMusicNumChannels         = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetMusicNumChannels"),
            Sound_SetMusicChannelVolume       = apiGetFunctionAddress(FMOD, "FMOD_Sound_SetMusicChannelVolume"),
            Sound_GetMusicChannelVolume       = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetMusicChannelVolume"),
            Sound_SetMusicSpeed               = apiGetFunctionAddress(FMOD, "FMOD_Sound_SetMusicSpeed"),
            Sound_GetMusicSpeed               = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetMusicSpeed"),
            Sound_SetUserData                 = apiGetFunctionAddress(FMOD, "FMOD_Sound_SetUserData"),
            Sound_GetUserData                 = apiGetFunctionAddress(FMOD, "FMOD_Sound_GetUserData"),
            Channel_GetSystemObject           = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetSystemObject"),
            Channel_Stop                      = apiGetFunctionAddress(FMOD, "FMOD_Channel_Stop"),
            Channel_SetPaused                 = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetPaused"),
            Channel_GetPaused                 = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetPaused"),
            Channel_SetVolume                 = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetVolume"),
            Channel_GetVolume                 = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetVolume"),
            Channel_SetVolumeRamp             = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetVolumeRamp"),
            Channel_GetVolumeRamp             = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetVolumeRamp"),
            Channel_GetAudibility             = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetAudibility"),
            Channel_SetPitch                  = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetPitch"),
            Channel_GetPitch                  = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetPitch"),
            Channel_SetMute                   = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetMute"),
            Channel_GetMute                   = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetMute"),
            Channel_SetReverbProperties       = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetReverbProperties"),
            Channel_GetReverbProperties       = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetReverbProperties"),
            Channel_SetLowPassGain            = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetLowPassGain"),
            Channel_GetLowPassGain            = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetLowPassGain"),
            Channel_SetMode                   = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetMode"),
            Channel_GetMode                   = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetMode"),
            Channel_SetCallback               = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetCallback"),
            Channel_IsPlaying                 = apiGetFunctionAddress(FMOD, "FMOD_Channel_IsPlaying"),
            Channel_SetPan                    = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetPan"),
            Channel_SetMixLevelsOutput        = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetMixLevelsOutput"),
            Channel_SetMixLevelsInput         = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetMixLevelsInput"),
            Channel_SetMixMatrix              = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetMixMatrix"),
            Channel_GetMixMatrix              = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetMixMatrix"),
            Channel_GetDSPClock               = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetDSPClock"),
            Channel_SetDelay                  = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetDelay"),
            Channel_GetDelay                  = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetDelay"),
            Channel_AddFadePoint              = apiGetFunctionAddress(FMOD, "FMOD_Channel_AddFadePoint"),
            Channel_SetFadePointRamp          = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetFadePointRamp"),
            Channel_RemoveFadePoints          = apiGetFunctionAddress(FMOD, "FMOD_Channel_RemoveFadePoints"),
            Channel_GetFadePoints             = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetFadePoints"),
            Channel_GetDSP                    = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetDSP"),
            Channel_AddDSP                    = apiGetFunctionAddress(FMOD, "FMOD_Channel_AddDSP"),
            Channel_RemoveDSP                 = apiGetFunctionAddress(FMOD, "FMOD_Channel_RemoveDSP"),
            Channel_GetNumDSPs                = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetNumDSPs"),
            Channel_SetDSPIndex               = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetDSPIndex"),
            Channel_GetDSPIndex               = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetDSPIndex"),
            Channel_Set3DAttributes           = apiGetFunctionAddress(FMOD, "FMOD_Channel_Set3DAttributes"),
            Channel_Get3DAttributes           = apiGetFunctionAddress(FMOD, "FMOD_Channel_Get3DAttributes"),
            Channel_Set3DMinMaxDistance       = apiGetFunctionAddress(FMOD, "FMOD_Channel_Set3DMinMaxDistance"),
            Channel_Get3DMinMaxDistance       = apiGetFunctionAddress(FMOD, "FMOD_Channel_Get3DMinMaxDistance"),
            Channel_Set3DConeSettings         = apiGetFunctionAddress(FMOD, "FMOD_Channel_Set3DConeSettings"),
            Channel_Get3DConeSettings         = apiGetFunctionAddress(FMOD, "FMOD_Channel_Get3DConeSettings"),
            Channel_Set3DConeOrientation      = apiGetFunctionAddress(FMOD, "FMOD_Channel_Set3DConeOrientation"),
            Channel_Get3DConeOrientation      = apiGetFunctionAddress(FMOD, "FMOD_Channel_Get3DConeOrientation"),
            Channel_Set3DCustomRolloff        = apiGetFunctionAddress(FMOD, "FMOD_Channel_Set3DCustomRolloff"),
            Channel_Get3DCustomRolloff        = apiGetFunctionAddress(FMOD, "FMOD_Channel_Get3DCustomRolloff"),
            Channel_Set3DOcclusion            = apiGetFunctionAddress(FMOD, "FMOD_Channel_Set3DOcclusion"),
            Channel_Get3DOcclusion            = apiGetFunctionAddress(FMOD, "FMOD_Channel_Get3DOcclusion"),
            Channel_Set3DSpread               = apiGetFunctionAddress(FMOD, "FMOD_Channel_Set3DSpread"),
            Channel_Get3DSpread               = apiGetFunctionAddress(FMOD, "FMOD_Channel_Get3DSpread"),
            Channel_Set3DLevel                = apiGetFunctionAddress(FMOD, "FMOD_Channel_Set3DLevel"),
            Channel_Get3DLevel                = apiGetFunctionAddress(FMOD, "FMOD_Channel_Get3DLevel"),
            Channel_Set3DDopplerLevel         = apiGetFunctionAddress(FMOD, "FMOD_Channel_Set3DDopplerLevel"),
            Channel_Get3DDopplerLevel         = apiGetFunctionAddress(FMOD, "FMOD_Channel_Get3DDopplerLevel"),
            Channel_Set3DDistanceFilter       = apiGetFunctionAddress(FMOD, "FMOD_Channel_Set3DDistanceFilter"),
            Channel_Get3DDistanceFilter       = apiGetFunctionAddress(FMOD, "FMOD_Channel_Get3DDistanceFilter"),
            Channel_SetUserData               = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetUserData"),
            Channel_GetUserData               = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetUserData"),
            Channel_SetFrequency              = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetFrequency"),
            Channel_GetFrequency              = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetFrequency"),
            Channel_SetPriority               = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetPriority"),
            Channel_GetPriority               = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetPriority"),
            Channel_SetPosition               = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetPosition"),
            Channel_GetPosition               = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetPosition"),
            Channel_SetChannelGroup           = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetChannelGroup"),
            Channel_GetChannelGroup           = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetChannelGroup"),
            Channel_SetLoopCount              = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetLoopCount"),
            Channel_GetLoopCount              = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetLoopCount"),
            Channel_SetLoopPoints             = apiGetFunctionAddress(FMOD, "FMOD_Channel_SetLoopPoints"),
            Channel_GetLoopPoints             = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetLoopPoints"),
            Channel_IsVirtual                 = apiGetFunctionAddress(FMOD, "FMOD_Channel_IsVirtual"),
            Channel_GetCurrentSound           = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetCurrentSound"),
            Channel_GetIndex                  = apiGetFunctionAddress(FMOD, "FMOD_Channel_GetIndex"),
            ChannelGroup_GetSystemObject      = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetSystemObject"),
            ChannelGroup_Stop                 = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Stop"),
            ChannelGroup_SetPaused            = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetPaused"),
            ChannelGroup_GetPaused            = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetPaused"),
            ChannelGroup_SetVolume            = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetVolume"),
            ChannelGroup_GetVolume            = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetVolume"),
            ChannelGroup_SetVolumeRamp        = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetVolumeRamp"),
            ChannelGroup_GetVolumeRamp        = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetVolumeRamp"),
            ChannelGroup_GetAudibility        = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetAudibility"),
            ChannelGroup_SetPitch             = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetPitch"),
            ChannelGroup_GetPitch             = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetPitch"),
            ChannelGroup_SetMute              = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetMute"),
            ChannelGroup_GetMute              = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetMute"),
            ChannelGroup_SetReverbProperties  = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetReverbProperties"),
            ChannelGroup_GetReverbProperties  = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetReverbProperties"),
            ChannelGroup_SetLowPassGain       = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetLowPassGain"),
            ChannelGroup_GetLowPassGain       = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetLowPassGain"),
            ChannelGroup_SetMode              = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetMode"),
            ChannelGroup_GetMode              = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetMode"),
            ChannelGroup_SetCallback          = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetCallback"),
            ChannelGroup_IsPlaying            = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_IsPlaying"),
            ChannelGroup_SetPan               = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetPan"),
            ChannelGroup_SetMixLevelsOutput   = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetMixLevelsOutput"),
            ChannelGroup_SetMixLevelsInput    = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetMixLevelsInput"),
            ChannelGroup_SetMixMatrix         = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetMixMatrix"),
            ChannelGroup_GetMixMatrix         = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetMixMatrix"),
            ChannelGroup_GetDSPClock          = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetDSPClock"),
            ChannelGroup_SetDelay             = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetDelay"),
            ChannelGroup_GetDelay             = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetDelay"),
            ChannelGroup_AddFadePoint         = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_AddFadePoint"),
            ChannelGroup_SetFadePointRamp     = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetFadePointRamp"),
            ChannelGroup_RemoveFadePoints     = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_RemoveFadePoints"),
            ChannelGroup_GetFadePoints        = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetFadePoints"),
            ChannelGroup_GetDSP               = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetDSP"),
            ChannelGroup_AddDSP               = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_AddDSP"),
            ChannelGroup_RemoveDSP            = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_RemoveDSP"),
            ChannelGroup_GetNumDSPs           = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetNumDSPs"),
            ChannelGroup_SetDSPIndex          = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetDSPIndex"),
            ChannelGroup_GetDSPIndex          = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetDSPIndex"),
            ChannelGroup_Set3DAttributes      = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Set3DAttributes"),
            ChannelGroup_Get3DAttributes      = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Get3DAttributes"),
            ChannelGroup_Set3DMinMaxDistance  = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Set3DMinMaxDistance"),
            ChannelGroup_Get3DMinMaxDistance  = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Get3DMinMaxDistance"),
            ChannelGroup_Set3DConeSettings    = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Set3DConeSettings"),
            ChannelGroup_Get3DConeSettings    = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Get3DConeSettings"),
            ChannelGroup_Set3DConeOrientation = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Set3DConeOrientation"),
            ChannelGroup_Get3DConeOrientation = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Get3DConeOrientation"),
            ChannelGroup_Set3DCustomRolloff   = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Set3DCustomRolloff"),
            ChannelGroup_Get3DCustomRolloff   = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Get3DCustomRolloff"),
            ChannelGroup_Set3DOcclusion       = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Set3DOcclusion"),
            ChannelGroup_Get3DOcclusion       = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Get3DOcclusion"),
            ChannelGroup_Set3DSpread          = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Set3DSpread"),
            ChannelGroup_Get3DSpread          = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Get3DSpread"),
            ChannelGroup_Set3DLevel           = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Set3DLevel"),
            ChannelGroup_Get3DLevel           = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Get3DLevel"),
            ChannelGroup_Set3DDopplerLevel    = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Set3DDopplerLevel"),
            ChannelGroup_Get3DDopplerLevel    = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Get3DDopplerLevel"),
            ChannelGroup_Set3DDistanceFilter  = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Set3DDistanceFilter"),
            ChannelGroup_Get3DDistanceFilter  = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Get3DDistanceFilter"),
            ChannelGroup_SetUserData          = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_SetUserData"),
            ChannelGroup_GetUserData          = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetUserData"),
            ChannelGroup_Release              = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_Release"),
            ChannelGroup_AddGroup             = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_AddGroup"),
            ChannelGroup_GetNumGroups         = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetNumGroups"),
            ChannelGroup_GetGroup             = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetGroup"),
            ChannelGroup_GetParentGroup       = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetParentGroup"),
            ChannelGroup_GetName              = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetName"),
            ChannelGroup_GetNumChannels       = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetNumChannels"),
            ChannelGroup_GetChannel           = apiGetFunctionAddress(FMOD, "FMOD_ChannelGroup_GetChannel"),
            SoundGroup_Release                = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_Release"),
            SoundGroup_GetSystemObject        = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_GetSystemObject"),
            SoundGroup_SetMaxAudible          = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_SetMaxAudible"),
            SoundGroup_GetMaxAudible          = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_GetMaxAudible"),
            SoundGroup_SetMaxAudibleBehavior  = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_SetMaxAudibleBehavior"),
            SoundGroup_GetMaxAudibleBehavior  = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_GetMaxAudibleBehavior"),
            SoundGroup_SetMuteFadeSpeed       = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_SetMuteFadeSpeed"),
            SoundGroup_GetMuteFadeSpeed       = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_GetMuteFadeSpeed"),
            SoundGroup_SetVolume              = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_SetVolume"),
            SoundGroup_GetVolume              = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_GetVolume"),
            SoundGroup_Stop                   = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_Stop"),
            SoundGroup_GetName                = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_GetName"),
            SoundGroup_GetNumSounds           = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_GetNumSounds"),
            SoundGroup_GetSound               = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_GetSound"),
            SoundGroup_GetNumPlaying          = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_GetNumPlaying"),
            SoundGroup_SetUserData            = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_SetUserData"),
            SoundGroup_GetUserData            = apiGetFunctionAddress(FMOD, "FMOD_SoundGroup_GetUserData"),
            DSP_Release                       = apiGetFunctionAddress(FMOD, "FMOD_DSP_Release"),
            DSP_GetSystemObject               = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetSystemObject"),
            DSP_AddInput                      = apiGetFunctionAddress(FMOD, "FMOD_DSP_AddInput"),
            DSP_DisconnectFrom                = apiGetFunctionAddress(FMOD, "FMOD_DSP_DisconnectFrom"),
            DSP_DisconnectAll                 = apiGetFunctionAddress(FMOD, "FMOD_DSP_DisconnectAll"),
            DSP_GetNumInputs                  = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetNumInputs"),
            DSP_GetNumOutputs                 = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetNumOutputs"),
            DSP_GetInput                      = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetInput"),
            DSP_GetOutput                     = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetOutput"),
            DSP_SetActive                     = apiGetFunctionAddress(FMOD, "FMOD_DSP_SetActive"),
            DSP_GetActive                     = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetActive"),
            DSP_SetBypass                     = apiGetFunctionAddress(FMOD, "FMOD_DSP_SetBypass"),
            DSP_GetBypass                     = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetBypass"),
            DSP_SetWetDryMix                  = apiGetFunctionAddress(FMOD, "FMOD_DSP_SetWetDryMix"),
            DSP_GetWetDryMix                  = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetWetDryMix"),
            DSP_SetChannelFormat              = apiGetFunctionAddress(FMOD, "FMOD_DSP_SetChannelFormat"),
            DSP_GetChannelFormat              = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetChannelFormat"),
            DSP_GetOutputChannelFormat        = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetOutputChannelFormat"),
            DSP_Reset                         = apiGetFunctionAddress(FMOD, "FMOD_DSP_Reset"),
            DSP_SetCallback                   = apiGetFunctionAddress(FMOD, "FMOD_DSP_SetCallback"),
            DSP_SetParameterFloat             = apiGetFunctionAddress(FMOD, "FMOD_DSP_SetParameterFloat"),
            DSP_SetParameterInt               = apiGetFunctionAddress(FMOD, "FMOD_DSP_SetParameterInt"),
            DSP_SetParameterBool              = apiGetFunctionAddress(FMOD, "FMOD_DSP_SetParameterBool"),
            DSP_SetParameterData              = apiGetFunctionAddress(FMOD, "FMOD_DSP_SetParameterData"),
            DSP_GetParameterFloat             = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetParameterFloat"),
            DSP_GetParameterInt               = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetParameterInt"),
            DSP_GetParameterBool              = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetParameterBool"),
            DSP_GetParameterData              = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetParameterData"),
            DSP_GetNumParameters              = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetNumParameters"),
            DSP_GetParameterInfo              = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetParameterInfo"),
            DSP_GetDataParameterIndex         = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetDataParameterIndex"),
            DSP_ShowConfigDialog              = apiGetFunctionAddress(FMOD, "FMOD_DSP_ShowConfigDialog"),
            DSP_GetInfo                       = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetInfo"),
            DSP_GetType                       = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetType"),
            DSP_GetIdle                       = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetIdle"),
            DSP_SetUserData                   = apiGetFunctionAddress(FMOD, "FMOD_DSP_SetUserData"),
            DSP_GetUserData                   = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetUserData"),
            DSP_SetMeteringEnabled            = apiGetFunctionAddress(FMOD, "FMOD_DSP_SetMeteringEnabled"),
            DSP_GetMeteringEnabled            = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetMeteringEnabled"),
            DSP_GetMeteringInfo               = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetMeteringInfo"),
            DSP_GetCPUUsage                   = apiGetFunctionAddress(FMOD, "FMOD_DSP_GetCPUUsage"),
            DSPConnection_GetInput            = apiGetFunctionAddress(FMOD, "FMOD_DSPConnection_GetInput"),
            DSPConnection_GetOutput           = apiGetFunctionAddress(FMOD, "FMOD_DSPConnection_GetOutput"),
            DSPConnection_SetMix              = apiGetFunctionAddress(FMOD, "FMOD_DSPConnection_SetMix"),
            DSPConnection_GetMix              = apiGetFunctionAddress(FMOD, "FMOD_DSPConnection_GetMix"),
            DSPConnection_SetMixMatrix        = apiGetFunctionAddress(FMOD, "FMOD_DSPConnection_SetMixMatrix"),
            DSPConnection_GetMixMatrix        = apiGetFunctionAddress(FMOD, "FMOD_DSPConnection_GetMixMatrix"),
            DSPConnection_GetType             = apiGetFunctionAddress(FMOD, "FMOD_DSPConnection_GetType"),
            DSPConnection_SetUserData         = apiGetFunctionAddress(FMOD, "FMOD_DSPConnection_SetUserData"),
            DSPConnection_GetUserData         = apiGetFunctionAddress(FMOD, "FMOD_DSPConnection_GetUserData"),
            Geometry_Release                  = apiGetFunctionAddress(FMOD, "FMOD_Geometry_Release"),
            Geometry_AddPolygon               = apiGetFunctionAddress(FMOD, "FMOD_Geometry_AddPolygon"),
            Geometry_GetNumPolygons           = apiGetFunctionAddress(FMOD, "FMOD_Geometry_GetNumPolygons"),
            Geometry_GetMaxPolygons           = apiGetFunctionAddress(FMOD, "FMOD_Geometry_GetMaxPolygons"),
            Geometry_GetPolygonNumVertices    = apiGetFunctionAddress(FMOD, "FMOD_Geometry_GetPolygonNumVertices"),
            Geometry_SetPolygonVertex         = apiGetFunctionAddress(FMOD, "FMOD_Geometry_SetPolygonVertex"),
            Geometry_GetPolygonVertex         = apiGetFunctionAddress(FMOD, "FMOD_Geometry_GetPolygonVertex"),
            Geometry_SetPolygonAttributes     = apiGetFunctionAddress(FMOD, "FMOD_Geometry_SetPolygonAttributes"),
            Geometry_GetPolygonAttributes     = apiGetFunctionAddress(FMOD, "FMOD_Geometry_GetPolygonAttributes"),
            Geometry_SetActive                = apiGetFunctionAddress(FMOD, "FMOD_Geometry_SetActive"),
            Geometry_GetActive                = apiGetFunctionAddress(FMOD, "FMOD_Geometry_GetActive"),
            Geometry_SetRotation              = apiGetFunctionAddress(FMOD, "FMOD_Geometry_SetRotation"),
            Geometry_GetRotation              = apiGetFunctionAddress(FMOD, "FMOD_Geometry_GetRotation"),
            Geometry_SetPosition              = apiGetFunctionAddress(FMOD, "FMOD_Geometry_SetPosition"),
            Geometry_GetPosition              = apiGetFunctionAddress(FMOD, "FMOD_Geometry_GetPosition"),
            Geometry_SetScale                 = apiGetFunctionAddress(FMOD, "FMOD_Geometry_SetScale"),
            Geometry_GetScale                 = apiGetFunctionAddress(FMOD, "FMOD_Geometry_GetScale"),
            Geometry_Save                     = apiGetFunctionAddress(FMOD, "FMOD_Geometry_Save"),
            Geometry_SetUserData              = apiGetFunctionAddress(FMOD, "FMOD_Geometry_SetUserData"),
            Geometry_GetUserData              = apiGetFunctionAddress(FMOD, "FMOD_Geometry_GetUserData"),
            Reverb3D_Release                  = apiGetFunctionAddress(FMOD, "FMOD_Reverb3D_Release"),
            Reverb3D_Set3DAttributes          = apiGetFunctionAddress(FMOD, "FMOD_Reverb3D_Set3DAttributes"),
            Reverb3D_Get3DAttributes          = apiGetFunctionAddress(FMOD, "FMOD_Reverb3D_Get3DAttributes"),
            Reverb3D_SetProperties            = apiGetFunctionAddress(FMOD, "FMOD_Reverb3D_SetProperties"),
            Reverb3D_GetProperties            = apiGetFunctionAddress(FMOD, "FMOD_Reverb3D_GetProperties"),
            Reverb3D_SetActive                = apiGetFunctionAddress(FMOD, "FMOD_Reverb3D_SetActive"),
            Reverb3D_GetActive                = apiGetFunctionAddress(FMOD, "FMOD_Reverb3D_GetActive"),
            Reverb3D_SetUserData              = apiGetFunctionAddress(FMOD, "FMOD_Reverb3D_SetUserData"),
            Reverb3D_GetUserData              = apiGetFunctionAddress(FMOD, "FMOD_Reverb3D_GetUserData");

    }

    /** Returns the FMOD {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return FMOD;
    }

    public static final int FMOD_VERSION = 0x20216;

    public static final int FMOD_DEBUG_LEVEL_NONE = 0x0;

    public static final int FMOD_DEBUG_LEVEL_ERROR = 0x1;

    public static final int FMOD_DEBUG_LEVEL_WARNING = 0x2;

    public static final int FMOD_DEBUG_LEVEL_LOG = 0x4;

    public static final int FMOD_DEBUG_TYPE_MEMORY = 0x100;

    public static final int FMOD_DEBUG_TYPE_FILE = 0x200;

    public static final int FMOD_DEBUG_TYPE_CODEC = 0x400;

    public static final int FMOD_DEBUG_TYPE_TRACE = 0x800;

    public static final int FMOD_DEBUG_DISPLAY_TIMESTAMPS = 0x10000;

    public static final int FMOD_DEBUG_DISPLAY_LINENUMBERS = 0x20000;

    public static final int FMOD_DEBUG_DISPLAY_THREAD = 0x40000;

    public static final int FMOD_MEMORY_NORMAL = 0x0;

    public static final int FMOD_MEMORY_STREAM_FILE = 0x1;

    public static final int FMOD_MEMORY_STREAM_DECODE = 0x2;

    public static final int FMOD_MEMORY_SAMPLEDATA = 0x4;

    public static final int FMOD_MEMORY_DSP_BUFFER = 0x8;

    public static final int FMOD_MEMORY_PLUGIN = 0x10;

    public static final int FMOD_MEMORY_PERSISTENT = 0x200000;

    public static final int FMOD_MEMORY_ALL = 0xFFFFFFFF;

    public static final int FMOD_INIT_NORMAL = 0x0;

    public static final int FMOD_INIT_STREAM_FROM_UPDATE = 0x1;

    public static final int FMOD_INIT_MIX_FROM_UPDATE = 0x2;

    public static final int FMOD_INIT_3D_RIGHTHANDED = 0x4;

    public static final int FMOD_INIT_CLIP_OUTPUT = 0x8;

    public static final int FMOD_INIT_CHANNEL_LOWPASS = 0x100;

    public static final int FMOD_INIT_CHANNEL_DISTANCEFILTER = 0x200;

    public static final int FMOD_INIT_PROFILE_ENABLE = 0x10000;

    public static final int FMOD_INIT_VOL0_BECOMES_VIRTUAL = 0x20000;

    public static final int FMOD_INIT_GEOMETRY_USECLOSEST = 0x40000;

    public static final int FMOD_INIT_PREFER_DOLBY_DOWNMIX = 0x80000;

    public static final int FMOD_INIT_THREAD_UNSAFE = 0x100000;

    public static final int FMOD_INIT_PROFILE_METER_ALL = 0x200000;

    public static final int FMOD_INIT_MEMORY_TRACKING = 0x400000;

    public static final int FMOD_DRIVER_STATE_CONNECTED = 0x1;

    public static final int FMOD_DRIVER_STATE_DEFAULT = 0x2;

    public static final int FMOD_TIMEUNIT_MS = 0x1;

    public static final int FMOD_TIMEUNIT_PCM = 0x2;

    public static final int FMOD_TIMEUNIT_PCMBYTES = 0x4;

    public static final int FMOD_TIMEUNIT_RAWBYTES = 0x8;

    public static final int FMOD_TIMEUNIT_PCMFRACTION = 0x10;

    public static final int FMOD_TIMEUNIT_MODORDER = 0x100;

    public static final int FMOD_TIMEUNIT_MODROW = 0x200;

    public static final int FMOD_TIMEUNIT_MODPATTERN = 0x400;

    public static final int FMOD_SYSTEM_CALLBACK_DEVICELISTCHANGED = 0x1;

    public static final int FMOD_SYSTEM_CALLBACK_DEVICELOST = 0x2;

    public static final int FMOD_SYSTEM_CALLBACK_MEMORYALLOCATIONFAILED = 0x4;

    public static final int FMOD_SYSTEM_CALLBACK_THREADCREATED = 0x8;

    public static final int FMOD_SYSTEM_CALLBACK_BADDSPCONNECTION = 0x10;

    public static final int FMOD_SYSTEM_CALLBACK_PREMIX = 0x20;

    public static final int FMOD_SYSTEM_CALLBACK_POSTMIX = 0x40;

    public static final int FMOD_SYSTEM_CALLBACK_ERROR = 0x80;

    public static final int FMOD_SYSTEM_CALLBACK_MIDMIX = 0x100;

    public static final int FMOD_SYSTEM_CALLBACK_THREADDESTROYED = 0x200;

    public static final int FMOD_SYSTEM_CALLBACK_PREUPDATE = 0x400;

    public static final int FMOD_SYSTEM_CALLBACK_POSTUPDATE = 0x800;

    public static final int FMOD_SYSTEM_CALLBACK_RECORDLISTCHANGED = 0x1000;

    public static final int FMOD_SYSTEM_CALLBACK_BUFFEREDNOMIX = 0x2000;

    public static final int FMOD_SYSTEM_CALLBACK_DEVICEREINITIALIZE = 0x4000;

    public static final int FMOD_SYSTEM_CALLBACK_OUTPUTUNDERRUN = 0x8000;

    public static final int FMOD_SYSTEM_CALLBACK_RECORDPOSITIONCHANGED = 0x10000;

    public static final int FMOD_SYSTEM_CALLBACK_ALL = 0xFFFFFFFF;

    public static final int FMOD_DEFAULT = 0x0;

    public static final int FMOD_LOOP_OFF = 0x1;

    public static final int FMOD_LOOP_NORMAL = 0x2;

    public static final int FMOD_LOOP_BIDI = 0x4;

    public static final int FMOD_2D = 0x8;

    public static final int FMOD_3D = 0x10;

    public static final int FMOD_CREATESTREAM = 0x80;

    public static final int FMOD_CREATESAMPLE = 0x100;

    public static final int FMOD_CREATECOMPRESSEDSAMPLE = 0x200;

    public static final int FMOD_OPENUSER = 0x400;

    public static final int FMOD_OPENMEMORY = 0x800;

    public static final int FMOD_OPENMEMORY_POINT = 0x10000000;

    public static final int FMOD_OPENRAW = 0x1000;

    public static final int FMOD_OPENONLY = 0x2000;

    public static final int FMOD_ACCURATETIME = 0x4000;

    public static final int FMOD_MPEGSEARCH = 0x8000;

    public static final int FMOD_NONBLOCKING = 0x10000;

    public static final int FMOD_UNIQUE = 0x20000;

    public static final int FMOD_3D_HEADRELATIVE = 0x40000;

    public static final int FMOD_3D_WORLDRELATIVE = 0x80000;

    public static final int FMOD_3D_INVERSEROLLOFF = 0x100000;

    public static final int FMOD_3D_LINEARROLLOFF = 0x200000;

    public static final int FMOD_3D_LINEARSQUAREROLLOFF = 0x400000;

    public static final int FMOD_3D_INVERSETAPEREDROLLOFF = 0x800000;

    public static final int FMOD_3D_CUSTOMROLLOFF = 0x4000000;

    public static final int FMOD_3D_IGNOREGEOMETRY = 0x40000000;

    public static final int FMOD_IGNORETAGS = 0x2000000;

    public static final int FMOD_LOWMEM = 0x8000000;

    public static final int FMOD_VIRTUAL_PLAYFROMSTART = 0x80000000;

    public static final int FMOD_CHANNELMASK_FRONT_LEFT = 0x1;

    public static final int FMOD_CHANNELMASK_FRONT_RIGHT = 0x2;

    public static final int FMOD_CHANNELMASK_FRONT_CENTER = 0x4;

    public static final int FMOD_CHANNELMASK_LOW_FREQUENCY = 0x8;

    public static final int FMOD_CHANNELMASK_SURROUND_LEFT = 0x10;

    public static final int FMOD_CHANNELMASK_SURROUND_RIGHT = 0x20;

    public static final int FMOD_CHANNELMASK_BACK_LEFT = 0x40;

    public static final int FMOD_CHANNELMASK_BACK_RIGHT = 0x80;

    public static final int FMOD_CHANNELMASK_BACK_CENTER = 0x100;

    public static final int FMOD_CHANNELMASK_MONO = FMOD_CHANNELMASK_FRONT_LEFT;

    public static final int FMOD_CHANNELMASK_STEREO = FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT;

    public static final int FMOD_CHANNELMASK_LRC = FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER;

    public static final int FMOD_CHANNELMASK_QUAD = FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_SURROUND_LEFT | FMOD_CHANNELMASK_SURROUND_RIGHT;

    public static final int FMOD_CHANNELMASK_SURROUND = FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER  | FMOD_CHANNELMASK_SURROUND_LEFT | FMOD_CHANNELMASK_SURROUND_RIGHT;

    public static final int FMOD_CHANNELMASK_5POINT1 = FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER  | FMOD_CHANNELMASK_LOW_FREQUENCY | FMOD_CHANNELMASK_SURROUND_LEFT  | FMOD_CHANNELMASK_SURROUND_RIGHT;

    public static final int FMOD_CHANNELMASK_5POINT1_REARS = FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER  | FMOD_CHANNELMASK_LOW_FREQUENCY | FMOD_CHANNELMASK_BACK_LEFT      | FMOD_CHANNELMASK_BACK_RIGHT;

    public static final int FMOD_CHANNELMASK_7POINT0 = FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER  | FMOD_CHANNELMASK_SURROUND_LEFT | FMOD_CHANNELMASK_SURROUND_RIGHT | FMOD_CHANNELMASK_BACK_LEFT      | FMOD_CHANNELMASK_BACK_RIGHT;

    public static final int FMOD_CHANNELMASK_7POINT1 = FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER  | FMOD_CHANNELMASK_LOW_FREQUENCY | FMOD_CHANNELMASK_SURROUND_LEFT  | FMOD_CHANNELMASK_SURROUND_RIGHT | FMOD_CHANNELMASK_BACK_LEFT | FMOD_CHANNELMASK_BACK_RIGHT;

    public static final long FMOD_PORT_INDEX_NONE = 0xFFFFFFFFFFFFFFFFL;

    public static final long FMOD_PORT_INDEX_FLAG_VR_CONTROLLER = 0x1000000000000000L;

    public static final int FMOD_THREAD_PRIORITY_PLATFORM_MIN = -32 * 1024;

    public static final int FMOD_THREAD_PRIORITY_PLATFORM_MAX = 32 * 1024;

    public static final int FMOD_THREAD_PRIORITY_DEFAULT = FMOD_THREAD_PRIORITY_PLATFORM_MIN - 1;

    public static final int FMOD_THREAD_PRIORITY_LOW = FMOD_THREAD_PRIORITY_PLATFORM_MIN - 2;

    public static final int FMOD_THREAD_PRIORITY_MEDIUM = FMOD_THREAD_PRIORITY_PLATFORM_MIN - 3;

    public static final int FMOD_THREAD_PRIORITY_HIGH = FMOD_THREAD_PRIORITY_PLATFORM_MIN - 4;

    public static final int FMOD_THREAD_PRIORITY_VERY_HIGH = FMOD_THREAD_PRIORITY_PLATFORM_MIN - 5;

    public static final int FMOD_THREAD_PRIORITY_EXTREME = FMOD_THREAD_PRIORITY_PLATFORM_MIN - 6;

    public static final int FMOD_THREAD_PRIORITY_CRITICAL = FMOD_THREAD_PRIORITY_PLATFORM_MIN - 7;

    public static final int FMOD_THREAD_PRIORITY_MIXER = FMOD_THREAD_PRIORITY_EXTREME;

    public static final int FMOD_THREAD_PRIORITY_FEEDER = FMOD_THREAD_PRIORITY_CRITICAL;

    public static final int FMOD_THREAD_PRIORITY_STREAM = FMOD_THREAD_PRIORITY_VERY_HIGH;

    public static final int FMOD_THREAD_PRIORITY_FILE = FMOD_THREAD_PRIORITY_HIGH;

    public static final int FMOD_THREAD_PRIORITY_NONBLOCKING = FMOD_THREAD_PRIORITY_HIGH;

    public static final int FMOD_THREAD_PRIORITY_RECORD = FMOD_THREAD_PRIORITY_HIGH;

    public static final int FMOD_THREAD_PRIORITY_GEOMETRY = FMOD_THREAD_PRIORITY_LOW;

    public static final int FMOD_THREAD_PRIORITY_PROFILER = FMOD_THREAD_PRIORITY_MEDIUM;

    public static final int FMOD_THREAD_PRIORITY_STUDIO_UPDATE = FMOD_THREAD_PRIORITY_MEDIUM;

    public static final int FMOD_THREAD_PRIORITY_STUDIO_LOAD_BANK = FMOD_THREAD_PRIORITY_MEDIUM;

    public static final int FMOD_THREAD_PRIORITY_STUDIO_LOAD_SAMPLE = FMOD_THREAD_PRIORITY_MEDIUM;

    public static final int FMOD_THREAD_PRIORITY_CONVOLUTION1 = FMOD_THREAD_PRIORITY_VERY_HIGH;

    public static final int FMOD_THREAD_PRIORITY_CONVOLUTION2 = FMOD_THREAD_PRIORITY_VERY_HIGH;

    public static final int FMOD_THREAD_STACK_SIZE_DEFAULT = 0;

    public static final int FMOD_THREAD_STACK_SIZE_MIXER = 80  * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_FEEDER = 16  * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_STREAM = 96  * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_FILE = 64  * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_NONBLOCKING = 112 * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_RECORD = 16  * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_GEOMETRY = 48  * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_PROFILER = 128 * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_STUDIO_UPDATE = 96  * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_STUDIO_LOAD_BANK = 96  * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_STUDIO_LOAD_SAMPLE = 96  * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_CONVOLUTION1 = 16  * 1024;

    public static final int FMOD_THREAD_STACK_SIZE_CONVOLUTION2 = 16  * 1024;

    public static final long FMOD_THREAD_AFFINITY_GROUP_DEFAULT = 0x4000000000000000L;

    public static final long FMOD_THREAD_AFFINITY_GROUP_A = 0x4000000000000001L;

    public static final long FMOD_THREAD_AFFINITY_GROUP_B = 0x4000000000000002L;

    public static final long FMOD_THREAD_AFFINITY_GROUP_C = 0x4000000000000003L;

    public static final long FMOD_THREAD_AFFINITY_MIXER = FMOD_THREAD_AFFINITY_GROUP_A;

    public static final long FMOD_THREAD_AFFINITY_FEEDER = FMOD_THREAD_AFFINITY_GROUP_C;

    public static final long FMOD_THREAD_AFFINITY_STREAM = FMOD_THREAD_AFFINITY_GROUP_C;

    public static final long FMOD_THREAD_AFFINITY_FILE = FMOD_THREAD_AFFINITY_GROUP_C;

    public static final long FMOD_THREAD_AFFINITY_NONBLOCKING = FMOD_THREAD_AFFINITY_GROUP_C;

    public static final long FMOD_THREAD_AFFINITY_RECORD = FMOD_THREAD_AFFINITY_GROUP_C;

    public static final long FMOD_THREAD_AFFINITY_GEOMETRY = FMOD_THREAD_AFFINITY_GROUP_C;

    public static final long FMOD_THREAD_AFFINITY_PROFILER = FMOD_THREAD_AFFINITY_GROUP_C;

    public static final long FMOD_THREAD_AFFINITY_STUDIO_UPDATE = FMOD_THREAD_AFFINITY_GROUP_B;

    public static final long FMOD_THREAD_AFFINITY_STUDIO_LOAD_BANK = FMOD_THREAD_AFFINITY_GROUP_C;

    public static final long FMOD_THREAD_AFFINITY_STUDIO_LOAD_SAMPLE = FMOD_THREAD_AFFINITY_GROUP_C;

    public static final long FMOD_THREAD_AFFINITY_CONVOLUTION1 = FMOD_THREAD_AFFINITY_GROUP_C;

    public static final long FMOD_THREAD_AFFINITY_CONVOLUTION2 = FMOD_THREAD_AFFINITY_GROUP_C;

    public static final int FMOD_THREAD_AFFINITY_CORE_ALL = 0;

    public static final int FMOD_THREAD_AFFINITY_CORE_0 = 1 << 0;

    public static final int FMOD_THREAD_AFFINITY_CORE_1 = 1 << 1;

    public static final int FMOD_THREAD_AFFINITY_CORE_2 = 1 << 2;

    public static final int FMOD_THREAD_AFFINITY_CORE_3 = 1 << 3;

    public static final int FMOD_THREAD_AFFINITY_CORE_4 = 1 << 4;

    public static final int FMOD_THREAD_AFFINITY_CORE_5 = 1 << 5;

    public static final int FMOD_THREAD_AFFINITY_CORE_6 = 1 << 6;

    public static final int FMOD_THREAD_AFFINITY_CORE_7 = 1 << 7;

    public static final int FMOD_THREAD_AFFINITY_CORE_8 = 1 << 8;

    public static final int FMOD_THREAD_AFFINITY_CORE_9 = 1 << 9;

    public static final int FMOD_THREAD_AFFINITY_CORE_10 = 1 << 10;

    public static final int FMOD_THREAD_AFFINITY_CORE_11 = 1 << 11;

    public static final int FMOD_THREAD_AFFINITY_CORE_12 = 1 << 12;

    public static final int FMOD_THREAD_AFFINITY_CORE_13 = 1 << 13;

    public static final int FMOD_THREAD_AFFINITY_CORE_14 = 1 << 14;

    public static final int FMOD_THREAD_AFFINITY_CORE_15 = 1 << 15;

    public static final int FMOD_MAX_CHANNEL_WIDTH = 32;

    public static final int FMOD_MAX_SYSTEMS = 8;

    public static final int FMOD_MAX_LISTENERS = 8;

    public static final int FMOD_REVERB_MAXINSTANCES = 4;

    public static final int FMOD_CODEC_PLUGIN_VERSION = 1;

    public static final int FMOD_CODEC_SEEK_METHOD_SET = 0;

    public static final int FMOD_CODEC_SEEK_METHOD_CURRENT = 1;

    public static final int FMOD_CODEC_SEEK_METHOD_END = 2;

    public static final int FMOD_DSP_LOUDNESS_METER_HISTOGRAM_SAMPLES = 66;

    public static final int FMOD_PLUGIN_SDK_VERSION = 110;

    public static final int FMOD_DSP_GETPARAM_VALUESTR_LENGTH = 32;

    public static final int FMOD_OUTPUT_PLUGIN_VERSION = 5;

    public static final int FMOD_OUTPUT_METHOD_MIX_DIRECT = 0;

    public static final int FMOD_OUTPUT_METHOD_MIX_BUFFERED = 1;

    /**
     * {@code FMOD_THREAD_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_THREAD_TYPE_MIXER THREAD_TYPE_MIXER}</li>
     * <li>{@link #FMOD_THREAD_TYPE_FEEDER THREAD_TYPE_FEEDER}</li>
     * <li>{@link #FMOD_THREAD_TYPE_STREAM THREAD_TYPE_STREAM}</li>
     * <li>{@link #FMOD_THREAD_TYPE_FILE THREAD_TYPE_FILE}</li>
     * <li>{@link #FMOD_THREAD_TYPE_NONBLOCKING THREAD_TYPE_NONBLOCKING}</li>
     * <li>{@link #FMOD_THREAD_TYPE_RECORD THREAD_TYPE_RECORD}</li>
     * <li>{@link #FMOD_THREAD_TYPE_GEOMETRY THREAD_TYPE_GEOMETRY}</li>
     * <li>{@link #FMOD_THREAD_TYPE_PROFILER THREAD_TYPE_PROFILER}</li>
     * <li>{@link #FMOD_THREAD_TYPE_STUDIO_UPDATE THREAD_TYPE_STUDIO_UPDATE}</li>
     * <li>{@link #FMOD_THREAD_TYPE_STUDIO_LOAD_BANK THREAD_TYPE_STUDIO_LOAD_BANK}</li>
     * <li>{@link #FMOD_THREAD_TYPE_STUDIO_LOAD_SAMPLE THREAD_TYPE_STUDIO_LOAD_SAMPLE}</li>
     * <li>{@link #FMOD_THREAD_TYPE_CONVOLUTION1 THREAD_TYPE_CONVOLUTION1}</li>
     * <li>{@link #FMOD_THREAD_TYPE_CONVOLUTION2 THREAD_TYPE_CONVOLUTION2}</li>
     * <li>{@link #FMOD_THREAD_TYPE_MAX THREAD_TYPE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_THREAD_TYPE_MIXER              = 0,
        FMOD_THREAD_TYPE_FEEDER             = 1,
        FMOD_THREAD_TYPE_STREAM             = 2,
        FMOD_THREAD_TYPE_FILE               = 3,
        FMOD_THREAD_TYPE_NONBLOCKING        = 4,
        FMOD_THREAD_TYPE_RECORD             = 5,
        FMOD_THREAD_TYPE_GEOMETRY           = 6,
        FMOD_THREAD_TYPE_PROFILER           = 7,
        FMOD_THREAD_TYPE_STUDIO_UPDATE      = 8,
        FMOD_THREAD_TYPE_STUDIO_LOAD_BANK   = 9,
        FMOD_THREAD_TYPE_STUDIO_LOAD_SAMPLE = 10,
        FMOD_THREAD_TYPE_CONVOLUTION1       = 11,
        FMOD_THREAD_TYPE_CONVOLUTION2       = 12,
        FMOD_THREAD_TYPE_MAX                = 13;

    /**
     * {@code FMOD_RESULT}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_OK OK}</li>
     * <li>{@link #FMOD_ERR_BADCOMMAND ERR_BADCOMMAND}</li>
     * <li>{@link #FMOD_ERR_CHANNEL_ALLOC ERR_CHANNEL_ALLOC}</li>
     * <li>{@link #FMOD_ERR_CHANNEL_STOLEN ERR_CHANNEL_STOLEN}</li>
     * <li>{@link #FMOD_ERR_DMA ERR_DMA}</li>
     * <li>{@link #FMOD_ERR_DSP_CONNECTION ERR_DSP_CONNECTION}</li>
     * <li>{@link #FMOD_ERR_DSP_DONTPROCESS ERR_DSP_DONTPROCESS}</li>
     * <li>{@link #FMOD_ERR_DSP_FORMAT ERR_DSP_FORMAT}</li>
     * <li>{@link #FMOD_ERR_DSP_INUSE ERR_DSP_INUSE}</li>
     * <li>{@link #FMOD_ERR_DSP_NOTFOUND ERR_DSP_NOTFOUND}</li>
     * <li>{@link #FMOD_ERR_DSP_RESERVED ERR_DSP_RESERVED}</li>
     * <li>{@link #FMOD_ERR_DSP_SILENCE ERR_DSP_SILENCE}</li>
     * <li>{@link #FMOD_ERR_DSP_TYPE ERR_DSP_TYPE}</li>
     * <li>{@link #FMOD_ERR_FILE_BAD ERR_FILE_BAD}</li>
     * <li>{@link #FMOD_ERR_FILE_COULDNOTSEEK ERR_FILE_COULDNOTSEEK}</li>
     * <li>{@link #FMOD_ERR_FILE_DISKEJECTED ERR_FILE_DISKEJECTED}</li>
     * <li>{@link #FMOD_ERR_FILE_EOF ERR_FILE_EOF}</li>
     * <li>{@link #FMOD_ERR_FILE_ENDOFDATA ERR_FILE_ENDOFDATA}</li>
     * <li>{@link #FMOD_ERR_FILE_NOTFOUND ERR_FILE_NOTFOUND}</li>
     * <li>{@link #FMOD_ERR_FORMAT ERR_FORMAT}</li>
     * <li>{@link #FMOD_ERR_HEADER_MISMATCH ERR_HEADER_MISMATCH}</li>
     * <li>{@link #FMOD_ERR_HTTP ERR_HTTP}</li>
     * <li>{@link #FMOD_ERR_HTTP_ACCESS ERR_HTTP_ACCESS}</li>
     * <li>{@link #FMOD_ERR_HTTP_PROXY_AUTH ERR_HTTP_PROXY_AUTH}</li>
     * <li>{@link #FMOD_ERR_HTTP_SERVER_ERROR ERR_HTTP_SERVER_ERROR}</li>
     * <li>{@link #FMOD_ERR_HTTP_TIMEOUT ERR_HTTP_TIMEOUT}</li>
     * <li>{@link #FMOD_ERR_INITIALIZATION ERR_INITIALIZATION}</li>
     * <li>{@link #FMOD_ERR_INITIALIZED ERR_INITIALIZED}</li>
     * <li>{@link #FMOD_ERR_INTERNAL ERR_INTERNAL}</li>
     * <li>{@link #FMOD_ERR_INVALID_FLOAT ERR_INVALID_FLOAT}</li>
     * <li>{@link #FMOD_ERR_INVALID_HANDLE ERR_INVALID_HANDLE}</li>
     * <li>{@link #FMOD_ERR_INVALID_PARAM ERR_INVALID_PARAM}</li>
     * <li>{@link #FMOD_ERR_INVALID_POSITION ERR_INVALID_POSITION}</li>
     * <li>{@link #FMOD_ERR_INVALID_SPEAKER ERR_INVALID_SPEAKER}</li>
     * <li>{@link #FMOD_ERR_INVALID_SYNCPOINT ERR_INVALID_SYNCPOINT}</li>
     * <li>{@link #FMOD_ERR_INVALID_THREAD ERR_INVALID_THREAD}</li>
     * <li>{@link #FMOD_ERR_INVALID_VECTOR ERR_INVALID_VECTOR}</li>
     * <li>{@link #FMOD_ERR_MAXAUDIBLE ERR_MAXAUDIBLE}</li>
     * <li>{@link #FMOD_ERR_MEMORY ERR_MEMORY}</li>
     * <li>{@link #FMOD_ERR_MEMORY_CANTPOINT ERR_MEMORY_CANTPOINT}</li>
     * <li>{@link #FMOD_ERR_NEEDS3D ERR_NEEDS3D}</li>
     * <li>{@link #FMOD_ERR_NEEDSHARDWARE ERR_NEEDSHARDWARE}</li>
     * <li>{@link #FMOD_ERR_NET_CONNECT ERR_NET_CONNECT}</li>
     * <li>{@link #FMOD_ERR_NET_SOCKET_ERROR ERR_NET_SOCKET_ERROR}</li>
     * <li>{@link #FMOD_ERR_NET_URL ERR_NET_URL}</li>
     * <li>{@link #FMOD_ERR_NET_WOULD_BLOCK ERR_NET_WOULD_BLOCK}</li>
     * <li>{@link #FMOD_ERR_NOTREADY ERR_NOTREADY}</li>
     * <li>{@link #FMOD_ERR_OUTPUT_ALLOCATED ERR_OUTPUT_ALLOCATED}</li>
     * <li>{@link #FMOD_ERR_OUTPUT_CREATEBUFFER ERR_OUTPUT_CREATEBUFFER}</li>
     * <li>{@link #FMOD_ERR_OUTPUT_DRIVERCALL ERR_OUTPUT_DRIVERCALL}</li>
     * <li>{@link #FMOD_ERR_OUTPUT_FORMAT ERR_OUTPUT_FORMAT}</li>
     * <li>{@link #FMOD_ERR_OUTPUT_INIT ERR_OUTPUT_INIT}</li>
     * <li>{@link #FMOD_ERR_OUTPUT_NODRIVERS ERR_OUTPUT_NODRIVERS}</li>
     * <li>{@link #FMOD_ERR_PLUGIN ERR_PLUGIN}</li>
     * <li>{@link #FMOD_ERR_PLUGIN_MISSING ERR_PLUGIN_MISSING}</li>
     * <li>{@link #FMOD_ERR_PLUGIN_RESOURCE ERR_PLUGIN_RESOURCE}</li>
     * <li>{@link #FMOD_ERR_PLUGIN_VERSION ERR_PLUGIN_VERSION}</li>
     * <li>{@link #FMOD_ERR_RECORD ERR_RECORD}</li>
     * <li>{@link #FMOD_ERR_REVERB_CHANNELGROUP ERR_REVERB_CHANNELGROUP}</li>
     * <li>{@link #FMOD_ERR_REVERB_INSTANCE ERR_REVERB_INSTANCE}</li>
     * <li>{@link #FMOD_ERR_SUBSOUNDS ERR_SUBSOUNDS}</li>
     * <li>{@link #FMOD_ERR_SUBSOUND_ALLOCATED ERR_SUBSOUND_ALLOCATED}</li>
     * <li>{@link #FMOD_ERR_SUBSOUND_CANTMOVE ERR_SUBSOUND_CANTMOVE}</li>
     * <li>{@link #FMOD_ERR_TAGNOTFOUND ERR_TAGNOTFOUND}</li>
     * <li>{@link #FMOD_ERR_TOOMANYCHANNELS ERR_TOOMANYCHANNELS}</li>
     * <li>{@link #FMOD_ERR_TRUNCATED ERR_TRUNCATED}</li>
     * <li>{@link #FMOD_ERR_UNIMPLEMENTED ERR_UNIMPLEMENTED}</li>
     * <li>{@link #FMOD_ERR_UNINITIALIZED ERR_UNINITIALIZED}</li>
     * <li>{@link #FMOD_ERR_UNSUPPORTED ERR_UNSUPPORTED}</li>
     * <li>{@link #FMOD_ERR_VERSION ERR_VERSION}</li>
     * <li>{@link #FMOD_ERR_EVENT_ALREADY_LOADED ERR_EVENT_ALREADY_LOADED}</li>
     * <li>{@link #FMOD_ERR_EVENT_LIVEUPDATE_BUSY ERR_EVENT_LIVEUPDATE_BUSY}</li>
     * <li>{@link #FMOD_ERR_EVENT_LIVEUPDATE_MISMATCH ERR_EVENT_LIVEUPDATE_MISMATCH}</li>
     * <li>{@link #FMOD_ERR_EVENT_LIVEUPDATE_TIMEOUT ERR_EVENT_LIVEUPDATE_TIMEOUT}</li>
     * <li>{@link #FMOD_ERR_EVENT_NOTFOUND ERR_EVENT_NOTFOUND}</li>
     * <li>{@link #FMOD_ERR_STUDIO_UNINITIALIZED ERR_STUDIO_UNINITIALIZED}</li>
     * <li>{@link #FMOD_ERR_STUDIO_NOT_LOADED ERR_STUDIO_NOT_LOADED}</li>
     * <li>{@link #FMOD_ERR_INVALID_STRING ERR_INVALID_STRING}</li>
     * <li>{@link #FMOD_ERR_ALREADY_LOCKED ERR_ALREADY_LOCKED}</li>
     * <li>{@link #FMOD_ERR_NOT_LOCKED ERR_NOT_LOCKED}</li>
     * <li>{@link #FMOD_ERR_RECORD_DISCONNECTED ERR_RECORD_DISCONNECTED}</li>
     * <li>{@link #FMOD_ERR_TOOMANYSAMPLES ERR_TOOMANYSAMPLES}</li>
     * </ul>
     */
    public static final int
        FMOD_OK                            = 0,
        FMOD_ERR_BADCOMMAND                = 1,
        FMOD_ERR_CHANNEL_ALLOC             = 2,
        FMOD_ERR_CHANNEL_STOLEN            = 3,
        FMOD_ERR_DMA                       = 4,
        FMOD_ERR_DSP_CONNECTION            = 5,
        FMOD_ERR_DSP_DONTPROCESS           = 6,
        FMOD_ERR_DSP_FORMAT                = 7,
        FMOD_ERR_DSP_INUSE                 = 8,
        FMOD_ERR_DSP_NOTFOUND              = 9,
        FMOD_ERR_DSP_RESERVED              = 10,
        FMOD_ERR_DSP_SILENCE               = 11,
        FMOD_ERR_DSP_TYPE                  = 12,
        FMOD_ERR_FILE_BAD                  = 13,
        FMOD_ERR_FILE_COULDNOTSEEK         = 14,
        FMOD_ERR_FILE_DISKEJECTED          = 15,
        FMOD_ERR_FILE_EOF                  = 16,
        FMOD_ERR_FILE_ENDOFDATA            = 17,
        FMOD_ERR_FILE_NOTFOUND             = 18,
        FMOD_ERR_FORMAT                    = 19,
        FMOD_ERR_HEADER_MISMATCH           = 20,
        FMOD_ERR_HTTP                      = 21,
        FMOD_ERR_HTTP_ACCESS               = 22,
        FMOD_ERR_HTTP_PROXY_AUTH           = 23,
        FMOD_ERR_HTTP_SERVER_ERROR         = 24,
        FMOD_ERR_HTTP_TIMEOUT              = 25,
        FMOD_ERR_INITIALIZATION            = 26,
        FMOD_ERR_INITIALIZED               = 27,
        FMOD_ERR_INTERNAL                  = 28,
        FMOD_ERR_INVALID_FLOAT             = 29,
        FMOD_ERR_INVALID_HANDLE            = 30,
        FMOD_ERR_INVALID_PARAM             = 31,
        FMOD_ERR_INVALID_POSITION          = 32,
        FMOD_ERR_INVALID_SPEAKER           = 33,
        FMOD_ERR_INVALID_SYNCPOINT         = 34,
        FMOD_ERR_INVALID_THREAD            = 35,
        FMOD_ERR_INVALID_VECTOR            = 36,
        FMOD_ERR_MAXAUDIBLE                = 37,
        FMOD_ERR_MEMORY                    = 38,
        FMOD_ERR_MEMORY_CANTPOINT          = 39,
        FMOD_ERR_NEEDS3D                   = 40,
        FMOD_ERR_NEEDSHARDWARE             = 41,
        FMOD_ERR_NET_CONNECT               = 42,
        FMOD_ERR_NET_SOCKET_ERROR          = 43,
        FMOD_ERR_NET_URL                   = 44,
        FMOD_ERR_NET_WOULD_BLOCK           = 45,
        FMOD_ERR_NOTREADY                  = 46,
        FMOD_ERR_OUTPUT_ALLOCATED          = 47,
        FMOD_ERR_OUTPUT_CREATEBUFFER       = 48,
        FMOD_ERR_OUTPUT_DRIVERCALL         = 49,
        FMOD_ERR_OUTPUT_FORMAT             = 50,
        FMOD_ERR_OUTPUT_INIT               = 51,
        FMOD_ERR_OUTPUT_NODRIVERS          = 52,
        FMOD_ERR_PLUGIN                    = 53,
        FMOD_ERR_PLUGIN_MISSING            = 54,
        FMOD_ERR_PLUGIN_RESOURCE           = 55,
        FMOD_ERR_PLUGIN_VERSION            = 56,
        FMOD_ERR_RECORD                    = 57,
        FMOD_ERR_REVERB_CHANNELGROUP       = 58,
        FMOD_ERR_REVERB_INSTANCE           = 59,
        FMOD_ERR_SUBSOUNDS                 = 60,
        FMOD_ERR_SUBSOUND_ALLOCATED        = 61,
        FMOD_ERR_SUBSOUND_CANTMOVE         = 62,
        FMOD_ERR_TAGNOTFOUND               = 63,
        FMOD_ERR_TOOMANYCHANNELS           = 64,
        FMOD_ERR_TRUNCATED                 = 65,
        FMOD_ERR_UNIMPLEMENTED             = 66,
        FMOD_ERR_UNINITIALIZED             = 67,
        FMOD_ERR_UNSUPPORTED               = 68,
        FMOD_ERR_VERSION                   = 69,
        FMOD_ERR_EVENT_ALREADY_LOADED      = 70,
        FMOD_ERR_EVENT_LIVEUPDATE_BUSY     = 71,
        FMOD_ERR_EVENT_LIVEUPDATE_MISMATCH = 72,
        FMOD_ERR_EVENT_LIVEUPDATE_TIMEOUT  = 73,
        FMOD_ERR_EVENT_NOTFOUND            = 74,
        FMOD_ERR_STUDIO_UNINITIALIZED      = 75,
        FMOD_ERR_STUDIO_NOT_LOADED         = 76,
        FMOD_ERR_INVALID_STRING            = 77,
        FMOD_ERR_ALREADY_LOCKED            = 78,
        FMOD_ERR_NOT_LOCKED                = 79,
        FMOD_ERR_RECORD_DISCONNECTED       = 80,
        FMOD_ERR_TOOMANYSAMPLES            = 81;

    /**
     * {@code FMOD_CHANNELCONTROL_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_CHANNELCONTROL_CHANNEL CHANNELCONTROL_CHANNEL}</li>
     * <li>{@link #FMOD_CHANNELCONTROL_CHANNELGROUP CHANNELCONTROL_CHANNELGROUP}</li>
     * <li>{@link #FMOD_CHANNELCONTROL_MAX CHANNELCONTROL_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_CHANNELCONTROL_CHANNEL      = 0,
        FMOD_CHANNELCONTROL_CHANNELGROUP = 1,
        FMOD_CHANNELCONTROL_MAX          = 2;

    /**
     * {@code FMOD_OUTPUTTYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_OUTPUTTYPE_AUTODETECT OUTPUTTYPE_AUTODETECT}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_UNKNOWN OUTPUTTYPE_UNKNOWN}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_NOSOUND OUTPUTTYPE_NOSOUND}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_WAVWRITER OUTPUTTYPE_WAVWRITER}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_NOSOUND_NRT OUTPUTTYPE_NOSOUND_NRT}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_WAVWRITER_NRT OUTPUTTYPE_WAVWRITER_NRT}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_WASAPI OUTPUTTYPE_WASAPI}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_ASIO OUTPUTTYPE_ASIO}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_PULSEAUDIO OUTPUTTYPE_PULSEAUDIO}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_ALSA OUTPUTTYPE_ALSA}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_COREAUDIO OUTPUTTYPE_COREAUDIO}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_AUDIOTRACK OUTPUTTYPE_AUDIOTRACK}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_OPENSL OUTPUTTYPE_OPENSL}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_AUDIOOUT OUTPUTTYPE_AUDIOOUT}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_AUDIO3D OUTPUTTYPE_AUDIO3D}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_WEBAUDIO OUTPUTTYPE_WEBAUDIO}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_NNAUDIO OUTPUTTYPE_NNAUDIO}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_WINSONIC OUTPUTTYPE_WINSONIC}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_AAUDIO OUTPUTTYPE_AAUDIO}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_AUDIOWORKLET OUTPUTTYPE_AUDIOWORKLET}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_PHASE OUTPUTTYPE_PHASE}</li>
     * <li>{@link #FMOD_OUTPUTTYPE_MAX OUTPUTTYPE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_OUTPUTTYPE_AUTODETECT    = 0,
        FMOD_OUTPUTTYPE_UNKNOWN       = 1,
        FMOD_OUTPUTTYPE_NOSOUND       = 2,
        FMOD_OUTPUTTYPE_WAVWRITER     = 3,
        FMOD_OUTPUTTYPE_NOSOUND_NRT   = 4,
        FMOD_OUTPUTTYPE_WAVWRITER_NRT = 5,
        FMOD_OUTPUTTYPE_WASAPI        = 6,
        FMOD_OUTPUTTYPE_ASIO          = 7,
        FMOD_OUTPUTTYPE_PULSEAUDIO    = 8,
        FMOD_OUTPUTTYPE_ALSA          = 9,
        FMOD_OUTPUTTYPE_COREAUDIO     = 10,
        FMOD_OUTPUTTYPE_AUDIOTRACK    = 11,
        FMOD_OUTPUTTYPE_OPENSL        = 12,
        FMOD_OUTPUTTYPE_AUDIOOUT      = 13,
        FMOD_OUTPUTTYPE_AUDIO3D       = 14,
        FMOD_OUTPUTTYPE_WEBAUDIO      = 15,
        FMOD_OUTPUTTYPE_NNAUDIO       = 16,
        FMOD_OUTPUTTYPE_WINSONIC      = 17,
        FMOD_OUTPUTTYPE_AAUDIO        = 18,
        FMOD_OUTPUTTYPE_AUDIOWORKLET  = 19,
        FMOD_OUTPUTTYPE_PHASE         = 20,
        FMOD_OUTPUTTYPE_MAX           = 21;

    /**
     * {@code FMOD_DEBUG_MODE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DEBUG_MODE_TTY DEBUG_MODE_TTY}</li>
     * <li>{@link #FMOD_DEBUG_MODE_FILE DEBUG_MODE_FILE}</li>
     * <li>{@link #FMOD_DEBUG_MODE_CALLBACK DEBUG_MODE_CALLBACK}</li>
     * </ul>
     */
    public static final int
        FMOD_DEBUG_MODE_TTY      = 0,
        FMOD_DEBUG_MODE_FILE     = 1,
        FMOD_DEBUG_MODE_CALLBACK = 2;

    /**
     * {@code FMOD_SPEAKERMODE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_SPEAKERMODE_DEFAULT SPEAKERMODE_DEFAULT}</li>
     * <li>{@link #FMOD_SPEAKERMODE_RAW SPEAKERMODE_RAW}</li>
     * <li>{@link #FMOD_SPEAKERMODE_MONO SPEAKERMODE_MONO}</li>
     * <li>{@link #FMOD_SPEAKERMODE_STEREO SPEAKERMODE_STEREO}</li>
     * <li>{@link #FMOD_SPEAKERMODE_QUAD SPEAKERMODE_QUAD}</li>
     * <li>{@link #FMOD_SPEAKERMODE_SURROUND SPEAKERMODE_SURROUND}</li>
     * <li>{@link #FMOD_SPEAKERMODE_5POINT1 SPEAKERMODE_5POINT1}</li>
     * <li>{@link #FMOD_SPEAKERMODE_7POINT1 SPEAKERMODE_7POINT1}</li>
     * <li>{@link #FMOD_SPEAKERMODE_7POINT1POINT4 SPEAKERMODE_7POINT1POINT4}</li>
     * <li>{@link #FMOD_SPEAKERMODE_MAX SPEAKERMODE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_SPEAKERMODE_DEFAULT       = 0,
        FMOD_SPEAKERMODE_RAW           = 1,
        FMOD_SPEAKERMODE_MONO          = 2,
        FMOD_SPEAKERMODE_STEREO        = 3,
        FMOD_SPEAKERMODE_QUAD          = 4,
        FMOD_SPEAKERMODE_SURROUND      = 5,
        FMOD_SPEAKERMODE_5POINT1       = 6,
        FMOD_SPEAKERMODE_7POINT1       = 7,
        FMOD_SPEAKERMODE_7POINT1POINT4 = 8,
        FMOD_SPEAKERMODE_MAX           = 9;

    /**
     * {@code FMOD_SPEAKER}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_SPEAKER_NONE SPEAKER_NONE}</li>
     * <li>{@link #FMOD_SPEAKER_FRONT_LEFT SPEAKER_FRONT_LEFT}</li>
     * <li>{@link #FMOD_SPEAKER_FRONT_RIGHT SPEAKER_FRONT_RIGHT}</li>
     * <li>{@link #FMOD_SPEAKER_FRONT_CENTER SPEAKER_FRONT_CENTER}</li>
     * <li>{@link #FMOD_SPEAKER_LOW_FREQUENCY SPEAKER_LOW_FREQUENCY}</li>
     * <li>{@link #FMOD_SPEAKER_SURROUND_LEFT SPEAKER_SURROUND_LEFT}</li>
     * <li>{@link #FMOD_SPEAKER_SURROUND_RIGHT SPEAKER_SURROUND_RIGHT}</li>
     * <li>{@link #FMOD_SPEAKER_BACK_LEFT SPEAKER_BACK_LEFT}</li>
     * <li>{@link #FMOD_SPEAKER_BACK_RIGHT SPEAKER_BACK_RIGHT}</li>
     * <li>{@link #FMOD_SPEAKER_TOP_FRONT_LEFT SPEAKER_TOP_FRONT_LEFT}</li>
     * <li>{@link #FMOD_SPEAKER_TOP_FRONT_RIGHT SPEAKER_TOP_FRONT_RIGHT}</li>
     * <li>{@link #FMOD_SPEAKER_TOP_BACK_LEFT SPEAKER_TOP_BACK_LEFT}</li>
     * <li>{@link #FMOD_SPEAKER_TOP_BACK_RIGHT SPEAKER_TOP_BACK_RIGHT}</li>
     * <li>{@link #FMOD_SPEAKER_MAX SPEAKER_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_SPEAKER_NONE            = -1,
        FMOD_SPEAKER_FRONT_LEFT      = 0,
        FMOD_SPEAKER_FRONT_RIGHT     = 1,
        FMOD_SPEAKER_FRONT_CENTER    = 2,
        FMOD_SPEAKER_LOW_FREQUENCY   = 3,
        FMOD_SPEAKER_SURROUND_LEFT   = 4,
        FMOD_SPEAKER_SURROUND_RIGHT  = 5,
        FMOD_SPEAKER_BACK_LEFT       = 6,
        FMOD_SPEAKER_BACK_RIGHT      = 7,
        FMOD_SPEAKER_TOP_FRONT_LEFT  = 8,
        FMOD_SPEAKER_TOP_FRONT_RIGHT = 9,
        FMOD_SPEAKER_TOP_BACK_LEFT   = 10,
        FMOD_SPEAKER_TOP_BACK_RIGHT  = 11,
        FMOD_SPEAKER_MAX             = 12;

    /**
     * {@code FMOD_CHANNELORDER}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_CHANNELORDER_DEFAULT CHANNELORDER_DEFAULT}</li>
     * <li>{@link #FMOD_CHANNELORDER_WAVEFORMAT CHANNELORDER_WAVEFORMAT}</li>
     * <li>{@link #FMOD_CHANNELORDER_PROTOOLS CHANNELORDER_PROTOOLS}</li>
     * <li>{@link #FMOD_CHANNELORDER_ALLMONO CHANNELORDER_ALLMONO}</li>
     * <li>{@link #FMOD_CHANNELORDER_ALLSTEREO CHANNELORDER_ALLSTEREO}</li>
     * <li>{@link #FMOD_CHANNELORDER_ALSA CHANNELORDER_ALSA}</li>
     * <li>{@link #FMOD_CHANNELORDER_MAX CHANNELORDER_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_CHANNELORDER_DEFAULT    = 0,
        FMOD_CHANNELORDER_WAVEFORMAT = 1,
        FMOD_CHANNELORDER_PROTOOLS   = 2,
        FMOD_CHANNELORDER_ALLMONO    = 3,
        FMOD_CHANNELORDER_ALLSTEREO  = 4,
        FMOD_CHANNELORDER_ALSA       = 5,
        FMOD_CHANNELORDER_MAX        = 6;

    /**
     * {@code FMOD_PLUGINTYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_PLUGINTYPE_OUTPUT PLUGINTYPE_OUTPUT}</li>
     * <li>{@link #FMOD_PLUGINTYPE_CODEC PLUGINTYPE_CODEC}</li>
     * <li>{@link #FMOD_PLUGINTYPE_DSP PLUGINTYPE_DSP}</li>
     * <li>{@link #FMOD_PLUGINTYPE_MAX PLUGINTYPE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_PLUGINTYPE_OUTPUT = 0,
        FMOD_PLUGINTYPE_CODEC  = 1,
        FMOD_PLUGINTYPE_DSP    = 2,
        FMOD_PLUGINTYPE_MAX    = 3;

    /**
     * {@code FMOD_SOUND_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_SOUND_TYPE_UNKNOWN SOUND_TYPE_UNKNOWN}</li>
     * <li>{@link #FMOD_SOUND_TYPE_AIFF SOUND_TYPE_AIFF}</li>
     * <li>{@link #FMOD_SOUND_TYPE_ASF SOUND_TYPE_ASF}</li>
     * <li>{@link #FMOD_SOUND_TYPE_DLS SOUND_TYPE_DLS}</li>
     * <li>{@link #FMOD_SOUND_TYPE_FLAC SOUND_TYPE_FLAC}</li>
     * <li>{@link #FMOD_SOUND_TYPE_FSB SOUND_TYPE_FSB}</li>
     * <li>{@link #FMOD_SOUND_TYPE_IT SOUND_TYPE_IT}</li>
     * <li>{@link #FMOD_SOUND_TYPE_MIDI SOUND_TYPE_MIDI}</li>
     * <li>{@link #FMOD_SOUND_TYPE_MOD SOUND_TYPE_MOD}</li>
     * <li>{@link #FMOD_SOUND_TYPE_MPEG SOUND_TYPE_MPEG}</li>
     * <li>{@link #FMOD_SOUND_TYPE_OGGVORBIS SOUND_TYPE_OGGVORBIS}</li>
     * <li>{@link #FMOD_SOUND_TYPE_PLAYLIST SOUND_TYPE_PLAYLIST}</li>
     * <li>{@link #FMOD_SOUND_TYPE_RAW SOUND_TYPE_RAW}</li>
     * <li>{@link #FMOD_SOUND_TYPE_S3M SOUND_TYPE_S3M}</li>
     * <li>{@link #FMOD_SOUND_TYPE_USER SOUND_TYPE_USER}</li>
     * <li>{@link #FMOD_SOUND_TYPE_WAV SOUND_TYPE_WAV}</li>
     * <li>{@link #FMOD_SOUND_TYPE_XM SOUND_TYPE_XM}</li>
     * <li>{@link #FMOD_SOUND_TYPE_XMA SOUND_TYPE_XMA}</li>
     * <li>{@link #FMOD_SOUND_TYPE_AUDIOQUEUE SOUND_TYPE_AUDIOQUEUE}</li>
     * <li>{@link #FMOD_SOUND_TYPE_AT9 SOUND_TYPE_AT9}</li>
     * <li>{@link #FMOD_SOUND_TYPE_VORBIS SOUND_TYPE_VORBIS}</li>
     * <li>{@link #FMOD_SOUND_TYPE_MEDIA_FOUNDATION SOUND_TYPE_MEDIA_FOUNDATION}</li>
     * <li>{@link #FMOD_SOUND_TYPE_MEDIACODEC SOUND_TYPE_MEDIACODEC}</li>
     * <li>{@link #FMOD_SOUND_TYPE_FADPCM SOUND_TYPE_FADPCM}</li>
     * <li>{@link #FMOD_SOUND_TYPE_OPUS SOUND_TYPE_OPUS}</li>
     * <li>{@link #FMOD_SOUND_TYPE_MAX SOUND_TYPE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_SOUND_TYPE_UNKNOWN          = 0,
        FMOD_SOUND_TYPE_AIFF             = 1,
        FMOD_SOUND_TYPE_ASF              = 2,
        FMOD_SOUND_TYPE_DLS              = 3,
        FMOD_SOUND_TYPE_FLAC             = 4,
        FMOD_SOUND_TYPE_FSB              = 5,
        FMOD_SOUND_TYPE_IT               = 6,
        FMOD_SOUND_TYPE_MIDI             = 7,
        FMOD_SOUND_TYPE_MOD              = 8,
        FMOD_SOUND_TYPE_MPEG             = 9,
        FMOD_SOUND_TYPE_OGGVORBIS        = 10,
        FMOD_SOUND_TYPE_PLAYLIST         = 11,
        FMOD_SOUND_TYPE_RAW              = 12,
        FMOD_SOUND_TYPE_S3M              = 13,
        FMOD_SOUND_TYPE_USER             = 14,
        FMOD_SOUND_TYPE_WAV              = 15,
        FMOD_SOUND_TYPE_XM               = 16,
        FMOD_SOUND_TYPE_XMA              = 17,
        FMOD_SOUND_TYPE_AUDIOQUEUE       = 18,
        FMOD_SOUND_TYPE_AT9              = 19,
        FMOD_SOUND_TYPE_VORBIS           = 20,
        FMOD_SOUND_TYPE_MEDIA_FOUNDATION = 21,
        FMOD_SOUND_TYPE_MEDIACODEC       = 22,
        FMOD_SOUND_TYPE_FADPCM           = 23,
        FMOD_SOUND_TYPE_OPUS             = 24,
        FMOD_SOUND_TYPE_MAX              = 25;

    /**
     * {@code FMOD_SOUND_FORMAT}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_SOUND_FORMAT_NONE SOUND_FORMAT_NONE}</li>
     * <li>{@link #FMOD_SOUND_FORMAT_PCM8 SOUND_FORMAT_PCM8}</li>
     * <li>{@link #FMOD_SOUND_FORMAT_PCM16 SOUND_FORMAT_PCM16}</li>
     * <li>{@link #FMOD_SOUND_FORMAT_PCM24 SOUND_FORMAT_PCM24}</li>
     * <li>{@link #FMOD_SOUND_FORMAT_PCM32 SOUND_FORMAT_PCM32}</li>
     * <li>{@link #FMOD_SOUND_FORMAT_PCMFLOAT SOUND_FORMAT_PCMFLOAT}</li>
     * <li>{@link #FMOD_SOUND_FORMAT_BITSTREAM SOUND_FORMAT_BITSTREAM}</li>
     * <li>{@link #FMOD_SOUND_FORMAT_MAX SOUND_FORMAT_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_SOUND_FORMAT_NONE      = 0,
        FMOD_SOUND_FORMAT_PCM8      = 1,
        FMOD_SOUND_FORMAT_PCM16     = 2,
        FMOD_SOUND_FORMAT_PCM24     = 3,
        FMOD_SOUND_FORMAT_PCM32     = 4,
        FMOD_SOUND_FORMAT_PCMFLOAT  = 5,
        FMOD_SOUND_FORMAT_BITSTREAM = 6,
        FMOD_SOUND_FORMAT_MAX       = 7;

    /**
     * {@code FMOD_OPENSTATE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_OPENSTATE_READY OPENSTATE_READY}</li>
     * <li>{@link #FMOD_OPENSTATE_LOADING OPENSTATE_LOADING}</li>
     * <li>{@link #FMOD_OPENSTATE_ERROR OPENSTATE_ERROR}</li>
     * <li>{@link #FMOD_OPENSTATE_CONNECTING OPENSTATE_CONNECTING}</li>
     * <li>{@link #FMOD_OPENSTATE_BUFFERING OPENSTATE_BUFFERING}</li>
     * <li>{@link #FMOD_OPENSTATE_SEEKING OPENSTATE_SEEKING}</li>
     * <li>{@link #FMOD_OPENSTATE_PLAYING OPENSTATE_PLAYING}</li>
     * <li>{@link #FMOD_OPENSTATE_SETPOSITION OPENSTATE_SETPOSITION}</li>
     * <li>{@link #FMOD_OPENSTATE_MAX OPENSTATE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_OPENSTATE_READY       = 0,
        FMOD_OPENSTATE_LOADING     = 1,
        FMOD_OPENSTATE_ERROR       = 2,
        FMOD_OPENSTATE_CONNECTING  = 3,
        FMOD_OPENSTATE_BUFFERING   = 4,
        FMOD_OPENSTATE_SEEKING     = 5,
        FMOD_OPENSTATE_PLAYING     = 6,
        FMOD_OPENSTATE_SETPOSITION = 7,
        FMOD_OPENSTATE_MAX         = 8;

    /**
     * {@code FMOD_SOUNDGROUP_BEHAVIOR}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_SOUNDGROUP_BEHAVIOR_FAIL SOUNDGROUP_BEHAVIOR_FAIL}</li>
     * <li>{@link #FMOD_SOUNDGROUP_BEHAVIOR_MUTE SOUNDGROUP_BEHAVIOR_MUTE}</li>
     * <li>{@link #FMOD_SOUNDGROUP_BEHAVIOR_STEALLOWEST SOUNDGROUP_BEHAVIOR_STEALLOWEST}</li>
     * <li>{@link #FMOD_SOUNDGROUP_BEHAVIOR_MAX SOUNDGROUP_BEHAVIOR_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_SOUNDGROUP_BEHAVIOR_FAIL        = 0,
        FMOD_SOUNDGROUP_BEHAVIOR_MUTE        = 1,
        FMOD_SOUNDGROUP_BEHAVIOR_STEALLOWEST = 2,
        FMOD_SOUNDGROUP_BEHAVIOR_MAX         = 3;

    /**
     * {@code FMOD_CHANNELCONTROL_CALLBACK_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_CHANNELCONTROL_CALLBACK_END CHANNELCONTROL_CALLBACK_END}</li>
     * <li>{@link #FMOD_CHANNELCONTROL_CALLBACK_VIRTUALVOICE CHANNELCONTROL_CALLBACK_VIRTUALVOICE}</li>
     * <li>{@link #FMOD_CHANNELCONTROL_CALLBACK_SYNCPOINT CHANNELCONTROL_CALLBACK_SYNCPOINT}</li>
     * <li>{@link #FMOD_CHANNELCONTROL_CALLBACK_OCCLUSION CHANNELCONTROL_CALLBACK_OCCLUSION}</li>
     * <li>{@link #FMOD_CHANNELCONTROL_CALLBACK_MAX CHANNELCONTROL_CALLBACK_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_CHANNELCONTROL_CALLBACK_END          = 0,
        FMOD_CHANNELCONTROL_CALLBACK_VIRTUALVOICE = 1,
        FMOD_CHANNELCONTROL_CALLBACK_SYNCPOINT    = 2,
        FMOD_CHANNELCONTROL_CALLBACK_OCCLUSION    = 3,
        FMOD_CHANNELCONTROL_CALLBACK_MAX          = 4;

    /**
     * {@code FMOD_CHANNELCONTROL_DSP_INDEX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_CHANNELCONTROL_DSP_HEAD CHANNELCONTROL_DSP_HEAD}</li>
     * <li>{@link #FMOD_CHANNELCONTROL_DSP_FADER CHANNELCONTROL_DSP_FADER}</li>
     * <li>{@link #FMOD_CHANNELCONTROL_DSP_TAIL CHANNELCONTROL_DSP_TAIL}</li>
     * </ul>
     */
    public static final int
        FMOD_CHANNELCONTROL_DSP_HEAD  = -1,
        FMOD_CHANNELCONTROL_DSP_FADER = -2,
        FMOD_CHANNELCONTROL_DSP_TAIL  = -3;

    /**
     * {@code FMOD_ERRORCALLBACK_INSTANCETYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_NONE ERRORCALLBACK_INSTANCETYPE_NONE}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_SYSTEM ERRORCALLBACK_INSTANCETYPE_SYSTEM}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNEL ERRORCALLBACK_INSTANCETYPE_CHANNEL}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNELGROUP ERRORCALLBACK_INSTANCETYPE_CHANNELGROUP}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNELCONTROL ERRORCALLBACK_INSTANCETYPE_CHANNELCONTROL}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_SOUND ERRORCALLBACK_INSTANCETYPE_SOUND}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_SOUNDGROUP ERRORCALLBACK_INSTANCETYPE_SOUNDGROUP}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_DSP ERRORCALLBACK_INSTANCETYPE_DSP}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_DSPCONNECTION ERRORCALLBACK_INSTANCETYPE_DSPCONNECTION}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_GEOMETRY ERRORCALLBACK_INSTANCETYPE_GEOMETRY}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_REVERB3D ERRORCALLBACK_INSTANCETYPE_REVERB3D}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_SYSTEM ERRORCALLBACK_INSTANCETYPE_STUDIO_SYSTEM}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTDESCRIPTION ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTDESCRIPTION}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTINSTANCE ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTINSTANCE}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_PARAMETERINSTANCE ERRORCALLBACK_INSTANCETYPE_STUDIO_PARAMETERINSTANCE}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_BUS ERRORCALLBACK_INSTANCETYPE_STUDIO_BUS}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_VCA ERRORCALLBACK_INSTANCETYPE_STUDIO_VCA}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_BANK ERRORCALLBACK_INSTANCETYPE_STUDIO_BANK}</li>
     * <li>{@link #FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_COMMANDREPLAY ERRORCALLBACK_INSTANCETYPE_STUDIO_COMMANDREPLAY}</li>
     * </ul>
     */
    public static final int
        FMOD_ERRORCALLBACK_INSTANCETYPE_NONE                     = 0,
        FMOD_ERRORCALLBACK_INSTANCETYPE_SYSTEM                   = 1,
        FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNEL                  = 2,
        FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNELGROUP             = 3,
        FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNELCONTROL           = 4,
        FMOD_ERRORCALLBACK_INSTANCETYPE_SOUND                    = 5,
        FMOD_ERRORCALLBACK_INSTANCETYPE_SOUNDGROUP               = 6,
        FMOD_ERRORCALLBACK_INSTANCETYPE_DSP                      = 7,
        FMOD_ERRORCALLBACK_INSTANCETYPE_DSPCONNECTION            = 8,
        FMOD_ERRORCALLBACK_INSTANCETYPE_GEOMETRY                 = 9,
        FMOD_ERRORCALLBACK_INSTANCETYPE_REVERB3D                 = 10,
        FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_SYSTEM            = 11,
        FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTDESCRIPTION  = 12,
        FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTINSTANCE     = 13,
        FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_PARAMETERINSTANCE = 14,
        FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_BUS               = 15,
        FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_VCA               = 16,
        FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_BANK              = 17,
        FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_COMMANDREPLAY     = 18;

    /**
     * {@code FMOD_DSP_RESAMPLER}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_RESAMPLER_DEFAULT DSP_RESAMPLER_DEFAULT}</li>
     * <li>{@link #FMOD_DSP_RESAMPLER_NOINTERP DSP_RESAMPLER_NOINTERP}</li>
     * <li>{@link #FMOD_DSP_RESAMPLER_LINEAR DSP_RESAMPLER_LINEAR}</li>
     * <li>{@link #FMOD_DSP_RESAMPLER_CUBIC DSP_RESAMPLER_CUBIC}</li>
     * <li>{@link #FMOD_DSP_RESAMPLER_SPLINE DSP_RESAMPLER_SPLINE}</li>
     * <li>{@link #FMOD_DSP_RESAMPLER_MAX DSP_RESAMPLER_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_RESAMPLER_DEFAULT  = 0,
        FMOD_DSP_RESAMPLER_NOINTERP = 1,
        FMOD_DSP_RESAMPLER_LINEAR   = 2,
        FMOD_DSP_RESAMPLER_CUBIC    = 3,
        FMOD_DSP_RESAMPLER_SPLINE   = 4,
        FMOD_DSP_RESAMPLER_MAX      = 5;

    /**
     * {@code FMOD_DSP_CALLBACK_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_CALLBACK_DATAPARAMETERRELEASE DSP_CALLBACK_DATAPARAMETERRELEASE}</li>
     * <li>{@link #FMOD_DSP_CALLBACK_MAX DSP_CALLBACK_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_CALLBACK_DATAPARAMETERRELEASE = 0,
        FMOD_DSP_CALLBACK_MAX                  = 1;

    /**
     * {@code FMOD_DSPCONNECTION_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSPCONNECTION_TYPE_STANDARD DSPCONNECTION_TYPE_STANDARD}</li>
     * <li>{@link #FMOD_DSPCONNECTION_TYPE_SIDECHAIN DSPCONNECTION_TYPE_SIDECHAIN}</li>
     * <li>{@link #FMOD_DSPCONNECTION_TYPE_SEND DSPCONNECTION_TYPE_SEND}</li>
     * <li>{@link #FMOD_DSPCONNECTION_TYPE_SEND_SIDECHAIN DSPCONNECTION_TYPE_SEND_SIDECHAIN}</li>
     * <li>{@link #FMOD_DSPCONNECTION_TYPE_MAX DSPCONNECTION_TYPE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_DSPCONNECTION_TYPE_STANDARD       = 0,
        FMOD_DSPCONNECTION_TYPE_SIDECHAIN      = 1,
        FMOD_DSPCONNECTION_TYPE_SEND           = 2,
        FMOD_DSPCONNECTION_TYPE_SEND_SIDECHAIN = 3,
        FMOD_DSPCONNECTION_TYPE_MAX            = 4;

    /**
     * {@code FMOD_TAGTYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_TAGTYPE_UNKNOWN TAGTYPE_UNKNOWN}</li>
     * <li>{@link #FMOD_TAGTYPE_ID3V1 TAGTYPE_ID3V1}</li>
     * <li>{@link #FMOD_TAGTYPE_ID3V2 TAGTYPE_ID3V2}</li>
     * <li>{@link #FMOD_TAGTYPE_VORBISCOMMENT TAGTYPE_VORBISCOMMENT}</li>
     * <li>{@link #FMOD_TAGTYPE_SHOUTCAST TAGTYPE_SHOUTCAST}</li>
     * <li>{@link #FMOD_TAGTYPE_ICECAST TAGTYPE_ICECAST}</li>
     * <li>{@link #FMOD_TAGTYPE_ASF TAGTYPE_ASF}</li>
     * <li>{@link #FMOD_TAGTYPE_MIDI TAGTYPE_MIDI}</li>
     * <li>{@link #FMOD_TAGTYPE_PLAYLIST TAGTYPE_PLAYLIST}</li>
     * <li>{@link #FMOD_TAGTYPE_FMOD TAGTYPE_FMOD}</li>
     * <li>{@link #FMOD_TAGTYPE_USER TAGTYPE_USER}</li>
     * <li>{@link #FMOD_TAGTYPE_MAX TAGTYPE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_TAGTYPE_UNKNOWN       = 0,
        FMOD_TAGTYPE_ID3V1         = 1,
        FMOD_TAGTYPE_ID3V2         = 2,
        FMOD_TAGTYPE_VORBISCOMMENT = 3,
        FMOD_TAGTYPE_SHOUTCAST     = 4,
        FMOD_TAGTYPE_ICECAST       = 5,
        FMOD_TAGTYPE_ASF           = 6,
        FMOD_TAGTYPE_MIDI          = 7,
        FMOD_TAGTYPE_PLAYLIST      = 8,
        FMOD_TAGTYPE_FMOD          = 9,
        FMOD_TAGTYPE_USER          = 10,
        FMOD_TAGTYPE_MAX           = 11;

    /**
     * {@code FMOD_TAGDATATYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_TAGDATATYPE_BINARY TAGDATATYPE_BINARY}</li>
     * <li>{@link #FMOD_TAGDATATYPE_INT TAGDATATYPE_INT}</li>
     * <li>{@link #FMOD_TAGDATATYPE_FLOAT TAGDATATYPE_FLOAT}</li>
     * <li>{@link #FMOD_TAGDATATYPE_STRING TAGDATATYPE_STRING}</li>
     * <li>{@link #FMOD_TAGDATATYPE_STRING_UTF16 TAGDATATYPE_STRING_UTF16}</li>
     * <li>{@link #FMOD_TAGDATATYPE_STRING_UTF16BE TAGDATATYPE_STRING_UTF16BE}</li>
     * <li>{@link #FMOD_TAGDATATYPE_STRING_UTF8 TAGDATATYPE_STRING_UTF8}</li>
     * <li>{@link #FMOD_TAGDATATYPE_MAX TAGDATATYPE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_TAGDATATYPE_BINARY         = 0,
        FMOD_TAGDATATYPE_INT            = 1,
        FMOD_TAGDATATYPE_FLOAT          = 2,
        FMOD_TAGDATATYPE_STRING         = 3,
        FMOD_TAGDATATYPE_STRING_UTF16   = 4,
        FMOD_TAGDATATYPE_STRING_UTF16BE = 5,
        FMOD_TAGDATATYPE_STRING_UTF8    = 6,
        FMOD_TAGDATATYPE_MAX            = 7;

    /**
     * {@code FMOD_PORT_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_PORT_TYPE_MUSIC PORT_TYPE_MUSIC}</li>
     * <li>{@link #FMOD_PORT_TYPE_COPYRIGHT_MUSIC PORT_TYPE_COPYRIGHT_MUSIC}</li>
     * <li>{@link #FMOD_PORT_TYPE_VOICE PORT_TYPE_VOICE}</li>
     * <li>{@link #FMOD_PORT_TYPE_CONTROLLER PORT_TYPE_CONTROLLER}</li>
     * <li>{@link #FMOD_PORT_TYPE_PERSONAL PORT_TYPE_PERSONAL}</li>
     * <li>{@link #FMOD_PORT_TYPE_VIBRATION PORT_TYPE_VIBRATION}</li>
     * <li>{@link #FMOD_PORT_TYPE_AUX PORT_TYPE_AUX}</li>
     * <li>{@link #FMOD_PORT_TYPE_MAX PORT_TYPE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_PORT_TYPE_MUSIC           = 0,
        FMOD_PORT_TYPE_COPYRIGHT_MUSIC = 1,
        FMOD_PORT_TYPE_VOICE           = 2,
        FMOD_PORT_TYPE_CONTROLLER      = 3,
        FMOD_PORT_TYPE_PERSONAL        = 4,
        FMOD_PORT_TYPE_VIBRATION       = 5,
        FMOD_PORT_TYPE_AUX             = 6,
        FMOD_PORT_TYPE_MAX             = 7;

    /**
     * {@code FMOD_DSP_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_TYPE_UNKNOWN DSP_TYPE_UNKNOWN}</li>
     * <li>{@link #FMOD_DSP_TYPE_MIXER DSP_TYPE_MIXER}</li>
     * <li>{@link #FMOD_DSP_TYPE_OSCILLATOR DSP_TYPE_OSCILLATOR}</li>
     * <li>{@link #FMOD_DSP_TYPE_LOWPASS DSP_TYPE_LOWPASS}</li>
     * <li>{@link #FMOD_DSP_TYPE_ITLOWPASS DSP_TYPE_ITLOWPASS}</li>
     * <li>{@link #FMOD_DSP_TYPE_HIGHPASS DSP_TYPE_HIGHPASS}</li>
     * <li>{@link #FMOD_DSP_TYPE_ECHO DSP_TYPE_ECHO}</li>
     * <li>{@link #FMOD_DSP_TYPE_FADER DSP_TYPE_FADER}</li>
     * <li>{@link #FMOD_DSP_TYPE_FLANGE DSP_TYPE_FLANGE}</li>
     * <li>{@link #FMOD_DSP_TYPE_DISTORTION DSP_TYPE_DISTORTION}</li>
     * <li>{@link #FMOD_DSP_TYPE_NORMALIZE DSP_TYPE_NORMALIZE}</li>
     * <li>{@link #FMOD_DSP_TYPE_LIMITER DSP_TYPE_LIMITER}</li>
     * <li>{@link #FMOD_DSP_TYPE_PARAMEQ DSP_TYPE_PARAMEQ}</li>
     * <li>{@link #FMOD_DSP_TYPE_PITCHSHIFT DSP_TYPE_PITCHSHIFT}</li>
     * <li>{@link #FMOD_DSP_TYPE_CHORUS DSP_TYPE_CHORUS}</li>
     * <li>{@link #FMOD_DSP_TYPE_VSTPLUGIN DSP_TYPE_VSTPLUGIN}</li>
     * <li>{@link #FMOD_DSP_TYPE_WINAMPPLUGIN DSP_TYPE_WINAMPPLUGIN}</li>
     * <li>{@link #FMOD_DSP_TYPE_ITECHO DSP_TYPE_ITECHO}</li>
     * <li>{@link #FMOD_DSP_TYPE_COMPRESSOR DSP_TYPE_COMPRESSOR}</li>
     * <li>{@link #FMOD_DSP_TYPE_SFXREVERB DSP_TYPE_SFXREVERB}</li>
     * <li>{@link #FMOD_DSP_TYPE_LOWPASS_SIMPLE DSP_TYPE_LOWPASS_SIMPLE}</li>
     * <li>{@link #FMOD_DSP_TYPE_DELAY DSP_TYPE_DELAY}</li>
     * <li>{@link #FMOD_DSP_TYPE_TREMOLO DSP_TYPE_TREMOLO}</li>
     * <li>{@link #FMOD_DSP_TYPE_LADSPAPLUGIN DSP_TYPE_LADSPAPLUGIN}</li>
     * <li>{@link #FMOD_DSP_TYPE_SEND DSP_TYPE_SEND}</li>
     * <li>{@link #FMOD_DSP_TYPE_RETURN DSP_TYPE_RETURN}</li>
     * <li>{@link #FMOD_DSP_TYPE_HIGHPASS_SIMPLE DSP_TYPE_HIGHPASS_SIMPLE}</li>
     * <li>{@link #FMOD_DSP_TYPE_PAN DSP_TYPE_PAN}</li>
     * <li>{@link #FMOD_DSP_TYPE_THREE_EQ DSP_TYPE_THREE_EQ}</li>
     * <li>{@link #FMOD_DSP_TYPE_FFT DSP_TYPE_FFT}</li>
     * <li>{@link #FMOD_DSP_TYPE_LOUDNESS_METER DSP_TYPE_LOUDNESS_METER}</li>
     * <li>{@link #FMOD_DSP_TYPE_ENVELOPEFOLLOWER DSP_TYPE_ENVELOPEFOLLOWER}</li>
     * <li>{@link #FMOD_DSP_TYPE_CONVOLUTIONREVERB DSP_TYPE_CONVOLUTIONREVERB}</li>
     * <li>{@link #FMOD_DSP_TYPE_CHANNELMIX DSP_TYPE_CHANNELMIX}</li>
     * <li>{@link #FMOD_DSP_TYPE_TRANSCEIVER DSP_TYPE_TRANSCEIVER}</li>
     * <li>{@link #FMOD_DSP_TYPE_OBJECTPAN DSP_TYPE_OBJECTPAN}</li>
     * <li>{@link #FMOD_DSP_TYPE_MULTIBAND_EQ DSP_TYPE_MULTIBAND_EQ}</li>
     * <li>{@link #FMOD_DSP_TYPE_MAX DSP_TYPE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_TYPE_UNKNOWN           = 0,
        FMOD_DSP_TYPE_MIXER             = 1,
        FMOD_DSP_TYPE_OSCILLATOR        = 2,
        FMOD_DSP_TYPE_LOWPASS           = 3,
        FMOD_DSP_TYPE_ITLOWPASS         = 4,
        FMOD_DSP_TYPE_HIGHPASS          = 5,
        FMOD_DSP_TYPE_ECHO              = 6,
        FMOD_DSP_TYPE_FADER             = 7,
        FMOD_DSP_TYPE_FLANGE            = 8,
        FMOD_DSP_TYPE_DISTORTION        = 9,
        FMOD_DSP_TYPE_NORMALIZE         = 10,
        FMOD_DSP_TYPE_LIMITER           = 11,
        FMOD_DSP_TYPE_PARAMEQ           = 12,
        FMOD_DSP_TYPE_PITCHSHIFT        = 13,
        FMOD_DSP_TYPE_CHORUS            = 14,
        FMOD_DSP_TYPE_VSTPLUGIN         = 15,
        FMOD_DSP_TYPE_WINAMPPLUGIN      = 16,
        FMOD_DSP_TYPE_ITECHO            = 17,
        FMOD_DSP_TYPE_COMPRESSOR        = 18,
        FMOD_DSP_TYPE_SFXREVERB         = 19,
        FMOD_DSP_TYPE_LOWPASS_SIMPLE    = 20,
        FMOD_DSP_TYPE_DELAY             = 21,
        FMOD_DSP_TYPE_TREMOLO           = 22,
        FMOD_DSP_TYPE_LADSPAPLUGIN      = 23,
        FMOD_DSP_TYPE_SEND              = 24,
        FMOD_DSP_TYPE_RETURN            = 25,
        FMOD_DSP_TYPE_HIGHPASS_SIMPLE   = 26,
        FMOD_DSP_TYPE_PAN               = 27,
        FMOD_DSP_TYPE_THREE_EQ          = 28,
        FMOD_DSP_TYPE_FFT               = 29,
        FMOD_DSP_TYPE_LOUDNESS_METER    = 30,
        FMOD_DSP_TYPE_ENVELOPEFOLLOWER  = 31,
        FMOD_DSP_TYPE_CONVOLUTIONREVERB = 32,
        FMOD_DSP_TYPE_CHANNELMIX        = 33,
        FMOD_DSP_TYPE_TRANSCEIVER       = 34,
        FMOD_DSP_TYPE_OBJECTPAN         = 35,
        FMOD_DSP_TYPE_MULTIBAND_EQ      = 36,
        FMOD_DSP_TYPE_MAX               = 37;

    /**
     * {@code FMOD_DSP_OSCILLATOR}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_OSCILLATOR_TYPE DSP_OSCILLATOR_TYPE}</li>
     * <li>{@link #FMOD_DSP_OSCILLATOR_RATE DSP_OSCILLATOR_RATE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_OSCILLATOR_TYPE = 0,
        FMOD_DSP_OSCILLATOR_RATE = 1;

    /**
     * {@code FMOD_DSP_LOWPASS}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_LOWPASS_CUTOFF DSP_LOWPASS_CUTOFF}</li>
     * <li>{@link #FMOD_DSP_LOWPASS_RESONANCE DSP_LOWPASS_RESONANCE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_LOWPASS_CUTOFF    = 0,
        FMOD_DSP_LOWPASS_RESONANCE = 1;

    /**
     * {@code FMOD_DSP_ITLOWPASS}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_ITLOWPASS_CUTOFF DSP_ITLOWPASS_CUTOFF}</li>
     * <li>{@link #FMOD_DSP_ITLOWPASS_RESONANCE DSP_ITLOWPASS_RESONANCE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_ITLOWPASS_CUTOFF    = 0,
        FMOD_DSP_ITLOWPASS_RESONANCE = 1;

    /**
     * {@code FMOD_DSP_HIGHPASS}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_HIGHPASS_CUTOFF DSP_HIGHPASS_CUTOFF}</li>
     * <li>{@link #FMOD_DSP_HIGHPASS_RESONANCE DSP_HIGHPASS_RESONANCE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_HIGHPASS_CUTOFF    = 0,
        FMOD_DSP_HIGHPASS_RESONANCE = 1;

    /**
     * {@code FMOD_DSP_ECHO}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_ECHO_DELAY DSP_ECHO_DELAY}</li>
     * <li>{@link #FMOD_DSP_ECHO_FEEDBACK DSP_ECHO_FEEDBACK}</li>
     * <li>{@link #FMOD_DSP_ECHO_DRYLEVEL DSP_ECHO_DRYLEVEL}</li>
     * <li>{@link #FMOD_DSP_ECHO_WETLEVEL DSP_ECHO_WETLEVEL}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_ECHO_DELAY    = 0,
        FMOD_DSP_ECHO_FEEDBACK = 1,
        FMOD_DSP_ECHO_DRYLEVEL = 2,
        FMOD_DSP_ECHO_WETLEVEL = 3;

    /**
     * {@code FMOD_DSP_FADER}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_FADER_GAIN DSP_FADER_GAIN}</li>
     * <li>{@link #FMOD_DSP_FADER_OVERALL_GAIN DSP_FADER_OVERALL_GAIN}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_FADER_GAIN         = 0,
        FMOD_DSP_FADER_OVERALL_GAIN = 1;

    /**
     * {@code FMOD_DSP_FLANGE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_FLANGE_MIX DSP_FLANGE_MIX}</li>
     * <li>{@link #FMOD_DSP_FLANGE_DEPTH DSP_FLANGE_DEPTH}</li>
     * <li>{@link #FMOD_DSP_FLANGE_RATE DSP_FLANGE_RATE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_FLANGE_MIX   = 0,
        FMOD_DSP_FLANGE_DEPTH = 1,
        FMOD_DSP_FLANGE_RATE  = 2;

    /** {@code FMOD_DSP_DISTORTION} */
    public static final int FMOD_DSP_DISTORTION_LEVEL = 0;

    /**
     * {@code FMOD_DSP_NORMALIZE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_NORMALIZE_FADETIME DSP_NORMALIZE_FADETIME}</li>
     * <li>{@link #FMOD_DSP_NORMALIZE_THRESHOLD DSP_NORMALIZE_THRESHOLD}</li>
     * <li>{@link #FMOD_DSP_NORMALIZE_MAXAMP DSP_NORMALIZE_MAXAMP}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_NORMALIZE_FADETIME  = 0,
        FMOD_DSP_NORMALIZE_THRESHOLD = 1,
        FMOD_DSP_NORMALIZE_MAXAMP    = 2;

    /**
     * {@code FMOD_DSP_LIMITER}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_LIMITER_RELEASETIME DSP_LIMITER_RELEASETIME}</li>
     * <li>{@link #FMOD_DSP_LIMITER_CEILING DSP_LIMITER_CEILING}</li>
     * <li>{@link #FMOD_DSP_LIMITER_MAXIMIZERGAIN DSP_LIMITER_MAXIMIZERGAIN}</li>
     * <li>{@link #FMOD_DSP_LIMITER_MODE DSP_LIMITER_MODE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_LIMITER_RELEASETIME   = 0,
        FMOD_DSP_LIMITER_CEILING       = 1,
        FMOD_DSP_LIMITER_MAXIMIZERGAIN = 2,
        FMOD_DSP_LIMITER_MODE          = 3;

    /**
     * {@code FMOD_DSP_PARAMEQ}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PARAMEQ_CENTER DSP_PARAMEQ_CENTER}</li>
     * <li>{@link #FMOD_DSP_PARAMEQ_BANDWIDTH DSP_PARAMEQ_BANDWIDTH}</li>
     * <li>{@link #FMOD_DSP_PARAMEQ_GAIN DSP_PARAMEQ_GAIN}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PARAMEQ_CENTER    = 0,
        FMOD_DSP_PARAMEQ_BANDWIDTH = 1,
        FMOD_DSP_PARAMEQ_GAIN      = 2;

    /**
     * {@code FMOD_DSP_MULTIBAND_EQ}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_A_FILTER DSP_MULTIBAND_EQ_A_FILTER}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_A_FREQUENCY DSP_MULTIBAND_EQ_A_FREQUENCY}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_A_Q DSP_MULTIBAND_EQ_A_Q}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_A_GAIN DSP_MULTIBAND_EQ_A_GAIN}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_B_FILTER DSP_MULTIBAND_EQ_B_FILTER}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_B_FREQUENCY DSP_MULTIBAND_EQ_B_FREQUENCY}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_B_Q DSP_MULTIBAND_EQ_B_Q}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_B_GAIN DSP_MULTIBAND_EQ_B_GAIN}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_C_FILTER DSP_MULTIBAND_EQ_C_FILTER}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_C_FREQUENCY DSP_MULTIBAND_EQ_C_FREQUENCY}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_C_Q DSP_MULTIBAND_EQ_C_Q}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_C_GAIN DSP_MULTIBAND_EQ_C_GAIN}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_D_FILTER DSP_MULTIBAND_EQ_D_FILTER}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_D_FREQUENCY DSP_MULTIBAND_EQ_D_FREQUENCY}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_D_Q DSP_MULTIBAND_EQ_D_Q}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_D_GAIN DSP_MULTIBAND_EQ_D_GAIN}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_E_FILTER DSP_MULTIBAND_EQ_E_FILTER}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_E_FREQUENCY DSP_MULTIBAND_EQ_E_FREQUENCY}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_E_Q DSP_MULTIBAND_EQ_E_Q}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_E_GAIN DSP_MULTIBAND_EQ_E_GAIN}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_MULTIBAND_EQ_A_FILTER    = 0,
        FMOD_DSP_MULTIBAND_EQ_A_FREQUENCY = 1,
        FMOD_DSP_MULTIBAND_EQ_A_Q         = 2,
        FMOD_DSP_MULTIBAND_EQ_A_GAIN      = 3,
        FMOD_DSP_MULTIBAND_EQ_B_FILTER    = 4,
        FMOD_DSP_MULTIBAND_EQ_B_FREQUENCY = 5,
        FMOD_DSP_MULTIBAND_EQ_B_Q         = 6,
        FMOD_DSP_MULTIBAND_EQ_B_GAIN      = 7,
        FMOD_DSP_MULTIBAND_EQ_C_FILTER    = 8,
        FMOD_DSP_MULTIBAND_EQ_C_FREQUENCY = 9,
        FMOD_DSP_MULTIBAND_EQ_C_Q         = 10,
        FMOD_DSP_MULTIBAND_EQ_C_GAIN      = 11,
        FMOD_DSP_MULTIBAND_EQ_D_FILTER    = 12,
        FMOD_DSP_MULTIBAND_EQ_D_FREQUENCY = 13,
        FMOD_DSP_MULTIBAND_EQ_D_Q         = 14,
        FMOD_DSP_MULTIBAND_EQ_D_GAIN      = 15,
        FMOD_DSP_MULTIBAND_EQ_E_FILTER    = 16,
        FMOD_DSP_MULTIBAND_EQ_E_FREQUENCY = 17,
        FMOD_DSP_MULTIBAND_EQ_E_Q         = 18,
        FMOD_DSP_MULTIBAND_EQ_E_GAIN      = 19;

    /**
     * {@code FMOD_DSP_MULTIBAND_EQ_FILTER_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_DISABLED DSP_MULTIBAND_EQ_FILTER_DISABLED}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_LOWPASS_12DB DSP_MULTIBAND_EQ_FILTER_LOWPASS_12DB}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_LOWPASS_24DB DSP_MULTIBAND_EQ_FILTER_LOWPASS_24DB}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_LOWPASS_48DB DSP_MULTIBAND_EQ_FILTER_LOWPASS_48DB}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_HIGHPASS_12DB DSP_MULTIBAND_EQ_FILTER_HIGHPASS_12DB}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_HIGHPASS_24DB DSP_MULTIBAND_EQ_FILTER_HIGHPASS_24DB}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_HIGHPASS_48DB DSP_MULTIBAND_EQ_FILTER_HIGHPASS_48DB}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_LOWSHELF DSP_MULTIBAND_EQ_FILTER_LOWSHELF}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_HIGHSHELF DSP_MULTIBAND_EQ_FILTER_HIGHSHELF}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_PEAKING DSP_MULTIBAND_EQ_FILTER_PEAKING}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_BANDPASS DSP_MULTIBAND_EQ_FILTER_BANDPASS}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_NOTCH DSP_MULTIBAND_EQ_FILTER_NOTCH}</li>
     * <li>{@link #FMOD_DSP_MULTIBAND_EQ_FILTER_ALLPASS DSP_MULTIBAND_EQ_FILTER_ALLPASS}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_MULTIBAND_EQ_FILTER_DISABLED      = 0,
        FMOD_DSP_MULTIBAND_EQ_FILTER_LOWPASS_12DB  = 1,
        FMOD_DSP_MULTIBAND_EQ_FILTER_LOWPASS_24DB  = 2,
        FMOD_DSP_MULTIBAND_EQ_FILTER_LOWPASS_48DB  = 3,
        FMOD_DSP_MULTIBAND_EQ_FILTER_HIGHPASS_12DB = 4,
        FMOD_DSP_MULTIBAND_EQ_FILTER_HIGHPASS_24DB = 5,
        FMOD_DSP_MULTIBAND_EQ_FILTER_HIGHPASS_48DB = 6,
        FMOD_DSP_MULTIBAND_EQ_FILTER_LOWSHELF      = 7,
        FMOD_DSP_MULTIBAND_EQ_FILTER_HIGHSHELF     = 8,
        FMOD_DSP_MULTIBAND_EQ_FILTER_PEAKING       = 9,
        FMOD_DSP_MULTIBAND_EQ_FILTER_BANDPASS      = 10,
        FMOD_DSP_MULTIBAND_EQ_FILTER_NOTCH         = 11,
        FMOD_DSP_MULTIBAND_EQ_FILTER_ALLPASS       = 12;

    /**
     * {@code FMOD_DSP_PITCHSHIFT}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PITCHSHIFT_PITCH DSP_PITCHSHIFT_PITCH}</li>
     * <li>{@link #FMOD_DSP_PITCHSHIFT_FFTSIZE DSP_PITCHSHIFT_FFTSIZE}</li>
     * <li>{@link #FMOD_DSP_PITCHSHIFT_OVERLAP DSP_PITCHSHIFT_OVERLAP}</li>
     * <li>{@link #FMOD_DSP_PITCHSHIFT_MAXCHANNELS DSP_PITCHSHIFT_MAXCHANNELS}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PITCHSHIFT_PITCH       = 0,
        FMOD_DSP_PITCHSHIFT_FFTSIZE     = 1,
        FMOD_DSP_PITCHSHIFT_OVERLAP     = 2,
        FMOD_DSP_PITCHSHIFT_MAXCHANNELS = 3;

    /**
     * {@code FMOD_DSP_CHORUS}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_CHORUS_MIX DSP_CHORUS_MIX}</li>
     * <li>{@link #FMOD_DSP_CHORUS_RATE DSP_CHORUS_RATE}</li>
     * <li>{@link #FMOD_DSP_CHORUS_DEPTH DSP_CHORUS_DEPTH}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_CHORUS_MIX   = 0,
        FMOD_DSP_CHORUS_RATE  = 1,
        FMOD_DSP_CHORUS_DEPTH = 2;

    /**
     * {@code FMOD_DSP_ITECHO}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_ITECHO_WETDRYMIX DSP_ITECHO_WETDRYMIX}</li>
     * <li>{@link #FMOD_DSP_ITECHO_FEEDBACK DSP_ITECHO_FEEDBACK}</li>
     * <li>{@link #FMOD_DSP_ITECHO_LEFTDELAY DSP_ITECHO_LEFTDELAY}</li>
     * <li>{@link #FMOD_DSP_ITECHO_RIGHTDELAY DSP_ITECHO_RIGHTDELAY}</li>
     * <li>{@link #FMOD_DSP_ITECHO_PANDELAY DSP_ITECHO_PANDELAY}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_ITECHO_WETDRYMIX  = 0,
        FMOD_DSP_ITECHO_FEEDBACK   = 1,
        FMOD_DSP_ITECHO_LEFTDELAY  = 2,
        FMOD_DSP_ITECHO_RIGHTDELAY = 3,
        FMOD_DSP_ITECHO_PANDELAY   = 4;

    /**
     * {@code FMOD_DSP_COMPRESSOR}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_COMPRESSOR_THRESHOLD DSP_COMPRESSOR_THRESHOLD}</li>
     * <li>{@link #FMOD_DSP_COMPRESSOR_RATIO DSP_COMPRESSOR_RATIO}</li>
     * <li>{@link #FMOD_DSP_COMPRESSOR_ATTACK DSP_COMPRESSOR_ATTACK}</li>
     * <li>{@link #FMOD_DSP_COMPRESSOR_RELEASE DSP_COMPRESSOR_RELEASE}</li>
     * <li>{@link #FMOD_DSP_COMPRESSOR_GAINMAKEUP DSP_COMPRESSOR_GAINMAKEUP}</li>
     * <li>{@link #FMOD_DSP_COMPRESSOR_USESIDECHAIN DSP_COMPRESSOR_USESIDECHAIN}</li>
     * <li>{@link #FMOD_DSP_COMPRESSOR_LINKED DSP_COMPRESSOR_LINKED}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_COMPRESSOR_THRESHOLD    = 0,
        FMOD_DSP_COMPRESSOR_RATIO        = 1,
        FMOD_DSP_COMPRESSOR_ATTACK       = 2,
        FMOD_DSP_COMPRESSOR_RELEASE      = 3,
        FMOD_DSP_COMPRESSOR_GAINMAKEUP   = 4,
        FMOD_DSP_COMPRESSOR_USESIDECHAIN = 5,
        FMOD_DSP_COMPRESSOR_LINKED       = 6;

    /**
     * {@code FMOD_DSP_SFXREVERB}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_SFXREVERB_DECAYTIME DSP_SFXREVERB_DECAYTIME}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_EARLYDELAY DSP_SFXREVERB_EARLYDELAY}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_LATEDELAY DSP_SFXREVERB_LATEDELAY}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_HFREFERENCE DSP_SFXREVERB_HFREFERENCE}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_HFDECAYRATIO DSP_SFXREVERB_HFDECAYRATIO}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_DIFFUSION DSP_SFXREVERB_DIFFUSION}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_DENSITY DSP_SFXREVERB_DENSITY}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_LOWSHELFFREQUENCY DSP_SFXREVERB_LOWSHELFFREQUENCY}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_LOWSHELFGAIN DSP_SFXREVERB_LOWSHELFGAIN}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_HIGHCUT DSP_SFXREVERB_HIGHCUT}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_EARLYLATEMIX DSP_SFXREVERB_EARLYLATEMIX}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_WETLEVEL DSP_SFXREVERB_WETLEVEL}</li>
     * <li>{@link #FMOD_DSP_SFXREVERB_DRYLEVEL DSP_SFXREVERB_DRYLEVEL}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_SFXREVERB_DECAYTIME         = 0,
        FMOD_DSP_SFXREVERB_EARLYDELAY        = 1,
        FMOD_DSP_SFXREVERB_LATEDELAY         = 2,
        FMOD_DSP_SFXREVERB_HFREFERENCE       = 3,
        FMOD_DSP_SFXREVERB_HFDECAYRATIO      = 4,
        FMOD_DSP_SFXREVERB_DIFFUSION         = 5,
        FMOD_DSP_SFXREVERB_DENSITY           = 6,
        FMOD_DSP_SFXREVERB_LOWSHELFFREQUENCY = 7,
        FMOD_DSP_SFXREVERB_LOWSHELFGAIN      = 8,
        FMOD_DSP_SFXREVERB_HIGHCUT           = 9,
        FMOD_DSP_SFXREVERB_EARLYLATEMIX      = 10,
        FMOD_DSP_SFXREVERB_WETLEVEL          = 11,
        FMOD_DSP_SFXREVERB_DRYLEVEL          = 12;

    /** {@code FMOD_DSP_LOWPASS_SIMPLE} */
    public static final int FMOD_DSP_LOWPASS_SIMPLE_CUTOFF = 0;

    /**
     * {@code FMOD_DSP_DELAY}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_DELAY_CH0 DSP_DELAY_CH0}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH1 DSP_DELAY_CH1}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH2 DSP_DELAY_CH2}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH3 DSP_DELAY_CH3}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH4 DSP_DELAY_CH4}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH5 DSP_DELAY_CH5}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH6 DSP_DELAY_CH6}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH7 DSP_DELAY_CH7}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH8 DSP_DELAY_CH8}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH9 DSP_DELAY_CH9}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH10 DSP_DELAY_CH10}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH11 DSP_DELAY_CH11}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH12 DSP_DELAY_CH12}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH13 DSP_DELAY_CH13}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH14 DSP_DELAY_CH14}</li>
     * <li>{@link #FMOD_DSP_DELAY_CH15 DSP_DELAY_CH15}</li>
     * <li>{@link #FMOD_DSP_DELAY_MAXDELAY DSP_DELAY_MAXDELAY}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_DELAY_CH0      = 0,
        FMOD_DSP_DELAY_CH1      = 1,
        FMOD_DSP_DELAY_CH2      = 2,
        FMOD_DSP_DELAY_CH3      = 3,
        FMOD_DSP_DELAY_CH4      = 4,
        FMOD_DSP_DELAY_CH5      = 5,
        FMOD_DSP_DELAY_CH6      = 6,
        FMOD_DSP_DELAY_CH7      = 7,
        FMOD_DSP_DELAY_CH8      = 8,
        FMOD_DSP_DELAY_CH9      = 9,
        FMOD_DSP_DELAY_CH10     = 10,
        FMOD_DSP_DELAY_CH11     = 11,
        FMOD_DSP_DELAY_CH12     = 12,
        FMOD_DSP_DELAY_CH13     = 13,
        FMOD_DSP_DELAY_CH14     = 14,
        FMOD_DSP_DELAY_CH15     = 15,
        FMOD_DSP_DELAY_MAXDELAY = 16;

    /**
     * {@code FMOD_DSP_TREMOLO}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_TREMOLO_FREQUENCY DSP_TREMOLO_FREQUENCY}</li>
     * <li>{@link #FMOD_DSP_TREMOLO_DEPTH DSP_TREMOLO_DEPTH}</li>
     * <li>{@link #FMOD_DSP_TREMOLO_SHAPE DSP_TREMOLO_SHAPE}</li>
     * <li>{@link #FMOD_DSP_TREMOLO_SKEW DSP_TREMOLO_SKEW}</li>
     * <li>{@link #FMOD_DSP_TREMOLO_DUTY DSP_TREMOLO_DUTY}</li>
     * <li>{@link #FMOD_DSP_TREMOLO_SQUARE DSP_TREMOLO_SQUARE}</li>
     * <li>{@link #FMOD_DSP_TREMOLO_PHASE DSP_TREMOLO_PHASE}</li>
     * <li>{@link #FMOD_DSP_TREMOLO_SPREAD DSP_TREMOLO_SPREAD}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_TREMOLO_FREQUENCY = 0,
        FMOD_DSP_TREMOLO_DEPTH     = 1,
        FMOD_DSP_TREMOLO_SHAPE     = 2,
        FMOD_DSP_TREMOLO_SKEW      = 3,
        FMOD_DSP_TREMOLO_DUTY      = 4,
        FMOD_DSP_TREMOLO_SQUARE    = 5,
        FMOD_DSP_TREMOLO_PHASE     = 6,
        FMOD_DSP_TREMOLO_SPREAD    = 7;

    /**
     * {@code FMOD_DSP_SEND}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_SEND_RETURNID DSP_SEND_RETURNID}</li>
     * <li>{@link #FMOD_DSP_SEND_LEVEL DSP_SEND_LEVEL}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_SEND_RETURNID = 0,
        FMOD_DSP_SEND_LEVEL    = 1;

    /**
     * {@code FMOD_DSP_RETURN}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_RETURN_ID DSP_RETURN_ID}</li>
     * <li>{@link #FMOD_DSP_RETURN_INPUT_SPEAKER_MODE DSP_RETURN_INPUT_SPEAKER_MODE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_RETURN_ID                 = 0,
        FMOD_DSP_RETURN_INPUT_SPEAKER_MODE = 1;

    /** {@code FMOD_DSP_HIGHPASS_SIMPLE} */
    public static final int FMOD_DSP_HIGHPASS_SIMPLE_CUTOFF = 0;

    /**
     * {@code FMOD_DSP_PAN_2D_STEREO_MODE_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PAN_2D_STEREO_MODE_DISTRIBUTED DSP_PAN_2D_STEREO_MODE_DISTRIBUTED}</li>
     * <li>{@link #FMOD_DSP_PAN_2D_STEREO_MODE_DISCRETE DSP_PAN_2D_STEREO_MODE_DISCRETE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PAN_2D_STEREO_MODE_DISTRIBUTED = 0,
        FMOD_DSP_PAN_2D_STEREO_MODE_DISCRETE    = 1;

    /**
     * {@code FMOD_DSP_PAN_MODE_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PAN_MODE_MONO DSP_PAN_MODE_MONO}</li>
     * <li>{@link #FMOD_DSP_PAN_MODE_STEREO DSP_PAN_MODE_STEREO}</li>
     * <li>{@link #FMOD_DSP_PAN_MODE_SURROUND DSP_PAN_MODE_SURROUND}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PAN_MODE_MONO     = 0,
        FMOD_DSP_PAN_MODE_STEREO   = 1,
        FMOD_DSP_PAN_MODE_SURROUND = 2;

    /**
     * {@code FMOD_DSP_PAN_3D_ROLLOFF_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PAN_3D_ROLLOFF_LINEARSQUARED DSP_PAN_3D_ROLLOFF_LINEARSQUARED}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_ROLLOFF_LINEAR DSP_PAN_3D_ROLLOFF_LINEAR}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_ROLLOFF_INVERSE DSP_PAN_3D_ROLLOFF_INVERSE}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_ROLLOFF_INVERSETAPERED DSP_PAN_3D_ROLLOFF_INVERSETAPERED}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_ROLLOFF_CUSTOM DSP_PAN_3D_ROLLOFF_CUSTOM}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PAN_3D_ROLLOFF_LINEARSQUARED  = 0,
        FMOD_DSP_PAN_3D_ROLLOFF_LINEAR         = 1,
        FMOD_DSP_PAN_3D_ROLLOFF_INVERSE        = 2,
        FMOD_DSP_PAN_3D_ROLLOFF_INVERSETAPERED = 3,
        FMOD_DSP_PAN_3D_ROLLOFF_CUSTOM         = 4;

    /**
     * {@code FMOD_DSP_PAN_3D_EXTENT_MODE_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PAN_3D_EXTENT_MODE_AUTO DSP_PAN_3D_EXTENT_MODE_AUTO}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_EXTENT_MODE_USER DSP_PAN_3D_EXTENT_MODE_USER}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_EXTENT_MODE_OFF DSP_PAN_3D_EXTENT_MODE_OFF}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PAN_3D_EXTENT_MODE_AUTO = 0,
        FMOD_DSP_PAN_3D_EXTENT_MODE_USER = 1,
        FMOD_DSP_PAN_3D_EXTENT_MODE_OFF  = 2;

    /**
     * {@code FMOD_DSP_PAN}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PAN_MODE DSP_PAN_MODE}</li>
     * <li>{@link #FMOD_DSP_PAN_2D_STEREO_POSITION DSP_PAN_2D_STEREO_POSITION}</li>
     * <li>{@link #FMOD_DSP_PAN_2D_DIRECTION DSP_PAN_2D_DIRECTION}</li>
     * <li>{@link #FMOD_DSP_PAN_2D_EXTENT DSP_PAN_2D_EXTENT}</li>
     * <li>{@link #FMOD_DSP_PAN_2D_ROTATION DSP_PAN_2D_ROTATION}</li>
     * <li>{@link #FMOD_DSP_PAN_2D_LFE_LEVEL DSP_PAN_2D_LFE_LEVEL}</li>
     * <li>{@link #FMOD_DSP_PAN_2D_STEREO_MODE DSP_PAN_2D_STEREO_MODE}</li>
     * <li>{@link #FMOD_DSP_PAN_2D_STEREO_SEPARATION DSP_PAN_2D_STEREO_SEPARATION}</li>
     * <li>{@link #FMOD_DSP_PAN_2D_STEREO_AXIS DSP_PAN_2D_STEREO_AXIS}</li>
     * <li>{@link #FMOD_DSP_PAN_ENABLED_SPEAKERS DSP_PAN_ENABLED_SPEAKERS}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_POSITION DSP_PAN_3D_POSITION}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_ROLLOFF DSP_PAN_3D_ROLLOFF}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_MIN_DISTANCE DSP_PAN_3D_MIN_DISTANCE}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_MAX_DISTANCE DSP_PAN_3D_MAX_DISTANCE}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_EXTENT_MODE DSP_PAN_3D_EXTENT_MODE}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_SOUND_SIZE DSP_PAN_3D_SOUND_SIZE}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_MIN_EXTENT DSP_PAN_3D_MIN_EXTENT}</li>
     * <li>{@link #FMOD_DSP_PAN_3D_PAN_BLEND DSP_PAN_3D_PAN_BLEND}</li>
     * <li>{@link #FMOD_DSP_PAN_LFE_UPMIX_ENABLED DSP_PAN_LFE_UPMIX_ENABLED}</li>
     * <li>{@link #FMOD_DSP_PAN_OVERALL_GAIN DSP_PAN_OVERALL_GAIN}</li>
     * <li>{@link #FMOD_DSP_PAN_SURROUND_SPEAKER_MODE DSP_PAN_SURROUND_SPEAKER_MODE}</li>
     * <li>{@link #FMOD_DSP_PAN_2D_HEIGHT_BLEND DSP_PAN_2D_HEIGHT_BLEND}</li>
     * <li>{@link #FMOD_DSP_PAN_ATTENUATION_RANGE DSP_PAN_ATTENUATION_RANGE}</li>
     * <li>{@link #FMOD_DSP_PAN_OVERRIDE_RANGE DSP_PAN_OVERRIDE_RANGE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PAN_MODE                  = 0,
        FMOD_DSP_PAN_2D_STEREO_POSITION    = 1,
        FMOD_DSP_PAN_2D_DIRECTION          = 2,
        FMOD_DSP_PAN_2D_EXTENT             = 3,
        FMOD_DSP_PAN_2D_ROTATION           = 4,
        FMOD_DSP_PAN_2D_LFE_LEVEL          = 5,
        FMOD_DSP_PAN_2D_STEREO_MODE        = 6,
        FMOD_DSP_PAN_2D_STEREO_SEPARATION  = 7,
        FMOD_DSP_PAN_2D_STEREO_AXIS        = 8,
        FMOD_DSP_PAN_ENABLED_SPEAKERS      = 9,
        FMOD_DSP_PAN_3D_POSITION           = 10,
        FMOD_DSP_PAN_3D_ROLLOFF            = 11,
        FMOD_DSP_PAN_3D_MIN_DISTANCE       = 12,
        FMOD_DSP_PAN_3D_MAX_DISTANCE       = 13,
        FMOD_DSP_PAN_3D_EXTENT_MODE        = 14,
        FMOD_DSP_PAN_3D_SOUND_SIZE         = 15,
        FMOD_DSP_PAN_3D_MIN_EXTENT         = 16,
        FMOD_DSP_PAN_3D_PAN_BLEND          = 17,
        FMOD_DSP_PAN_LFE_UPMIX_ENABLED     = 18,
        FMOD_DSP_PAN_OVERALL_GAIN          = 19,
        FMOD_DSP_PAN_SURROUND_SPEAKER_MODE = 20,
        FMOD_DSP_PAN_2D_HEIGHT_BLEND       = 21,
        FMOD_DSP_PAN_ATTENUATION_RANGE     = 22,
        FMOD_DSP_PAN_OVERRIDE_RANGE        = 23;

    /**
     * {@code FMOD_DSP_THREE_EQ_CROSSOVERSLOPE_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_THREE_EQ_CROSSOVERSLOPE_12DB DSP_THREE_EQ_CROSSOVERSLOPE_12DB}</li>
     * <li>{@link #FMOD_DSP_THREE_EQ_CROSSOVERSLOPE_24DB DSP_THREE_EQ_CROSSOVERSLOPE_24DB}</li>
     * <li>{@link #FMOD_DSP_THREE_EQ_CROSSOVERSLOPE_48DB DSP_THREE_EQ_CROSSOVERSLOPE_48DB}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_THREE_EQ_CROSSOVERSLOPE_12DB = 0,
        FMOD_DSP_THREE_EQ_CROSSOVERSLOPE_24DB = 1,
        FMOD_DSP_THREE_EQ_CROSSOVERSLOPE_48DB = 2;

    /**
     * {@code FMOD_DSP_THREE_EQ}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_THREE_EQ_LOWGAIN DSP_THREE_EQ_LOWGAIN}</li>
     * <li>{@link #FMOD_DSP_THREE_EQ_MIDGAIN DSP_THREE_EQ_MIDGAIN}</li>
     * <li>{@link #FMOD_DSP_THREE_EQ_HIGHGAIN DSP_THREE_EQ_HIGHGAIN}</li>
     * <li>{@link #FMOD_DSP_THREE_EQ_LOWCROSSOVER DSP_THREE_EQ_LOWCROSSOVER}</li>
     * <li>{@link #FMOD_DSP_THREE_EQ_HIGHCROSSOVER DSP_THREE_EQ_HIGHCROSSOVER}</li>
     * <li>{@link #FMOD_DSP_THREE_EQ_CROSSOVERSLOPE DSP_THREE_EQ_CROSSOVERSLOPE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_THREE_EQ_LOWGAIN        = 0,
        FMOD_DSP_THREE_EQ_MIDGAIN        = 1,
        FMOD_DSP_THREE_EQ_HIGHGAIN       = 2,
        FMOD_DSP_THREE_EQ_LOWCROSSOVER   = 3,
        FMOD_DSP_THREE_EQ_HIGHCROSSOVER  = 4,
        FMOD_DSP_THREE_EQ_CROSSOVERSLOPE = 5;

    /**
     * {@code FMOD_DSP_FFT_WINDOW}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_FFT_WINDOW_RECT DSP_FFT_WINDOW_RECT}</li>
     * <li>{@link #FMOD_DSP_FFT_WINDOW_TRIANGLE DSP_FFT_WINDOW_TRIANGLE}</li>
     * <li>{@link #FMOD_DSP_FFT_WINDOW_HAMMING DSP_FFT_WINDOW_HAMMING}</li>
     * <li>{@link #FMOD_DSP_FFT_WINDOW_HANNING DSP_FFT_WINDOW_HANNING}</li>
     * <li>{@link #FMOD_DSP_FFT_WINDOW_BLACKMAN DSP_FFT_WINDOW_BLACKMAN}</li>
     * <li>{@link #FMOD_DSP_FFT_WINDOW_BLACKMANHARRIS DSP_FFT_WINDOW_BLACKMANHARRIS}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_FFT_WINDOW_RECT           = 0,
        FMOD_DSP_FFT_WINDOW_TRIANGLE       = 1,
        FMOD_DSP_FFT_WINDOW_HAMMING        = 2,
        FMOD_DSP_FFT_WINDOW_HANNING        = 3,
        FMOD_DSP_FFT_WINDOW_BLACKMAN       = 4,
        FMOD_DSP_FFT_WINDOW_BLACKMANHARRIS = 5;

    /**
     * {@code FMOD_DSP_FFT}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_FFT_WINDOWSIZE DSP_FFT_WINDOWSIZE}</li>
     * <li>{@link #FMOD_DSP_FFT_WINDOWTYPE DSP_FFT_WINDOWTYPE}</li>
     * <li>{@link #FMOD_DSP_FFT_SPECTRUMDATA DSP_FFT_SPECTRUMDATA}</li>
     * <li>{@link #FMOD_DSP_FFT_DOMINANT_FREQ DSP_FFT_DOMINANT_FREQ}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_FFT_WINDOWSIZE    = 0,
        FMOD_DSP_FFT_WINDOWTYPE    = 1,
        FMOD_DSP_FFT_SPECTRUMDATA  = 2,
        FMOD_DSP_FFT_DOMINANT_FREQ = 3;

    /**
     * {@code FMOD_DSP_LOUDNESS_METER}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_LOUDNESS_METER_STATE DSP_LOUDNESS_METER_STATE}</li>
     * <li>{@link #FMOD_DSP_LOUDNESS_METER_WEIGHTING DSP_LOUDNESS_METER_WEIGHTING}</li>
     * <li>{@link #FMOD_DSP_LOUDNESS_METER_INFO DSP_LOUDNESS_METER_INFO}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_LOUDNESS_METER_STATE     = 0,
        FMOD_DSP_LOUDNESS_METER_WEIGHTING = 1,
        FMOD_DSP_LOUDNESS_METER_INFO      = 2;

    /**
     * {@code FMOD_DSP_LOUDNESS_METER_STATE_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_LOUDNESS_METER_STATE_RESET_INTEGRATED DSP_LOUDNESS_METER_STATE_RESET_INTEGRATED}</li>
     * <li>{@link #FMOD_DSP_LOUDNESS_METER_STATE_RESET_MAXPEAK DSP_LOUDNESS_METER_STATE_RESET_MAXPEAK}</li>
     * <li>{@link #FMOD_DSP_LOUDNESS_METER_STATE_RESET_ALL DSP_LOUDNESS_METER_STATE_RESET_ALL}</li>
     * <li>{@link #FMOD_DSP_LOUDNESS_METER_STATE_PAUSED DSP_LOUDNESS_METER_STATE_PAUSED}</li>
     * <li>{@link #FMOD_DSP_LOUDNESS_METER_STATE_ANALYZING DSP_LOUDNESS_METER_STATE_ANALYZING}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_LOUDNESS_METER_STATE_RESET_INTEGRATED = -3,
        FMOD_DSP_LOUDNESS_METER_STATE_RESET_MAXPEAK    = -2,
        FMOD_DSP_LOUDNESS_METER_STATE_RESET_ALL        = -1,
        FMOD_DSP_LOUDNESS_METER_STATE_PAUSED           = 0,
        FMOD_DSP_LOUDNESS_METER_STATE_ANALYZING        = 1;

    /**
     * {@code FMOD_DSP_ENVELOPEFOLLOWER}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_ENVELOPEFOLLOWER_ATTACK DSP_ENVELOPEFOLLOWER_ATTACK}</li>
     * <li>{@link #FMOD_DSP_ENVELOPEFOLLOWER_RELEASE DSP_ENVELOPEFOLLOWER_RELEASE}</li>
     * <li>{@link #FMOD_DSP_ENVELOPEFOLLOWER_ENVELOPE DSP_ENVELOPEFOLLOWER_ENVELOPE}</li>
     * <li>{@link #FMOD_DSP_ENVELOPEFOLLOWER_USESIDECHAIN DSP_ENVELOPEFOLLOWER_USESIDECHAIN}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_ENVELOPEFOLLOWER_ATTACK       = 0,
        FMOD_DSP_ENVELOPEFOLLOWER_RELEASE      = 1,
        FMOD_DSP_ENVELOPEFOLLOWER_ENVELOPE     = 2,
        FMOD_DSP_ENVELOPEFOLLOWER_USESIDECHAIN = 3;

    /**
     * {@code FMOD_DSP_CONVOLUTION_REVERB}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_CONVOLUTION_REVERB_PARAM_IR DSP_CONVOLUTION_REVERB_PARAM_IR}</li>
     * <li>{@link #FMOD_DSP_CONVOLUTION_REVERB_PARAM_WET DSP_CONVOLUTION_REVERB_PARAM_WET}</li>
     * <li>{@link #FMOD_DSP_CONVOLUTION_REVERB_PARAM_DRY DSP_CONVOLUTION_REVERB_PARAM_DRY}</li>
     * <li>{@link #FMOD_DSP_CONVOLUTION_REVERB_PARAM_LINKED DSP_CONVOLUTION_REVERB_PARAM_LINKED}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_CONVOLUTION_REVERB_PARAM_IR     = 0,
        FMOD_DSP_CONVOLUTION_REVERB_PARAM_WET    = 1,
        FMOD_DSP_CONVOLUTION_REVERB_PARAM_DRY    = 2,
        FMOD_DSP_CONVOLUTION_REVERB_PARAM_LINKED = 3;

    /**
     * {@code FMOD_DSP_CHANNELMIX_OUTPUT}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_DEFAULT DSP_CHANNELMIX_OUTPUT_DEFAULT}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_ALLMONO DSP_CHANNELMIX_OUTPUT_ALLMONO}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_ALLSTEREO DSP_CHANNELMIX_OUTPUT_ALLSTEREO}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_ALLQUAD DSP_CHANNELMIX_OUTPUT_ALLQUAD}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_ALL5POINT1 DSP_CHANNELMIX_OUTPUT_ALL5POINT1}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_ALL7POINT1 DSP_CHANNELMIX_OUTPUT_ALL7POINT1}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_ALLLFE DSP_CHANNELMIX_OUTPUT_ALLLFE}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_ALL7POINT1POINT4 DSP_CHANNELMIX_OUTPUT_ALL7POINT1POINT4}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_CHANNELMIX_OUTPUT_DEFAULT          = 0,
        FMOD_DSP_CHANNELMIX_OUTPUT_ALLMONO          = 1,
        FMOD_DSP_CHANNELMIX_OUTPUT_ALLSTEREO        = 2,
        FMOD_DSP_CHANNELMIX_OUTPUT_ALLQUAD          = 3,
        FMOD_DSP_CHANNELMIX_OUTPUT_ALL5POINT1       = 4,
        FMOD_DSP_CHANNELMIX_OUTPUT_ALL7POINT1       = 5,
        FMOD_DSP_CHANNELMIX_OUTPUT_ALLLFE           = 6,
        FMOD_DSP_CHANNELMIX_OUTPUT_ALL7POINT1POINT4 = 7;

    /**
     * {@code FMOD_DSP_CHANNELMIX}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUTGROUPING DSP_CHANNELMIX_OUTPUTGROUPING}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH0 DSP_CHANNELMIX_GAIN_CH0}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH1 DSP_CHANNELMIX_GAIN_CH1}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH2 DSP_CHANNELMIX_GAIN_CH2}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH3 DSP_CHANNELMIX_GAIN_CH3}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH4 DSP_CHANNELMIX_GAIN_CH4}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH5 DSP_CHANNELMIX_GAIN_CH5}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH6 DSP_CHANNELMIX_GAIN_CH6}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH7 DSP_CHANNELMIX_GAIN_CH7}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH8 DSP_CHANNELMIX_GAIN_CH8}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH9 DSP_CHANNELMIX_GAIN_CH9}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH10 DSP_CHANNELMIX_GAIN_CH10}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH11 DSP_CHANNELMIX_GAIN_CH11}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH12 DSP_CHANNELMIX_GAIN_CH12}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH13 DSP_CHANNELMIX_GAIN_CH13}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH14 DSP_CHANNELMIX_GAIN_CH14}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH15 DSP_CHANNELMIX_GAIN_CH15}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH16 DSP_CHANNELMIX_GAIN_CH16}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH17 DSP_CHANNELMIX_GAIN_CH17}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH18 DSP_CHANNELMIX_GAIN_CH18}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH19 DSP_CHANNELMIX_GAIN_CH19}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH20 DSP_CHANNELMIX_GAIN_CH20}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH21 DSP_CHANNELMIX_GAIN_CH21}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH22 DSP_CHANNELMIX_GAIN_CH22}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH23 DSP_CHANNELMIX_GAIN_CH23}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH24 DSP_CHANNELMIX_GAIN_CH24}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH25 DSP_CHANNELMIX_GAIN_CH25}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH26 DSP_CHANNELMIX_GAIN_CH26}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH27 DSP_CHANNELMIX_GAIN_CH27}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH28 DSP_CHANNELMIX_GAIN_CH28}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH29 DSP_CHANNELMIX_GAIN_CH29}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH30 DSP_CHANNELMIX_GAIN_CH30}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_GAIN_CH31 DSP_CHANNELMIX_GAIN_CH31}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH0 DSP_CHANNELMIX_OUTPUT_CH0}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH1 DSP_CHANNELMIX_OUTPUT_CH1}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH2 DSP_CHANNELMIX_OUTPUT_CH2}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH3 DSP_CHANNELMIX_OUTPUT_CH3}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH4 DSP_CHANNELMIX_OUTPUT_CH4}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH5 DSP_CHANNELMIX_OUTPUT_CH5}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH6 DSP_CHANNELMIX_OUTPUT_CH6}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH7 DSP_CHANNELMIX_OUTPUT_CH7}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH8 DSP_CHANNELMIX_OUTPUT_CH8}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH9 DSP_CHANNELMIX_OUTPUT_CH9}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH10 DSP_CHANNELMIX_OUTPUT_CH10}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH11 DSP_CHANNELMIX_OUTPUT_CH11}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH12 DSP_CHANNELMIX_OUTPUT_CH12}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH13 DSP_CHANNELMIX_OUTPUT_CH13}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH14 DSP_CHANNELMIX_OUTPUT_CH14}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH15 DSP_CHANNELMIX_OUTPUT_CH15}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH16 DSP_CHANNELMIX_OUTPUT_CH16}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH17 DSP_CHANNELMIX_OUTPUT_CH17}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH18 DSP_CHANNELMIX_OUTPUT_CH18}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH19 DSP_CHANNELMIX_OUTPUT_CH19}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH20 DSP_CHANNELMIX_OUTPUT_CH20}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH21 DSP_CHANNELMIX_OUTPUT_CH21}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH22 DSP_CHANNELMIX_OUTPUT_CH22}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH23 DSP_CHANNELMIX_OUTPUT_CH23}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH24 DSP_CHANNELMIX_OUTPUT_CH24}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH25 DSP_CHANNELMIX_OUTPUT_CH25}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH26 DSP_CHANNELMIX_OUTPUT_CH26}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH27 DSP_CHANNELMIX_OUTPUT_CH27}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH28 DSP_CHANNELMIX_OUTPUT_CH28}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH29 DSP_CHANNELMIX_OUTPUT_CH29}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH30 DSP_CHANNELMIX_OUTPUT_CH30}</li>
     * <li>{@link #FMOD_DSP_CHANNELMIX_OUTPUT_CH31 DSP_CHANNELMIX_OUTPUT_CH31}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_CHANNELMIX_OUTPUTGROUPING = 0,
        FMOD_DSP_CHANNELMIX_GAIN_CH0       = 1,
        FMOD_DSP_CHANNELMIX_GAIN_CH1       = 2,
        FMOD_DSP_CHANNELMIX_GAIN_CH2       = 3,
        FMOD_DSP_CHANNELMIX_GAIN_CH3       = 4,
        FMOD_DSP_CHANNELMIX_GAIN_CH4       = 5,
        FMOD_DSP_CHANNELMIX_GAIN_CH5       = 6,
        FMOD_DSP_CHANNELMIX_GAIN_CH6       = 7,
        FMOD_DSP_CHANNELMIX_GAIN_CH7       = 8,
        FMOD_DSP_CHANNELMIX_GAIN_CH8       = 9,
        FMOD_DSP_CHANNELMIX_GAIN_CH9       = 10,
        FMOD_DSP_CHANNELMIX_GAIN_CH10      = 11,
        FMOD_DSP_CHANNELMIX_GAIN_CH11      = 12,
        FMOD_DSP_CHANNELMIX_GAIN_CH12      = 13,
        FMOD_DSP_CHANNELMIX_GAIN_CH13      = 14,
        FMOD_DSP_CHANNELMIX_GAIN_CH14      = 15,
        FMOD_DSP_CHANNELMIX_GAIN_CH15      = 16,
        FMOD_DSP_CHANNELMIX_GAIN_CH16      = 17,
        FMOD_DSP_CHANNELMIX_GAIN_CH17      = 18,
        FMOD_DSP_CHANNELMIX_GAIN_CH18      = 19,
        FMOD_DSP_CHANNELMIX_GAIN_CH19      = 20,
        FMOD_DSP_CHANNELMIX_GAIN_CH20      = 21,
        FMOD_DSP_CHANNELMIX_GAIN_CH21      = 22,
        FMOD_DSP_CHANNELMIX_GAIN_CH22      = 23,
        FMOD_DSP_CHANNELMIX_GAIN_CH23      = 24,
        FMOD_DSP_CHANNELMIX_GAIN_CH24      = 25,
        FMOD_DSP_CHANNELMIX_GAIN_CH25      = 26,
        FMOD_DSP_CHANNELMIX_GAIN_CH26      = 27,
        FMOD_DSP_CHANNELMIX_GAIN_CH27      = 28,
        FMOD_DSP_CHANNELMIX_GAIN_CH28      = 29,
        FMOD_DSP_CHANNELMIX_GAIN_CH29      = 30,
        FMOD_DSP_CHANNELMIX_GAIN_CH30      = 31,
        FMOD_DSP_CHANNELMIX_GAIN_CH31      = 32,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH0     = 33,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH1     = 34,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH2     = 35,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH3     = 36,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH4     = 37,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH5     = 38,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH6     = 39,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH7     = 40,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH8     = 41,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH9     = 42,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH10    = 43,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH11    = 44,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH12    = 45,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH13    = 46,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH14    = 47,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH15    = 48,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH16    = 49,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH17    = 50,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH18    = 51,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH19    = 52,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH20    = 53,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH21    = 54,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH22    = 55,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH23    = 56,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH24    = 57,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH25    = 58,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH26    = 59,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH27    = 60,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH28    = 61,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH29    = 62,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH30    = 63,
        FMOD_DSP_CHANNELMIX_OUTPUT_CH31    = 64;

    /**
     * {@code FMOD_DSP_TRANSCEIVER_SPEAKERMODE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_TRANSCEIVER_SPEAKERMODE_AUTO DSP_TRANSCEIVER_SPEAKERMODE_AUTO}</li>
     * <li>{@link #FMOD_DSP_TRANSCEIVER_SPEAKERMODE_MONO DSP_TRANSCEIVER_SPEAKERMODE_MONO}</li>
     * <li>{@link #FMOD_DSP_TRANSCEIVER_SPEAKERMODE_STEREO DSP_TRANSCEIVER_SPEAKERMODE_STEREO}</li>
     * <li>{@link #FMOD_DSP_TRANSCEIVER_SPEAKERMODE_SURROUND DSP_TRANSCEIVER_SPEAKERMODE_SURROUND}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_TRANSCEIVER_SPEAKERMODE_AUTO     = -1,
        FMOD_DSP_TRANSCEIVER_SPEAKERMODE_MONO     = 0,
        FMOD_DSP_TRANSCEIVER_SPEAKERMODE_STEREO   = 1,
        FMOD_DSP_TRANSCEIVER_SPEAKERMODE_SURROUND = 2;

    /**
     * {@code FMOD_DSP_TRANSCEIVER}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_TRANSCEIVER_TRANSMIT DSP_TRANSCEIVER_TRANSMIT}</li>
     * <li>{@link #FMOD_DSP_TRANSCEIVER_GAIN DSP_TRANSCEIVER_GAIN}</li>
     * <li>{@link #FMOD_DSP_TRANSCEIVER_CHANNEL DSP_TRANSCEIVER_CHANNEL}</li>
     * <li>{@link #FMOD_DSP_TRANSCEIVER_TRANSMITSPEAKERMODE DSP_TRANSCEIVER_TRANSMITSPEAKERMODE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_TRANSCEIVER_TRANSMIT            = 0,
        FMOD_DSP_TRANSCEIVER_GAIN                = 1,
        FMOD_DSP_TRANSCEIVER_CHANNEL             = 2,
        FMOD_DSP_TRANSCEIVER_TRANSMITSPEAKERMODE = 3;

    /**
     * {@code FMOD_DSP_OBJECTPAN}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_OBJECTPAN_3D_POSITION DSP_OBJECTPAN_3D_POSITION}</li>
     * <li>{@link #FMOD_DSP_OBJECTPAN_3D_ROLLOFF DSP_OBJECTPAN_3D_ROLLOFF}</li>
     * <li>{@link #FMOD_DSP_OBJECTPAN_3D_MIN_DISTANCE DSP_OBJECTPAN_3D_MIN_DISTANCE}</li>
     * <li>{@link #FMOD_DSP_OBJECTPAN_3D_MAX_DISTANCE DSP_OBJECTPAN_3D_MAX_DISTANCE}</li>
     * <li>{@link #FMOD_DSP_OBJECTPAN_3D_EXTENT_MODE DSP_OBJECTPAN_3D_EXTENT_MODE}</li>
     * <li>{@link #FMOD_DSP_OBJECTPAN_3D_SOUND_SIZE DSP_OBJECTPAN_3D_SOUND_SIZE}</li>
     * <li>{@link #FMOD_DSP_OBJECTPAN_3D_MIN_EXTENT DSP_OBJECTPAN_3D_MIN_EXTENT}</li>
     * <li>{@link #FMOD_DSP_OBJECTPAN_OVERALL_GAIN DSP_OBJECTPAN_OVERALL_GAIN}</li>
     * <li>{@link #FMOD_DSP_OBJECTPAN_OUTPUTGAIN DSP_OBJECTPAN_OUTPUTGAIN}</li>
     * <li>{@link #FMOD_DSP_OBJECTPAN_ATTENUATION_RANGE DSP_OBJECTPAN_ATTENUATION_RANGE}</li>
     * <li>{@link #FMOD_DSP_OBJECTPAN_OVERRIDE_RANGE DSP_OBJECTPAN_OVERRIDE_RANGE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_OBJECTPAN_3D_POSITION       = 0,
        FMOD_DSP_OBJECTPAN_3D_ROLLOFF        = 1,
        FMOD_DSP_OBJECTPAN_3D_MIN_DISTANCE   = 2,
        FMOD_DSP_OBJECTPAN_3D_MAX_DISTANCE   = 3,
        FMOD_DSP_OBJECTPAN_3D_EXTENT_MODE    = 4,
        FMOD_DSP_OBJECTPAN_3D_SOUND_SIZE     = 5,
        FMOD_DSP_OBJECTPAN_3D_MIN_EXTENT     = 6,
        FMOD_DSP_OBJECTPAN_OVERALL_GAIN      = 7,
        FMOD_DSP_OBJECTPAN_OUTPUTGAIN        = 8,
        FMOD_DSP_OBJECTPAN_ATTENUATION_RANGE = 9,
        FMOD_DSP_OBJECTPAN_OVERRIDE_RANGE    = 10;

    /**
     * {@code FMOD_DSP_PROCESS_OPERATION}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PROCESS_PERFORM DSP_PROCESS_PERFORM}</li>
     * <li>{@link #FMOD_DSP_PROCESS_QUERY DSP_PROCESS_QUERY}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PROCESS_PERFORM = 0,
        FMOD_DSP_PROCESS_QUERY   = 1;

    /**
     * {@code FMOD_DSP_PAN_SURROUND_FLAGS}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PAN_SURROUND_DEFAULT DSP_PAN_SURROUND_DEFAULT}</li>
     * <li>{@link #FMOD_DSP_PAN_SURROUND_ROTATION_NOT_BIASED DSP_PAN_SURROUND_ROTATION_NOT_BIASED}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PAN_SURROUND_DEFAULT             = 0,
        FMOD_DSP_PAN_SURROUND_ROTATION_NOT_BIASED = 1;

    /**
     * {@code FMOD_DSP_PARAMETER_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PARAMETER_TYPE_FLOAT DSP_PARAMETER_TYPE_FLOAT}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_TYPE_INT DSP_PARAMETER_TYPE_INT}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_TYPE_BOOL DSP_PARAMETER_TYPE_BOOL}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_TYPE_DATA DSP_PARAMETER_TYPE_DATA}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_TYPE_MAX DSP_PARAMETER_TYPE_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PARAMETER_TYPE_FLOAT = 0,
        FMOD_DSP_PARAMETER_TYPE_INT   = 1,
        FMOD_DSP_PARAMETER_TYPE_BOOL  = 2,
        FMOD_DSP_PARAMETER_TYPE_DATA  = 3,
        FMOD_DSP_PARAMETER_TYPE_MAX   = 4;

    /**
     * {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE_LINEAR DSP_PARAMETER_FLOAT_MAPPING_TYPE_LINEAR}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE_AUTO DSP_PARAMETER_FLOAT_MAPPING_TYPE_AUTO}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE_PIECEWISE_LINEAR DSP_PARAMETER_FLOAT_MAPPING_TYPE_PIECEWISE_LINEAR}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE_LINEAR           = 0,
        FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE_AUTO             = 1,
        FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE_PIECEWISE_LINEAR = 2;

    /**
     * {@code FMOD_DSP_PARAMETER_DATA_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_DSP_PARAMETER_DATA_TYPE_USER DSP_PARAMETER_DATA_TYPE_USER}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_DATA_TYPE_OVERALLGAIN DSP_PARAMETER_DATA_TYPE_OVERALLGAIN}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_DATA_TYPE_3DATTRIBUTES DSP_PARAMETER_DATA_TYPE_3DATTRIBUTES}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_DATA_TYPE_SIDECHAIN DSP_PARAMETER_DATA_TYPE_SIDECHAIN}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_DATA_TYPE_FFT DSP_PARAMETER_DATA_TYPE_FFT}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_DATA_TYPE_3DATTRIBUTES_MULTI DSP_PARAMETER_DATA_TYPE_3DATTRIBUTES_MULTI}</li>
     * <li>{@link #FMOD_DSP_PARAMETER_DATA_TYPE_ATTENUATION_RANGE DSP_PARAMETER_DATA_TYPE_ATTENUATION_RANGE}</li>
     * </ul>
     */
    public static final int
        FMOD_DSP_PARAMETER_DATA_TYPE_USER               = 0,
        FMOD_DSP_PARAMETER_DATA_TYPE_OVERALLGAIN        = -1,
        FMOD_DSP_PARAMETER_DATA_TYPE_3DATTRIBUTES       = -2,
        FMOD_DSP_PARAMETER_DATA_TYPE_SIDECHAIN          = -3,
        FMOD_DSP_PARAMETER_DATA_TYPE_FFT                = -4,
        FMOD_DSP_PARAMETER_DATA_TYPE_3DATTRIBUTES_MULTI = -5,
        FMOD_DSP_PARAMETER_DATA_TYPE_ATTENUATION_RANGE  = -6;

    protected FMOD() {
        throw new UnsupportedOperationException();
    }

    // --- [ FMOD_Memory_Initialize ] ---

    public static int nFMOD_Memory_Initialize(long poolmem, int poollen, long useralloc, long userrealloc, long userfree, int memtypeflags) {
        long __functionAddress = Functions.Memory_Initialize;
        return callPPPPI(poolmem, poollen, useralloc, userrealloc, userfree, memtypeflags, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Memory_Initialize(@Nullable @NativeType("void *") ByteBuffer poolmem, @Nullable @NativeType("FMOD_MEMORY_ALLOC_CALLBACK") FMOD_MEMORY_ALLOC_CALLBACKI useralloc, @Nullable @NativeType("FMOD_MEMORY_REALLOC_CALLBACK") FMOD_MEMORY_REALLOC_CALLBACKI userrealloc, @Nullable @NativeType("FMOD_MEMORY_FREE_CALLBACK") FMOD_MEMORY_FREE_CALLBACKI userfree, @NativeType("FMOD_MEMORY_TYPE") int memtypeflags) {
        return nFMOD_Memory_Initialize(memAddressSafe(poolmem), remainingSafe(poolmem), memAddressSafe(useralloc), memAddressSafe(userrealloc), memAddressSafe(userfree), memtypeflags);
    }

    // --- [ FMOD_Memory_GetStats ] ---

    public static int nFMOD_Memory_GetStats(long currentalloced, long maxalloced, int blocking) {
        long __functionAddress = Functions.Memory_GetStats;
        return callPPI(currentalloced, maxalloced, blocking, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Memory_GetStats(@Nullable @NativeType("int *") IntBuffer currentalloced, @Nullable @NativeType("int *") IntBuffer maxalloced, @NativeType("FMOD_BOOL") int blocking) {
        if (CHECKS) {
            checkSafe(currentalloced, 1);
            checkSafe(maxalloced, 1);
        }
        return nFMOD_Memory_GetStats(memAddressSafe(currentalloced), memAddressSafe(maxalloced), blocking);
    }

    // --- [ FMOD_Debug_Initialize ] ---

    public static int nFMOD_Debug_Initialize(int flags, int mode, long callback, long filename) {
        long __functionAddress = Functions.Debug_Initialize;
        return callPPI(flags, mode, callback, filename, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Debug_Initialize(@NativeType("FMOD_DEBUG_FLAGS") int flags, @NativeType("FMOD_DEBUG_MODE") int mode, @Nullable @NativeType("FMOD_DEBUG_CALLBACK") FMOD_DEBUG_CALLBACKI callback, @Nullable @NativeType("char const *") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1Safe(filename);
        }
        return nFMOD_Debug_Initialize(flags, mode, memAddressSafe(callback), memAddressSafe(filename));
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Debug_Initialize(@NativeType("FMOD_DEBUG_FLAGS") int flags, @NativeType("FMOD_DEBUG_MODE") int mode, @Nullable @NativeType("FMOD_DEBUG_CALLBACK") FMOD_DEBUG_CALLBACKI callback, @Nullable @NativeType("char const *") CharSequence filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(filename, true);
            long filenameEncoded = filename == null ? NULL : stack.getPointerAddress();
            return nFMOD_Debug_Initialize(flags, mode, memAddressSafe(callback), filenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_File_SetDiskBusy ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_File_SetDiskBusy(int busy) {
        long __functionAddress = Functions.File_SetDiskBusy;
        return callI(busy, __functionAddress);
    }

    // --- [ FMOD_File_GetDiskBusy ] ---

    public static int nFMOD_File_GetDiskBusy(long busy) {
        long __functionAddress = Functions.File_GetDiskBusy;
        return callPI(busy, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_File_GetDiskBusy(@NativeType("int *") IntBuffer busy) {
        if (CHECKS) {
            check(busy, 1);
        }
        return nFMOD_File_GetDiskBusy(memAddress(busy));
    }

    // --- [ FMOD_Thread_SetAttributes ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Thread_SetAttributes(@NativeType("FMOD_THREAD_TYPE") int type, @NativeType("FMOD_THREAD_AFFINITY") long affinity, @NativeType("FMOD_THREAD_PRIORITY") int priority, @NativeType("FMOD_THREAD_STACK_SIZE") int stacksize) {
        long __functionAddress = Functions.Thread_SetAttributes;
        return callJI(type, affinity, priority, stacksize, __functionAddress);
    }

    // --- [ FMOD_System_Create ] ---

    /** Unsafe version of: {@link #FMOD_System_Create System_Create} */
    public static int nFMOD_System_Create(long system, int headerversion) {
        long __functionAddress = Functions.System_Create;
        return callPI(system, headerversion, __functionAddress);
    }

    /** FMOD System factory functions.  Use this to create an FMOD System Instance.  below you will see FMOD_System_Init/Close to get started. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Create(@NativeType("FMOD_SYSTEM **") PointerBuffer system, @NativeType("unsigned int") int headerversion) {
        if (CHECKS) {
            check(system, 1);
        }
        return nFMOD_System_Create(memAddress(system), headerversion);
    }

    // --- [ FMOD_System_Release ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Release(@NativeType("FMOD_SYSTEM *") long system) {
        long __functionAddress = Functions.System_Release;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_System_SetOutput ] ---

    /** Setup functions. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetOutput(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_OUTPUTTYPE") int output) {
        long __functionAddress = Functions.System_SetOutput;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, output, __functionAddress);
    }

    // --- [ FMOD_System_GetOutput ] ---

    public static int nFMOD_System_GetOutput(long system, long output) {
        long __functionAddress = Functions.System_GetOutput;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, output, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetOutput(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_OUTPUTTYPE *") IntBuffer output) {
        if (CHECKS) {
            check(output, 1);
        }
        return nFMOD_System_GetOutput(system, memAddress(output));
    }

    // --- [ FMOD_System_GetNumDrivers ] ---

    public static int nFMOD_System_GetNumDrivers(long system, long numdrivers) {
        long __functionAddress = Functions.System_GetNumDrivers;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, numdrivers, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetNumDrivers(@NativeType("FMOD_SYSTEM *") long system, @NativeType("int *") IntBuffer numdrivers) {
        if (CHECKS) {
            check(numdrivers, 1);
        }
        return nFMOD_System_GetNumDrivers(system, memAddress(numdrivers));
    }

    // --- [ FMOD_System_GetDriverInfo ] ---

    public static int nFMOD_System_GetDriverInfo(long system, int id, long name, int namelen, long guid, long systemrate, long speakermode, long speakermodechannels) {
        long __functionAddress = Functions.System_GetDriverInfo;
        if (CHECKS) {
            check(system);
        }
        return callPPPPPPI(system, id, name, namelen, guid, systemrate, speakermode, speakermodechannels, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetDriverInfo(@NativeType("FMOD_SYSTEM *") long system, int id, @Nullable @NativeType("char *") ByteBuffer name, @Nullable @NativeType("FMOD_GUID *") FMOD_GUID guid, @Nullable @NativeType("int *") IntBuffer systemrate, @Nullable @NativeType("FMOD_SPEAKERMODE *") IntBuffer speakermode, @Nullable @NativeType("int *") IntBuffer speakermodechannels) {
        if (CHECKS) {
            checkSafe(systemrate, 1);
            checkSafe(speakermode, 1);
            checkSafe(speakermodechannels, 1);
        }
        return nFMOD_System_GetDriverInfo(system, id, memAddressSafe(name), remainingSafe(name), memAddressSafe(guid), memAddressSafe(systemrate), memAddressSafe(speakermode), memAddressSafe(speakermodechannels));
    }

    // --- [ FMOD_System_SetDriver ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetDriver(@NativeType("FMOD_SYSTEM *") long system, int driver) {
        long __functionAddress = Functions.System_SetDriver;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, driver, __functionAddress);
    }

    // --- [ FMOD_System_GetDriver ] ---

    public static int nFMOD_System_GetDriver(long system, long driver) {
        long __functionAddress = Functions.System_GetDriver;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, driver, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetDriver(@NativeType("FMOD_SYSTEM *") long system, @NativeType("int *") IntBuffer driver) {
        if (CHECKS) {
            check(driver, 1);
        }
        return nFMOD_System_GetDriver(system, memAddress(driver));
    }

    // --- [ FMOD_System_SetSoftwareChannels ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetSoftwareChannels(@NativeType("FMOD_SYSTEM *") long system, int numsoftwarechannels) {
        long __functionAddress = Functions.System_SetSoftwareChannels;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, numsoftwarechannels, __functionAddress);
    }

    // --- [ FMOD_System_GetSoftwareChannels ] ---

    public static int nFMOD_System_GetSoftwareChannels(long system, long numsoftwarechannels) {
        long __functionAddress = Functions.System_GetSoftwareChannels;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, numsoftwarechannels, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetSoftwareChannels(@NativeType("FMOD_SYSTEM *") long system, @NativeType("int *") IntBuffer numsoftwarechannels) {
        if (CHECKS) {
            check(numsoftwarechannels, 1);
        }
        return nFMOD_System_GetSoftwareChannels(system, memAddress(numsoftwarechannels));
    }

    // --- [ FMOD_System_SetSoftwareFormat ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetSoftwareFormat(@NativeType("FMOD_SYSTEM *") long system, int samplerate, @NativeType("FMOD_SPEAKERMODE") int speakermode, int numrawspeakers) {
        long __functionAddress = Functions.System_SetSoftwareFormat;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, samplerate, speakermode, numrawspeakers, __functionAddress);
    }

    // --- [ FMOD_System_GetSoftwareFormat ] ---

    public static int nFMOD_System_GetSoftwareFormat(long system, long samplerate, long speakermode, long numrawspeakers) {
        long __functionAddress = Functions.System_GetSoftwareFormat;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, samplerate, speakermode, numrawspeakers, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetSoftwareFormat(@NativeType("FMOD_SYSTEM *") long system, @Nullable @NativeType("int *") IntBuffer samplerate, @Nullable @NativeType("FMOD_SPEAKERMODE *") IntBuffer speakermode, @Nullable @NativeType("int *") IntBuffer numrawspeakers) {
        if (CHECKS) {
            checkSafe(samplerate, 1);
            checkSafe(speakermode, 1);
            checkSafe(numrawspeakers, 1);
        }
        return nFMOD_System_GetSoftwareFormat(system, memAddressSafe(samplerate), memAddressSafe(speakermode), memAddressSafe(numrawspeakers));
    }

    // --- [ FMOD_System_SetDSPBufferSize ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetDSPBufferSize(@NativeType("FMOD_SYSTEM *") long system, @NativeType("unsigned int") int bufferlength, int numbuffers) {
        long __functionAddress = Functions.System_SetDSPBufferSize;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, bufferlength, numbuffers, __functionAddress);
    }

    // --- [ FMOD_System_GetDSPBufferSize ] ---

    public static int nFMOD_System_GetDSPBufferSize(long system, long bufferlength, long numbuffers) {
        long __functionAddress = Functions.System_GetDSPBufferSize;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, bufferlength, numbuffers, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetDSPBufferSize(@NativeType("FMOD_SYSTEM *") long system, @Nullable @NativeType("unsigned int *") IntBuffer bufferlength, @Nullable @NativeType("int *") IntBuffer numbuffers) {
        if (CHECKS) {
            checkSafe(bufferlength, 1);
            checkSafe(numbuffers, 1);
        }
        return nFMOD_System_GetDSPBufferSize(system, memAddressSafe(bufferlength), memAddressSafe(numbuffers));
    }

    // --- [ FMOD_System_SetFileSystem ] ---

    public static int nFMOD_System_SetFileSystem(long system, long useropen, long userclose, long userread, long userseek, long userasyncread, long userasynccancel, int blockalign) {
        long __functionAddress = Functions.System_SetFileSystem;
        if (CHECKS) {
            check(system);
        }
        return callPPPPPPPI(system, useropen, userclose, userread, userseek, userasyncread, userasynccancel, blockalign, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetFileSystem(@NativeType("FMOD_SYSTEM *") long system, @Nullable @NativeType("FMOD_FILE_OPEN_CALLBACK") FMOD_FILE_OPEN_CALLBACKI useropen, @Nullable @NativeType("FMOD_FILE_CLOSE_CALLBACK") FMOD_FILE_CLOSE_CALLBACKI userclose, @Nullable @NativeType("FMOD_FILE_READ_CALLBACK") FMOD_FILE_READ_CALLBACKI userread, @Nullable @NativeType("FMOD_FILE_SEEK_CALLBACK") FMOD_FILE_SEEK_CALLBACKI userseek, @Nullable @NativeType("FMOD_FILE_ASYNCREAD_CALLBACK") FMOD_FILE_ASYNCREAD_CALLBACKI userasyncread, @Nullable @NativeType("FMOD_FILE_ASYNCCANCEL_CALLBACK") FMOD_FILE_ASYNCCANCEL_CALLBACKI userasynccancel, int blockalign) {
        return nFMOD_System_SetFileSystem(system, memAddressSafe(useropen), memAddressSafe(userclose), memAddressSafe(userread), memAddressSafe(userseek), memAddressSafe(userasyncread), memAddressSafe(userasynccancel), blockalign);
    }

    // --- [ FMOD_System_AttachFileSystem ] ---

    public static int nFMOD_System_AttachFileSystem(long system, long useropen, long userclose, long userread, long userseek) {
        long __functionAddress = Functions.System_AttachFileSystem;
        if (CHECKS) {
            check(system);
        }
        return callPPPPPI(system, useropen, userclose, userread, userseek, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_AttachFileSystem(@NativeType("FMOD_SYSTEM *") long system, @Nullable @NativeType("FMOD_FILE_OPEN_CALLBACK") FMOD_FILE_OPEN_CALLBACKI useropen, @Nullable @NativeType("FMOD_FILE_CLOSE_CALLBACK") FMOD_FILE_CLOSE_CALLBACKI userclose, @Nullable @NativeType("FMOD_FILE_READ_CALLBACK") FMOD_FILE_READ_CALLBACKI userread, @Nullable @NativeType("FMOD_FILE_SEEK_CALLBACK") FMOD_FILE_SEEK_CALLBACKI userseek) {
        return nFMOD_System_AttachFileSystem(system, memAddressSafe(useropen), memAddressSafe(userclose), memAddressSafe(userread), memAddressSafe(userseek));
    }

    // --- [ FMOD_System_SetAdvancedSettings ] ---

    public static int nFMOD_System_SetAdvancedSettings(long system, long settings) {
        long __functionAddress = Functions.System_SetAdvancedSettings;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, settings, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetAdvancedSettings(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_ADVANCEDSETTINGS *") FMOD_ADVANCEDSETTINGS settings) {
        return nFMOD_System_SetAdvancedSettings(system, settings.address());
    }

    // --- [ FMOD_System_GetAdvancedSettings ] ---

    public static int nFMOD_System_GetAdvancedSettings(long system, long settings) {
        long __functionAddress = Functions.System_GetAdvancedSettings;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, settings, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetAdvancedSettings(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_ADVANCEDSETTINGS *") FMOD_ADVANCEDSETTINGS settings) {
        return nFMOD_System_GetAdvancedSettings(system, settings.address());
    }

    // --- [ FMOD_System_SetCallback ] ---

    public static int nFMOD_System_SetCallback(long system, long callback, int callbackmask) {
        long __functionAddress = Functions.System_SetCallback;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, callback, callbackmask, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetCallback(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_SYSTEM_CALLBACK") FMOD_SYSTEM_CALLBACKI callback, @NativeType("FMOD_SYSTEM_CALLBACK_TYPE") int callbackmask) {
        return nFMOD_System_SetCallback(system, callback.address(), callbackmask);
    }

    // --- [ FMOD_System_SetPluginPath ] ---

    /** Unsafe version of: {@link #FMOD_System_SetPluginPath System_SetPluginPath} */
    public static int nFMOD_System_SetPluginPath(long system, long path) {
        long __functionAddress = Functions.System_SetPluginPath;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, path, __functionAddress);
    }

    /** Plug-in support. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetPluginPath(@NativeType("FMOD_SYSTEM *") long system, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nFMOD_System_SetPluginPath(system, memAddress(path));
    }

    /** Plug-in support. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetPluginPath(@NativeType("FMOD_SYSTEM *") long system, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nFMOD_System_SetPluginPath(system, pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_System_LoadPlugin ] ---

    public static int nFMOD_System_LoadPlugin(long system, long filename, long handle, int priority) {
        long __functionAddress = Functions.System_LoadPlugin;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, filename, handle, priority, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_LoadPlugin(@NativeType("FMOD_SYSTEM *") long system, @NativeType("char const *") ByteBuffer filename, @NativeType("unsigned int *") IntBuffer handle, @NativeType("unsigned int") int priority) {
        if (CHECKS) {
            checkNT1(filename);
            check(handle, 1);
        }
        return nFMOD_System_LoadPlugin(system, memAddress(filename), memAddress(handle), priority);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_LoadPlugin(@NativeType("FMOD_SYSTEM *") long system, @NativeType("char const *") CharSequence filename, @NativeType("unsigned int *") IntBuffer handle, @NativeType("unsigned int") int priority) {
        if (CHECKS) {
            check(handle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nFMOD_System_LoadPlugin(system, filenameEncoded, memAddress(handle), priority);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_System_UnloadPlugin ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_UnloadPlugin(@NativeType("FMOD_SYSTEM *") long system, @NativeType("unsigned int") int handle) {
        long __functionAddress = Functions.System_UnloadPlugin;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, handle, __functionAddress);
    }

    // --- [ FMOD_System_GetNumNestedPlugins ] ---

    public static int nFMOD_System_GetNumNestedPlugins(long system, int handle, long count) {
        long __functionAddress = Functions.System_GetNumNestedPlugins;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, handle, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetNumNestedPlugins(@NativeType("FMOD_SYSTEM *") long system, @NativeType("unsigned int") int handle, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_System_GetNumNestedPlugins(system, handle, memAddress(count));
    }

    // --- [ FMOD_System_GetNestedPlugin ] ---

    public static int nFMOD_System_GetNestedPlugin(long system, int handle, int index, long nestedhandle) {
        long __functionAddress = Functions.System_GetNestedPlugin;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, handle, index, nestedhandle, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetNestedPlugin(@NativeType("FMOD_SYSTEM *") long system, @NativeType("unsigned int") int handle, int index, @NativeType("unsigned int *") IntBuffer nestedhandle) {
        if (CHECKS) {
            check(nestedhandle, 1);
        }
        return nFMOD_System_GetNestedPlugin(system, handle, index, memAddress(nestedhandle));
    }

    // --- [ FMOD_System_GetNumPlugins ] ---

    public static int nFMOD_System_GetNumPlugins(long system, int plugintype, long numplugins) {
        long __functionAddress = Functions.System_GetNumPlugins;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, plugintype, numplugins, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetNumPlugins(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_PLUGINTYPE") int plugintype, @NativeType("int *") IntBuffer numplugins) {
        if (CHECKS) {
            check(numplugins, 1);
        }
        return nFMOD_System_GetNumPlugins(system, plugintype, memAddress(numplugins));
    }

    // --- [ FMOD_System_GetPluginHandle ] ---

    public static int nFMOD_System_GetPluginHandle(long system, int plugintype, int index, long handle) {
        long __functionAddress = Functions.System_GetPluginHandle;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, plugintype, index, handle, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetPluginHandle(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_PLUGINTYPE") int plugintype, int index, @NativeType("unsigned int *") IntBuffer handle) {
        if (CHECKS) {
            check(handle, 1);
        }
        return nFMOD_System_GetPluginHandle(system, plugintype, index, memAddress(handle));
    }

    // --- [ FMOD_System_GetPluginInfo ] ---

    public static int nFMOD_System_GetPluginInfo(long system, int handle, long plugintype, long name, int namelen, long version) {
        long __functionAddress = Functions.System_GetPluginInfo;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, handle, plugintype, name, namelen, version, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetPluginInfo(@NativeType("FMOD_SYSTEM *") long system, @NativeType("unsigned int") int handle, @Nullable @NativeType("FMOD_PLUGINTYPE *") IntBuffer plugintype, @Nullable @NativeType("char *") ByteBuffer name, @Nullable @NativeType("unsigned int *") IntBuffer version) {
        if (CHECKS) {
            checkSafe(plugintype, 1);
            checkSafe(version, 1);
        }
        return nFMOD_System_GetPluginInfo(system, handle, memAddressSafe(plugintype), memAddressSafe(name), remainingSafe(name), memAddressSafe(version));
    }

    // --- [ FMOD_System_SetOutputByPlugin ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetOutputByPlugin(@NativeType("FMOD_SYSTEM *") long system, @NativeType("unsigned int") int handle) {
        long __functionAddress = Functions.System_SetOutputByPlugin;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, handle, __functionAddress);
    }

    // --- [ FMOD_System_GetOutputByPlugin ] ---

    public static int nFMOD_System_GetOutputByPlugin(long system, long handle) {
        long __functionAddress = Functions.System_GetOutputByPlugin;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, handle, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetOutputByPlugin(@NativeType("FMOD_SYSTEM *") long system, @NativeType("unsigned int *") IntBuffer handle) {
        if (CHECKS) {
            check(handle, 1);
        }
        return nFMOD_System_GetOutputByPlugin(system, memAddress(handle));
    }

    // --- [ FMOD_System_CreateDSPByPlugin ] ---

    public static int nFMOD_System_CreateDSPByPlugin(long system, int handle, long dsp) {
        long __functionAddress = Functions.System_CreateDSPByPlugin;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, handle, dsp, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_CreateDSPByPlugin(@NativeType("FMOD_SYSTEM *") long system, @NativeType("unsigned int") int handle, @NativeType("FMOD_DSP **") PointerBuffer dsp) {
        if (CHECKS) {
            check(dsp, 1);
        }
        return nFMOD_System_CreateDSPByPlugin(system, handle, memAddress(dsp));
    }

    // --- [ FMOD_System_GetDSPInfoByPlugin ] ---

    public static int nFMOD_System_GetDSPInfoByPlugin(long system, int handle, long description) {
        long __functionAddress = Functions.System_GetDSPInfoByPlugin;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, handle, description, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetDSPInfoByPlugin(@NativeType("FMOD_SYSTEM *") long system, @NativeType("unsigned int") int handle, @NativeType("FMOD_DSP_DESCRIPTION const **") PointerBuffer description) {
        if (CHECKS) {
            check(description, 1);
        }
        return nFMOD_System_GetDSPInfoByPlugin(system, handle, memAddress(description));
    }

    // --- [ FMOD_System_RegisterCodec ] ---

    public static int nFMOD_System_RegisterCodec(long system, long description, long handle, int priority) {
        long __functionAddress = Functions.System_RegisterCodec;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, description, handle, priority, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_RegisterCodec(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_CODEC_DESCRIPTION *") FMOD_CODEC_DESCRIPTION description, @NativeType("unsigned int *") IntBuffer handle, @NativeType("unsigned int") int priority) {
        if (CHECKS) {
            check(handle, 1);
        }
        return nFMOD_System_RegisterCodec(system, description.address(), memAddress(handle), priority);
    }

    // --- [ FMOD_System_RegisterDSP ] ---

    public static int nFMOD_System_RegisterDSP(long system, long description, long handle) {
        long __functionAddress = Functions.System_RegisterDSP;
        if (CHECKS) {
            check(system);
            FMOD_DSP_DESCRIPTION.validate(description);
        }
        return callPPPI(system, description, handle, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_RegisterDSP(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_DSP_DESCRIPTION const *") FMOD_DSP_DESCRIPTION description, @NativeType("unsigned int *") IntBuffer handle) {
        if (CHECKS) {
            check(handle, 1);
        }
        return nFMOD_System_RegisterDSP(system, description.address(), memAddress(handle));
    }

    // --- [ FMOD_System_RegisterOutput ] ---

    public static int nFMOD_System_RegisterOutput(long system, long description, long handle) {
        long __functionAddress = Functions.System_RegisterOutput;
        if (CHECKS) {
            check(system);
            FMOD_OUTPUT_DESCRIPTION.validate(description);
        }
        return callPPPI(system, description, handle, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_RegisterOutput(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_OUTPUT_DESCRIPTION const *") FMOD_OUTPUT_DESCRIPTION description, @NativeType("unsigned int *") IntBuffer handle) {
        if (CHECKS) {
            check(handle, 1);
        }
        return nFMOD_System_RegisterOutput(system, description.address(), memAddress(handle));
    }

    // --- [ FMOD_System_Init ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Init(@NativeType("FMOD_SYSTEM *") long system, int maxchannels, @NativeType("FMOD_INITFLAGS") int flags, @NativeType("void *") long extradriverdata) {
        long __functionAddress = Functions.System_Init;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, maxchannels, flags, extradriverdata, __functionAddress);
    }

    // --- [ FMOD_System_Close ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Close(@NativeType("FMOD_SYSTEM *") long system) {
        long __functionAddress = Functions.System_Close;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_System_Update ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Update(@NativeType("FMOD_SYSTEM *") long system) {
        long __functionAddress = Functions.System_Update;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_System_SetSpeakerPosition ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetSpeakerPosition(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_SPEAKER") int speaker, float x, float y, @NativeType("FMOD_BOOL") int active) {
        long __functionAddress = Functions.System_SetSpeakerPosition;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, speaker, x, y, active, __functionAddress);
    }

    // --- [ FMOD_System_GetSpeakerPosition ] ---

    public static int nFMOD_System_GetSpeakerPosition(long system, int speaker, long x, long y, long active) {
        long __functionAddress = Functions.System_GetSpeakerPosition;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, speaker, x, y, active, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetSpeakerPosition(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_SPEAKER") int speaker, @Nullable @NativeType("float *") FloatBuffer x, @Nullable @NativeType("float *") FloatBuffer y, @Nullable @NativeType("FMOD_BOOL *") IntBuffer active) {
        if (CHECKS) {
            checkSafe(x, 1);
            checkSafe(y, 1);
            checkSafe(active, 1);
        }
        return nFMOD_System_GetSpeakerPosition(system, speaker, memAddressSafe(x), memAddressSafe(y), memAddressSafe(active));
    }

    // --- [ FMOD_System_SetStreamBufferSize ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetStreamBufferSize(@NativeType("FMOD_SYSTEM *") long system, @NativeType("unsigned int") int filebuffersize, @NativeType("FMOD_TIMEUNIT") int filebuffersizetype) {
        long __functionAddress = Functions.System_SetStreamBufferSize;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, filebuffersize, filebuffersizetype, __functionAddress);
    }

    // --- [ FMOD_System_GetStreamBufferSize ] ---

    public static int nFMOD_System_GetStreamBufferSize(long system, long filebuffersize, long filebuffersizetype) {
        long __functionAddress = Functions.System_GetStreamBufferSize;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, filebuffersize, filebuffersizetype, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetStreamBufferSize(@NativeType("FMOD_SYSTEM *") long system, @Nullable @NativeType("unsigned int *") IntBuffer filebuffersize, @Nullable @NativeType("FMOD_TIMEUNIT *") IntBuffer filebuffersizetype) {
        if (CHECKS) {
            checkSafe(filebuffersize, 1);
            checkSafe(filebuffersizetype, 1);
        }
        return nFMOD_System_GetStreamBufferSize(system, memAddressSafe(filebuffersize), memAddressSafe(filebuffersizetype));
    }

    // --- [ FMOD_System_Set3DSettings ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Set3DSettings(@NativeType("FMOD_SYSTEM *") long system, float dopplerscale, float distancefactor, float rolloffscale) {
        long __functionAddress = Functions.System_Set3DSettings;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, dopplerscale, distancefactor, rolloffscale, __functionAddress);
    }

    // --- [ FMOD_System_Get3DSettings ] ---

    public static int nFMOD_System_Get3DSettings(long system, long dopplerscale, long distancefactor, long rolloffscale) {
        long __functionAddress = Functions.System_Get3DSettings;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, dopplerscale, distancefactor, rolloffscale, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Get3DSettings(@NativeType("FMOD_SYSTEM *") long system, @Nullable @NativeType("float *") FloatBuffer dopplerscale, @Nullable @NativeType("float *") FloatBuffer distancefactor, @Nullable @NativeType("float *") FloatBuffer rolloffscale) {
        if (CHECKS) {
            checkSafe(dopplerscale, 1);
            checkSafe(distancefactor, 1);
            checkSafe(rolloffscale, 1);
        }
        return nFMOD_System_Get3DSettings(system, memAddressSafe(dopplerscale), memAddressSafe(distancefactor), memAddressSafe(rolloffscale));
    }

    // --- [ FMOD_System_Set3DNumListeners ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Set3DNumListeners(@NativeType("FMOD_SYSTEM *") long system, int numlisteners) {
        long __functionAddress = Functions.System_Set3DNumListeners;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, numlisteners, __functionAddress);
    }

    // --- [ FMOD_System_Get3DNumListeners ] ---

    public static int nFMOD_System_Get3DNumListeners(long system, long numlisteners) {
        long __functionAddress = Functions.System_Get3DNumListeners;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, numlisteners, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Get3DNumListeners(@NativeType("FMOD_SYSTEM *") long system, @NativeType("int *") IntBuffer numlisteners) {
        if (CHECKS) {
            check(numlisteners, 1);
        }
        return nFMOD_System_Get3DNumListeners(system, memAddress(numlisteners));
    }

    // --- [ FMOD_System_Set3DListenerAttributes ] ---

    public static int nFMOD_System_Set3DListenerAttributes(long system, int listener, long pos, long vel, long forward, long up) {
        long __functionAddress = Functions.System_Set3DListenerAttributes;
        if (CHECKS) {
            check(system);
        }
        return callPPPPPI(system, listener, pos, vel, forward, up, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Set3DListenerAttributes(@NativeType("FMOD_SYSTEM *") long system, int listener, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR pos, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR vel, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR forward, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR up) {
        return nFMOD_System_Set3DListenerAttributes(system, listener, memAddressSafe(pos), memAddressSafe(vel), memAddressSafe(forward), memAddressSafe(up));
    }

    // --- [ FMOD_System_Get3DListenerAttributes ] ---

    public static int nFMOD_System_Get3DListenerAttributes(long system, int listener, long pos, long vel, long forward, long up) {
        long __functionAddress = Functions.System_Get3DListenerAttributes;
        if (CHECKS) {
            check(system);
        }
        return callPPPPPI(system, listener, pos, vel, forward, up, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Get3DListenerAttributes(@NativeType("FMOD_SYSTEM *") long system, int listener, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR pos, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR vel, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR forward, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR up) {
        return nFMOD_System_Get3DListenerAttributes(system, listener, memAddressSafe(pos), memAddressSafe(vel), memAddressSafe(forward), memAddressSafe(up));
    }

    // --- [ FMOD_System_Set3DRolloffCallback ] ---

    public static int nFMOD_System_Set3DRolloffCallback(long system, long callback) {
        long __functionAddress = Functions.System_Set3DRolloffCallback;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, callback, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_Set3DRolloffCallback(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_3D_ROLLOFF_CALLBACK") FMOD_3D_ROLLOFF_CALLBACKI callback) {
        return nFMOD_System_Set3DRolloffCallback(system, callback.address());
    }

    // --- [ FMOD_System_MixerSuspend ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_MixerSuspend(@NativeType("FMOD_SYSTEM *") long system) {
        long __functionAddress = Functions.System_MixerSuspend;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_System_MixerResume ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_MixerResume(@NativeType("FMOD_SYSTEM *") long system) {
        long __functionAddress = Functions.System_MixerResume;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_System_GetDefaultMixMatrix ] ---

    public static int nFMOD_System_GetDefaultMixMatrix(long system, int sourcespeakermode, int targetspeakermode, long matrix, int matrixhop) {
        long __functionAddress = Functions.System_GetDefaultMixMatrix;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, sourcespeakermode, targetspeakermode, matrix, matrixhop, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetDefaultMixMatrix(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_SPEAKERMODE") int sourcespeakermode, @NativeType("FMOD_SPEAKERMODE") int targetspeakermode, @NativeType("float *") FloatBuffer matrix, int matrixhop) {
        return nFMOD_System_GetDefaultMixMatrix(system, sourcespeakermode, targetspeakermode, memAddress(matrix), matrixhop);
    }

    // --- [ FMOD_System_GetSpeakerModeChannels ] ---

    public static int nFMOD_System_GetSpeakerModeChannels(long system, int mode, long channels) {
        long __functionAddress = Functions.System_GetSpeakerModeChannels;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, mode, channels, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetSpeakerModeChannels(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_SPEAKERMODE") int mode, @NativeType("int *") IntBuffer channels) {
        if (CHECKS) {
            check(channels, 1);
        }
        return nFMOD_System_GetSpeakerModeChannels(system, mode, memAddress(channels));
    }

    // --- [ FMOD_System_GetVersion ] ---

    /** Unsafe version of: {@link #FMOD_System_GetVersion System_GetVersion} */
    public static int nFMOD_System_GetVersion(long system, long version) {
        long __functionAddress = Functions.System_GetVersion;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, version, __functionAddress);
    }

    /** System information functions. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetVersion(@NativeType("FMOD_SYSTEM *") long system, @NativeType("unsigned int *") IntBuffer version) {
        if (CHECKS) {
            check(version, 1);
        }
        return nFMOD_System_GetVersion(system, memAddress(version));
    }

    // --- [ FMOD_System_GetOutputHandle ] ---

    public static int nFMOD_System_GetOutputHandle(long system, long handle) {
        long __functionAddress = Functions.System_GetOutputHandle;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, handle, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetOutputHandle(@NativeType("FMOD_SYSTEM *") long system, @NativeType("void **") PointerBuffer handle) {
        if (CHECKS) {
            check(handle, 1);
        }
        return nFMOD_System_GetOutputHandle(system, memAddress(handle));
    }

    // --- [ FMOD_System_GetChannelsPlaying ] ---

    public static int nFMOD_System_GetChannelsPlaying(long system, long channels, long realchannels) {
        long __functionAddress = Functions.System_GetChannelsPlaying;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, channels, realchannels, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetChannelsPlaying(@NativeType("FMOD_SYSTEM *") long system, @Nullable @NativeType("int *") IntBuffer channels, @Nullable @NativeType("int *") IntBuffer realchannels) {
        if (CHECKS) {
            checkSafe(channels, 1);
            checkSafe(realchannels, 1);
        }
        return nFMOD_System_GetChannelsPlaying(system, memAddressSafe(channels), memAddressSafe(realchannels));
    }

    // --- [ FMOD_System_GetCPUUsage ] ---

    public static int nFMOD_System_GetCPUUsage(long system, long usage) {
        long __functionAddress = Functions.System_GetCPUUsage;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, usage, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetCPUUsage(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_CPU_USAGE *") FMOD_CPU_USAGE usage) {
        return nFMOD_System_GetCPUUsage(system, usage.address());
    }

    // --- [ FMOD_System_GetFileUsage ] ---

    public static int nFMOD_System_GetFileUsage(long system, long sampleBytesRead, long streamBytesRead, long otherBytesRead) {
        long __functionAddress = Functions.System_GetFileUsage;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, sampleBytesRead, streamBytesRead, otherBytesRead, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetFileUsage(@NativeType("FMOD_SYSTEM *") long system, @Nullable @NativeType("long long *") LongBuffer sampleBytesRead, @Nullable @NativeType("long long *") LongBuffer streamBytesRead, @Nullable @NativeType("long long *") LongBuffer otherBytesRead) {
        if (CHECKS) {
            checkSafe(sampleBytesRead, 1);
            checkSafe(streamBytesRead, 1);
            checkSafe(otherBytesRead, 1);
        }
        return nFMOD_System_GetFileUsage(system, memAddressSafe(sampleBytesRead), memAddressSafe(streamBytesRead), memAddressSafe(otherBytesRead));
    }

    // --- [ FMOD_System_CreateSound ] ---

    /** Unsafe version of: {@link #FMOD_System_CreateSound System_CreateSound} */
    public static int nFMOD_System_CreateSound(long system, long name_or_data, int mode, long exinfo, long sound) {
        long __functionAddress = Functions.System_CreateSound;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, name_or_data, mode, exinfo, sound, __functionAddress);
    }

    /** Sound/DSP/Channel/FX creation and retrieval. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_CreateSound(@NativeType("FMOD_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name_or_data, @NativeType("FMOD_MODE") int mode, @Nullable @NativeType("FMOD_CREATESOUNDEXINFO *") FMOD_CREATESOUNDEXINFO exinfo, @NativeType("FMOD_SOUND **") PointerBuffer sound) {
        if (CHECKS) {
            check(sound, 1);
        }
        return nFMOD_System_CreateSound(system, memAddress(name_or_data), mode, memAddressSafe(exinfo), memAddress(sound));
    }

    // --- [ FMOD_System_CreateStream ] ---

    public static int nFMOD_System_CreateStream(long system, long name_or_data, int mode, long exinfo, long sound) {
        long __functionAddress = Functions.System_CreateStream;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, name_or_data, mode, exinfo, sound, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_CreateStream(@NativeType("FMOD_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name_or_data, @NativeType("FMOD_MODE") int mode, @Nullable @NativeType("FMOD_CREATESOUNDEXINFO *") FMOD_CREATESOUNDEXINFO exinfo, @NativeType("FMOD_SOUND **") PointerBuffer sound) {
        if (CHECKS) {
            check(sound, 1);
        }
        return nFMOD_System_CreateStream(system, memAddress(name_or_data), mode, memAddressSafe(exinfo), memAddress(sound));
    }

    // --- [ FMOD_System_CreateDSP ] ---

    public static int nFMOD_System_CreateDSP(long system, long description, long dsp) {
        long __functionAddress = Functions.System_CreateDSP;
        if (CHECKS) {
            check(system);
            FMOD_DSP_DESCRIPTION.validate(description);
        }
        return callPPPI(system, description, dsp, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_CreateDSP(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_DSP_DESCRIPTION const *") FMOD_DSP_DESCRIPTION description, @NativeType("FMOD_DSP **") PointerBuffer dsp) {
        if (CHECKS) {
            check(dsp, 1);
        }
        return nFMOD_System_CreateDSP(system, description.address(), memAddress(dsp));
    }

    // --- [ FMOD_System_CreateDSPByType ] ---

    public static int nFMOD_System_CreateDSPByType(long system, int type, long dsp) {
        long __functionAddress = Functions.System_CreateDSPByType;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, type, dsp, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_CreateDSPByType(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_DSP_TYPE") int type, @NativeType("FMOD_DSP **") PointerBuffer dsp) {
        if (CHECKS) {
            check(dsp, 1);
        }
        return nFMOD_System_CreateDSPByType(system, type, memAddress(dsp));
    }

    // --- [ FMOD_System_CreateChannelGroup ] ---

    public static int nFMOD_System_CreateChannelGroup(long system, long name, long channelgroup) {
        long __functionAddress = Functions.System_CreateChannelGroup;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, name, channelgroup, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_CreateChannelGroup(@NativeType("FMOD_SYSTEM *") long system, @Nullable @NativeType("char const *") ByteBuffer name, @NativeType("FMOD_CHANNELGROUP **") PointerBuffer channelgroup) {
        if (CHECKS) {
            checkNT1Safe(name);
            check(channelgroup, 1);
        }
        return nFMOD_System_CreateChannelGroup(system, memAddressSafe(name), memAddress(channelgroup));
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_CreateChannelGroup(@NativeType("FMOD_SYSTEM *") long system, @Nullable @NativeType("char const *") CharSequence name, @NativeType("FMOD_CHANNELGROUP **") PointerBuffer channelgroup) {
        if (CHECKS) {
            check(channelgroup, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nFMOD_System_CreateChannelGroup(system, nameEncoded, memAddress(channelgroup));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_System_CreateSoundGroup ] ---

    public static int nFMOD_System_CreateSoundGroup(long system, long name, long soundgroup) {
        long __functionAddress = Functions.System_CreateSoundGroup;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, name, soundgroup, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_CreateSoundGroup(@NativeType("FMOD_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name, @NativeType("FMOD_SOUNDGROUP **") PointerBuffer soundgroup) {
        if (CHECKS) {
            checkNT1(name);
            check(soundgroup, 1);
        }
        return nFMOD_System_CreateSoundGroup(system, memAddress(name), memAddress(soundgroup));
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_CreateSoundGroup(@NativeType("FMOD_SYSTEM *") long system, @NativeType("char const *") CharSequence name, @NativeType("FMOD_SOUNDGROUP **") PointerBuffer soundgroup) {
        if (CHECKS) {
            check(soundgroup, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_System_CreateSoundGroup(system, nameEncoded, memAddress(soundgroup));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_System_CreateReverb3D ] ---

    public static int nFMOD_System_CreateReverb3D(long system, long reverb) {
        long __functionAddress = Functions.System_CreateReverb3D;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, reverb, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_CreateReverb3D(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_REVERB3D **") PointerBuffer reverb) {
        if (CHECKS) {
            check(reverb, 1);
        }
        return nFMOD_System_CreateReverb3D(system, memAddress(reverb));
    }

    // --- [ FMOD_System_PlaySound ] ---

    public static int nFMOD_System_PlaySound(long system, long sound, long channelgroup, int paused, long channel) {
        long __functionAddress = Functions.System_PlaySound;
        if (CHECKS) {
            check(system);
            check(sound);
        }
        return callPPPPI(system, sound, channelgroup, paused, channel, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_PlaySound(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_SOUND *") long sound, @NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_BOOL") int paused, @Nullable @NativeType("FMOD_CHANNEL **") PointerBuffer channel) {
        if (CHECKS) {
            checkSafe(channel, 1);
        }
        return nFMOD_System_PlaySound(system, sound, channelgroup, paused, memAddressSafe(channel));
    }

    // --- [ FMOD_System_PlayDSP ] ---

    public static int nFMOD_System_PlayDSP(long system, long dsp, long channelgroup, int paused, long channel) {
        long __functionAddress = Functions.System_PlayDSP;
        if (CHECKS) {
            check(system);
            check(dsp);
        }
        return callPPPPI(system, dsp, channelgroup, paused, channel, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_PlayDSP(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_BOOL") int paused, @Nullable @NativeType("FMOD_CHANNEL **") PointerBuffer channel) {
        if (CHECKS) {
            checkSafe(channel, 1);
        }
        return nFMOD_System_PlayDSP(system, dsp, channelgroup, paused, memAddressSafe(channel));
    }

    // --- [ FMOD_System_GetChannel ] ---

    public static int nFMOD_System_GetChannel(long system, int channelid, long channel) {
        long __functionAddress = Functions.System_GetChannel;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, channelid, channel, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetChannel(@NativeType("FMOD_SYSTEM *") long system, int channelid, @NativeType("FMOD_CHANNEL **") PointerBuffer channel) {
        if (CHECKS) {
            check(channel, 1);
        }
        return nFMOD_System_GetChannel(system, channelid, memAddress(channel));
    }

    // --- [ FMOD_System_GetDSPInfoByType ] ---

    public static int nFMOD_System_GetDSPInfoByType(long system, int type, long description) {
        long __functionAddress = Functions.System_GetDSPInfoByType;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, type, description, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetDSPInfoByType(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_DSP_TYPE") int type, @NativeType("FMOD_DSP_DESCRIPTION const **") PointerBuffer description) {
        if (CHECKS) {
            check(description, 1);
        }
        return nFMOD_System_GetDSPInfoByType(system, type, memAddress(description));
    }

    // --- [ FMOD_System_GetMasterChannelGroup ] ---

    public static int nFMOD_System_GetMasterChannelGroup(long system, long channelgroup) {
        long __functionAddress = Functions.System_GetMasterChannelGroup;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, channelgroup, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetMasterChannelGroup(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_CHANNELGROUP **") PointerBuffer channelgroup) {
        if (CHECKS) {
            check(channelgroup, 1);
        }
        return nFMOD_System_GetMasterChannelGroup(system, memAddress(channelgroup));
    }

    // --- [ FMOD_System_GetMasterSoundGroup ] ---

    public static int nFMOD_System_GetMasterSoundGroup(long system, long soundgroup) {
        long __functionAddress = Functions.System_GetMasterSoundGroup;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, soundgroup, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetMasterSoundGroup(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_SOUNDGROUP **") PointerBuffer soundgroup) {
        if (CHECKS) {
            check(soundgroup, 1);
        }
        return nFMOD_System_GetMasterSoundGroup(system, memAddress(soundgroup));
    }

    // --- [ FMOD_System_AttachChannelGroupToPort ] ---

    /** Routing to ports. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_AttachChannelGroupToPort(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_PORT_TYPE") int portType, @NativeType("FMOD_PORT_INDEX") long portIndex, @NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_BOOL") int passThru) {
        long __functionAddress = Functions.System_AttachChannelGroupToPort;
        if (CHECKS) {
            check(system);
            check(channelgroup);
        }
        return callPJPI(system, portType, portIndex, channelgroup, passThru, __functionAddress);
    }

    // --- [ FMOD_System_DetachChannelGroupFromPort ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_DetachChannelGroupFromPort(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_CHANNELGROUP *") long channelgroup) {
        long __functionAddress = Functions.System_DetachChannelGroupFromPort;
        if (CHECKS) {
            check(system);
            check(channelgroup);
        }
        return callPPI(system, channelgroup, __functionAddress);
    }

    // --- [ FMOD_System_SetReverbProperties ] ---

    /** Unsafe version of: {@link #FMOD_System_SetReverbProperties System_SetReverbProperties} */
    public static int nFMOD_System_SetReverbProperties(long system, int instance, long prop) {
        long __functionAddress = Functions.System_SetReverbProperties;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, instance, prop, __functionAddress);
    }

    /** Reverb API. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetReverbProperties(@NativeType("FMOD_SYSTEM *") long system, int instance, @Nullable @NativeType("FMOD_REVERB_PROPERTIES const *") FMOD_REVERB_PROPERTIES prop) {
        return nFMOD_System_SetReverbProperties(system, instance, memAddressSafe(prop));
    }

    // --- [ FMOD_System_GetReverbProperties ] ---

    public static int nFMOD_System_GetReverbProperties(long system, int instance, long prop) {
        long __functionAddress = Functions.System_GetReverbProperties;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, instance, prop, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetReverbProperties(@NativeType("FMOD_SYSTEM *") long system, int instance, @NativeType("FMOD_REVERB_PROPERTIES *") FMOD_REVERB_PROPERTIES prop) {
        return nFMOD_System_GetReverbProperties(system, instance, prop.address());
    }

    // --- [ FMOD_System_LockDSP ] ---

    /** System level DSP functionality. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_LockDSP(@NativeType("FMOD_SYSTEM *") long system) {
        long __functionAddress = Functions.System_LockDSP;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_System_UnlockDSP ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_UnlockDSP(@NativeType("FMOD_SYSTEM *") long system) {
        long __functionAddress = Functions.System_UnlockDSP;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_System_GetRecordNumDrivers ] ---

    /** Unsafe version of: {@link #FMOD_System_GetRecordNumDrivers System_GetRecordNumDrivers} */
    public static int nFMOD_System_GetRecordNumDrivers(long system, long numdrivers, long numconnected) {
        long __functionAddress = Functions.System_GetRecordNumDrivers;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, numdrivers, numconnected, __functionAddress);
    }

    /** Recording API. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetRecordNumDrivers(@NativeType("FMOD_SYSTEM *") long system, @Nullable @NativeType("int *") IntBuffer numdrivers, @Nullable @NativeType("int *") IntBuffer numconnected) {
        if (CHECKS) {
            checkSafe(numdrivers, 1);
            checkSafe(numconnected, 1);
        }
        return nFMOD_System_GetRecordNumDrivers(system, memAddressSafe(numdrivers), memAddressSafe(numconnected));
    }

    // --- [ FMOD_System_GetRecordDriverInfo ] ---

    public static int nFMOD_System_GetRecordDriverInfo(long system, int id, long name, int namelen, long guid, long systemrate, long speakermode, long speakermodechannels, long state) {
        long __functionAddress = Functions.System_GetRecordDriverInfo;
        if (CHECKS) {
            check(system);
        }
        return callPPPPPPPI(system, id, name, namelen, guid, systemrate, speakermode, speakermodechannels, state, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetRecordDriverInfo(@NativeType("FMOD_SYSTEM *") long system, int id, @Nullable @NativeType("char *") ByteBuffer name, @Nullable @NativeType("FMOD_GUID *") FMOD_GUID guid, @Nullable @NativeType("int *") IntBuffer systemrate, @Nullable @NativeType("FMOD_SPEAKERMODE *") IntBuffer speakermode, @Nullable @NativeType("int *") IntBuffer speakermodechannels, @Nullable @NativeType("FMOD_DRIVER_STATE *") IntBuffer state) {
        if (CHECKS) {
            checkSafe(systemrate, 1);
            checkSafe(speakermode, 1);
            checkSafe(speakermodechannels, 1);
            checkSafe(state, 1);
        }
        return nFMOD_System_GetRecordDriverInfo(system, id, memAddressSafe(name), remainingSafe(name), memAddressSafe(guid), memAddressSafe(systemrate), memAddressSafe(speakermode), memAddressSafe(speakermodechannels), memAddressSafe(state));
    }

    // --- [ FMOD_System_GetRecordPosition ] ---

    public static int nFMOD_System_GetRecordPosition(long system, int id, long position) {
        long __functionAddress = Functions.System_GetRecordPosition;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, id, position, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetRecordPosition(@NativeType("FMOD_SYSTEM *") long system, int id, @NativeType("unsigned int *") IntBuffer position) {
        if (CHECKS) {
            check(position, 1);
        }
        return nFMOD_System_GetRecordPosition(system, id, memAddress(position));
    }

    // --- [ FMOD_System_RecordStart ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_RecordStart(@NativeType("FMOD_SYSTEM *") long system, int id, @NativeType("FMOD_SOUND *") long sound, @NativeType("FMOD_BOOL") int loop) {
        long __functionAddress = Functions.System_RecordStart;
        if (CHECKS) {
            check(system);
            check(sound);
        }
        return callPPI(system, id, sound, loop, __functionAddress);
    }

    // --- [ FMOD_System_RecordStop ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_RecordStop(@NativeType("FMOD_SYSTEM *") long system, int id) {
        long __functionAddress = Functions.System_RecordStop;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, id, __functionAddress);
    }

    // --- [ FMOD_System_IsRecording ] ---

    public static int nFMOD_System_IsRecording(long system, int id, long recording) {
        long __functionAddress = Functions.System_IsRecording;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, id, recording, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_IsRecording(@NativeType("FMOD_SYSTEM *") long system, int id, @Nullable @NativeType("FMOD_BOOL *") IntBuffer recording) {
        if (CHECKS) {
            checkSafe(recording, 1);
        }
        return nFMOD_System_IsRecording(system, id, memAddressSafe(recording));
    }

    // --- [ FMOD_System_CreateGeometry ] ---

    /** Unsafe version of: {@link #FMOD_System_CreateGeometry System_CreateGeometry} */
    public static int nFMOD_System_CreateGeometry(long system, int maxpolygons, int maxvertices, long geometry) {
        long __functionAddress = Functions.System_CreateGeometry;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, maxpolygons, maxvertices, geometry, __functionAddress);
    }

    /** Geometry API. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_CreateGeometry(@NativeType("FMOD_SYSTEM *") long system, int maxpolygons, int maxvertices, @NativeType("FMOD_GEOMETRY **") PointerBuffer geometry) {
        if (CHECKS) {
            check(geometry, 1);
        }
        return nFMOD_System_CreateGeometry(system, maxpolygons, maxvertices, memAddress(geometry));
    }

    // --- [ FMOD_System_SetGeometrySettings ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetGeometrySettings(@NativeType("FMOD_SYSTEM *") long system, float maxworldsize) {
        long __functionAddress = Functions.System_SetGeometrySettings;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, maxworldsize, __functionAddress);
    }

    // --- [ FMOD_System_GetGeometrySettings ] ---

    public static int nFMOD_System_GetGeometrySettings(long system, long maxworldsize) {
        long __functionAddress = Functions.System_GetGeometrySettings;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, maxworldsize, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetGeometrySettings(@NativeType("FMOD_SYSTEM *") long system, @NativeType("float *") FloatBuffer maxworldsize) {
        if (CHECKS) {
            check(maxworldsize, 1);
        }
        return nFMOD_System_GetGeometrySettings(system, memAddress(maxworldsize));
    }

    // --- [ FMOD_System_LoadGeometry ] ---

    public static int nFMOD_System_LoadGeometry(long system, long data, int datasize, long geometry) {
        long __functionAddress = Functions.System_LoadGeometry;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, data, datasize, geometry, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_LoadGeometry(@NativeType("FMOD_SYSTEM *") long system, @NativeType("void const *") ByteBuffer data, @NativeType("FMOD_GEOMETRY **") PointerBuffer geometry) {
        if (CHECKS) {
            check(geometry, 1);
        }
        return nFMOD_System_LoadGeometry(system, memAddress(data), data.remaining(), memAddress(geometry));
    }

    // --- [ FMOD_System_GetGeometryOcclusion ] ---

    public static int nFMOD_System_GetGeometryOcclusion(long system, long listener, long source, long direct, long reverb) {
        long __functionAddress = Functions.System_GetGeometryOcclusion;
        if (CHECKS) {
            check(system);
        }
        return callPPPPPI(system, listener, source, direct, reverb, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetGeometryOcclusion(@NativeType("FMOD_SYSTEM *") long system, @NativeType("FMOD_VECTOR const *") FMOD_VECTOR listener, @NativeType("FMOD_VECTOR const *") FMOD_VECTOR source, @Nullable @NativeType("float *") FloatBuffer direct, @Nullable @NativeType("float *") FloatBuffer reverb) {
        if (CHECKS) {
            checkSafe(direct, 1);
            checkSafe(reverb, 1);
        }
        return nFMOD_System_GetGeometryOcclusion(system, listener.address(), source.address(), memAddressSafe(direct), memAddressSafe(reverb));
    }

    // --- [ FMOD_System_SetNetworkProxy ] ---

    /** Unsafe version of: {@link #FMOD_System_SetNetworkProxy System_SetNetworkProxy} */
    public static int nFMOD_System_SetNetworkProxy(long system, long proxy) {
        long __functionAddress = Functions.System_SetNetworkProxy;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, proxy, __functionAddress);
    }

    /** Network functions. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetNetworkProxy(@NativeType("FMOD_SYSTEM *") long system, @NativeType("char const *") ByteBuffer proxy) {
        if (CHECKS) {
            checkNT1(proxy);
        }
        return nFMOD_System_SetNetworkProxy(system, memAddress(proxy));
    }

    /** Network functions. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetNetworkProxy(@NativeType("FMOD_SYSTEM *") long system, @NativeType("char const *") CharSequence proxy) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(proxy, true);
            long proxyEncoded = stack.getPointerAddress();
            return nFMOD_System_SetNetworkProxy(system, proxyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_System_GetNetworkProxy ] ---

    public static int nFMOD_System_GetNetworkProxy(long system, long proxy, int proxylen) {
        long __functionAddress = Functions.System_GetNetworkProxy;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, proxy, proxylen, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetNetworkProxy(@NativeType("FMOD_SYSTEM *") long system, @NativeType("char *") ByteBuffer proxy) {
        return nFMOD_System_GetNetworkProxy(system, memAddress(proxy), proxy.remaining());
    }

    // --- [ FMOD_System_SetNetworkTimeout ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetNetworkTimeout(@NativeType("FMOD_SYSTEM *") long system, int timeout) {
        long __functionAddress = Functions.System_SetNetworkTimeout;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, timeout, __functionAddress);
    }

    // --- [ FMOD_System_GetNetworkTimeout ] ---

    public static int nFMOD_System_GetNetworkTimeout(long system, long timeout) {
        long __functionAddress = Functions.System_GetNetworkTimeout;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, timeout, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetNetworkTimeout(@NativeType("FMOD_SYSTEM *") long system, @NativeType("int *") IntBuffer timeout) {
        if (CHECKS) {
            check(timeout, 1);
        }
        return nFMOD_System_GetNetworkTimeout(system, memAddress(timeout));
    }

    // --- [ FMOD_System_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_SetUserData(@NativeType("FMOD_SYSTEM *") long system, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.System_SetUserData;
        if (CHECKS) {
            check(system);
            check(userdata);
        }
        return callPPI(system, userdata, __functionAddress);
    }

    // --- [ FMOD_System_GetUserData ] ---

    public static int nFMOD_System_GetUserData(long system, long userdata) {
        long __functionAddress = Functions.System_GetUserData;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_System_GetUserData(@NativeType("FMOD_SYSTEM *") long system, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_System_GetUserData(system, memAddress(userdata));
    }

    // --- [ FMOD_Sound_Release ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_Release(@NativeType("FMOD_SOUND *") long sound) {
        long __functionAddress = Functions.Sound_Release;
        if (CHECKS) {
            check(sound);
        }
        return callPI(sound, __functionAddress);
    }

    // --- [ FMOD_Sound_GetSystemObject ] ---

    public static int nFMOD_Sound_GetSystemObject(long sound, long system) {
        long __functionAddress = Functions.Sound_GetSystemObject;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, system, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetSystemObject(@NativeType("FMOD_SOUND *") long sound, @NativeType("FMOD_SYSTEM **") PointerBuffer system) {
        if (CHECKS) {
            check(system, 1);
        }
        return nFMOD_Sound_GetSystemObject(sound, memAddress(system));
    }

    // --- [ FMOD_Sound_Lock ] ---

    public static int nFMOD_Sound_Lock(long sound, int offset, int length, long ptr1, long ptr2, long len1, long len2) {
        long __functionAddress = Functions.Sound_Lock;
        if (CHECKS) {
            check(sound);
        }
        return callPPPPPI(sound, offset, length, ptr1, ptr2, len1, len2, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_Lock(@NativeType("FMOD_SOUND *") long sound, @NativeType("unsigned int") int offset, @NativeType("unsigned int") int length, @NativeType("void **") PointerBuffer ptr1, @NativeType("void **") PointerBuffer ptr2, @NativeType("unsigned int *") IntBuffer len1, @NativeType("unsigned int *") IntBuffer len2) {
        if (CHECKS) {
            check(ptr1, 1);
            check(ptr2, 1);
            check(len1, 1);
            check(len2, 1);
        }
        return nFMOD_Sound_Lock(sound, offset, length, memAddress(ptr1), memAddress(ptr2), memAddress(len1), memAddress(len2));
    }

    // --- [ FMOD_Sound_Unlock ] ---

    public static int nFMOD_Sound_Unlock(long sound, long ptr1, long ptr2, int len1, int len2) {
        long __functionAddress = Functions.Sound_Unlock;
        if (CHECKS) {
            check(sound);
        }
        return callPPPI(sound, ptr1, ptr2, len1, len2, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_Unlock(@NativeType("FMOD_SOUND *") long sound, @NativeType("void *") ByteBuffer ptr1, @NativeType("void *") ByteBuffer ptr2) {
        return nFMOD_Sound_Unlock(sound, memAddress(ptr1), memAddress(ptr2), ptr1.remaining(), ptr2.remaining());
    }

    // --- [ FMOD_Sound_SetDefaults ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_SetDefaults(@NativeType("FMOD_SOUND *") long sound, float frequency, int priority) {
        long __functionAddress = Functions.Sound_SetDefaults;
        if (CHECKS) {
            check(sound);
        }
        return callPI(sound, frequency, priority, __functionAddress);
    }

    // --- [ FMOD_Sound_GetDefaults ] ---

    public static int nFMOD_Sound_GetDefaults(long sound, long frequency, long priority) {
        long __functionAddress = Functions.Sound_GetDefaults;
        if (CHECKS) {
            check(sound);
        }
        return callPPPI(sound, frequency, priority, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetDefaults(@NativeType("FMOD_SOUND *") long sound, @Nullable @NativeType("float *") FloatBuffer frequency, @Nullable @NativeType("int *") IntBuffer priority) {
        if (CHECKS) {
            checkSafe(frequency, 1);
            checkSafe(priority, 1);
        }
        return nFMOD_Sound_GetDefaults(sound, memAddressSafe(frequency), memAddressSafe(priority));
    }

    // --- [ FMOD_Sound_Set3DMinMaxDistance ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_Set3DMinMaxDistance(@NativeType("FMOD_SOUND *") long sound, float min, float max) {
        long __functionAddress = Functions.Sound_Set3DMinMaxDistance;
        if (CHECKS) {
            check(sound);
        }
        return callPI(sound, min, max, __functionAddress);
    }

    // --- [ FMOD_Sound_Get3DMinMaxDistance ] ---

    public static int nFMOD_Sound_Get3DMinMaxDistance(long sound, long min, long max) {
        long __functionAddress = Functions.Sound_Get3DMinMaxDistance;
        if (CHECKS) {
            check(sound);
        }
        return callPPPI(sound, min, max, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_Get3DMinMaxDistance(@NativeType("FMOD_SOUND *") long sound, @Nullable @NativeType("float *") FloatBuffer min, @Nullable @NativeType("float *") FloatBuffer max) {
        if (CHECKS) {
            checkSafe(min, 1);
            checkSafe(max, 1);
        }
        return nFMOD_Sound_Get3DMinMaxDistance(sound, memAddressSafe(min), memAddressSafe(max));
    }

    // --- [ FMOD_Sound_Set3DConeSettings ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_Set3DConeSettings(@NativeType("FMOD_SOUND *") long sound, float insideconeangle, float outsideconeangle, float outsidevolume) {
        long __functionAddress = Functions.Sound_Set3DConeSettings;
        if (CHECKS) {
            check(sound);
        }
        return callPI(sound, insideconeangle, outsideconeangle, outsidevolume, __functionAddress);
    }

    // --- [ FMOD_Sound_Get3DConeSettings ] ---

    public static int nFMOD_Sound_Get3DConeSettings(long sound, long insideconeangle, long outsideconeangle, long outsidevolume) {
        long __functionAddress = Functions.Sound_Get3DConeSettings;
        if (CHECKS) {
            check(sound);
        }
        return callPPPPI(sound, insideconeangle, outsideconeangle, outsidevolume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_Get3DConeSettings(@NativeType("FMOD_SOUND *") long sound, @Nullable @NativeType("float *") FloatBuffer insideconeangle, @Nullable @NativeType("float *") FloatBuffer outsideconeangle, @Nullable @NativeType("float *") FloatBuffer outsidevolume) {
        if (CHECKS) {
            checkSafe(insideconeangle, 1);
            checkSafe(outsideconeangle, 1);
            checkSafe(outsidevolume, 1);
        }
        return nFMOD_Sound_Get3DConeSettings(sound, memAddressSafe(insideconeangle), memAddressSafe(outsideconeangle), memAddressSafe(outsidevolume));
    }

    // --- [ FMOD_Sound_Set3DCustomRolloff ] ---

    public static int nFMOD_Sound_Set3DCustomRolloff(long sound, long points, int numpoints) {
        long __functionAddress = Functions.Sound_Set3DCustomRolloff;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, points, numpoints, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_Set3DCustomRolloff(@NativeType("FMOD_SOUND *") long sound, @NativeType("FMOD_VECTOR *") FMOD_VECTOR.Buffer points) {
        return nFMOD_Sound_Set3DCustomRolloff(sound, points.address(), points.remaining());
    }

    // --- [ FMOD_Sound_Get3DCustomRolloff ] ---

    public static int nFMOD_Sound_Get3DCustomRolloff(long sound, long points, long numpoints) {
        long __functionAddress = Functions.Sound_Get3DCustomRolloff;
        if (CHECKS) {
            check(sound);
        }
        return callPPPI(sound, points, numpoints, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_Get3DCustomRolloff(@NativeType("FMOD_SOUND *") long sound, @Nullable @NativeType("FMOD_VECTOR **") PointerBuffer points, @Nullable @NativeType("int *") IntBuffer numpoints) {
        if (CHECKS) {
            checkSafe(points, 1);
            checkSafe(numpoints, 1);
        }
        return nFMOD_Sound_Get3DCustomRolloff(sound, memAddressSafe(points), memAddressSafe(numpoints));
    }

    // --- [ FMOD_Sound_GetSubSound ] ---

    public static int nFMOD_Sound_GetSubSound(long sound, int index, long subsound) {
        long __functionAddress = Functions.Sound_GetSubSound;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, index, subsound, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetSubSound(@NativeType("FMOD_SOUND *") long sound, int index, @NativeType("FMOD_SOUND **") PointerBuffer subsound) {
        if (CHECKS) {
            check(subsound, 1);
        }
        return nFMOD_Sound_GetSubSound(sound, index, memAddress(subsound));
    }

    // --- [ FMOD_Sound_GetSubSoundParent ] ---

    public static int nFMOD_Sound_GetSubSoundParent(long sound, long parentsound) {
        long __functionAddress = Functions.Sound_GetSubSoundParent;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, parentsound, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetSubSoundParent(@NativeType("FMOD_SOUND *") long sound, @NativeType("FMOD_SOUND **") PointerBuffer parentsound) {
        if (CHECKS) {
            check(parentsound, 1);
        }
        return nFMOD_Sound_GetSubSoundParent(sound, memAddress(parentsound));
    }

    // --- [ FMOD_Sound_GetName ] ---

    public static int nFMOD_Sound_GetName(long sound, long name, int namelen) {
        long __functionAddress = Functions.Sound_GetName;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, name, namelen, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetName(@NativeType("FMOD_SOUND *") long sound, @NativeType("char *") ByteBuffer name) {
        return nFMOD_Sound_GetName(sound, memAddress(name), name.remaining());
    }

    // --- [ FMOD_Sound_GetLength ] ---

    public static int nFMOD_Sound_GetLength(long sound, long length, int lengthtype) {
        long __functionAddress = Functions.Sound_GetLength;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, length, lengthtype, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetLength(@NativeType("FMOD_SOUND *") long sound, @NativeType("unsigned int *") IntBuffer length, @NativeType("FMOD_TIMEUNIT") int lengthtype) {
        if (CHECKS) {
            check(length, 1);
        }
        return nFMOD_Sound_GetLength(sound, memAddress(length), lengthtype);
    }

    // --- [ FMOD_Sound_GetFormat ] ---

    public static int nFMOD_Sound_GetFormat(long sound, long type, long format, long channels, long bits) {
        long __functionAddress = Functions.Sound_GetFormat;
        if (CHECKS) {
            check(sound);
        }
        return callPPPPPI(sound, type, format, channels, bits, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetFormat(@NativeType("FMOD_SOUND *") long sound, @Nullable @NativeType("FMOD_SOUND_TYPE *") IntBuffer type, @Nullable @NativeType("FMOD_SOUND_FORMAT *") IntBuffer format, @Nullable @NativeType("int *") IntBuffer channels, @Nullable @NativeType("int *") IntBuffer bits) {
        if (CHECKS) {
            checkSafe(type, 1);
            checkSafe(format, 1);
            checkSafe(channels, 1);
            checkSafe(bits, 1);
        }
        return nFMOD_Sound_GetFormat(sound, memAddressSafe(type), memAddressSafe(format), memAddressSafe(channels), memAddressSafe(bits));
    }

    // --- [ FMOD_Sound_GetNumSubSounds ] ---

    public static int nFMOD_Sound_GetNumSubSounds(long sound, long numsubsounds) {
        long __functionAddress = Functions.Sound_GetNumSubSounds;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, numsubsounds, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetNumSubSounds(@NativeType("FMOD_SOUND *") long sound, @NativeType("int *") IntBuffer numsubsounds) {
        if (CHECKS) {
            check(numsubsounds, 1);
        }
        return nFMOD_Sound_GetNumSubSounds(sound, memAddress(numsubsounds));
    }

    // --- [ FMOD_Sound_GetNumTags ] ---

    public static int nFMOD_Sound_GetNumTags(long sound, long numtags, long numtagsupdated) {
        long __functionAddress = Functions.Sound_GetNumTags;
        if (CHECKS) {
            check(sound);
        }
        return callPPPI(sound, numtags, numtagsupdated, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetNumTags(@NativeType("FMOD_SOUND *") long sound, @Nullable @NativeType("int *") IntBuffer numtags, @Nullable @NativeType("int *") IntBuffer numtagsupdated) {
        if (CHECKS) {
            checkSafe(numtags, 1);
            checkSafe(numtagsupdated, 1);
        }
        return nFMOD_Sound_GetNumTags(sound, memAddressSafe(numtags), memAddressSafe(numtagsupdated));
    }

    // --- [ FMOD_Sound_GetTag ] ---

    public static int nFMOD_Sound_GetTag(long sound, long name, int index, long tag) {
        long __functionAddress = Functions.Sound_GetTag;
        if (CHECKS) {
            check(sound);
        }
        return callPPPI(sound, name, index, tag, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetTag(@NativeType("FMOD_SOUND *") long sound, @NativeType("char const *") ByteBuffer name, int index, @NativeType("FMOD_TAG *") FMOD_TAG tag) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Sound_GetTag(sound, memAddress(name), index, tag.address());
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetTag(@NativeType("FMOD_SOUND *") long sound, @NativeType("char const *") CharSequence name, int index, @NativeType("FMOD_TAG *") FMOD_TAG tag) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Sound_GetTag(sound, nameEncoded, index, tag.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Sound_GetOpenState ] ---

    public static int nFMOD_Sound_GetOpenState(long sound, long openstate, long percentbuffered, long starving, long diskbusy) {
        long __functionAddress = Functions.Sound_GetOpenState;
        if (CHECKS) {
            check(sound);
        }
        return callPPPPPI(sound, openstate, percentbuffered, starving, diskbusy, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetOpenState(@NativeType("FMOD_SOUND *") long sound, @Nullable @NativeType("FMOD_OPENSTATE *") IntBuffer openstate, @Nullable @NativeType("unsigned int *") IntBuffer percentbuffered, @Nullable @NativeType("FMOD_BOOL *") IntBuffer starving, @Nullable @NativeType("FMOD_BOOL *") IntBuffer diskbusy) {
        if (CHECKS) {
            checkSafe(openstate, 1);
            checkSafe(percentbuffered, 1);
            checkSafe(starving, 1);
            checkSafe(diskbusy, 1);
        }
        return nFMOD_Sound_GetOpenState(sound, memAddressSafe(openstate), memAddressSafe(percentbuffered), memAddressSafe(starving), memAddressSafe(diskbusy));
    }

    // --- [ FMOD_Sound_ReadData ] ---

    public static int nFMOD_Sound_ReadData(long sound, long buffer, int length, long read) {
        long __functionAddress = Functions.Sound_ReadData;
        if (CHECKS) {
            check(sound);
        }
        return callPPPI(sound, buffer, length, read, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_ReadData(@NativeType("FMOD_SOUND *") long sound, @NativeType("void *") ByteBuffer buffer, @Nullable @NativeType("unsigned int *") IntBuffer read) {
        if (CHECKS) {
            checkSafe(read, 1);
        }
        return nFMOD_Sound_ReadData(sound, memAddress(buffer), buffer.remaining(), memAddressSafe(read));
    }

    // --- [ FMOD_Sound_SeekData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_SeekData(@NativeType("FMOD_SOUND *") long sound, @NativeType("unsigned int") int pcm) {
        long __functionAddress = Functions.Sound_SeekData;
        if (CHECKS) {
            check(sound);
        }
        return callPI(sound, pcm, __functionAddress);
    }

    // --- [ FMOD_Sound_SetSoundGroup ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_SetSoundGroup(@NativeType("FMOD_SOUND *") long sound, @NativeType("FMOD_SOUNDGROUP *") long soundgroup) {
        long __functionAddress = Functions.Sound_SetSoundGroup;
        if (CHECKS) {
            check(sound);
            check(soundgroup);
        }
        return callPPI(sound, soundgroup, __functionAddress);
    }

    // --- [ FMOD_Sound_GetSoundGroup ] ---

    public static int nFMOD_Sound_GetSoundGroup(long sound, long soundgroup) {
        long __functionAddress = Functions.Sound_GetSoundGroup;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, soundgroup, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetSoundGroup(@NativeType("FMOD_SOUND *") long sound, @NativeType("FMOD_SOUNDGROUP **") PointerBuffer soundgroup) {
        if (CHECKS) {
            check(soundgroup, 1);
        }
        return nFMOD_Sound_GetSoundGroup(sound, memAddress(soundgroup));
    }

    // --- [ FMOD_Sound_GetNumSyncPoints ] ---

    public static int nFMOD_Sound_GetNumSyncPoints(long sound, long numsyncpoints) {
        long __functionAddress = Functions.Sound_GetNumSyncPoints;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, numsyncpoints, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetNumSyncPoints(@NativeType("FMOD_SOUND *") long sound, @NativeType("int *") IntBuffer numsyncpoints) {
        if (CHECKS) {
            check(numsyncpoints, 1);
        }
        return nFMOD_Sound_GetNumSyncPoints(sound, memAddress(numsyncpoints));
    }

    // --- [ FMOD_Sound_GetSyncPoint ] ---

    public static int nFMOD_Sound_GetSyncPoint(long sound, int index, long point) {
        long __functionAddress = Functions.Sound_GetSyncPoint;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, index, point, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetSyncPoint(@NativeType("FMOD_SOUND *") long sound, int index, @NativeType("FMOD_SYNCPOINT **") PointerBuffer point) {
        if (CHECKS) {
            check(point, 1);
        }
        return nFMOD_Sound_GetSyncPoint(sound, index, memAddress(point));
    }

    // --- [ FMOD_Sound_GetSyncPointInfo ] ---

    public static int nFMOD_Sound_GetSyncPointInfo(long sound, long point, long name, int namelen, long offset, int offsettype) {
        long __functionAddress = Functions.Sound_GetSyncPointInfo;
        if (CHECKS) {
            check(sound);
            check(point);
        }
        return callPPPPI(sound, point, name, namelen, offset, offsettype, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetSyncPointInfo(@NativeType("FMOD_SOUND *") long sound, @NativeType("FMOD_SYNCPOINT *") long point, @NativeType("char *") ByteBuffer name, @Nullable @NativeType("unsigned int *") IntBuffer offset, @NativeType("FMOD_TIMEUNIT") int offsettype) {
        if (CHECKS) {
            checkSafe(offset, 1);
        }
        return nFMOD_Sound_GetSyncPointInfo(sound, point, memAddress(name), name.remaining(), memAddressSafe(offset), offsettype);
    }

    // --- [ FMOD_Sound_AddSyncPoint ] ---

    public static int nFMOD_Sound_AddSyncPoint(long sound, int offset, int offsettype, long name, long point) {
        long __functionAddress = Functions.Sound_AddSyncPoint;
        if (CHECKS) {
            check(sound);
        }
        return callPPPI(sound, offset, offsettype, name, point, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_AddSyncPoint(@NativeType("FMOD_SOUND *") long sound, @NativeType("unsigned int") int offset, @NativeType("FMOD_TIMEUNIT") int offsettype, @NativeType("char const *") ByteBuffer name, @Nullable @NativeType("FMOD_SYNCPOINT **") PointerBuffer point) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(point, 1);
        }
        return nFMOD_Sound_AddSyncPoint(sound, offset, offsettype, memAddress(name), memAddressSafe(point));
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_AddSyncPoint(@NativeType("FMOD_SOUND *") long sound, @NativeType("unsigned int") int offset, @NativeType("FMOD_TIMEUNIT") int offsettype, @NativeType("char const *") CharSequence name, @Nullable @NativeType("FMOD_SYNCPOINT **") PointerBuffer point) {
        if (CHECKS) {
            checkSafe(point, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Sound_AddSyncPoint(sound, offset, offsettype, nameEncoded, memAddressSafe(point));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Sound_DeleteSyncPoint ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_DeleteSyncPoint(@NativeType("FMOD_SOUND *") long sound, @NativeType("FMOD_SYNCPOINT *") long point) {
        long __functionAddress = Functions.Sound_DeleteSyncPoint;
        if (CHECKS) {
            check(sound);
            check(point);
        }
        return callPPI(sound, point, __functionAddress);
    }

    // --- [ FMOD_Sound_SetMode ] ---

    /** Functions also in Channel class but here they are the 'default' to save having to change it in Channel all the time. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_SetMode(@NativeType("FMOD_SOUND *") long sound, @NativeType("FMOD_MODE") int mode) {
        long __functionAddress = Functions.Sound_SetMode;
        if (CHECKS) {
            check(sound);
        }
        return callPI(sound, mode, __functionAddress);
    }

    // --- [ FMOD_Sound_GetMode ] ---

    public static int nFMOD_Sound_GetMode(long sound, long mode) {
        long __functionAddress = Functions.Sound_GetMode;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, mode, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetMode(@NativeType("FMOD_SOUND *") long sound, @NativeType("FMOD_MODE *") IntBuffer mode) {
        if (CHECKS) {
            check(mode, 1);
        }
        return nFMOD_Sound_GetMode(sound, memAddress(mode));
    }

    // --- [ FMOD_Sound_SetLoopCount ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_SetLoopCount(@NativeType("FMOD_SOUND *") long sound, int loopcount) {
        long __functionAddress = Functions.Sound_SetLoopCount;
        if (CHECKS) {
            check(sound);
        }
        return callPI(sound, loopcount, __functionAddress);
    }

    // --- [ FMOD_Sound_GetLoopCount ] ---

    public static int nFMOD_Sound_GetLoopCount(long sound, long loopcount) {
        long __functionAddress = Functions.Sound_GetLoopCount;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, loopcount, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetLoopCount(@NativeType("FMOD_SOUND *") long sound, @NativeType("int *") IntBuffer loopcount) {
        if (CHECKS) {
            check(loopcount, 1);
        }
        return nFMOD_Sound_GetLoopCount(sound, memAddress(loopcount));
    }

    // --- [ FMOD_Sound_SetLoopPoints ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_SetLoopPoints(@NativeType("FMOD_SOUND *") long sound, @NativeType("unsigned int") int loopstart, @NativeType("FMOD_TIMEUNIT") int loopstarttype, @NativeType("unsigned int") int loopend, @NativeType("FMOD_TIMEUNIT") int loopendtype) {
        long __functionAddress = Functions.Sound_SetLoopPoints;
        if (CHECKS) {
            check(sound);
        }
        return callPI(sound, loopstart, loopstarttype, loopend, loopendtype, __functionAddress);
    }

    // --- [ FMOD_Sound_GetLoopPoints ] ---

    public static int nFMOD_Sound_GetLoopPoints(long sound, long loopstart, int loopstarttype, long loopend, int loopendtype) {
        long __functionAddress = Functions.Sound_GetLoopPoints;
        if (CHECKS) {
            check(sound);
        }
        return callPPPI(sound, loopstart, loopstarttype, loopend, loopendtype, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetLoopPoints(@NativeType("FMOD_SOUND *") long sound, @Nullable @NativeType("unsigned int *") IntBuffer loopstart, @NativeType("FMOD_TIMEUNIT") int loopstarttype, @Nullable @NativeType("unsigned int *") IntBuffer loopend, @NativeType("FMOD_TIMEUNIT") int loopendtype) {
        if (CHECKS) {
            checkSafe(loopstart, 1);
            checkSafe(loopend, 1);
        }
        return nFMOD_Sound_GetLoopPoints(sound, memAddressSafe(loopstart), loopstarttype, memAddressSafe(loopend), loopendtype);
    }

    // --- [ FMOD_Sound_GetMusicNumChannels ] ---

    public static int nFMOD_Sound_GetMusicNumChannels(long sound, long numchannels) {
        long __functionAddress = Functions.Sound_GetMusicNumChannels;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, numchannels, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetMusicNumChannels(@NativeType("FMOD_SOUND *") long sound, @NativeType("int *") IntBuffer numchannels) {
        if (CHECKS) {
            check(numchannels, 1);
        }
        return nFMOD_Sound_GetMusicNumChannels(sound, memAddress(numchannels));
    }

    // --- [ FMOD_Sound_SetMusicChannelVolume ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_SetMusicChannelVolume(@NativeType("FMOD_SOUND *") long sound, int channel, float volume) {
        long __functionAddress = Functions.Sound_SetMusicChannelVolume;
        if (CHECKS) {
            check(sound);
        }
        return callPI(sound, channel, volume, __functionAddress);
    }

    // --- [ FMOD_Sound_GetMusicChannelVolume ] ---

    public static int nFMOD_Sound_GetMusicChannelVolume(long sound, int channel, long volume) {
        long __functionAddress = Functions.Sound_GetMusicChannelVolume;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, channel, volume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetMusicChannelVolume(@NativeType("FMOD_SOUND *") long sound, int channel, @NativeType("float *") FloatBuffer volume) {
        if (CHECKS) {
            check(volume, 1);
        }
        return nFMOD_Sound_GetMusicChannelVolume(sound, channel, memAddress(volume));
    }

    // --- [ FMOD_Sound_SetMusicSpeed ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_SetMusicSpeed(@NativeType("FMOD_SOUND *") long sound, float speed) {
        long __functionAddress = Functions.Sound_SetMusicSpeed;
        if (CHECKS) {
            check(sound);
        }
        return callPI(sound, speed, __functionAddress);
    }

    // --- [ FMOD_Sound_GetMusicSpeed ] ---

    public static int nFMOD_Sound_GetMusicSpeed(long sound, long speed) {
        long __functionAddress = Functions.Sound_GetMusicSpeed;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, speed, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetMusicSpeed(@NativeType("FMOD_SOUND *") long sound, @NativeType("float *") FloatBuffer speed) {
        if (CHECKS) {
            check(speed, 1);
        }
        return nFMOD_Sound_GetMusicSpeed(sound, memAddress(speed));
    }

    // --- [ FMOD_Sound_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_SetUserData(@NativeType("FMOD_SOUND *") long sound, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.Sound_SetUserData;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, userdata, __functionAddress);
    }

    // --- [ FMOD_Sound_GetUserData ] ---

    public static int nFMOD_Sound_GetUserData(long sound, long userdata) {
        long __functionAddress = Functions.Sound_GetUserData;
        if (CHECKS) {
            check(sound);
        }
        return callPPI(sound, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Sound_GetUserData(@NativeType("FMOD_SOUND *") long sound, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Sound_GetUserData(sound, memAddress(userdata));
    }

    // --- [ FMOD_Channel_GetSystemObject ] ---

    public static int nFMOD_Channel_GetSystemObject(long channel, long system) {
        long __functionAddress = Functions.Channel_GetSystemObject;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, system, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetSystemObject(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_SYSTEM **") PointerBuffer system) {
        if (CHECKS) {
            check(system, 1);
        }
        return nFMOD_Channel_GetSystemObject(channel, memAddress(system));
    }

    // --- [ FMOD_Channel_Stop ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Stop(@NativeType("FMOD_CHANNEL *") long channel) {
        long __functionAddress = Functions.Channel_Stop;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, __functionAddress);
    }

    // --- [ FMOD_Channel_SetPaused ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetPaused(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_BOOL") int paused) {
        long __functionAddress = Functions.Channel_SetPaused;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, paused, __functionAddress);
    }

    // --- [ FMOD_Channel_GetPaused ] ---

    public static int nFMOD_Channel_GetPaused(long channel, long paused) {
        long __functionAddress = Functions.Channel_GetPaused;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, paused, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetPaused(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_BOOL *") IntBuffer paused) {
        if (CHECKS) {
            check(paused, 1);
        }
        return nFMOD_Channel_GetPaused(channel, memAddress(paused));
    }

    // --- [ FMOD_Channel_SetVolume ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetVolume(@NativeType("FMOD_CHANNEL *") long channel, float volume) {
        long __functionAddress = Functions.Channel_SetVolume;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, volume, __functionAddress);
    }

    // --- [ FMOD_Channel_GetVolume ] ---

    public static int nFMOD_Channel_GetVolume(long channel, long volume) {
        long __functionAddress = Functions.Channel_GetVolume;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, volume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetVolume(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("float *") FloatBuffer volume) {
        if (CHECKS) {
            check(volume, 1);
        }
        return nFMOD_Channel_GetVolume(channel, memAddress(volume));
    }

    // --- [ FMOD_Channel_SetVolumeRamp ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetVolumeRamp(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_BOOL") int ramp) {
        long __functionAddress = Functions.Channel_SetVolumeRamp;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, ramp, __functionAddress);
    }

    // --- [ FMOD_Channel_GetVolumeRamp ] ---

    public static int nFMOD_Channel_GetVolumeRamp(long channel, long ramp) {
        long __functionAddress = Functions.Channel_GetVolumeRamp;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, ramp, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetVolumeRamp(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_BOOL *") IntBuffer ramp) {
        if (CHECKS) {
            check(ramp, 1);
        }
        return nFMOD_Channel_GetVolumeRamp(channel, memAddress(ramp));
    }

    // --- [ FMOD_Channel_GetAudibility ] ---

    public static int nFMOD_Channel_GetAudibility(long channel, long audibility) {
        long __functionAddress = Functions.Channel_GetAudibility;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, audibility, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetAudibility(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("float *") FloatBuffer audibility) {
        if (CHECKS) {
            check(audibility, 1);
        }
        return nFMOD_Channel_GetAudibility(channel, memAddress(audibility));
    }

    // --- [ FMOD_Channel_SetPitch ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetPitch(@NativeType("FMOD_CHANNEL *") long channel, float pitch) {
        long __functionAddress = Functions.Channel_SetPitch;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, pitch, __functionAddress);
    }

    // --- [ FMOD_Channel_GetPitch ] ---

    public static int nFMOD_Channel_GetPitch(long channel, long pitch) {
        long __functionAddress = Functions.Channel_GetPitch;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, pitch, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetPitch(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("float *") FloatBuffer pitch) {
        if (CHECKS) {
            check(pitch, 1);
        }
        return nFMOD_Channel_GetPitch(channel, memAddress(pitch));
    }

    // --- [ FMOD_Channel_SetMute ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetMute(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_BOOL") int mute) {
        long __functionAddress = Functions.Channel_SetMute;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, mute, __functionAddress);
    }

    // --- [ FMOD_Channel_GetMute ] ---

    public static int nFMOD_Channel_GetMute(long channel, long mute) {
        long __functionAddress = Functions.Channel_GetMute;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, mute, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetMute(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_BOOL *") IntBuffer mute) {
        if (CHECKS) {
            check(mute, 1);
        }
        return nFMOD_Channel_GetMute(channel, memAddress(mute));
    }

    // --- [ FMOD_Channel_SetReverbProperties ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetReverbProperties(@NativeType("FMOD_CHANNEL *") long channel, int instance, float wet) {
        long __functionAddress = Functions.Channel_SetReverbProperties;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, instance, wet, __functionAddress);
    }

    // --- [ FMOD_Channel_GetReverbProperties ] ---

    public static int nFMOD_Channel_GetReverbProperties(long channel, int instance, long wet) {
        long __functionAddress = Functions.Channel_GetReverbProperties;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, instance, wet, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetReverbProperties(@NativeType("FMOD_CHANNEL *") long channel, int instance, @NativeType("float *") FloatBuffer wet) {
        if (CHECKS) {
            check(wet, 1);
        }
        return nFMOD_Channel_GetReverbProperties(channel, instance, memAddress(wet));
    }

    // --- [ FMOD_Channel_SetLowPassGain ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetLowPassGain(@NativeType("FMOD_CHANNEL *") long channel, float gain) {
        long __functionAddress = Functions.Channel_SetLowPassGain;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, gain, __functionAddress);
    }

    // --- [ FMOD_Channel_GetLowPassGain ] ---

    public static int nFMOD_Channel_GetLowPassGain(long channel, long gain) {
        long __functionAddress = Functions.Channel_GetLowPassGain;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, gain, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetLowPassGain(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("float *") FloatBuffer gain) {
        if (CHECKS) {
            check(gain, 1);
        }
        return nFMOD_Channel_GetLowPassGain(channel, memAddress(gain));
    }

    // --- [ FMOD_Channel_SetMode ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetMode(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_MODE") int mode) {
        long __functionAddress = Functions.Channel_SetMode;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, mode, __functionAddress);
    }

    // --- [ FMOD_Channel_GetMode ] ---

    public static int nFMOD_Channel_GetMode(long channel, long mode) {
        long __functionAddress = Functions.Channel_GetMode;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, mode, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetMode(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_MODE *") IntBuffer mode) {
        if (CHECKS) {
            check(mode, 1);
        }
        return nFMOD_Channel_GetMode(channel, memAddress(mode));
    }

    // --- [ FMOD_Channel_SetCallback ] ---

    public static int nFMOD_Channel_SetCallback(long channel, long callback) {
        long __functionAddress = Functions.Channel_SetCallback;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, callback, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetCallback(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("FMOD_CHANNELCONTROL_CALLBACK") FMOD_CHANNELCONTROL_CALLBACKI callback) {
        return nFMOD_Channel_SetCallback(channel, memAddressSafe(callback));
    }

    // --- [ FMOD_Channel_IsPlaying ] ---

    public static int nFMOD_Channel_IsPlaying(long channel, long isplaying) {
        long __functionAddress = Functions.Channel_IsPlaying;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, isplaying, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_IsPlaying(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_BOOL *") IntBuffer isplaying) {
        if (CHECKS) {
            check(isplaying, 1);
        }
        return nFMOD_Channel_IsPlaying(channel, memAddress(isplaying));
    }

    // --- [ FMOD_Channel_SetPan ] ---

    /**
     * Note all 'set' functions alter a final matrix, this is why the only get function is getMixMatrix, to avoid other get functions returning
     * incorrect/obsolete values.
     */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetPan(@NativeType("FMOD_CHANNEL *") long channel, float pan) {
        long __functionAddress = Functions.Channel_SetPan;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, pan, __functionAddress);
    }

    // --- [ FMOD_Channel_SetMixLevelsOutput ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetMixLevelsOutput(@NativeType("FMOD_CHANNEL *") long channel, float frontleft, float frontright, float center, float lfe, float surroundleft, float surroundright, float backleft, float backright) {
        long __functionAddress = Functions.Channel_SetMixLevelsOutput;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, frontleft, frontright, center, lfe, surroundleft, surroundright, backleft, backright, __functionAddress);
    }

    // --- [ FMOD_Channel_SetMixLevelsInput ] ---

    public static int nFMOD_Channel_SetMixLevelsInput(long channel, long levels, int numlevels) {
        long __functionAddress = Functions.Channel_SetMixLevelsInput;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, levels, numlevels, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetMixLevelsInput(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("float *") FloatBuffer levels) {
        return nFMOD_Channel_SetMixLevelsInput(channel, memAddress(levels), levels.remaining());
    }

    // --- [ FMOD_Channel_SetMixMatrix ] ---

    public static int nFMOD_Channel_SetMixMatrix(long channel, long matrix, int outchannels, int inchannels, int inchannel_hop) {
        long __functionAddress = Functions.Channel_SetMixMatrix;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, matrix, outchannels, inchannels, inchannel_hop, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetMixMatrix(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("float *") FloatBuffer matrix, int outchannels, int inchannels, int inchannel_hop) {
        if (CHECKS) {
            checkSafe(matrix, outchannels * (inchannel_hop == 0 ? inchannels : inchannel_hop));
        }
        return nFMOD_Channel_SetMixMatrix(channel, memAddressSafe(matrix), outchannels, inchannels, inchannel_hop);
    }

    // --- [ FMOD_Channel_GetMixMatrix ] ---

    public static int nFMOD_Channel_GetMixMatrix(long channel, long matrix, long outchannels, long inchannels, int inchannel_hop) {
        long __functionAddress = Functions.Channel_GetMixMatrix;
        if (CHECKS) {
            check(channel);
        }
        return callPPPPI(channel, matrix, outchannels, inchannels, inchannel_hop, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetMixMatrix(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("float *") FloatBuffer matrix, @Nullable @NativeType("int *") IntBuffer outchannels, @Nullable @NativeType("int *") IntBuffer inchannels, int inchannel_hop) {
        if (CHECKS) {
            checkSafe(outchannels, 1);
            checkSafe(inchannels, 1);
        }
        return nFMOD_Channel_GetMixMatrix(channel, memAddressSafe(matrix), memAddressSafe(outchannels), memAddressSafe(inchannels), inchannel_hop);
    }

    // --- [ FMOD_Channel_GetDSPClock ] ---

    /** Unsafe version of: {@link #FMOD_Channel_GetDSPClock Channel_GetDSPClock} */
    public static int nFMOD_Channel_GetDSPClock(long channel, long dspclock, long parentclock) {
        long __functionAddress = Functions.Channel_GetDSPClock;
        if (CHECKS) {
            check(channel);
        }
        return callPPPI(channel, dspclock, parentclock, __functionAddress);
    }

    /** Clock based functionality. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetDSPClock(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("unsigned long long *") LongBuffer dspclock, @Nullable @NativeType("unsigned long long *") LongBuffer parentclock) {
        if (CHECKS) {
            checkSafe(dspclock, 1);
            checkSafe(parentclock, 1);
        }
        return nFMOD_Channel_GetDSPClock(channel, memAddressSafe(dspclock), memAddressSafe(parentclock));
    }

    // --- [ FMOD_Channel_SetDelay ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetDelay(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("unsigned long long") long dspclock_start, @NativeType("unsigned long long") long dspclock_end, @NativeType("FMOD_BOOL") int stopchannels) {
        long __functionAddress = Functions.Channel_SetDelay;
        if (CHECKS) {
            check(channel);
        }
        return callPJJI(channel, dspclock_start, dspclock_end, stopchannels, __functionAddress);
    }

    // --- [ FMOD_Channel_GetDelay ] ---

    public static int nFMOD_Channel_GetDelay(long channel, long dspclock_start, long dspclock_end, long stopchannels) {
        long __functionAddress = Functions.Channel_GetDelay;
        if (CHECKS) {
            check(channel);
        }
        return callPPPPI(channel, dspclock_start, dspclock_end, stopchannels, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetDelay(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("unsigned long long *") LongBuffer dspclock_start, @Nullable @NativeType("unsigned long long *") LongBuffer dspclock_end, @Nullable @NativeType("FMOD_BOOL *") IntBuffer stopchannels) {
        if (CHECKS) {
            checkSafe(dspclock_start, 1);
            checkSafe(dspclock_end, 1);
            checkSafe(stopchannels, 1);
        }
        return nFMOD_Channel_GetDelay(channel, memAddressSafe(dspclock_start), memAddressSafe(dspclock_end), memAddressSafe(stopchannels));
    }

    // --- [ FMOD_Channel_AddFadePoint ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_AddFadePoint(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("unsigned long long") long dspclock, float volume) {
        long __functionAddress = Functions.Channel_AddFadePoint;
        if (CHECKS) {
            check(channel);
        }
        return callPJI(channel, dspclock, volume, __functionAddress);
    }

    // --- [ FMOD_Channel_SetFadePointRamp ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetFadePointRamp(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("unsigned long long") long dspclock, float volume) {
        long __functionAddress = Functions.Channel_SetFadePointRamp;
        if (CHECKS) {
            check(channel);
        }
        return callPJI(channel, dspclock, volume, __functionAddress);
    }

    // --- [ FMOD_Channel_RemoveFadePoints ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_RemoveFadePoints(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("unsigned long long") long dspclock_start, @NativeType("unsigned long long") long dspclock_end) {
        long __functionAddress = Functions.Channel_RemoveFadePoints;
        if (CHECKS) {
            check(channel);
        }
        return callPJJI(channel, dspclock_start, dspclock_end, __functionAddress);
    }

    // --- [ FMOD_Channel_GetFadePoints ] ---

    public static int nFMOD_Channel_GetFadePoints(long channel, long numpoints, long point_dspclock, long point_volume) {
        long __functionAddress = Functions.Channel_GetFadePoints;
        if (CHECKS) {
            check(channel);
        }
        return callPPPPI(channel, numpoints, point_dspclock, point_volume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetFadePoints(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("unsigned int *") IntBuffer numpoints, @Nullable @NativeType("unsigned long long *") LongBuffer point_dspclock, @Nullable @NativeType("float *") FloatBuffer point_volume) {
        if (CHECKS) {
            check(numpoints, 1);
            checkSafe(point_dspclock, 1);
            checkSafe(point_volume, 1);
        }
        return nFMOD_Channel_GetFadePoints(channel, memAddress(numpoints), memAddressSafe(point_dspclock), memAddressSafe(point_volume));
    }

    // --- [ FMOD_Channel_GetDSP ] ---

    /** Unsafe version of: {@link #FMOD_Channel_GetDSP Channel_GetDSP} */
    public static int nFMOD_Channel_GetDSP(long channel, int index, long dsp) {
        long __functionAddress = Functions.Channel_GetDSP;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, index, dsp, __functionAddress);
    }

    /** DSP effects. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetDSP(@NativeType("FMOD_CHANNEL *") long channel, int index, @NativeType("FMOD_DSP **") PointerBuffer dsp) {
        if (CHECKS) {
            check(dsp, 1);
        }
        return nFMOD_Channel_GetDSP(channel, index, memAddress(dsp));
    }

    // --- [ FMOD_Channel_AddDSP ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_AddDSP(@NativeType("FMOD_CHANNEL *") long channel, int index, @NativeType("FMOD_DSP *") long dsp) {
        long __functionAddress = Functions.Channel_AddDSP;
        if (CHECKS) {
            check(channel);
            check(dsp);
        }
        return callPPI(channel, index, dsp, __functionAddress);
    }

    // --- [ FMOD_Channel_RemoveDSP ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_RemoveDSP(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_DSP *") long dsp) {
        long __functionAddress = Functions.Channel_RemoveDSP;
        if (CHECKS) {
            check(channel);
            check(dsp);
        }
        return callPPI(channel, dsp, __functionAddress);
    }

    // --- [ FMOD_Channel_GetNumDSPs ] ---

    public static int nFMOD_Channel_GetNumDSPs(long channel, long numdsps) {
        long __functionAddress = Functions.Channel_GetNumDSPs;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, numdsps, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetNumDSPs(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("int *") IntBuffer numdsps) {
        if (CHECKS) {
            check(numdsps, 1);
        }
        return nFMOD_Channel_GetNumDSPs(channel, memAddress(numdsps));
    }

    // --- [ FMOD_Channel_SetDSPIndex ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetDSPIndex(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_DSP *") long dsp, int index) {
        long __functionAddress = Functions.Channel_SetDSPIndex;
        if (CHECKS) {
            check(channel);
            check(dsp);
        }
        return callPPI(channel, dsp, index, __functionAddress);
    }

    // --- [ FMOD_Channel_GetDSPIndex ] ---

    public static int nFMOD_Channel_GetDSPIndex(long channel, long dsp, long index) {
        long __functionAddress = Functions.Channel_GetDSPIndex;
        if (CHECKS) {
            check(channel);
            check(dsp);
        }
        return callPPPI(channel, dsp, index, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetDSPIndex(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_DSP *") long dsp, @NativeType("int *") IntBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        return nFMOD_Channel_GetDSPIndex(channel, dsp, memAddress(index));
    }

    // --- [ FMOD_Channel_Set3DAttributes ] ---

    /** Unsafe version of: {@link #FMOD_Channel_Set3DAttributes Channel_Set3DAttributes} */
    public static int nFMOD_Channel_Set3DAttributes(long channel, long pos, long vel) {
        long __functionAddress = Functions.Channel_Set3DAttributes;
        if (CHECKS) {
            check(channel);
        }
        return callPPPI(channel, pos, vel, __functionAddress);
    }

    /** 3D functionality. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Set3DAttributes(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR pos, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR vel) {
        return nFMOD_Channel_Set3DAttributes(channel, memAddressSafe(pos), memAddressSafe(vel));
    }

    // --- [ FMOD_Channel_Get3DAttributes ] ---

    public static int nFMOD_Channel_Get3DAttributes(long channel, long pos, long vel) {
        long __functionAddress = Functions.Channel_Get3DAttributes;
        if (CHECKS) {
            check(channel);
        }
        return callPPPI(channel, pos, vel, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Get3DAttributes(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR pos, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR vel) {
        return nFMOD_Channel_Get3DAttributes(channel, memAddressSafe(pos), memAddressSafe(vel));
    }

    // --- [ FMOD_Channel_Set3DMinMaxDistance ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Set3DMinMaxDistance(@NativeType("FMOD_CHANNEL *") long channel, float mindistance, float maxdistance) {
        long __functionAddress = Functions.Channel_Set3DMinMaxDistance;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, mindistance, maxdistance, __functionAddress);
    }

    // --- [ FMOD_Channel_Get3DMinMaxDistance ] ---

    public static int nFMOD_Channel_Get3DMinMaxDistance(long channel, long mindistance, long maxdistance) {
        long __functionAddress = Functions.Channel_Get3DMinMaxDistance;
        if (CHECKS) {
            check(channel);
        }
        return callPPPI(channel, mindistance, maxdistance, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Get3DMinMaxDistance(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("float *") FloatBuffer mindistance, @Nullable @NativeType("float *") FloatBuffer maxdistance) {
        if (CHECKS) {
            checkSafe(mindistance, 1);
            checkSafe(maxdistance, 1);
        }
        return nFMOD_Channel_Get3DMinMaxDistance(channel, memAddressSafe(mindistance), memAddressSafe(maxdistance));
    }

    // --- [ FMOD_Channel_Set3DConeSettings ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Set3DConeSettings(@NativeType("FMOD_CHANNEL *") long channel, float insideconeangle, float outsideconeangle, float outsidevolume) {
        long __functionAddress = Functions.Channel_Set3DConeSettings;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, insideconeangle, outsideconeangle, outsidevolume, __functionAddress);
    }

    // --- [ FMOD_Channel_Get3DConeSettings ] ---

    public static int nFMOD_Channel_Get3DConeSettings(long channel, long insideconeangle, long outsideconeangle, long outsidevolume) {
        long __functionAddress = Functions.Channel_Get3DConeSettings;
        if (CHECKS) {
            check(channel);
        }
        return callPPPPI(channel, insideconeangle, outsideconeangle, outsidevolume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Get3DConeSettings(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("float *") FloatBuffer insideconeangle, @Nullable @NativeType("float *") FloatBuffer outsideconeangle, @Nullable @NativeType("float *") FloatBuffer outsidevolume) {
        if (CHECKS) {
            checkSafe(insideconeangle, 1);
            checkSafe(outsideconeangle, 1);
            checkSafe(outsidevolume, 1);
        }
        return nFMOD_Channel_Get3DConeSettings(channel, memAddressSafe(insideconeangle), memAddressSafe(outsideconeangle), memAddressSafe(outsidevolume));
    }

    // --- [ FMOD_Channel_Set3DConeOrientation ] ---

    public static int nFMOD_Channel_Set3DConeOrientation(long channel, long orientation) {
        long __functionAddress = Functions.Channel_Set3DConeOrientation;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, orientation, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Set3DConeOrientation(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_VECTOR *") FMOD_VECTOR orientation) {
        return nFMOD_Channel_Set3DConeOrientation(channel, orientation.address());
    }

    // --- [ FMOD_Channel_Get3DConeOrientation ] ---

    public static int nFMOD_Channel_Get3DConeOrientation(long channel, long orientation) {
        long __functionAddress = Functions.Channel_Get3DConeOrientation;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, orientation, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Get3DConeOrientation(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_VECTOR *") FMOD_VECTOR orientation) {
        return nFMOD_Channel_Get3DConeOrientation(channel, orientation.address());
    }

    // --- [ FMOD_Channel_Set3DCustomRolloff ] ---

    public static int nFMOD_Channel_Set3DCustomRolloff(long channel, long points, int numpoints) {
        long __functionAddress = Functions.Channel_Set3DCustomRolloff;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, points, numpoints, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Set3DCustomRolloff(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_VECTOR *") FMOD_VECTOR.Buffer points) {
        return nFMOD_Channel_Set3DCustomRolloff(channel, points.address(), points.remaining());
    }

    // --- [ FMOD_Channel_Get3DCustomRolloff ] ---

    public static int nFMOD_Channel_Get3DCustomRolloff(long channel, long points, long numpoints) {
        long __functionAddress = Functions.Channel_Get3DCustomRolloff;
        if (CHECKS) {
            check(channel);
        }
        return callPPPI(channel, points, numpoints, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Get3DCustomRolloff(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("FMOD_VECTOR **") PointerBuffer points, @Nullable @NativeType("int *") IntBuffer numpoints) {
        if (CHECKS) {
            checkSafe(points, 1);
            checkSafe(numpoints, 1);
        }
        return nFMOD_Channel_Get3DCustomRolloff(channel, memAddressSafe(points), memAddressSafe(numpoints));
    }

    // --- [ FMOD_Channel_Set3DOcclusion ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Set3DOcclusion(@NativeType("FMOD_CHANNEL *") long channel, float directocclusion, float reverbocclusion) {
        long __functionAddress = Functions.Channel_Set3DOcclusion;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, directocclusion, reverbocclusion, __functionAddress);
    }

    // --- [ FMOD_Channel_Get3DOcclusion ] ---

    public static int nFMOD_Channel_Get3DOcclusion(long channel, long directocclusion, long reverbocclusion) {
        long __functionAddress = Functions.Channel_Get3DOcclusion;
        if (CHECKS) {
            check(channel);
        }
        return callPPPI(channel, directocclusion, reverbocclusion, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Get3DOcclusion(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("float *") FloatBuffer directocclusion, @Nullable @NativeType("float *") FloatBuffer reverbocclusion) {
        if (CHECKS) {
            checkSafe(directocclusion, 1);
            checkSafe(reverbocclusion, 1);
        }
        return nFMOD_Channel_Get3DOcclusion(channel, memAddressSafe(directocclusion), memAddressSafe(reverbocclusion));
    }

    // --- [ FMOD_Channel_Set3DSpread ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Set3DSpread(@NativeType("FMOD_CHANNEL *") long channel, float angle) {
        long __functionAddress = Functions.Channel_Set3DSpread;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, angle, __functionAddress);
    }

    // --- [ FMOD_Channel_Get3DSpread ] ---

    public static int nFMOD_Channel_Get3DSpread(long channel, long angle) {
        long __functionAddress = Functions.Channel_Get3DSpread;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, angle, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Get3DSpread(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("float *") FloatBuffer angle) {
        if (CHECKS) {
            check(angle, 1);
        }
        return nFMOD_Channel_Get3DSpread(channel, memAddress(angle));
    }

    // --- [ FMOD_Channel_Set3DLevel ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Set3DLevel(@NativeType("FMOD_CHANNEL *") long channel, float level) {
        long __functionAddress = Functions.Channel_Set3DLevel;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, level, __functionAddress);
    }

    // --- [ FMOD_Channel_Get3DLevel ] ---

    public static int nFMOD_Channel_Get3DLevel(long channel, long level) {
        long __functionAddress = Functions.Channel_Get3DLevel;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, level, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Get3DLevel(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("float *") FloatBuffer level) {
        if (CHECKS) {
            check(level, 1);
        }
        return nFMOD_Channel_Get3DLevel(channel, memAddress(level));
    }

    // --- [ FMOD_Channel_Set3DDopplerLevel ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Set3DDopplerLevel(@NativeType("FMOD_CHANNEL *") long channel, float level) {
        long __functionAddress = Functions.Channel_Set3DDopplerLevel;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, level, __functionAddress);
    }

    // --- [ FMOD_Channel_Get3DDopplerLevel ] ---

    public static int nFMOD_Channel_Get3DDopplerLevel(long channel, long level) {
        long __functionAddress = Functions.Channel_Get3DDopplerLevel;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, level, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Get3DDopplerLevel(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("float *") FloatBuffer level) {
        if (CHECKS) {
            check(level, 1);
        }
        return nFMOD_Channel_Get3DDopplerLevel(channel, memAddress(level));
    }

    // --- [ FMOD_Channel_Set3DDistanceFilter ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Set3DDistanceFilter(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_BOOL") int custom, float customLevel, float centerFreq) {
        long __functionAddress = Functions.Channel_Set3DDistanceFilter;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, custom, customLevel, centerFreq, __functionAddress);
    }

    // --- [ FMOD_Channel_Get3DDistanceFilter ] ---

    public static int nFMOD_Channel_Get3DDistanceFilter(long channel, long custom, long customLevel, long centerFreq) {
        long __functionAddress = Functions.Channel_Get3DDistanceFilter;
        if (CHECKS) {
            check(channel);
        }
        return callPPPPI(channel, custom, customLevel, centerFreq, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_Get3DDistanceFilter(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("FMOD_BOOL *") IntBuffer custom, @Nullable @NativeType("float *") FloatBuffer customLevel, @Nullable @NativeType("float *") FloatBuffer centerFreq) {
        if (CHECKS) {
            checkSafe(custom, 1);
            checkSafe(customLevel, 1);
            checkSafe(centerFreq, 1);
        }
        return nFMOD_Channel_Get3DDistanceFilter(channel, memAddressSafe(custom), memAddressSafe(customLevel), memAddressSafe(centerFreq));
    }

    // --- [ FMOD_Channel_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetUserData(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.Channel_SetUserData;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, userdata, __functionAddress);
    }

    // --- [ FMOD_Channel_GetUserData ] ---

    public static int nFMOD_Channel_GetUserData(long channel, long userdata) {
        long __functionAddress = Functions.Channel_GetUserData;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetUserData(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Channel_GetUserData(channel, memAddress(userdata));
    }

    // --- [ FMOD_Channel_SetFrequency ] ---

    /** Channel specific control functionality. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetFrequency(@NativeType("FMOD_CHANNEL *") long channel, float frequency) {
        long __functionAddress = Functions.Channel_SetFrequency;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, frequency, __functionAddress);
    }

    // --- [ FMOD_Channel_GetFrequency ] ---

    public static int nFMOD_Channel_GetFrequency(long channel, long frequency) {
        long __functionAddress = Functions.Channel_GetFrequency;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, frequency, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetFrequency(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("float *") FloatBuffer frequency) {
        if (CHECKS) {
            check(frequency, 1);
        }
        return nFMOD_Channel_GetFrequency(channel, memAddress(frequency));
    }

    // --- [ FMOD_Channel_SetPriority ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetPriority(@NativeType("FMOD_CHANNEL *") long channel, int priority) {
        long __functionAddress = Functions.Channel_SetPriority;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, priority, __functionAddress);
    }

    // --- [ FMOD_Channel_GetPriority ] ---

    public static int nFMOD_Channel_GetPriority(long channel, long priority) {
        long __functionAddress = Functions.Channel_GetPriority;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, priority, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetPriority(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("int *") IntBuffer priority) {
        if (CHECKS) {
            check(priority, 1);
        }
        return nFMOD_Channel_GetPriority(channel, memAddress(priority));
    }

    // --- [ FMOD_Channel_SetPosition ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetPosition(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("unsigned int") int position, @NativeType("FMOD_TIMEUNIT") int postype) {
        long __functionAddress = Functions.Channel_SetPosition;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, position, postype, __functionAddress);
    }

    // --- [ FMOD_Channel_GetPosition ] ---

    public static int nFMOD_Channel_GetPosition(long channel, long position, int postype) {
        long __functionAddress = Functions.Channel_GetPosition;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, position, postype, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetPosition(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("unsigned int *") IntBuffer position, @NativeType("FMOD_TIMEUNIT") int postype) {
        if (CHECKS) {
            check(position, 1);
        }
        return nFMOD_Channel_GetPosition(channel, memAddress(position), postype);
    }

    // --- [ FMOD_Channel_SetChannelGroup ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetChannelGroup(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_CHANNELGROUP *") long channelgroup) {
        long __functionAddress = Functions.Channel_SetChannelGroup;
        if (CHECKS) {
            check(channel);
            check(channelgroup);
        }
        return callPPI(channel, channelgroup, __functionAddress);
    }

    // --- [ FMOD_Channel_GetChannelGroup ] ---

    public static int nFMOD_Channel_GetChannelGroup(long channel, long channelgroup) {
        long __functionAddress = Functions.Channel_GetChannelGroup;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, channelgroup, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetChannelGroup(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_CHANNELGROUP **") PointerBuffer channelgroup) {
        if (CHECKS) {
            check(channelgroup, 1);
        }
        return nFMOD_Channel_GetChannelGroup(channel, memAddress(channelgroup));
    }

    // --- [ FMOD_Channel_SetLoopCount ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetLoopCount(@NativeType("FMOD_CHANNEL *") long channel, int loopcount) {
        long __functionAddress = Functions.Channel_SetLoopCount;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, loopcount, __functionAddress);
    }

    // --- [ FMOD_Channel_GetLoopCount ] ---

    public static int nFMOD_Channel_GetLoopCount(long channel, long loopcount) {
        long __functionAddress = Functions.Channel_GetLoopCount;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, loopcount, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetLoopCount(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("int *") IntBuffer loopcount) {
        if (CHECKS) {
            check(loopcount, 1);
        }
        return nFMOD_Channel_GetLoopCount(channel, memAddress(loopcount));
    }

    // --- [ FMOD_Channel_SetLoopPoints ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_SetLoopPoints(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("unsigned int") int loopstart, @NativeType("FMOD_TIMEUNIT") int loopstarttype, @NativeType("unsigned int") int loopend, @NativeType("FMOD_TIMEUNIT") int loopendtype) {
        long __functionAddress = Functions.Channel_SetLoopPoints;
        if (CHECKS) {
            check(channel);
        }
        return callPI(channel, loopstart, loopstarttype, loopend, loopendtype, __functionAddress);
    }

    // --- [ FMOD_Channel_GetLoopPoints ] ---

    public static int nFMOD_Channel_GetLoopPoints(long channel, long loopstart, int loopstarttype, long loopend, int loopendtype) {
        long __functionAddress = Functions.Channel_GetLoopPoints;
        if (CHECKS) {
            check(channel);
        }
        return callPPPI(channel, loopstart, loopstarttype, loopend, loopendtype, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetLoopPoints(@NativeType("FMOD_CHANNEL *") long channel, @Nullable @NativeType("unsigned int *") IntBuffer loopstart, @NativeType("FMOD_TIMEUNIT") int loopstarttype, @Nullable @NativeType("unsigned int *") IntBuffer loopend, @NativeType("FMOD_TIMEUNIT") int loopendtype) {
        if (CHECKS) {
            checkSafe(loopstart, 1);
            checkSafe(loopend, 1);
        }
        return nFMOD_Channel_GetLoopPoints(channel, memAddressSafe(loopstart), loopstarttype, memAddressSafe(loopend), loopendtype);
    }

    // --- [ FMOD_Channel_IsVirtual ] ---

    /** Unsafe version of: {@link #FMOD_Channel_IsVirtual Channel_IsVirtual} */
    public static int nFMOD_Channel_IsVirtual(long channel, long isvirtual) {
        long __functionAddress = Functions.Channel_IsVirtual;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, isvirtual, __functionAddress);
    }

    /** Information only functions. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_IsVirtual(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_BOOL *") IntBuffer isvirtual) {
        if (CHECKS) {
            check(isvirtual, 1);
        }
        return nFMOD_Channel_IsVirtual(channel, memAddress(isvirtual));
    }

    // --- [ FMOD_Channel_GetCurrentSound ] ---

    public static int nFMOD_Channel_GetCurrentSound(long channel, long sound) {
        long __functionAddress = Functions.Channel_GetCurrentSound;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, sound, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetCurrentSound(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("FMOD_SOUND **") PointerBuffer sound) {
        if (CHECKS) {
            check(sound, 1);
        }
        return nFMOD_Channel_GetCurrentSound(channel, memAddress(sound));
    }

    // --- [ FMOD_Channel_GetIndex ] ---

    public static int nFMOD_Channel_GetIndex(long channel, long index) {
        long __functionAddress = Functions.Channel_GetIndex;
        if (CHECKS) {
            check(channel);
        }
        return callPPI(channel, index, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Channel_GetIndex(@NativeType("FMOD_CHANNEL *") long channel, @NativeType("int *") IntBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        return nFMOD_Channel_GetIndex(channel, memAddress(index));
    }

    // --- [ FMOD_ChannelGroup_GetSystemObject ] ---

    public static int nFMOD_ChannelGroup_GetSystemObject(long channelgroup, long system) {
        long __functionAddress = Functions.ChannelGroup_GetSystemObject;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, system, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetSystemObject(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_SYSTEM **") PointerBuffer system) {
        if (CHECKS) {
            check(system, 1);
        }
        return nFMOD_ChannelGroup_GetSystemObject(channelgroup, memAddress(system));
    }

    // --- [ FMOD_ChannelGroup_Stop ] ---

    /** General control functionality for Channels and ChannelGroups. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Stop(@NativeType("FMOD_CHANNELGROUP *") long channelgroup) {
        long __functionAddress = Functions.ChannelGroup_Stop;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_SetPaused ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetPaused(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_BOOL") int paused) {
        long __functionAddress = Functions.ChannelGroup_SetPaused;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, paused, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetPaused ] ---

    public static int nFMOD_ChannelGroup_GetPaused(long channelgroup, long paused) {
        long __functionAddress = Functions.ChannelGroup_GetPaused;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, paused, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetPaused(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_BOOL *") IntBuffer paused) {
        if (CHECKS) {
            check(paused, 1);
        }
        return nFMOD_ChannelGroup_GetPaused(channelgroup, memAddress(paused));
    }

    // --- [ FMOD_ChannelGroup_SetVolume ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetVolume(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, float volume) {
        long __functionAddress = Functions.ChannelGroup_SetVolume;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, volume, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetVolume ] ---

    public static int nFMOD_ChannelGroup_GetVolume(long channelgroup, long volume) {
        long __functionAddress = Functions.ChannelGroup_GetVolume;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, volume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetVolume(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("float *") FloatBuffer volume) {
        if (CHECKS) {
            check(volume, 1);
        }
        return nFMOD_ChannelGroup_GetVolume(channelgroup, memAddress(volume));
    }

    // --- [ FMOD_ChannelGroup_SetVolumeRamp ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetVolumeRamp(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_BOOL") int ramp) {
        long __functionAddress = Functions.ChannelGroup_SetVolumeRamp;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, ramp, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetVolumeRamp ] ---

    public static int nFMOD_ChannelGroup_GetVolumeRamp(long channelgroup, long ramp) {
        long __functionAddress = Functions.ChannelGroup_GetVolumeRamp;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, ramp, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetVolumeRamp(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_BOOL *") IntBuffer ramp) {
        if (CHECKS) {
            check(ramp, 1);
        }
        return nFMOD_ChannelGroup_GetVolumeRamp(channelgroup, memAddress(ramp));
    }

    // --- [ FMOD_ChannelGroup_GetAudibility ] ---

    public static int nFMOD_ChannelGroup_GetAudibility(long channelgroup, long audibility) {
        long __functionAddress = Functions.ChannelGroup_GetAudibility;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, audibility, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetAudibility(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("float *") FloatBuffer audibility) {
        if (CHECKS) {
            check(audibility, 1);
        }
        return nFMOD_ChannelGroup_GetAudibility(channelgroup, memAddress(audibility));
    }

    // --- [ FMOD_ChannelGroup_SetPitch ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetPitch(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, float pitch) {
        long __functionAddress = Functions.ChannelGroup_SetPitch;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, pitch, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetPitch ] ---

    public static int nFMOD_ChannelGroup_GetPitch(long channelgroup, long pitch) {
        long __functionAddress = Functions.ChannelGroup_GetPitch;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, pitch, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetPitch(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("float *") FloatBuffer pitch) {
        if (CHECKS) {
            check(pitch, 1);
        }
        return nFMOD_ChannelGroup_GetPitch(channelgroup, memAddress(pitch));
    }

    // --- [ FMOD_ChannelGroup_SetMute ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetMute(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_BOOL") int mute) {
        long __functionAddress = Functions.ChannelGroup_SetMute;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, mute, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetMute ] ---

    public static int nFMOD_ChannelGroup_GetMute(long channelgroup, long mute) {
        long __functionAddress = Functions.ChannelGroup_GetMute;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, mute, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetMute(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_BOOL *") IntBuffer mute) {
        if (CHECKS) {
            check(mute, 1);
        }
        return nFMOD_ChannelGroup_GetMute(channelgroup, memAddress(mute));
    }

    // --- [ FMOD_ChannelGroup_SetReverbProperties ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetReverbProperties(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, int instance, float wet) {
        long __functionAddress = Functions.ChannelGroup_SetReverbProperties;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, instance, wet, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetReverbProperties ] ---

    public static int nFMOD_ChannelGroup_GetReverbProperties(long channelgroup, int instance, long wet) {
        long __functionAddress = Functions.ChannelGroup_GetReverbProperties;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, instance, wet, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetReverbProperties(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, int instance, @NativeType("float *") FloatBuffer wet) {
        if (CHECKS) {
            check(wet, 1);
        }
        return nFMOD_ChannelGroup_GetReverbProperties(channelgroup, instance, memAddress(wet));
    }

    // --- [ FMOD_ChannelGroup_SetLowPassGain ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetLowPassGain(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, float gain) {
        long __functionAddress = Functions.ChannelGroup_SetLowPassGain;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, gain, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetLowPassGain ] ---

    public static int nFMOD_ChannelGroup_GetLowPassGain(long channelgroup, long gain) {
        long __functionAddress = Functions.ChannelGroup_GetLowPassGain;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, gain, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetLowPassGain(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("float *") FloatBuffer gain) {
        if (CHECKS) {
            check(gain, 1);
        }
        return nFMOD_ChannelGroup_GetLowPassGain(channelgroup, memAddress(gain));
    }

    // --- [ FMOD_ChannelGroup_SetMode ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetMode(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_MODE") int mode) {
        long __functionAddress = Functions.ChannelGroup_SetMode;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, mode, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetMode ] ---

    public static int nFMOD_ChannelGroup_GetMode(long channelgroup, long mode) {
        long __functionAddress = Functions.ChannelGroup_GetMode;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, mode, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetMode(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_MODE *") IntBuffer mode) {
        if (CHECKS) {
            check(mode, 1);
        }
        return nFMOD_ChannelGroup_GetMode(channelgroup, memAddress(mode));
    }

    // --- [ FMOD_ChannelGroup_SetCallback ] ---

    public static int nFMOD_ChannelGroup_SetCallback(long channelgroup, long callback) {
        long __functionAddress = Functions.ChannelGroup_SetCallback;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, callback, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetCallback(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("FMOD_CHANNELCONTROL_CALLBACK") FMOD_CHANNELCONTROL_CALLBACKI callback) {
        return nFMOD_ChannelGroup_SetCallback(channelgroup, memAddressSafe(callback));
    }

    // --- [ FMOD_ChannelGroup_IsPlaying ] ---

    public static int nFMOD_ChannelGroup_IsPlaying(long channelgroup, long isplaying) {
        long __functionAddress = Functions.ChannelGroup_IsPlaying;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, isplaying, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_IsPlaying(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_BOOL *") IntBuffer isplaying) {
        if (CHECKS) {
            check(isplaying, 1);
        }
        return nFMOD_ChannelGroup_IsPlaying(channelgroup, memAddress(isplaying));
    }

    // --- [ FMOD_ChannelGroup_SetPan ] ---

    /**
     * Note all 'set' functions alter a final matrix, this is why the only get function is getMixMatrix, to avoid other get functions returning
     * incorrect/obsolete values.
     */
    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetPan(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, float pan) {
        long __functionAddress = Functions.ChannelGroup_SetPan;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, pan, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_SetMixLevelsOutput ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetMixLevelsOutput(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, float frontleft, float frontright, float center, float lfe, float surroundleft, float surroundright, float backleft, float backright) {
        long __functionAddress = Functions.ChannelGroup_SetMixLevelsOutput;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, frontleft, frontright, center, lfe, surroundleft, surroundright, backleft, backright, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_SetMixLevelsInput ] ---

    public static int nFMOD_ChannelGroup_SetMixLevelsInput(long channelgroup, long levels, int numlevels) {
        long __functionAddress = Functions.ChannelGroup_SetMixLevelsInput;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, levels, numlevels, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetMixLevelsInput(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("float *") FloatBuffer levels) {
        return nFMOD_ChannelGroup_SetMixLevelsInput(channelgroup, memAddress(levels), levels.remaining());
    }

    // --- [ FMOD_ChannelGroup_SetMixMatrix ] ---

    public static int nFMOD_ChannelGroup_SetMixMatrix(long channelgroup, long matrix, int outchannels, int inchannels, int inchannel_hop) {
        long __functionAddress = Functions.ChannelGroup_SetMixMatrix;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, matrix, outchannels, inchannels, inchannel_hop, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetMixMatrix(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("float *") FloatBuffer matrix, int outchannels, int inchannels, int inchannel_hop) {
        if (CHECKS) {
            checkSafe(matrix, outchannels * (inchannel_hop == 0 ? inchannels : inchannel_hop));
        }
        return nFMOD_ChannelGroup_SetMixMatrix(channelgroup, memAddressSafe(matrix), outchannels, inchannels, inchannel_hop);
    }

    // --- [ FMOD_ChannelGroup_GetMixMatrix ] ---

    public static int nFMOD_ChannelGroup_GetMixMatrix(long channelgroup, long matrix, long outchannels, long inchannels, int inchannel_hop) {
        long __functionAddress = Functions.ChannelGroup_GetMixMatrix;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPPPI(channelgroup, matrix, outchannels, inchannels, inchannel_hop, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetMixMatrix(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("float *") FloatBuffer matrix, @Nullable @NativeType("int *") IntBuffer outchannels, @Nullable @NativeType("int *") IntBuffer inchannels, int inchannel_hop) {
        if (CHECKS) {
            checkSafe(outchannels, 1);
            checkSafe(inchannels, 1);
        }
        return nFMOD_ChannelGroup_GetMixMatrix(channelgroup, memAddressSafe(matrix), memAddressSafe(outchannels), memAddressSafe(inchannels), inchannel_hop);
    }

    // --- [ FMOD_ChannelGroup_GetDSPClock ] ---

    /** Unsafe version of: {@link #FMOD_ChannelGroup_GetDSPClock ChannelGroup_GetDSPClock} */
    public static int nFMOD_ChannelGroup_GetDSPClock(long channelgroup, long dspclock, long parentclock) {
        long __functionAddress = Functions.ChannelGroup_GetDSPClock;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPPI(channelgroup, dspclock, parentclock, __functionAddress);
    }

    /** Clock based functionality. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetDSPClock(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("unsigned long long *") LongBuffer dspclock, @Nullable @NativeType("unsigned long long *") LongBuffer parentclock) {
        if (CHECKS) {
            checkSafe(dspclock, 1);
            checkSafe(parentclock, 1);
        }
        return nFMOD_ChannelGroup_GetDSPClock(channelgroup, memAddressSafe(dspclock), memAddressSafe(parentclock));
    }

    // --- [ FMOD_ChannelGroup_SetDelay ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetDelay(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("unsigned long long") long dspclock_start, @NativeType("unsigned long long") long dspclock_end, @NativeType("FMOD_BOOL") int stopchannels) {
        long __functionAddress = Functions.ChannelGroup_SetDelay;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPJJI(channelgroup, dspclock_start, dspclock_end, stopchannels, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetDelay ] ---

    public static int nFMOD_ChannelGroup_GetDelay(long channelgroup, long dspclock_start, long dspclock_end, long stopchannels) {
        long __functionAddress = Functions.ChannelGroup_GetDelay;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPPPI(channelgroup, dspclock_start, dspclock_end, stopchannels, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetDelay(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("unsigned long long *") LongBuffer dspclock_start, @Nullable @NativeType("unsigned long long *") LongBuffer dspclock_end, @Nullable @NativeType("FMOD_BOOL *") IntBuffer stopchannels) {
        if (CHECKS) {
            checkSafe(dspclock_start, 1);
            checkSafe(dspclock_end, 1);
            checkSafe(stopchannels, 1);
        }
        return nFMOD_ChannelGroup_GetDelay(channelgroup, memAddressSafe(dspclock_start), memAddressSafe(dspclock_end), memAddressSafe(stopchannels));
    }

    // --- [ FMOD_ChannelGroup_AddFadePoint ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_AddFadePoint(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("unsigned long long") long dspclock, float volume) {
        long __functionAddress = Functions.ChannelGroup_AddFadePoint;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPJI(channelgroup, dspclock, volume, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_SetFadePointRamp ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetFadePointRamp(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("unsigned long long") long dspclock, float volume) {
        long __functionAddress = Functions.ChannelGroup_SetFadePointRamp;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPJI(channelgroup, dspclock, volume, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_RemoveFadePoints ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_RemoveFadePoints(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("unsigned long long") long dspclock_start, @NativeType("unsigned long long") long dspclock_end) {
        long __functionAddress = Functions.ChannelGroup_RemoveFadePoints;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPJJI(channelgroup, dspclock_start, dspclock_end, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetFadePoints ] ---

    public static int nFMOD_ChannelGroup_GetFadePoints(long channelgroup, long numpoints, long point_dspclock, long point_volume) {
        long __functionAddress = Functions.ChannelGroup_GetFadePoints;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPPPI(channelgroup, numpoints, point_dspclock, point_volume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetFadePoints(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("unsigned int *") IntBuffer numpoints, @Nullable @NativeType("unsigned long long *") LongBuffer point_dspclock, @Nullable @NativeType("float *") FloatBuffer point_volume) {
        if (CHECKS) {
            check(numpoints, 1);
            checkSafe(point_dspclock, 1);
            checkSafe(point_volume, 1);
        }
        return nFMOD_ChannelGroup_GetFadePoints(channelgroup, memAddress(numpoints), memAddressSafe(point_dspclock), memAddressSafe(point_volume));
    }

    // --- [ FMOD_ChannelGroup_GetDSP ] ---

    /** Unsafe version of: {@link #FMOD_ChannelGroup_GetDSP ChannelGroup_GetDSP} */
    public static int nFMOD_ChannelGroup_GetDSP(long channelgroup, int index, long dsp) {
        long __functionAddress = Functions.ChannelGroup_GetDSP;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, index, dsp, __functionAddress);
    }

    /** DSP effects. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetDSP(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, int index, @NativeType("FMOD_DSP **") PointerBuffer dsp) {
        if (CHECKS) {
            check(dsp, 1);
        }
        return nFMOD_ChannelGroup_GetDSP(channelgroup, index, memAddress(dsp));
    }

    // --- [ FMOD_ChannelGroup_AddDSP ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_AddDSP(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, int index, @NativeType("FMOD_DSP *") long dsp) {
        long __functionAddress = Functions.ChannelGroup_AddDSP;
        if (CHECKS) {
            check(channelgroup);
            check(dsp);
        }
        return callPPI(channelgroup, index, dsp, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_RemoveDSP ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_RemoveDSP(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_DSP *") long dsp) {
        long __functionAddress = Functions.ChannelGroup_RemoveDSP;
        if (CHECKS) {
            check(channelgroup);
            check(dsp);
        }
        return callPPI(channelgroup, dsp, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetNumDSPs ] ---

    public static int nFMOD_ChannelGroup_GetNumDSPs(long channelgroup, long numdsps) {
        long __functionAddress = Functions.ChannelGroup_GetNumDSPs;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, numdsps, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetNumDSPs(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("int *") IntBuffer numdsps) {
        if (CHECKS) {
            check(numdsps, 1);
        }
        return nFMOD_ChannelGroup_GetNumDSPs(channelgroup, memAddress(numdsps));
    }

    // --- [ FMOD_ChannelGroup_SetDSPIndex ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetDSPIndex(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_DSP *") long dsp, int index) {
        long __functionAddress = Functions.ChannelGroup_SetDSPIndex;
        if (CHECKS) {
            check(channelgroup);
            check(dsp);
        }
        return callPPI(channelgroup, dsp, index, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetDSPIndex ] ---

    public static int nFMOD_ChannelGroup_GetDSPIndex(long channelgroup, long dsp, long index) {
        long __functionAddress = Functions.ChannelGroup_GetDSPIndex;
        if (CHECKS) {
            check(channelgroup);
            check(dsp);
        }
        return callPPPI(channelgroup, dsp, index, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetDSPIndex(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_DSP *") long dsp, @NativeType("int *") IntBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        return nFMOD_ChannelGroup_GetDSPIndex(channelgroup, dsp, memAddress(index));
    }

    // --- [ FMOD_ChannelGroup_Set3DAttributes ] ---

    /** Unsafe version of: {@link #FMOD_ChannelGroup_Set3DAttributes ChannelGroup_Set3DAttributes} */
    public static int nFMOD_ChannelGroup_Set3DAttributes(long channelgroup, long pos, long vel) {
        long __functionAddress = Functions.ChannelGroup_Set3DAttributes;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPPI(channelgroup, pos, vel, __functionAddress);
    }

    /** 3D functionality. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Set3DAttributes(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR pos, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR vel) {
        return nFMOD_ChannelGroup_Set3DAttributes(channelgroup, memAddressSafe(pos), memAddressSafe(vel));
    }

    // --- [ FMOD_ChannelGroup_Get3DAttributes ] ---

    public static int nFMOD_ChannelGroup_Get3DAttributes(long channelgroup, long pos, long vel) {
        long __functionAddress = Functions.ChannelGroup_Get3DAttributes;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPPI(channelgroup, pos, vel, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Get3DAttributes(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR pos, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR vel) {
        return nFMOD_ChannelGroup_Get3DAttributes(channelgroup, memAddressSafe(pos), memAddressSafe(vel));
    }

    // --- [ FMOD_ChannelGroup_Set3DMinMaxDistance ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Set3DMinMaxDistance(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, float mindistance, float maxdistance) {
        long __functionAddress = Functions.ChannelGroup_Set3DMinMaxDistance;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, mindistance, maxdistance, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_Get3DMinMaxDistance ] ---

    public static int nFMOD_ChannelGroup_Get3DMinMaxDistance(long channelgroup, long mindistance, long maxdistance) {
        long __functionAddress = Functions.ChannelGroup_Get3DMinMaxDistance;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPPI(channelgroup, mindistance, maxdistance, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Get3DMinMaxDistance(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("float *") FloatBuffer mindistance, @Nullable @NativeType("float *") FloatBuffer maxdistance) {
        if (CHECKS) {
            checkSafe(mindistance, 1);
            checkSafe(maxdistance, 1);
        }
        return nFMOD_ChannelGroup_Get3DMinMaxDistance(channelgroup, memAddressSafe(mindistance), memAddressSafe(maxdistance));
    }

    // --- [ FMOD_ChannelGroup_Set3DConeSettings ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Set3DConeSettings(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, float insideconeangle, float outsideconeangle, float outsidevolume) {
        long __functionAddress = Functions.ChannelGroup_Set3DConeSettings;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, insideconeangle, outsideconeangle, outsidevolume, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_Get3DConeSettings ] ---

    public static int nFMOD_ChannelGroup_Get3DConeSettings(long channelgroup, long insideconeangle, long outsideconeangle, long outsidevolume) {
        long __functionAddress = Functions.ChannelGroup_Get3DConeSettings;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPPPI(channelgroup, insideconeangle, outsideconeangle, outsidevolume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Get3DConeSettings(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("float *") FloatBuffer insideconeangle, @Nullable @NativeType("float *") FloatBuffer outsideconeangle, @Nullable @NativeType("float *") FloatBuffer outsidevolume) {
        if (CHECKS) {
            checkSafe(insideconeangle, 1);
            checkSafe(outsideconeangle, 1);
            checkSafe(outsidevolume, 1);
        }
        return nFMOD_ChannelGroup_Get3DConeSettings(channelgroup, memAddressSafe(insideconeangle), memAddressSafe(outsideconeangle), memAddressSafe(outsidevolume));
    }

    // --- [ FMOD_ChannelGroup_Set3DConeOrientation ] ---

    public static int nFMOD_ChannelGroup_Set3DConeOrientation(long channelgroup, long orientation) {
        long __functionAddress = Functions.ChannelGroup_Set3DConeOrientation;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, orientation, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Set3DConeOrientation(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_VECTOR *") FMOD_VECTOR orientation) {
        return nFMOD_ChannelGroup_Set3DConeOrientation(channelgroup, orientation.address());
    }

    // --- [ FMOD_ChannelGroup_Get3DConeOrientation ] ---

    public static int nFMOD_ChannelGroup_Get3DConeOrientation(long channelgroup, long orientation) {
        long __functionAddress = Functions.ChannelGroup_Get3DConeOrientation;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, orientation, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Get3DConeOrientation(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_VECTOR *") FMOD_VECTOR orientation) {
        return nFMOD_ChannelGroup_Get3DConeOrientation(channelgroup, orientation.address());
    }

    // --- [ FMOD_ChannelGroup_Set3DCustomRolloff ] ---

    public static int nFMOD_ChannelGroup_Set3DCustomRolloff(long channelgroup, long points, int numpoints) {
        long __functionAddress = Functions.ChannelGroup_Set3DCustomRolloff;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, points, numpoints, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Set3DCustomRolloff(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_VECTOR *") FMOD_VECTOR.Buffer points) {
        return nFMOD_ChannelGroup_Set3DCustomRolloff(channelgroup, points.address(), points.remaining());
    }

    // --- [ FMOD_ChannelGroup_Get3DCustomRolloff ] ---

    public static int nFMOD_ChannelGroup_Get3DCustomRolloff(long channelgroup, long points, long numpoints) {
        long __functionAddress = Functions.ChannelGroup_Get3DCustomRolloff;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPPI(channelgroup, points, numpoints, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Get3DCustomRolloff(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("FMOD_VECTOR **") PointerBuffer points, @Nullable @NativeType("int *") IntBuffer numpoints) {
        if (CHECKS) {
            checkSafe(points, 1);
            checkSafe(numpoints, 1);
        }
        return nFMOD_ChannelGroup_Get3DCustomRolloff(channelgroup, memAddressSafe(points), memAddressSafe(numpoints));
    }

    // --- [ FMOD_ChannelGroup_Set3DOcclusion ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Set3DOcclusion(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, float directocclusion, float reverbocclusion) {
        long __functionAddress = Functions.ChannelGroup_Set3DOcclusion;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, directocclusion, reverbocclusion, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_Get3DOcclusion ] ---

    public static int nFMOD_ChannelGroup_Get3DOcclusion(long channelgroup, long directocclusion, long reverbocclusion) {
        long __functionAddress = Functions.ChannelGroup_Get3DOcclusion;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPPI(channelgroup, directocclusion, reverbocclusion, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Get3DOcclusion(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("float *") FloatBuffer directocclusion, @Nullable @NativeType("float *") FloatBuffer reverbocclusion) {
        if (CHECKS) {
            checkSafe(directocclusion, 1);
            checkSafe(reverbocclusion, 1);
        }
        return nFMOD_ChannelGroup_Get3DOcclusion(channelgroup, memAddressSafe(directocclusion), memAddressSafe(reverbocclusion));
    }

    // --- [ FMOD_ChannelGroup_Set3DSpread ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Set3DSpread(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, float angle) {
        long __functionAddress = Functions.ChannelGroup_Set3DSpread;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, angle, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_Get3DSpread ] ---

    public static int nFMOD_ChannelGroup_Get3DSpread(long channelgroup, long angle) {
        long __functionAddress = Functions.ChannelGroup_Get3DSpread;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, angle, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Get3DSpread(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("float *") FloatBuffer angle) {
        if (CHECKS) {
            check(angle, 1);
        }
        return nFMOD_ChannelGroup_Get3DSpread(channelgroup, memAddress(angle));
    }

    // --- [ FMOD_ChannelGroup_Set3DLevel ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Set3DLevel(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, float level) {
        long __functionAddress = Functions.ChannelGroup_Set3DLevel;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, level, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_Get3DLevel ] ---

    public static int nFMOD_ChannelGroup_Get3DLevel(long channelgroup, long level) {
        long __functionAddress = Functions.ChannelGroup_Get3DLevel;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, level, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Get3DLevel(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("float *") FloatBuffer level) {
        if (CHECKS) {
            check(level, 1);
        }
        return nFMOD_ChannelGroup_Get3DLevel(channelgroup, memAddress(level));
    }

    // --- [ FMOD_ChannelGroup_Set3DDopplerLevel ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Set3DDopplerLevel(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, float level) {
        long __functionAddress = Functions.ChannelGroup_Set3DDopplerLevel;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, level, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_Get3DDopplerLevel ] ---

    public static int nFMOD_ChannelGroup_Get3DDopplerLevel(long channelgroup, long level) {
        long __functionAddress = Functions.ChannelGroup_Get3DDopplerLevel;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, level, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Get3DDopplerLevel(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("float *") FloatBuffer level) {
        if (CHECKS) {
            check(level, 1);
        }
        return nFMOD_ChannelGroup_Get3DDopplerLevel(channelgroup, memAddress(level));
    }

    // --- [ FMOD_ChannelGroup_Set3DDistanceFilter ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Set3DDistanceFilter(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_BOOL") int custom, float customLevel, float centerFreq) {
        long __functionAddress = Functions.ChannelGroup_Set3DDistanceFilter;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, custom, customLevel, centerFreq, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_Get3DDistanceFilter ] ---

    public static int nFMOD_ChannelGroup_Get3DDistanceFilter(long channelgroup, long custom, long customLevel, long centerFreq) {
        long __functionAddress = Functions.ChannelGroup_Get3DDistanceFilter;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPPPI(channelgroup, custom, customLevel, centerFreq, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Get3DDistanceFilter(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @Nullable @NativeType("FMOD_BOOL *") IntBuffer custom, @Nullable @NativeType("float *") FloatBuffer customLevel, @Nullable @NativeType("float *") FloatBuffer centerFreq) {
        if (CHECKS) {
            checkSafe(custom, 1);
            checkSafe(customLevel, 1);
            checkSafe(centerFreq, 1);
        }
        return nFMOD_ChannelGroup_Get3DDistanceFilter(channelgroup, memAddressSafe(custom), memAddressSafe(customLevel), memAddressSafe(centerFreq));
    }

    // --- [ FMOD_ChannelGroup_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_SetUserData(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.ChannelGroup_SetUserData;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, userdata, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_GetUserData ] ---

    public static int nFMOD_ChannelGroup_GetUserData(long channelgroup, long userdata) {
        long __functionAddress = Functions.ChannelGroup_GetUserData;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetUserData(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_ChannelGroup_GetUserData(channelgroup, memAddress(userdata));
    }

    // --- [ FMOD_ChannelGroup_Release ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_Release(@NativeType("FMOD_CHANNELGROUP *") long channelgroup) {
        long __functionAddress = Functions.ChannelGroup_Release;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPI(channelgroup, __functionAddress);
    }

    // --- [ FMOD_ChannelGroup_AddGroup ] ---

    public static int nFMOD_ChannelGroup_AddGroup(long channelgroup, long group, int propagatedspclock, long connection) {
        long __functionAddress = Functions.ChannelGroup_AddGroup;
        if (CHECKS) {
            check(channelgroup);
            check(group);
        }
        return callPPPI(channelgroup, group, propagatedspclock, connection, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_AddGroup(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_CHANNELGROUP *") long group, @NativeType("FMOD_BOOL") int propagatedspclock, @Nullable @NativeType("FMOD_DSPCONNECTION **") PointerBuffer connection) {
        if (CHECKS) {
            checkSafe(connection, 1);
        }
        return nFMOD_ChannelGroup_AddGroup(channelgroup, group, propagatedspclock, memAddressSafe(connection));
    }

    // --- [ FMOD_ChannelGroup_GetNumGroups ] ---

    public static int nFMOD_ChannelGroup_GetNumGroups(long channelgroup, long numgroups) {
        long __functionAddress = Functions.ChannelGroup_GetNumGroups;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, numgroups, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetNumGroups(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("int *") IntBuffer numgroups) {
        if (CHECKS) {
            check(numgroups, 1);
        }
        return nFMOD_ChannelGroup_GetNumGroups(channelgroup, memAddress(numgroups));
    }

    // --- [ FMOD_ChannelGroup_GetGroup ] ---

    public static int nFMOD_ChannelGroup_GetGroup(long channelgroup, int index, long group) {
        long __functionAddress = Functions.ChannelGroup_GetGroup;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, index, group, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetGroup(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, int index, @NativeType("FMOD_CHANNELGROUP **") PointerBuffer group) {
        if (CHECKS) {
            check(group, 1);
        }
        return nFMOD_ChannelGroup_GetGroup(channelgroup, index, memAddress(group));
    }

    // --- [ FMOD_ChannelGroup_GetParentGroup ] ---

    public static int nFMOD_ChannelGroup_GetParentGroup(long channelgroup, long group) {
        long __functionAddress = Functions.ChannelGroup_GetParentGroup;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, group, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetParentGroup(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("FMOD_CHANNELGROUP **") PointerBuffer group) {
        if (CHECKS) {
            check(group, 1);
        }
        return nFMOD_ChannelGroup_GetParentGroup(channelgroup, memAddress(group));
    }

    // --- [ FMOD_ChannelGroup_GetName ] ---

    public static int nFMOD_ChannelGroup_GetName(long channelgroup, long name, int namelen) {
        long __functionAddress = Functions.ChannelGroup_GetName;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, name, namelen, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetName(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("char *") ByteBuffer name) {
        return nFMOD_ChannelGroup_GetName(channelgroup, memAddress(name), name.remaining());
    }

    // --- [ FMOD_ChannelGroup_GetNumChannels ] ---

    public static int nFMOD_ChannelGroup_GetNumChannels(long channelgroup, long numchannels) {
        long __functionAddress = Functions.ChannelGroup_GetNumChannels;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, numchannels, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetNumChannels(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, @NativeType("int *") IntBuffer numchannels) {
        if (CHECKS) {
            check(numchannels, 1);
        }
        return nFMOD_ChannelGroup_GetNumChannels(channelgroup, memAddress(numchannels));
    }

    // --- [ FMOD_ChannelGroup_GetChannel ] ---

    public static int nFMOD_ChannelGroup_GetChannel(long channelgroup, int index, long channel) {
        long __functionAddress = Functions.ChannelGroup_GetChannel;
        if (CHECKS) {
            check(channelgroup);
        }
        return callPPI(channelgroup, index, channel, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_ChannelGroup_GetChannel(@NativeType("FMOD_CHANNELGROUP *") long channelgroup, int index, @NativeType("FMOD_CHANNEL **") PointerBuffer channel) {
        if (CHECKS) {
            check(channel, 1);
        }
        return nFMOD_ChannelGroup_GetChannel(channelgroup, index, memAddress(channel));
    }

    // --- [ FMOD_SoundGroup_Release ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_Release(@NativeType("FMOD_SOUNDGROUP *") long soundgroup) {
        long __functionAddress = Functions.SoundGroup_Release;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPI(soundgroup, __functionAddress);
    }

    // --- [ FMOD_SoundGroup_GetSystemObject ] ---

    public static int nFMOD_SoundGroup_GetSystemObject(long soundgroup, long system) {
        long __functionAddress = Functions.SoundGroup_GetSystemObject;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPPI(soundgroup, system, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_GetSystemObject(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, @NativeType("FMOD_SYSTEM **") PointerBuffer system) {
        if (CHECKS) {
            check(system, 1);
        }
        return nFMOD_SoundGroup_GetSystemObject(soundgroup, memAddress(system));
    }

    // --- [ FMOD_SoundGroup_SetMaxAudible ] ---

    /** SoundGroup control functions. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_SetMaxAudible(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, int maxaudible) {
        long __functionAddress = Functions.SoundGroup_SetMaxAudible;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPI(soundgroup, maxaudible, __functionAddress);
    }

    // --- [ FMOD_SoundGroup_GetMaxAudible ] ---

    public static int nFMOD_SoundGroup_GetMaxAudible(long soundgroup, long maxaudible) {
        long __functionAddress = Functions.SoundGroup_GetMaxAudible;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPPI(soundgroup, maxaudible, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_GetMaxAudible(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, @NativeType("int *") IntBuffer maxaudible) {
        if (CHECKS) {
            check(maxaudible, 1);
        }
        return nFMOD_SoundGroup_GetMaxAudible(soundgroup, memAddress(maxaudible));
    }

    // --- [ FMOD_SoundGroup_SetMaxAudibleBehavior ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_SetMaxAudibleBehavior(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, @NativeType("FMOD_SOUNDGROUP_BEHAVIOR") int behavior) {
        long __functionAddress = Functions.SoundGroup_SetMaxAudibleBehavior;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPI(soundgroup, behavior, __functionAddress);
    }

    // --- [ FMOD_SoundGroup_GetMaxAudibleBehavior ] ---

    public static int nFMOD_SoundGroup_GetMaxAudibleBehavior(long soundgroup, long behavior) {
        long __functionAddress = Functions.SoundGroup_GetMaxAudibleBehavior;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPPI(soundgroup, behavior, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_GetMaxAudibleBehavior(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, @NativeType("FMOD_SOUNDGROUP_BEHAVIOR *") IntBuffer behavior) {
        if (CHECKS) {
            check(behavior, 1);
        }
        return nFMOD_SoundGroup_GetMaxAudibleBehavior(soundgroup, memAddress(behavior));
    }

    // --- [ FMOD_SoundGroup_SetMuteFadeSpeed ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_SetMuteFadeSpeed(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, float speed) {
        long __functionAddress = Functions.SoundGroup_SetMuteFadeSpeed;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPI(soundgroup, speed, __functionAddress);
    }

    // --- [ FMOD_SoundGroup_GetMuteFadeSpeed ] ---

    public static int nFMOD_SoundGroup_GetMuteFadeSpeed(long soundgroup, long speed) {
        long __functionAddress = Functions.SoundGroup_GetMuteFadeSpeed;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPPI(soundgroup, speed, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_GetMuteFadeSpeed(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, @NativeType("float *") FloatBuffer speed) {
        if (CHECKS) {
            check(speed, 1);
        }
        return nFMOD_SoundGroup_GetMuteFadeSpeed(soundgroup, memAddress(speed));
    }

    // --- [ FMOD_SoundGroup_SetVolume ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_SetVolume(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, float volume) {
        long __functionAddress = Functions.SoundGroup_SetVolume;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPI(soundgroup, volume, __functionAddress);
    }

    // --- [ FMOD_SoundGroup_GetVolume ] ---

    public static int nFMOD_SoundGroup_GetVolume(long soundgroup, long volume) {
        long __functionAddress = Functions.SoundGroup_GetVolume;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPPI(soundgroup, volume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_GetVolume(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, @NativeType("float *") FloatBuffer volume) {
        if (CHECKS) {
            check(volume, 1);
        }
        return nFMOD_SoundGroup_GetVolume(soundgroup, memAddress(volume));
    }

    // --- [ FMOD_SoundGroup_Stop ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_Stop(@NativeType("FMOD_SOUNDGROUP *") long soundgroup) {
        long __functionAddress = Functions.SoundGroup_Stop;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPI(soundgroup, __functionAddress);
    }

    // --- [ FMOD_SoundGroup_GetName ] ---

    public static int nFMOD_SoundGroup_GetName(long soundgroup, long name, int namelen) {
        long __functionAddress = Functions.SoundGroup_GetName;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPPI(soundgroup, name, namelen, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_GetName(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, @NativeType("char *") ByteBuffer name) {
        return nFMOD_SoundGroup_GetName(soundgroup, memAddress(name), name.remaining());
    }

    // --- [ FMOD_SoundGroup_GetNumSounds ] ---

    public static int nFMOD_SoundGroup_GetNumSounds(long soundgroup, long numsounds) {
        long __functionAddress = Functions.SoundGroup_GetNumSounds;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPPI(soundgroup, numsounds, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_GetNumSounds(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, @NativeType("int *") IntBuffer numsounds) {
        if (CHECKS) {
            check(numsounds, 1);
        }
        return nFMOD_SoundGroup_GetNumSounds(soundgroup, memAddress(numsounds));
    }

    // --- [ FMOD_SoundGroup_GetSound ] ---

    public static int nFMOD_SoundGroup_GetSound(long soundgroup, int index, long sound) {
        long __functionAddress = Functions.SoundGroup_GetSound;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPPI(soundgroup, index, sound, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_GetSound(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, int index, @NativeType("FMOD_SOUND **") PointerBuffer sound) {
        if (CHECKS) {
            check(sound, 1);
        }
        return nFMOD_SoundGroup_GetSound(soundgroup, index, memAddress(sound));
    }

    // --- [ FMOD_SoundGroup_GetNumPlaying ] ---

    public static int nFMOD_SoundGroup_GetNumPlaying(long soundgroup, long numplaying) {
        long __functionAddress = Functions.SoundGroup_GetNumPlaying;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPPI(soundgroup, numplaying, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_GetNumPlaying(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, @NativeType("int *") IntBuffer numplaying) {
        if (CHECKS) {
            check(numplaying, 1);
        }
        return nFMOD_SoundGroup_GetNumPlaying(soundgroup, memAddress(numplaying));
    }

    // --- [ FMOD_SoundGroup_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_SetUserData(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.SoundGroup_SetUserData;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPPI(soundgroup, userdata, __functionAddress);
    }

    // --- [ FMOD_SoundGroup_GetUserData ] ---

    public static int nFMOD_SoundGroup_GetUserData(long soundgroup, long userdata) {
        long __functionAddress = Functions.SoundGroup_GetUserData;
        if (CHECKS) {
            check(soundgroup);
        }
        return callPPI(soundgroup, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_SoundGroup_GetUserData(@NativeType("FMOD_SOUNDGROUP *") long soundgroup, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_SoundGroup_GetUserData(soundgroup, memAddress(userdata));
    }

    // --- [ FMOD_DSP_Release ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_Release(@NativeType("FMOD_DSP *") long dsp) {
        long __functionAddress = Functions.DSP_Release;
        if (CHECKS) {
            check(dsp);
        }
        return callPI(dsp, __functionAddress);
    }

    // --- [ FMOD_DSP_GetSystemObject ] ---

    public static int nFMOD_DSP_GetSystemObject(long dsp, long system) {
        long __functionAddress = Functions.DSP_GetSystemObject;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, system, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetSystemObject(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_SYSTEM **") PointerBuffer system) {
        if (CHECKS) {
            check(system, 1);
        }
        return nFMOD_DSP_GetSystemObject(dsp, memAddress(system));
    }

    // --- [ FMOD_DSP_AddInput ] ---

    public static int nFMOD_DSP_AddInput(long dsp, long input, long connection, int type) {
        long __functionAddress = Functions.DSP_AddInput;
        if (CHECKS) {
            check(dsp);
            check(input);
        }
        return callPPPI(dsp, input, connection, type, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_AddInput(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_DSP *") long input, @Nullable @NativeType("FMOD_DSPCONNECTION **") PointerBuffer connection, @NativeType("FMOD_DSPCONNECTION_TYPE") int type) {
        if (CHECKS) {
            checkSafe(connection, 1);
        }
        return nFMOD_DSP_AddInput(dsp, input, memAddressSafe(connection), type);
    }

    // --- [ FMOD_DSP_DisconnectFrom ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_DisconnectFrom(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_DSP *") long target, @NativeType("FMOD_DSPCONNECTION *") long connection) {
        long __functionAddress = Functions.DSP_DisconnectFrom;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPI(dsp, target, connection, __functionAddress);
    }

    // --- [ FMOD_DSP_DisconnectAll ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_DisconnectAll(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_BOOL") int inputs, @NativeType("FMOD_BOOL") int outputs) {
        long __functionAddress = Functions.DSP_DisconnectAll;
        if (CHECKS) {
            check(dsp);
        }
        return callPI(dsp, inputs, outputs, __functionAddress);
    }

    // --- [ FMOD_DSP_GetNumInputs ] ---

    public static int nFMOD_DSP_GetNumInputs(long dsp, long numinputs) {
        long __functionAddress = Functions.DSP_GetNumInputs;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, numinputs, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetNumInputs(@NativeType("FMOD_DSP *") long dsp, @NativeType("int *") IntBuffer numinputs) {
        if (CHECKS) {
            check(numinputs, 1);
        }
        return nFMOD_DSP_GetNumInputs(dsp, memAddress(numinputs));
    }

    // --- [ FMOD_DSP_GetNumOutputs ] ---

    public static int nFMOD_DSP_GetNumOutputs(long dsp, long numoutputs) {
        long __functionAddress = Functions.DSP_GetNumOutputs;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, numoutputs, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetNumOutputs(@NativeType("FMOD_DSP *") long dsp, @NativeType("int *") IntBuffer numoutputs) {
        if (CHECKS) {
            check(numoutputs, 1);
        }
        return nFMOD_DSP_GetNumOutputs(dsp, memAddress(numoutputs));
    }

    // --- [ FMOD_DSP_GetInput ] ---

    public static int nFMOD_DSP_GetInput(long dsp, int index, long input, long inputconnection) {
        long __functionAddress = Functions.DSP_GetInput;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPI(dsp, index, input, inputconnection, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetInput(@NativeType("FMOD_DSP *") long dsp, int index, @Nullable @NativeType("FMOD_DSP **") PointerBuffer input, @Nullable @NativeType("FMOD_DSPCONNECTION **") PointerBuffer inputconnection) {
        if (CHECKS) {
            checkSafe(input, 1);
            checkSafe(inputconnection, 1);
        }
        return nFMOD_DSP_GetInput(dsp, index, memAddressSafe(input), memAddressSafe(inputconnection));
    }

    // --- [ FMOD_DSP_GetOutput ] ---

    public static int nFMOD_DSP_GetOutput(long dsp, int index, long output, long outputconnection) {
        long __functionAddress = Functions.DSP_GetOutput;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPI(dsp, index, output, outputconnection, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetOutput(@NativeType("FMOD_DSP *") long dsp, int index, @Nullable @NativeType("FMOD_DSP **") PointerBuffer output, @Nullable @NativeType("FMOD_DSPCONNECTION **") PointerBuffer outputconnection) {
        if (CHECKS) {
            checkSafe(output, 1);
            checkSafe(outputconnection, 1);
        }
        return nFMOD_DSP_GetOutput(dsp, index, memAddressSafe(output), memAddressSafe(outputconnection));
    }

    // --- [ FMOD_DSP_SetActive ] ---

    /** DSP unit control. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_SetActive(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_BOOL") int active) {
        long __functionAddress = Functions.DSP_SetActive;
        if (CHECKS) {
            check(dsp);
        }
        return callPI(dsp, active, __functionAddress);
    }

    // --- [ FMOD_DSP_GetActive ] ---

    public static int nFMOD_DSP_GetActive(long dsp, long active) {
        long __functionAddress = Functions.DSP_GetActive;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, active, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetActive(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_BOOL *") IntBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        return nFMOD_DSP_GetActive(dsp, memAddress(active));
    }

    // --- [ FMOD_DSP_SetBypass ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_SetBypass(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_BOOL") int bypass) {
        long __functionAddress = Functions.DSP_SetBypass;
        if (CHECKS) {
            check(dsp);
        }
        return callPI(dsp, bypass, __functionAddress);
    }

    // --- [ FMOD_DSP_GetBypass ] ---

    public static int nFMOD_DSP_GetBypass(long dsp, long bypass) {
        long __functionAddress = Functions.DSP_GetBypass;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, bypass, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetBypass(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_BOOL *") IntBuffer bypass) {
        if (CHECKS) {
            check(bypass, 1);
        }
        return nFMOD_DSP_GetBypass(dsp, memAddress(bypass));
    }

    // --- [ FMOD_DSP_SetWetDryMix ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_SetWetDryMix(@NativeType("FMOD_DSP *") long dsp, float prewet, float postwet, float dry) {
        long __functionAddress = Functions.DSP_SetWetDryMix;
        if (CHECKS) {
            check(dsp);
        }
        return callPI(dsp, prewet, postwet, dry, __functionAddress);
    }

    // --- [ FMOD_DSP_GetWetDryMix ] ---

    public static int nFMOD_DSP_GetWetDryMix(long dsp, long prewet, long postwet, long dry) {
        long __functionAddress = Functions.DSP_GetWetDryMix;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPPI(dsp, prewet, postwet, dry, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetWetDryMix(@NativeType("FMOD_DSP *") long dsp, @Nullable @NativeType("float *") FloatBuffer prewet, @Nullable @NativeType("float *") FloatBuffer postwet, @Nullable @NativeType("float *") FloatBuffer dry) {
        if (CHECKS) {
            checkSafe(prewet, 1);
            checkSafe(postwet, 1);
            checkSafe(dry, 1);
        }
        return nFMOD_DSP_GetWetDryMix(dsp, memAddressSafe(prewet), memAddressSafe(postwet), memAddressSafe(dry));
    }

    // --- [ FMOD_DSP_SetChannelFormat ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_SetChannelFormat(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_CHANNELMASK") int channelmask, int numchannels, @NativeType("FMOD_SPEAKERMODE") int source_speakermode) {
        long __functionAddress = Functions.DSP_SetChannelFormat;
        if (CHECKS) {
            check(dsp);
        }
        return callPI(dsp, channelmask, numchannels, source_speakermode, __functionAddress);
    }

    // --- [ FMOD_DSP_GetChannelFormat ] ---

    public static int nFMOD_DSP_GetChannelFormat(long dsp, long channelmask, long numchannels, long source_speakermode) {
        long __functionAddress = Functions.DSP_GetChannelFormat;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPPI(dsp, channelmask, numchannels, source_speakermode, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetChannelFormat(@NativeType("FMOD_DSP *") long dsp, @Nullable @NativeType("FMOD_CHANNELMASK *") IntBuffer channelmask, @Nullable @NativeType("int *") IntBuffer numchannels, @Nullable @NativeType("FMOD_SPEAKERMODE *") IntBuffer source_speakermode) {
        if (CHECKS) {
            checkSafe(channelmask, 1);
            checkSafe(numchannels, 1);
            checkSafe(source_speakermode, 1);
        }
        return nFMOD_DSP_GetChannelFormat(dsp, memAddressSafe(channelmask), memAddressSafe(numchannels), memAddressSafe(source_speakermode));
    }

    // --- [ FMOD_DSP_GetOutputChannelFormat ] ---

    public static int nFMOD_DSP_GetOutputChannelFormat(long dsp, int inmask, int inchannels, int inspeakermode, long outmask, long outchannels, long outspeakermode) {
        long __functionAddress = Functions.DSP_GetOutputChannelFormat;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPPI(dsp, inmask, inchannels, inspeakermode, outmask, outchannels, outspeakermode, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetOutputChannelFormat(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_CHANNELMASK") int inmask, int inchannels, @NativeType("FMOD_SPEAKERMODE") int inspeakermode, @Nullable @NativeType("FMOD_CHANNELMASK *") IntBuffer outmask, @Nullable @NativeType("int *") IntBuffer outchannels, @Nullable @NativeType("FMOD_SPEAKERMODE *") IntBuffer outspeakermode) {
        if (CHECKS) {
            checkSafe(outmask, 1);
            checkSafe(outchannels, 1);
            checkSafe(outspeakermode, 1);
        }
        return nFMOD_DSP_GetOutputChannelFormat(dsp, inmask, inchannels, inspeakermode, memAddressSafe(outmask), memAddressSafe(outchannels), memAddressSafe(outspeakermode));
    }

    // --- [ FMOD_DSP_Reset ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_Reset(@NativeType("FMOD_DSP *") long dsp) {
        long __functionAddress = Functions.DSP_Reset;
        if (CHECKS) {
            check(dsp);
        }
        return callPI(dsp, __functionAddress);
    }

    // --- [ FMOD_DSP_SetCallback ] ---

    public static int nFMOD_DSP_SetCallback(long dsp, long callback) {
        long __functionAddress = Functions.DSP_SetCallback;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, callback, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_SetCallback(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_DSP_CALLBACK") FMOD_DSP_CALLBACKI callback) {
        return nFMOD_DSP_SetCallback(dsp, callback.address());
    }

    // --- [ FMOD_DSP_SetParameterFloat ] ---

    /** DSP parameter control. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_SetParameterFloat(@NativeType("FMOD_DSP *") long dsp, int index, float value) {
        long __functionAddress = Functions.DSP_SetParameterFloat;
        if (CHECKS) {
            check(dsp);
        }
        return callPI(dsp, index, value, __functionAddress);
    }

    // --- [ FMOD_DSP_SetParameterInt ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_SetParameterInt(@NativeType("FMOD_DSP *") long dsp, int index, int value) {
        long __functionAddress = Functions.DSP_SetParameterInt;
        if (CHECKS) {
            check(dsp);
        }
        return callPI(dsp, index, value, __functionAddress);
    }

    // --- [ FMOD_DSP_SetParameterBool ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_SetParameterBool(@NativeType("FMOD_DSP *") long dsp, int index, @NativeType("FMOD_BOOL") int value) {
        long __functionAddress = Functions.DSP_SetParameterBool;
        if (CHECKS) {
            check(dsp);
        }
        return callPI(dsp, index, value, __functionAddress);
    }

    // --- [ FMOD_DSP_SetParameterData ] ---

    public static int nFMOD_DSP_SetParameterData(long dsp, int index, long data, int length) {
        long __functionAddress = Functions.DSP_SetParameterData;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, index, data, length, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_SetParameterData(@NativeType("FMOD_DSP *") long dsp, int index, @NativeType("void *") ByteBuffer data) {
        return nFMOD_DSP_SetParameterData(dsp, index, memAddress(data), data.remaining());
    }

    // --- [ FMOD_DSP_GetParameterFloat ] ---

    public static int nFMOD_DSP_GetParameterFloat(long dsp, int index, long value, long valuestr, int valuestrlen) {
        long __functionAddress = Functions.DSP_GetParameterFloat;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPI(dsp, index, value, valuestr, valuestrlen, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetParameterFloat(@NativeType("FMOD_DSP *") long dsp, int index, @Nullable @NativeType("float *") FloatBuffer value, @Nullable @NativeType("char *") ByteBuffer valuestr) {
        if (CHECKS) {
            checkSafe(value, 1);
        }
        return nFMOD_DSP_GetParameterFloat(dsp, index, memAddressSafe(value), memAddressSafe(valuestr), remainingSafe(valuestr));
    }

    // --- [ FMOD_DSP_GetParameterInt ] ---

    public static int nFMOD_DSP_GetParameterInt(long dsp, int index, long value, long valuestr, int valuestrlen) {
        long __functionAddress = Functions.DSP_GetParameterInt;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPI(dsp, index, value, valuestr, valuestrlen, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetParameterInt(@NativeType("FMOD_DSP *") long dsp, int index, @Nullable @NativeType("int *") IntBuffer value, @Nullable @NativeType("char *") ByteBuffer valuestr) {
        if (CHECKS) {
            checkSafe(value, 1);
        }
        return nFMOD_DSP_GetParameterInt(dsp, index, memAddressSafe(value), memAddressSafe(valuestr), remainingSafe(valuestr));
    }

    // --- [ FMOD_DSP_GetParameterBool ] ---

    public static int nFMOD_DSP_GetParameterBool(long dsp, int index, long value, long valuestr, int valuestrlen) {
        long __functionAddress = Functions.DSP_GetParameterBool;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPI(dsp, index, value, valuestr, valuestrlen, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetParameterBool(@NativeType("FMOD_DSP *") long dsp, int index, @Nullable @NativeType("FMOD_BOOL *") IntBuffer value, @Nullable @NativeType("char *") ByteBuffer valuestr) {
        if (CHECKS) {
            checkSafe(value, 1);
        }
        return nFMOD_DSP_GetParameterBool(dsp, index, memAddressSafe(value), memAddressSafe(valuestr), remainingSafe(valuestr));
    }

    // --- [ FMOD_DSP_GetParameterData ] ---

    public static int nFMOD_DSP_GetParameterData(long dsp, int index, long data, long length, long valuestr, int valuestrlen) {
        long __functionAddress = Functions.DSP_GetParameterData;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPPI(dsp, index, data, length, valuestr, valuestrlen, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetParameterData(@NativeType("FMOD_DSP *") long dsp, int index, @Nullable @NativeType("void **") PointerBuffer data, @Nullable @NativeType("unsigned int *") IntBuffer length, @Nullable @NativeType("char *") ByteBuffer valuestr) {
        if (CHECKS) {
            checkSafe(data, 1);
            checkSafe(length, 1);
        }
        return nFMOD_DSP_GetParameterData(dsp, index, memAddressSafe(data), memAddressSafe(length), memAddressSafe(valuestr), remainingSafe(valuestr));
    }

    // --- [ FMOD_DSP_GetNumParameters ] ---

    public static int nFMOD_DSP_GetNumParameters(long dsp, long numparams) {
        long __functionAddress = Functions.DSP_GetNumParameters;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, numparams, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetNumParameters(@NativeType("FMOD_DSP *") long dsp, @NativeType("int *") IntBuffer numparams) {
        if (CHECKS) {
            check(numparams, 1);
        }
        return nFMOD_DSP_GetNumParameters(dsp, memAddress(numparams));
    }

    // --- [ FMOD_DSP_GetParameterInfo ] ---

    public static int nFMOD_DSP_GetParameterInfo(long dsp, int index, long desc) {
        long __functionAddress = Functions.DSP_GetParameterInfo;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, index, desc, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetParameterInfo(@NativeType("FMOD_DSP *") long dsp, int index, @NativeType("FMOD_DSP_PARAMETER_DESC **") PointerBuffer desc) {
        if (CHECKS) {
            check(desc, 1);
        }
        return nFMOD_DSP_GetParameterInfo(dsp, index, memAddress(desc));
    }

    // --- [ FMOD_DSP_GetDataParameterIndex ] ---

    public static int nFMOD_DSP_GetDataParameterIndex(long dsp, int datatype, long index) {
        long __functionAddress = Functions.DSP_GetDataParameterIndex;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, datatype, index, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetDataParameterIndex(@NativeType("FMOD_DSP *") long dsp, int datatype, @NativeType("int *") IntBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        return nFMOD_DSP_GetDataParameterIndex(dsp, datatype, memAddress(index));
    }

    // --- [ FMOD_DSP_ShowConfigDialog ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_ShowConfigDialog(@NativeType("FMOD_DSP *") long dsp, @NativeType("void *") long hwnd, @NativeType("FMOD_BOOL") int show) {
        long __functionAddress = Functions.DSP_ShowConfigDialog;
        if (CHECKS) {
            check(dsp);
            check(hwnd);
        }
        return callPPI(dsp, hwnd, show, __functionAddress);
    }

    // --- [ FMOD_DSP_GetInfo ] ---

    /** Unsafe version of: {@link #FMOD_DSP_GetInfo DSP_GetInfo} */
    public static int nFMOD_DSP_GetInfo(long dsp, long name, long version, long channels, long configwidth, long configheight) {
        long __functionAddress = Functions.DSP_GetInfo;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPPPPI(dsp, name, version, channels, configwidth, configheight, __functionAddress);
    }

    /** DSP attributes. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetInfo(@NativeType("FMOD_DSP *") long dsp, @Nullable @NativeType("char *") ByteBuffer name, @Nullable @NativeType("unsigned int *") IntBuffer version, @Nullable @NativeType("int *") IntBuffer channels, @Nullable @NativeType("int *") IntBuffer configwidth, @Nullable @NativeType("int *") IntBuffer configheight) {
        if (CHECKS) {
            checkSafe(name, 32);
            checkSafe(version, 1);
            checkSafe(channels, 1);
            checkSafe(configwidth, 1);
            checkSafe(configheight, 1);
        }
        return nFMOD_DSP_GetInfo(dsp, memAddressSafe(name), memAddressSafe(version), memAddressSafe(channels), memAddressSafe(configwidth), memAddressSafe(configheight));
    }

    // --- [ FMOD_DSP_GetType ] ---

    public static int nFMOD_DSP_GetType(long dsp, long type) {
        long __functionAddress = Functions.DSP_GetType;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, type, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetType(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_DSP_TYPE *") IntBuffer type) {
        if (CHECKS) {
            check(type, 1);
        }
        return nFMOD_DSP_GetType(dsp, memAddress(type));
    }

    // --- [ FMOD_DSP_GetIdle ] ---

    public static int nFMOD_DSP_GetIdle(long dsp, long idle) {
        long __functionAddress = Functions.DSP_GetIdle;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, idle, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetIdle(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_BOOL *") IntBuffer idle) {
        if (CHECKS) {
            check(idle, 1);
        }
        return nFMOD_DSP_GetIdle(dsp, memAddress(idle));
    }

    // --- [ FMOD_DSP_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_SetUserData(@NativeType("FMOD_DSP *") long dsp, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.DSP_SetUserData;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, userdata, __functionAddress);
    }

    // --- [ FMOD_DSP_GetUserData ] ---

    public static int nFMOD_DSP_GetUserData(long dsp, long userdata) {
        long __functionAddress = Functions.DSP_GetUserData;
        if (CHECKS) {
            check(dsp);
        }
        return callPPI(dsp, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetUserData(@NativeType("FMOD_DSP *") long dsp, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_DSP_GetUserData(dsp, memAddress(userdata));
    }

    // --- [ FMOD_DSP_SetMeteringEnabled ] ---

    /** Metering. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_SetMeteringEnabled(@NativeType("FMOD_DSP *") long dsp, @NativeType("FMOD_BOOL") int inputEnabled, @NativeType("FMOD_BOOL") int outputEnabled) {
        long __functionAddress = Functions.DSP_SetMeteringEnabled;
        if (CHECKS) {
            check(dsp);
        }
        return callPI(dsp, inputEnabled, outputEnabled, __functionAddress);
    }

    // --- [ FMOD_DSP_GetMeteringEnabled ] ---

    public static int nFMOD_DSP_GetMeteringEnabled(long dsp, long inputEnabled, long outputEnabled) {
        long __functionAddress = Functions.DSP_GetMeteringEnabled;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPI(dsp, inputEnabled, outputEnabled, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetMeteringEnabled(@NativeType("FMOD_DSP *") long dsp, @Nullable @NativeType("FMOD_BOOL *") IntBuffer inputEnabled, @Nullable @NativeType("FMOD_BOOL *") IntBuffer outputEnabled) {
        if (CHECKS) {
            checkSafe(inputEnabled, 1);
            checkSafe(outputEnabled, 1);
        }
        return nFMOD_DSP_GetMeteringEnabled(dsp, memAddressSafe(inputEnabled), memAddressSafe(outputEnabled));
    }

    // --- [ FMOD_DSP_GetMeteringInfo ] ---

    public static int nFMOD_DSP_GetMeteringInfo(long dsp, long inputInfo, long outputInfo) {
        long __functionAddress = Functions.DSP_GetMeteringInfo;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPI(dsp, inputInfo, outputInfo, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetMeteringInfo(@NativeType("FMOD_DSP *") long dsp, @Nullable @NativeType("FMOD_DSP_METERING_INFO *") FMOD_DSP_METERING_INFO inputInfo, @Nullable @NativeType("FMOD_DSP_METERING_INFO *") FMOD_DSP_METERING_INFO outputInfo) {
        return nFMOD_DSP_GetMeteringInfo(dsp, memAddressSafe(inputInfo), memAddressSafe(outputInfo));
    }

    // --- [ FMOD_DSP_GetCPUUsage ] ---

    public static int nFMOD_DSP_GetCPUUsage(long dsp, long exclusive, long inclusive) {
        long __functionAddress = Functions.DSP_GetCPUUsage;
        if (CHECKS) {
            check(dsp);
        }
        return callPPPI(dsp, exclusive, inclusive, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSP_GetCPUUsage(@NativeType("FMOD_DSP *") long dsp, @Nullable @NativeType("unsigned int *") IntBuffer exclusive, @Nullable @NativeType("unsigned int *") IntBuffer inclusive) {
        if (CHECKS) {
            checkSafe(exclusive, 1);
            checkSafe(inclusive, 1);
        }
        return nFMOD_DSP_GetCPUUsage(dsp, memAddressSafe(exclusive), memAddressSafe(inclusive));
    }

    // --- [ FMOD_DSPConnection_GetInput ] ---

    public static int nFMOD_DSPConnection_GetInput(long dspconnection, long input) {
        long __functionAddress = Functions.DSPConnection_GetInput;
        if (CHECKS) {
            check(dspconnection);
        }
        return callPPI(dspconnection, input, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSPConnection_GetInput(@NativeType("FMOD_DSPCONNECTION *") long dspconnection, @NativeType("FMOD_DSP **") PointerBuffer input) {
        if (CHECKS) {
            check(input, 1);
        }
        return nFMOD_DSPConnection_GetInput(dspconnection, memAddress(input));
    }

    // --- [ FMOD_DSPConnection_GetOutput ] ---

    public static int nFMOD_DSPConnection_GetOutput(long dspconnection, long output) {
        long __functionAddress = Functions.DSPConnection_GetOutput;
        if (CHECKS) {
            check(dspconnection);
        }
        return callPPI(dspconnection, output, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSPConnection_GetOutput(@NativeType("FMOD_DSPCONNECTION *") long dspconnection, @NativeType("FMOD_DSP **") PointerBuffer output) {
        if (CHECKS) {
            check(output, 1);
        }
        return nFMOD_DSPConnection_GetOutput(dspconnection, memAddress(output));
    }

    // --- [ FMOD_DSPConnection_SetMix ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSPConnection_SetMix(@NativeType("FMOD_DSPCONNECTION *") long dspconnection, float volume) {
        long __functionAddress = Functions.DSPConnection_SetMix;
        if (CHECKS) {
            check(dspconnection);
        }
        return callPI(dspconnection, volume, __functionAddress);
    }

    // --- [ FMOD_DSPConnection_GetMix ] ---

    public static int nFMOD_DSPConnection_GetMix(long dspconnection, long volume) {
        long __functionAddress = Functions.DSPConnection_GetMix;
        if (CHECKS) {
            check(dspconnection);
        }
        return callPPI(dspconnection, volume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSPConnection_GetMix(@NativeType("FMOD_DSPCONNECTION *") long dspconnection, @NativeType("float *") FloatBuffer volume) {
        if (CHECKS) {
            check(volume, 1);
        }
        return nFMOD_DSPConnection_GetMix(dspconnection, memAddress(volume));
    }

    // --- [ FMOD_DSPConnection_SetMixMatrix ] ---

    public static int nFMOD_DSPConnection_SetMixMatrix(long dspconnection, long matrix, int outchannels, int inchannels, int inchannel_hop) {
        long __functionAddress = Functions.DSPConnection_SetMixMatrix;
        if (CHECKS) {
            check(dspconnection);
        }
        return callPPI(dspconnection, matrix, outchannels, inchannels, inchannel_hop, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSPConnection_SetMixMatrix(@NativeType("FMOD_DSPCONNECTION *") long dspconnection, @Nullable @NativeType("float *") FloatBuffer matrix, int outchannels, int inchannels, int inchannel_hop) {
        if (CHECKS) {
            checkSafe(matrix, outchannels * (inchannel_hop == 0 ? inchannels : inchannel_hop));
        }
        return nFMOD_DSPConnection_SetMixMatrix(dspconnection, memAddressSafe(matrix), outchannels, inchannels, inchannel_hop);
    }

    // --- [ FMOD_DSPConnection_GetMixMatrix ] ---

    public static int nFMOD_DSPConnection_GetMixMatrix(long dspconnection, long matrix, long outchannels, long inchannels, int inchannel_hop) {
        long __functionAddress = Functions.DSPConnection_GetMixMatrix;
        if (CHECKS) {
            check(dspconnection);
        }
        return callPPPPI(dspconnection, matrix, outchannels, inchannels, inchannel_hop, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSPConnection_GetMixMatrix(@NativeType("FMOD_DSPCONNECTION *") long dspconnection, @Nullable @NativeType("float *") FloatBuffer matrix, @Nullable @NativeType("int *") IntBuffer outchannels, @Nullable @NativeType("int *") IntBuffer inchannels, int inchannel_hop) {
        if (CHECKS) {
            checkSafe(outchannels, 1);
            checkSafe(inchannels, 1);
        }
        return nFMOD_DSPConnection_GetMixMatrix(dspconnection, memAddressSafe(matrix), memAddressSafe(outchannels), memAddressSafe(inchannels), inchannel_hop);
    }

    // --- [ FMOD_DSPConnection_GetType ] ---

    public static int nFMOD_DSPConnection_GetType(long dspconnection, long type) {
        long __functionAddress = Functions.DSPConnection_GetType;
        if (CHECKS) {
            check(dspconnection);
        }
        return callPPI(dspconnection, type, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSPConnection_GetType(@NativeType("FMOD_DSPCONNECTION *") long dspconnection, @NativeType("FMOD_DSPCONNECTION_TYPE *") IntBuffer type) {
        if (CHECKS) {
            check(type, 1);
        }
        return nFMOD_DSPConnection_GetType(dspconnection, memAddress(type));
    }

    // --- [ FMOD_DSPConnection_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSPConnection_SetUserData(@NativeType("FMOD_DSPCONNECTION *") long dspconnection, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.DSPConnection_SetUserData;
        if (CHECKS) {
            check(dspconnection);
        }
        return callPPI(dspconnection, userdata, __functionAddress);
    }

    // --- [ FMOD_DSPConnection_GetUserData ] ---

    public static int nFMOD_DSPConnection_GetUserData(long dspconnection, long userdata) {
        long __functionAddress = Functions.DSPConnection_GetUserData;
        if (CHECKS) {
            check(dspconnection);
        }
        return callPPI(dspconnection, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_DSPConnection_GetUserData(@NativeType("FMOD_DSPCONNECTION *") long dspconnection, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_DSPConnection_GetUserData(dspconnection, memAddress(userdata));
    }

    // --- [ FMOD_Geometry_Release ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_Release(@NativeType("FMOD_GEOMETRY *") long geometry) {
        long __functionAddress = Functions.Geometry_Release;
        if (CHECKS) {
            check(geometry);
        }
        return callPI(geometry, __functionAddress);
    }

    // --- [ FMOD_Geometry_AddPolygon ] ---

    /** Unsafe version of: {@link #FMOD_Geometry_AddPolygon Geometry_AddPolygon} */
    public static int nFMOD_Geometry_AddPolygon(long geometry, float directocclusion, float reverbocclusion, int doublesided, int numvertices, long vertices, long polygonindex) {
        long __functionAddress = Functions.Geometry_AddPolygon;
        if (CHECKS) {
            check(geometry);
        }
        return callPPPI(geometry, directocclusion, reverbocclusion, doublesided, numvertices, vertices, polygonindex, __functionAddress);
    }

    /** Polygon manipulation. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_AddPolygon(@NativeType("FMOD_GEOMETRY *") long geometry, float directocclusion, float reverbocclusion, @NativeType("FMOD_BOOL") int doublesided, @NativeType("FMOD_VECTOR const *") FMOD_VECTOR.Buffer vertices, @Nullable @NativeType("int *") IntBuffer polygonindex) {
        if (CHECKS) {
            checkSafe(polygonindex, 1);
        }
        return nFMOD_Geometry_AddPolygon(geometry, directocclusion, reverbocclusion, doublesided, vertices.remaining(), vertices.address(), memAddressSafe(polygonindex));
    }

    // --- [ FMOD_Geometry_GetNumPolygons ] ---

    public static int nFMOD_Geometry_GetNumPolygons(long geometry, long numpolygons) {
        long __functionAddress = Functions.Geometry_GetNumPolygons;
        if (CHECKS) {
            check(geometry);
        }
        return callPPI(geometry, numpolygons, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_GetNumPolygons(@NativeType("FMOD_GEOMETRY *") long geometry, @NativeType("int *") IntBuffer numpolygons) {
        if (CHECKS) {
            check(numpolygons, 1);
        }
        return nFMOD_Geometry_GetNumPolygons(geometry, memAddress(numpolygons));
    }

    // --- [ FMOD_Geometry_GetMaxPolygons ] ---

    public static int nFMOD_Geometry_GetMaxPolygons(long geometry, long maxpolygons, long maxvertices) {
        long __functionAddress = Functions.Geometry_GetMaxPolygons;
        if (CHECKS) {
            check(geometry);
        }
        return callPPPI(geometry, maxpolygons, maxvertices, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_GetMaxPolygons(@NativeType("FMOD_GEOMETRY *") long geometry, @Nullable @NativeType("int *") IntBuffer maxpolygons, @Nullable @NativeType("int *") IntBuffer maxvertices) {
        if (CHECKS) {
            checkSafe(maxpolygons, 1);
            checkSafe(maxvertices, 1);
        }
        return nFMOD_Geometry_GetMaxPolygons(geometry, memAddressSafe(maxpolygons), memAddressSafe(maxvertices));
    }

    // --- [ FMOD_Geometry_GetPolygonNumVertices ] ---

    public static int nFMOD_Geometry_GetPolygonNumVertices(long geometry, int index, long numvertices) {
        long __functionAddress = Functions.Geometry_GetPolygonNumVertices;
        if (CHECKS) {
            check(geometry);
        }
        return callPPI(geometry, index, numvertices, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_GetPolygonNumVertices(@NativeType("FMOD_GEOMETRY *") long geometry, int index, @NativeType("int *") IntBuffer numvertices) {
        if (CHECKS) {
            check(numvertices, 1);
        }
        return nFMOD_Geometry_GetPolygonNumVertices(geometry, index, memAddress(numvertices));
    }

    // --- [ FMOD_Geometry_SetPolygonVertex ] ---

    public static int nFMOD_Geometry_SetPolygonVertex(long geometry, int index, int vertexindex, long vertex) {
        long __functionAddress = Functions.Geometry_SetPolygonVertex;
        if (CHECKS) {
            check(geometry);
        }
        return callPPI(geometry, index, vertexindex, vertex, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_SetPolygonVertex(@NativeType("FMOD_GEOMETRY *") long geometry, int index, int vertexindex, @NativeType("FMOD_VECTOR const *") FMOD_VECTOR vertex) {
        return nFMOD_Geometry_SetPolygonVertex(geometry, index, vertexindex, vertex.address());
    }

    // --- [ FMOD_Geometry_GetPolygonVertex ] ---

    public static int nFMOD_Geometry_GetPolygonVertex(long geometry, int index, int vertexindex, long vertex) {
        long __functionAddress = Functions.Geometry_GetPolygonVertex;
        if (CHECKS) {
            check(geometry);
        }
        return callPPI(geometry, index, vertexindex, vertex, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_GetPolygonVertex(@NativeType("FMOD_GEOMETRY *") long geometry, int index, int vertexindex, @NativeType("FMOD_VECTOR *") FMOD_VECTOR vertex) {
        return nFMOD_Geometry_GetPolygonVertex(geometry, index, vertexindex, vertex.address());
    }

    // --- [ FMOD_Geometry_SetPolygonAttributes ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_SetPolygonAttributes(@NativeType("FMOD_GEOMETRY *") long geometry, int index, float directocclusion, float reverbocclusion, @NativeType("FMOD_BOOL") int doublesided) {
        long __functionAddress = Functions.Geometry_SetPolygonAttributes;
        if (CHECKS) {
            check(geometry);
        }
        return callPI(geometry, index, directocclusion, reverbocclusion, doublesided, __functionAddress);
    }

    // --- [ FMOD_Geometry_GetPolygonAttributes ] ---

    public static int nFMOD_Geometry_GetPolygonAttributes(long geometry, int index, long directocclusion, long reverbocclusion, long doublesided) {
        long __functionAddress = Functions.Geometry_GetPolygonAttributes;
        if (CHECKS) {
            check(geometry);
        }
        return callPPPPI(geometry, index, directocclusion, reverbocclusion, doublesided, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_GetPolygonAttributes(@NativeType("FMOD_GEOMETRY *") long geometry, int index, @Nullable @NativeType("float *") FloatBuffer directocclusion, @Nullable @NativeType("float *") FloatBuffer reverbocclusion, @Nullable @NativeType("FMOD_BOOL *") IntBuffer doublesided) {
        if (CHECKS) {
            checkSafe(directocclusion, 1);
            checkSafe(reverbocclusion, 1);
            checkSafe(doublesided, 1);
        }
        return nFMOD_Geometry_GetPolygonAttributes(geometry, index, memAddressSafe(directocclusion), memAddressSafe(reverbocclusion), memAddressSafe(doublesided));
    }

    // --- [ FMOD_Geometry_SetActive ] ---

    /** Object manipulation. */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_SetActive(@NativeType("FMOD_GEOMETRY *") long geometry, @NativeType("FMOD_BOOL") int active) {
        long __functionAddress = Functions.Geometry_SetActive;
        if (CHECKS) {
            check(geometry);
        }
        return callPI(geometry, active, __functionAddress);
    }

    // --- [ FMOD_Geometry_GetActive ] ---

    public static int nFMOD_Geometry_GetActive(long geometry, long active) {
        long __functionAddress = Functions.Geometry_GetActive;
        if (CHECKS) {
            check(geometry);
        }
        return callPPI(geometry, active, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_GetActive(@NativeType("FMOD_GEOMETRY *") long geometry, @NativeType("FMOD_BOOL *") IntBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        return nFMOD_Geometry_GetActive(geometry, memAddress(active));
    }

    // --- [ FMOD_Geometry_SetRotation ] ---

    public static int nFMOD_Geometry_SetRotation(long geometry, long forward, long up) {
        long __functionAddress = Functions.Geometry_SetRotation;
        if (CHECKS) {
            check(geometry);
        }
        return callPPPI(geometry, forward, up, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_SetRotation(@NativeType("FMOD_GEOMETRY *") long geometry, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR forward, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR up) {
        return nFMOD_Geometry_SetRotation(geometry, memAddressSafe(forward), memAddressSafe(up));
    }

    // --- [ FMOD_Geometry_GetRotation ] ---

    public static int nFMOD_Geometry_GetRotation(long geometry, long forward, long up) {
        long __functionAddress = Functions.Geometry_GetRotation;
        if (CHECKS) {
            check(geometry);
        }
        return callPPPI(geometry, forward, up, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_GetRotation(@NativeType("FMOD_GEOMETRY *") long geometry, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR forward, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR up) {
        return nFMOD_Geometry_GetRotation(geometry, memAddressSafe(forward), memAddressSafe(up));
    }

    // --- [ FMOD_Geometry_SetPosition ] ---

    public static int nFMOD_Geometry_SetPosition(long geometry, long position) {
        long __functionAddress = Functions.Geometry_SetPosition;
        if (CHECKS) {
            check(geometry);
        }
        return callPPI(geometry, position, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_SetPosition(@NativeType("FMOD_GEOMETRY *") long geometry, @NativeType("FMOD_VECTOR const *") FMOD_VECTOR position) {
        return nFMOD_Geometry_SetPosition(geometry, position.address());
    }

    // --- [ FMOD_Geometry_GetPosition ] ---

    public static int nFMOD_Geometry_GetPosition(long geometry, long position) {
        long __functionAddress = Functions.Geometry_GetPosition;
        if (CHECKS) {
            check(geometry);
        }
        return callPPI(geometry, position, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_GetPosition(@NativeType("FMOD_GEOMETRY *") long geometry, @NativeType("FMOD_VECTOR *") FMOD_VECTOR position) {
        return nFMOD_Geometry_GetPosition(geometry, position.address());
    }

    // --- [ FMOD_Geometry_SetScale ] ---

    public static int nFMOD_Geometry_SetScale(long geometry, long scale) {
        long __functionAddress = Functions.Geometry_SetScale;
        if (CHECKS) {
            check(geometry);
        }
        return callPPI(geometry, scale, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_SetScale(@NativeType("FMOD_GEOMETRY *") long geometry, @NativeType("FMOD_VECTOR const *") FMOD_VECTOR scale) {
        return nFMOD_Geometry_SetScale(geometry, scale.address());
    }

    // --- [ FMOD_Geometry_GetScale ] ---

    public static int nFMOD_Geometry_GetScale(long geometry, long scale) {
        long __functionAddress = Functions.Geometry_GetScale;
        if (CHECKS) {
            check(geometry);
        }
        return callPPI(geometry, scale, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_GetScale(@NativeType("FMOD_GEOMETRY *") long geometry, @NativeType("FMOD_VECTOR *") FMOD_VECTOR scale) {
        return nFMOD_Geometry_GetScale(geometry, scale.address());
    }

    // --- [ FMOD_Geometry_Save ] ---

    public static int nFMOD_Geometry_Save(long geometry, long data, long datasize) {
        long __functionAddress = Functions.Geometry_Save;
        if (CHECKS) {
            check(geometry);
        }
        return callPPPI(geometry, data, datasize, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_Save(@NativeType("FMOD_GEOMETRY *") long geometry, @Nullable @NativeType("void *") ByteBuffer data, @NativeType("int *") IntBuffer datasize) {
        if (CHECKS) {
            check(datasize, 1);
        }
        return nFMOD_Geometry_Save(geometry, memAddressSafe(data), memAddress(datasize));
    }

    // --- [ FMOD_Geometry_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_SetUserData(@NativeType("FMOD_GEOMETRY *") long geometry, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.Geometry_SetUserData;
        if (CHECKS) {
            check(geometry);
        }
        return callPPI(geometry, userdata, __functionAddress);
    }

    // --- [ FMOD_Geometry_GetUserData ] ---

    public static int nFMOD_Geometry_GetUserData(long geometry, long userdata) {
        long __functionAddress = Functions.Geometry_GetUserData;
        if (CHECKS) {
            check(geometry);
        }
        return callPPI(geometry, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Geometry_GetUserData(@NativeType("FMOD_GEOMETRY *") long geometry, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Geometry_GetUserData(geometry, memAddress(userdata));
    }

    // --- [ FMOD_Reverb3D_Release ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Reverb3D_Release(@NativeType("FMOD_REVERB3D *") long reverb3d) {
        long __functionAddress = Functions.Reverb3D_Release;
        if (CHECKS) {
            check(reverb3d);
        }
        return callPI(reverb3d, __functionAddress);
    }

    // --- [ FMOD_Reverb3D_Set3DAttributes ] ---

    public static int nFMOD_Reverb3D_Set3DAttributes(long reverb3d, long position, float mindistance, float maxdistance) {
        long __functionAddress = Functions.Reverb3D_Set3DAttributes;
        if (CHECKS) {
            check(reverb3d);
        }
        return callPPI(reverb3d, position, mindistance, maxdistance, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Reverb3D_Set3DAttributes(@NativeType("FMOD_REVERB3D *") long reverb3d, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR position, float mindistance, float maxdistance) {
        return nFMOD_Reverb3D_Set3DAttributes(reverb3d, memAddressSafe(position), mindistance, maxdistance);
    }

    // --- [ FMOD_Reverb3D_Get3DAttributes ] ---

    public static int nFMOD_Reverb3D_Get3DAttributes(long reverb3d, long position, long mindistance, long maxdistance) {
        long __functionAddress = Functions.Reverb3D_Get3DAttributes;
        if (CHECKS) {
            check(reverb3d);
        }
        return callPPPPI(reverb3d, position, mindistance, maxdistance, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Reverb3D_Get3DAttributes(@NativeType("FMOD_REVERB3D *") long reverb3d, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR position, @Nullable @NativeType("float *") FloatBuffer mindistance, @Nullable @NativeType("float *") FloatBuffer maxdistance) {
        if (CHECKS) {
            checkSafe(mindistance, 1);
            checkSafe(maxdistance, 1);
        }
        return nFMOD_Reverb3D_Get3DAttributes(reverb3d, memAddressSafe(position), memAddressSafe(mindistance), memAddressSafe(maxdistance));
    }

    // --- [ FMOD_Reverb3D_SetProperties ] ---

    public static int nFMOD_Reverb3D_SetProperties(long reverb3d, long properties) {
        long __functionAddress = Functions.Reverb3D_SetProperties;
        if (CHECKS) {
            check(reverb3d);
        }
        return callPPI(reverb3d, properties, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Reverb3D_SetProperties(@NativeType("FMOD_REVERB3D *") long reverb3d, @NativeType("FMOD_REVERB_PROPERTIES const *") FMOD_REVERB_PROPERTIES properties) {
        return nFMOD_Reverb3D_SetProperties(reverb3d, properties.address());
    }

    // --- [ FMOD_Reverb3D_GetProperties ] ---

    public static int nFMOD_Reverb3D_GetProperties(long reverb3d, long properties) {
        long __functionAddress = Functions.Reverb3D_GetProperties;
        if (CHECKS) {
            check(reverb3d);
        }
        return callPPI(reverb3d, properties, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Reverb3D_GetProperties(@NativeType("FMOD_REVERB3D *") long reverb3d, @NativeType("FMOD_REVERB_PROPERTIES *") FMOD_REVERB_PROPERTIES properties) {
        return nFMOD_Reverb3D_GetProperties(reverb3d, properties.address());
    }

    // --- [ FMOD_Reverb3D_SetActive ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Reverb3D_SetActive(@NativeType("FMOD_REVERB3D *") long reverb3d, @NativeType("FMOD_BOOL") int active) {
        long __functionAddress = Functions.Reverb3D_SetActive;
        if (CHECKS) {
            check(reverb3d);
        }
        return callPI(reverb3d, active, __functionAddress);
    }

    // --- [ FMOD_Reverb3D_GetActive ] ---

    public static int nFMOD_Reverb3D_GetActive(long reverb3d, long active) {
        long __functionAddress = Functions.Reverb3D_GetActive;
        if (CHECKS) {
            check(reverb3d);
        }
        return callPPI(reverb3d, active, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Reverb3D_GetActive(@NativeType("FMOD_REVERB3D *") long reverb3d, @NativeType("FMOD_BOOL *") IntBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        return nFMOD_Reverb3D_GetActive(reverb3d, memAddress(active));
    }

    // --- [ FMOD_Reverb3D_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Reverb3D_SetUserData(@NativeType("FMOD_REVERB3D *") long reverb3d, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.Reverb3D_SetUserData;
        if (CHECKS) {
            check(reverb3d);
        }
        return callPPI(reverb3d, userdata, __functionAddress);
    }

    // --- [ FMOD_Reverb3D_GetUserData ] ---

    public static int nFMOD_Reverb3D_GetUserData(long reverb3d, long userdata) {
        long __functionAddress = Functions.Reverb3D_GetUserData;
        if (CHECKS) {
            check(reverb3d);
        }
        return callPPI(reverb3d, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Reverb3D_GetUserData(@NativeType("FMOD_REVERB3D *") long reverb3d, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Reverb3D_GetUserData(reverb3d, memAddress(userdata));
    }

}