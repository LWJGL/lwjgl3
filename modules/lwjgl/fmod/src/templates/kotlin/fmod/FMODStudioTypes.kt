/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package fmod

import org.lwjgl.generator.*

val FMOD_STUDIO_BANK = "FMOD_STUDIO_BANK".opaque
val FMOD_STUDIO_BUS = "FMOD_STUDIO_BUS".opaque
val FMOD_STUDIO_COMMANDCAPTURE_FLAGS = typedef(unsigned_int, "FMOD_STUDIO_COMMANDCAPTURE_FLAGS")
val FMOD_STUDIO_COMMANDREPLAY = "FMOD_STUDIO_COMMANDREPLAY".opaque
val FMOD_STUDIO_COMMANDREPLAY_FLAGS = typedef(unsigned_int, "FMOD_STUDIO_COMMANDREPLAY_FLAGS")
val FMOD_STUDIO_EVENTDESCRIPTION = "FMOD_STUDIO_EVENTDESCRIPTION".opaque
val FMOD_STUDIO_EVENTINSTANCE = "FMOD_STUDIO_EVENTINSTANCE".opaque
val FMOD_STUDIO_EVENT_CALLBACK_TYPE = typedef(unsigned_int, "FMOD_STUDIO_EVENT_CALLBACK_TYPE")
val FMOD_STUDIO_INITFLAGS = typedef(unsigned_int, "FMOD_STUDIO_INITFLAGS")
val FMOD_STUDIO_LOAD_BANK_FLAGS = typedef(unsigned_int, "FMOD_STUDIO_LOAD_BANK_FLAGS")
val FMOD_STUDIO_PARAMETER_FLAGS = typedef(unsigned_int, "FMOD_STUDIO_PARAMETER_FLAGS")
val FMOD_STUDIO_SYSTEM = "FMOD_STUDIO_SYSTEM".opaque
val FMOD_STUDIO_SYSTEM_CALLBACK_TYPE = typedef(unsigned_int, "FMOD_STUDIO_SYSTEM_CALLBACK_TYPE")
val FMOD_STUDIO_VCA = "FMOD_STUDIO_VCA".opaque

val FMOD_STUDIO_EVENT_PROPERTY = "FMOD_STUDIO_EVENT_PROPERTY".enumType
val FMOD_STUDIO_INSTANCETYPE = "FMOD_STUDIO_INSTANCETYPE".enumType
val FMOD_STUDIO_LOADING_STATE = "FMOD_STUDIO_LOADING_STATE".enumType
val FMOD_STUDIO_LOAD_MEMORY_MODE = "FMOD_STUDIO_LOAD_MEMORY_MODE".enumType
val FMOD_STUDIO_PARAMETER_TYPE = "FMOD_STUDIO_PARAMETER_TYPE".enumType
val FMOD_STUDIO_PLAYBACK_STATE = "FMOD_STUDIO_PLAYBACK_STATE".enumType
val FMOD_STUDIO_STOP_MODE = "FMOD_STUDIO_STOP_MODE".enumType
val FMOD_STUDIO_USER_PROPERTY_TYPE = "FMOD_STUDIO_USER_PROPERTY_TYPE".enumType

val FMOD_STUDIO_BANK_INFO = struct(Module.FMOD, "FMOD_STUDIO_BANK_INFO") {
    int("size")
    nullable..void.p("userdata")
    AutoSize("userdata")..int("userdatalength")
    FMOD_FILE_OPEN_CALLBACK("opencallback")
    FMOD_FILE_CLOSE_CALLBACK("closecallback")
    FMOD_FILE_READ_CALLBACK("readcallback")
    FMOD_FILE_SEEK_CALLBACK("seekcallback")
}

val FMOD_STUDIO_PARAMETER_ID = struct(Module.FMOD, "FMOD_STUDIO_PARAMETER_ID") {
    unsigned_int("data1")
    unsigned_int("data2")
}

val FMOD_STUDIO_PARAMETER_DESCRIPTION = struct(Module.FMOD, "FMOD_STUDIO_PARAMETER_DESCRIPTION") {
    charUTF8.const.p("name")
    FMOD_STUDIO_PARAMETER_ID("id")
    float("minimum")
    float("maximum")
    float("defaultvalue")
    FMOD_STUDIO_PARAMETER_TYPE("type")
    FMOD_STUDIO_PARAMETER_FLAGS("flags")
    FMOD_GUID("guid")
}

val FMOD_STUDIO_USER_PROPERTY = struct(Module.FMOD, "FMOD_STUDIO_USER_PROPERTY") {
    charUTF8.const.p("name")
    FMOD_STUDIO_USER_PROPERTY_TYPE("type")
    union {
        int("intvalue")
        FMOD_BOOL("boolvalue")
        float("floatvalue")
        nullable..charUTF8.const.p("stringvalue")
    }
}

val FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES = struct(Module.FMOD, "FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES") {
    charUTF8.const.p("name")
    FMOD_SOUND.p("sound")
    int("subsoundIndex")
}

val FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES = struct(Module.FMOD, "FMOD_STUDIO_PLUGIN_INSTANCE_PROPERTIES") {
    charUTF8.const.p("name")
    FMOD_DSP.p("dsp")
}

val FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES = struct(Module.FMOD, "FMOD_STUDIO_TIMELINE_MARKER_PROPERTIES") {
    charUTF8.const.p("name")
    int("position")
}

val FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES = struct(Module.FMOD, "FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES") {
    int("bar")
    int("beat")
    int("position")
    float("tempo")
    int("timesignatureupper")
    int("timesignaturelower")
}

val FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES = struct(Module.FMOD, "FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES") {
    FMOD_GUID("eventid")
    FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES("properties")
}

val FMOD_STUDIO_ADVANCEDSETTINGS = struct(Module.FMOD, "FMOD_STUDIO_ADVANCEDSETTINGS") {
    int("cbsize")
    unsigned_int("commandqueuesize")
    unsigned_int("handleinitialsize")
    int("studioupdateperiod")
    int("idlesampledatapoolsize")
    unsigned_int("streamingscheduledelay")
    charUTF8.const.p("encryptionkey")
}

val FMOD_STUDIO_CPU_USAGE = struct(Module.FMOD, "FMOD_STUDIO_CPU_USAGE") {
    float("update")
}

val FMOD_STUDIO_BUFFER_INFO = struct(Module.FMOD, "FMOD_STUDIO_BUFFER_INFO") {
    int("currentusage")
    int("peakusage")
    int("capacity")
    int("stallcount")
    float("stalltime")
}

val FMOD_STUDIO_BUFFER_USAGE = struct(Module.FMOD, "FMOD_STUDIO_BUFFER_USAGE") {
    FMOD_STUDIO_BUFFER_INFO("studiocommandqueue")
    FMOD_STUDIO_BUFFER_INFO("studiohandle")
}

val FMOD_STUDIO_SOUND_INFO = struct(Module.FMOD, "FMOD_STUDIO_SOUND_INFO") {
    char.const.p("name_or_data")
    FMOD_MODE("mode")
    FMOD_CREATESOUNDEXINFO("exinfo")
    int("subsoundindex")
}

val FMOD_STUDIO_COMMAND_INFO = struct(Module.FMOD, "FMOD_STUDIO_COMMAND_INFO") {
    charUTF8.const.p("commandname")
    int("parentcommandindex")
    int("framenumber")
    float("frametime")
    FMOD_STUDIO_INSTANCETYPE("instancetype")
    FMOD_STUDIO_INSTANCETYPE("outputtype")
    unsigned_int("instancehandle")
    unsigned_int("outputhandle")
}

val FMOD_STUDIO_MEMORY_USAGE = struct(Module.FMOD, "FMOD_STUDIO_MEMORY_USAGE") {
    int("exclusive")
    int("inclusive")
    int("sampledata")
}

val FMOD_STUDIO_SYSTEM_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_STUDIO_SYSTEM_CALLBACK",

        FMOD_STUDIO_SYSTEM.p("system"),
        FMOD_STUDIO_SYSTEM_CALLBACK_TYPE("type"),
        nullable..opaque_p("commanddata"),
        nullable..opaque_p("userdata"),

        nativeType = "FMOD_STUDIO_SYSTEM_CALLBACK"
    )
}

val FMOD_STUDIO_EVENT_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_STUDIO_EVENT_CALLBACK",

        FMOD_STUDIO_EVENT_CALLBACK_TYPE("type"),
        FMOD_STUDIO_EVENTINSTANCE.p("event"),
        nullable..opaque_p("parameters"),

        nativeType = "FMOD_STUDIO_EVENT_CALLBACK"
    )
}

val FMOD_STUDIO_COMMANDREPLAY_FRAME_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_STUDIO_COMMANDREPLAY_FRAME_CALLBACK",

        FMOD_STUDIO_COMMANDREPLAY.p("replay"),
        int("commandindex"),
        float("currenttime"),
        nullable..opaque_p("userdata"),

        nativeType = "FMOD_STUDIO_COMMANDREPLAY_FRAME_CALLBACK"
    )
}

val FMOD_STUDIO_COMMANDREPLAY_LOAD_BANK_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_STUDIO_COMMANDREPLAY_LOAD_BANK_CALLBACK",

        FMOD_STUDIO_COMMANDREPLAY.p("replay"),
        int("commandindex"),
        nullable..FMOD_GUID.const.p("bankguid"),
        nullable..charUTF8.const.p("bankfilename"),
        FMOD_STUDIO_LOAD_BANK_FLAGS("flags"),
        nullable..Check(1)..FMOD_STUDIO_BANK.p.p("bank"),
        nullable..opaque_p("userdata"),

        nativeType = "FMOD_STUDIO_COMMANDREPLAY_LOAD_BANK_CALLBACK"
    )
}

val FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK = Module.FMOD.callback {
    FMOD_RESULT(
        "FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK",

        FMOD_STUDIO_COMMANDREPLAY.p("replay"),
        int("commandindex"),
        FMOD_STUDIO_EVENTDESCRIPTION.p("eventdescription"),
        nullable..Check(1)..FMOD_STUDIO_EVENTINSTANCE.p.p("instance"),
        nullable..opaque_p("userdata"),

        nativeType = "FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK"
    )
}
