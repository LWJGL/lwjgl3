/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package fmod.templates

import org.lwjgl.generator.*
import fmod.*

val FMODStudio = "FMODStudio".nativeClass(
    Module.FMOD,
    prefix = "FMOD_STUDIO",
    prefixMethod = "FMOD_Studio_",
    binding = simpleBinding(Module.FMOD, libraryName = "FMODSTUDIO", libraryExpression = "Configuration.FMOD_STUDIO_LIBRARY_NAME, \"fmodstudio\"")
) {

    IntConstant("", "LOAD_MEMORY_ALIGNMENT".."32")

    IntConstant("", "INIT_NORMAL"..0x00000000)
    IntConstant("", "INIT_LIVEUPDATE"..0x00000001)
    IntConstant("", "INIT_ALLOW_MISSING_PLUGINS"..0x00000002)
    IntConstant("", "INIT_SYNCHRONOUS_UPDATE"..0x00000004)
    IntConstant("", "INIT_DEFERRED_CALLBACKS"..0x00000008)
    IntConstant("", "INIT_LOAD_FROM_UPDATE"..0x00000010)
    IntConstant("", "INIT_MEMORY_TRACKING"..0x00000020)

    IntConstant("", "PARAMETER_READONLY"..0x00000001)
    IntConstant("", "PARAMETER_AUTOMATIC"..0x00000002)
    IntConstant("", "PARAMETER_GLOBAL"..0x00000004)
    IntConstant("", "PARAMETER_DISCRETE"..0x00000008)
    IntConstant("", "PARAMETER_LABELED"..0x00000010)

    IntConstant("", "SYSTEM_CALLBACK_PREUPDATE"..0x00000001)
    IntConstant("", "SYSTEM_CALLBACK_POSTUPDATE"..0x00000002)
    IntConstant("", "SYSTEM_CALLBACK_BANK_UNLOAD"..0x00000004)
    IntConstant("", "SYSTEM_CALLBACK_LIVEUPDATE_CONNECTED"..0x00000008)
    IntConstant("", "SYSTEM_CALLBACK_LIVEUPDATE_DISCONNECTED"..0x00000010)
    IntConstant("", "SYSTEM_CALLBACK_ALL"..0xFFFFFFFF.i)

    IntConstant("", "EVENT_CALLBACK_CREATED"..0x00000001)
    IntConstant("", "EVENT_CALLBACK_DESTROYED"..0x00000002)
    IntConstant("", "EVENT_CALLBACK_STARTING"..0x00000004)
    IntConstant("", "EVENT_CALLBACK_STARTED"..0x00000008)
    IntConstant("", "EVENT_CALLBACK_RESTARTED"..0x00000010)
    IntConstant("", "EVENT_CALLBACK_STOPPED"..0x00000020)
    IntConstant("", "EVENT_CALLBACK_START_FAILED"..0x00000040)
    IntConstant("", "EVENT_CALLBACK_CREATE_PROGRAMMER_SOUND"..0x00000080)
    IntConstant("", "EVENT_CALLBACK_DESTROY_PROGRAMMER_SOUND"..0x00000100)
    IntConstant("", "EVENT_CALLBACK_PLUGIN_CREATED"..0x00000200)
    IntConstant("", "EVENT_CALLBACK_PLUGIN_DESTROYED"..0x00000400)
    IntConstant("", "EVENT_CALLBACK_TIMELINE_MARKER"..0x00000800)
    IntConstant("", "EVENT_CALLBACK_TIMELINE_BEAT"..0x00001000)
    IntConstant("", "EVENT_CALLBACK_SOUND_PLAYED"..0x00002000)
    IntConstant("", "EVENT_CALLBACK_SOUND_STOPPED"..0x00004000)
    IntConstant("", "EVENT_CALLBACK_REAL_TO_VIRTUAL"..0x00008000)
    IntConstant("", "EVENT_CALLBACK_VIRTUAL_TO_REAL"..0x00010000)
    IntConstant("", "EVENT_CALLBACK_START_EVENT_COMMAND"..0x00020000)
    IntConstant("", "EVENT_CALLBACK_NESTED_TIMELINE_BEAT"..0x00040000)
    IntConstant("", "EVENT_CALLBACK_ALL"..0xFFFFFFFF.i)

    IntConstant("", "LOAD_BANK_NORMAL"..0x00000000)
    IntConstant("", "LOAD_BANK_NONBLOCKING"..0x00000001)
    IntConstant("", "LOAD_BANK_DECOMPRESS_SAMPLES"..0x00000002)
    IntConstant("", "LOAD_BANK_UNENCRYPTED"..0x00000004)

    IntConstant("", "COMMANDCAPTURE_NORMAL"..0x00000000)
    IntConstant("", "COMMANDCAPTURE_FILEFLUSH"..0x00000001)
    IntConstant("", "COMMANDCAPTURE_SKIP_INITIAL_STATE"..0x00000002)

    IntConstant("", "COMMANDREPLAY_NORMAL"..0x00000000)
    IntConstant("", "COMMANDREPLAY_SKIP_CLEANUP"..0x00000001)
    IntConstant("", "COMMANDREPLAY_FAST_FORWARD"..0x00000002)
    IntConstant("", "COMMANDREPLAY_SKIP_BANK_LOAD"..0x00000004)

    EnumConstant(
        "{@code FMOD_STUDIO_LOADING_STATE}",

        "LOADING_STATE_UNLOADING".enum("", "0"),
        "LOADING_STATE_UNLOADED".enum,
        "LOADING_STATE_LOADING".enum,
        "LOADING_STATE_LOADED".enum,
        "LOADING_STATE_ERROR".enum
    )

    EnumConstant(
        "{@code FMOD_STUDIO_LOAD_MEMORY_MODE}",

        "LOAD_MEMORY".enum("", "0"),
        "LOAD_MEMORY_POINT".enum
    )

    EnumConstant(
        "{@code FMOD_STUDIO_PARAMETER_TYPE}",

        "PARAMETER_GAME_CONTROLLED".enum("", "0"),
        "PARAMETER_AUTOMATIC_DISTANCE".enum,
        "PARAMETER_AUTOMATIC_EVENT_CONE_ANGLE".enum,
        "PARAMETER_AUTOMATIC_EVENT_ORIENTATION".enum,
        "PARAMETER_AUTOMATIC_DIRECTION".enum,
        "PARAMETER_AUTOMATIC_ELEVATION".enum,
        "PARAMETER_AUTOMATIC_LISTENER_ORIENTATION".enum,
        "PARAMETER_AUTOMATIC_SPEED".enum,
        "PARAMETER_AUTOMATIC_SPEED_ABSOLUTE".enum,
        "PARAMETER_AUTOMATIC_DISTANCE_NORMALIZED".enum,
        "PARAMETER_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_STUDIO_USER_PROPERTY_TYPE}",

        "USER_PROPERTY_TYPE_INTEGER".enum("", "0"),
        "USER_PROPERTY_TYPE_BOOLEAN".enum,
        "USER_PROPERTY_TYPE_FLOAT".enum,
        "USER_PROPERTY_TYPE_STRING".enum
    )

    EnumConstant(
        "{@code FMOD_STUDIO_EVENT_PROPERTY}",

        "EVENT_PROPERTY_CHANNELPRIORITY".enum("", "0"),
        "EVENT_PROPERTY_SCHEDULE_DELAY".enum,
        "EVENT_PROPERTY_SCHEDULE_LOOKAHEAD".enum,
        "EVENT_PROPERTY_MINIMUM_DISTANCE".enum,
        "EVENT_PROPERTY_MAXIMUM_DISTANCE".enum,
        "EVENT_PROPERTY_COOLDOWN".enum,
        "EVENT_PROPERTY_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_STUDIO_PLAYBACK_STATE}",

        "PLAYBACK_PLAYING".enum("", "0"),
        "PLAYBACK_SUSTAINING".enum,
        "PLAYBACK_STOPPED".enum,
        "PLAYBACK_STARTING".enum,
        "PLAYBACK_STOPPING".enum
    )

    EnumConstant(
        "{@code FMOD_STUDIO_STOP_MODE}",

        "STOP_ALLOWFADEOUT".enum("", "0"),
        "STOP_IMMEDIATE".enum
    )

    EnumConstant(
        "{@code FMOD_STUDIO_INSTANCETYPE}",

        "INSTANCETYPE_NONE".enum("", "0"),
        "INSTANCETYPE_SYSTEM".enum,
        "INSTANCETYPE_EVENTDESCRIPTION".enum,
        "INSTANCETYPE_EVENTINSTANCE".enum,
        "INSTANCETYPE_PARAMETERINSTANCE".enum,
        "INSTANCETYPE_BUS".enum,
        "INSTANCETYPE_VCA".enum,
        "INSTANCETYPE_BANK".enum,
        "INSTANCETYPE_COMMANDREPLAY".enum
    )

    FMOD_RESULT(
        "ParseID",
        "Global",

        charUTF8.const.p("idstring", ""),
        FMOD_GUID.p("id", "")
    )

    FMOD_RESULT(
        "System_Create",
        "",

        Check(1)..FMOD_STUDIO_SYSTEM.p.p("system", ""),
        unsigned_int("headerversion", "")
    )

    FMOD_BOOL(
        "System_IsValid",
        "System",

        FMOD_STUDIO_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_SetAdvancedSettings",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_ADVANCEDSETTINGS.p("settings", "")
    )

    FMOD_RESULT(
        "System_GetAdvancedSettings",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_ADVANCEDSETTINGS.p("settings", "")
    )

    FMOD_RESULT(
        "System_Initialize",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        int("maxchannels", ""),
        FMOD_STUDIO_INITFLAGS("studioflags", ""),
        FMOD_INITFLAGS("flags", ""),
        nullable..opaque_p("extradriverdata", "")
    )

    FMOD_RESULT(
        "System_Release",
        "",

        FMOD_STUDIO_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_Update",
        "",

        FMOD_STUDIO_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_GetCoreSystem",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        Check(1)..FMOD_SYSTEM.p.p("coresystem", "")
    )

    FMOD_RESULT(
        "System_GetEvent",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("pathOrID", ""),
        Check(1)..FMOD_STUDIO_EVENTDESCRIPTION.p.p("event", "")
    )

    FMOD_RESULT(
        "System_GetBus",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("pathOrID", ""),
        Check(1)..FMOD_STUDIO_BUS.p.p("bus", "")
    )

    FMOD_RESULT(
        "System_GetVCA",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("pathOrID", ""),
        Check(1)..FMOD_STUDIO_VCA.p.p("vca", "")
    )

    FMOD_RESULT(
        "System_GetBank",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("pathOrID", ""),
        Check(1)..FMOD_STUDIO_BANK.p.p("bank", "")
    )

    FMOD_RESULT(
        "System_GetEventByID",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_GUID.const.p("id", ""),
        Check(1)..FMOD_STUDIO_EVENTDESCRIPTION.p.p("event", "")
    )

    FMOD_RESULT(
        "System_GetBusByID",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_GUID.const.p("id", ""),
        Check(1)..FMOD_STUDIO_BUS.p.p("bus", "")
    )

    FMOD_RESULT(
        "System_GetVCAByID",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_GUID.const.p("id", ""),
        Check(1)..FMOD_STUDIO_VCA.p.p("vca", "")
    )

    FMOD_RESULT(
        "System_GetBankByID",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_GUID.const.p("id", ""),
        Check(1)..FMOD_STUDIO_BANK.p.p("bank", "")
    )

    FMOD_RESULT(
        "System_GetSoundInfo",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("key", ""),
        FMOD_STUDIO_SOUND_INFO.p("info", "")
    )

    FMOD_RESULT(
        "System_GetParameterDescriptionByName",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("name", ""),
        FMOD_STUDIO_PARAMETER_DESCRIPTION.p("parameter", "")
    )

    FMOD_RESULT(
        "System_GetParameterDescriptionByID",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_PARAMETER_ID("id", ""),
        FMOD_STUDIO_PARAMETER_DESCRIPTION.p("parameter", "")
    )

    FMOD_RESULT(
        "System_GetParameterLabelByName",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("name", ""),
        int("labelindex", ""),
        nullable..char.p("label", ""),
        AutoSize("label")..int("size", ""),
        nullable..Check(1)..int.p("retrieved", "")
    )

    FMOD_RESULT(
        "System_GetParameterLabelByID",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_PARAMETER_ID("id", ""),
        int("labelindex", ""),
        nullable..char.p("label", ""),
        AutoSize("label")..int("size", ""),
        nullable..Check(1)..int.p("retrieved", "")
    )

    FMOD_RESULT(
        "System_GetParameterByID",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_PARAMETER_ID("id", ""),
        nullable..Check(1)..float.p("value", ""),
        nullable..Check(1)..float.p("finalvalue", "")
    )

    FMOD_RESULT(
        "System_SetParameterByID",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_PARAMETER_ID("id", ""),
        float("value", ""),
        FMOD_BOOL("ignoreseekspeed", "")
    )

    FMOD_RESULT(
        "System_SetParameterByIDWithLabel",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_PARAMETER_ID("id", ""),
        charUTF8.const.p("label", ""),
        FMOD_BOOL("ignoreseekspeed", "")
    )

    FMOD_RESULT(
        "System_SetParametersByIDs",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_PARAMETER_ID.const.p("ids", ""),
        float.p("values", ""),
        AutoSize("values")..int("count", ""),
        FMOD_BOOL("ignoreseekspeed", "")
    )

    FMOD_RESULT(
        "System_GetParameterByName",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("name", ""),
        nullable..Check(1)..float.p("value", ""),
        nullable..Check(1)..float.p("finalvalue", "")
    )

    FMOD_RESULT(
        "System_SetParameterByName",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("name", ""),
        float("value", ""),
        FMOD_BOOL("ignoreseekspeed", "")
    )

    FMOD_RESULT(
        "System_SetParameterByNameWithLabel",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("name", ""),
        charUTF8.const.p("label", ""),
        FMOD_BOOL("ignoreseekspeed", "")
    )

    FMOD_RESULT(
        "System_LookupID",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("path", ""),
        FMOD_GUID.p("id", "")
    )

    FMOD_RESULT(
        "System_LookupPath",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_GUID.const.p("id", ""),
        nullable..char.p("path", ""),
        AutoSize("path")..int("size", ""),
        nullable..Check(1)..int.p("retrieved", "")
    )

    FMOD_RESULT(
        "System_GetNumListeners",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        Check(1)..int.p("numlisteners", "")
    )

    FMOD_RESULT(
        "System_SetNumListeners",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        int("numlisteners", "")
    )

    FMOD_RESULT(
        "System_GetListenerAttributes",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        int("index", ""),
        FMOD_3D_ATTRIBUTES.p("attributes", ""),
        nullable..FMOD_VECTOR.p("attenuationposition", "")
    )

    FMOD_RESULT(
        "System_SetListenerAttributes",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        int("index", ""),
        FMOD_3D_ATTRIBUTES.const.p("attributes", ""),
        nullable..FMOD_VECTOR.const.p("attenuationposition", "")
    )

    FMOD_RESULT(
        "System_GetListenerWeight",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        int("index", ""),
        Check(1)..float.p("weight", "")
    )

    FMOD_RESULT(
        "System_SetListenerWeight",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        int("index", ""),
        float("weight", "")
    )

    FMOD_RESULT(
        "System_LoadBankFile",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("filename", ""),
        FMOD_STUDIO_LOAD_BANK_FLAGS("flags", ""),
        Check(1)..FMOD_STUDIO_BANK.p.p("bank", "")
    )

    FMOD_RESULT(
        "System_LoadBankMemory",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        char.const.p("buffer", ""),
        AutoSize("buffer")..int("length", ""),
        FMOD_STUDIO_LOAD_MEMORY_MODE("mode", ""),
        FMOD_STUDIO_LOAD_BANK_FLAGS("flags", ""),
        Check(1)..FMOD_STUDIO_BANK.p.p("bank", "")
    )

    FMOD_RESULT(
        "System_LoadBankCustom",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_BANK_INFO.const.p("info", ""),
        FMOD_STUDIO_LOAD_BANK_FLAGS("flags", ""),
        Check(1)..FMOD_STUDIO_BANK.p.p("bank", "")
    )

    FMOD_RESULT(
        "System_RegisterPlugin",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_DSP_DESCRIPTION.const.p("description", "")
    )

    FMOD_RESULT(
        "System_UnregisterPlugin",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("name", "")
    )

    FMOD_RESULT(
        "System_UnloadAll",
        "",

        FMOD_STUDIO_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_FlushCommands",
        "",

        FMOD_STUDIO_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_FlushSampleLoading",
        "",

        FMOD_STUDIO_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_StartCommandCapture",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("filename", ""),
        FMOD_STUDIO_COMMANDCAPTURE_FLAGS("flags", "")
    )

    FMOD_RESULT(
        "System_StopCommandCapture",
        "",

        FMOD_STUDIO_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_LoadCommandReplay",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        charUTF8.const.p("filename", ""),
        FMOD_STUDIO_COMMANDREPLAY_FLAGS("flags", ""),
        Check(1)..FMOD_STUDIO_COMMANDREPLAY.p.p("replay", "")
    )

    FMOD_RESULT(
        "System_GetBankCount",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "System_GetBankList",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_BANK.p.p("array", ""),
        AutoSize("array")..int("capacity", ""),
        nullable..Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "System_GetParameterDescriptionCount",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "System_GetParameterDescriptionList",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_PARAMETER_DESCRIPTION.p("array", ""),
        AutoSize("array")..int("capacity", ""),
        nullable..Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "System_GetCPUUsage",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        nullable..FMOD_STUDIO_CPU_USAGE.p("usage", ""),
        nullable..FMOD_CPU_USAGE.p("usage_core", "")
    )

    FMOD_RESULT(
        "System_GetBufferUsage",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_BUFFER_USAGE.p("usage", "")
    )

    FMOD_RESULT(
        "System_ResetBufferUsage",
        "",

        FMOD_STUDIO_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_SetCallback",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        nullable..FMOD_STUDIO_SYSTEM_CALLBACK("callback", ""),
        FMOD_STUDIO_SYSTEM_CALLBACK_TYPE("callbackmask", "")
    )

    FMOD_RESULT(
        "System_SetUserData",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_RESULT(
        "System_GetUserData",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "System_GetMemoryUsage",
        "",

        FMOD_STUDIO_SYSTEM.p("system", ""),
        FMOD_STUDIO_MEMORY_USAGE.p("memoryusage", "")
    )

    FMOD_BOOL(
        "EventDescription_IsValid",
        "EventDescription",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", "")
    )

    FMOD_RESULT(
        "EventDescription_GetID",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        FMOD_GUID.p("id", "")
    )

    FMOD_RESULT(
        "EventDescription_GetPath",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        nullable..char.p("path", ""),
        AutoSize("path")..int("size", ""),
        nullable..Check(1)..int.p("retrieved", "")
    )

    FMOD_RESULT(
        "EventDescription_GetParameterDescriptionCount",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "EventDescription_GetParameterDescriptionByIndex",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        int("index", ""),
        FMOD_STUDIO_PARAMETER_DESCRIPTION.p("parameter", "")
    )

    FMOD_RESULT(
        "EventDescription_GetParameterDescriptionByName",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        charUTF8.const.p("name", ""),
        FMOD_STUDIO_PARAMETER_DESCRIPTION.p("parameter", "")
    )

    FMOD_RESULT(
        "EventDescription_GetParameterDescriptionByID",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        FMOD_STUDIO_PARAMETER_ID("id", ""),
        FMOD_STUDIO_PARAMETER_DESCRIPTION.p("parameter", "")
    )

    FMOD_RESULT(
        "EventDescription_GetParameterLabelByIndex",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        int("index", ""),
        int("labelindex", ""),
        nullable..char.p("label", ""),
        AutoSize("label")..int("size", ""),
        nullable..Check(1)..int.p("retrieved", "")
    )

    FMOD_RESULT(
        "EventDescription_GetParameterLabelByName",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        charUTF8.const.p("name", ""),
        int("labelindex", ""),
        nullable..char.p("label", ""),
        AutoSize("label")..int("size", ""),
        nullable..Check(1)..int.p("retrieved", "")
    )

    FMOD_RESULT(
        "EventDescription_GetParameterLabelByID",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        FMOD_STUDIO_PARAMETER_ID("id", ""),
        int("labelindex", ""),
        nullable..char.p("label", ""),
        AutoSize("label")..int("size", ""),
        nullable..Check(1)..int.p("retrieved", "")
    )

    FMOD_RESULT(
        "EventDescription_GetUserPropertyCount",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "EventDescription_GetUserPropertyByIndex",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        int("index", ""),
        FMOD_STUDIO_USER_PROPERTY.p("property", "")
    )

    FMOD_RESULT(
        "EventDescription_GetUserProperty",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        charUTF8.const.p("name", ""),
        FMOD_STUDIO_USER_PROPERTY.p("property", "")
    )

    FMOD_RESULT(
        "EventDescription_GetLength",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..int.p("length", "")
    )

    FMOD_RESULT(
        "EventDescription_GetMinMaxDistance",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        nullable..Check(1)..float.p("min", ""),
        nullable..Check(1)..float.p("max", "")
    )

    FMOD_RESULT(
        "EventDescription_GetSoundSize",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..float.p("size", "")
    )

    FMOD_RESULT(
        "EventDescription_IsSnapshot",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..FMOD_BOOL.p("snapshot", "")
    )

    FMOD_RESULT(
        "EventDescription_IsOneshot",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..FMOD_BOOL.p("oneshot", "")
    )

    FMOD_RESULT(
        "EventDescription_IsStream",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..FMOD_BOOL.p("isStream", "")
    )

    FMOD_RESULT(
        "EventDescription_Is3D",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..FMOD_BOOL.p("is3D", "")
    )

    FMOD_RESULT(
        "EventDescription_IsDopplerEnabled",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..FMOD_BOOL.p("doppler", "")
    )

    FMOD_RESULT(
        "EventDescription_HasSustainPoint",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..FMOD_BOOL.p("sustainPoint", "")
    )

    FMOD_RESULT(
        "EventDescription_CreateInstance",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..FMOD_STUDIO_EVENTINSTANCE.p.p("instance", "")
    )

    FMOD_RESULT(
        "EventDescription_GetInstanceCount",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "EventDescription_GetInstanceList",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        FMOD_STUDIO_EVENTINSTANCE.p.p("array", ""),
        AutoSize("array")..int("capacity", ""),
        nullable..Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "EventDescription_LoadSampleData",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", "")
    )

    FMOD_RESULT(
        "EventDescription_UnloadSampleData",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", "")
    )

    FMOD_RESULT(
        "EventDescription_GetSampleLoadingState",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..FMOD_STUDIO_LOADING_STATE.p("state", "")
    )

    FMOD_RESULT(
        "EventDescription_ReleaseAllInstances",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", "")
    )

    FMOD_RESULT(
        "EventDescription_SetCallback",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        nullable..FMOD_STUDIO_EVENT_CALLBACK("callback", ""),
        FMOD_STUDIO_EVENT_CALLBACK_TYPE("callbackmask", "")
    )

    FMOD_RESULT(
        "EventDescription_GetUserData",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "EventDescription_SetUserData",
        "",

        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_BOOL(
        "EventInstance_IsValid",
        "EventInstance",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", "")
    )

    FMOD_RESULT(
        "EventInstance_GetDescription",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        Check(1)..FMOD_STUDIO_EVENTDESCRIPTION.p.p("description", "")
    )

    FMOD_RESULT(
        "EventInstance_GetVolume",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        nullable..Check(1)..float.p("volume", ""),
        nullable..Check(1)..float.p("finalvolume", "")
    )

    FMOD_RESULT(
        "EventInstance_SetVolume",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        float("volume", "")
    )

    FMOD_RESULT(
        "EventInstance_GetPitch",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        nullable..Check(1)..float.p("pitch", ""),
        nullable..Check(1)..float.p("finalpitch", "")
    )

    FMOD_RESULT(
        "EventInstance_SetPitch",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        float("pitch", "")
    )

    FMOD_RESULT(
        "EventInstance_Get3DAttributes",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        FMOD_3D_ATTRIBUTES.p("attributes", "")
    )

    FMOD_RESULT(
        "EventInstance_Set3DAttributes",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        FMOD_3D_ATTRIBUTES.p("attributes", "")
    )

    FMOD_RESULT(
        "EventInstance_GetListenerMask",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        Check(1)..unsigned_int.p("mask", "")
    )

    FMOD_RESULT(
        "EventInstance_SetListenerMask",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        unsigned_int("mask", "")
    )

    FMOD_RESULT(
        "EventInstance_GetProperty",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        FMOD_STUDIO_EVENT_PROPERTY("index", ""),
        Check(1)..float.p("value", "")
    )

    FMOD_RESULT(
        "EventInstance_SetProperty",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        FMOD_STUDIO_EVENT_PROPERTY("index", ""),
        float("value", "")
    )

    FMOD_RESULT(
        "EventInstance_GetReverbLevel",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        int("index", ""),
        Check(1)..float.p("level", "")
    )

    FMOD_RESULT(
        "EventInstance_SetReverbLevel",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        int("index", ""),
        float("level", "")
    )

    FMOD_RESULT(
        "EventInstance_GetPaused",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        Check(1)..FMOD_BOOL.p("paused", "")
    )

    FMOD_RESULT(
        "EventInstance_SetPaused",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        FMOD_BOOL("paused", "")
    )

    FMOD_RESULT(
        "EventInstance_Start",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", "")
    )

    FMOD_RESULT(
        "EventInstance_Stop",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        FMOD_STUDIO_STOP_MODE("mode", "")
    )

    FMOD_RESULT(
        "EventInstance_GetTimelinePosition",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        Check(1)..int.p("position", "")
    )

    FMOD_RESULT(
        "EventInstance_SetTimelinePosition",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        int("position", "")
    )

    FMOD_RESULT(
        "EventInstance_GetPlaybackState",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        Check(1)..FMOD_STUDIO_PLAYBACK_STATE.p("state", "")
    )

    FMOD_RESULT(
        "EventInstance_GetChannelGroup",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        Check(1)..FMOD_CHANNELGROUP.p.p("group", "")
    )

    FMOD_RESULT(
        "EventInstance_GetMinMaxDistance",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        nullable..Check(1)..float.p("min", ""),
        nullable..Check(1)..float.p("max", "")
    )

    FMOD_RESULT(
        "EventInstance_Release",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", "")
    )

    FMOD_RESULT(
        "EventInstance_IsVirtual",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        Check(1)..FMOD_BOOL.p("virtualstate", "")
    )

    FMOD_RESULT(
        "EventInstance_GetParameterByName",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        charUTF8.const.p("name", ""),
        nullable..Check(1)..float.p("value", ""),
        nullable..Check(1)..float.p("finalvalue", "")
    )

    FMOD_RESULT(
        "EventInstance_SetParameterByName",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        charUTF8.const.p("name", ""),
        float("value", ""),
        FMOD_BOOL("ignoreseekspeed", "")
    )

    FMOD_RESULT(
        "EventInstance_SetParameterByNameWithLabel",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        charUTF8.const.p("name", ""),
        charUTF8.const.p("label", ""),
        FMOD_BOOL("ignoreseekspeed", "")
    )

    FMOD_RESULT(
        "EventInstance_GetParameterByID",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        FMOD_STUDIO_PARAMETER_ID("id", ""),
        nullable..Check(1)..float.p("value", ""),
        nullable..Check(1)..float.p("finalvalue", "")
    )

    FMOD_RESULT(
        "EventInstance_SetParameterByID",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        FMOD_STUDIO_PARAMETER_ID("id", ""),
        float("value", ""),
        FMOD_BOOL("ignoreseekspeed", "")
    )

    FMOD_RESULT(
        "EventInstance_SetParameterByIDWithLabel",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        FMOD_STUDIO_PARAMETER_ID("id", ""),
        charUTF8.const.p("label", ""),
        FMOD_BOOL("ignoreseekspeed", "")
    )

    FMOD_RESULT(
        "EventInstance_SetParametersByIDs",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        FMOD_STUDIO_PARAMETER_ID.const.p("ids", ""),
        float.p("values", ""),
        AutoSize("values")..int("count", ""),
        FMOD_BOOL("ignoreseekspeed", "")
    )

    FMOD_RESULT(
        "EventInstance_KeyOff",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", "")
    )

    FMOD_RESULT(
        "EventInstance_SetCallback",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        nullable..FMOD_STUDIO_EVENT_CALLBACK("callback", ""),
        FMOD_STUDIO_EVENT_CALLBACK_TYPE("callbackmask", "")
    )

    FMOD_RESULT(
        "EventInstance_GetUserData",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "EventInstance_SetUserData",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_RESULT(
        "EventInstance_GetCPUUsage",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        nullable..Check(1)..unsigned_int.p("exclusive", ""),
        nullable..Check(1)..unsigned_int.p("inclusive", "")
    )

    FMOD_RESULT(
        "EventInstance_GetMemoryUsage",
        "",

        FMOD_STUDIO_EVENTINSTANCE.p("eventinstance", ""),
        FMOD_STUDIO_MEMORY_USAGE.p("memoryusage", "")
    )

    FMOD_BOOL(
        "Bus_IsValid",
        "Bus",

        FMOD_STUDIO_BUS.p("bus", "")
    )

    FMOD_RESULT(
        "Bus_GetID",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        FMOD_GUID.p("id", "")
    )

    FMOD_RESULT(
        "Bus_GetPath",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        nullable..char.p("path", ""),
        AutoSize("path")..int("size", ""),
        nullable..Check(1)..int.p("retrieved", "")
    )

    FMOD_RESULT(
        "Bus_GetVolume",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        nullable..Check(1)..float.p("volume", ""),
        nullable..Check(1)..float.p("finalvolume", "")
    )

    FMOD_RESULT(
        "Bus_SetVolume",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        float("volume", "")
    )

    FMOD_RESULT(
        "Bus_GetPaused",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        Check(1)..FMOD_BOOL.p("paused", "")
    )

    FMOD_RESULT(
        "Bus_SetPaused",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        FMOD_BOOL("paused", "")
    )

    FMOD_RESULT(
        "Bus_GetMute",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        Check(1)..FMOD_BOOL.p("mute", "")
    )

    FMOD_RESULT(
        "Bus_SetMute",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        FMOD_BOOL("mute", "")
    )

    FMOD_RESULT(
        "Bus_StopAllEvents",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        FMOD_STUDIO_STOP_MODE("mode", "")
    )

    FMOD_RESULT(
        "Bus_GetPortIndex",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        Check(1)..FMOD_PORT_INDEX.p("index", "")
    )

    FMOD_RESULT(
        "Bus_SetPortIndex",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        FMOD_PORT_INDEX("index", "")
    )

    FMOD_RESULT(
        "Bus_LockChannelGroup",
        "",

        FMOD_STUDIO_BUS.p("bus", "")
    )

    FMOD_RESULT(
        "Bus_UnlockChannelGroup",
        "",

        FMOD_STUDIO_BUS.p("bus", "")
    )

    FMOD_RESULT(
        "Bus_GetChannelGroup",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        Check(1)..FMOD_CHANNELGROUP.p.p("group", "")
    )

    FMOD_RESULT(
        "Bus_GetCPUUsage",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        nullable..Check(1)..unsigned_int.p("exclusive", ""),
        nullable..Check(1)..unsigned_int.p("inclusive", "")
    )

    FMOD_RESULT(
        "Bus_GetMemoryUsage",
        "",

        FMOD_STUDIO_BUS.p("bus", ""),
        FMOD_STUDIO_MEMORY_USAGE.p("memoryusage", "")
    )

    FMOD_BOOL(
        "VCA_IsValid",
        "VCA",

        FMOD_STUDIO_VCA.p("vca", "")
    )

    FMOD_RESULT(
        "VCA_GetID",
        "",

        FMOD_STUDIO_VCA.p("vca", ""),
        FMOD_GUID.p("id", "")
    )

    FMOD_RESULT(
        "VCA_GetPath",
        "",

        FMOD_STUDIO_VCA.p("vca", ""),
        nullable..char.p("path", ""),
        AutoSize("path")..int("size", ""),
        nullable..Check(1)..int.p("retrieved", "")
    )

    FMOD_RESULT(
        "VCA_GetVolume",
        "",

        FMOD_STUDIO_VCA.p("vca", ""),
        nullable..Check(1)..float.p("volume", ""),
        nullable..Check(1)..float.p("finalvolume", "")
    )

    FMOD_RESULT(
        "VCA_SetVolume",
        "",

        FMOD_STUDIO_VCA.p("vca", ""),
        float("volume", "")
    )

    FMOD_BOOL(
        "Bank_IsValid",
        "Bank",

        FMOD_STUDIO_BANK.p("bank", "")
    )

    FMOD_RESULT(
        "Bank_GetID",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        FMOD_GUID.p("id", "")
    )

    FMOD_RESULT(
        "Bank_GetPath",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        nullable..char.p("path", ""),
        AutoSize("path")..int("size", ""),
        nullable..Check(1)..int.p("retrieved", "")
    )

    FMOD_RESULT(
        "Bank_Unload",
        "",

        FMOD_STUDIO_BANK.p("bank", "")
    )

    FMOD_RESULT(
        "Bank_LoadSampleData",
        "",

        FMOD_STUDIO_BANK.p("bank", "")
    )

    FMOD_RESULT(
        "Bank_UnloadSampleData",
        "",

        FMOD_STUDIO_BANK.p("bank", "")
    )

    FMOD_RESULT(
        "Bank_GetLoadingState",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        Check(1)..FMOD_STUDIO_LOADING_STATE.p("state", "")
    )

    FMOD_RESULT(
        "Bank_GetSampleLoadingState",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        Check(1)..FMOD_STUDIO_LOADING_STATE.p("state", "")
    )

    FMOD_RESULT(
        "Bank_GetStringCount",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "Bank_GetStringInfo",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        int("index", ""),
        nullable..FMOD_GUID.p("id", ""),
        nullable..char.p("path", ""),
        AutoSize("path")..int("size", ""),
        nullable..Check(1)..int.p("retrieved", "")
    )

    FMOD_RESULT(
        "Bank_GetEventCount",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "Bank_GetEventList",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        FMOD_STUDIO_EVENTDESCRIPTION.p.p("array", ""),
        AutoSize("array")..int("capacity", ""),
        nullable..Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "Bank_GetBusCount",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "Bank_GetBusList",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        FMOD_STUDIO_BUS.p.p("array", ""),
        AutoSize("array")..int("capacity", ""),
        nullable..Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "Bank_GetVCACount",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "Bank_GetVCAList",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        FMOD_STUDIO_VCA.p.p("array", ""),
        AutoSize("array")..int("capacity", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "Bank_GetUserData",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "Bank_SetUserData",
        "",

        FMOD_STUDIO_BANK.p("bank", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_BOOL(
        "CommandReplay_IsValid",
        "Command playback information",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", "")
    )

    FMOD_RESULT(
        "CommandReplay_GetSystem",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        Check(1)..FMOD_STUDIO_SYSTEM.p.p("system", "")
    )

    FMOD_RESULT(
        "CommandReplay_GetLength",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        Check(1)..float.p("length", "")
    )

    FMOD_RESULT(
        "CommandReplay_GetCommandCount",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "CommandReplay_GetCommandInfo",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        int("commandindex", ""),
        FMOD_STUDIO_COMMAND_INFO.p("info", "")
    )

    FMOD_RESULT(
        "CommandReplay_GetCommandString",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        int("commandindex", ""),
        char.p("buffer", ""),
        AutoSize("buffer")..int("length", "")
    )

    FMOD_RESULT(
        "CommandReplay_GetCommandAtTime",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        float("time", ""),
        Check(1)..int.p("commandindex", "")
    )

    FMOD_RESULT(
        "CommandReplay_SetBankPath",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        charUTF8.const.p("bankPath", "")
    )

    FMOD_RESULT(
        "CommandReplay_Start",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", "")
    )

    FMOD_RESULT(
        "CommandReplay_Stop",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", "")
    )

    FMOD_RESULT(
        "CommandReplay_SeekToTime",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        float("time", "")
    )

    FMOD_RESULT(
        "CommandReplay_SeekToCommand",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        int("commandindex", "")
    )

    FMOD_RESULT(
        "CommandReplay_GetPaused",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        Check(1)..FMOD_BOOL.p("paused", "")
    )

    FMOD_RESULT(
        "CommandReplay_SetPaused",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        FMOD_BOOL("paused", "")
    )

    FMOD_RESULT(
        "CommandReplay_GetPlaybackState",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        Check(1)..FMOD_STUDIO_PLAYBACK_STATE.p("state", "")
    )

    FMOD_RESULT(
        "CommandReplay_GetCurrentCommand",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        nullable..Check(1)..int.p("commandindex", ""),
        nullable..Check(1)..float.p("currenttime", "")
    )

    FMOD_RESULT(
        "CommandReplay_Release",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", "")
    )

    FMOD_RESULT(
        "CommandReplay_SetFrameCallback",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        nullable..FMOD_STUDIO_COMMANDREPLAY_FRAME_CALLBACK("callback", "")
    )

    FMOD_RESULT(
        "CommandReplay_SetLoadBankCallback",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        nullable..FMOD_STUDIO_COMMANDREPLAY_LOAD_BANK_CALLBACK("callback", "")
    )

    FMOD_RESULT(
        "CommandReplay_SetCreateInstanceCallback",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        nullable..FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK("callback", "")
    )

    FMOD_RESULT(
        "CommandReplay_GetUserData",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "CommandReplay_SetUserData",
        "",

        FMOD_STUDIO_COMMANDREPLAY.p("replay", ""),
        nullable..opaque_p("userdata", "")
    )
}
