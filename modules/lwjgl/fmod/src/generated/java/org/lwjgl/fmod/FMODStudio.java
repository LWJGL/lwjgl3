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
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class FMODStudio {

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

    public static final int FMOD_STUDIO_INIT_NORMAL = 0x0;

    public static final int FMOD_STUDIO_INIT_LIVEUPDATE = 0x1;

    public static final int FMOD_STUDIO_INIT_ALLOW_MISSING_PLUGINS = 0x2;

    public static final int FMOD_STUDIO_INIT_SYNCHRONOUS_UPDATE = 0x4;

    public static final int FMOD_STUDIO_INIT_DEFERRED_CALLBACKS = 0x8;

    public static final int FMOD_STUDIO_INIT_LOAD_FROM_UPDATE = 0x10;

    public static final int FMOD_STUDIO_INIT_MEMORY_TRACKING = 0x20;

    public static final int FMOD_STUDIO_PARAMETER_READONLY = 0x1;

    public static final int FMOD_STUDIO_PARAMETER_AUTOMATIC = 0x2;

    public static final int FMOD_STUDIO_PARAMETER_GLOBAL = 0x4;

    public static final int FMOD_STUDIO_PARAMETER_DISCRETE = 0x8;

    public static final int FMOD_STUDIO_PARAMETER_LABELED = 0x10;

    public static final int FMOD_STUDIO_SYSTEM_CALLBACK_PREUPDATE = 0x1;

    public static final int FMOD_STUDIO_SYSTEM_CALLBACK_POSTUPDATE = 0x2;

    public static final int FMOD_STUDIO_SYSTEM_CALLBACK_BANK_UNLOAD = 0x4;

    public static final int FMOD_STUDIO_SYSTEM_CALLBACK_LIVEUPDATE_CONNECTED = 0x8;

    public static final int FMOD_STUDIO_SYSTEM_CALLBACK_LIVEUPDATE_DISCONNECTED = 0x10;

    public static final int FMOD_STUDIO_SYSTEM_CALLBACK_ALL = 0xFFFFFFFF;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_CREATED = 0x1;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_DESTROYED = 0x2;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_STARTING = 0x4;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_STARTED = 0x8;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_RESTARTED = 0x10;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_STOPPED = 0x20;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_START_FAILED = 0x40;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_CREATE_PROGRAMMER_SOUND = 0x80;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_DESTROY_PROGRAMMER_SOUND = 0x100;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_PLUGIN_CREATED = 0x200;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_PLUGIN_DESTROYED = 0x400;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_TIMELINE_MARKER = 0x800;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_TIMELINE_BEAT = 0x1000;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_SOUND_PLAYED = 0x2000;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_SOUND_STOPPED = 0x4000;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_REAL_TO_VIRTUAL = 0x8000;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_VIRTUAL_TO_REAL = 0x10000;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_START_EVENT_COMMAND = 0x20000;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_NESTED_TIMELINE_BEAT = 0x40000;

    public static final int FMOD_STUDIO_EVENT_CALLBACK_ALL = 0xFFFFFFFF;

    public static final int FMOD_STUDIO_LOAD_BANK_NORMAL = 0x0;

    public static final int FMOD_STUDIO_LOAD_BANK_NONBLOCKING = 0x1;

    public static final int FMOD_STUDIO_LOAD_BANK_DECOMPRESS_SAMPLES = 0x2;

    public static final int FMOD_STUDIO_LOAD_BANK_UNENCRYPTED = 0x4;

    public static final int FMOD_STUDIO_COMMANDCAPTURE_NORMAL = 0x0;

    public static final int FMOD_STUDIO_COMMANDCAPTURE_FILEFLUSH = 0x1;

    public static final int FMOD_STUDIO_COMMANDCAPTURE_SKIP_INITIAL_STATE = 0x2;

    public static final int FMOD_STUDIO_COMMANDREPLAY_NORMAL = 0x0;

    public static final int FMOD_STUDIO_COMMANDREPLAY_SKIP_CLEANUP = 0x1;

    public static final int FMOD_STUDIO_COMMANDREPLAY_FAST_FORWARD = 0x2;

    public static final int FMOD_STUDIO_COMMANDREPLAY_SKIP_BANK_LOAD = 0x4;

    /**
     * {@code FMOD_STUDIO_LOADING_STATE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_STUDIO_LOADING_STATE_UNLOADING LOADING_STATE_UNLOADING}</li>
     * <li>{@link #FMOD_STUDIO_LOADING_STATE_UNLOADED LOADING_STATE_UNLOADED}</li>
     * <li>{@link #FMOD_STUDIO_LOADING_STATE_LOADING LOADING_STATE_LOADING}</li>
     * <li>{@link #FMOD_STUDIO_LOADING_STATE_LOADED LOADING_STATE_LOADED}</li>
     * <li>{@link #FMOD_STUDIO_LOADING_STATE_ERROR LOADING_STATE_ERROR}</li>
     * </ul>
     */
    public static final int
        FMOD_STUDIO_LOADING_STATE_UNLOADING = 0,
        FMOD_STUDIO_LOADING_STATE_UNLOADED  = 1,
        FMOD_STUDIO_LOADING_STATE_LOADING   = 2,
        FMOD_STUDIO_LOADING_STATE_LOADED    = 3,
        FMOD_STUDIO_LOADING_STATE_ERROR     = 4;

    /**
     * {@code FMOD_STUDIO_LOAD_MEMORY_MODE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_STUDIO_LOAD_MEMORY LOAD_MEMORY}</li>
     * <li>{@link #FMOD_STUDIO_LOAD_MEMORY_POINT LOAD_MEMORY_POINT}</li>
     * </ul>
     */
    public static final int
        FMOD_STUDIO_LOAD_MEMORY       = 0,
        FMOD_STUDIO_LOAD_MEMORY_POINT = 1;

    /**
     * {@code FMOD_STUDIO_PARAMETER_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_STUDIO_PARAMETER_GAME_CONTROLLED PARAMETER_GAME_CONTROLLED}</li>
     * <li>{@link #FMOD_STUDIO_PARAMETER_AUTOMATIC_DISTANCE PARAMETER_AUTOMATIC_DISTANCE}</li>
     * <li>{@link #FMOD_STUDIO_PARAMETER_AUTOMATIC_EVENT_CONE_ANGLE PARAMETER_AUTOMATIC_EVENT_CONE_ANGLE}</li>
     * <li>{@link #FMOD_STUDIO_PARAMETER_AUTOMATIC_EVENT_ORIENTATION PARAMETER_AUTOMATIC_EVENT_ORIENTATION}</li>
     * <li>{@link #FMOD_STUDIO_PARAMETER_AUTOMATIC_DIRECTION PARAMETER_AUTOMATIC_DIRECTION}</li>
     * <li>{@link #FMOD_STUDIO_PARAMETER_AUTOMATIC_ELEVATION PARAMETER_AUTOMATIC_ELEVATION}</li>
     * <li>{@link #FMOD_STUDIO_PARAMETER_AUTOMATIC_LISTENER_ORIENTATION PARAMETER_AUTOMATIC_LISTENER_ORIENTATION}</li>
     * <li>{@link #FMOD_STUDIO_PARAMETER_AUTOMATIC_SPEED PARAMETER_AUTOMATIC_SPEED}</li>
     * <li>{@link #FMOD_STUDIO_PARAMETER_AUTOMATIC_SPEED_ABSOLUTE PARAMETER_AUTOMATIC_SPEED_ABSOLUTE}</li>
     * <li>{@link #FMOD_STUDIO_PARAMETER_AUTOMATIC_DISTANCE_NORMALIZED PARAMETER_AUTOMATIC_DISTANCE_NORMALIZED}</li>
     * <li>{@link #FMOD_STUDIO_PARAMETER_MAX PARAMETER_MAX}</li>
     * </ul>
     */
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

    /**
     * {@code FMOD_STUDIO_USER_PROPERTY_TYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_STUDIO_USER_PROPERTY_TYPE_INTEGER USER_PROPERTY_TYPE_INTEGER}</li>
     * <li>{@link #FMOD_STUDIO_USER_PROPERTY_TYPE_BOOLEAN USER_PROPERTY_TYPE_BOOLEAN}</li>
     * <li>{@link #FMOD_STUDIO_USER_PROPERTY_TYPE_FLOAT USER_PROPERTY_TYPE_FLOAT}</li>
     * <li>{@link #FMOD_STUDIO_USER_PROPERTY_TYPE_STRING USER_PROPERTY_TYPE_STRING}</li>
     * </ul>
     */
    public static final int
        FMOD_STUDIO_USER_PROPERTY_TYPE_INTEGER = 0,
        FMOD_STUDIO_USER_PROPERTY_TYPE_BOOLEAN = 1,
        FMOD_STUDIO_USER_PROPERTY_TYPE_FLOAT   = 2,
        FMOD_STUDIO_USER_PROPERTY_TYPE_STRING  = 3;

    /**
     * {@code FMOD_STUDIO_EVENT_PROPERTY}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_STUDIO_EVENT_PROPERTY_CHANNELPRIORITY EVENT_PROPERTY_CHANNELPRIORITY}</li>
     * <li>{@link #FMOD_STUDIO_EVENT_PROPERTY_SCHEDULE_DELAY EVENT_PROPERTY_SCHEDULE_DELAY}</li>
     * <li>{@link #FMOD_STUDIO_EVENT_PROPERTY_SCHEDULE_LOOKAHEAD EVENT_PROPERTY_SCHEDULE_LOOKAHEAD}</li>
     * <li>{@link #FMOD_STUDIO_EVENT_PROPERTY_MINIMUM_DISTANCE EVENT_PROPERTY_MINIMUM_DISTANCE}</li>
     * <li>{@link #FMOD_STUDIO_EVENT_PROPERTY_MAXIMUM_DISTANCE EVENT_PROPERTY_MAXIMUM_DISTANCE}</li>
     * <li>{@link #FMOD_STUDIO_EVENT_PROPERTY_COOLDOWN EVENT_PROPERTY_COOLDOWN}</li>
     * <li>{@link #FMOD_STUDIO_EVENT_PROPERTY_MAX EVENT_PROPERTY_MAX}</li>
     * </ul>
     */
    public static final int
        FMOD_STUDIO_EVENT_PROPERTY_CHANNELPRIORITY    = 0,
        FMOD_STUDIO_EVENT_PROPERTY_SCHEDULE_DELAY     = 1,
        FMOD_STUDIO_EVENT_PROPERTY_SCHEDULE_LOOKAHEAD = 2,
        FMOD_STUDIO_EVENT_PROPERTY_MINIMUM_DISTANCE   = 3,
        FMOD_STUDIO_EVENT_PROPERTY_MAXIMUM_DISTANCE   = 4,
        FMOD_STUDIO_EVENT_PROPERTY_COOLDOWN           = 5,
        FMOD_STUDIO_EVENT_PROPERTY_MAX                = 6;

    /**
     * {@code FMOD_STUDIO_PLAYBACK_STATE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_STUDIO_PLAYBACK_PLAYING PLAYBACK_PLAYING}</li>
     * <li>{@link #FMOD_STUDIO_PLAYBACK_SUSTAINING PLAYBACK_SUSTAINING}</li>
     * <li>{@link #FMOD_STUDIO_PLAYBACK_STOPPED PLAYBACK_STOPPED}</li>
     * <li>{@link #FMOD_STUDIO_PLAYBACK_STARTING PLAYBACK_STARTING}</li>
     * <li>{@link #FMOD_STUDIO_PLAYBACK_STOPPING PLAYBACK_STOPPING}</li>
     * </ul>
     */
    public static final int
        FMOD_STUDIO_PLAYBACK_PLAYING    = 0,
        FMOD_STUDIO_PLAYBACK_SUSTAINING = 1,
        FMOD_STUDIO_PLAYBACK_STOPPED    = 2,
        FMOD_STUDIO_PLAYBACK_STARTING   = 3,
        FMOD_STUDIO_PLAYBACK_STOPPING   = 4;

    /**
     * {@code FMOD_STUDIO_STOP_MODE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_STUDIO_STOP_ALLOWFADEOUT STOP_ALLOWFADEOUT}</li>
     * <li>{@link #FMOD_STUDIO_STOP_IMMEDIATE STOP_IMMEDIATE}</li>
     * </ul>
     */
    public static final int
        FMOD_STUDIO_STOP_ALLOWFADEOUT = 0,
        FMOD_STUDIO_STOP_IMMEDIATE    = 1;

    /**
     * {@code FMOD_STUDIO_INSTANCETYPE}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #FMOD_STUDIO_INSTANCETYPE_NONE INSTANCETYPE_NONE}</li>
     * <li>{@link #FMOD_STUDIO_INSTANCETYPE_SYSTEM INSTANCETYPE_SYSTEM}</li>
     * <li>{@link #FMOD_STUDIO_INSTANCETYPE_EVENTDESCRIPTION INSTANCETYPE_EVENTDESCRIPTION}</li>
     * <li>{@link #FMOD_STUDIO_INSTANCETYPE_EVENTINSTANCE INSTANCETYPE_EVENTINSTANCE}</li>
     * <li>{@link #FMOD_STUDIO_INSTANCETYPE_PARAMETERINSTANCE INSTANCETYPE_PARAMETERINSTANCE}</li>
     * <li>{@link #FMOD_STUDIO_INSTANCETYPE_BUS INSTANCETYPE_BUS}</li>
     * <li>{@link #FMOD_STUDIO_INSTANCETYPE_VCA INSTANCETYPE_VCA}</li>
     * <li>{@link #FMOD_STUDIO_INSTANCETYPE_BANK INSTANCETYPE_BANK}</li>
     * <li>{@link #FMOD_STUDIO_INSTANCETYPE_COMMANDREPLAY INSTANCETYPE_COMMANDREPLAY}</li>
     * </ul>
     */
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

    /** Unsafe version of: {@link #FMOD_Studio_ParseID ParseID} */
    public static int nFMOD_Studio_ParseID(long idstring, long id) {
        long __functionAddress = Functions.ParseID;
        return callPPI(idstring, id, __functionAddress);
    }

    /** Global */
    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_ParseID(@NativeType("char const *") ByteBuffer idstring, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        if (CHECKS) {
            checkNT1(idstring);
        }
        return nFMOD_Studio_ParseID(memAddress(idstring), id.address());
    }

    /** Global */
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

    public static int nFMOD_Studio_System_Create(long system, int headerversion) {
        long __functionAddress = Functions.System_Create;
        return callPI(system, headerversion, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_Create(@NativeType("FMOD_STUDIO_SYSTEM **") PointerBuffer system, @NativeType("unsigned int") int headerversion) {
        if (CHECKS) {
            check(system, 1);
        }
        return nFMOD_Studio_System_Create(memAddress(system), headerversion);
    }

    // --- [ FMOD_Studio_System_IsValid ] ---

    /** System */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_System_IsValid(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_IsValid;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_SetAdvancedSettings ] ---

    public static int nFMOD_Studio_System_SetAdvancedSettings(long system, long settings) {
        long __functionAddress = Functions.System_SetAdvancedSettings;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, settings, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetAdvancedSettings(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_ADVANCEDSETTINGS *") FMOD_STUDIO_ADVANCEDSETTINGS settings) {
        return nFMOD_Studio_System_SetAdvancedSettings(system, settings.address());
    }

    // --- [ FMOD_Studio_System_GetAdvancedSettings ] ---

    public static int nFMOD_Studio_System_GetAdvancedSettings(long system, long settings) {
        long __functionAddress = Functions.System_GetAdvancedSettings;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, settings, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetAdvancedSettings(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_ADVANCEDSETTINGS *") FMOD_STUDIO_ADVANCEDSETTINGS settings) {
        return nFMOD_Studio_System_GetAdvancedSettings(system, settings.address());
    }

    // --- [ FMOD_Studio_System_Initialize ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_Initialize(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int maxchannels, @NativeType("FMOD_STUDIO_INITFLAGS") int studioflags, @NativeType("FMOD_INITFLAGS") int flags, @NativeType("void *") long extradriverdata) {
        long __functionAddress = Functions.System_Initialize;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, maxchannels, studioflags, flags, extradriverdata, __functionAddress);
    }

    // --- [ FMOD_Studio_System_Release ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_Release(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_Release;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_Update ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_Update(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_Update;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_GetCoreSystem ] ---

    public static int nFMOD_Studio_System_GetCoreSystem(long system, long coresystem) {
        long __functionAddress = Functions.System_GetCoreSystem;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, coresystem, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetCoreSystem(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_SYSTEM **") PointerBuffer coresystem) {
        if (CHECKS) {
            check(coresystem, 1);
        }
        return nFMOD_Studio_System_GetCoreSystem(system, memAddress(coresystem));
    }

    // --- [ FMOD_Studio_System_GetEvent ] ---

    public static int nFMOD_Studio_System_GetEvent(long system, long pathOrID, long event) {
        long __functionAddress = Functions.System_GetEvent;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, pathOrID, event, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetEvent(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer pathOrID, @NativeType("FMOD_STUDIO_EVENTDESCRIPTION **") PointerBuffer event) {
        if (CHECKS) {
            checkNT1(pathOrID);
            check(event, 1);
        }
        return nFMOD_Studio_System_GetEvent(system, memAddress(pathOrID), memAddress(event));
    }

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

    public static int nFMOD_Studio_System_GetBus(long system, long pathOrID, long bus) {
        long __functionAddress = Functions.System_GetBus;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, pathOrID, bus, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBus(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer pathOrID, @NativeType("FMOD_STUDIO_BUS **") PointerBuffer bus) {
        if (CHECKS) {
            checkNT1(pathOrID);
            check(bus, 1);
        }
        return nFMOD_Studio_System_GetBus(system, memAddress(pathOrID), memAddress(bus));
    }

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

    public static int nFMOD_Studio_System_GetVCA(long system, long pathOrID, long vca) {
        long __functionAddress = Functions.System_GetVCA;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, pathOrID, vca, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetVCA(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer pathOrID, @NativeType("FMOD_STUDIO_VCA **") PointerBuffer vca) {
        if (CHECKS) {
            checkNT1(pathOrID);
            check(vca, 1);
        }
        return nFMOD_Studio_System_GetVCA(system, memAddress(pathOrID), memAddress(vca));
    }

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

    public static int nFMOD_Studio_System_GetBank(long system, long pathOrID, long bank) {
        long __functionAddress = Functions.System_GetBank;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, pathOrID, bank, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBank(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer pathOrID, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            checkNT1(pathOrID);
            check(bank, 1);
        }
        return nFMOD_Studio_System_GetBank(system, memAddress(pathOrID), memAddress(bank));
    }

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

    public static int nFMOD_Studio_System_GetEventByID(long system, long id, long event) {
        long __functionAddress = Functions.System_GetEventByID;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, id, event, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetEventByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_GUID const *") FMOD_GUID id, @NativeType("FMOD_STUDIO_EVENTDESCRIPTION **") PointerBuffer event) {
        if (CHECKS) {
            check(event, 1);
        }
        return nFMOD_Studio_System_GetEventByID(system, id.address(), memAddress(event));
    }

    // --- [ FMOD_Studio_System_GetBusByID ] ---

    public static int nFMOD_Studio_System_GetBusByID(long system, long id, long bus) {
        long __functionAddress = Functions.System_GetBusByID;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, id, bus, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBusByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_GUID const *") FMOD_GUID id, @NativeType("FMOD_STUDIO_BUS **") PointerBuffer bus) {
        if (CHECKS) {
            check(bus, 1);
        }
        return nFMOD_Studio_System_GetBusByID(system, id.address(), memAddress(bus));
    }

    // --- [ FMOD_Studio_System_GetVCAByID ] ---

    public static int nFMOD_Studio_System_GetVCAByID(long system, long id, long vca) {
        long __functionAddress = Functions.System_GetVCAByID;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, id, vca, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetVCAByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_GUID const *") FMOD_GUID id, @NativeType("FMOD_STUDIO_VCA **") PointerBuffer vca) {
        if (CHECKS) {
            check(vca, 1);
        }
        return nFMOD_Studio_System_GetVCAByID(system, id.address(), memAddress(vca));
    }

    // --- [ FMOD_Studio_System_GetBankByID ] ---

    public static int nFMOD_Studio_System_GetBankByID(long system, long id, long bank) {
        long __functionAddress = Functions.System_GetBankByID;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, id, bank, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBankByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_GUID const *") FMOD_GUID id, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            check(bank, 1);
        }
        return nFMOD_Studio_System_GetBankByID(system, id.address(), memAddress(bank));
    }

    // --- [ FMOD_Studio_System_GetSoundInfo ] ---

    public static int nFMOD_Studio_System_GetSoundInfo(long system, long key, long info) {
        long __functionAddress = Functions.System_GetSoundInfo;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, key, info, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetSoundInfo(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer key, @NativeType("FMOD_STUDIO_SOUND_INFO *") FMOD_STUDIO_SOUND_INFO info) {
        if (CHECKS) {
            checkNT1(key);
        }
        return nFMOD_Studio_System_GetSoundInfo(system, memAddress(key), info.address());
    }

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

    public static int nFMOD_Studio_System_GetParameterDescriptionByName(long system, long name, long parameter) {
        long __functionAddress = Functions.System_GetParameterDescriptionByName;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, name, parameter, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterDescriptionByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_System_GetParameterDescriptionByName(system, memAddress(name), parameter.address());
    }

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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterDescriptionByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, FMOD_STUDIO_PARAMETER_ID id, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        return nFMOD_Studio_System_GetParameterDescriptionByID(system, id.address(), parameter.address());
    }

    // --- [ FMOD_Studio_System_GetParameterLabelByName ] ---

    public static int nFMOD_Studio_System_GetParameterLabelByName(long system, long name, int labelindex, long label, int size, long retrieved) {
        long __functionAddress = Functions.System_GetParameterLabelByName;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, name, labelindex, label, size, retrieved, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterLabelByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name, int labelindex, @Nullable @NativeType("char *") ByteBuffer label, @Nullable @NativeType("int *") IntBuffer retrieved) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_System_GetParameterLabelByName(system, memAddress(name), labelindex, memAddressSafe(label), remainingSafe(label), memAddressSafe(retrieved));
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterLabelByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence name, int labelindex, @Nullable @NativeType("char *") ByteBuffer label, @Nullable @NativeType("int *") IntBuffer retrieved) {
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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterLabelByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, FMOD_STUDIO_PARAMETER_ID id, int labelindex, @Nullable @NativeType("char *") ByteBuffer label, @Nullable @NativeType("int *") IntBuffer retrieved) {
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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, FMOD_STUDIO_PARAMETER_ID id, @Nullable @NativeType("float *") FloatBuffer value, @Nullable @NativeType("float *") FloatBuffer finalvalue) {
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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParameterByID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, FMOD_STUDIO_PARAMETER_ID id, float value, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        return nFMOD_Studio_System_SetParameterByID(system, id.address(), value, ignoreseekspeed);
    }

    // --- [ FMOD_Studio_System_SetParameterByIDWithLabel ] ---

    private static final FFICIF FMOD_Studio_System_SetParameterByIDWithLabelCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_pointer, ffi_type_sint32
    );

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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParameterByIDWithLabel(@NativeType("FMOD_STUDIO_SYSTEM *") long system, FMOD_STUDIO_PARAMETER_ID id, @NativeType("char const *") ByteBuffer label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(label);
        }
        return nFMOD_Studio_System_SetParameterByIDWithLabel(system, id.address(), memAddress(label), ignoreseekspeed);
    }

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

    public static int nFMOD_Studio_System_SetParametersByIDs(long system, long ids, long values, int count, int ignoreseekspeed) {
        long __functionAddress = Functions.System_SetParametersByIDs;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, ids, values, count, ignoreseekspeed, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParametersByIDs(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_PARAMETER_ID const *") FMOD_STUDIO_PARAMETER_ID ids, @NativeType("float *") FloatBuffer values, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        return nFMOD_Studio_System_SetParametersByIDs(system, ids.address(), memAddress(values), values.remaining(), ignoreseekspeed);
    }

    // --- [ FMOD_Studio_System_GetParameterByName ] ---

    public static int nFMOD_Studio_System_GetParameterByName(long system, long name, long value, long finalvalue) {
        long __functionAddress = Functions.System_GetParameterByName;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, name, value, finalvalue, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name, @Nullable @NativeType("float *") FloatBuffer value, @Nullable @NativeType("float *") FloatBuffer finalvalue) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(value, 1);
            checkSafe(finalvalue, 1);
        }
        return nFMOD_Studio_System_GetParameterByName(system, memAddress(name), memAddressSafe(value), memAddressSafe(finalvalue));
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") CharSequence name, @Nullable @NativeType("float *") FloatBuffer value, @Nullable @NativeType("float *") FloatBuffer finalvalue) {
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

    public static int nFMOD_Studio_System_SetParameterByName(long system, long name, float value, int ignoreseekspeed) {
        long __functionAddress = Functions.System_SetParameterByName;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, name, value, ignoreseekspeed, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParameterByName(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name, float value, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_System_SetParameterByName(system, memAddress(name), value, ignoreseekspeed);
    }

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

    public static int nFMOD_Studio_System_SetParameterByNameWithLabel(long system, long name, long label, int ignoreseekspeed) {
        long __functionAddress = Functions.System_SetParameterByNameWithLabel;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, name, label, ignoreseekspeed, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetParameterByNameWithLabel(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(label);
        }
        return nFMOD_Studio_System_SetParameterByNameWithLabel(system, memAddress(name), memAddress(label), ignoreseekspeed);
    }

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

    public static int nFMOD_Studio_System_LookupID(long system, long path, long id) {
        long __functionAddress = Functions.System_LookupID;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, path, id, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LookupID(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer path, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nFMOD_Studio_System_LookupID(system, memAddress(path), id.address());
    }

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

    public static int nFMOD_Studio_System_LookupPath(long system, long id, long path, int size, long retrieved) {
        long __functionAddress = Functions.System_LookupPath;
        if (CHECKS) {
            check(system);
        }
        return callPPPPI(system, id, path, size, retrieved, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LookupPath(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_GUID const *") FMOD_GUID id, @Nullable @NativeType("char *") ByteBuffer path, @Nullable @NativeType("int *") IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_System_LookupPath(system, id.address(), memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_System_GetNumListeners ] ---

    public static int nFMOD_Studio_System_GetNumListeners(long system, long numlisteners) {
        long __functionAddress = Functions.System_GetNumListeners;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, numlisteners, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetNumListeners(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("int *") IntBuffer numlisteners) {
        if (CHECKS) {
            check(numlisteners, 1);
        }
        return nFMOD_Studio_System_GetNumListeners(system, memAddress(numlisteners));
    }

    // --- [ FMOD_Studio_System_SetNumListeners ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetNumListeners(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int numlisteners) {
        long __functionAddress = Functions.System_SetNumListeners;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, numlisteners, __functionAddress);
    }

    // --- [ FMOD_Studio_System_GetListenerAttributes ] ---

    public static int nFMOD_Studio_System_GetListenerAttributes(long system, int index, long attributes, long attenuationposition) {
        long __functionAddress = Functions.System_GetListenerAttributes;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, index, attributes, attenuationposition, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetListenerAttributes(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int index, @NativeType("FMOD_3D_ATTRIBUTES *") FMOD_3D_ATTRIBUTES attributes, @Nullable @NativeType("FMOD_VECTOR *") FMOD_VECTOR attenuationposition) {
        return nFMOD_Studio_System_GetListenerAttributes(system, index, attributes.address(), memAddressSafe(attenuationposition));
    }

    // --- [ FMOD_Studio_System_SetListenerAttributes ] ---

    public static int nFMOD_Studio_System_SetListenerAttributes(long system, int index, long attributes, long attenuationposition) {
        long __functionAddress = Functions.System_SetListenerAttributes;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, index, attributes, attenuationposition, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetListenerAttributes(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int index, @NativeType("FMOD_3D_ATTRIBUTES const *") FMOD_3D_ATTRIBUTES attributes, @Nullable @NativeType("FMOD_VECTOR const *") FMOD_VECTOR attenuationposition) {
        return nFMOD_Studio_System_SetListenerAttributes(system, index, attributes.address(), memAddressSafe(attenuationposition));
    }

    // --- [ FMOD_Studio_System_GetListenerWeight ] ---

    public static int nFMOD_Studio_System_GetListenerWeight(long system, int index, long weight) {
        long __functionAddress = Functions.System_GetListenerWeight;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, index, weight, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetListenerWeight(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int index, @NativeType("float *") FloatBuffer weight) {
        if (CHECKS) {
            check(weight, 1);
        }
        return nFMOD_Studio_System_GetListenerWeight(system, index, memAddress(weight));
    }

    // --- [ FMOD_Studio_System_SetListenerWeight ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetListenerWeight(@NativeType("FMOD_STUDIO_SYSTEM *") long system, int index, float weight) {
        long __functionAddress = Functions.System_SetListenerWeight;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, index, weight, __functionAddress);
    }

    // --- [ FMOD_Studio_System_LoadBankFile ] ---

    public static int nFMOD_Studio_System_LoadBankFile(long system, long filename, int flags, long bank) {
        long __functionAddress = Functions.System_LoadBankFile;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, filename, flags, bank, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LoadBankFile(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer filename, @NativeType("FMOD_STUDIO_LOAD_BANK_FLAGS") int flags, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            checkNT1(filename);
            check(bank, 1);
        }
        return nFMOD_Studio_System_LoadBankFile(system, memAddress(filename), flags, memAddress(bank));
    }

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

    public static int nFMOD_Studio_System_LoadBankMemory(long system, long buffer, int length, int mode, int flags, long bank) {
        long __functionAddress = Functions.System_LoadBankMemory;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, buffer, length, mode, flags, bank, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LoadBankMemory(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer buffer, @NativeType("FMOD_STUDIO_LOAD_MEMORY_MODE") int mode, @NativeType("FMOD_STUDIO_LOAD_BANK_FLAGS") int flags, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            check(bank, 1);
        }
        return nFMOD_Studio_System_LoadBankMemory(system, memAddress(buffer), buffer.remaining(), mode, flags, memAddress(bank));
    }

    // --- [ FMOD_Studio_System_LoadBankCustom ] ---

    public static int nFMOD_Studio_System_LoadBankCustom(long system, long info, int flags, long bank) {
        long __functionAddress = Functions.System_LoadBankCustom;
        if (CHECKS) {
            check(system);
            FMOD_STUDIO_BANK_INFO.validate(info);
        }
        return callPPPI(system, info, flags, bank, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LoadBankCustom(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_BANK_INFO const *") FMOD_STUDIO_BANK_INFO info, @NativeType("FMOD_STUDIO_LOAD_BANK_FLAGS") int flags, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer bank) {
        if (CHECKS) {
            check(bank, 1);
        }
        return nFMOD_Studio_System_LoadBankCustom(system, info.address(), flags, memAddress(bank));
    }

    // --- [ FMOD_Studio_System_RegisterPlugin ] ---

    public static int nFMOD_Studio_System_RegisterPlugin(long system, long description) {
        long __functionAddress = Functions.System_RegisterPlugin;
        if (CHECKS) {
            check(system);
            FMOD_DSP_DESCRIPTION.validate(description);
        }
        return callPPI(system, description, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_RegisterPlugin(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_DSP_DESCRIPTION const *") FMOD_DSP_DESCRIPTION description) {
        return nFMOD_Studio_System_RegisterPlugin(system, description.address());
    }

    // --- [ FMOD_Studio_System_UnregisterPlugin ] ---

    public static int nFMOD_Studio_System_UnregisterPlugin(long system, long name) {
        long __functionAddress = Functions.System_UnregisterPlugin;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, name, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_UnregisterPlugin(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_System_UnregisterPlugin(system, memAddress(name));
    }

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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_UnloadAll(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_UnloadAll;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_FlushCommands ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_FlushCommands(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_FlushCommands;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_FlushSampleLoading ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_FlushSampleLoading(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_FlushSampleLoading;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_StartCommandCapture ] ---

    public static int nFMOD_Studio_System_StartCommandCapture(long system, long filename, int flags) {
        long __functionAddress = Functions.System_StartCommandCapture;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, filename, flags, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_StartCommandCapture(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer filename, @NativeType("FMOD_STUDIO_COMMANDCAPTURE_FLAGS") int flags) {
        if (CHECKS) {
            checkNT1(filename);
        }
        return nFMOD_Studio_System_StartCommandCapture(system, memAddress(filename), flags);
    }

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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_StopCommandCapture(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_StopCommandCapture;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_LoadCommandReplay ] ---

    public static int nFMOD_Studio_System_LoadCommandReplay(long system, long filename, int flags, long replay) {
        long __functionAddress = Functions.System_LoadCommandReplay;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, filename, flags, replay, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_LoadCommandReplay(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("char const *") ByteBuffer filename, @NativeType("FMOD_STUDIO_COMMANDREPLAY_FLAGS") int flags, @NativeType("FMOD_STUDIO_COMMANDREPLAY **") PointerBuffer replay) {
        if (CHECKS) {
            checkNT1(filename);
            check(replay, 1);
        }
        return nFMOD_Studio_System_LoadCommandReplay(system, memAddress(filename), flags, memAddress(replay));
    }

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

    public static int nFMOD_Studio_System_GetBankCount(long system, long count) {
        long __functionAddress = Functions.System_GetBankCount;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBankCount(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_System_GetBankCount(system, memAddress(count));
    }

    // --- [ FMOD_Studio_System_GetBankList ] ---

    public static int nFMOD_Studio_System_GetBankList(long system, long array, int capacity, long count) {
        long __functionAddress = Functions.System_GetBankList;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, array, capacity, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBankList(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_BANK **") PointerBuffer array, @Nullable @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        return nFMOD_Studio_System_GetBankList(system, memAddress(array), array.remaining(), memAddressSafe(count));
    }

    // --- [ FMOD_Studio_System_GetParameterDescriptionCount ] ---

    public static int nFMOD_Studio_System_GetParameterDescriptionCount(long system, long count) {
        long __functionAddress = Functions.System_GetParameterDescriptionCount;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterDescriptionCount(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_System_GetParameterDescriptionCount(system, memAddress(count));
    }

    // --- [ FMOD_Studio_System_GetParameterDescriptionList ] ---

    public static int nFMOD_Studio_System_GetParameterDescriptionList(long system, long array, int capacity, long count) {
        long __functionAddress = Functions.System_GetParameterDescriptionList;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, array, capacity, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetParameterDescriptionList(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION.Buffer array, @Nullable @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        return nFMOD_Studio_System_GetParameterDescriptionList(system, array.address(), array.remaining(), memAddressSafe(count));
    }

    // --- [ FMOD_Studio_System_GetCPUUsage ] ---

    public static int nFMOD_Studio_System_GetCPUUsage(long system, long usage, long usage_core) {
        long __functionAddress = Functions.System_GetCPUUsage;
        if (CHECKS) {
            check(system);
        }
        return callPPPI(system, usage, usage_core, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetCPUUsage(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @Nullable @NativeType("FMOD_STUDIO_CPU_USAGE *") FMOD_STUDIO_CPU_USAGE usage, @Nullable @NativeType("FMOD_CPU_USAGE *") FMOD_CPU_USAGE usage_core) {
        return nFMOD_Studio_System_GetCPUUsage(system, memAddressSafe(usage), memAddressSafe(usage_core));
    }

    // --- [ FMOD_Studio_System_GetBufferUsage ] ---

    public static int nFMOD_Studio_System_GetBufferUsage(long system, long usage) {
        long __functionAddress = Functions.System_GetBufferUsage;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, usage, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetBufferUsage(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_BUFFER_USAGE *") FMOD_STUDIO_BUFFER_USAGE usage) {
        return nFMOD_Studio_System_GetBufferUsage(system, usage.address());
    }

    // --- [ FMOD_Studio_System_ResetBufferUsage ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_ResetBufferUsage(@NativeType("FMOD_STUDIO_SYSTEM *") long system) {
        long __functionAddress = Functions.System_ResetBufferUsage;
        if (CHECKS) {
            check(system);
        }
        return callPI(system, __functionAddress);
    }

    // --- [ FMOD_Studio_System_SetCallback ] ---

    public static int nFMOD_Studio_System_SetCallback(long system, long callback, int callbackmask) {
        long __functionAddress = Functions.System_SetCallback;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, callback, callbackmask, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetCallback(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @Nullable @NativeType("FMOD_STUDIO_SYSTEM_CALLBACK") FMOD_STUDIO_SYSTEM_CALLBACKI callback, @NativeType("FMOD_STUDIO_SYSTEM_CALLBACK_TYPE") int callbackmask) {
        return nFMOD_Studio_System_SetCallback(system, memAddressSafe(callback), callbackmask);
    }

    // --- [ FMOD_Studio_System_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_SetUserData(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.System_SetUserData;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, userdata, __functionAddress);
    }

    // --- [ FMOD_Studio_System_GetUserData ] ---

    public static int nFMOD_Studio_System_GetUserData(long system, long userdata) {
        long __functionAddress = Functions.System_GetUserData;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetUserData(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Studio_System_GetUserData(system, memAddress(userdata));
    }

    // --- [ FMOD_Studio_System_GetMemoryUsage ] ---

    public static int nFMOD_Studio_System_GetMemoryUsage(long system, long memoryusage) {
        long __functionAddress = Functions.System_GetMemoryUsage;
        if (CHECKS) {
            check(system);
        }
        return callPPI(system, memoryusage, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_System_GetMemoryUsage(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_MEMORY_USAGE *") FMOD_STUDIO_MEMORY_USAGE memoryusage) {
        return nFMOD_Studio_System_GetMemoryUsage(system, memoryusage.address());
    }

    // --- [ FMOD_Studio_EventDescription_IsValid ] ---

    /** EventDescription */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_EventDescription_IsValid(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription) {
        long __functionAddress = Functions.EventDescription_IsValid;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPI(eventdescription, __functionAddress);
    }

    // --- [ FMOD_Studio_EventDescription_GetID ] ---

    public static int nFMOD_Studio_EventDescription_GetID(long eventdescription, long id) {
        long __functionAddress = Functions.EventDescription_GetID;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, id, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetID(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        return nFMOD_Studio_EventDescription_GetID(eventdescription, id.address());
    }

    // --- [ FMOD_Studio_EventDescription_GetPath ] ---

    public static int nFMOD_Studio_EventDescription_GetPath(long eventdescription, long path, int size, long retrieved) {
        long __functionAddress = Functions.EventDescription_GetPath;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, path, size, retrieved, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetPath(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @Nullable @NativeType("char *") ByteBuffer path, @Nullable @NativeType("int *") IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_EventDescription_GetPath(eventdescription, memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterDescriptionCount ] ---

    public static int nFMOD_Studio_EventDescription_GetParameterDescriptionCount(long eventdescription, long count) {
        long __functionAddress = Functions.EventDescription_GetParameterDescriptionCount;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterDescriptionCount(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_EventDescription_GetParameterDescriptionCount(eventdescription, memAddress(count));
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterDescriptionByIndex ] ---

    public static int nFMOD_Studio_EventDescription_GetParameterDescriptionByIndex(long eventdescription, int index, long parameter) {
        long __functionAddress = Functions.EventDescription_GetParameterDescriptionByIndex;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, index, parameter, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterDescriptionByIndex(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, int index, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        return nFMOD_Studio_EventDescription_GetParameterDescriptionByIndex(eventdescription, index, parameter.address());
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterDescriptionByName ] ---

    public static int nFMOD_Studio_EventDescription_GetParameterDescriptionByName(long eventdescription, long name, long parameter) {
        long __functionAddress = Functions.EventDescription_GetParameterDescriptionByName;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, name, parameter, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterDescriptionByName(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("char const *") ByteBuffer name, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_EventDescription_GetParameterDescriptionByName(eventdescription, memAddress(name), parameter.address());
    }

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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterDescriptionByID(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, FMOD_STUDIO_PARAMETER_ID id, @NativeType("FMOD_STUDIO_PARAMETER_DESCRIPTION *") FMOD_STUDIO_PARAMETER_DESCRIPTION parameter) {
        return nFMOD_Studio_EventDescription_GetParameterDescriptionByID(eventdescription, id.address(), parameter.address());
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterLabelByIndex ] ---

    public static int nFMOD_Studio_EventDescription_GetParameterLabelByIndex(long eventdescription, int index, int labelindex, long label, int size, long retrieved) {
        long __functionAddress = Functions.EventDescription_GetParameterLabelByIndex;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, index, labelindex, label, size, retrieved, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterLabelByIndex(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, int index, int labelindex, @Nullable @NativeType("char *") ByteBuffer label, @Nullable @NativeType("int *") IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_EventDescription_GetParameterLabelByIndex(eventdescription, index, labelindex, memAddressSafe(label), remainingSafe(label), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_EventDescription_GetParameterLabelByName ] ---

    public static int nFMOD_Studio_EventDescription_GetParameterLabelByName(long eventdescription, long name, int labelindex, long label, int size, long retrieved) {
        long __functionAddress = Functions.EventDescription_GetParameterLabelByName;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPPI(eventdescription, name, labelindex, label, size, retrieved, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterLabelByName(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("char const *") ByteBuffer name, int labelindex, @Nullable @NativeType("char *") ByteBuffer label, @Nullable @NativeType("int *") IntBuffer retrieved) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_EventDescription_GetParameterLabelByName(eventdescription, memAddress(name), labelindex, memAddressSafe(label), remainingSafe(label), memAddressSafe(retrieved));
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterLabelByName(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("char const *") CharSequence name, int labelindex, @Nullable @NativeType("char *") ByteBuffer label, @Nullable @NativeType("int *") IntBuffer retrieved) {
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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetParameterLabelByID(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, FMOD_STUDIO_PARAMETER_ID id, int labelindex, @Nullable @NativeType("char *") ByteBuffer label, @Nullable @NativeType("int *") IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_EventDescription_GetParameterLabelByID(eventdescription, id.address(), labelindex, memAddressSafe(label), remainingSafe(label), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_EventDescription_GetUserPropertyCount ] ---

    public static int nFMOD_Studio_EventDescription_GetUserPropertyCount(long eventdescription, long count) {
        long __functionAddress = Functions.EventDescription_GetUserPropertyCount;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetUserPropertyCount(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_EventDescription_GetUserPropertyCount(eventdescription, memAddress(count));
    }

    // --- [ FMOD_Studio_EventDescription_GetUserPropertyByIndex ] ---

    public static int nFMOD_Studio_EventDescription_GetUserPropertyByIndex(long eventdescription, int index, long property) {
        long __functionAddress = Functions.EventDescription_GetUserPropertyByIndex;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, index, property, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetUserPropertyByIndex(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, int index, @NativeType("FMOD_STUDIO_USER_PROPERTY *") FMOD_STUDIO_USER_PROPERTY property) {
        return nFMOD_Studio_EventDescription_GetUserPropertyByIndex(eventdescription, index, property.address());
    }

    // --- [ FMOD_Studio_EventDescription_GetUserProperty ] ---

    public static int nFMOD_Studio_EventDescription_GetUserProperty(long eventdescription, long name, long property) {
        long __functionAddress = Functions.EventDescription_GetUserProperty;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, name, property, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetUserProperty(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("char const *") ByteBuffer name, @NativeType("FMOD_STUDIO_USER_PROPERTY *") FMOD_STUDIO_USER_PROPERTY property) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_EventDescription_GetUserProperty(eventdescription, memAddress(name), property.address());
    }

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

    public static int nFMOD_Studio_EventDescription_GetLength(long eventdescription, long length) {
        long __functionAddress = Functions.EventDescription_GetLength;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, length, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetLength(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("int *") IntBuffer length) {
        if (CHECKS) {
            check(length, 1);
        }
        return nFMOD_Studio_EventDescription_GetLength(eventdescription, memAddress(length));
    }

    // --- [ FMOD_Studio_EventDescription_GetMinMaxDistance ] ---

    public static int nFMOD_Studio_EventDescription_GetMinMaxDistance(long eventdescription, long min, long max) {
        long __functionAddress = Functions.EventDescription_GetMinMaxDistance;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, min, max, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetMinMaxDistance(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @Nullable @NativeType("float *") FloatBuffer min, @Nullable @NativeType("float *") FloatBuffer max) {
        if (CHECKS) {
            checkSafe(min, 1);
            checkSafe(max, 1);
        }
        return nFMOD_Studio_EventDescription_GetMinMaxDistance(eventdescription, memAddressSafe(min), memAddressSafe(max));
    }

    // --- [ FMOD_Studio_EventDescription_GetSoundSize ] ---

    public static int nFMOD_Studio_EventDescription_GetSoundSize(long eventdescription, long size) {
        long __functionAddress = Functions.EventDescription_GetSoundSize;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, size, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetSoundSize(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("float *") FloatBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return nFMOD_Studio_EventDescription_GetSoundSize(eventdescription, memAddress(size));
    }

    // --- [ FMOD_Studio_EventDescription_IsSnapshot ] ---

    public static int nFMOD_Studio_EventDescription_IsSnapshot(long eventdescription, long snapshot) {
        long __functionAddress = Functions.EventDescription_IsSnapshot;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, snapshot, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_IsSnapshot(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer snapshot) {
        if (CHECKS) {
            check(snapshot, 1);
        }
        return nFMOD_Studio_EventDescription_IsSnapshot(eventdescription, memAddress(snapshot));
    }

    // --- [ FMOD_Studio_EventDescription_IsOneshot ] ---

    public static int nFMOD_Studio_EventDescription_IsOneshot(long eventdescription, long oneshot) {
        long __functionAddress = Functions.EventDescription_IsOneshot;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, oneshot, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_IsOneshot(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer oneshot) {
        if (CHECKS) {
            check(oneshot, 1);
        }
        return nFMOD_Studio_EventDescription_IsOneshot(eventdescription, memAddress(oneshot));
    }

    // --- [ FMOD_Studio_EventDescription_IsStream ] ---

    public static int nFMOD_Studio_EventDescription_IsStream(long eventdescription, long isStream) {
        long __functionAddress = Functions.EventDescription_IsStream;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, isStream, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_IsStream(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer isStream) {
        if (CHECKS) {
            check(isStream, 1);
        }
        return nFMOD_Studio_EventDescription_IsStream(eventdescription, memAddress(isStream));
    }

    // --- [ FMOD_Studio_EventDescription_Is3D ] ---

    public static int nFMOD_Studio_EventDescription_Is3D(long eventdescription, long is3D) {
        long __functionAddress = Functions.EventDescription_Is3D;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, is3D, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_Is3D(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer is3D) {
        if (CHECKS) {
            check(is3D, 1);
        }
        return nFMOD_Studio_EventDescription_Is3D(eventdescription, memAddress(is3D));
    }

    // --- [ FMOD_Studio_EventDescription_IsDopplerEnabled ] ---

    public static int nFMOD_Studio_EventDescription_IsDopplerEnabled(long eventdescription, long doppler) {
        long __functionAddress = Functions.EventDescription_IsDopplerEnabled;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, doppler, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_IsDopplerEnabled(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer doppler) {
        if (CHECKS) {
            check(doppler, 1);
        }
        return nFMOD_Studio_EventDescription_IsDopplerEnabled(eventdescription, memAddress(doppler));
    }

    // --- [ FMOD_Studio_EventDescription_HasSustainPoint ] ---

    public static int nFMOD_Studio_EventDescription_HasSustainPoint(long eventdescription, long sustainPoint) {
        long __functionAddress = Functions.EventDescription_HasSustainPoint;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, sustainPoint, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_HasSustainPoint(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_BOOL *") IntBuffer sustainPoint) {
        if (CHECKS) {
            check(sustainPoint, 1);
        }
        return nFMOD_Studio_EventDescription_HasSustainPoint(eventdescription, memAddress(sustainPoint));
    }

    // --- [ FMOD_Studio_EventDescription_CreateInstance ] ---

    public static int nFMOD_Studio_EventDescription_CreateInstance(long eventdescription, long instance) {
        long __functionAddress = Functions.EventDescription_CreateInstance;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, instance, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_CreateInstance(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_STUDIO_EVENTINSTANCE **") PointerBuffer instance) {
        if (CHECKS) {
            check(instance, 1);
        }
        return nFMOD_Studio_EventDescription_CreateInstance(eventdescription, memAddress(instance));
    }

    // --- [ FMOD_Studio_EventDescription_GetInstanceCount ] ---

    public static int nFMOD_Studio_EventDescription_GetInstanceCount(long eventdescription, long count) {
        long __functionAddress = Functions.EventDescription_GetInstanceCount;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetInstanceCount(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_EventDescription_GetInstanceCount(eventdescription, memAddress(count));
    }

    // --- [ FMOD_Studio_EventDescription_GetInstanceList ] ---

    public static int nFMOD_Studio_EventDescription_GetInstanceList(long eventdescription, long array, int capacity, long count) {
        long __functionAddress = Functions.EventDescription_GetInstanceList;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPPI(eventdescription, array, capacity, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetInstanceList(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_STUDIO_EVENTINSTANCE **") PointerBuffer array, @Nullable @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        return nFMOD_Studio_EventDescription_GetInstanceList(eventdescription, memAddress(array), array.remaining(), memAddressSafe(count));
    }

    // --- [ FMOD_Studio_EventDescription_LoadSampleData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_LoadSampleData(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription) {
        long __functionAddress = Functions.EventDescription_LoadSampleData;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPI(eventdescription, __functionAddress);
    }

    // --- [ FMOD_Studio_EventDescription_UnloadSampleData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_UnloadSampleData(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription) {
        long __functionAddress = Functions.EventDescription_UnloadSampleData;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPI(eventdescription, __functionAddress);
    }

    // --- [ FMOD_Studio_EventDescription_GetSampleLoadingState ] ---

    public static int nFMOD_Studio_EventDescription_GetSampleLoadingState(long eventdescription, long state) {
        long __functionAddress = Functions.EventDescription_GetSampleLoadingState;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, state, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetSampleLoadingState(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("FMOD_STUDIO_LOADING_STATE *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nFMOD_Studio_EventDescription_GetSampleLoadingState(eventdescription, memAddress(state));
    }

    // --- [ FMOD_Studio_EventDescription_ReleaseAllInstances ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_ReleaseAllInstances(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription) {
        long __functionAddress = Functions.EventDescription_ReleaseAllInstances;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPI(eventdescription, __functionAddress);
    }

    // --- [ FMOD_Studio_EventDescription_SetCallback ] ---

    public static int nFMOD_Studio_EventDescription_SetCallback(long eventdescription, long callback, int callbackmask) {
        long __functionAddress = Functions.EventDescription_SetCallback;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, callback, callbackmask, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_SetCallback(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @Nullable @NativeType("FMOD_STUDIO_EVENT_CALLBACK") FMOD_STUDIO_EVENT_CALLBACKI callback, @NativeType("FMOD_STUDIO_EVENT_CALLBACK_TYPE") int callbackmask) {
        return nFMOD_Studio_EventDescription_SetCallback(eventdescription, memAddressSafe(callback), callbackmask);
    }

    // --- [ FMOD_Studio_EventDescription_GetUserData ] ---

    public static int nFMOD_Studio_EventDescription_GetUserData(long eventdescription, long userdata) {
        long __functionAddress = Functions.EventDescription_GetUserData;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_GetUserData(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Studio_EventDescription_GetUserData(eventdescription, memAddress(userdata));
    }

    // --- [ FMOD_Studio_EventDescription_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventDescription_SetUserData(@NativeType("FMOD_STUDIO_EVENTDESCRIPTION *") long eventdescription, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.EventDescription_SetUserData;
        if (CHECKS) {
            check(eventdescription);
        }
        return callPPI(eventdescription, userdata, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_IsValid ] ---

    /** EventInstance */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_EventInstance_IsValid(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance) {
        long __functionAddress = Functions.EventInstance_IsValid;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetDescription ] ---

    public static int nFMOD_Studio_EventInstance_GetDescription(long eventinstance, long description) {
        long __functionAddress = Functions.EventInstance_GetDescription;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, description, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetDescription(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_EVENTDESCRIPTION **") PointerBuffer description) {
        if (CHECKS) {
            check(description, 1);
        }
        return nFMOD_Studio_EventInstance_GetDescription(eventinstance, memAddress(description));
    }

    // --- [ FMOD_Studio_EventInstance_GetVolume ] ---

    public static int nFMOD_Studio_EventInstance_GetVolume(long eventinstance, long volume, long finalvolume) {
        long __functionAddress = Functions.EventInstance_GetVolume;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, volume, finalvolume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetVolume(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @Nullable @NativeType("float *") FloatBuffer volume, @Nullable @NativeType("float *") FloatBuffer finalvolume) {
        if (CHECKS) {
            checkSafe(volume, 1);
            checkSafe(finalvolume, 1);
        }
        return nFMOD_Studio_EventInstance_GetVolume(eventinstance, memAddressSafe(volume), memAddressSafe(finalvolume));
    }

    // --- [ FMOD_Studio_EventInstance_SetVolume ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetVolume(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, float volume) {
        long __functionAddress = Functions.EventInstance_SetVolume;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, volume, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetPitch ] ---

    public static int nFMOD_Studio_EventInstance_GetPitch(long eventinstance, long pitch, long finalpitch) {
        long __functionAddress = Functions.EventInstance_GetPitch;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, pitch, finalpitch, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetPitch(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @Nullable @NativeType("float *") FloatBuffer pitch, @Nullable @NativeType("float *") FloatBuffer finalpitch) {
        if (CHECKS) {
            checkSafe(pitch, 1);
            checkSafe(finalpitch, 1);
        }
        return nFMOD_Studio_EventInstance_GetPitch(eventinstance, memAddressSafe(pitch), memAddressSafe(finalpitch));
    }

    // --- [ FMOD_Studio_EventInstance_SetPitch ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetPitch(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, float pitch) {
        long __functionAddress = Functions.EventInstance_SetPitch;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, pitch, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_Get3DAttributes ] ---

    public static int nFMOD_Studio_EventInstance_Get3DAttributes(long eventinstance, long attributes) {
        long __functionAddress = Functions.EventInstance_Get3DAttributes;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, attributes, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_Get3DAttributes(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_3D_ATTRIBUTES *") FMOD_3D_ATTRIBUTES attributes) {
        return nFMOD_Studio_EventInstance_Get3DAttributes(eventinstance, attributes.address());
    }

    // --- [ FMOD_Studio_EventInstance_Set3DAttributes ] ---

    public static int nFMOD_Studio_EventInstance_Set3DAttributes(long eventinstance, long attributes) {
        long __functionAddress = Functions.EventInstance_Set3DAttributes;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, attributes, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_Set3DAttributes(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_3D_ATTRIBUTES *") FMOD_3D_ATTRIBUTES attributes) {
        return nFMOD_Studio_EventInstance_Set3DAttributes(eventinstance, attributes.address());
    }

    // --- [ FMOD_Studio_EventInstance_GetListenerMask ] ---

    public static int nFMOD_Studio_EventInstance_GetListenerMask(long eventinstance, long mask) {
        long __functionAddress = Functions.EventInstance_GetListenerMask;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, mask, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetListenerMask(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("unsigned int *") IntBuffer mask) {
        if (CHECKS) {
            check(mask, 1);
        }
        return nFMOD_Studio_EventInstance_GetListenerMask(eventinstance, memAddress(mask));
    }

    // --- [ FMOD_Studio_EventInstance_SetListenerMask ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetListenerMask(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("unsigned int") int mask) {
        long __functionAddress = Functions.EventInstance_SetListenerMask;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, mask, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetProperty ] ---

    public static int nFMOD_Studio_EventInstance_GetProperty(long eventinstance, int index, long value) {
        long __functionAddress = Functions.EventInstance_GetProperty;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, index, value, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetProperty(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_EVENT_PROPERTY") int index, @NativeType("float *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nFMOD_Studio_EventInstance_GetProperty(eventinstance, index, memAddress(value));
    }

    // --- [ FMOD_Studio_EventInstance_SetProperty ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetProperty(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_EVENT_PROPERTY") int index, float value) {
        long __functionAddress = Functions.EventInstance_SetProperty;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, index, value, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetReverbLevel ] ---

    public static int nFMOD_Studio_EventInstance_GetReverbLevel(long eventinstance, int index, long level) {
        long __functionAddress = Functions.EventInstance_GetReverbLevel;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, index, level, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetReverbLevel(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, int index, @NativeType("float *") FloatBuffer level) {
        if (CHECKS) {
            check(level, 1);
        }
        return nFMOD_Studio_EventInstance_GetReverbLevel(eventinstance, index, memAddress(level));
    }

    // --- [ FMOD_Studio_EventInstance_SetReverbLevel ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetReverbLevel(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, int index, float level) {
        long __functionAddress = Functions.EventInstance_SetReverbLevel;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, index, level, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetPaused ] ---

    public static int nFMOD_Studio_EventInstance_GetPaused(long eventinstance, long paused) {
        long __functionAddress = Functions.EventInstance_GetPaused;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, paused, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetPaused(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_BOOL *") IntBuffer paused) {
        if (CHECKS) {
            check(paused, 1);
        }
        return nFMOD_Studio_EventInstance_GetPaused(eventinstance, memAddress(paused));
    }

    // --- [ FMOD_Studio_EventInstance_SetPaused ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetPaused(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_BOOL") int paused) {
        long __functionAddress = Functions.EventInstance_SetPaused;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, paused, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_Start ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_Start(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance) {
        long __functionAddress = Functions.EventInstance_Start;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_Stop ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_Stop(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_STOP_MODE") int mode) {
        long __functionAddress = Functions.EventInstance_Stop;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, mode, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetTimelinePosition ] ---

    public static int nFMOD_Studio_EventInstance_GetTimelinePosition(long eventinstance, long position) {
        long __functionAddress = Functions.EventInstance_GetTimelinePosition;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, position, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetTimelinePosition(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("int *") IntBuffer position) {
        if (CHECKS) {
            check(position, 1);
        }
        return nFMOD_Studio_EventInstance_GetTimelinePosition(eventinstance, memAddress(position));
    }

    // --- [ FMOD_Studio_EventInstance_SetTimelinePosition ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetTimelinePosition(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, int position) {
        long __functionAddress = Functions.EventInstance_SetTimelinePosition;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, position, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetPlaybackState ] ---

    public static int nFMOD_Studio_EventInstance_GetPlaybackState(long eventinstance, long state) {
        long __functionAddress = Functions.EventInstance_GetPlaybackState;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, state, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetPlaybackState(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_PLAYBACK_STATE *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nFMOD_Studio_EventInstance_GetPlaybackState(eventinstance, memAddress(state));
    }

    // --- [ FMOD_Studio_EventInstance_GetChannelGroup ] ---

    public static int nFMOD_Studio_EventInstance_GetChannelGroup(long eventinstance, long group) {
        long __functionAddress = Functions.EventInstance_GetChannelGroup;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, group, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetChannelGroup(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_CHANNELGROUP **") PointerBuffer group) {
        if (CHECKS) {
            check(group, 1);
        }
        return nFMOD_Studio_EventInstance_GetChannelGroup(eventinstance, memAddress(group));
    }

    // --- [ FMOD_Studio_EventInstance_GetMinMaxDistance ] ---

    public static int nFMOD_Studio_EventInstance_GetMinMaxDistance(long eventinstance, long min, long max) {
        long __functionAddress = Functions.EventInstance_GetMinMaxDistance;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, min, max, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetMinMaxDistance(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @Nullable @NativeType("float *") FloatBuffer min, @Nullable @NativeType("float *") FloatBuffer max) {
        if (CHECKS) {
            checkSafe(min, 1);
            checkSafe(max, 1);
        }
        return nFMOD_Studio_EventInstance_GetMinMaxDistance(eventinstance, memAddressSafe(min), memAddressSafe(max));
    }

    // --- [ FMOD_Studio_EventInstance_Release ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_Release(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance) {
        long __functionAddress = Functions.EventInstance_Release;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_IsVirtual ] ---

    public static int nFMOD_Studio_EventInstance_IsVirtual(long eventinstance, long virtualstate) {
        long __functionAddress = Functions.EventInstance_IsVirtual;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, virtualstate, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_IsVirtual(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_BOOL *") IntBuffer virtualstate) {
        if (CHECKS) {
            check(virtualstate, 1);
        }
        return nFMOD_Studio_EventInstance_IsVirtual(eventinstance, memAddress(virtualstate));
    }

    // --- [ FMOD_Studio_EventInstance_GetParameterByName ] ---

    public static int nFMOD_Studio_EventInstance_GetParameterByName(long eventinstance, long name, long value, long finalvalue) {
        long __functionAddress = Functions.EventInstance_GetParameterByName;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPPI(eventinstance, name, value, finalvalue, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetParameterByName(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("char const *") ByteBuffer name, @Nullable @NativeType("float *") FloatBuffer value, @Nullable @NativeType("float *") FloatBuffer finalvalue) {
        if (CHECKS) {
            checkNT1(name);
            checkSafe(value, 1);
            checkSafe(finalvalue, 1);
        }
        return nFMOD_Studio_EventInstance_GetParameterByName(eventinstance, memAddress(name), memAddressSafe(value), memAddressSafe(finalvalue));
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetParameterByName(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("char const *") CharSequence name, @Nullable @NativeType("float *") FloatBuffer value, @Nullable @NativeType("float *") FloatBuffer finalvalue) {
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

    public static int nFMOD_Studio_EventInstance_SetParameterByName(long eventinstance, long name, float value, int ignoreseekspeed) {
        long __functionAddress = Functions.EventInstance_SetParameterByName;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, name, value, ignoreseekspeed, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParameterByName(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("char const *") ByteBuffer name, float value, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nFMOD_Studio_EventInstance_SetParameterByName(eventinstance, memAddress(name), value, ignoreseekspeed);
    }

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

    public static int nFMOD_Studio_EventInstance_SetParameterByNameWithLabel(long eventinstance, long name, long label, int ignoreseekspeed) {
        long __functionAddress = Functions.EventInstance_SetParameterByNameWithLabel;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, name, label, ignoreseekspeed, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParameterByNameWithLabel(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(label);
        }
        return nFMOD_Studio_EventInstance_SetParameterByNameWithLabel(eventinstance, memAddress(name), memAddress(label), ignoreseekspeed);
    }

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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetParameterByID(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, FMOD_STUDIO_PARAMETER_ID id, @Nullable @NativeType("float *") FloatBuffer value, @Nullable @NativeType("float *") FloatBuffer finalvalue) {
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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParameterByID(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, FMOD_STUDIO_PARAMETER_ID id, float value, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        return nFMOD_Studio_EventInstance_SetParameterByID(eventinstance, id.address(), value, ignoreseekspeed);
    }

    // --- [ FMOD_Studio_EventInstance_SetParameterByIDWithLabel ] ---

    private static final FFICIF FMOD_Studio_EventInstance_SetParameterByIDWithLabelCIF = apiCreateCIF(
        apiStdcall(), ffi_type_uint32,
        ffi_type_pointer, apiCreateStruct(ffi_type_uint32, ffi_type_uint32), ffi_type_pointer, ffi_type_sint32
    );

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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParameterByIDWithLabel(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, FMOD_STUDIO_PARAMETER_ID id, @NativeType("char const *") ByteBuffer label, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        if (CHECKS) {
            checkNT1(label);
        }
        return nFMOD_Studio_EventInstance_SetParameterByIDWithLabel(eventinstance, id.address(), memAddress(label), ignoreseekspeed);
    }

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

    public static int nFMOD_Studio_EventInstance_SetParametersByIDs(long eventinstance, long ids, long values, int count, int ignoreseekspeed) {
        long __functionAddress = Functions.EventInstance_SetParametersByIDs;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, ids, values, count, ignoreseekspeed, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetParametersByIDs(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_PARAMETER_ID const *") FMOD_STUDIO_PARAMETER_ID ids, @NativeType("float *") FloatBuffer values, @NativeType("FMOD_BOOL") int ignoreseekspeed) {
        return nFMOD_Studio_EventInstance_SetParametersByIDs(eventinstance, ids.address(), memAddress(values), values.remaining(), ignoreseekspeed);
    }

    // --- [ FMOD_Studio_EventInstance_KeyOff ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_KeyOff(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance) {
        long __functionAddress = Functions.EventInstance_KeyOff;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPI(eventinstance, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_SetCallback ] ---

    public static int nFMOD_Studio_EventInstance_SetCallback(long eventinstance, long callback, int callbackmask) {
        long __functionAddress = Functions.EventInstance_SetCallback;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, callback, callbackmask, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetCallback(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @Nullable @NativeType("FMOD_STUDIO_EVENT_CALLBACK") FMOD_STUDIO_EVENT_CALLBACKI callback, @NativeType("FMOD_STUDIO_EVENT_CALLBACK_TYPE") int callbackmask) {
        return nFMOD_Studio_EventInstance_SetCallback(eventinstance, memAddressSafe(callback), callbackmask);
    }

    // --- [ FMOD_Studio_EventInstance_GetUserData ] ---

    public static int nFMOD_Studio_EventInstance_GetUserData(long eventinstance, long userdata) {
        long __functionAddress = Functions.EventInstance_GetUserData;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetUserData(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Studio_EventInstance_GetUserData(eventinstance, memAddress(userdata));
    }

    // --- [ FMOD_Studio_EventInstance_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_SetUserData(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.EventInstance_SetUserData;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, userdata, __functionAddress);
    }

    // --- [ FMOD_Studio_EventInstance_GetCPUUsage ] ---

    public static int nFMOD_Studio_EventInstance_GetCPUUsage(long eventinstance, long exclusive, long inclusive) {
        long __functionAddress = Functions.EventInstance_GetCPUUsage;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPPI(eventinstance, exclusive, inclusive, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetCPUUsage(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @Nullable @NativeType("unsigned int *") IntBuffer exclusive, @Nullable @NativeType("unsigned int *") IntBuffer inclusive) {
        if (CHECKS) {
            checkSafe(exclusive, 1);
            checkSafe(inclusive, 1);
        }
        return nFMOD_Studio_EventInstance_GetCPUUsage(eventinstance, memAddressSafe(exclusive), memAddressSafe(inclusive));
    }

    // --- [ FMOD_Studio_EventInstance_GetMemoryUsage ] ---

    public static int nFMOD_Studio_EventInstance_GetMemoryUsage(long eventinstance, long memoryusage) {
        long __functionAddress = Functions.EventInstance_GetMemoryUsage;
        if (CHECKS) {
            check(eventinstance);
        }
        return callPPI(eventinstance, memoryusage, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_EventInstance_GetMemoryUsage(@NativeType("FMOD_STUDIO_EVENTINSTANCE *") long eventinstance, @NativeType("FMOD_STUDIO_MEMORY_USAGE *") FMOD_STUDIO_MEMORY_USAGE memoryusage) {
        return nFMOD_Studio_EventInstance_GetMemoryUsage(eventinstance, memoryusage.address());
    }

    // --- [ FMOD_Studio_Bus_IsValid ] ---

    /** Bus */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_Bus_IsValid(@NativeType("FMOD_STUDIO_BUS *") long bus) {
        long __functionAddress = Functions.Bus_IsValid;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_GetID ] ---

    public static int nFMOD_Studio_Bus_GetID(long bus, long id) {
        long __functionAddress = Functions.Bus_GetID;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, id, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetID(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        return nFMOD_Studio_Bus_GetID(bus, id.address());
    }

    // --- [ FMOD_Studio_Bus_GetPath ] ---

    public static int nFMOD_Studio_Bus_GetPath(long bus, long path, int size, long retrieved) {
        long __functionAddress = Functions.Bus_GetPath;
        if (CHECKS) {
            check(bus);
        }
        return callPPPI(bus, path, size, retrieved, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetPath(@NativeType("FMOD_STUDIO_BUS *") long bus, @Nullable @NativeType("char *") ByteBuffer path, @Nullable @NativeType("int *") IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_Bus_GetPath(bus, memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_Bus_GetVolume ] ---

    public static int nFMOD_Studio_Bus_GetVolume(long bus, long volume, long finalvolume) {
        long __functionAddress = Functions.Bus_GetVolume;
        if (CHECKS) {
            check(bus);
        }
        return callPPPI(bus, volume, finalvolume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetVolume(@NativeType("FMOD_STUDIO_BUS *") long bus, @Nullable @NativeType("float *") FloatBuffer volume, @Nullable @NativeType("float *") FloatBuffer finalvolume) {
        if (CHECKS) {
            checkSafe(volume, 1);
            checkSafe(finalvolume, 1);
        }
        return nFMOD_Studio_Bus_GetVolume(bus, memAddressSafe(volume), memAddressSafe(finalvolume));
    }

    // --- [ FMOD_Studio_Bus_SetVolume ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_SetVolume(@NativeType("FMOD_STUDIO_BUS *") long bus, float volume) {
        long __functionAddress = Functions.Bus_SetVolume;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, volume, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_GetPaused ] ---

    public static int nFMOD_Studio_Bus_GetPaused(long bus, long paused) {
        long __functionAddress = Functions.Bus_GetPaused;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, paused, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetPaused(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_BOOL *") IntBuffer paused) {
        if (CHECKS) {
            check(paused, 1);
        }
        return nFMOD_Studio_Bus_GetPaused(bus, memAddress(paused));
    }

    // --- [ FMOD_Studio_Bus_SetPaused ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_SetPaused(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_BOOL") int paused) {
        long __functionAddress = Functions.Bus_SetPaused;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, paused, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_GetMute ] ---

    public static int nFMOD_Studio_Bus_GetMute(long bus, long mute) {
        long __functionAddress = Functions.Bus_GetMute;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, mute, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetMute(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_BOOL *") IntBuffer mute) {
        if (CHECKS) {
            check(mute, 1);
        }
        return nFMOD_Studio_Bus_GetMute(bus, memAddress(mute));
    }

    // --- [ FMOD_Studio_Bus_SetMute ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_SetMute(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_BOOL") int mute) {
        long __functionAddress = Functions.Bus_SetMute;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, mute, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_StopAllEvents ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_StopAllEvents(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_STUDIO_STOP_MODE") int mode) {
        long __functionAddress = Functions.Bus_StopAllEvents;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, mode, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_GetPortIndex ] ---

    public static int nFMOD_Studio_Bus_GetPortIndex(long bus, long index) {
        long __functionAddress = Functions.Bus_GetPortIndex;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, index, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetPortIndex(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_PORT_INDEX *") LongBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        return nFMOD_Studio_Bus_GetPortIndex(bus, memAddress(index));
    }

    // --- [ FMOD_Studio_Bus_SetPortIndex ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_SetPortIndex(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_PORT_INDEX") long index) {
        long __functionAddress = Functions.Bus_SetPortIndex;
        if (CHECKS) {
            check(bus);
        }
        return callPJI(bus, index, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_LockChannelGroup ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_LockChannelGroup(@NativeType("FMOD_STUDIO_BUS *") long bus) {
        long __functionAddress = Functions.Bus_LockChannelGroup;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_UnlockChannelGroup ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_UnlockChannelGroup(@NativeType("FMOD_STUDIO_BUS *") long bus) {
        long __functionAddress = Functions.Bus_UnlockChannelGroup;
        if (CHECKS) {
            check(bus);
        }
        return callPI(bus, __functionAddress);
    }

    // --- [ FMOD_Studio_Bus_GetChannelGroup ] ---

    public static int nFMOD_Studio_Bus_GetChannelGroup(long bus, long group) {
        long __functionAddress = Functions.Bus_GetChannelGroup;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, group, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetChannelGroup(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_CHANNELGROUP **") PointerBuffer group) {
        if (CHECKS) {
            check(group, 1);
        }
        return nFMOD_Studio_Bus_GetChannelGroup(bus, memAddress(group));
    }

    // --- [ FMOD_Studio_Bus_GetCPUUsage ] ---

    public static int nFMOD_Studio_Bus_GetCPUUsage(long bus, long exclusive, long inclusive) {
        long __functionAddress = Functions.Bus_GetCPUUsage;
        if (CHECKS) {
            check(bus);
        }
        return callPPPI(bus, exclusive, inclusive, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetCPUUsage(@NativeType("FMOD_STUDIO_BUS *") long bus, @Nullable @NativeType("unsigned int *") IntBuffer exclusive, @Nullable @NativeType("unsigned int *") IntBuffer inclusive) {
        if (CHECKS) {
            checkSafe(exclusive, 1);
            checkSafe(inclusive, 1);
        }
        return nFMOD_Studio_Bus_GetCPUUsage(bus, memAddressSafe(exclusive), memAddressSafe(inclusive));
    }

    // --- [ FMOD_Studio_Bus_GetMemoryUsage ] ---

    public static int nFMOD_Studio_Bus_GetMemoryUsage(long bus, long memoryusage) {
        long __functionAddress = Functions.Bus_GetMemoryUsage;
        if (CHECKS) {
            check(bus);
        }
        return callPPI(bus, memoryusage, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bus_GetMemoryUsage(@NativeType("FMOD_STUDIO_BUS *") long bus, @NativeType("FMOD_STUDIO_MEMORY_USAGE *") FMOD_STUDIO_MEMORY_USAGE memoryusage) {
        return nFMOD_Studio_Bus_GetMemoryUsage(bus, memoryusage.address());
    }

    // --- [ FMOD_Studio_VCA_IsValid ] ---

    /** VCA */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_VCA_IsValid(@NativeType("FMOD_STUDIO_VCA *") long vca) {
        long __functionAddress = Functions.VCA_IsValid;
        if (CHECKS) {
            check(vca);
        }
        return callPI(vca, __functionAddress);
    }

    // --- [ FMOD_Studio_VCA_GetID ] ---

    public static int nFMOD_Studio_VCA_GetID(long vca, long id) {
        long __functionAddress = Functions.VCA_GetID;
        if (CHECKS) {
            check(vca);
        }
        return callPPI(vca, id, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_VCA_GetID(@NativeType("FMOD_STUDIO_VCA *") long vca, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        return nFMOD_Studio_VCA_GetID(vca, id.address());
    }

    // --- [ FMOD_Studio_VCA_GetPath ] ---

    public static int nFMOD_Studio_VCA_GetPath(long vca, long path, int size, long retrieved) {
        long __functionAddress = Functions.VCA_GetPath;
        if (CHECKS) {
            check(vca);
        }
        return callPPPI(vca, path, size, retrieved, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_VCA_GetPath(@NativeType("FMOD_STUDIO_VCA *") long vca, @Nullable @NativeType("char *") ByteBuffer path, @Nullable @NativeType("int *") IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_VCA_GetPath(vca, memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_VCA_GetVolume ] ---

    public static int nFMOD_Studio_VCA_GetVolume(long vca, long volume, long finalvolume) {
        long __functionAddress = Functions.VCA_GetVolume;
        if (CHECKS) {
            check(vca);
        }
        return callPPPI(vca, volume, finalvolume, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_VCA_GetVolume(@NativeType("FMOD_STUDIO_VCA *") long vca, @Nullable @NativeType("float *") FloatBuffer volume, @Nullable @NativeType("float *") FloatBuffer finalvolume) {
        if (CHECKS) {
            checkSafe(volume, 1);
            checkSafe(finalvolume, 1);
        }
        return nFMOD_Studio_VCA_GetVolume(vca, memAddressSafe(volume), memAddressSafe(finalvolume));
    }

    // --- [ FMOD_Studio_VCA_SetVolume ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_VCA_SetVolume(@NativeType("FMOD_STUDIO_VCA *") long vca, float volume) {
        long __functionAddress = Functions.VCA_SetVolume;
        if (CHECKS) {
            check(vca);
        }
        return callPI(vca, volume, __functionAddress);
    }

    // --- [ FMOD_Studio_Bank_IsValid ] ---

    /** Bank */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_Bank_IsValid(@NativeType("FMOD_STUDIO_BANK *") long bank) {
        long __functionAddress = Functions.Bank_IsValid;
        if (CHECKS) {
            check(bank);
        }
        return callPI(bank, __functionAddress);
    }

    // --- [ FMOD_Studio_Bank_GetID ] ---

    public static int nFMOD_Studio_Bank_GetID(long bank, long id) {
        long __functionAddress = Functions.Bank_GetID;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, id, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetID(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_GUID *") FMOD_GUID id) {
        return nFMOD_Studio_Bank_GetID(bank, id.address());
    }

    // --- [ FMOD_Studio_Bank_GetPath ] ---

    public static int nFMOD_Studio_Bank_GetPath(long bank, long path, int size, long retrieved) {
        long __functionAddress = Functions.Bank_GetPath;
        if (CHECKS) {
            check(bank);
        }
        return callPPPI(bank, path, size, retrieved, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetPath(@NativeType("FMOD_STUDIO_BANK *") long bank, @Nullable @NativeType("char *") ByteBuffer path, @Nullable @NativeType("int *") IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_Bank_GetPath(bank, memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_Bank_Unload ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_Unload(@NativeType("FMOD_STUDIO_BANK *") long bank) {
        long __functionAddress = Functions.Bank_Unload;
        if (CHECKS) {
            check(bank);
        }
        return callPI(bank, __functionAddress);
    }

    // --- [ FMOD_Studio_Bank_LoadSampleData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_LoadSampleData(@NativeType("FMOD_STUDIO_BANK *") long bank) {
        long __functionAddress = Functions.Bank_LoadSampleData;
        if (CHECKS) {
            check(bank);
        }
        return callPI(bank, __functionAddress);
    }

    // --- [ FMOD_Studio_Bank_UnloadSampleData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_UnloadSampleData(@NativeType("FMOD_STUDIO_BANK *") long bank) {
        long __functionAddress = Functions.Bank_UnloadSampleData;
        if (CHECKS) {
            check(bank);
        }
        return callPI(bank, __functionAddress);
    }

    // --- [ FMOD_Studio_Bank_GetLoadingState ] ---

    public static int nFMOD_Studio_Bank_GetLoadingState(long bank, long state) {
        long __functionAddress = Functions.Bank_GetLoadingState;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, state, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetLoadingState(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_STUDIO_LOADING_STATE *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nFMOD_Studio_Bank_GetLoadingState(bank, memAddress(state));
    }

    // --- [ FMOD_Studio_Bank_GetSampleLoadingState ] ---

    public static int nFMOD_Studio_Bank_GetSampleLoadingState(long bank, long state) {
        long __functionAddress = Functions.Bank_GetSampleLoadingState;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, state, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetSampleLoadingState(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_STUDIO_LOADING_STATE *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nFMOD_Studio_Bank_GetSampleLoadingState(bank, memAddress(state));
    }

    // --- [ FMOD_Studio_Bank_GetStringCount ] ---

    public static int nFMOD_Studio_Bank_GetStringCount(long bank, long count) {
        long __functionAddress = Functions.Bank_GetStringCount;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetStringCount(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_Bank_GetStringCount(bank, memAddress(count));
    }

    // --- [ FMOD_Studio_Bank_GetStringInfo ] ---

    public static int nFMOD_Studio_Bank_GetStringInfo(long bank, int index, long id, long path, int size, long retrieved) {
        long __functionAddress = Functions.Bank_GetStringInfo;
        if (CHECKS) {
            check(bank);
        }
        return callPPPPI(bank, index, id, path, size, retrieved, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetStringInfo(@NativeType("FMOD_STUDIO_BANK *") long bank, int index, @Nullable @NativeType("FMOD_GUID *") FMOD_GUID id, @Nullable @NativeType("char *") ByteBuffer path, @Nullable @NativeType("int *") IntBuffer retrieved) {
        if (CHECKS) {
            checkSafe(retrieved, 1);
        }
        return nFMOD_Studio_Bank_GetStringInfo(bank, index, memAddressSafe(id), memAddressSafe(path), remainingSafe(path), memAddressSafe(retrieved));
    }

    // --- [ FMOD_Studio_Bank_GetEventCount ] ---

    public static int nFMOD_Studio_Bank_GetEventCount(long bank, long count) {
        long __functionAddress = Functions.Bank_GetEventCount;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetEventCount(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_Bank_GetEventCount(bank, memAddress(count));
    }

    // --- [ FMOD_Studio_Bank_GetEventList ] ---

    public static int nFMOD_Studio_Bank_GetEventList(long bank, long array, int capacity, long count) {
        long __functionAddress = Functions.Bank_GetEventList;
        if (CHECKS) {
            check(bank);
        }
        return callPPPI(bank, array, capacity, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetEventList(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_STUDIO_EVENTDESCRIPTION **") PointerBuffer array, @Nullable @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        return nFMOD_Studio_Bank_GetEventList(bank, memAddress(array), array.remaining(), memAddressSafe(count));
    }

    // --- [ FMOD_Studio_Bank_GetBusCount ] ---

    public static int nFMOD_Studio_Bank_GetBusCount(long bank, long count) {
        long __functionAddress = Functions.Bank_GetBusCount;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetBusCount(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_Bank_GetBusCount(bank, memAddress(count));
    }

    // --- [ FMOD_Studio_Bank_GetBusList ] ---

    public static int nFMOD_Studio_Bank_GetBusList(long bank, long array, int capacity, long count) {
        long __functionAddress = Functions.Bank_GetBusList;
        if (CHECKS) {
            check(bank);
        }
        return callPPPI(bank, array, capacity, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetBusList(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_STUDIO_BUS **") PointerBuffer array, @Nullable @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        return nFMOD_Studio_Bank_GetBusList(bank, memAddress(array), array.remaining(), memAddressSafe(count));
    }

    // --- [ FMOD_Studio_Bank_GetVCACount ] ---

    public static int nFMOD_Studio_Bank_GetVCACount(long bank, long count) {
        long __functionAddress = Functions.Bank_GetVCACount;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetVCACount(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_Bank_GetVCACount(bank, memAddress(count));
    }

    // --- [ FMOD_Studio_Bank_GetVCAList ] ---

    public static int nFMOD_Studio_Bank_GetVCAList(long bank, long array, int capacity, long count) {
        long __functionAddress = Functions.Bank_GetVCAList;
        if (CHECKS) {
            check(bank);
        }
        return callPPPI(bank, array, capacity, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetVCAList(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("FMOD_STUDIO_VCA **") PointerBuffer array, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_Bank_GetVCAList(bank, memAddress(array), array.remaining(), memAddress(count));
    }

    // --- [ FMOD_Studio_Bank_GetUserData ] ---

    public static int nFMOD_Studio_Bank_GetUserData(long bank, long userdata) {
        long __functionAddress = Functions.Bank_GetUserData;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_GetUserData(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Studio_Bank_GetUserData(bank, memAddress(userdata));
    }

    // --- [ FMOD_Studio_Bank_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_Bank_SetUserData(@NativeType("FMOD_STUDIO_BANK *") long bank, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.Bank_SetUserData;
        if (CHECKS) {
            check(bank);
        }
        return callPPI(bank, userdata, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_IsValid ] ---

    /** Command playback information */
    @NativeType("FMOD_BOOL")
    public static int FMOD_Studio_CommandReplay_IsValid(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay) {
        long __functionAddress = Functions.CommandReplay_IsValid;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_GetSystem ] ---

    public static int nFMOD_Studio_CommandReplay_GetSystem(long replay, long system) {
        long __functionAddress = Functions.CommandReplay_GetSystem;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, system, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetSystem(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("FMOD_STUDIO_SYSTEM **") PointerBuffer system) {
        if (CHECKS) {
            check(system, 1);
        }
        return nFMOD_Studio_CommandReplay_GetSystem(replay, memAddress(system));
    }

    // --- [ FMOD_Studio_CommandReplay_GetLength ] ---

    public static int nFMOD_Studio_CommandReplay_GetLength(long replay, long length) {
        long __functionAddress = Functions.CommandReplay_GetLength;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, length, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetLength(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("float *") FloatBuffer length) {
        if (CHECKS) {
            check(length, 1);
        }
        return nFMOD_Studio_CommandReplay_GetLength(replay, memAddress(length));
    }

    // --- [ FMOD_Studio_CommandReplay_GetCommandCount ] ---

    public static int nFMOD_Studio_CommandReplay_GetCommandCount(long replay, long count) {
        long __functionAddress = Functions.CommandReplay_GetCommandCount;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, count, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetCommandCount(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nFMOD_Studio_CommandReplay_GetCommandCount(replay, memAddress(count));
    }

    // --- [ FMOD_Studio_CommandReplay_GetCommandInfo ] ---

    public static int nFMOD_Studio_CommandReplay_GetCommandInfo(long replay, int commandindex, long info) {
        long __functionAddress = Functions.CommandReplay_GetCommandInfo;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, commandindex, info, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetCommandInfo(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, int commandindex, @NativeType("FMOD_STUDIO_COMMAND_INFO *") FMOD_STUDIO_COMMAND_INFO info) {
        return nFMOD_Studio_CommandReplay_GetCommandInfo(replay, commandindex, info.address());
    }

    // --- [ FMOD_Studio_CommandReplay_GetCommandString ] ---

    public static int nFMOD_Studio_CommandReplay_GetCommandString(long replay, int commandindex, long buffer, int length) {
        long __functionAddress = Functions.CommandReplay_GetCommandString;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, commandindex, buffer, length, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetCommandString(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, int commandindex, @NativeType("char *") ByteBuffer buffer) {
        return nFMOD_Studio_CommandReplay_GetCommandString(replay, commandindex, memAddress(buffer), buffer.remaining());
    }

    // --- [ FMOD_Studio_CommandReplay_GetCommandAtTime ] ---

    public static int nFMOD_Studio_CommandReplay_GetCommandAtTime(long replay, float time, long commandindex) {
        long __functionAddress = Functions.CommandReplay_GetCommandAtTime;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, time, commandindex, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetCommandAtTime(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, float time, @NativeType("int *") IntBuffer commandindex) {
        if (CHECKS) {
            check(commandindex, 1);
        }
        return nFMOD_Studio_CommandReplay_GetCommandAtTime(replay, time, memAddress(commandindex));
    }

    // --- [ FMOD_Studio_CommandReplay_SetBankPath ] ---

    public static int nFMOD_Studio_CommandReplay_SetBankPath(long replay, long bankPath) {
        long __functionAddress = Functions.CommandReplay_SetBankPath;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, bankPath, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetBankPath(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("char const *") ByteBuffer bankPath) {
        if (CHECKS) {
            checkNT1(bankPath);
        }
        return nFMOD_Studio_CommandReplay_SetBankPath(replay, memAddress(bankPath));
    }

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

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_Start(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay) {
        long __functionAddress = Functions.CommandReplay_Start;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_Stop ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_Stop(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay) {
        long __functionAddress = Functions.CommandReplay_Stop;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_SeekToTime ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SeekToTime(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, float time) {
        long __functionAddress = Functions.CommandReplay_SeekToTime;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, time, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_SeekToCommand ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SeekToCommand(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, int commandindex) {
        long __functionAddress = Functions.CommandReplay_SeekToCommand;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, commandindex, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_GetPaused ] ---

    public static int nFMOD_Studio_CommandReplay_GetPaused(long replay, long paused) {
        long __functionAddress = Functions.CommandReplay_GetPaused;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, paused, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetPaused(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("FMOD_BOOL *") IntBuffer paused) {
        if (CHECKS) {
            check(paused, 1);
        }
        return nFMOD_Studio_CommandReplay_GetPaused(replay, memAddress(paused));
    }

    // --- [ FMOD_Studio_CommandReplay_SetPaused ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetPaused(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("FMOD_BOOL") int paused) {
        long __functionAddress = Functions.CommandReplay_SetPaused;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, paused, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_GetPlaybackState ] ---

    public static int nFMOD_Studio_CommandReplay_GetPlaybackState(long replay, long state) {
        long __functionAddress = Functions.CommandReplay_GetPlaybackState;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, state, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetPlaybackState(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("FMOD_STUDIO_PLAYBACK_STATE *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nFMOD_Studio_CommandReplay_GetPlaybackState(replay, memAddress(state));
    }

    // --- [ FMOD_Studio_CommandReplay_GetCurrentCommand ] ---

    public static int nFMOD_Studio_CommandReplay_GetCurrentCommand(long replay, long commandindex, long currenttime) {
        long __functionAddress = Functions.CommandReplay_GetCurrentCommand;
        if (CHECKS) {
            check(replay);
        }
        return callPPPI(replay, commandindex, currenttime, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetCurrentCommand(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @Nullable @NativeType("int *") IntBuffer commandindex, @Nullable @NativeType("float *") FloatBuffer currenttime) {
        if (CHECKS) {
            checkSafe(commandindex, 1);
            checkSafe(currenttime, 1);
        }
        return nFMOD_Studio_CommandReplay_GetCurrentCommand(replay, memAddressSafe(commandindex), memAddressSafe(currenttime));
    }

    // --- [ FMOD_Studio_CommandReplay_Release ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_Release(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay) {
        long __functionAddress = Functions.CommandReplay_Release;
        if (CHECKS) {
            check(replay);
        }
        return callPI(replay, __functionAddress);
    }

    // --- [ FMOD_Studio_CommandReplay_SetFrameCallback ] ---

    public static int nFMOD_Studio_CommandReplay_SetFrameCallback(long replay, long callback) {
        long __functionAddress = Functions.CommandReplay_SetFrameCallback;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, callback, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetFrameCallback(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @Nullable @NativeType("FMOD_STUDIO_COMMANDREPLAY_FRAME_CALLBACK") FMOD_STUDIO_COMMANDREPLAY_FRAME_CALLBACKI callback) {
        return nFMOD_Studio_CommandReplay_SetFrameCallback(replay, memAddressSafe(callback));
    }

    // --- [ FMOD_Studio_CommandReplay_SetLoadBankCallback ] ---

    public static int nFMOD_Studio_CommandReplay_SetLoadBankCallback(long replay, long callback) {
        long __functionAddress = Functions.CommandReplay_SetLoadBankCallback;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, callback, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetLoadBankCallback(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @Nullable @NativeType("FMOD_STUDIO_COMMANDREPLAY_LOAD_BANK_CALLBACK") FMOD_STUDIO_COMMANDREPLAY_LOAD_BANK_CALLBACKI callback) {
        return nFMOD_Studio_CommandReplay_SetLoadBankCallback(replay, memAddressSafe(callback));
    }

    // --- [ FMOD_Studio_CommandReplay_SetCreateInstanceCallback ] ---

    public static int nFMOD_Studio_CommandReplay_SetCreateInstanceCallback(long replay, long callback) {
        long __functionAddress = Functions.CommandReplay_SetCreateInstanceCallback;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, callback, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetCreateInstanceCallback(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @Nullable @NativeType("FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK") FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACKI callback) {
        return nFMOD_Studio_CommandReplay_SetCreateInstanceCallback(replay, memAddressSafe(callback));
    }

    // --- [ FMOD_Studio_CommandReplay_GetUserData ] ---

    public static int nFMOD_Studio_CommandReplay_GetUserData(long replay, long userdata) {
        long __functionAddress = Functions.CommandReplay_GetUserData;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, userdata, __functionAddress);
    }

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_GetUserData(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("void **") PointerBuffer userdata) {
        if (CHECKS) {
            check(userdata, 1);
        }
        return nFMOD_Studio_CommandReplay_GetUserData(replay, memAddress(userdata));
    }

    // --- [ FMOD_Studio_CommandReplay_SetUserData ] ---

    @NativeType("FMOD_RESULT")
    public static int FMOD_Studio_CommandReplay_SetUserData(@NativeType("FMOD_STUDIO_COMMANDREPLAY *") long replay, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.CommandReplay_SetUserData;
        if (CHECKS) {
            check(replay);
        }
        return callPPI(replay, userdata, __functionAddress);
    }

}