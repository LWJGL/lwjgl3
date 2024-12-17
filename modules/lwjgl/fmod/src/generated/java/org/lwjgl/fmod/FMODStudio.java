/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

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

public class FMODStudio {

    static {
        // Make sure fmod is loaded first, fmodstudio depends on it.
        FMOD.getLibrary();
    }

    private static final SharedLibrary FMODSTUDIO = Library.loadNative(FMODStudio.class, "org.lwjgl.fmod", Configuration.FMOD_STUDIO_LIBRARY_NAME, "fmodstudio");

    /** Contains the function pointers loaded from the FMODSTUDIO {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ParseID                                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_ParseID"),
            System_Create                                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_Create"),
            System_IsValid                                  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_IsValid"),
            System_SetAdvancedSettings                      = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_SetAdvancedSettings"),
            System_GetAdvancedSettings                      = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetAdvancedSettings"),
            System_Initialize                               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_Initialize"),
            System_Release                                  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_Release"),
            System_Update                                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_Update"),
            System_GetCoreSystem                            = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetCoreSystem"),
            System_GetEvent                                 = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetEvent"),
            System_GetBus                                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetBus"),
            System_GetVCA                                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetVCA"),
            System_GetBank                                  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetBank"),
            System_GetEventByID                             = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetEventByID"),
            System_GetBusByID                               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetBusByID"),
            System_GetVCAByID                               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetVCAByID"),
            System_GetBankByID                              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetBankByID"),
            System_GetSoundInfo                             = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetSoundInfo"),
            System_GetParameterDescriptionByName            = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetParameterDescriptionByName"),
            System_GetParameterDescriptionByID              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetParameterDescriptionByID"),
            System_GetParameterLabelByName                  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetParameterLabelByName"),
            System_GetParameterLabelByID                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetParameterLabelByID"),
            System_GetParameterByID                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetParameterByID"),
            System_SetParameterByID                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_SetParameterByID"),
            System_SetParameterByIDWithLabel                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_SetParameterByIDWithLabel"),
            System_SetParametersByIDs                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_SetParametersByIDs"),
            System_GetParameterByName                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetParameterByName"),
            System_SetParameterByName                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_SetParameterByName"),
            System_SetParameterByNameWithLabel              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_SetParameterByNameWithLabel"),
            System_LookupID                                 = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_LookupID"),
            System_LookupPath                               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_LookupPath"),
            System_GetNumListeners                          = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetNumListeners"),
            System_SetNumListeners                          = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_SetNumListeners"),
            System_GetListenerAttributes                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetListenerAttributes"),
            System_SetListenerAttributes                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_SetListenerAttributes"),
            System_GetListenerWeight                        = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetListenerWeight"),
            System_SetListenerWeight                        = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_SetListenerWeight"),
            System_LoadBankFile                             = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_LoadBankFile"),
            System_LoadBankMemory                           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_LoadBankMemory"),
            System_LoadBankCustom                           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_LoadBankCustom"),
            System_RegisterPlugin                           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_RegisterPlugin"),
            System_UnregisterPlugin                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_UnregisterPlugin"),
            System_UnloadAll                                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_UnloadAll"),
            System_FlushCommands                            = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_FlushCommands"),
            System_FlushSampleLoading                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_FlushSampleLoading"),
            System_StartCommandCapture                      = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_StartCommandCapture"),
            System_StopCommandCapture                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_StopCommandCapture"),
            System_LoadCommandReplay                        = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_LoadCommandReplay"),
            System_GetBankCount                             = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetBankCount"),
            System_GetBankList                              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetBankList"),
            System_GetParameterDescriptionCount             = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetParameterDescriptionCount"),
            System_GetParameterDescriptionList              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetParameterDescriptionList"),
            System_GetCPUUsage                              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetCPUUsage"),
            System_GetBufferUsage                           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetBufferUsage"),
            System_ResetBufferUsage                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_ResetBufferUsage"),
            System_SetCallback                              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_SetCallback"),
            System_SetUserData                              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_SetUserData"),
            System_GetUserData                              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetUserData"),
            System_GetMemoryUsage                           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_System_GetMemoryUsage"),
            EventDescription_IsValid                        = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_IsValid"),
            EventDescription_GetID                          = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetID"),
            EventDescription_GetPath                        = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetPath"),
            EventDescription_GetParameterDescriptionCount   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetParameterDescriptionCount"),
            EventDescription_GetParameterDescriptionByIndex = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetParameterDescriptionByIndex"),
            EventDescription_GetParameterDescriptionByName  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetParameterDescriptionByName"),
            EventDescription_GetParameterDescriptionByID    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetParameterDescriptionByID"),
            EventDescription_GetParameterLabelByIndex       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetParameterLabelByIndex"),
            EventDescription_GetParameterLabelByName        = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetParameterLabelByName"),
            EventDescription_GetParameterLabelByID          = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetParameterLabelByID"),
            EventDescription_GetUserPropertyCount           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetUserPropertyCount"),
            EventDescription_GetUserPropertyByIndex         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetUserPropertyByIndex"),
            EventDescription_GetUserProperty                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetUserProperty"),
            EventDescription_GetLength                      = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetLength"),
            EventDescription_GetMinMaxDistance              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetMinMaxDistance"),
            EventDescription_GetSoundSize                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetSoundSize"),
            EventDescription_IsSnapshot                     = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_IsSnapshot"),
            EventDescription_IsOneshot                      = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_IsOneshot"),
            EventDescription_IsStream                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_IsStream"),
            EventDescription_Is3D                           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_Is3D"),
            EventDescription_IsDopplerEnabled               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_IsDopplerEnabled"),
            EventDescription_HasSustainPoint                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_HasSustainPoint"),
            EventDescription_CreateInstance                 = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_CreateInstance"),
            EventDescription_GetInstanceCount               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetInstanceCount"),
            EventDescription_GetInstanceList                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetInstanceList"),
            EventDescription_LoadSampleData                 = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_LoadSampleData"),
            EventDescription_UnloadSampleData               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_UnloadSampleData"),
            EventDescription_GetSampleLoadingState          = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetSampleLoadingState"),
            EventDescription_ReleaseAllInstances            = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_ReleaseAllInstances"),
            EventDescription_SetCallback                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_SetCallback"),
            EventDescription_GetUserData                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_GetUserData"),
            EventDescription_SetUserData                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventDescription_SetUserData"),
            EventInstance_IsValid                           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_IsValid"),
            EventInstance_GetDescription                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetDescription"),
            EventInstance_GetSystem                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetSystem"),
            EventInstance_GetVolume                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetVolume"),
            EventInstance_SetVolume                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetVolume"),
            EventInstance_GetPitch                          = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetPitch"),
            EventInstance_SetPitch                          = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetPitch"),
            EventInstance_Get3DAttributes                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_Get3DAttributes"),
            EventInstance_Set3DAttributes                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_Set3DAttributes"),
            EventInstance_GetListenerMask                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetListenerMask"),
            EventInstance_SetListenerMask                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetListenerMask"),
            EventInstance_GetProperty                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetProperty"),
            EventInstance_SetProperty                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetProperty"),
            EventInstance_GetReverbLevel                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetReverbLevel"),
            EventInstance_SetReverbLevel                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetReverbLevel"),
            EventInstance_GetPaused                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetPaused"),
            EventInstance_SetPaused                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetPaused"),
            EventInstance_Start                             = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_Start"),
            EventInstance_Stop                              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_Stop"),
            EventInstance_GetTimelinePosition               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetTimelinePosition"),
            EventInstance_SetTimelinePosition               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetTimelinePosition"),
            EventInstance_GetPlaybackState                  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetPlaybackState"),
            EventInstance_GetChannelGroup                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetChannelGroup"),
            EventInstance_GetMinMaxDistance                 = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetMinMaxDistance"),
            EventInstance_Release                           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_Release"),
            EventInstance_IsVirtual                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_IsVirtual"),
            EventInstance_GetParameterByName                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetParameterByName"),
            EventInstance_SetParameterByName                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetParameterByName"),
            EventInstance_SetParameterByNameWithLabel       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetParameterByNameWithLabel"),
            EventInstance_GetParameterByID                  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetParameterByID"),
            EventInstance_SetParameterByID                  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetParameterByID"),
            EventInstance_SetParameterByIDWithLabel         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetParameterByIDWithLabel"),
            EventInstance_SetParametersByIDs                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetParametersByIDs"),
            EventInstance_KeyOff                            = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_KeyOff"),
            EventInstance_SetCallback                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetCallback"),
            EventInstance_GetUserData                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetUserData"),
            EventInstance_SetUserData                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_SetUserData"),
            EventInstance_GetCPUUsage                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetCPUUsage"),
            EventInstance_GetMemoryUsage                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_EventInstance_GetMemoryUsage"),
            Bus_IsValid                                     = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_IsValid"),
            Bus_GetID                                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_GetID"),
            Bus_GetPath                                     = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_GetPath"),
            Bus_GetVolume                                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_GetVolume"),
            Bus_SetVolume                                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_SetVolume"),
            Bus_GetPaused                                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_GetPaused"),
            Bus_SetPaused                                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_SetPaused"),
            Bus_GetMute                                     = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_GetMute"),
            Bus_SetMute                                     = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_SetMute"),
            Bus_StopAllEvents                               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_StopAllEvents"),
            Bus_GetPortIndex                                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_GetPortIndex"),
            Bus_SetPortIndex                                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_SetPortIndex"),
            Bus_LockChannelGroup                            = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_LockChannelGroup"),
            Bus_UnlockChannelGroup                          = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_UnlockChannelGroup"),
            Bus_GetChannelGroup                             = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_GetChannelGroup"),
            Bus_GetCPUUsage                                 = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_GetCPUUsage"),
            Bus_GetMemoryUsage                              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bus_GetMemoryUsage"),
            VCA_IsValid                                     = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_VCA_IsValid"),
            VCA_GetID                                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_VCA_GetID"),
            VCA_GetPath                                     = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_VCA_GetPath"),
            VCA_GetVolume                                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_VCA_GetVolume"),
            VCA_SetVolume                                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_VCA_SetVolume"),
            Bank_IsValid                                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_IsValid"),
            Bank_GetID                                      = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetID"),
            Bank_GetPath                                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetPath"),
            Bank_Unload                                     = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_Unload"),
            Bank_LoadSampleData                             = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_LoadSampleData"),
            Bank_UnloadSampleData                           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_UnloadSampleData"),
            Bank_GetLoadingState                            = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetLoadingState"),
            Bank_GetSampleLoadingState                      = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetSampleLoadingState"),
            Bank_GetStringCount                             = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetStringCount"),
            Bank_GetStringInfo                              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetStringInfo"),
            Bank_GetEventCount                              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetEventCount"),
            Bank_GetEventList                               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetEventList"),
            Bank_GetBusCount                                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetBusCount"),
            Bank_GetBusList                                 = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetBusList"),
            Bank_GetVCACount                                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetVCACount"),
            Bank_GetVCAList                                 = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetVCAList"),
            Bank_GetUserData                                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_GetUserData"),
            Bank_SetUserData                                = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_Bank_SetUserData"),
            CommandReplay_IsValid                           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_IsValid"),
            CommandReplay_GetSystem                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_GetSystem"),
            CommandReplay_GetLength                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_GetLength"),
            CommandReplay_GetCommandCount                   = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_GetCommandCount"),
            CommandReplay_GetCommandInfo                    = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_GetCommandInfo"),
            CommandReplay_GetCommandString                  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_GetCommandString"),
            CommandReplay_GetCommandAtTime                  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_GetCommandAtTime"),
            CommandReplay_SetBankPath                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_SetBankPath"),
            CommandReplay_Start                             = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_Start"),
            CommandReplay_Stop                              = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_Stop"),
            CommandReplay_SeekToTime                        = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_SeekToTime"),
            CommandReplay_SeekToCommand                     = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_SeekToCommand"),
            CommandReplay_GetPaused                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_GetPaused"),
            CommandReplay_SetPaused                         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_SetPaused"),
            CommandReplay_GetPlaybackState                  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_GetPlaybackState"),
            CommandReplay_GetCurrentCommand                 = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_GetCurrentCommand"),
            CommandReplay_Release                           = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_Release"),
            CommandReplay_SetFrameCallback                  = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_SetFrameCallback"),
            CommandReplay_SetLoadBankCallback               = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_SetLoadBankCallback"),
            CommandReplay_SetCreateInstanceCallback         = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_SetCreateInstanceCallback"),
            CommandReplay_GetUserData                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_GetUserData"),
            CommandReplay_SetUserData                       = apiGetFunctionAddress(FMODSTUDIO, "FMOD_Studio_CommandReplay_SetUserData");

    }

    /** Returns the FMODSTUDIO {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return FMODSTUDIO;
    }

    public static final int FMOD_STUDIO_LOAD_MEMORY_ALIGNMENT = 32;

    public static final int
        FMOD_STUDIO_INIT_NORMAL                = 0x0,
        FMOD_STUDIO_INIT_LIVEUPDATE            = 0x1,
        FMOD_STUDIO_INIT_ALLOW_MISSING_PLUGINS = 0x2,
        FMOD_STUDIO_INIT_SYNCHRONOUS_UPDATE    = 0x4,
        FMOD_STUDIO_INIT_DEFERRED_CALLBACKS    = 0x8,
        FMOD_STUDIO_INIT_LOAD_FROM_UPDATE      = 0x10,
        FMOD_STUDIO_INIT_MEMORY_TRACKING       = 0x20;

    public static final int
        FMOD_STUDIO_PARAMETER_READONLY  = 0x1,
        FMOD_STUDIO_PARAMETER_AUTOMATIC = 0x2,
        FMOD_STUDIO_PARAMETER_GLOBAL    = 0x4,
        FMOD_STUDIO_PARAMETER_DISCRETE  = 0x8,
        FMOD_STUDIO_PARAMETER_LABELED   = 0x10;

    public static final int
        FMOD_STUDIO_SYSTEM_CALLBACK_PREUPDATE               = 0x1,
        FMOD_STUDIO_SYSTEM_CALLBACK_POSTUPDATE              = 0x2,
        FMOD_STUDIO_SYSTEM_CALLBACK_BANK_UNLOAD             = 0x4,
        FMOD_STUDIO_SYSTEM_CALLBACK_LIVEUPDATE_CONNECTED    = 0x8,
        FMOD_STUDIO_SYSTEM_CALLBACK_LIVEUPDATE_DISCONNECTED = 0x10,
        FMOD_STUDIO_SYSTEM_CALLBACK_ALL                     = 0xFFFFFFFF;

    public static final int
        FMOD_STUDIO_EVENT_CALLBACK_CREATED                  = 0x1,
        FMOD_STUDIO_EVENT_CALLBACK_DESTROYED                = 0x2,
        FMOD_STUDIO_EVENT_CALLBACK_STARTING                 = 0x4,
        FMOD_STUDIO_EVENT_CALLBACK_STARTED                  = 0x8,
        FMOD_STUDIO_EVENT_CALLBACK_RESTARTED                = 0x10,
        FMOD_STUDIO_EVENT_CALLBACK_STOPPED                  = 0x20,
        FMOD_STUDIO_EVENT_CALLBACK_START_FAILED             = 0x40,
        FMOD_STUDIO_EVENT_CALLBACK_CREATE_PROGRAMMER_SOUND  = 0x80,
        FMOD_STUDIO_EVENT_CALLBACK_DESTROY_PROGRAMMER_SOUND = 0x100,
        FMOD_STUDIO_EVENT_CALLBACK_PLUGIN_CREATED           = 0x200,
        FMOD_STUDIO_EVENT_CALLBACK_PLUGIN_DESTROYED         = 0x400,
        FMOD_STUDIO_EVENT_CALLBACK_TIMELINE_MARKER          = 0x800,
        FMOD_STUDIO_EVENT_CALLBACK_TIMELINE_BEAT            = 0x1000,
        FMOD_STUDIO_EVENT_CALLBACK_SOUND_PLAYED             = 0x2000,
        FMOD_STUDIO_EVENT_CALLBACK_SOUND_STOPPED            = 0x4000,
        FMOD_STUDIO_EVENT_CALLBACK_REAL_TO_VIRTUAL          = 0x8000,
        FMOD_STUDIO_EVENT_CALLBACK_VIRTUAL_TO_REAL          = 0x10000,
        FMOD_STUDIO_EVENT_CALLBACK_START_EVENT_COMMAND      = 0x20000,
        FMOD_STUDIO_EVENT_CALLBACK_NESTED_TIMELINE_BEAT     = 0x40000,
        FMOD_STUDIO_EVENT_CALLBACK_ALL                      = 0xFFFFFFFF;

    public static final int
        FMOD_STUDIO_LOAD_BANK_NORMAL             = 0x0,
        FMOD_STUDIO_LOAD_BANK_NONBLOCKING        = 0x1,
        FMOD_STUDIO_LOAD_BANK_DECOMPRESS_SAMPLES = 0x2,
        FMOD_STUDIO_LOAD_BANK_UNENCRYPTED        = 0x4;

    public static final int
        FMOD_STUDIO_COMMANDCAPTURE_NORMAL             = 0x0,
        FMOD_STUDIO_COMMANDCAPTURE_FILEFLUSH          = 0x1,
        FMOD_STUDIO_COMMANDCAPTURE_SKIP_INITIAL_STATE = 0x2;

    public static final int
        FMOD_STUDIO_COMMANDREPLAY_NORMAL         = 0x0,
        FMOD_STUDIO_COMMANDREPLAY_SKIP_CLEANUP   = 0x1,
        FMOD_STUDIO_COMMANDREPLAY_FAST_FORWARD   = 0x2,
        FMOD_STUDIO_COMMANDREPLAY_SKIP_BANK_LOAD = 0x4;

    public static final int
        FMOD_STUDIO_LOADING_STATE_UNLOADING = 0,
        FMOD_STUDIO_LOADING_STATE_UNLOADED  = 1,
        FMOD_STUDIO_LOADING_STATE_LOADING   = 2,
        FMOD_STUDIO_LOADING_STATE_LOADED    = 3,
        FMOD_STUDIO_LOADING_STATE_ERROR     = 4;

    public static final int
        FMOD_STUDIO_LOAD_MEMORY       = 0,
        FMOD_STUDIO_LOAD_MEMORY_POINT = 1;

    public static final int
        FMOD_STUDIO_PARAMETER_GAME_CONTROLLED                = 0,
        FMOD_STUDIO_PARAMETER_AUTOMATIC_DISTANCE             = 1,
        FMOD_STUDIO_PARAMETER_AUTOMATIC_EVENT_CONE_ANGLE     = 2,
        FMOD_STUDIO_PARAMETER_AUTOMATIC_EVENT_ORIENTATION    = 3,
        FMOD_STUDIO_PARAMETER_AUTOMATIC_DIRECTION            = 4,
        FMOD_STUDIO_PARAMETER_AUTOMATIC_ELEVATION            = 5,
        FMOD_STUDIO_PARAMETER_AUTOMATIC_LISTENER_ORIENTATION = 6,
        FMOD_STUDIO_PARAMETER_AUTOMATIC_SPEED                = 7,
        FMOD_STUDIO_PARAMETER_AUTOMATIC_SPEED_ABSOLUTE       = 8,
        FMOD_STUDIO_PARAMETER_AUTOMATIC_DISTANCE_NORMALIZED  = 9,
        FMOD_STUDIO_PARAMETER_MAX                            = 10;

    public static final int
        FMOD_STUDIO_USER_PROPERTY_TYPE_INTEGER = 0,
        FMOD_STUDIO_USER_PROPERTY_TYPE_BOOLEAN = 1,
        FMOD_STUDIO_USER_PROPERTY_TYPE_FLOAT   = 2,
        FMOD_STUDIO_USER_PROPERTY_TYPE_STRING  = 3;

    public static final int
        FMOD_STUDIO_EVENT_PROPERTY_CHANNELPRIORITY    = 0,
        FMOD_STUDIO_EVENT_PROPERTY_SCHEDULE_DELAY     = 1,
        FMOD_STUDIO_EVENT_PROPERTY_SCHEDULE_LOOKAHEAD = 2,
        FMOD_STUDIO_EVENT_PROPERTY_MINIMUM_DISTANCE   = 3,
        FMOD_STUDIO_EVENT_PROPERTY_MAXIMUM_DISTANCE   = 4,
        FMOD_STUDIO_EVENT_PROPERTY_COOLDOWN           = 5,
        FMOD_STUDIO_EVENT_PROPERTY_MAX                = 6;

    public static final int
        FMOD_STUDIO_PLAYBACK_PLAYING    = 0,
        FMOD_STUDIO_PLAYBACK_SUSTAINING = 1,
        FMOD_STUDIO_PLAYBACK_STOPPED    = 2,
        FMOD_STUDIO_PLAYBACK_STARTING   = 3,
        FMOD_STUDIO_PLAYBACK_STOPPING   = 4;

    public static final int
        FMOD_STUDIO_STOP_ALLOWFADEOUT = 0,
        FMOD_STUDIO_STOP_IMMEDIATE    = 1;

    public static final int
        FMOD_STUDIO_INSTANCETYPE_NONE              = 0,
        FMOD_STUDIO_INSTANCETYPE_SYSTEM            = 1,
        FMOD_STUDIO_INSTANCETYPE_EVENTDESCRIPTION  = 2,
        FMOD_STUDIO_INSTANCETYPE_EVENTINSTANCE     = 3,
        FMOD_STUDIO_INSTANCETYPE_PARAMETERINSTANCE = 4,
        FMOD_STUDIO_INSTANCETYPE_BUS               = 5,
        FMOD_STUDIO_INSTANCETYPE_VCA               = 6,
        FMOD_STUDIO_INSTANCETYPE_BANK              = 7,
        FMOD_STUDIO_INSTANCETYPE_COMMANDREPLAY     = 8;

    protected FMODStudio() {
        throw new UnsupportedOperationException();
    }

    // --- [ FMOD_Studio_ParseID ] ---

    /** {@code FMOD_RESULT FMOD_Studio_ParseID(char const * idstring, FMOD_GUID * id)} */
    public static int nFMOD_Studio_ParseID(long idstring, long id) {
        long __functionAddress = Functions.ParseID;
        return callPPI(idstring, id, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_ParseID(char const * idstring, FMOD_GUID * id)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_ParseID(@NativeType("char const *") ByteBuffer idstring, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        if (CHECKS) {
            checkNT1(idstring);
        }
        return nFMOD_Studio_ParseID(memAddress(idstring), id.address());
    }

    /** {@code FMOD_RESULT FMOD_Studio_ParseID(char const * idstring, FMOD_GUID * id)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_ParseID(@NativeType("char const *") CharSequence idstring, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(idstring, true);
            long idstringEncoded = stack.getPointerAddress();
            return nFMOD_Studio_ParseID(idstringEncoded, id.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_Create ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_Create(FMOD_STUDIO_SYSTEM ** system, unsigned int headerversion)} */
    public static int nFMOD_Studio_System_Create(long system, int headerversion) {
        long __functionAddress = Functions.System_Create;
        return callPI(system, headerversion, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_Create(FMOD_STUDIO_SYSTEM ** system, unsigned int headerversion)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_Create(@NativeType("FMOD_STUDIO_SYSTEM **") PointerBuffer system, @NativeType("unsigned int") int headerversion) {
        if (CHECKS) {
            check(system, 1);
        }
        return nFMOD_Studio_System_Create(memAddress(system), headerversion);
    }

    // --- [ FMOD_Studio_System_IsValid ] ---

    /** {@code FMOD_BOOL FMOD_Studio_System_IsValid(FMOD_STUDIO_SYSTEM * system)} */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_System_IsValid(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_IsValid;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_SetAdvancedSettings ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_SetAdvancedSettings(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_ADVANCEDSETTINGS * settings)} */
    public static int nFMOD_Studio_System_SetAdvancedSettings(long system, long settings) {
        long __functionAddress = Functions.System_SetAdvancedSettings;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, settings, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_SetAdvancedSettings(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_ADVANCEDSETTINGS * settings)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetAdvancedSettings(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_ADVANCEDSETTINGS *") FMOD_STUDIO_ADVANCEDSETTINGS settings) {
        return nFMOD_Studio_System_SetAdvancedSettings(system, settings.address());
    }

    // --- [ FMOD_Studio_System_GetAdvancedSettings ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetAdvancedSettings(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_ADVANCEDSETTINGS * settings)} */
    public static int nFMOD_Studio_System_GetAdvancedSettings(long system, long settings) {
        long __functionAddress = Functions.System_GetAdvancedSettings;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, settings, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetAdvancedSettings(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_ADVANCEDSETTINGS * settings)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetAdvancedSettings(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_ADVANCEDSETTINGS *") FMOD_STUDIO_ADVANCEDSETTINGS settings) {
        return nFMOD_Studio_System_GetAdvancedSettings(system, settings.address());
    }

    // --- [ FMOD_Studio_System_Initialize ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_Initialize(FMOD_STUDIO_SYSTEM * system, int maxchannels, FMOD_STUDIO_INITFLAGS studioflags, FMOD_INITFLAGS flags, void * extradriverdata)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_Initialize(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int maxchannels, @NativeType("FMOD_STUDIO_INITFLAGS") int studioflags, @NativeType("FMOD_INITFLAGS") int flags, @NativeType("void *") long extradriverdata) {
        long __functionAddress = Functions.System_Initialize;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, maxchannels, studioflags, flags, extradriverdata, __functionAddress);
    }

    // --- [ FMOD_Studio_System_Release ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_Release(FMOD_STUDIO_SYSTEM * system)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_Release(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_Release;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_Update ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_Update(FMOD_STUDIO_SYSTEM * system)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_Update(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_Update;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_GetCoreSystem ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetCoreSystem(FMOD_STUDIO_SYSTEM * system, FMOD_SYSTEM ** coresystem)} */
    public static int nFMOD_Studio_System_GetCoreSystem(long system, long coresystem) {
        long __functionAddress = Functions.System_GetCoreSystem;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, coresystem, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetCoreSystem(FMOD_STUDIO_SYSTEM * system, FMOD_SYSTEM ** coresystem)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetCoreSystem(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_SYSTEM **") PointerBuffer coresystem) {
        if (CHECKS) {
            check(coresystem, 1);
        }
        return nFMOD_Studio_System_GetCoreSystem(system, memAddress(coresystem));
    }

    // --- [ FMOD_Studio_System_GetEvent ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetEvent(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_EVENTDESCRIPTION ** event)} */
    public static int nFMOD_Studio_System_GetEvent(long system, long pathOrID, long event) {
        long __functionAddress = Functions.System_GetEvent;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, pathOrID, event, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetEvent(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_EVENTDESCRIPTION ** event)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetEvent(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer pathOrID, @NativeType("FMOD_STUDIO_EVENTDESCRIPTION **") PointerBuffer event) {
        if (CHECKS) {
            checkNT1(pathOrID);
            check(event, 1);
        }
        return nFMOD_Studio_System_GetEvent(system, memAddress(pathOrID), memAddress(event));
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetEvent(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_EVENTDESCRIPTION ** event)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetEvent(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence pathOrID, @NativeType("FMOD_STUDIO_EVENTDESCRIPTION **") PointerBuffer event) {
        if (CHECKS) {
            check(event, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathOrID, true);
            long pathOrIDEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_GetEvent(system, pathOrIDEncoded, memAddress(event));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_GetBus ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBus(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_BUS ** bus)} */
    public static int nFMOD_Studio_System_GetBus(long system, long pathOrID, long bus) {
        long __functionAddress = Functions.System_GetBus;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, pathOrID, bus, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBus(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_BUS ** bus)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBus(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer pathOrID, @NativeType("FMOD_STUDIO_BUS **") PointerBuffer bus) {
        if (CHECKS) {
            checkNT1(pathOrID);
            check(bus, 1);
        }
        return nFMOD_Studio_System_GetBus(system, memAddress(pathOrID), memAddress(bus));
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBus(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_BUS ** bus)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBus(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence pathOrID, @NativeType("FMOD_STUDIO_BUS **") PointerBuffer bus) {
        if (CHECKS) {
            check(bus, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathOrID, true);
            long pathOrIDEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_GetBus(system, pathOrIDEncoded, memAddress(bus));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_GetVCA ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetVCA(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_VCA ** vca)} */
    public static int nFMOD_Studio_System_GetVCA(long system, long pathOrID, long vca) {
        long __functionAddress = Functions.System_GetVCA;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, pathOrID, vca, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetVCA(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_VCA ** vca)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetVCA(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer pathOrID, @NativeType("FMOD_STUDIO_VCA **") PointerBuffer vca) {
        if (CHECKS) {
            checkNT1(pathOrID);
            check(vca, 1);
        }
        return nFMOD_Studio_System_GetVCA(system, memAddress(pathOrID), memAddress(vca));
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetVCA(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_VCA ** vca)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetVCA(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence pathOrID, @NativeType("FMOD_STUDIO_VCA **") PointerBuffer vca) {
        if (CHECKS) {
            check(vca, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathOrID, true);
            long pathOrIDEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_GetVCA(system, pathOrIDEncoded, memAddress(vca));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_GetBank ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBank(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_BANK ** bank)} */
    public static int nFMOD_Studio_System_GetBank(long system, long pathOrID, long bank) {
        long __functionAddress = Functions.System_GetBank;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, pathOrID, bank, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBank(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_BANK ** bank)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBank(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer pathOrID, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            checkNT1(pathOrID);
            check(bank, 1);
        }
        return nFMOD_Studio_System_GetBank(system, memAddress(pathOrID), memAddress(bank));
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBank(FMOD_STUDIO_SYSTEM * system, char const * pathOrID, FMOD_STUDIO_BANK ** bank)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBank(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence pathOrID, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            check(bank, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathOrID, true);
            long pathOrIDEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_GetBank(system, pathOrIDEncoded, memAddress(bank));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_GetEventByID ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetEventByID(FMOD_STUDIO_SYSTEM * system, FMOD_GUID const * id, FMOD_STUDIO_EVENTDESCRIPTION ** event)} */
    public static int nFMOD_Studio_System_GetEventByID(long system, long id, long event) {
        long __functionAddress = Functions.System_GetEventByID;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, id, event, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetEventByID(FMOD_STUDIO_SYSTEM * system, FMOD_GUID const * id, FMOD_STUDIO_EVENTDESCRIPTION ** event)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetEventByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_GUID const *") FMOD_GUID id, @NativeType("FMOD_STUDIO_EVENTDESCRIPTION **") PointerBuffer event) {
        if (CHECKS) {
            check(event, 1);
        }
        return nFMOD_Studio_System_GetEventByID(system, id.address(), memAddress(event));
    }

    // --- [ FMOD_Studio_System_GetBusByID ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBusByID(FMOD_STUDIO_SYSTEM * system, FMOD_GUID const * id, FMOD_STUDIO_BUS ** bus)} */
    public static int nFMOD_Studio_System_GetBusByID(long system, long id, long bus) {
        long __functionAddress = Functions.System_GetBusByID;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, id, bus, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBusByID(FMOD_STUDIO_SYSTEM * system, FMOD_GUID const * id, FMOD_STUDIO_BUS ** bus)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBusByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_GUID const *") FMOD_GUID id, @NativeType("FMOD_STUDIO_BUS **") PointerBuffer bus) {
        if (CHECKS) {
            check(bus, 1);
        }
        return nFMOD_Studio_System_GetBusByID(system, id.address(), memAddress(bus));
    }

    // --- [ FMOD_Studio_System_GetVCAByID ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetVCAByID(FMOD_STUDIO_SYSTEM * system, FMOD_GUID const * id, FMOD_STUDIO_VCA ** vca)} */
    public static int nFMOD_Studio_System_GetVCAByID(long system, long id, long vca) {
        long __functionAddress = Functions.System_GetVCAByID;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, id, vca, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetVCAByID(FMOD_STUDIO_SYSTEM * system, FMOD_GUID const * id, FMOD_STUDIO_VCA ** vca)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetVCAByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_GUID const *") FMOD_GUID id, @NativeType("FMOD_STUDIO_VCA **") PointerBuffer vca) {
        if (CHECKS) {
            check(vca, 1);
        }
        return nFMOD_Studio_System_GetVCAByID(system, id.address(), memAddress(vca));
    }

    // --- [ FMOD_Studio_System_GetBankByID ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBankByID(FMOD_STUDIO_SYSTEM * system, FMOD_GUID const * id, FMOD_STUDIO_BANK ** bank)} */
    public static int nFMOD_Studio_System_GetBankByID(long system, long id, long bank) {
        long __functionAddress = Functions.System_GetBankByID;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, id, bank, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBankByID(FMOD_STUDIO_SYSTEM * system, FMOD_GUID const * id, FMOD_STUDIO_BANK ** bank)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBankByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_GUID const *") FMOD_GUID id, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            check(bank, 1);
        }
        return nFMOD_Studio_System_GetBankByID(system, id.address(), memAddress(bank));
    }

    // --- [ FMOD_Studio_System_GetSoundInfo ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetSoundInfo(FMOD_STUDIO_SYSTEM * system, char const * key, FMOD_STUDIO_SOUND_INFO * info)} */
    public static int nFMOD_Studio_System_GetSoundInfo(long system, long key, long info) {
        long __functionAddress = Functions.System_GetSoundInfo;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, key, info, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetSoundInfo(FMOD_STUDIO_SYSTEM * system, char const * key, FMOD_STUDIO_SOUND_INFO * info)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetSoundInfo(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer key, @NativeType("FMOD_STUDIO_SOUND_INFO *") FMOD_STUDIO_SOUND_INFO info) {
        if (CHECKS) {
            checkNT1(key);
        }
        return nFMOD_Studio_System_GetSoundInfo(system, memAddress(key), info.address());
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetSoundInfo(FMOD_STUDIO_SYSTEM * system, char const * key, FMOD_STUDIO_SOUND_INFO * info)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetSoundInfo(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence key, @NativeType("FMOD_STUDIO_SOUND_INFO *") FMOD_STUDIO_SOUND_INFO info) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(key, true);
            long keyEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_GetSoundInfo(system, keyEncoded, info.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_GetParameterDescriptionByName ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterDescriptionByName(FMOD_STUDIO_SYSTEM * system, char const * name, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    public static int nFMOD_Studio_System_GetParameterDescriptionByName(long system, long name, long parameter) {
        long __functionAddress = Functions.System_GetParameterDescriptionByName;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, name, parameter, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterDescriptionByName(FMOD_STUDIO_SYSTEM * system, char const * name, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterDescriptionByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_System_GetParameterDescriptionByName(system, memAddress(name), parameter.address());
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterDescriptionByName(FMOD_STUDIO_SYSTEM * system, char const * name, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterDescriptionByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence name, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_GetParameterDescriptionByName(system, nameEncoded, parameter.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_GetParameterDescriptionByID ] ---

    private static final FFICIF FMOD_Studio_System_GetParameterDescriptionByIDCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_pointer
    );

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterDescriptionByID(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID id, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    public static int nFMOD_Studio_System_GetParameterDescriptionByID(long system, long id, long parameter) {
        long __functionAddress = Functions.System_GetParameterDescriptionByID;
        if (CHECKS) {
            check(system);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 3);
            memPutAddress(arguments, stack.npointer(system));
            memPutAddress(arguments + POINTER_SIZE, id);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.npointer(parameter));

            nffi_call(FMOD_Studio_System_GetParameterDescriptionByIDCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterDescriptionByID(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID id, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterDescriptionByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, FMOD_STUDIO_PARAMETER_ID id, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        return nFMOD_Studio_System_GetParameterDescriptionByID(system, id.address(), parameter.address());
    }

    // --- [ FMOD_Studio_System_GetParameterLabelByName ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterLabelByName(FMOD_STUDIO_SYSTEM * system, char const * name, int labelindex, char * label, int size, int * retrieved)} */
    public static int nFMOD_Studio_System_GetParameterLabelByName(long system, long name, int labelindex, long label, int size, long retrieved) {
        long __functionAddress = Functions.System_GetParameterLabelByName;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, name, labelindex, label, size, retrieved, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterLabelByName(FMOD_STUDIO_SYSTEM * system, char const * name, int labelindex, char * label, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterLabelByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name, int labelindex, @NativeType("char *") @Nullable ByteBuffer label, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_System_GetParameterLabelByName(system, memAddress(name), labelindex, memAddressSafe(label), remainingSafe(label), memAddressSafe(retrieved));
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterLabelByName(FMOD_STUDIO_SYSTEM * system, char const * name, int labelindex, char * label, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterLabelByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence name, int labelindex, @NativeType("char *") @Nullable ByteBuffer label, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_GetParameterLabelByName(system, nameEncoded, labelindex, memAddressSafe(label), remainingSafe(label), memAddressSafe(retrieved));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_GetParameterLabelByID ] ---

    private static final FFICIF FMOD_Studio_System_GetParameterLabelByIDCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_sint32, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer
    );

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterLabelByID(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID id, int labelindex, char * label, int size, int * retrieved)} */
    public static int nFMOD_Studio_System_GetParameterLabelByID(long system, long id, int labelindex, long label, int size, long retrieved) {
        long __functionAddress = Functions.System_GetParameterLabelByID;
        if (CHECKS) {
            check(system);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 6);
            memPutAddress(arguments, stack.npointer(system));
            memPutAddress(arguments + POINTER_SIZE, id);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.nint(labelindex));
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.npointer(label));
            memPutAddress(arguments + 4 * POINTER_SIZE, stack.nint(size));
            memPutAddress(arguments + 5 * POINTER_SIZE, stack.npointer(retrieved));

            nffi_call(FMOD_Studio_System_GetParameterLabelByIDCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterLabelByID(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID id, int labelindex, char * label, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterLabelByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, FMOD_STUDIO_PARAMETER_ID id, int labelindex, @NativeType("char *") @Nullable ByteBuffer label, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_System_GetParameterLabelByID(system, id.address(), labelindex, memAddressSafe(label), remainingSafe(label), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_System_GetParameterByID ] ---

    private static final FFICIF FMOD_Studio_System_GetParameterByIDCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_pointer, ffi_type_pointer
    );

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterByID(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID id, float * value, float * finalvalue)} */
    public static int nFMOD_Studio_System_GetParameterByID(long system, long id, long value, long finalvalue) {
        long __functionAddress = Functions.System_GetParameterByID;
        if (CHECKS) {
            check(system);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 4);
            memPutAddress(arguments, stack.npointer(system));
            memPutAddress(arguments + POINTER_SIZE, id);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.npointer(value));
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.npointer(finalvalue));

            nffi_call(FMOD_Studio_System_GetParameterByIDCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterByID(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID id, float * value, float * finalvalue)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, FMOD_STUDIO_PARAMETER_ID id, @NativeType("float *") @Nullable FloatBuffer value, @NativeType("float *") @Nullable FloatBuffer finalvalue) {
        if (CHECKS) {
            checkSafe(value, 1);
            checkSafe(finalvalue, 1);
        }
        return nFMOD_Studio_System_GetParameterByID(system, id.address(), memAddressSafe(value), memAddressSafe(finalvalue));
    }

    // --- [ FMOD_Studio_System_SetParameterByID ] ---

    private static final FFICIF FMOD_Studio_System_SetParameterByIDCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_float, ffi_type_sint32
    );

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParameterByID(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID id, float value, FMOD_BOOL ignoreseekspeed)} */
    public static int nFMOD_Studio_System_SetParameterByID(long system, long id, float value, int ignoreseekspeed) {
        long __functionAddress = Functions.System_SetParameterByID;
        if (CHECKS) {
            check(system);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 4);
            memPutAddress(arguments, stack.npointer(system));
            memPutAddress(arguments + POINTER_SIZE, id);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.nfloat(value));
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.nint(ignoreseekspeed));

            nffi_call(FMOD_Studio_System_SetParameterByIDCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParameterByID(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID id, float value, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParameterByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, FMOD_STUDIO_PARAMETER_ID id, float value, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        return nFMOD_Studio_System_SetParameterByID(system, id.address(), value, ignoreseekspeed);
    }

    // --- [ FMOD_Studio_System_SetParameterByIDWithLabel ] ---

    private static final FFICIF FMOD_Studio_System_SetParameterByIDWithLabelCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_pointer, ffi_type_sint32
    );

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParameterByIDWithLabel(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID id, char const * label, FMOD_BOOL ignoreseekspeed)} */
    public static int nFMOD_Studio_System_SetParameterByIDWithLabel(long system, long id, long label, int ignoreseekspeed) {
        long __functionAddress = Functions.System_SetParameterByIDWithLabel;
        if (CHECKS) {
            check(system);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 4);
            memPutAddress(arguments, stack.npointer(system));
            memPutAddress(arguments + POINTER_SIZE, id);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.npointer(label));
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.nint(ignoreseekspeed));

            nffi_call(FMOD_Studio_System_SetParameterByIDWithLabelCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParameterByIDWithLabel(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID id, char const * label, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParameterByIDWithLabel(@NativeType("FMOD_STUDIO_SYSTEM *") long system, FMOD_STUDIO_PARAMETER_ID id, @NativeType("char const *") ByteBuffer label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(label);
        }
        return nFMOD_Studio_System_SetParameterByIDWithLabel(system, id.address(), memAddress(label), ignoreseekspeed);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParameterByIDWithLabel(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID id, char const * label, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParameterByIDWithLabel(@NativeType("FMOD_STUDIO_SYSTEM *") long system, FMOD_STUDIO_PARAMETER_ID id, @NativeType("char const *") CharSequence label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(label, true);
            long labelEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_SetParameterByIDWithLabel(system, id.address(), labelEncoded, ignoreseekspeed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_SetParametersByIDs ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParametersByIDs(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID const * ids, float * values, int count, FMOD_BOOL ignoreseekspeed)} */
    public static int nFMOD_Studio_System_SetParametersByIDs(long system, long ids, long values, int count, int ignoreseekspeed) {
        long __functionAddress = Functions.System_SetParametersByIDs;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, ids, values, count, ignoreseekspeed, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParametersByIDs(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_ID const * ids, float * values, int count, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParametersByIDs(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_PARAMETER_ID const *") FMOD_STUDIO_PARAMETER_ID ids, @NativeType("float *") FloatBuffer values, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        return nFMOD_Studio_System_SetParametersByIDs(system, ids.address(), memAddress(values), values.remaining(), ignoreseekspeed);
    }

    // --- [ FMOD_Studio_System_GetParameterByName ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterByName(FMOD_STUDIO_SYSTEM * system, char const * name, float * value, float * finalvalue)} */
    public static int nFMOD_Studio_System_GetParameterByName(long system, long name, long value, long finalvalue) {
        long __functionAddress = Functions.System_GetParameterByName;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, name, value, finalvalue, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterByName(FMOD_STUDIO_SYSTEM * system, char const * name, float * value, float * finalvalue)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name, @NativeType("float *") @Nullable FloatBuffer value, @NativeType("float *") @Nullable FloatBuffer finalvalue) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(value, 1);
            checkSafe(finalvalue, 1);
        }
        return nFMOD_Studio_System_GetParameterByName(system, memAddress(name), memAddressSafe(value), memAddressSafe(finalvalue));
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterByName(FMOD_STUDIO_SYSTEM * system, char const * name, float * value, float * finalvalue)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence name, @NativeType("float *") @Nullable FloatBuffer value, @NativeType("float *") @Nullable FloatBuffer finalvalue) {
        if (CHECKS) {
            checkSafe(value, 1);
            checkSafe(finalvalue, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_GetParameterByName(system, nameEncoded, memAddressSafe(value), memAddressSafe(finalvalue));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_SetParameterByName ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParameterByName(FMOD_STUDIO_SYSTEM * system, char const * name, float value, FMOD_BOOL ignoreseekspeed)} */
    public static int nFMOD_Studio_System_SetParameterByName(long system, long name, float value, int ignoreseekspeed) {
        long __functionAddress = Functions.System_SetParameterByName;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, name, value, ignoreseekspeed, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParameterByName(FMOD_STUDIO_SYSTEM * system, char const * name, float value, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParameterByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name, float value, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_System_SetParameterByName(system, memAddress(name), value, ignoreseekspeed);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParameterByName(FMOD_STUDIO_SYSTEM * system, char const * name, float value, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParameterByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence name, float value, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_SetParameterByName(system, nameEncoded, value, ignoreseekspeed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_SetParameterByNameWithLabel ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParameterByNameWithLabel(FMOD_STUDIO_SYSTEM * system, char const * name, char const * label, FMOD_BOOL ignoreseekspeed)} */
    public static int nFMOD_Studio_System_SetParameterByNameWithLabel(long system, long name, long label, int ignoreseekspeed) {
        long __functionAddress = Functions.System_SetParameterByNameWithLabel;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, name, label, ignoreseekspeed, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParameterByNameWithLabel(FMOD_STUDIO_SYSTEM * system, char const * name, char const * label, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParameterByNameWithLabel(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(label);
        }
        return nFMOD_Studio_System_SetParameterByNameWithLabel(system, memAddress(name), memAddress(label), ignoreseekspeed);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_SetParameterByNameWithLabel(FMOD_STUDIO_SYSTEM * system, char const * name, char const * label, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParameterByNameWithLabel(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(label, true);
            long labelEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_SetParameterByNameWithLabel(system, nameEncoded, labelEncoded, ignoreseekspeed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_LookupID ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_LookupID(FMOD_STUDIO_SYSTEM * system, char const * path, FMOD_GUID * id)} */
    public static int nFMOD_Studio_System_LookupID(long system, long path, long id) {
        long __functionAddress = Functions.System_LookupID;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, path, id, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_LookupID(FMOD_STUDIO_SYSTEM * system, char const * path, FMOD_GUID * id)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LookupID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer path, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nFMOD_Studio_System_LookupID(system, memAddress(path), id.address());
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_LookupID(FMOD_STUDIO_SYSTEM * system, char const * path, FMOD_GUID * id)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LookupID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence path, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_LookupID(system, pathEncoded, id.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_LookupPath ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_LookupPath(FMOD_STUDIO_SYSTEM * system, FMOD_GUID const * id, char * path, int size, int * retrieved)} */
    public static int nFMOD_Studio_System_LookupPath(long system, long id, long path, int size, long retrieved) {
        long __functionAddress = Functions.System_LookupPath;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, id, path, size, retrieved, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_LookupPath(FMOD_STUDIO_SYSTEM * system, FMOD_GUID const * id, char * path, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LookupPath(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_GUID const *") FMOD_GUID id, @NativeType("char *") @Nullable ByteBuffer path, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_System_LookupPath(system, id.address(), memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_System_GetNumListeners ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetNumListeners(FMOD_STUDIO_SYSTEM * system, int * numlisteners)} */
    public static int nFMOD_Studio_System_GetNumListeners(long system, long numlisteners) {
        long __functionAddress = Functions.System_GetNumListeners;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, numlisteners, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetNumListeners(FMOD_STUDIO_SYSTEM * system, int * numlisteners)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetNumListeners(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("int *") IntBuffer numlisteners) {
        if (CHECKS) {
            check(numlisteners, 1);
        }
        return nFMOD_Studio_System_GetNumListeners(system, memAddress(numlisteners));
    }

    // --- [ FMOD_Studio_System_SetNumListeners ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_SetNumListeners(FMOD_STUDIO_SYSTEM * system, int numlisteners)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetNumListeners(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int numlisteners) {
        long __functionAddress = Functions.System_SetNumListeners;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, numlisteners, __functionAddress);
    }

    // --- [ FMOD_Studio_System_GetListenerAttributes ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetListenerAttributes(FMOD_STUDIO_SYSTEM * system, int index, FMOD_3D_ATTRIBUTES * attributes, FMOD_VECTOR * attenuationposition)} */
    public static int nFMOD_Studio_System_GetListenerAttributes(long system, int index, long attributes, long attenuationposition) {
        long __functionAddress = Functions.System_GetListenerAttributes;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, index, attributes, attenuationposition, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetListenerAttributes(FMOD_STUDIO_SYSTEM * system, int index, FMOD_3D_ATTRIBUTES * attributes, FMOD_VECTOR * attenuationposition)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetListenerAttributes(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int index, @NativeType("FMOD_3D_ATTRIBUTES *") FMOD_3D_ATTRIBUTES attributes, @NativeType("FMOD_VECTOR *") @Nullable FMOD_VECTOR attenuationposition) {
        return nFMOD_Studio_System_GetListenerAttributes(system, index, attributes.address(), memAddressSafe(attenuationposition));
    }

    // --- [ FMOD_Studio_System_SetListenerAttributes ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_SetListenerAttributes(FMOD_STUDIO_SYSTEM * system, int index, FMOD_3D_ATTRIBUTES const * attributes, FMOD_VECTOR const * attenuationposition)} */
    public static int nFMOD_Studio_System_SetListenerAttributes(long system, int index, long attributes, long attenuationposition) {
        long __functionAddress = Functions.System_SetListenerAttributes;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, index, attributes, attenuationposition, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_SetListenerAttributes(FMOD_STUDIO_SYSTEM * system, int index, FMOD_3D_ATTRIBUTES const * attributes, FMOD_VECTOR const * attenuationposition)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetListenerAttributes(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int index, @NativeType("FMOD_3D_ATTRIBUTES const *") FMOD_3D_ATTRIBUTES attributes, @NativeType("FMOD_VECTOR const *") @Nullable FMOD_VECTOR attenuationposition) {
        return nFMOD_Studio_System_SetListenerAttributes(system, index, attributes.address(), memAddressSafe(attenuationposition));
    }

    // --- [ FMOD_Studio_System_GetListenerWeight ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetListenerWeight(FMOD_STUDIO_SYSTEM * system, int index, float * weight)} */
    public static int nFMOD_Studio_System_GetListenerWeight(long system, int index, long weight) {
        long __functionAddress = Functions.System_GetListenerWeight;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, index, weight, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetListenerWeight(FMOD_STUDIO_SYSTEM * system, int index, float * weight)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetListenerWeight(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int index, @NativeType("float *") FloatBuffer weight) {
        if (CHECKS) {
            check(weight, 1);
        }
        return nFMOD_Studio_System_GetListenerWeight(system, index, memAddress(weight));
    }

    // --- [ FMOD_Studio_System_SetListenerWeight ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_SetListenerWeight(FMOD_STUDIO_SYSTEM * system, int index, float weight)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetListenerWeight(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int index, float weight) {
        long __functionAddress = Functions.System_SetListenerWeight;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, index, weight, __functionAddress);
    }

    // --- [ FMOD_Studio_System_LoadBankFile ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_LoadBankFile(FMOD_STUDIO_SYSTEM * system, char const * filename, FMOD_STUDIO_LOAD_BANK_FLAGS flags, FMOD_STUDIO_BANK ** bank)} */
    public static int nFMOD_Studio_System_LoadBankFile(long system, long filename, int flags, long bank) {
        long __functionAddress = Functions.System_LoadBankFile;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, filename, flags, bank, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_LoadBankFile(FMOD_STUDIO_SYSTEM * system, char const * filename, FMOD_STUDIO_LOAD_BANK_FLAGS flags, FMOD_STUDIO_BANK ** bank)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LoadBankFile(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer filename, @NativeType("FMOD_STUDIO_LOAD_BANK_FLAGS") int flags, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            checkNT1(filename);
            check(bank, 1);
        }
        return nFMOD_Studio_System_LoadBankFile(system, memAddress(filename), flags, memAddress(bank));
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_LoadBankFile(FMOD_STUDIO_SYSTEM * system, char const * filename, FMOD_STUDIO_LOAD_BANK_FLAGS flags, FMOD_STUDIO_BANK ** bank)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LoadBankFile(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence filename, @NativeType("FMOD_STUDIO_LOAD_BANK_FLAGS") int flags, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            check(bank, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_LoadBankFile(system, filenameEncoded, flags, memAddress(bank));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_LoadBankMemory ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_LoadBankMemory(FMOD_STUDIO_SYSTEM * system, char const * buffer, int length, FMOD_STUDIO_LOAD_MEMORY_MODE mode, FMOD_STUDIO_LOAD_BANK_FLAGS flags, FMOD_STUDIO_BANK ** bank)} */
    public static int nFMOD_Studio_System_LoadBankMemory(long system, long buffer, int length, int mode, int flags, long bank) {
        long __functionAddress = Functions.System_LoadBankMemory;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, buffer, length, mode, flags, bank, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_LoadBankMemory(FMOD_STUDIO_SYSTEM * system, char const * buffer, int length, FMOD_STUDIO_LOAD_MEMORY_MODE mode, FMOD_STUDIO_LOAD_BANK_FLAGS flags, FMOD_STUDIO_BANK ** bank)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LoadBankMemory(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer buffer, @NativeType("FMOD_STUDIO_LOAD_MEMORY_MODE") int mode, @NativeType("FMOD_STUDIO_LOAD_BANK_FLAGS") int flags, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            check(bank, 1);
        }
        return nFMOD_Studio_System_LoadBankMemory(system, memAddress(buffer), buffer.remaining(), mode, flags, memAddress(bank));
    }

    // --- [ FMOD_Studio_System_LoadBankCustom ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_LoadBankCustom(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_BANK_INFO const * info, FMOD_STUDIO_LOAD_BANK_FLAGS flags, FMOD_STUDIO_BANK ** bank)} */
    public static int nFMOD_Studio_System_LoadBankCustom(long system, long info, int flags, long bank) {
        long __functionAddress = Functions.System_LoadBankCustom;
        if (CHECKS) {
            check(system);
            FMOD_STUDIO_BANK_INFO.validate(info);
        }
        return callPPPI(system, info, flags, bank, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_LoadBankCustom(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_BANK_INFO const * info, FMOD_STUDIO_LOAD_BANK_FLAGS flags, FMOD_STUDIO_BANK ** bank)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LoadBankCustom(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_BANK_INFO const *") FMOD_STUDIO_BANK_INFO info, @NativeType("FMOD_STUDIO_LOAD_BANK_FLAGS") int flags, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            check(bank, 1);
        }
        return nFMOD_Studio_System_LoadBankCustom(system, info.address(), flags, memAddress(bank));
    }

    // --- [ FMOD_Studio_System_RegisterPlugin ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_RegisterPlugin(FMOD_STUDIO_SYSTEM * system, FMOD_DSP_DESCRIPTION const * description)} */
    public static int nFMOD_Studio_System_RegisterPlugin(long system, long description) {
        long __functionAddress = Functions.System_RegisterPlugin;
        if (CHECKS) {
            check(system);
            FMOD_DSP_DESCRIPTION.validate(description);
        }
        return callPPI(system, description, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_RegisterPlugin(FMOD_STUDIO_SYSTEM * system, FMOD_DSP_DESCRIPTION const * description)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_RegisterPlugin(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_DSP_DESCRIPTION const *") FMOD_DSP_DESCRIPTION description) {
        return nFMOD_Studio_System_RegisterPlugin(system, description.address());
    }

    // --- [ FMOD_Studio_System_UnregisterPlugin ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_UnregisterPlugin(FMOD_STUDIO_SYSTEM * system, char const * name)} */
    public static int nFMOD_Studio_System_UnregisterPlugin(long system, long name) {
        long __functionAddress = Functions.System_UnregisterPlugin;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, name, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_UnregisterPlugin(FMOD_STUDIO_SYSTEM * system, char const * name)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_UnregisterPlugin(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_System_UnregisterPlugin(system, memAddress(name));
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_UnregisterPlugin(FMOD_STUDIO_SYSTEM * system, char const * name)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_UnregisterPlugin(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_UnregisterPlugin(system, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_UnloadAll ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_UnloadAll(FMOD_STUDIO_SYSTEM * system)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_UnloadAll(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_UnloadAll;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_FlushCommands ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_FlushCommands(FMOD_STUDIO_SYSTEM * system)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_FlushCommands(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_FlushCommands;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_FlushSampleLoading ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_FlushSampleLoading(FMOD_STUDIO_SYSTEM * system)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_FlushSampleLoading(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_FlushSampleLoading;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_StartCommandCapture ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_StartCommandCapture(FMOD_STUDIO_SYSTEM * system, char const * filename, FMOD_STUDIO_COMMANDCAPTURE_FLAGS flags)} */
    public static int nFMOD_Studio_System_StartCommandCapture(long system, long filename, int flags) {
        long __functionAddress = Functions.System_StartCommandCapture;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, filename, flags, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_StartCommandCapture(FMOD_STUDIO_SYSTEM * system, char const * filename, FMOD_STUDIO_COMMANDCAPTURE_FLAGS flags)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_StartCommandCapture(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer filename, @NativeType("FMOD_STUDIO_COMMANDCAPTURE_FLAGS") int flags) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nFMOD_Studio_System_StartCommandCapture(system, memAddress(filename), flags);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_StartCommandCapture(FMOD_STUDIO_SYSTEM * system, char const * filename, FMOD_STUDIO_COMMANDCAPTURE_FLAGS flags)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_StartCommandCapture(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence filename, @NativeType("FMOD_STUDIO_COMMANDCAPTURE_FLAGS") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_StartCommandCapture(system, filenameEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_StopCommandCapture ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_StopCommandCapture(FMOD_STUDIO_SYSTEM * system)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_StopCommandCapture(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_StopCommandCapture;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_LoadCommandReplay ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_LoadCommandReplay(FMOD_STUDIO_SYSTEM * system, char const * filename, FMOD_STUDIO_COMMANDREPLAY_FLAGS flags, FMOD_STUDIO_COMMANDREPLAY ** replay)} */
    public static int nFMOD_Studio_System_LoadCommandReplay(long system, long filename, int flags, long replay) {
        long __functionAddress = Functions.System_LoadCommandReplay;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, filename, flags, replay, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_LoadCommandReplay(FMOD_STUDIO_SYSTEM * system, char const * filename, FMOD_STUDIO_COMMANDREPLAY_FLAGS flags, FMOD_STUDIO_COMMANDREPLAY ** replay)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LoadCommandReplay(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer filename, @NativeType("FMOD_STUDIO_COMMANDREPLAY_FLAGS") int flags, @NativeType("FMOD_STUDIO_COMMANDREPLAY **") PointerBuffer replay) {
        if (CHECKS) {
            checkNT1(filename);
            check(replay, 1);
        }
        return nFMOD_Studio_System_LoadCommandReplay(system, memAddress(filename), flags, memAddress(replay));
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_LoadCommandReplay(FMOD_STUDIO_SYSTEM * system, char const * filename, FMOD_STUDIO_COMMANDREPLAY_FLAGS flags, FMOD_STUDIO_COMMANDREPLAY ** replay)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LoadCommandReplay(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence filename, @NativeType("FMOD_STUDIO_COMMANDREPLAY_FLAGS") int flags, @NativeType("FMOD_STUDIO_COMMANDREPLAY **") PointerBuffer replay) {
        if (CHECKS) {
            check(replay, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_System_LoadCommandReplay(system, filenameEncoded, flags, memAddress(replay));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_System_GetBankCount ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBankCount(FMOD_STUDIO_SYSTEM * system, int * count)} */
    public static int nFMOD_Studio_System_GetBankCount(long system, long count) {
        long __functionAddress = Functions.System_GetBankCount;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBankCount(FMOD_STUDIO_SYSTEM * system, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBankCount(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_System_GetBankCount(system, memAddress(count));
    }

    // --- [ FMOD_Studio_System_GetBankList ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBankList(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_BANK ** array, int capacity, int * count)} */
    public static int nFMOD_Studio_System_GetBankList(long system, long array, int capacity, long count) {
        long __functionAddress = Functions.System_GetBankList;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, array, capacity, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBankList(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_BANK ** array, int capacity, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBankList(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer array, @NativeType("int *") @Nullable IntBuffer count) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        return nFMOD_Studio_System_GetBankList(system, memAddress(array), array.remaining(), memAddressSafe(count));
    }

    // --- [ FMOD_Studio_System_GetParameterDescriptionCount ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterDescriptionCount(FMOD_STUDIO_SYSTEM * system, int * count)} */
    public static int nFMOD_Studio_System_GetParameterDescriptionCount(long system, long count) {
        long __functionAddress = Functions.System_GetParameterDescriptionCount;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterDescriptionCount(FMOD_STUDIO_SYSTEM * system, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterDescriptionCount(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_System_GetParameterDescriptionCount(system, memAddress(count));
    }

    // --- [ FMOD_Studio_System_GetParameterDescriptionList ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterDescriptionList(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_DESCRIPTION * array, int capacity, int * count)} */
    public static int nFMOD_Studio_System_GetParameterDescriptionList(long system, long array, int capacity, long count) {
        long __functionAddress = Functions.System_GetParameterDescriptionList;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, array, capacity, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetParameterDescriptionList(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_PARAMETER_DESCRIPTION * array, int capacity, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterDescriptionList(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer array, @NativeType("int *") @Nullable IntBuffer count) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        return nFMOD_Studio_System_GetParameterDescriptionList(system, array.address(), array.remaining(), memAddressSafe(count));
    }

    // --- [ FMOD_Studio_System_GetCPUUsage ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetCPUUsage(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_CPU_USAGE * usage, FMOD_CPU_USAGE * usage_core)} */
    public static int nFMOD_Studio_System_GetCPUUsage(long system, long usage, long usage_core) {
        long __functionAddress = Functions.System_GetCPUUsage;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, usage, usage_core, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetCPUUsage(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_CPU_USAGE * usage, FMOD_CPU_USAGE * usage_core)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetCPUUsage(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_CPU_USAGE *") @Nullable FMOD_STUDIO_CPU_USAGE usage, @NativeType("FMOD_CPU_USAGE *") @Nullable FMOD_CPU_USAGE usage_core) {
        return nFMOD_Studio_System_GetCPUUsage(system, memAddressSafe(usage), memAddressSafe(usage_core));
    }

    // --- [ FMOD_Studio_System_GetBufferUsage ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBufferUsage(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_BUFFER_USAGE * usage)} */
    public static int nFMOD_Studio_System_GetBufferUsage(long system, long usage) {
        long __functionAddress = Functions.System_GetBufferUsage;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, usage, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetBufferUsage(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_BUFFER_USAGE * usage)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBufferUsage(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_BUFFER_USAGE *") FMOD_STUDIO_BUFFER_USAGE usage) {
        return nFMOD_Studio_System_GetBufferUsage(system, usage.address());
    }

    // --- [ FMOD_Studio_System_ResetBufferUsage ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_ResetBufferUsage(FMOD_STUDIO_SYSTEM * system)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_ResetBufferUsage(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_ResetBufferUsage;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_SetCallback ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_SetCallback(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_SYSTEM_CALLBACK callback, FMOD_STUDIO_SYSTEM_CALLBACK_TYPE callbackmask)} */
    public static int nFMOD_Studio_System_SetCallback(long system, long callback, int callbackmask) {
        long __functionAddress = Functions.System_SetCallback;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, callback, callbackmask, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_SetCallback(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_SYSTEM_CALLBACK callback, FMOD_STUDIO_SYSTEM_CALLBACK_TYPE callbackmask)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetCallback(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_SYSTEM_CALLBACK") @Nullable FMOD_STUDIO_SYSTEM_CALLBACKI callback, @NativeType("FMOD_STUDIO_SYSTEM_CALLBACK_TYPE") int callbackmask) {
        return nFMOD_Studio_System_SetCallback(system, memAddressSafe(callback), callbackmask);
    }

    // --- [ FMOD_Studio_System_SetUserData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_SetUserData(FMOD_STUDIO_SYSTEM * system, void * userdata)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetUserData(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.System_SetUserData;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, userdata, __functionAddress);
    }

    // --- [ FMOD_Studio_System_GetUserData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetUserData(FMOD_STUDIO_SYSTEM * system, void ** userdata)} */
    public static int nFMOD_Studio_System_GetUserData(long system, long userdata) {
        long __functionAddress = Functions.System_GetUserData;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, userdata, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetUserData(FMOD_STUDIO_SYSTEM * system, void ** userdata)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetUserData(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Studio_System_GetUserData(system, memAddress(userdata));
    }

    // --- [ FMOD_Studio_System_GetMemoryUsage ] ---

    /** {@code FMOD_RESULT FMOD_Studio_System_GetMemoryUsage(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_MEMORY_USAGE * memoryusage)} */
    public static int nFMOD_Studio_System_GetMemoryUsage(long system, long memoryusage) {
        long __functionAddress = Functions.System_GetMemoryUsage;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, memoryusage, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_System_GetMemoryUsage(FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_MEMORY_USAGE * memoryusage)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetMemoryUsage(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_MEMORY_USAGE *") FMOD_STUDIO_MEMORY_USAGE memoryusage) {
        return nFMOD_Studio_System_GetMemoryUsage(system, memoryusage.address());
    }

    // --- [ FMOD_Studio_EventDescription_IsValid ] ---

    /** {@code FMOD_BOOL FMOD_Studio_EventDescription_IsValid(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription)} */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_EventDescription_IsValid(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription) {
        long __functionAddress = Functions.EventDescription_IsValid;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPI(eventdescription, __functionAddress);
    }

    // --- [ FMOD_Studio_EventDescription_GetID ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetID(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_GUID * id)} */
    public static int nFMOD_Studio_EventDescription_GetID(long eventdescription, long id) {
        long __functionAddress = Functions.EventDescription_GetID;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, id, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetID(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_GUID * id)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetID(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        return nFMOD_Studio_EventDescription_GetID(eventdescription, id.address());
    }

    // --- [ FMOD_Studio_EventDescription_GetPath ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetPath(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, char * path, int size, int * retrieved)} */
    public static int nFMOD_Studio_EventDescription_GetPath(long eventdescription, long path, int size, long retrieved) {
        long __functionAddress = Functions.EventDescription_GetPath;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, path, size, retrieved, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetPath(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, char * path, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetPath(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("char *") @Nullable ByteBuffer path, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_EventDescription_GetPath(eventdescription, memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterDescriptionCount ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterDescriptionCount(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int * count)} */
    public static int nFMOD_Studio_EventDescription_GetParameterDescriptionCount(long eventdescription, long count) {
        long __functionAddress = Functions.EventDescription_GetParameterDescriptionCount;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterDescriptionCount(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterDescriptionCount(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_EventDescription_GetParameterDescriptionCount(eventdescription, memAddress(count));
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterDescriptionByIndex ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterDescriptionByIndex(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int index, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    public static int nFMOD_Studio_EventDescription_GetParameterDescriptionByIndex(long eventdescription, int index, long parameter) {
        long __functionAddress = Functions.EventDescription_GetParameterDescriptionByIndex;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, index, parameter, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterDescriptionByIndex(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int index, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterDescriptionByIndex(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, int index, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        return nFMOD_Studio_EventDescription_GetParameterDescriptionByIndex(eventdescription, index, parameter.address());
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterDescriptionByName ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterDescriptionByName(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, char const * name, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    public static int nFMOD_Studio_EventDescription_GetParameterDescriptionByName(long eventdescription, long name, long parameter) {
        long __functionAddress = Functions.EventDescription_GetParameterDescriptionByName;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, name, parameter, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterDescriptionByName(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, char const * name, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterDescriptionByName(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("char const *") ByteBuffer name, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_EventDescription_GetParameterDescriptionByName(eventdescription, memAddress(name), parameter.address());
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterDescriptionByName(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, char const * name, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterDescriptionByName(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("char const *") CharSequence name, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_EventDescription_GetParameterDescriptionByName(eventdescription, nameEncoded, parameter.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterDescriptionByID ] ---

    private static final FFICIF FMOD_Studio_EventDescription_GetParameterDescriptionByIDCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_pointer
    );

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterDescriptionByID(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_PARAMETER_ID id, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    public static int nFMOD_Studio_EventDescription_GetParameterDescriptionByID(long eventdescription, long id, long parameter) {
        long __functionAddress = Functions.EventDescription_GetParameterDescriptionByID;
        if (CHECKS) {
            check(eventdescription);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 3);
            memPutAddress(arguments, stack.npointer(eventdescription));
            memPutAddress(arguments + POINTER_SIZE, id);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.npointer(parameter));

            nffi_call(FMOD_Studio_EventDescription_GetParameterDescriptionByIDCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterDescriptionByID(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_PARAMETER_ID id, FMOD_STUDIO_PARAMETER_DESCRIPTION * parameter)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterDescriptionByID(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, FMOD_STUDIO_PARAMETER_ID id, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        return nFMOD_Studio_EventDescription_GetParameterDescriptionByID(eventdescription, id.address(), parameter.address());
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterLabelByIndex ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterLabelByIndex(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int index, int labelindex, char * label, int size, int * retrieved)} */
    public static int nFMOD_Studio_EventDescription_GetParameterLabelByIndex(long eventdescription, int index, int labelindex, long label, int size, long retrieved) {
        long __functionAddress = Functions.EventDescription_GetParameterLabelByIndex;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, index, labelindex, label, size, retrieved, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterLabelByIndex(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int index, int labelindex, char * label, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterLabelByIndex(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, int index, int labelindex, @NativeType("char *") @Nullable ByteBuffer label, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_EventDescription_GetParameterLabelByIndex(eventdescription, index, labelindex, memAddressSafe(label), remainingSafe(label), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterLabelByName ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterLabelByName(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, char const * name, int labelindex, char * label, int size, int * retrieved)} */
    public static int nFMOD_Studio_EventDescription_GetParameterLabelByName(long eventdescription, long name, int labelindex, long label, int size, long retrieved) {
        long __functionAddress = Functions.EventDescription_GetParameterLabelByName;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPPI(eventdescription, name, labelindex, label, size, retrieved, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterLabelByName(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, char const * name, int labelindex, char * label, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterLabelByName(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("char const *") ByteBuffer name, int labelindex, @NativeType("char *") @Nullable ByteBuffer label, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_EventDescription_GetParameterLabelByName(eventdescription, memAddress(name), labelindex, memAddressSafe(label), remainingSafe(label), memAddressSafe(retrieved));
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterLabelByName(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, char const * name, int labelindex, char * label, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterLabelByName(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("char const *") CharSequence name, int labelindex, @NativeType("char *") @Nullable ByteBuffer label, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_EventDescription_GetParameterLabelByName(eventdescription, nameEncoded, labelindex, memAddressSafe(label), remainingSafe(label), memAddressSafe(retrieved));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterLabelByID ] ---

    private static final FFICIF FMOD_Studio_EventDescription_GetParameterLabelByIDCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_sint32, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer
    );

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterLabelByID(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_PARAMETER_ID id, int labelindex, char * label, int size, int * retrieved)} */
    public static int nFMOD_Studio_EventDescription_GetParameterLabelByID(long eventdescription, long id, int labelindex, long label, int size, long retrieved) {
        long __functionAddress = Functions.EventDescription_GetParameterLabelByID;
        if (CHECKS) {
            check(eventdescription);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 6);
            memPutAddress(arguments, stack.npointer(eventdescription));
            memPutAddress(arguments + POINTER_SIZE, id);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.nint(labelindex));
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.npointer(label));
            memPutAddress(arguments + 4 * POINTER_SIZE, stack.nint(size));
            memPutAddress(arguments + 5 * POINTER_SIZE, stack.npointer(retrieved));

            nffi_call(FMOD_Studio_EventDescription_GetParameterLabelByIDCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetParameterLabelByID(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_PARAMETER_ID id, int labelindex, char * label, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterLabelByID(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, FMOD_STUDIO_PARAMETER_ID id, int labelindex, @NativeType("char *") @Nullable ByteBuffer label, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_EventDescription_GetParameterLabelByID(eventdescription, id.address(), labelindex, memAddressSafe(label), remainingSafe(label), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_EventDescription_GetUserPropertyCount ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetUserPropertyCount(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int * count)} */
    public static int nFMOD_Studio_EventDescription_GetUserPropertyCount(long eventdescription, long count) {
        long __functionAddress = Functions.EventDescription_GetUserPropertyCount;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetUserPropertyCount(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetUserPropertyCount(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_EventDescription_GetUserPropertyCount(eventdescription, memAddress(count));
    }

    // --- [ FMOD_Studio_EventDescription_GetUserPropertyByIndex ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetUserPropertyByIndex(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int index, FMOD_STUDIO_USER_PROPERTY * property)} */
    public static int nFMOD_Studio_EventDescription_GetUserPropertyByIndex(long eventdescription, int index, long property) {
        long __functionAddress = Functions.EventDescription_GetUserPropertyByIndex;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, index, property, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetUserPropertyByIndex(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int index, FMOD_STUDIO_USER_PROPERTY * property)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetUserPropertyByIndex(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, int index, @NativeType("FMOD_STUDIO_USER_PROPERTY *") FMOD_STUDIO_USER_PROPERTY property) {
        return nFMOD_Studio_EventDescription_GetUserPropertyByIndex(eventdescription, index, property.address());
    }

    // --- [ FMOD_Studio_EventDescription_GetUserProperty ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetUserProperty(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, char const * name, FMOD_STUDIO_USER_PROPERTY * property)} */
    public static int nFMOD_Studio_EventDescription_GetUserProperty(long eventdescription, long name, long property) {
        long __functionAddress = Functions.EventDescription_GetUserProperty;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, name, property, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetUserProperty(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, char const * name, FMOD_STUDIO_USER_PROPERTY * property)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetUserProperty(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("char const *") ByteBuffer name, @NativeType("FMOD_STUDIO_USER_PROPERTY *") FMOD_STUDIO_USER_PROPERTY property) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_EventDescription_GetUserProperty(eventdescription, memAddress(name), property.address());
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetUserProperty(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, char const * name, FMOD_STUDIO_USER_PROPERTY * property)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetUserProperty(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("char const *") CharSequence name, @NativeType("FMOD_STUDIO_USER_PROPERTY *") FMOD_STUDIO_USER_PROPERTY property) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_EventDescription_GetUserProperty(eventdescription, nameEncoded, property.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_EventDescription_GetLength ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetLength(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int * length)} */
    public static int nFMOD_Studio_EventDescription_GetLength(long eventdescription, long length) {
        long __functionAddress = Functions.EventDescription_GetLength;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, length, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetLength(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int * length)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetLength(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("int *") IntBuffer length) {
        if (CHECKS) {
            check(length, 1);
        }
        return nFMOD_Studio_EventDescription_GetLength(eventdescription, memAddress(length));
    }

    // --- [ FMOD_Studio_EventDescription_GetMinMaxDistance ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetMinMaxDistance(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, float * min, float * max)} */
    public static int nFMOD_Studio_EventDescription_GetMinMaxDistance(long eventdescription, long min, long max) {
        long __functionAddress = Functions.EventDescription_GetMinMaxDistance;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, min, max, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetMinMaxDistance(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, float * min, float * max)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetMinMaxDistance(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("float *") @Nullable FloatBuffer min, @NativeType("float *") @Nullable FloatBuffer max) {
        if (CHECKS) {
            checkSafe(min, 1);
            checkSafe(max, 1);
        }
        return nFMOD_Studio_EventDescription_GetMinMaxDistance(eventdescription, memAddressSafe(min), memAddressSafe(max));
    }

    // --- [ FMOD_Studio_EventDescription_GetSoundSize ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetSoundSize(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, float * size)} */
    public static int nFMOD_Studio_EventDescription_GetSoundSize(long eventdescription, long size) {
        long __functionAddress = Functions.EventDescription_GetSoundSize;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, size, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetSoundSize(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, float * size)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetSoundSize(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("float *") FloatBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return nFMOD_Studio_EventDescription_GetSoundSize(eventdescription, memAddress(size));
    }

    // --- [ FMOD_Studio_EventDescription_IsSnapshot ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_IsSnapshot(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * snapshot)} */
    public static int nFMOD_Studio_EventDescription_IsSnapshot(long eventdescription, long snapshot) {
        long __functionAddress = Functions.EventDescription_IsSnapshot;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, snapshot, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_IsSnapshot(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * snapshot)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_IsSnapshot(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer snapshot) {
        if (CHECKS) {
            check(snapshot, 1);
        }
        return nFMOD_Studio_EventDescription_IsSnapshot(eventdescription, memAddress(snapshot));
    }

    // --- [ FMOD_Studio_EventDescription_IsOneshot ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_IsOneshot(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * oneshot)} */
    public static int nFMOD_Studio_EventDescription_IsOneshot(long eventdescription, long oneshot) {
        long __functionAddress = Functions.EventDescription_IsOneshot;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, oneshot, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_IsOneshot(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * oneshot)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_IsOneshot(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer oneshot) {
        if (CHECKS) {
            check(oneshot, 1);
        }
        return nFMOD_Studio_EventDescription_IsOneshot(eventdescription, memAddress(oneshot));
    }

    // --- [ FMOD_Studio_EventDescription_IsStream ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_IsStream(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * isStream)} */
    public static int nFMOD_Studio_EventDescription_IsStream(long eventdescription, long isStream) {
        long __functionAddress = Functions.EventDescription_IsStream;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, isStream, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_IsStream(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * isStream)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_IsStream(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer isStream) {
        if (CHECKS) {
            check(isStream, 1);
        }
        return nFMOD_Studio_EventDescription_IsStream(eventdescription, memAddress(isStream));
    }

    // --- [ FMOD_Studio_EventDescription_Is3D ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_Is3D(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * is3D)} */
    public static int nFMOD_Studio_EventDescription_Is3D(long eventdescription, long is3D) {
        long __functionAddress = Functions.EventDescription_Is3D;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, is3D, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_Is3D(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * is3D)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_Is3D(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer is3D) {
        if (CHECKS) {
            check(is3D, 1);
        }
        return nFMOD_Studio_EventDescription_Is3D(eventdescription, memAddress(is3D));
    }

    // --- [ FMOD_Studio_EventDescription_IsDopplerEnabled ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_IsDopplerEnabled(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * doppler)} */
    public static int nFMOD_Studio_EventDescription_IsDopplerEnabled(long eventdescription, long doppler) {
        long __functionAddress = Functions.EventDescription_IsDopplerEnabled;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, doppler, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_IsDopplerEnabled(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * doppler)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_IsDopplerEnabled(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer doppler) {
        if (CHECKS) {
            check(doppler, 1);
        }
        return nFMOD_Studio_EventDescription_IsDopplerEnabled(eventdescription, memAddress(doppler));
    }

    // --- [ FMOD_Studio_EventDescription_HasSustainPoint ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_HasSustainPoint(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * sustainPoint)} */
    public static int nFMOD_Studio_EventDescription_HasSustainPoint(long eventdescription, long sustainPoint) {
        long __functionAddress = Functions.EventDescription_HasSustainPoint;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, sustainPoint, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_HasSustainPoint(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_BOOL * sustainPoint)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_HasSustainPoint(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer sustainPoint) {
        if (CHECKS) {
            check(sustainPoint, 1);
        }
        return nFMOD_Studio_EventDescription_HasSustainPoint(eventdescription, memAddress(sustainPoint));
    }

    // --- [ FMOD_Studio_EventDescription_CreateInstance ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_CreateInstance(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_EVENTINSTANCE ** instance)} */
    public static int nFMOD_Studio_EventDescription_CreateInstance(long eventdescription, long instance) {
        long __functionAddress = Functions.EventDescription_CreateInstance;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, instance, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_CreateInstance(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_EVENTINSTANCE ** instance)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_CreateInstance(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_STUDIO_EVENTINSTANCE **") PointerBuffer instance) {
        if (CHECKS) {
            check(instance, 1);
        }
        return nFMOD_Studio_EventDescription_CreateInstance(eventdescription, memAddress(instance));
    }

    // --- [ FMOD_Studio_EventDescription_GetInstanceCount ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetInstanceCount(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int * count)} */
    public static int nFMOD_Studio_EventDescription_GetInstanceCount(long eventdescription, long count) {
        long __functionAddress = Functions.EventDescription_GetInstanceCount;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetInstanceCount(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetInstanceCount(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_EventDescription_GetInstanceCount(eventdescription, memAddress(count));
    }

    // --- [ FMOD_Studio_EventDescription_GetInstanceList ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetInstanceList(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_EVENTINSTANCE ** array, int capacity, int * count)} */
    public static int nFMOD_Studio_EventDescription_GetInstanceList(long eventdescription, long array, int capacity, long count) {
        long __functionAddress = Functions.EventDescription_GetInstanceList;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, array, capacity, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetInstanceList(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_EVENTINSTANCE ** array, int capacity, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetInstanceList(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_STUDIO_EVENTINSTANCE **") PointerBuffer array, @NativeType("int *") @Nullable IntBuffer count) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        return nFMOD_Studio_EventDescription_GetInstanceList(eventdescription, memAddress(array), array.remaining(), memAddressSafe(count));
    }

    // --- [ FMOD_Studio_EventDescription_LoadSampleData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_LoadSampleData(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_LoadSampleData(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription) {
        long __functionAddress = Functions.EventDescription_LoadSampleData;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPI(eventdescription, __functionAddress);
    }

    // --- [ FMOD_Studio_EventDescription_UnloadSampleData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_UnloadSampleData(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_UnloadSampleData(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription) {
        long __functionAddress = Functions.EventDescription_UnloadSampleData;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPI(eventdescription, __functionAddress);
    }

    // --- [ FMOD_Studio_EventDescription_GetSampleLoadingState ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetSampleLoadingState(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_LOADING_STATE * state)} */
    public static int nFMOD_Studio_EventDescription_GetSampleLoadingState(long eventdescription, long state) {
        long __functionAddress = Functions.EventDescription_GetSampleLoadingState;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, state, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetSampleLoadingState(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_LOADING_STATE * state)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetSampleLoadingState(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_STUDIO_LOADING_STATE *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nFMOD_Studio_EventDescription_GetSampleLoadingState(eventdescription, memAddress(state));
    }

    // --- [ FMOD_Studio_EventDescription_ReleaseAllInstances ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_ReleaseAllInstances(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_ReleaseAllInstances(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription) {
        long __functionAddress = Functions.EventDescription_ReleaseAllInstances;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPI(eventdescription, __functionAddress);
    }

    // --- [ FMOD_Studio_EventDescription_SetCallback ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_SetCallback(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_EVENT_CALLBACK callback, FMOD_STUDIO_EVENT_CALLBACK_TYPE callbackmask)} */
    public static int nFMOD_Studio_EventDescription_SetCallback(long eventdescription, long callback, int callbackmask) {
        long __functionAddress = Functions.EventDescription_SetCallback;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, callback, callbackmask, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_SetCallback(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, FMOD_STUDIO_EVENT_CALLBACK callback, FMOD_STUDIO_EVENT_CALLBACK_TYPE callbackmask)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_SetCallback(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_STUDIO_EVENT_CALLBACK") @Nullable FMOD_STUDIO_EVENT_CALLBACKI callback, @NativeType("FMOD_STUDIO_EVENT_CALLBACK_TYPE") int callbackmask) {
        return nFMOD_Studio_EventDescription_SetCallback(eventdescription, memAddressSafe(callback), callbackmask);
    }

    // --- [ FMOD_Studio_EventDescription_GetUserData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetUserData(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, void ** userdata)} */
    public static int nFMOD_Studio_EventDescription_GetUserData(long eventdescription, long userdata) {
        long __functionAddress = Functions.EventDescription_GetUserData;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, userdata, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_GetUserData(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, void ** userdata)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetUserData(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Studio_EventDescription_GetUserData(eventdescription, memAddress(userdata));
    }

    // --- [ FMOD_Studio_EventDescription_SetUserData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventDescription_SetUserData(FMOD_STUDIO_EVENTDESCRIPTION * eventdescription, void * userdata)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_SetUserData(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.EventDescription_SetUserData;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, userdata, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_IsValid ] ---

    /** {@code FMOD_BOOL FMOD_Studio_EventInstance_IsValid(FMOD_STUDIO_EVENTINSTANCE * eventinstance)} */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_EventInstance_IsValid(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance) {
        long __functionAddress = Functions.EventInstance_IsValid;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetDescription ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetDescription(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_EVENTDESCRIPTION ** description)} */
    public static int nFMOD_Studio_EventInstance_GetDescription(long eventinstance, long description) {
        long __functionAddress = Functions.EventInstance_GetDescription;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, description, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetDescription(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_EVENTDESCRIPTION ** description)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetDescription(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_EVENTDESCRIPTION **") PointerBuffer description) {
        if (CHECKS) {
            check(description, 1);
        }
        return nFMOD_Studio_EventInstance_GetDescription(eventinstance, memAddress(description));
    }

    // --- [ FMOD_Studio_EventInstance_GetSystem ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetSystem(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_SYSTEM ** system)} */
    public static int nFMOD_Studio_EventInstance_GetSystem(long eventinstance, long system) {
        long __functionAddress = Functions.EventInstance_GetSystem;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, system, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetSystem(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_SYSTEM ** system)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetSystem(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_SYSTEM **") PointerBuffer system) {
        if (CHECKS) {
            check(system, 1);
        }
        return nFMOD_Studio_EventInstance_GetSystem(eventinstance, memAddress(system));
    }

    // --- [ FMOD_Studio_EventInstance_GetVolume ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetVolume(FMOD_STUDIO_EVENTINSTANCE * eventinstance, float * volume, float * finalvolume)} */
    public static int nFMOD_Studio_EventInstance_GetVolume(long eventinstance, long volume, long finalvolume) {
        long __functionAddress = Functions.EventInstance_GetVolume;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, volume, finalvolume, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetVolume(FMOD_STUDIO_EVENTINSTANCE * eventinstance, float * volume, float * finalvolume)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetVolume(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("float *") @Nullable FloatBuffer volume, @NativeType("float *") @Nullable FloatBuffer finalvolume) {
        if (CHECKS) {
            checkSafe(volume, 1);
            checkSafe(finalvolume, 1);
        }
        return nFMOD_Studio_EventInstance_GetVolume(eventinstance, memAddressSafe(volume), memAddressSafe(finalvolume));
    }

    // --- [ FMOD_Studio_EventInstance_SetVolume ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetVolume(FMOD_STUDIO_EVENTINSTANCE * eventinstance, float volume)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetVolume(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, float volume) {
        long __functionAddress = Functions.EventInstance_SetVolume;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, volume, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetPitch ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetPitch(FMOD_STUDIO_EVENTINSTANCE * eventinstance, float * pitch, float * finalpitch)} */
    public static int nFMOD_Studio_EventInstance_GetPitch(long eventinstance, long pitch, long finalpitch) {
        long __functionAddress = Functions.EventInstance_GetPitch;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, pitch, finalpitch, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetPitch(FMOD_STUDIO_EVENTINSTANCE * eventinstance, float * pitch, float * finalpitch)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetPitch(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("float *") @Nullable FloatBuffer pitch, @NativeType("float *") @Nullable FloatBuffer finalpitch) {
        if (CHECKS) {
            checkSafe(pitch, 1);
            checkSafe(finalpitch, 1);
        }
        return nFMOD_Studio_EventInstance_GetPitch(eventinstance, memAddressSafe(pitch), memAddressSafe(finalpitch));
    }

    // --- [ FMOD_Studio_EventInstance_SetPitch ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetPitch(FMOD_STUDIO_EVENTINSTANCE * eventinstance, float pitch)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetPitch(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, float pitch) {
        long __functionAddress = Functions.EventInstance_SetPitch;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, pitch, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_Get3DAttributes ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_Get3DAttributes(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_3D_ATTRIBUTES * attributes)} */
    public static int nFMOD_Studio_EventInstance_Get3DAttributes(long eventinstance, long attributes) {
        long __functionAddress = Functions.EventInstance_Get3DAttributes;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, attributes, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_Get3DAttributes(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_3D_ATTRIBUTES * attributes)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_Get3DAttributes(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_3D_ATTRIBUTES *") FMOD_3D_ATTRIBUTES attributes) {
        return nFMOD_Studio_EventInstance_Get3DAttributes(eventinstance, attributes.address());
    }

    // --- [ FMOD_Studio_EventInstance_Set3DAttributes ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_Set3DAttributes(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_3D_ATTRIBUTES * attributes)} */
    public static int nFMOD_Studio_EventInstance_Set3DAttributes(long eventinstance, long attributes) {
        long __functionAddress = Functions.EventInstance_Set3DAttributes;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, attributes, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_Set3DAttributes(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_3D_ATTRIBUTES * attributes)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_Set3DAttributes(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_3D_ATTRIBUTES *") FMOD_3D_ATTRIBUTES attributes) {
        return nFMOD_Studio_EventInstance_Set3DAttributes(eventinstance, attributes.address());
    }

    // --- [ FMOD_Studio_EventInstance_GetListenerMask ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetListenerMask(FMOD_STUDIO_EVENTINSTANCE * eventinstance, unsigned int * mask)} */
    public static int nFMOD_Studio_EventInstance_GetListenerMask(long eventinstance, long mask) {
        long __functionAddress = Functions.EventInstance_GetListenerMask;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, mask, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetListenerMask(FMOD_STUDIO_EVENTINSTANCE * eventinstance, unsigned int * mask)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetListenerMask(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("unsigned int *") IntBuffer mask) {
        if (CHECKS) {
            check(mask, 1);
        }
        return nFMOD_Studio_EventInstance_GetListenerMask(eventinstance, memAddress(mask));
    }

    // --- [ FMOD_Studio_EventInstance_SetListenerMask ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetListenerMask(FMOD_STUDIO_EVENTINSTANCE * eventinstance, unsigned int mask)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetListenerMask(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("unsigned int") int mask) {
        long __functionAddress = Functions.EventInstance_SetListenerMask;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, mask, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetProperty ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetProperty(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_EVENT_PROPERTY index, float * value)} */
    public static int nFMOD_Studio_EventInstance_GetProperty(long eventinstance, int index, long value) {
        long __functionAddress = Functions.EventInstance_GetProperty;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, index, value, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetProperty(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_EVENT_PROPERTY index, float * value)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetProperty(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_EVENT_PROPERTY") int index, @NativeType("float *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nFMOD_Studio_EventInstance_GetProperty(eventinstance, index, memAddress(value));
    }

    // --- [ FMOD_Studio_EventInstance_SetProperty ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetProperty(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_EVENT_PROPERTY index, float value)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetProperty(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_EVENT_PROPERTY") int index, float value) {
        long __functionAddress = Functions.EventInstance_SetProperty;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, index, value, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetReverbLevel ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetReverbLevel(FMOD_STUDIO_EVENTINSTANCE * eventinstance, int index, float * level)} */
    public static int nFMOD_Studio_EventInstance_GetReverbLevel(long eventinstance, int index, long level) {
        long __functionAddress = Functions.EventInstance_GetReverbLevel;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, index, level, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetReverbLevel(FMOD_STUDIO_EVENTINSTANCE * eventinstance, int index, float * level)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetReverbLevel(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, int index, @NativeType("float *") FloatBuffer level) {
        if (CHECKS) {
            check(level, 1);
        }
        return nFMOD_Studio_EventInstance_GetReverbLevel(eventinstance, index, memAddress(level));
    }

    // --- [ FMOD_Studio_EventInstance_SetReverbLevel ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetReverbLevel(FMOD_STUDIO_EVENTINSTANCE * eventinstance, int index, float level)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetReverbLevel(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, int index, float level) {
        long __functionAddress = Functions.EventInstance_SetReverbLevel;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, index, level, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetPaused ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetPaused(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_BOOL * paused)} */
    public static int nFMOD_Studio_EventInstance_GetPaused(long eventinstance, long paused) {
        long __functionAddress = Functions.EventInstance_GetPaused;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, paused, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetPaused(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_BOOL * paused)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetPaused(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_BOOL *") IntBuffer paused) {
        if (CHECKS) {
            check(paused, 1);
        }
        return nFMOD_Studio_EventInstance_GetPaused(eventinstance, memAddress(paused));
    }

    // --- [ FMOD_Studio_EventInstance_SetPaused ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetPaused(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_BOOL paused)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetPaused(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_BOOL") int paused) {
        long __functionAddress = Functions.EventInstance_SetPaused;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, paused, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_Start ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_Start(FMOD_STUDIO_EVENTINSTANCE * eventinstance)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_Start(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance) {
        long __functionAddress = Functions.EventInstance_Start;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_Stop ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_Stop(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_STOP_MODE mode)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_Stop(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_STOP_MODE") int mode) {
        long __functionAddress = Functions.EventInstance_Stop;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, mode, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetTimelinePosition ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetTimelinePosition(FMOD_STUDIO_EVENTINSTANCE * eventinstance, int * position)} */
    public static int nFMOD_Studio_EventInstance_GetTimelinePosition(long eventinstance, long position) {
        long __functionAddress = Functions.EventInstance_GetTimelinePosition;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, position, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetTimelinePosition(FMOD_STUDIO_EVENTINSTANCE * eventinstance, int * position)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetTimelinePosition(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("int *") IntBuffer position) {
        if (CHECKS) {
            check(position, 1);
        }
        return nFMOD_Studio_EventInstance_GetTimelinePosition(eventinstance, memAddress(position));
    }

    // --- [ FMOD_Studio_EventInstance_SetTimelinePosition ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetTimelinePosition(FMOD_STUDIO_EVENTINSTANCE * eventinstance, int position)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetTimelinePosition(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, int position) {
        long __functionAddress = Functions.EventInstance_SetTimelinePosition;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, position, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetPlaybackState ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetPlaybackState(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_PLAYBACK_STATE * state)} */
    public static int nFMOD_Studio_EventInstance_GetPlaybackState(long eventinstance, long state) {
        long __functionAddress = Functions.EventInstance_GetPlaybackState;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, state, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetPlaybackState(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_PLAYBACK_STATE * state)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetPlaybackState(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_PLAYBACK_STATE *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nFMOD_Studio_EventInstance_GetPlaybackState(eventinstance, memAddress(state));
    }

    // --- [ FMOD_Studio_EventInstance_GetChannelGroup ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetChannelGroup(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_CHANNELGROUP ** group)} */
    public static int nFMOD_Studio_EventInstance_GetChannelGroup(long eventinstance, long group) {
        long __functionAddress = Functions.EventInstance_GetChannelGroup;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, group, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetChannelGroup(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_CHANNELGROUP ** group)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetChannelGroup(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_CHANNELGROUP **") PointerBuffer group) {
        if (CHECKS) {
            check(group, 1);
        }
        return nFMOD_Studio_EventInstance_GetChannelGroup(eventinstance, memAddress(group));
    }

    // --- [ FMOD_Studio_EventInstance_GetMinMaxDistance ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetMinMaxDistance(FMOD_STUDIO_EVENTINSTANCE * eventinstance, float * min, float * max)} */
    public static int nFMOD_Studio_EventInstance_GetMinMaxDistance(long eventinstance, long min, long max) {
        long __functionAddress = Functions.EventInstance_GetMinMaxDistance;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, min, max, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetMinMaxDistance(FMOD_STUDIO_EVENTINSTANCE * eventinstance, float * min, float * max)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetMinMaxDistance(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("float *") @Nullable FloatBuffer min, @NativeType("float *") @Nullable FloatBuffer max) {
        if (CHECKS) {
            checkSafe(min, 1);
            checkSafe(max, 1);
        }
        return nFMOD_Studio_EventInstance_GetMinMaxDistance(eventinstance, memAddressSafe(min), memAddressSafe(max));
    }

    // --- [ FMOD_Studio_EventInstance_Release ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_Release(FMOD_STUDIO_EVENTINSTANCE * eventinstance)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_Release(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance) {
        long __functionAddress = Functions.EventInstance_Release;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_IsVirtual ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_IsVirtual(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_BOOL * virtualstate)} */
    public static int nFMOD_Studio_EventInstance_IsVirtual(long eventinstance, long virtualstate) {
        long __functionAddress = Functions.EventInstance_IsVirtual;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, virtualstate, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_IsVirtual(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_BOOL * virtualstate)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_IsVirtual(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_BOOL *") IntBuffer virtualstate) {
        if (CHECKS) {
            check(virtualstate, 1);
        }
        return nFMOD_Studio_EventInstance_IsVirtual(eventinstance, memAddress(virtualstate));
    }

    // --- [ FMOD_Studio_EventInstance_GetParameterByName ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetParameterByName(FMOD_STUDIO_EVENTINSTANCE * eventinstance, char const * name, float * value, float * finalvalue)} */
    public static int nFMOD_Studio_EventInstance_GetParameterByName(long eventinstance, long name, long value, long finalvalue) {
        long __functionAddress = Functions.EventInstance_GetParameterByName;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPPI(eventinstance, name, value, finalvalue, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetParameterByName(FMOD_STUDIO_EVENTINSTANCE * eventinstance, char const * name, float * value, float * finalvalue)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetParameterByName(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("char const *") ByteBuffer name, @NativeType("float *") @Nullable FloatBuffer value, @NativeType("float *") @Nullable FloatBuffer finalvalue) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(value, 1);
            checkSafe(finalvalue, 1);
        }
        return nFMOD_Studio_EventInstance_GetParameterByName(eventinstance, memAddress(name), memAddressSafe(value), memAddressSafe(finalvalue));
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetParameterByName(FMOD_STUDIO_EVENTINSTANCE * eventinstance, char const * name, float * value, float * finalvalue)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetParameterByName(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("char const *") CharSequence name, @NativeType("float *") @Nullable FloatBuffer value, @NativeType("float *") @Nullable FloatBuffer finalvalue) {
        if (CHECKS) {
            checkSafe(value, 1);
            checkSafe(finalvalue, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_EventInstance_GetParameterByName(eventinstance, nameEncoded, memAddressSafe(value), memAddressSafe(finalvalue));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_EventInstance_SetParameterByName ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParameterByName(FMOD_STUDIO_EVENTINSTANCE * eventinstance, char const * name, float value, FMOD_BOOL ignoreseekspeed)} */
    public static int nFMOD_Studio_EventInstance_SetParameterByName(long eventinstance, long name, float value, int ignoreseekspeed) {
        long __functionAddress = Functions.EventInstance_SetParameterByName;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, name, value, ignoreseekspeed, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParameterByName(FMOD_STUDIO_EVENTINSTANCE * eventinstance, char const * name, float value, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParameterByName(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("char const *") ByteBuffer name, float value, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_EventInstance_SetParameterByName(eventinstance, memAddress(name), value, ignoreseekspeed);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParameterByName(FMOD_STUDIO_EVENTINSTANCE * eventinstance, char const * name, float value, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParameterByName(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("char const *") CharSequence name, float value, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nFMOD_Studio_EventInstance_SetParameterByName(eventinstance, nameEncoded, value, ignoreseekspeed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_EventInstance_SetParameterByNameWithLabel ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParameterByNameWithLabel(FMOD_STUDIO_EVENTINSTANCE * eventinstance, char const * name, char const * label, FMOD_BOOL ignoreseekspeed)} */
    public static int nFMOD_Studio_EventInstance_SetParameterByNameWithLabel(long eventinstance, long name, long label, int ignoreseekspeed) {
        long __functionAddress = Functions.EventInstance_SetParameterByNameWithLabel;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, name, label, ignoreseekspeed, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParameterByNameWithLabel(FMOD_STUDIO_EVENTINSTANCE * eventinstance, char const * name, char const * label, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParameterByNameWithLabel(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(label);
        }
        return nFMOD_Studio_EventInstance_SetParameterByNameWithLabel(eventinstance, memAddress(name), memAddress(label), ignoreseekspeed);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParameterByNameWithLabel(FMOD_STUDIO_EVENTINSTANCE * eventinstance, char const * name, char const * label, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParameterByNameWithLabel(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(label, true);
            long labelEncoded = stack.getPointerAddress();
            return nFMOD_Studio_EventInstance_SetParameterByNameWithLabel(eventinstance, nameEncoded, labelEncoded, ignoreseekspeed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_EventInstance_GetParameterByID ] ---

    private static final FFICIF FMOD_Studio_EventInstance_GetParameterByIDCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_pointer, ffi_type_pointer
    );

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetParameterByID(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_PARAMETER_ID id, float * value, float * finalvalue)} */
    public static int nFMOD_Studio_EventInstance_GetParameterByID(long eventinstance, long id, long value, long finalvalue) {
        long __functionAddress = Functions.EventInstance_GetParameterByID;
        if (CHECKS) {
            check(eventinstance);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 4);
            memPutAddress(arguments, stack.npointer(eventinstance));
            memPutAddress(arguments + POINTER_SIZE, id);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.npointer(value));
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.npointer(finalvalue));

            nffi_call(FMOD_Studio_EventInstance_GetParameterByIDCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetParameterByID(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_PARAMETER_ID id, float * value, float * finalvalue)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetParameterByID(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, FMOD_STUDIO_PARAMETER_ID id, @NativeType("float *") @Nullable FloatBuffer value, @NativeType("float *") @Nullable FloatBuffer finalvalue) {
        if (CHECKS) {
            checkSafe(value, 1);
            checkSafe(finalvalue, 1);
        }
        return nFMOD_Studio_EventInstance_GetParameterByID(eventinstance, id.address(), memAddressSafe(value), memAddressSafe(finalvalue));
    }

    // --- [ FMOD_Studio_EventInstance_SetParameterByID ] ---

    private static final FFICIF FMOD_Studio_EventInstance_SetParameterByIDCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_float, ffi_type_sint32
    );

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParameterByID(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_PARAMETER_ID id, float value, FMOD_BOOL ignoreseekspeed)} */
    public static int nFMOD_Studio_EventInstance_SetParameterByID(long eventinstance, long id, float value, int ignoreseekspeed) {
        long __functionAddress = Functions.EventInstance_SetParameterByID;
        if (CHECKS) {
            check(eventinstance);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 4);
            memPutAddress(arguments, stack.npointer(eventinstance));
            memPutAddress(arguments + POINTER_SIZE, id);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.nfloat(value));
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.nint(ignoreseekspeed));

            nffi_call(FMOD_Studio_EventInstance_SetParameterByIDCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParameterByID(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_PARAMETER_ID id, float value, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParameterByID(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, FMOD_STUDIO_PARAMETER_ID id, float value, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        return nFMOD_Studio_EventInstance_SetParameterByID(eventinstance, id.address(), value, ignoreseekspeed);
    }

    // --- [ FMOD_Studio_EventInstance_SetParameterByIDWithLabel ] ---

    private static final FFICIF FMOD_Studio_EventInstance_SetParameterByIDWithLabelCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_pointer, ffi_type_sint32
    );

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParameterByIDWithLabel(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_PARAMETER_ID id, char const * label, FMOD_BOOL ignoreseekspeed)} */
    public static int nFMOD_Studio_EventInstance_SetParameterByIDWithLabel(long eventinstance, long id, long label, int ignoreseekspeed) {
        long __functionAddress = Functions.EventInstance_SetParameterByIDWithLabel;
        if (CHECKS) {
            check(eventinstance);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nint(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 4);
            memPutAddress(arguments, stack.npointer(eventinstance));
            memPutAddress(arguments + POINTER_SIZE, id);
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.npointer(label));
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.nint(ignoreseekspeed));

            nffi_call(FMOD_Studio_EventInstance_SetParameterByIDWithLabelCIF.address(), __functionAddress, __result, arguments);

            return memGetInt(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParameterByIDWithLabel(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_PARAMETER_ID id, char const * label, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParameterByIDWithLabel(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, FMOD_STUDIO_PARAMETER_ID id, @NativeType("char const *") ByteBuffer label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(label);
        }
        return nFMOD_Studio_EventInstance_SetParameterByIDWithLabel(eventinstance, id.address(), memAddress(label), ignoreseekspeed);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParameterByIDWithLabel(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_PARAMETER_ID id, char const * label, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParameterByIDWithLabel(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, FMOD_STUDIO_PARAMETER_ID id, @NativeType("char const *") CharSequence label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(label, true);
            long labelEncoded = stack.getPointerAddress();
            return nFMOD_Studio_EventInstance_SetParameterByIDWithLabel(eventinstance, id.address(), labelEncoded, ignoreseekspeed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_EventInstance_SetParametersByIDs ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParametersByIDs(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_PARAMETER_ID const * ids, float * values, int count, FMOD_BOOL ignoreseekspeed)} */
    public static int nFMOD_Studio_EventInstance_SetParametersByIDs(long eventinstance, long ids, long values, int count, int ignoreseekspeed) {
        long __functionAddress = Functions.EventInstance_SetParametersByIDs;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, ids, values, count, ignoreseekspeed, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetParametersByIDs(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_PARAMETER_ID const * ids, float * values, int count, FMOD_BOOL ignoreseekspeed)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParametersByIDs(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_PARAMETER_ID const *") FMOD_STUDIO_PARAMETER_ID ids, @NativeType("float *") FloatBuffer values, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        return nFMOD_Studio_EventInstance_SetParametersByIDs(eventinstance, ids.address(), memAddress(values), values.remaining(), ignoreseekspeed);
    }

    // --- [ FMOD_Studio_EventInstance_KeyOff ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_KeyOff(FMOD_STUDIO_EVENTINSTANCE * eventinstance)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_KeyOff(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance) {
        long __functionAddress = Functions.EventInstance_KeyOff;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_SetCallback ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetCallback(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_EVENT_CALLBACK callback, FMOD_STUDIO_EVENT_CALLBACK_TYPE callbackmask)} */
    public static int nFMOD_Studio_EventInstance_SetCallback(long eventinstance, long callback, int callbackmask) {
        long __functionAddress = Functions.EventInstance_SetCallback;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, callback, callbackmask, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetCallback(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_EVENT_CALLBACK callback, FMOD_STUDIO_EVENT_CALLBACK_TYPE callbackmask)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetCallback(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_EVENT_CALLBACK") @Nullable FMOD_STUDIO_EVENT_CALLBACKI callback, @NativeType("FMOD_STUDIO_EVENT_CALLBACK_TYPE") int callbackmask) {
        return nFMOD_Studio_EventInstance_SetCallback(eventinstance, memAddressSafe(callback), callbackmask);
    }

    // --- [ FMOD_Studio_EventInstance_GetUserData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetUserData(FMOD_STUDIO_EVENTINSTANCE * eventinstance, void ** userdata)} */
    public static int nFMOD_Studio_EventInstance_GetUserData(long eventinstance, long userdata) {
        long __functionAddress = Functions.EventInstance_GetUserData;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, userdata, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetUserData(FMOD_STUDIO_EVENTINSTANCE * eventinstance, void ** userdata)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetUserData(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Studio_EventInstance_GetUserData(eventinstance, memAddress(userdata));
    }

    // --- [ FMOD_Studio_EventInstance_SetUserData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_SetUserData(FMOD_STUDIO_EVENTINSTANCE * eventinstance, void * userdata)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetUserData(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.EventInstance_SetUserData;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, userdata, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetCPUUsage ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetCPUUsage(FMOD_STUDIO_EVENTINSTANCE * eventinstance, unsigned int * exclusive, unsigned int * inclusive)} */
    public static int nFMOD_Studio_EventInstance_GetCPUUsage(long eventinstance, long exclusive, long inclusive) {
        long __functionAddress = Functions.EventInstance_GetCPUUsage;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, exclusive, inclusive, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetCPUUsage(FMOD_STUDIO_EVENTINSTANCE * eventinstance, unsigned int * exclusive, unsigned int * inclusive)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetCPUUsage(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("unsigned int *") @Nullable IntBuffer exclusive, @NativeType("unsigned int *") @Nullable IntBuffer inclusive) {
        if (CHECKS) {
            checkSafe(exclusive, 1);
            checkSafe(inclusive, 1);
        }
        return nFMOD_Studio_EventInstance_GetCPUUsage(eventinstance, memAddressSafe(exclusive), memAddressSafe(inclusive));
    }

    // --- [ FMOD_Studio_EventInstance_GetMemoryUsage ] ---

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetMemoryUsage(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_MEMORY_USAGE * memoryusage)} */
    public static int nFMOD_Studio_EventInstance_GetMemoryUsage(long eventinstance, long memoryusage) {
        long __functionAddress = Functions.EventInstance_GetMemoryUsage;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, memoryusage, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_EventInstance_GetMemoryUsage(FMOD_STUDIO_EVENTINSTANCE * eventinstance, FMOD_STUDIO_MEMORY_USAGE * memoryusage)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetMemoryUsage(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_MEMORY_USAGE *") FMOD_STUDIO_MEMORY_USAGE memoryusage) {
        return nFMOD_Studio_EventInstance_GetMemoryUsage(eventinstance, memoryusage.address());
    }

    // --- [ FMOD_Studio_Bus_IsValid ] ---

    /** {@code FMOD_BOOL FMOD_Studio_Bus_IsValid(FMOD_STUDIO_BUS * bus)} */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_Bus_IsValid(@NativeType("FMOD_STUDIO_BUS *") long bus) {
        long __functionAddress = Functions.Bus_IsValid;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_GetID ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetID(FMOD_STUDIO_BUS * bus, FMOD_GUID * id)} */
    public static int nFMOD_Studio_Bus_GetID(long bus, long id) {
        long __functionAddress = Functions.Bus_GetID;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, id, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetID(FMOD_STUDIO_BUS * bus, FMOD_GUID * id)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetID(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        return nFMOD_Studio_Bus_GetID(bus, id.address());
    }

    // --- [ FMOD_Studio_Bus_GetPath ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetPath(FMOD_STUDIO_BUS * bus, char * path, int size, int * retrieved)} */
    public static int nFMOD_Studio_Bus_GetPath(long bus, long path, int size, long retrieved) {
        long __functionAddress = Functions.Bus_GetPath;
        if (CHECKS) {
            check(bus);
        }
        return callPPPI(bus, path, size, retrieved, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetPath(FMOD_STUDIO_BUS * bus, char * path, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetPath(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("char *") @Nullable ByteBuffer path, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_Bus_GetPath(bus, memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_Bus_GetVolume ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetVolume(FMOD_STUDIO_BUS * bus, float * volume, float * finalvolume)} */
    public static int nFMOD_Studio_Bus_GetVolume(long bus, long volume, long finalvolume) {
        long __functionAddress = Functions.Bus_GetVolume;
        if (CHECKS) {
            check(bus);
        }
        return callPPPI(bus, volume, finalvolume, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetVolume(FMOD_STUDIO_BUS * bus, float * volume, float * finalvolume)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetVolume(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("float *") @Nullable FloatBuffer volume, @NativeType("float *") @Nullable FloatBuffer finalvolume) {
        if (CHECKS) {
            checkSafe(volume, 1);
            checkSafe(finalvolume, 1);
        }
        return nFMOD_Studio_Bus_GetVolume(bus, memAddressSafe(volume), memAddressSafe(finalvolume));
    }

    // --- [ FMOD_Studio_Bus_SetVolume ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_SetVolume(FMOD_STUDIO_BUS * bus, float volume)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_SetVolume(@NativeType("FMOD_STUDIO_BUS *") long bus, float volume) {
        long __functionAddress = Functions.Bus_SetVolume;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, volume, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_GetPaused ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetPaused(FMOD_STUDIO_BUS * bus, FMOD_BOOL * paused)} */
    public static int nFMOD_Studio_Bus_GetPaused(long bus, long paused) {
        long __functionAddress = Functions.Bus_GetPaused;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, paused, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetPaused(FMOD_STUDIO_BUS * bus, FMOD_BOOL * paused)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetPaused(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_BOOL *") IntBuffer paused) {
        if (CHECKS) {
            check(paused, 1);
        }
        return nFMOD_Studio_Bus_GetPaused(bus, memAddress(paused));
    }

    // --- [ FMOD_Studio_Bus_SetPaused ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_SetPaused(FMOD_STUDIO_BUS * bus, FMOD_BOOL paused)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_SetPaused(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_BOOL") int paused) {
        long __functionAddress = Functions.Bus_SetPaused;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, paused, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_GetMute ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetMute(FMOD_STUDIO_BUS * bus, FMOD_BOOL * mute)} */
    public static int nFMOD_Studio_Bus_GetMute(long bus, long mute) {
        long __functionAddress = Functions.Bus_GetMute;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, mute, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetMute(FMOD_STUDIO_BUS * bus, FMOD_BOOL * mute)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetMute(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_BOOL *") IntBuffer mute) {
        if (CHECKS) {
            check(mute, 1);
        }
        return nFMOD_Studio_Bus_GetMute(bus, memAddress(mute));
    }

    // --- [ FMOD_Studio_Bus_SetMute ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_SetMute(FMOD_STUDIO_BUS * bus, FMOD_BOOL mute)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_SetMute(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_BOOL") int mute) {
        long __functionAddress = Functions.Bus_SetMute;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, mute, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_StopAllEvents ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_StopAllEvents(FMOD_STUDIO_BUS * bus, FMOD_STUDIO_STOP_MODE mode)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_StopAllEvents(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_STUDIO_STOP_MODE") int mode) {
        long __functionAddress = Functions.Bus_StopAllEvents;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, mode, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_GetPortIndex ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetPortIndex(FMOD_STUDIO_BUS * bus, FMOD_PORT_INDEX * index)} */
    public static int nFMOD_Studio_Bus_GetPortIndex(long bus, long index) {
        long __functionAddress = Functions.Bus_GetPortIndex;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, index, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetPortIndex(FMOD_STUDIO_BUS * bus, FMOD_PORT_INDEX * index)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetPortIndex(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_PORT_INDEX *") LongBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        return nFMOD_Studio_Bus_GetPortIndex(bus, memAddress(index));
    }

    // --- [ FMOD_Studio_Bus_SetPortIndex ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_SetPortIndex(FMOD_STUDIO_BUS * bus, FMOD_PORT_INDEX index)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_SetPortIndex(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_PORT_INDEX") long index) {
        long __functionAddress = Functions.Bus_SetPortIndex;
        if (CHECKS) {
            check(bus);
        }
        return callPJI(bus, index, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_LockChannelGroup ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_LockChannelGroup(FMOD_STUDIO_BUS * bus)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_LockChannelGroup(@NativeType("FMOD_STUDIO_BUS *") long bus) {
        long __functionAddress = Functions.Bus_LockChannelGroup;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_UnlockChannelGroup ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_UnlockChannelGroup(FMOD_STUDIO_BUS * bus)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_UnlockChannelGroup(@NativeType("FMOD_STUDIO_BUS *") long bus) {
        long __functionAddress = Functions.Bus_UnlockChannelGroup;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_GetChannelGroup ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetChannelGroup(FMOD_STUDIO_BUS * bus, FMOD_CHANNELGROUP ** group)} */
    public static int nFMOD_Studio_Bus_GetChannelGroup(long bus, long group) {
        long __functionAddress = Functions.Bus_GetChannelGroup;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, group, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetChannelGroup(FMOD_STUDIO_BUS * bus, FMOD_CHANNELGROUP ** group)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetChannelGroup(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_CHANNELGROUP **") PointerBuffer group) {
        if (CHECKS) {
            check(group, 1);
        }
        return nFMOD_Studio_Bus_GetChannelGroup(bus, memAddress(group));
    }

    // --- [ FMOD_Studio_Bus_GetCPUUsage ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetCPUUsage(FMOD_STUDIO_BUS * bus, unsigned int * exclusive, unsigned int * inclusive)} */
    public static int nFMOD_Studio_Bus_GetCPUUsage(long bus, long exclusive, long inclusive) {
        long __functionAddress = Functions.Bus_GetCPUUsage;
        if (CHECKS) {
            check(bus);
        }
        return callPPPI(bus, exclusive, inclusive, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetCPUUsage(FMOD_STUDIO_BUS * bus, unsigned int * exclusive, unsigned int * inclusive)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetCPUUsage(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("unsigned int *") @Nullable IntBuffer exclusive, @NativeType("unsigned int *") @Nullable IntBuffer inclusive) {
        if (CHECKS) {
            checkSafe(exclusive, 1);
            checkSafe(inclusive, 1);
        }
        return nFMOD_Studio_Bus_GetCPUUsage(bus, memAddressSafe(exclusive), memAddressSafe(inclusive));
    }

    // --- [ FMOD_Studio_Bus_GetMemoryUsage ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetMemoryUsage(FMOD_STUDIO_BUS * bus, FMOD_STUDIO_MEMORY_USAGE * memoryusage)} */
    public static int nFMOD_Studio_Bus_GetMemoryUsage(long bus, long memoryusage) {
        long __functionAddress = Functions.Bus_GetMemoryUsage;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, memoryusage, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bus_GetMemoryUsage(FMOD_STUDIO_BUS * bus, FMOD_STUDIO_MEMORY_USAGE * memoryusage)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetMemoryUsage(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_STUDIO_MEMORY_USAGE *") FMOD_STUDIO_MEMORY_USAGE memoryusage) {
        return nFMOD_Studio_Bus_GetMemoryUsage(bus, memoryusage.address());
    }

    // --- [ FMOD_Studio_VCA_IsValid ] ---

    /** {@code FMOD_BOOL FMOD_Studio_VCA_IsValid(FMOD_STUDIO_VCA * vca)} */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_VCA_IsValid(@NativeType("FMOD_STUDIO_VCA *") long vca) {
        long __functionAddress = Functions.VCA_IsValid;
        if (CHECKS) {
            check(vca);
        }
        return callPI(vca, __functionAddress);
    }

    // --- [ FMOD_Studio_VCA_GetID ] ---

    /** {@code FMOD_RESULT FMOD_Studio_VCA_GetID(FMOD_STUDIO_VCA * vca, FMOD_GUID * id)} */
    public static int nFMOD_Studio_VCA_GetID(long vca, long id) {
        long __functionAddress = Functions.VCA_GetID;
        if (CHECKS) {
            check(vca);
        }
        return callPPI(vca, id, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_VCA_GetID(FMOD_STUDIO_VCA * vca, FMOD_GUID * id)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_VCA_GetID(@NativeType("FMOD_STUDIO_VCA *") long vca, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        return nFMOD_Studio_VCA_GetID(vca, id.address());
    }

    // --- [ FMOD_Studio_VCA_GetPath ] ---

    /** {@code FMOD_RESULT FMOD_Studio_VCA_GetPath(FMOD_STUDIO_VCA * vca, char * path, int size, int * retrieved)} */
    public static int nFMOD_Studio_VCA_GetPath(long vca, long path, int size, long retrieved) {
        long __functionAddress = Functions.VCA_GetPath;
        if (CHECKS) {
            check(vca);
        }
        return callPPPI(vca, path, size, retrieved, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_VCA_GetPath(FMOD_STUDIO_VCA * vca, char * path, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_VCA_GetPath(@NativeType("FMOD_STUDIO_VCA *") long vca, @NativeType("char *") @Nullable ByteBuffer path, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_VCA_GetPath(vca, memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_VCA_GetVolume ] ---

    /** {@code FMOD_RESULT FMOD_Studio_VCA_GetVolume(FMOD_STUDIO_VCA * vca, float * volume, float * finalvolume)} */
    public static int nFMOD_Studio_VCA_GetVolume(long vca, long volume, long finalvolume) {
        long __functionAddress = Functions.VCA_GetVolume;
        if (CHECKS) {
            check(vca);
        }
        return callPPPI(vca, volume, finalvolume, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_VCA_GetVolume(FMOD_STUDIO_VCA * vca, float * volume, float * finalvolume)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_VCA_GetVolume(@NativeType("FMOD_STUDIO_VCA *") long vca, @NativeType("float *") @Nullable FloatBuffer volume, @NativeType("float *") @Nullable FloatBuffer finalvolume) {
        if (CHECKS) {
            checkSafe(volume, 1);
            checkSafe(finalvolume, 1);
        }
        return nFMOD_Studio_VCA_GetVolume(vca, memAddressSafe(volume), memAddressSafe(finalvolume));
    }

    // --- [ FMOD_Studio_VCA_SetVolume ] ---

    /** {@code FMOD_RESULT FMOD_Studio_VCA_SetVolume(FMOD_STUDIO_VCA * vca, float volume)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_VCA_SetVolume(@NativeType("FMOD_STUDIO_VCA *") long vca, float volume) {
        long __functionAddress = Functions.VCA_SetVolume;
        if (CHECKS) {
            check(vca);
        }
        return callPI(vca, volume, __functionAddress);
    }

    // --- [ FMOD_Studio_Bank_IsValid ] ---

    /** {@code FMOD_BOOL FMOD_Studio_Bank_IsValid(FMOD_STUDIO_BANK * bank)} */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_Bank_IsValid(@NativeType("FMOD_STUDIO_BANK *") long bank) {
        long __functionAddress = Functions.Bank_IsValid;
        if (CHECKS) {
            check(bank);
        }
        return callPI(bank, __functionAddress);
    }

    // --- [ FMOD_Studio_Bank_GetID ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetID(FMOD_STUDIO_BANK * bank, FMOD_GUID * id)} */
    public static int nFMOD_Studio_Bank_GetID(long bank, long id) {
        long __functionAddress = Functions.Bank_GetID;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, id, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetID(FMOD_STUDIO_BANK * bank, FMOD_GUID * id)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetID(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        return nFMOD_Studio_Bank_GetID(bank, id.address());
    }

    // --- [ FMOD_Studio_Bank_GetPath ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetPath(FMOD_STUDIO_BANK * bank, char * path, int size, int * retrieved)} */
    public static int nFMOD_Studio_Bank_GetPath(long bank, long path, int size, long retrieved) {
        long __functionAddress = Functions.Bank_GetPath;
        if (CHECKS) {
            check(bank);
        }
        return callPPPI(bank, path, size, retrieved, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetPath(FMOD_STUDIO_BANK * bank, char * path, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetPath(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("char *") @Nullable ByteBuffer path, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_Bank_GetPath(bank, memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_Bank_Unload ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_Unload(FMOD_STUDIO_BANK * bank)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_Unload(@NativeType("FMOD_STUDIO_BANK *") long bank) {
        long __functionAddress = Functions.Bank_Unload;
        if (CHECKS) {
            check(bank);
        }
        return callPI(bank, __functionAddress);
    }

    // --- [ FMOD_Studio_Bank_LoadSampleData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_LoadSampleData(FMOD_STUDIO_BANK * bank)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_LoadSampleData(@NativeType("FMOD_STUDIO_BANK *") long bank) {
        long __functionAddress = Functions.Bank_LoadSampleData;
        if (CHECKS) {
            check(bank);
        }
        return callPI(bank, __functionAddress);
    }

    // --- [ FMOD_Studio_Bank_UnloadSampleData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_UnloadSampleData(FMOD_STUDIO_BANK * bank)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_UnloadSampleData(@NativeType("FMOD_STUDIO_BANK *") long bank) {
        long __functionAddress = Functions.Bank_UnloadSampleData;
        if (CHECKS) {
            check(bank);
        }
        return callPI(bank, __functionAddress);
    }

    // --- [ FMOD_Studio_Bank_GetLoadingState ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetLoadingState(FMOD_STUDIO_BANK * bank, FMOD_STUDIO_LOADING_STATE * state)} */
    public static int nFMOD_Studio_Bank_GetLoadingState(long bank, long state) {
        long __functionAddress = Functions.Bank_GetLoadingState;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, state, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetLoadingState(FMOD_STUDIO_BANK * bank, FMOD_STUDIO_LOADING_STATE * state)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetLoadingState(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_STUDIO_LOADING_STATE *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nFMOD_Studio_Bank_GetLoadingState(bank, memAddress(state));
    }

    // --- [ FMOD_Studio_Bank_GetSampleLoadingState ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetSampleLoadingState(FMOD_STUDIO_BANK * bank, FMOD_STUDIO_LOADING_STATE * state)} */
    public static int nFMOD_Studio_Bank_GetSampleLoadingState(long bank, long state) {
        long __functionAddress = Functions.Bank_GetSampleLoadingState;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, state, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetSampleLoadingState(FMOD_STUDIO_BANK * bank, FMOD_STUDIO_LOADING_STATE * state)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetSampleLoadingState(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_STUDIO_LOADING_STATE *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nFMOD_Studio_Bank_GetSampleLoadingState(bank, memAddress(state));
    }

    // --- [ FMOD_Studio_Bank_GetStringCount ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetStringCount(FMOD_STUDIO_BANK * bank, int * count)} */
    public static int nFMOD_Studio_Bank_GetStringCount(long bank, long count) {
        long __functionAddress = Functions.Bank_GetStringCount;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetStringCount(FMOD_STUDIO_BANK * bank, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetStringCount(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_Bank_GetStringCount(bank, memAddress(count));
    }

    // --- [ FMOD_Studio_Bank_GetStringInfo ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetStringInfo(FMOD_STUDIO_BANK * bank, int index, FMOD_GUID * id, char * path, int size, int * retrieved)} */
    public static int nFMOD_Studio_Bank_GetStringInfo(long bank, int index, long id, long path, int size, long retrieved) {
        long __functionAddress = Functions.Bank_GetStringInfo;
        if (CHECKS) {
            check(bank);
        }
        return callPPPPI(bank, index, id, path, size, retrieved, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetStringInfo(FMOD_STUDIO_BANK * bank, int index, FMOD_GUID * id, char * path, int size, int * retrieved)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetStringInfo(@NativeType("FMOD_STUDIO_BANK *") long bank, int index, @NativeType("FMOD_GUID *") @Nullable FMOD_GUID id, @NativeType("char *") @Nullable ByteBuffer path, @NativeType("int *") @Nullable IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_Bank_GetStringInfo(bank, index, memAddressSafe(id), memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_Bank_GetEventCount ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetEventCount(FMOD_STUDIO_BANK * bank, int * count)} */
    public static int nFMOD_Studio_Bank_GetEventCount(long bank, long count) {
        long __functionAddress = Functions.Bank_GetEventCount;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetEventCount(FMOD_STUDIO_BANK * bank, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetEventCount(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_Bank_GetEventCount(bank, memAddress(count));
    }

    // --- [ FMOD_Studio_Bank_GetEventList ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetEventList(FMOD_STUDIO_BANK * bank, FMOD_STUDIO_EVENTDESCRIPTION ** array, int capacity, int * count)} */
    public static int nFMOD_Studio_Bank_GetEventList(long bank, long array, int capacity, long count) {
        long __functionAddress = Functions.Bank_GetEventList;
        if (CHECKS) {
            check(bank);
        }
        return callPPPI(bank, array, capacity, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetEventList(FMOD_STUDIO_BANK * bank, FMOD_STUDIO_EVENTDESCRIPTION ** array, int capacity, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetEventList(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_STUDIO_EVENTDESCRIPTION **") PointerBuffer array, @NativeType("int *") @Nullable IntBuffer count) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        return nFMOD_Studio_Bank_GetEventList(bank, memAddress(array), array.remaining(), memAddressSafe(count));
    }

    // --- [ FMOD_Studio_Bank_GetBusCount ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetBusCount(FMOD_STUDIO_BANK * bank, int * count)} */
    public static int nFMOD_Studio_Bank_GetBusCount(long bank, long count) {
        long __functionAddress = Functions.Bank_GetBusCount;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetBusCount(FMOD_STUDIO_BANK * bank, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetBusCount(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_Bank_GetBusCount(bank, memAddress(count));
    }

    // --- [ FMOD_Studio_Bank_GetBusList ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetBusList(FMOD_STUDIO_BANK * bank, FMOD_STUDIO_BUS ** array, int capacity, int * count)} */
    public static int nFMOD_Studio_Bank_GetBusList(long bank, long array, int capacity, long count) {
        long __functionAddress = Functions.Bank_GetBusList;
        if (CHECKS) {
            check(bank);
        }
        return callPPPI(bank, array, capacity, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetBusList(FMOD_STUDIO_BANK * bank, FMOD_STUDIO_BUS ** array, int capacity, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetBusList(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_STUDIO_BUS **") PointerBuffer array, @NativeType("int *") @Nullable IntBuffer count) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        return nFMOD_Studio_Bank_GetBusList(bank, memAddress(array), array.remaining(), memAddressSafe(count));
    }

    // --- [ FMOD_Studio_Bank_GetVCACount ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetVCACount(FMOD_STUDIO_BANK * bank, int * count)} */
    public static int nFMOD_Studio_Bank_GetVCACount(long bank, long count) {
        long __functionAddress = Functions.Bank_GetVCACount;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetVCACount(FMOD_STUDIO_BANK * bank, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetVCACount(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_Bank_GetVCACount(bank, memAddress(count));
    }

    // --- [ FMOD_Studio_Bank_GetVCAList ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetVCAList(FMOD_STUDIO_BANK * bank, FMOD_STUDIO_VCA ** array, int capacity, int * count)} */
    public static int nFMOD_Studio_Bank_GetVCAList(long bank, long array, int capacity, long count) {
        long __functionAddress = Functions.Bank_GetVCAList;
        if (CHECKS) {
            check(bank);
        }
        return callPPPI(bank, array, capacity, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetVCAList(FMOD_STUDIO_BANK * bank, FMOD_STUDIO_VCA ** array, int capacity, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetVCAList(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_STUDIO_VCA **") PointerBuffer array, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_Bank_GetVCAList(bank, memAddress(array), array.remaining(), memAddress(count));
    }

    // --- [ FMOD_Studio_Bank_GetUserData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetUserData(FMOD_STUDIO_BANK * bank, void ** userdata)} */
    public static int nFMOD_Studio_Bank_GetUserData(long bank, long userdata) {
        long __functionAddress = Functions.Bank_GetUserData;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, userdata, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_Bank_GetUserData(FMOD_STUDIO_BANK * bank, void ** userdata)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetUserData(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Studio_Bank_GetUserData(bank, memAddress(userdata));
    }

    // --- [ FMOD_Studio_Bank_SetUserData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_Bank_SetUserData(FMOD_STUDIO_BANK * bank, void * userdata)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_SetUserData(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.Bank_SetUserData;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, userdata, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_IsValid ] ---

    /** {@code FMOD_BOOL FMOD_Studio_CommandReplay_IsValid(FMOD_STUDIO_COMMANDREPLAY * replay)} */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_CommandReplay_IsValid(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay) {
        long __functionAddress = Functions.CommandReplay_IsValid;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_GetSystem ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetSystem(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_STUDIO_SYSTEM ** system)} */
    public static int nFMOD_Studio_CommandReplay_GetSystem(long replay, long system) {
        long __functionAddress = Functions.CommandReplay_GetSystem;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, system, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetSystem(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_STUDIO_SYSTEM ** system)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetSystem(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("FMOD_STUDIO_SYSTEM **") PointerBuffer system) {
        if (CHECKS) {
            check(system, 1);
        }
        return nFMOD_Studio_CommandReplay_GetSystem(replay, memAddress(system));
    }

    // --- [ FMOD_Studio_CommandReplay_GetLength ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetLength(FMOD_STUDIO_COMMANDREPLAY * replay, float * length)} */
    public static int nFMOD_Studio_CommandReplay_GetLength(long replay, long length) {
        long __functionAddress = Functions.CommandReplay_GetLength;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, length, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetLength(FMOD_STUDIO_COMMANDREPLAY * replay, float * length)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetLength(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("float *") FloatBuffer length) {
        if (CHECKS) {
            check(length, 1);
        }
        return nFMOD_Studio_CommandReplay_GetLength(replay, memAddress(length));
    }

    // --- [ FMOD_Studio_CommandReplay_GetCommandCount ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetCommandCount(FMOD_STUDIO_COMMANDREPLAY * replay, int * count)} */
    public static int nFMOD_Studio_CommandReplay_GetCommandCount(long replay, long count) {
        long __functionAddress = Functions.CommandReplay_GetCommandCount;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, count, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetCommandCount(FMOD_STUDIO_COMMANDREPLAY * replay, int * count)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetCommandCount(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_CommandReplay_GetCommandCount(replay, memAddress(count));
    }

    // --- [ FMOD_Studio_CommandReplay_GetCommandInfo ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetCommandInfo(FMOD_STUDIO_COMMANDREPLAY * replay, int commandindex, FMOD_STUDIO_COMMAND_INFO * info)} */
    public static int nFMOD_Studio_CommandReplay_GetCommandInfo(long replay, int commandindex, long info) {
        long __functionAddress = Functions.CommandReplay_GetCommandInfo;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, commandindex, info, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetCommandInfo(FMOD_STUDIO_COMMANDREPLAY * replay, int commandindex, FMOD_STUDIO_COMMAND_INFO * info)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetCommandInfo(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, int commandindex, @NativeType("FMOD_STUDIO_COMMAND_INFO *") FMOD_STUDIO_COMMAND_INFO info) {
        return nFMOD_Studio_CommandReplay_GetCommandInfo(replay, commandindex, info.address());
    }

    // --- [ FMOD_Studio_CommandReplay_GetCommandString ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetCommandString(FMOD_STUDIO_COMMANDREPLAY * replay, int commandindex, char * buffer, int length)} */
    public static int nFMOD_Studio_CommandReplay_GetCommandString(long replay, int commandindex, long buffer, int length) {
        long __functionAddress = Functions.CommandReplay_GetCommandString;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, commandindex, buffer, length, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetCommandString(FMOD_STUDIO_COMMANDREPLAY * replay, int commandindex, char * buffer, int length)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetCommandString(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, int commandindex, @NativeType("char *") ByteBuffer buffer) {
        return nFMOD_Studio_CommandReplay_GetCommandString(replay, commandindex, memAddress(buffer), buffer.remaining());
    }

    // --- [ FMOD_Studio_CommandReplay_GetCommandAtTime ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetCommandAtTime(FMOD_STUDIO_COMMANDREPLAY * replay, float time, int * commandindex)} */
    public static int nFMOD_Studio_CommandReplay_GetCommandAtTime(long replay, float time, long commandindex) {
        long __functionAddress = Functions.CommandReplay_GetCommandAtTime;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, time, commandindex, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetCommandAtTime(FMOD_STUDIO_COMMANDREPLAY * replay, float time, int * commandindex)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetCommandAtTime(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, float time, @NativeType("int *") IntBuffer commandindex) {
        if (CHECKS) {
            check(commandindex, 1);
        }
        return nFMOD_Studio_CommandReplay_GetCommandAtTime(replay, time, memAddress(commandindex));
    }

    // --- [ FMOD_Studio_CommandReplay_SetBankPath ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SetBankPath(FMOD_STUDIO_COMMANDREPLAY * replay, char const * bankPath)} */
    public static int nFMOD_Studio_CommandReplay_SetBankPath(long replay, long bankPath) {
        long __functionAddress = Functions.CommandReplay_SetBankPath;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, bankPath, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SetBankPath(FMOD_STUDIO_COMMANDREPLAY * replay, char const * bankPath)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetBankPath(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("char const *") ByteBuffer bankPath) {
        if (CHECKS) {
            checkNT1(bankPath);
        }
        return nFMOD_Studio_CommandReplay_SetBankPath(replay, memAddress(bankPath));
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SetBankPath(FMOD_STUDIO_COMMANDREPLAY * replay, char const * bankPath)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetBankPath(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("char const *") CharSequence bankPath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(bankPath, true);
            long bankPathEncoded = stack.getPointerAddress();
            return nFMOD_Studio_CommandReplay_SetBankPath(replay, bankPathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FMOD_Studio_CommandReplay_Start ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_Start(FMOD_STUDIO_COMMANDREPLAY * replay)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_Start(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay) {
        long __functionAddress = Functions.CommandReplay_Start;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_Stop ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_Stop(FMOD_STUDIO_COMMANDREPLAY * replay)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_Stop(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay) {
        long __functionAddress = Functions.CommandReplay_Stop;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_SeekToTime ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SeekToTime(FMOD_STUDIO_COMMANDREPLAY * replay, float time)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SeekToTime(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, float time) {
        long __functionAddress = Functions.CommandReplay_SeekToTime;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, time, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_SeekToCommand ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SeekToCommand(FMOD_STUDIO_COMMANDREPLAY * replay, int commandindex)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SeekToCommand(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, int commandindex) {
        long __functionAddress = Functions.CommandReplay_SeekToCommand;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, commandindex, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_GetPaused ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetPaused(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_BOOL * paused)} */
    public static int nFMOD_Studio_CommandReplay_GetPaused(long replay, long paused) {
        long __functionAddress = Functions.CommandReplay_GetPaused;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, paused, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetPaused(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_BOOL * paused)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetPaused(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("FMOD_BOOL *") IntBuffer paused) {
        if (CHECKS) {
            check(paused, 1);
        }
        return nFMOD_Studio_CommandReplay_GetPaused(replay, memAddress(paused));
    }

    // --- [ FMOD_Studio_CommandReplay_SetPaused ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SetPaused(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_BOOL paused)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetPaused(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("FMOD_BOOL") int paused) {
        long __functionAddress = Functions.CommandReplay_SetPaused;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, paused, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_GetPlaybackState ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetPlaybackState(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_STUDIO_PLAYBACK_STATE * state)} */
    public static int nFMOD_Studio_CommandReplay_GetPlaybackState(long replay, long state) {
        long __functionAddress = Functions.CommandReplay_GetPlaybackState;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, state, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetPlaybackState(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_STUDIO_PLAYBACK_STATE * state)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetPlaybackState(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("FMOD_STUDIO_PLAYBACK_STATE *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nFMOD_Studio_CommandReplay_GetPlaybackState(replay, memAddress(state));
    }

    // --- [ FMOD_Studio_CommandReplay_GetCurrentCommand ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetCurrentCommand(FMOD_STUDIO_COMMANDREPLAY * replay, int * commandindex, float * currenttime)} */
    public static int nFMOD_Studio_CommandReplay_GetCurrentCommand(long replay, long commandindex, long currenttime) {
        long __functionAddress = Functions.CommandReplay_GetCurrentCommand;
        if (CHECKS) {
            check(replay);
        }
        return callPPPI(replay, commandindex, currenttime, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetCurrentCommand(FMOD_STUDIO_COMMANDREPLAY * replay, int * commandindex, float * currenttime)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetCurrentCommand(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("int *") @Nullable IntBuffer commandindex, @NativeType("float *") @Nullable FloatBuffer currenttime) {
        if (CHECKS) {
            checkSafe(commandindex, 1);
            checkSafe(currenttime, 1);
        }
        return nFMOD_Studio_CommandReplay_GetCurrentCommand(replay, memAddressSafe(commandindex), memAddressSafe(currenttime));
    }

    // --- [ FMOD_Studio_CommandReplay_Release ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_Release(FMOD_STUDIO_COMMANDREPLAY * replay)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_Release(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay) {
        long __functionAddress = Functions.CommandReplay_Release;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_SetFrameCallback ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SetFrameCallback(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_STUDIO_COMMANDREPLAY_FRAME_CALLBACK callback)} */
    public static int nFMOD_Studio_CommandReplay_SetFrameCallback(long replay, long callback) {
        long __functionAddress = Functions.CommandReplay_SetFrameCallback;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, callback, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SetFrameCallback(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_STUDIO_COMMANDREPLAY_FRAME_CALLBACK callback)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetFrameCallback(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("FMOD_STUDIO_COMMANDREPLAY_FRAME_CALLBACK") @Nullable FMOD_STUDIO_COMMANDREPLAY_FRAME_CALLBACKI callback) {
        return nFMOD_Studio_CommandReplay_SetFrameCallback(replay, memAddressSafe(callback));
    }

    // --- [ FMOD_Studio_CommandReplay_SetLoadBankCallback ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SetLoadBankCallback(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_STUDIO_COMMANDREPLAY_LOAD_BANK_CALLBACK callback)} */
    public static int nFMOD_Studio_CommandReplay_SetLoadBankCallback(long replay, long callback) {
        long __functionAddress = Functions.CommandReplay_SetLoadBankCallback;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, callback, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SetLoadBankCallback(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_STUDIO_COMMANDREPLAY_LOAD_BANK_CALLBACK callback)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetLoadBankCallback(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("FMOD_STUDIO_COMMANDREPLAY_LOAD_BANK_CALLBACK") @Nullable FMOD_STUDIO_COMMANDREPLAY_LOAD_BANK_CALLBACKI callback) {
        return nFMOD_Studio_CommandReplay_SetLoadBankCallback(replay, memAddressSafe(callback));
    }

    // --- [ FMOD_Studio_CommandReplay_SetCreateInstanceCallback ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SetCreateInstanceCallback(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK callback)} */
    public static int nFMOD_Studio_CommandReplay_SetCreateInstanceCallback(long replay, long callback) {
        long __functionAddress = Functions.CommandReplay_SetCreateInstanceCallback;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, callback, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SetCreateInstanceCallback(FMOD_STUDIO_COMMANDREPLAY * replay, FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK callback)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetCreateInstanceCallback(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK") @Nullable FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACKI callback) {
        return nFMOD_Studio_CommandReplay_SetCreateInstanceCallback(replay, memAddressSafe(callback));
    }

    // --- [ FMOD_Studio_CommandReplay_GetUserData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetUserData(FMOD_STUDIO_COMMANDREPLAY * replay, void ** userdata)} */
    public static int nFMOD_Studio_CommandReplay_GetUserData(long replay, long userdata) {
        long __functionAddress = Functions.CommandReplay_GetUserData;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, userdata, __functionAddress);
    }

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_GetUserData(FMOD_STUDIO_COMMANDREPLAY * replay, void ** userdata)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetUserData(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Studio_CommandReplay_GetUserData(replay, memAddress(userdata));
    }

    // --- [ FMOD_Studio_CommandReplay_SetUserData ] ---

    /** {@code FMOD_RESULT FMOD_Studio_CommandReplay_SetUserData(FMOD_STUDIO_COMMANDREPLAY * replay, void * userdata)} */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetUserData(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.CommandReplay_SetUserData;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, userdata, __functionAddress);
    }

}