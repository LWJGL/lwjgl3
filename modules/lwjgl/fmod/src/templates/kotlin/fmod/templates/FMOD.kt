/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package fmod.templates

import org.lwjgl.generator.*
import fmod.*

val FMOD = "FMOD".nativeClass(
    Module.FMOD,
    prefix = "FMOD",
    prefixMethod = "FMOD_",
    binding = simpleBinding(Module.FMOD, libraryName = "FMOD", libraryExpression = "Configuration.FMOD_LIBRARY_NAME, \"fmod\"")
) {

    IntConstant("", "VERSION"..0x00020216)

    IntConstant("", "DEBUG_LEVEL_NONE"..0x00000000)
    IntConstant("", "DEBUG_LEVEL_ERROR"..0x00000001)
    IntConstant("", "DEBUG_LEVEL_WARNING"..0x00000002)
    IntConstant("", "DEBUG_LEVEL_LOG"..0x00000004)
    IntConstant("", "DEBUG_TYPE_MEMORY"..0x00000100)
    IntConstant("", "DEBUG_TYPE_FILE"..0x00000200)
    IntConstant("", "DEBUG_TYPE_CODEC"..0x00000400)
    IntConstant("", "DEBUG_TYPE_TRACE"..0x00000800)
    IntConstant("", "DEBUG_DISPLAY_TIMESTAMPS"..0x00010000)
    IntConstant("", "DEBUG_DISPLAY_LINENUMBERS"..0x00020000)
    IntConstant("", "DEBUG_DISPLAY_THREAD"..0x00040000)

    IntConstant("", "MEMORY_NORMAL"..0x00000000)
    IntConstant("", "MEMORY_STREAM_FILE"..0x00000001)
    IntConstant("", "MEMORY_STREAM_DECODE"..0x00000002)
    IntConstant("", "MEMORY_SAMPLEDATA"..0x00000004)
    IntConstant("", "MEMORY_DSP_BUFFER"..0x00000008)
    IntConstant("", "MEMORY_PLUGIN"..0x00000010)
    IntConstant("", "MEMORY_PERSISTENT"..0x00200000)
    IntConstant("", "MEMORY_ALL"..0xFFFFFFFF.i)

    IntConstant("", "INIT_NORMAL"..0x00000000)
    IntConstant("", "INIT_STREAM_FROM_UPDATE"..0x00000001)
    IntConstant("", "INIT_MIX_FROM_UPDATE"..0x00000002)
    IntConstant("", "INIT_3D_RIGHTHANDED"..0x00000004)
    IntConstant("", "INIT_CLIP_OUTPUT"..0x00000008)
    IntConstant("", "INIT_CHANNEL_LOWPASS"..0x00000100)
    IntConstant("", "INIT_CHANNEL_DISTANCEFILTER"..0x00000200)
    IntConstant("", "INIT_PROFILE_ENABLE"..0x00010000)
    IntConstant("", "INIT_VOL0_BECOMES_VIRTUAL"..0x00020000)
    IntConstant("", "INIT_GEOMETRY_USECLOSEST"..0x00040000)
    IntConstant("", "INIT_PREFER_DOLBY_DOWNMIX"..0x00080000)
    IntConstant("", "INIT_THREAD_UNSAFE"..0x00100000)
    IntConstant("", "INIT_PROFILE_METER_ALL"..0x00200000)
    IntConstant("", "INIT_MEMORY_TRACKING"..0x00400000)

    IntConstant("", "DRIVER_STATE_CONNECTED"..0x00000001)
    IntConstant("", "DRIVER_STATE_DEFAULT"..0x00000002)

    IntConstant("", "TIMEUNIT_MS"..0x00000001)
    IntConstant("", "TIMEUNIT_PCM"..0x00000002)
    IntConstant("", "TIMEUNIT_PCMBYTES"..0x00000004)
    IntConstant("", "TIMEUNIT_RAWBYTES"..0x00000008)
    IntConstant("", "TIMEUNIT_PCMFRACTION"..0x00000010)
    IntConstant("", "TIMEUNIT_MODORDER"..0x00000100)
    IntConstant("", "TIMEUNIT_MODROW"..0x00000200)
    IntConstant("", "TIMEUNIT_MODPATTERN"..0x00000400)

    IntConstant("", "SYSTEM_CALLBACK_DEVICELISTCHANGED"..0x00000001)
    IntConstant("", "SYSTEM_CALLBACK_DEVICELOST"..0x00000002)
    IntConstant("", "SYSTEM_CALLBACK_MEMORYALLOCATIONFAILED"..0x00000004)
    IntConstant("", "SYSTEM_CALLBACK_THREADCREATED"..0x00000008)
    IntConstant("", "SYSTEM_CALLBACK_BADDSPCONNECTION"..0x00000010)
    IntConstant("", "SYSTEM_CALLBACK_PREMIX"..0x00000020)
    IntConstant("", "SYSTEM_CALLBACK_POSTMIX"..0x00000040)
    IntConstant("", "SYSTEM_CALLBACK_ERROR"..0x00000080)
    IntConstant("", "SYSTEM_CALLBACK_MIDMIX"..0x00000100)
    IntConstant("", "SYSTEM_CALLBACK_THREADDESTROYED"..0x00000200)
    IntConstant("", "SYSTEM_CALLBACK_PREUPDATE"..0x00000400)
    IntConstant("", "SYSTEM_CALLBACK_POSTUPDATE"..0x00000800)
    IntConstant("", "SYSTEM_CALLBACK_RECORDLISTCHANGED"..0x00001000)
    IntConstant("", "SYSTEM_CALLBACK_BUFFEREDNOMIX"..0x00002000)
    IntConstant("", "SYSTEM_CALLBACK_DEVICEREINITIALIZE"..0x00004000)
    IntConstant("", "SYSTEM_CALLBACK_OUTPUTUNDERRUN"..0x00008000)
    IntConstant("", "SYSTEM_CALLBACK_RECORDPOSITIONCHANGED"..0x00010000)
    IntConstant("", "SYSTEM_CALLBACK_ALL"..0xFFFFFFFF.i)

    IntConstant("", "DEFAULT"..0x00000000)
    IntConstant("", "LOOP_OFF"..0x00000001)
    IntConstant("", "LOOP_NORMAL"..0x00000002)
    IntConstant("", "LOOP_BIDI"..0x00000004)
    IntConstant("", "2D"..0x00000008)
    IntConstant("", "3D"..0x00000010)
    IntConstant("", "CREATESTREAM"..0x00000080)
    IntConstant("", "CREATESAMPLE"..0x00000100)
    IntConstant("", "CREATECOMPRESSEDSAMPLE"..0x00000200)
    IntConstant("", "OPENUSER"..0x00000400)
    IntConstant("", "OPENMEMORY"..0x00000800)
    IntConstant("", "OPENMEMORY_POINT"..0x10000000)
    IntConstant("", "OPENRAW"..0x00001000)
    IntConstant("", "OPENONLY"..0x00002000)
    IntConstant("", "ACCURATETIME"..0x00004000)
    IntConstant("", "MPEGSEARCH"..0x00008000)
    IntConstant("", "NONBLOCKING"..0x00010000)
    IntConstant("", "UNIQUE"..0x00020000)
    IntConstant("", "3D_HEADRELATIVE"..0x00040000)
    IntConstant("", "3D_WORLDRELATIVE"..0x00080000)
    IntConstant("", "3D_INVERSEROLLOFF"..0x00100000)
    IntConstant("", "3D_LINEARROLLOFF"..0x00200000)
    IntConstant("", "3D_LINEARSQUAREROLLOFF"..0x00400000)
    IntConstant("", "3D_INVERSETAPEREDROLLOFF"..0x00800000)
    IntConstant("", "3D_CUSTOMROLLOFF"..0x04000000)
    IntConstant("", "3D_IGNOREGEOMETRY"..0x40000000)
    IntConstant("", "IGNORETAGS"..0x02000000)
    IntConstant("", "LOWMEM"..0x08000000)
    IntConstant("", "VIRTUAL_PLAYFROMSTART"..0x80000000.i)

    IntConstant("", "CHANNELMASK_FRONT_LEFT"..0x00000001)
    IntConstant("", "CHANNELMASK_FRONT_RIGHT"..0x00000002)
    IntConstant("", "CHANNELMASK_FRONT_CENTER"..0x00000004)
    IntConstant("", "CHANNELMASK_LOW_FREQUENCY"..0x00000008)
    IntConstant("", "CHANNELMASK_SURROUND_LEFT"..0x00000010)
    IntConstant("", "CHANNELMASK_SURROUND_RIGHT"..0x00000020)
    IntConstant("", "CHANNELMASK_BACK_LEFT"..0x00000040)
    IntConstant("", "CHANNELMASK_BACK_RIGHT"..0x00000080)
    IntConstant("", "CHANNELMASK_BACK_CENTER"..0x00000100)
    IntConstant("", "CHANNELMASK_MONO".."FMOD_CHANNELMASK_FRONT_LEFT")
    IntConstant("", "CHANNELMASK_STEREO".."FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT")
    IntConstant("", "CHANNELMASK_LRC".."FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER")
    IntConstant("", "CHANNELMASK_QUAD".."FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_SURROUND_LEFT | FMOD_CHANNELMASK_SURROUND_RIGHT")
    IntConstant("", "CHANNELMASK_SURROUND".."FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER  | FMOD_CHANNELMASK_SURROUND_LEFT | FMOD_CHANNELMASK_SURROUND_RIGHT")
    IntConstant("", "CHANNELMASK_5POINT1".."FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER  | FMOD_CHANNELMASK_LOW_FREQUENCY | FMOD_CHANNELMASK_SURROUND_LEFT  | FMOD_CHANNELMASK_SURROUND_RIGHT")
    IntConstant("", "CHANNELMASK_5POINT1_REARS".."FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER  | FMOD_CHANNELMASK_LOW_FREQUENCY | FMOD_CHANNELMASK_BACK_LEFT      | FMOD_CHANNELMASK_BACK_RIGHT")
    IntConstant("", "CHANNELMASK_7POINT0".."FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER  | FMOD_CHANNELMASK_SURROUND_LEFT | FMOD_CHANNELMASK_SURROUND_RIGHT | FMOD_CHANNELMASK_BACK_LEFT      | FMOD_CHANNELMASK_BACK_RIGHT")
    IntConstant("", "CHANNELMASK_7POINT1".."FMOD_CHANNELMASK_FRONT_LEFT | FMOD_CHANNELMASK_FRONT_RIGHT | FMOD_CHANNELMASK_FRONT_CENTER  | FMOD_CHANNELMASK_LOW_FREQUENCY | FMOD_CHANNELMASK_SURROUND_LEFT  | FMOD_CHANNELMASK_SURROUND_RIGHT | FMOD_CHANNELMASK_BACK_LEFT | FMOD_CHANNELMASK_BACK_RIGHT")

    LongConstant("", "PORT_INDEX_NONE".."0xFFFFFFFFFFFFFFFFL")
    LongConstant("", "PORT_INDEX_FLAG_VR_CONTROLLER"..0x1000000000000000)

    IntConstant("", "THREAD_PRIORITY_PLATFORM_MIN".."-32 * 1024") // TODO
    IntConstant("", "THREAD_PRIORITY_PLATFORM_MAX".."32 * 1024")

    IntConstant("", "THREAD_PRIORITY_DEFAULT".."FMOD_THREAD_PRIORITY_PLATFORM_MIN - 1")
    IntConstant("", "THREAD_PRIORITY_LOW".."FMOD_THREAD_PRIORITY_PLATFORM_MIN - 2")
    IntConstant("", "THREAD_PRIORITY_MEDIUM".."FMOD_THREAD_PRIORITY_PLATFORM_MIN - 3")
    IntConstant("", "THREAD_PRIORITY_HIGH".."FMOD_THREAD_PRIORITY_PLATFORM_MIN - 4")
    IntConstant("", "THREAD_PRIORITY_VERY_HIGH".."FMOD_THREAD_PRIORITY_PLATFORM_MIN - 5")
    IntConstant("", "THREAD_PRIORITY_EXTREME".."FMOD_THREAD_PRIORITY_PLATFORM_MIN - 6")
    IntConstant("", "THREAD_PRIORITY_CRITICAL".."FMOD_THREAD_PRIORITY_PLATFORM_MIN - 7")
    
    IntConstant("", "THREAD_PRIORITY_MIXER".."FMOD_THREAD_PRIORITY_EXTREME")
    IntConstant("", "THREAD_PRIORITY_FEEDER".."FMOD_THREAD_PRIORITY_CRITICAL")
    IntConstant("", "THREAD_PRIORITY_STREAM".."FMOD_THREAD_PRIORITY_VERY_HIGH")
    IntConstant("", "THREAD_PRIORITY_FILE".."FMOD_THREAD_PRIORITY_HIGH")
    IntConstant("", "THREAD_PRIORITY_NONBLOCKING".."FMOD_THREAD_PRIORITY_HIGH")
    IntConstant("", "THREAD_PRIORITY_RECORD".."FMOD_THREAD_PRIORITY_HIGH")
    IntConstant("", "THREAD_PRIORITY_GEOMETRY".."FMOD_THREAD_PRIORITY_LOW")
    IntConstant("", "THREAD_PRIORITY_PROFILER".."FMOD_THREAD_PRIORITY_MEDIUM")
    IntConstant("", "THREAD_PRIORITY_STUDIO_UPDATE".."FMOD_THREAD_PRIORITY_MEDIUM")
    IntConstant("", "THREAD_PRIORITY_STUDIO_LOAD_BANK".."FMOD_THREAD_PRIORITY_MEDIUM")
    IntConstant("", "THREAD_PRIORITY_STUDIO_LOAD_SAMPLE".."FMOD_THREAD_PRIORITY_MEDIUM")
    IntConstant("", "THREAD_PRIORITY_CONVOLUTION1".."FMOD_THREAD_PRIORITY_VERY_HIGH")
    IntConstant("", "THREAD_PRIORITY_CONVOLUTION2".."FMOD_THREAD_PRIORITY_VERY_HIGH")
    
    IntConstant("", "THREAD_STACK_SIZE_DEFAULT".."0")
    IntConstant("", "THREAD_STACK_SIZE_MIXER".."80  * 1024")
    IntConstant("", "THREAD_STACK_SIZE_FEEDER".."16  * 1024")
    IntConstant("", "THREAD_STACK_SIZE_STREAM".."96  * 1024")
    IntConstant("", "THREAD_STACK_SIZE_FILE".."64  * 1024")
    IntConstant("", "THREAD_STACK_SIZE_NONBLOCKING".."112 * 1024")
    IntConstant("", "THREAD_STACK_SIZE_RECORD".."16  * 1024")
    IntConstant("", "THREAD_STACK_SIZE_GEOMETRY".."48  * 1024")
    IntConstant("", "THREAD_STACK_SIZE_PROFILER".."128 * 1024")
    IntConstant("", "THREAD_STACK_SIZE_STUDIO_UPDATE".."96  * 1024")
    IntConstant("", "THREAD_STACK_SIZE_STUDIO_LOAD_BANK".."96  * 1024")
    IntConstant("", "THREAD_STACK_SIZE_STUDIO_LOAD_SAMPLE".."96  * 1024")
    IntConstant("", "THREAD_STACK_SIZE_CONVOLUTION1".."16  * 1024")
    IntConstant("", "THREAD_STACK_SIZE_CONVOLUTION2".."16  * 1024")
    
    LongConstant("", "THREAD_AFFINITY_GROUP_DEFAULT".."0x4000000000000000L")
    LongConstant("", "THREAD_AFFINITY_GROUP_A".."0x4000000000000001L")
    LongConstant("", "THREAD_AFFINITY_GROUP_B".."0x4000000000000002L")
    LongConstant("", "THREAD_AFFINITY_GROUP_C".."0x4000000000000003L")
    LongConstant("", "THREAD_AFFINITY_MIXER".."FMOD_THREAD_AFFINITY_GROUP_A")
    LongConstant("", "THREAD_AFFINITY_FEEDER".."FMOD_THREAD_AFFINITY_GROUP_C")
    LongConstant("", "THREAD_AFFINITY_STREAM".."FMOD_THREAD_AFFINITY_GROUP_C")
    LongConstant("", "THREAD_AFFINITY_FILE".."FMOD_THREAD_AFFINITY_GROUP_C")
    LongConstant("", "THREAD_AFFINITY_NONBLOCKING".."FMOD_THREAD_AFFINITY_GROUP_C")
    LongConstant("", "THREAD_AFFINITY_RECORD".."FMOD_THREAD_AFFINITY_GROUP_C")
    LongConstant("", "THREAD_AFFINITY_GEOMETRY".."FMOD_THREAD_AFFINITY_GROUP_C")
    LongConstant("", "THREAD_AFFINITY_PROFILER".."FMOD_THREAD_AFFINITY_GROUP_C")
    LongConstant("", "THREAD_AFFINITY_STUDIO_UPDATE".."FMOD_THREAD_AFFINITY_GROUP_B")
    LongConstant("", "THREAD_AFFINITY_STUDIO_LOAD_BANK".."FMOD_THREAD_AFFINITY_GROUP_C")
    LongConstant("", "THREAD_AFFINITY_STUDIO_LOAD_SAMPLE".."FMOD_THREAD_AFFINITY_GROUP_C")
    LongConstant("", "THREAD_AFFINITY_CONVOLUTION1".."FMOD_THREAD_AFFINITY_GROUP_C")
    LongConstant("", "THREAD_AFFINITY_CONVOLUTION2".."FMOD_THREAD_AFFINITY_GROUP_C")

    IntConstant("", "THREAD_AFFINITY_CORE_ALL".."0")
    IntConstant("", "THREAD_AFFINITY_CORE_0".."1 << 0")
    IntConstant("", "THREAD_AFFINITY_CORE_1".."1 << 1")
    IntConstant("", "THREAD_AFFINITY_CORE_2".."1 << 2")
    IntConstant("", "THREAD_AFFINITY_CORE_3".."1 << 3")
    IntConstant("", "THREAD_AFFINITY_CORE_4".."1 << 4")
    IntConstant("", "THREAD_AFFINITY_CORE_5".."1 << 5")
    IntConstant("", "THREAD_AFFINITY_CORE_6".."1 << 6")
    IntConstant("", "THREAD_AFFINITY_CORE_7".."1 << 7")
    IntConstant("", "THREAD_AFFINITY_CORE_8".."1 << 8")
    IntConstant("", "THREAD_AFFINITY_CORE_9".."1 << 9")
    IntConstant("", "THREAD_AFFINITY_CORE_10".."1 << 10")
    IntConstant("", "THREAD_AFFINITY_CORE_11".."1 << 11")
    IntConstant("", "THREAD_AFFINITY_CORE_12".."1 << 12")
    IntConstant("", "THREAD_AFFINITY_CORE_13".."1 << 13")
    IntConstant("", "THREAD_AFFINITY_CORE_14".."1 << 14")
    IntConstant("", "THREAD_AFFINITY_CORE_15".."1 << 15")

/* Preset for FMOD_REVERB_PROPERTIES */
    // TODO
/*#define FMOD_PRESET_OFF                             {  1000,    7,  11, 5000, 100, 100, 100, 250, 0,    20,  96, -80.0f }
#define FMOD_PRESET_GENERIC                         {  1500,    7,  11, 5000,  83, 100, 100, 250, 0, 14500,  96,  -8.0f }
#define FMOD_PRESET_PADDEDCELL                      {   170,    1,   2, 5000,  10, 100, 100, 250, 0,   160,  84,  -7.8f }
#define FMOD_PRESET_ROOM                            {   400,    2,   3, 5000,  83, 100, 100, 250, 0,  6050,  88,  -9.4f }
#define FMOD_PRESET_BATHROOM                        {  1500,    7,  11, 5000,  54, 100,  60, 250, 0,  2900,  83,   0.5f }
#define FMOD_PRESET_LIVINGROOM                      {   500,    3,   4, 5000,  10, 100, 100, 250, 0,   160,  58, -19.0f }
#define FMOD_PRESET_STONEROOM                       {  2300,   12,  17, 5000,  64, 100, 100, 250, 0,  7800,  71,  -8.5f }
#define FMOD_PRESET_AUDITORIUM                      {  4300,   20,  30, 5000,  59, 100, 100, 250, 0,  5850,  64, -11.7f }
#define FMOD_PRESET_CONCERTHALL                     {  3900,   20,  29, 5000,  70, 100, 100, 250, 0,  5650,  80,  -9.8f }
#define FMOD_PRESET_CAVE                            {  2900,   15,  22, 5000, 100, 100, 100, 250, 0, 20000,  59, -11.3f }
#define FMOD_PRESET_ARENA                           {  7200,   20,  30, 5000,  33, 100, 100, 250, 0,  4500,  80,  -9.6f }
#define FMOD_PRESET_HANGAR                          { 10000,   20,  30, 5000,  23, 100, 100, 250, 0,  3400,  72,  -7.4f }
#define FMOD_PRESET_CARPETTEDHALLWAY                {   300,    2,  30, 5000,  10, 100, 100, 250, 0,   500,  56, -24.0f }
#define FMOD_PRESET_HALLWAY                         {  1500,    7,  11, 5000,  59, 100, 100, 250, 0,  7800,  87,  -5.5f }
#define FMOD_PRESET_STONECORRIDOR                   {   270,   13,  20, 5000,  79, 100, 100, 250, 0,  9000,  86,  -6.0f }
#define FMOD_PRESET_ALLEY                           {  1500,    7,  11, 5000,  86, 100, 100, 250, 0,  8300,  80,  -9.8f }
#define FMOD_PRESET_FOREST                          {  1500,  162,  88, 5000,  54,  79, 100, 250, 0,   760,  94, -12.3f }
#define FMOD_PRESET_CITY                            {  1500,    7,  11, 5000,  67,  50, 100, 250, 0,  4050,  66, -26.0f }
#define FMOD_PRESET_MOUNTAINS                       {  1500,  300, 100, 5000,  21,  27, 100, 250, 0,  1220,  82, -24.0f }
#define FMOD_PRESET_QUARRY                          {  1500,   61,  25, 5000,  83, 100, 100, 250, 0,  3400, 100,  -5.0f }
#define FMOD_PRESET_PLAIN                           {  1500,  179, 100, 5000,  50,  21, 100, 250, 0,  1670,  65, -28.0f }
#define FMOD_PRESET_PARKINGLOT                      {  1700,    8,  12, 5000, 100, 100, 100, 250, 0, 20000,  56, -19.5f }
#define FMOD_PRESET_SEWERPIPE                       {  2800,   14,  21, 5000,  14,  80,  60, 250, 0,  3400,  66,   1.2f }
#define FMOD_PRESET_UNDERWATER                      {  1500,    7,  11, 5000,  10, 100, 100, 250, 0,   500,  92,   7.0f }*/

    IntConstant("", "MAX_CHANNEL_WIDTH".."32")
    IntConstant("", "MAX_SYSTEMS".."8")
    IntConstant("", "MAX_LISTENERS".."8")
    IntConstant("", "REVERB_MAXINSTANCES".."4")

    IntConstant("", "CODEC_PLUGIN_VERSION".."1")

    IntConstant("", "CODEC_SEEK_METHOD_SET".."0")
    IntConstant("", "CODEC_SEEK_METHOD_CURRENT".."1")
    IntConstant("", "CODEC_SEEK_METHOD_END".."2")

    IntConstant("", "DSP_LOUDNESS_METER_HISTOGRAM_SAMPLES".."66")

    IntConstant("", "PLUGIN_SDK_VERSION".."110")
    IntConstant("", "DSP_GETPARAM_VALUESTR_LENGTH".."32")

    IntConstant("", "OUTPUT_PLUGIN_VERSION".."5")

    IntConstant("", "OUTPUT_METHOD_MIX_DIRECT".."0")
    IntConstant("", "OUTPUT_METHOD_MIX_BUFFERED".."1")

    EnumConstant(
        "{@code FMOD_THREAD_TYPE}",

        "THREAD_TYPE_MIXER".enum("", "0"),
        "THREAD_TYPE_FEEDER".enum,
        "THREAD_TYPE_STREAM".enum,
        "THREAD_TYPE_FILE".enum,
        "THREAD_TYPE_NONBLOCKING".enum,
        "THREAD_TYPE_RECORD".enum,
        "THREAD_TYPE_GEOMETRY".enum,
        "THREAD_TYPE_PROFILER".enum,
        "THREAD_TYPE_STUDIO_UPDATE".enum,
        "THREAD_TYPE_STUDIO_LOAD_BANK".enum,
        "THREAD_TYPE_STUDIO_LOAD_SAMPLE".enum,
        "THREAD_TYPE_CONVOLUTION1".enum,
        "THREAD_TYPE_CONVOLUTION2".enum,
        "THREAD_TYPE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_RESULT}",

        "OK".enum("", "0"),
        "ERR_BADCOMMAND".enum,
        "ERR_CHANNEL_ALLOC".enum,
        "ERR_CHANNEL_STOLEN".enum,
        "ERR_DMA".enum,
        "ERR_DSP_CONNECTION".enum,
        "ERR_DSP_DONTPROCESS".enum,
        "ERR_DSP_FORMAT".enum,
        "ERR_DSP_INUSE".enum,
        "ERR_DSP_NOTFOUND".enum,
        "ERR_DSP_RESERVED".enum,
        "ERR_DSP_SILENCE".enum,
        "ERR_DSP_TYPE".enum,
        "ERR_FILE_BAD".enum,
        "ERR_FILE_COULDNOTSEEK".enum,
        "ERR_FILE_DISKEJECTED".enum,
        "ERR_FILE_EOF".enum,
        "ERR_FILE_ENDOFDATA".enum,
        "ERR_FILE_NOTFOUND".enum,
        "ERR_FORMAT".enum,
        "ERR_HEADER_MISMATCH".enum,
        "ERR_HTTP".enum,
        "ERR_HTTP_ACCESS".enum,
        "ERR_HTTP_PROXY_AUTH".enum,
        "ERR_HTTP_SERVER_ERROR".enum,
        "ERR_HTTP_TIMEOUT".enum,
        "ERR_INITIALIZATION".enum,
        "ERR_INITIALIZED".enum,
        "ERR_INTERNAL".enum,
        "ERR_INVALID_FLOAT".enum,
        "ERR_INVALID_HANDLE".enum,
        "ERR_INVALID_PARAM".enum,
        "ERR_INVALID_POSITION".enum,
        "ERR_INVALID_SPEAKER".enum,
        "ERR_INVALID_SYNCPOINT".enum,
        "ERR_INVALID_THREAD".enum,
        "ERR_INVALID_VECTOR".enum,
        "ERR_MAXAUDIBLE".enum,
        "ERR_MEMORY".enum,
        "ERR_MEMORY_CANTPOINT".enum,
        "ERR_NEEDS3D".enum,
        "ERR_NEEDSHARDWARE".enum,
        "ERR_NET_CONNECT".enum,
        "ERR_NET_SOCKET_ERROR".enum,
        "ERR_NET_URL".enum,
        "ERR_NET_WOULD_BLOCK".enum,
        "ERR_NOTREADY".enum,
        "ERR_OUTPUT_ALLOCATED".enum,
        "ERR_OUTPUT_CREATEBUFFER".enum,
        "ERR_OUTPUT_DRIVERCALL".enum,
        "ERR_OUTPUT_FORMAT".enum,
        "ERR_OUTPUT_INIT".enum,
        "ERR_OUTPUT_NODRIVERS".enum,
        "ERR_PLUGIN".enum,
        "ERR_PLUGIN_MISSING".enum,
        "ERR_PLUGIN_RESOURCE".enum,
        "ERR_PLUGIN_VERSION".enum,
        "ERR_RECORD".enum,
        "ERR_REVERB_CHANNELGROUP".enum,
        "ERR_REVERB_INSTANCE".enum,
        "ERR_SUBSOUNDS".enum,
        "ERR_SUBSOUND_ALLOCATED".enum,
        "ERR_SUBSOUND_CANTMOVE".enum,
        "ERR_TAGNOTFOUND".enum,
        "ERR_TOOMANYCHANNELS".enum,
        "ERR_TRUNCATED".enum,
        "ERR_UNIMPLEMENTED".enum,
        "ERR_UNINITIALIZED".enum,
        "ERR_UNSUPPORTED".enum,
        "ERR_VERSION".enum,
        "ERR_EVENT_ALREADY_LOADED".enum,
        "ERR_EVENT_LIVEUPDATE_BUSY".enum,
        "ERR_EVENT_LIVEUPDATE_MISMATCH".enum,
        "ERR_EVENT_LIVEUPDATE_TIMEOUT".enum,
        "ERR_EVENT_NOTFOUND".enum,
        "ERR_STUDIO_UNINITIALIZED".enum,
        "ERR_STUDIO_NOT_LOADED".enum,
        "ERR_INVALID_STRING".enum,
        "ERR_ALREADY_LOCKED".enum,
        "ERR_NOT_LOCKED".enum,
        "ERR_RECORD_DISCONNECTED".enum,
        "ERR_TOOMANYSAMPLES".enum
    )

    EnumConstant(
        "{@code FMOD_CHANNELCONTROL_TYPE}",

        "CHANNELCONTROL_CHANNEL".enum("", "0"),
        "CHANNELCONTROL_CHANNELGROUP".enum,
        "CHANNELCONTROL_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_OUTPUTTYPE}",

        "OUTPUTTYPE_AUTODETECT".enum("", "0"),
        "OUTPUTTYPE_UNKNOWN".enum,
        "OUTPUTTYPE_NOSOUND".enum,
        "OUTPUTTYPE_WAVWRITER".enum,
        "OUTPUTTYPE_NOSOUND_NRT".enum,
        "OUTPUTTYPE_WAVWRITER_NRT".enum,
        "OUTPUTTYPE_WASAPI".enum,
        "OUTPUTTYPE_ASIO".enum,
        "OUTPUTTYPE_PULSEAUDIO".enum,
        "OUTPUTTYPE_ALSA".enum,
        "OUTPUTTYPE_COREAUDIO".enum,
        "OUTPUTTYPE_AUDIOTRACK".enum,
        "OUTPUTTYPE_OPENSL".enum,
        "OUTPUTTYPE_AUDIOOUT".enum,
        "OUTPUTTYPE_AUDIO3D".enum,
        "OUTPUTTYPE_WEBAUDIO".enum,
        "OUTPUTTYPE_NNAUDIO".enum,
        "OUTPUTTYPE_WINSONIC".enum,
        "OUTPUTTYPE_AAUDIO".enum,
        "OUTPUTTYPE_AUDIOWORKLET".enum,
        "OUTPUTTYPE_PHASE".enum,
        "OUTPUTTYPE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_DEBUG_MODE}",

        "DEBUG_MODE_TTY".enum("", "0"),
        "DEBUG_MODE_FILE".enum,
        "DEBUG_MODE_CALLBACK".enum
    )

    EnumConstant(
        "{@code FMOD_SPEAKERMODE}",

        "SPEAKERMODE_DEFAULT".enum("", "0"),
        "SPEAKERMODE_RAW".enum,
        "SPEAKERMODE_MONO".enum,
        "SPEAKERMODE_STEREO".enum,
        "SPEAKERMODE_QUAD".enum,
        "SPEAKERMODE_SURROUND".enum,
        "SPEAKERMODE_5POINT1".enum,
        "SPEAKERMODE_7POINT1".enum,
        "SPEAKERMODE_7POINT1POINT4".enum,
        "SPEAKERMODE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_SPEAKER}",

        "SPEAKER_NONE".enum("", "-1"),
        "SPEAKER_FRONT_LEFT".enum,
        "SPEAKER_FRONT_RIGHT".enum,
        "SPEAKER_FRONT_CENTER".enum,
        "SPEAKER_LOW_FREQUENCY".enum,
        "SPEAKER_SURROUND_LEFT".enum,
        "SPEAKER_SURROUND_RIGHT".enum,
        "SPEAKER_BACK_LEFT".enum,
        "SPEAKER_BACK_RIGHT".enum,
        "SPEAKER_TOP_FRONT_LEFT".enum,
        "SPEAKER_TOP_FRONT_RIGHT".enum,
        "SPEAKER_TOP_BACK_LEFT".enum,
        "SPEAKER_TOP_BACK_RIGHT".enum,
        "SPEAKER_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_CHANNELORDER}",

        "CHANNELORDER_DEFAULT".enum("", "0"),
        "CHANNELORDER_WAVEFORMAT".enum,
        "CHANNELORDER_PROTOOLS".enum,
        "CHANNELORDER_ALLMONO".enum,
        "CHANNELORDER_ALLSTEREO".enum,
        "CHANNELORDER_ALSA".enum,
        "CHANNELORDER_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_PLUGINTYPE}",

        "PLUGINTYPE_OUTPUT".enum("", "0"),
        "PLUGINTYPE_CODEC".enum,
        "PLUGINTYPE_DSP".enum,
        "PLUGINTYPE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_SOUND_TYPE}",

        "SOUND_TYPE_UNKNOWN".enum("", "0"),
        "SOUND_TYPE_AIFF".enum,
        "SOUND_TYPE_ASF".enum,
        "SOUND_TYPE_DLS".enum,
        "SOUND_TYPE_FLAC".enum,
        "SOUND_TYPE_FSB".enum,
        "SOUND_TYPE_IT".enum,
        "SOUND_TYPE_MIDI".enum,
        "SOUND_TYPE_MOD".enum,
        "SOUND_TYPE_MPEG".enum,
        "SOUND_TYPE_OGGVORBIS".enum,
        "SOUND_TYPE_PLAYLIST".enum,
        "SOUND_TYPE_RAW".enum,
        "SOUND_TYPE_S3M".enum,
        "SOUND_TYPE_USER".enum,
        "SOUND_TYPE_WAV".enum,
        "SOUND_TYPE_XM".enum,
        "SOUND_TYPE_XMA".enum,
        "SOUND_TYPE_AUDIOQUEUE".enum,
        "SOUND_TYPE_AT9".enum,
        "SOUND_TYPE_VORBIS".enum,
        "SOUND_TYPE_MEDIA_FOUNDATION".enum,
        "SOUND_TYPE_MEDIACODEC".enum,
        "SOUND_TYPE_FADPCM".enum,
        "SOUND_TYPE_OPUS".enum,
        "SOUND_TYPE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_SOUND_FORMAT}",

        "SOUND_FORMAT_NONE".enum("", "0"),
        "SOUND_FORMAT_PCM8".enum,
        "SOUND_FORMAT_PCM16".enum,
        "SOUND_FORMAT_PCM24".enum,
        "SOUND_FORMAT_PCM32".enum,
        "SOUND_FORMAT_PCMFLOAT".enum,
        "SOUND_FORMAT_BITSTREAM".enum,
        "SOUND_FORMAT_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_OPENSTATE}",

        "OPENSTATE_READY".enum("", "0"),
        "OPENSTATE_LOADING".enum,
        "OPENSTATE_ERROR".enum,
        "OPENSTATE_CONNECTING".enum,
        "OPENSTATE_BUFFERING".enum,
        "OPENSTATE_SEEKING".enum,
        "OPENSTATE_PLAYING".enum,
        "OPENSTATE_SETPOSITION".enum,
        "OPENSTATE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_SOUNDGROUP_BEHAVIOR}",

        "SOUNDGROUP_BEHAVIOR_FAIL".enum("", "0"),
        "SOUNDGROUP_BEHAVIOR_MUTE".enum,
        "SOUNDGROUP_BEHAVIOR_STEALLOWEST".enum,
        "SOUNDGROUP_BEHAVIOR_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_CHANNELCONTROL_CALLBACK_TYPE}",

        "CHANNELCONTROL_CALLBACK_END".enum("", "0"),
        "CHANNELCONTROL_CALLBACK_VIRTUALVOICE".enum,
        "CHANNELCONTROL_CALLBACK_SYNCPOINT".enum,
        "CHANNELCONTROL_CALLBACK_OCCLUSION".enum,
        "CHANNELCONTROL_CALLBACK_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_CHANNELCONTROL_DSP_INDEX}",

        "CHANNELCONTROL_DSP_HEAD".enum("", "-1"),
        "CHANNELCONTROL_DSP_FADER".enum("", "-2"),
        "CHANNELCONTROL_DSP_TAIL".enum("", "-3")
    )

    EnumConstant(
        "{@code FMOD_ERRORCALLBACK_INSTANCETYPE}",

        "ERRORCALLBACK_INSTANCETYPE_NONE".enum("", "0"),
        "ERRORCALLBACK_INSTANCETYPE_SYSTEM".enum,
        "ERRORCALLBACK_INSTANCETYPE_CHANNEL".enum,
        "ERRORCALLBACK_INSTANCETYPE_CHANNELGROUP".enum,
        "ERRORCALLBACK_INSTANCETYPE_CHANNELCONTROL".enum,
        "ERRORCALLBACK_INSTANCETYPE_SOUND".enum,
        "ERRORCALLBACK_INSTANCETYPE_SOUNDGROUP".enum,
        "ERRORCALLBACK_INSTANCETYPE_DSP".enum,
        "ERRORCALLBACK_INSTANCETYPE_DSPCONNECTION".enum,
        "ERRORCALLBACK_INSTANCETYPE_GEOMETRY".enum,
        "ERRORCALLBACK_INSTANCETYPE_REVERB3D".enum,
        "ERRORCALLBACK_INSTANCETYPE_STUDIO_SYSTEM".enum,
        "ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTDESCRIPTION".enum,
        "ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTINSTANCE".enum,
        "ERRORCALLBACK_INSTANCETYPE_STUDIO_PARAMETERINSTANCE".enum,
        "ERRORCALLBACK_INSTANCETYPE_STUDIO_BUS".enum,
        "ERRORCALLBACK_INSTANCETYPE_STUDIO_VCA".enum,
        "ERRORCALLBACK_INSTANCETYPE_STUDIO_BANK".enum,
        "ERRORCALLBACK_INSTANCETYPE_STUDIO_COMMANDREPLAY".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_RESAMPLER}",

        "DSP_RESAMPLER_DEFAULT".enum("", "0"),
        "DSP_RESAMPLER_NOINTERP".enum,
        "DSP_RESAMPLER_LINEAR".enum,
        "DSP_RESAMPLER_CUBIC".enum,
        "DSP_RESAMPLER_SPLINE".enum,
        "DSP_RESAMPLER_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_CALLBACK_TYPE}",

        "DSP_CALLBACK_DATAPARAMETERRELEASE".enum("", "0"),
        "DSP_CALLBACK_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_DSPCONNECTION_TYPE}",

        "DSPCONNECTION_TYPE_STANDARD".enum("", "0"),
        "DSPCONNECTION_TYPE_SIDECHAIN".enum,
        "DSPCONNECTION_TYPE_SEND".enum,
        "DSPCONNECTION_TYPE_SEND_SIDECHAIN".enum,
        "DSPCONNECTION_TYPE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_TAGTYPE}",

        "TAGTYPE_UNKNOWN".enum("", "0"),
        "TAGTYPE_ID3V1".enum,
        "TAGTYPE_ID3V2".enum,
        "TAGTYPE_VORBISCOMMENT".enum,
        "TAGTYPE_SHOUTCAST".enum,
        "TAGTYPE_ICECAST".enum,
        "TAGTYPE_ASF".enum,
        "TAGTYPE_MIDI".enum,
        "TAGTYPE_PLAYLIST".enum,
        "TAGTYPE_FMOD".enum,
        "TAGTYPE_USER".enum,
        "TAGTYPE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_TAGDATATYPE}",

        "TAGDATATYPE_BINARY".enum("", "0"),
        "TAGDATATYPE_INT".enum,
        "TAGDATATYPE_FLOAT".enum,
        "TAGDATATYPE_STRING".enum,
        "TAGDATATYPE_STRING_UTF16".enum,
        "TAGDATATYPE_STRING_UTF16BE".enum,
        "TAGDATATYPE_STRING_UTF8".enum,
        "TAGDATATYPE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_PORT_TYPE}",

        "PORT_TYPE_MUSIC".enum("", "0"),
        "PORT_TYPE_COPYRIGHT_MUSIC".enum,
        "PORT_TYPE_VOICE".enum,
        "PORT_TYPE_CONTROLLER".enum,
        "PORT_TYPE_PERSONAL".enum,
        "PORT_TYPE_VIBRATION".enum,
        "PORT_TYPE_AUX".enum,
        "PORT_TYPE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_TYPE}",

        "DSP_TYPE_UNKNOWN".enum("", "0"),
        "DSP_TYPE_MIXER".enum,
        "DSP_TYPE_OSCILLATOR".enum,
        "DSP_TYPE_LOWPASS".enum,
        "DSP_TYPE_ITLOWPASS".enum,
        "DSP_TYPE_HIGHPASS".enum,
        "DSP_TYPE_ECHO".enum,
        "DSP_TYPE_FADER".enum,
        "DSP_TYPE_FLANGE".enum,
        "DSP_TYPE_DISTORTION".enum,
        "DSP_TYPE_NORMALIZE".enum,
        "DSP_TYPE_LIMITER".enum,
        "DSP_TYPE_PARAMEQ".enum,
        "DSP_TYPE_PITCHSHIFT".enum,
        "DSP_TYPE_CHORUS".enum,
        "DSP_TYPE_VSTPLUGIN".enum,
        "DSP_TYPE_WINAMPPLUGIN".enum,
        "DSP_TYPE_ITECHO".enum,
        "DSP_TYPE_COMPRESSOR".enum,
        "DSP_TYPE_SFXREVERB".enum,
        "DSP_TYPE_LOWPASS_SIMPLE".enum,
        "DSP_TYPE_DELAY".enum,
        "DSP_TYPE_TREMOLO".enum,
        "DSP_TYPE_LADSPAPLUGIN".enum,
        "DSP_TYPE_SEND".enum,
        "DSP_TYPE_RETURN".enum,
        "DSP_TYPE_HIGHPASS_SIMPLE".enum,
        "DSP_TYPE_PAN".enum,
        "DSP_TYPE_THREE_EQ".enum,
        "DSP_TYPE_FFT".enum,
        "DSP_TYPE_LOUDNESS_METER".enum,
        "DSP_TYPE_ENVELOPEFOLLOWER".enum,
        "DSP_TYPE_CONVOLUTIONREVERB".enum,
        "DSP_TYPE_CHANNELMIX".enum,
        "DSP_TYPE_TRANSCEIVER".enum,
        "DSP_TYPE_OBJECTPAN".enum,
        "DSP_TYPE_MULTIBAND_EQ".enum,
        "DSP_TYPE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_OSCILLATOR}",

        "DSP_OSCILLATOR_TYPE".enum("", "0"),
        "DSP_OSCILLATOR_RATE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_LOWPASS}",

        "DSP_LOWPASS_CUTOFF".enum("", "0"),
        "DSP_LOWPASS_RESONANCE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_ITLOWPASS}",

        "DSP_ITLOWPASS_CUTOFF".enum("", "0"),
        "DSP_ITLOWPASS_RESONANCE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_HIGHPASS}",

        "DSP_HIGHPASS_CUTOFF".enum("", "0"),
        "DSP_HIGHPASS_RESONANCE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_ECHO}",

        "DSP_ECHO_DELAY".enum("", "0"),
        "DSP_ECHO_FEEDBACK".enum,
        "DSP_ECHO_DRYLEVEL".enum,
        "DSP_ECHO_WETLEVEL".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_FADER}",

        "DSP_FADER_GAIN".enum("", "0"),
        "DSP_FADER_OVERALL_GAIN".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_FLANGE}",

        "DSP_FLANGE_MIX".enum("", "0"),
        "DSP_FLANGE_DEPTH".enum,
        "DSP_FLANGE_RATE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_DISTORTION}",

        "DSP_DISTORTION_LEVEL".enum("", "0")
    )

    EnumConstant(
        "{@code FMOD_DSP_NORMALIZE}",

        "DSP_NORMALIZE_FADETIME".enum("", "0"),
        "DSP_NORMALIZE_THRESHOLD".enum,
        "DSP_NORMALIZE_MAXAMP".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_LIMITER}",

        "DSP_LIMITER_RELEASETIME".enum("", "0"),
        "DSP_LIMITER_CEILING".enum,
        "DSP_LIMITER_MAXIMIZERGAIN".enum,
        "DSP_LIMITER_MODE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_PARAMEQ}",

        "DSP_PARAMEQ_CENTER".enum("", "0"),
        "DSP_PARAMEQ_BANDWIDTH".enum,
        "DSP_PARAMEQ_GAIN".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_MULTIBAND_EQ}",

        "DSP_MULTIBAND_EQ_A_FILTER".enum("", "0"),
        "DSP_MULTIBAND_EQ_A_FREQUENCY".enum,
        "DSP_MULTIBAND_EQ_A_Q".enum,
        "DSP_MULTIBAND_EQ_A_GAIN".enum,
        "DSP_MULTIBAND_EQ_B_FILTER".enum,
        "DSP_MULTIBAND_EQ_B_FREQUENCY".enum,
        "DSP_MULTIBAND_EQ_B_Q".enum,
        "DSP_MULTIBAND_EQ_B_GAIN".enum,
        "DSP_MULTIBAND_EQ_C_FILTER".enum,
        "DSP_MULTIBAND_EQ_C_FREQUENCY".enum,
        "DSP_MULTIBAND_EQ_C_Q".enum,
        "DSP_MULTIBAND_EQ_C_GAIN".enum,
        "DSP_MULTIBAND_EQ_D_FILTER".enum,
        "DSP_MULTIBAND_EQ_D_FREQUENCY".enum,
        "DSP_MULTIBAND_EQ_D_Q".enum,
        "DSP_MULTIBAND_EQ_D_GAIN".enum,
        "DSP_MULTIBAND_EQ_E_FILTER".enum,
        "DSP_MULTIBAND_EQ_E_FREQUENCY".enum,
        "DSP_MULTIBAND_EQ_E_Q".enum,
        "DSP_MULTIBAND_EQ_E_GAIN".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_MULTIBAND_EQ_FILTER_TYPE}",

        "DSP_MULTIBAND_EQ_FILTER_DISABLED".enum("", "0"),
        "DSP_MULTIBAND_EQ_FILTER_LOWPASS_12DB".enum,
        "DSP_MULTIBAND_EQ_FILTER_LOWPASS_24DB".enum,
        "DSP_MULTIBAND_EQ_FILTER_LOWPASS_48DB".enum,
        "DSP_MULTIBAND_EQ_FILTER_HIGHPASS_12DB".enum,
        "DSP_MULTIBAND_EQ_FILTER_HIGHPASS_24DB".enum,
        "DSP_MULTIBAND_EQ_FILTER_HIGHPASS_48DB".enum,
        "DSP_MULTIBAND_EQ_FILTER_LOWSHELF".enum,
        "DSP_MULTIBAND_EQ_FILTER_HIGHSHELF".enum,
        "DSP_MULTIBAND_EQ_FILTER_PEAKING".enum,
        "DSP_MULTIBAND_EQ_FILTER_BANDPASS".enum,
        "DSP_MULTIBAND_EQ_FILTER_NOTCH".enum,
        "DSP_MULTIBAND_EQ_FILTER_ALLPASS".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_PITCHSHIFT}",

        "DSP_PITCHSHIFT_PITCH".enum("", "0"),
        "DSP_PITCHSHIFT_FFTSIZE".enum,
        "DSP_PITCHSHIFT_OVERLAP".enum,
        "DSP_PITCHSHIFT_MAXCHANNELS".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_CHORUS}",

        "DSP_CHORUS_MIX".enum("", "0"),
        "DSP_CHORUS_RATE".enum,
        "DSP_CHORUS_DEPTH".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_ITECHO}",

        "DSP_ITECHO_WETDRYMIX".enum("", "0"),
        "DSP_ITECHO_FEEDBACK".enum,
        "DSP_ITECHO_LEFTDELAY".enum,
        "DSP_ITECHO_RIGHTDELAY".enum,
        "DSP_ITECHO_PANDELAY".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_COMPRESSOR}",

        "DSP_COMPRESSOR_THRESHOLD".enum("", "0"),
        "DSP_COMPRESSOR_RATIO".enum,
        "DSP_COMPRESSOR_ATTACK".enum,
        "DSP_COMPRESSOR_RELEASE".enum,
        "DSP_COMPRESSOR_GAINMAKEUP".enum,
        "DSP_COMPRESSOR_USESIDECHAIN".enum,
        "DSP_COMPRESSOR_LINKED".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_SFXREVERB}",

        "DSP_SFXREVERB_DECAYTIME".enum("", "0"),
        "DSP_SFXREVERB_EARLYDELAY".enum,
        "DSP_SFXREVERB_LATEDELAY".enum,
        "DSP_SFXREVERB_HFREFERENCE".enum,
        "DSP_SFXREVERB_HFDECAYRATIO".enum,
        "DSP_SFXREVERB_DIFFUSION".enum,
        "DSP_SFXREVERB_DENSITY".enum,
        "DSP_SFXREVERB_LOWSHELFFREQUENCY".enum,
        "DSP_SFXREVERB_LOWSHELFGAIN".enum,
        "DSP_SFXREVERB_HIGHCUT".enum,
        "DSP_SFXREVERB_EARLYLATEMIX".enum,
        "DSP_SFXREVERB_WETLEVEL".enum,
        "DSP_SFXREVERB_DRYLEVEL".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_LOWPASS_SIMPLE}",

        "DSP_LOWPASS_SIMPLE_CUTOFF".enum("", "0")
    )

    EnumConstant(
        "{@code FMOD_DSP_DELAY}",

        "DSP_DELAY_CH0".enum("", "0"),
        "DSP_DELAY_CH1".enum,
        "DSP_DELAY_CH2".enum,
        "DSP_DELAY_CH3".enum,
        "DSP_DELAY_CH4".enum,
        "DSP_DELAY_CH5".enum,
        "DSP_DELAY_CH6".enum,
        "DSP_DELAY_CH7".enum,
        "DSP_DELAY_CH8".enum,
        "DSP_DELAY_CH9".enum,
        "DSP_DELAY_CH10".enum,
        "DSP_DELAY_CH11".enum,
        "DSP_DELAY_CH12".enum,
        "DSP_DELAY_CH13".enum,
        "DSP_DELAY_CH14".enum,
        "DSP_DELAY_CH15".enum,
        "DSP_DELAY_MAXDELAY".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_TREMOLO}",

        "DSP_TREMOLO_FREQUENCY".enum("", "0"),
        "DSP_TREMOLO_DEPTH".enum,
        "DSP_TREMOLO_SHAPE".enum,
        "DSP_TREMOLO_SKEW".enum,
        "DSP_TREMOLO_DUTY".enum,
        "DSP_TREMOLO_SQUARE".enum,
        "DSP_TREMOLO_PHASE".enum,
        "DSP_TREMOLO_SPREAD".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_SEND}",

        "DSP_SEND_RETURNID".enum("", "0"),
        "DSP_SEND_LEVEL".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_RETURN}",

        "DSP_RETURN_ID".enum("", "0"),
        "DSP_RETURN_INPUT_SPEAKER_MODE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_HIGHPASS_SIMPLE}",

        "DSP_HIGHPASS_SIMPLE_CUTOFF".enum("", "0")
    )

    EnumConstant(
        "{@code FMOD_DSP_PAN_2D_STEREO_MODE_TYPE}",

        "DSP_PAN_2D_STEREO_MODE_DISTRIBUTED".enum("", "0"),
        "DSP_PAN_2D_STEREO_MODE_DISCRETE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_PAN_MODE_TYPE}",

        "DSP_PAN_MODE_MONO".enum("", "0"),
        "DSP_PAN_MODE_STEREO".enum,
        "DSP_PAN_MODE_SURROUND".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_PAN_3D_ROLLOFF_TYPE}",

        "DSP_PAN_3D_ROLLOFF_LINEARSQUARED".enum("", "0"),
        "DSP_PAN_3D_ROLLOFF_LINEAR".enum,
        "DSP_PAN_3D_ROLLOFF_INVERSE".enum,
        "DSP_PAN_3D_ROLLOFF_INVERSETAPERED".enum,
        "DSP_PAN_3D_ROLLOFF_CUSTOM".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_PAN_3D_EXTENT_MODE_TYPE}",

        "DSP_PAN_3D_EXTENT_MODE_AUTO".enum("", "0"),
        "DSP_PAN_3D_EXTENT_MODE_USER".enum,
        "DSP_PAN_3D_EXTENT_MODE_OFF".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_PAN}",

        "DSP_PAN_MODE".enum("", "0"),
        "DSP_PAN_2D_STEREO_POSITION".enum,
        "DSP_PAN_2D_DIRECTION".enum,
        "DSP_PAN_2D_EXTENT".enum,
        "DSP_PAN_2D_ROTATION".enum,
        "DSP_PAN_2D_LFE_LEVEL".enum,
        "DSP_PAN_2D_STEREO_MODE".enum,
        "DSP_PAN_2D_STEREO_SEPARATION".enum,
        "DSP_PAN_2D_STEREO_AXIS".enum,
        "DSP_PAN_ENABLED_SPEAKERS".enum,
        "DSP_PAN_3D_POSITION".enum,
        "DSP_PAN_3D_ROLLOFF".enum,
        "DSP_PAN_3D_MIN_DISTANCE".enum,
        "DSP_PAN_3D_MAX_DISTANCE".enum,
        "DSP_PAN_3D_EXTENT_MODE".enum,
        "DSP_PAN_3D_SOUND_SIZE".enum,
        "DSP_PAN_3D_MIN_EXTENT".enum,
        "DSP_PAN_3D_PAN_BLEND".enum,
        "DSP_PAN_LFE_UPMIX_ENABLED".enum,
        "DSP_PAN_OVERALL_GAIN".enum,
        "DSP_PAN_SURROUND_SPEAKER_MODE".enum,
        "DSP_PAN_2D_HEIGHT_BLEND".enum,
        "DSP_PAN_ATTENUATION_RANGE".enum,
        "DSP_PAN_OVERRIDE_RANGE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_THREE_EQ_CROSSOVERSLOPE_TYPE}",

        "DSP_THREE_EQ_CROSSOVERSLOPE_12DB".enum("", "0"),
        "DSP_THREE_EQ_CROSSOVERSLOPE_24DB".enum,
        "DSP_THREE_EQ_CROSSOVERSLOPE_48DB".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_THREE_EQ}",

        "DSP_THREE_EQ_LOWGAIN".enum("", "0"),
        "DSP_THREE_EQ_MIDGAIN".enum,
        "DSP_THREE_EQ_HIGHGAIN".enum,
        "DSP_THREE_EQ_LOWCROSSOVER".enum,
        "DSP_THREE_EQ_HIGHCROSSOVER".enum,
        "DSP_THREE_EQ_CROSSOVERSLOPE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_FFT_WINDOW}",

        "DSP_FFT_WINDOW_RECT".enum("", "0"),
        "DSP_FFT_WINDOW_TRIANGLE".enum,
        "DSP_FFT_WINDOW_HAMMING".enum,
        "DSP_FFT_WINDOW_HANNING".enum,
        "DSP_FFT_WINDOW_BLACKMAN".enum,
        "DSP_FFT_WINDOW_BLACKMANHARRIS".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_FFT}",

        "DSP_FFT_WINDOWSIZE".enum("", "0"),
        "DSP_FFT_WINDOWTYPE".enum,
        "DSP_FFT_SPECTRUMDATA".enum,
        "DSP_FFT_DOMINANT_FREQ".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_LOUDNESS_METER}",

        "DSP_LOUDNESS_METER_STATE".enum("", "0"),
        "DSP_LOUDNESS_METER_WEIGHTING".enum,
        "DSP_LOUDNESS_METER_INFO".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_LOUDNESS_METER_STATE_TYPE}",

        "DSP_LOUDNESS_METER_STATE_RESET_INTEGRATED".enum("", "-3"),
        "DSP_LOUDNESS_METER_STATE_RESET_MAXPEAK".enum,
        "DSP_LOUDNESS_METER_STATE_RESET_ALL".enum,
        "DSP_LOUDNESS_METER_STATE_PAUSED".enum,
        "DSP_LOUDNESS_METER_STATE_ANALYZING".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_ENVELOPEFOLLOWER}",

        "DSP_ENVELOPEFOLLOWER_ATTACK".enum("", "0"),
        "DSP_ENVELOPEFOLLOWER_RELEASE".enum,
        "DSP_ENVELOPEFOLLOWER_ENVELOPE".enum,
        "DSP_ENVELOPEFOLLOWER_USESIDECHAIN".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_CONVOLUTION_REVERB}",

        "DSP_CONVOLUTION_REVERB_PARAM_IR".enum("", "0"),
        "DSP_CONVOLUTION_REVERB_PARAM_WET".enum,
        "DSP_CONVOLUTION_REVERB_PARAM_DRY".enum,
        "DSP_CONVOLUTION_REVERB_PARAM_LINKED".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_CHANNELMIX_OUTPUT}",

        "DSP_CHANNELMIX_OUTPUT_DEFAULT".enum("", "0"),
        "DSP_CHANNELMIX_OUTPUT_ALLMONO".enum,
        "DSP_CHANNELMIX_OUTPUT_ALLSTEREO".enum,
        "DSP_CHANNELMIX_OUTPUT_ALLQUAD".enum,
        "DSP_CHANNELMIX_OUTPUT_ALL5POINT1".enum,
        "DSP_CHANNELMIX_OUTPUT_ALL7POINT1".enum,
        "DSP_CHANNELMIX_OUTPUT_ALLLFE".enum,
        "DSP_CHANNELMIX_OUTPUT_ALL7POINT1POINT4".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_CHANNELMIX}",

        "DSP_CHANNELMIX_OUTPUTGROUPING".enum("", "0"),
        "DSP_CHANNELMIX_GAIN_CH0".enum,
        "DSP_CHANNELMIX_GAIN_CH1".enum,
        "DSP_CHANNELMIX_GAIN_CH2".enum,
        "DSP_CHANNELMIX_GAIN_CH3".enum,
        "DSP_CHANNELMIX_GAIN_CH4".enum,
        "DSP_CHANNELMIX_GAIN_CH5".enum,
        "DSP_CHANNELMIX_GAIN_CH6".enum,
        "DSP_CHANNELMIX_GAIN_CH7".enum,
        "DSP_CHANNELMIX_GAIN_CH8".enum,
        "DSP_CHANNELMIX_GAIN_CH9".enum,
        "DSP_CHANNELMIX_GAIN_CH10".enum,
        "DSP_CHANNELMIX_GAIN_CH11".enum,
        "DSP_CHANNELMIX_GAIN_CH12".enum,
        "DSP_CHANNELMIX_GAIN_CH13".enum,
        "DSP_CHANNELMIX_GAIN_CH14".enum,
        "DSP_CHANNELMIX_GAIN_CH15".enum,
        "DSP_CHANNELMIX_GAIN_CH16".enum,
        "DSP_CHANNELMIX_GAIN_CH17".enum,
        "DSP_CHANNELMIX_GAIN_CH18".enum,
        "DSP_CHANNELMIX_GAIN_CH19".enum,
        "DSP_CHANNELMIX_GAIN_CH20".enum,
        "DSP_CHANNELMIX_GAIN_CH21".enum,
        "DSP_CHANNELMIX_GAIN_CH22".enum,
        "DSP_CHANNELMIX_GAIN_CH23".enum,
        "DSP_CHANNELMIX_GAIN_CH24".enum,
        "DSP_CHANNELMIX_GAIN_CH25".enum,
        "DSP_CHANNELMIX_GAIN_CH26".enum,
        "DSP_CHANNELMIX_GAIN_CH27".enum,
        "DSP_CHANNELMIX_GAIN_CH28".enum,
        "DSP_CHANNELMIX_GAIN_CH29".enum,
        "DSP_CHANNELMIX_GAIN_CH30".enum,
        "DSP_CHANNELMIX_GAIN_CH31".enum,
        "DSP_CHANNELMIX_OUTPUT_CH0".enum,
        "DSP_CHANNELMIX_OUTPUT_CH1".enum,
        "DSP_CHANNELMIX_OUTPUT_CH2".enum,
        "DSP_CHANNELMIX_OUTPUT_CH3".enum,
        "DSP_CHANNELMIX_OUTPUT_CH4".enum,
        "DSP_CHANNELMIX_OUTPUT_CH5".enum,
        "DSP_CHANNELMIX_OUTPUT_CH6".enum,
        "DSP_CHANNELMIX_OUTPUT_CH7".enum,
        "DSP_CHANNELMIX_OUTPUT_CH8".enum,
        "DSP_CHANNELMIX_OUTPUT_CH9".enum,
        "DSP_CHANNELMIX_OUTPUT_CH10".enum,
        "DSP_CHANNELMIX_OUTPUT_CH11".enum,
        "DSP_CHANNELMIX_OUTPUT_CH12".enum,
        "DSP_CHANNELMIX_OUTPUT_CH13".enum,
        "DSP_CHANNELMIX_OUTPUT_CH14".enum,
        "DSP_CHANNELMIX_OUTPUT_CH15".enum,
        "DSP_CHANNELMIX_OUTPUT_CH16".enum,
        "DSP_CHANNELMIX_OUTPUT_CH17".enum,
        "DSP_CHANNELMIX_OUTPUT_CH18".enum,
        "DSP_CHANNELMIX_OUTPUT_CH19".enum,
        "DSP_CHANNELMIX_OUTPUT_CH20".enum,
        "DSP_CHANNELMIX_OUTPUT_CH21".enum,
        "DSP_CHANNELMIX_OUTPUT_CH22".enum,
        "DSP_CHANNELMIX_OUTPUT_CH23".enum,
        "DSP_CHANNELMIX_OUTPUT_CH24".enum,
        "DSP_CHANNELMIX_OUTPUT_CH25".enum,
        "DSP_CHANNELMIX_OUTPUT_CH26".enum,
        "DSP_CHANNELMIX_OUTPUT_CH27".enum,
        "DSP_CHANNELMIX_OUTPUT_CH28".enum,
        "DSP_CHANNELMIX_OUTPUT_CH29".enum,
        "DSP_CHANNELMIX_OUTPUT_CH30".enum,
        "DSP_CHANNELMIX_OUTPUT_CH31".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_TRANSCEIVER_SPEAKERMODE}",

        "DSP_TRANSCEIVER_SPEAKERMODE_AUTO".enum("", "-1"),
        "DSP_TRANSCEIVER_SPEAKERMODE_MONO".enum,
        "DSP_TRANSCEIVER_SPEAKERMODE_STEREO".enum,
        "DSP_TRANSCEIVER_SPEAKERMODE_SURROUND".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_TRANSCEIVER}",

        "DSP_TRANSCEIVER_TRANSMIT".enum("", "0"),
        "DSP_TRANSCEIVER_GAIN".enum,
        "DSP_TRANSCEIVER_CHANNEL".enum,
        "DSP_TRANSCEIVER_TRANSMITSPEAKERMODE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_OBJECTPAN}",

        "DSP_OBJECTPAN_3D_POSITION".enum("", "0"),
        "DSP_OBJECTPAN_3D_ROLLOFF".enum,
        "DSP_OBJECTPAN_3D_MIN_DISTANCE".enum,
        "DSP_OBJECTPAN_3D_MAX_DISTANCE".enum,
        "DSP_OBJECTPAN_3D_EXTENT_MODE".enum,
        "DSP_OBJECTPAN_3D_SOUND_SIZE".enum,
        "DSP_OBJECTPAN_3D_MIN_EXTENT".enum,
        "DSP_OBJECTPAN_OVERALL_GAIN".enum,
        "DSP_OBJECTPAN_OUTPUTGAIN".enum,
        "DSP_OBJECTPAN_ATTENUATION_RANGE".enum,
        "DSP_OBJECTPAN_OVERRIDE_RANGE".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_PROCESS_OPERATION}",

        "DSP_PROCESS_PERFORM".enum("", "0"),
        "DSP_PROCESS_QUERY".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_PAN_SURROUND_FLAGS}",

        "DSP_PAN_SURROUND_DEFAULT".enum("", "0"),
        "DSP_PAN_SURROUND_ROTATION_NOT_BIASED".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_PARAMETER_TYPE}",

        "DSP_PARAMETER_TYPE_FLOAT".enum("", "0"),
        "DSP_PARAMETER_TYPE_INT".enum,
        "DSP_PARAMETER_TYPE_BOOL".enum,
        "DSP_PARAMETER_TYPE_DATA".enum,
        "DSP_PARAMETER_TYPE_MAX".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE}",

        "DSP_PARAMETER_FLOAT_MAPPING_TYPE_LINEAR".enum("", "0"),
        "DSP_PARAMETER_FLOAT_MAPPING_TYPE_AUTO".enum,
        "DSP_PARAMETER_FLOAT_MAPPING_TYPE_PIECEWISE_LINEAR".enum
    )

    EnumConstant(
        "{@code FMOD_DSP_PARAMETER_DATA_TYPE}",

        "DSP_PARAMETER_DATA_TYPE_USER".enum("", "0"),
        "DSP_PARAMETER_DATA_TYPE_OVERALLGAIN".enum("", "-1"),
        "DSP_PARAMETER_DATA_TYPE_3DATTRIBUTES".enum("", "-2"),
        "DSP_PARAMETER_DATA_TYPE_SIDECHAIN".enum("", "-3"),
        "DSP_PARAMETER_DATA_TYPE_FFT".enum("", "-4"),
        "DSP_PARAMETER_DATA_TYPE_3DATTRIBUTES_MULTI".enum("", "-5"),
        "DSP_PARAMETER_DATA_TYPE_ATTENUATION_RANGE".enum("", "-6")
    )

    FMOD_RESULT(
        "Memory_Initialize",
        "",

        nullable..void.p("poolmem", ""),
        AutoSize("poolmem")..int("poollen", ""),
        nullable..FMOD_MEMORY_ALLOC_CALLBACK("useralloc", ""),
        nullable..FMOD_MEMORY_REALLOC_CALLBACK("userrealloc", ""),
        nullable..FMOD_MEMORY_FREE_CALLBACK("userfree", ""),
        FMOD_MEMORY_TYPE("memtypeflags", "")
    )

    FMOD_RESULT(
        "Memory_GetStats",
        "",

        nullable..Check(1)..int.p("currentalloced", ""),
        nullable..Check(1)..int.p("maxalloced", ""),
        FMOD_BOOL("blocking", "")
    )

    FMOD_RESULT(
        "Debug_Initialize",
        "",

        FMOD_DEBUG_FLAGS("flags", ""),
        FMOD_DEBUG_MODE("mode", ""),
        nullable..FMOD_DEBUG_CALLBACK("callback", ""),
        nullable..charUTF8.const.p("filename", "")
    )

    FMOD_RESULT(
        "File_SetDiskBusy",
        "",

        int("busy", "")
    )

    FMOD_RESULT(
        "File_GetDiskBusy",
        "",

        Check(1)..int.p("busy", "")
    )

    FMOD_RESULT(
        "Thread_SetAttributes",
        "",

        FMOD_THREAD_TYPE("type", ""),
        FMOD_THREAD_AFFINITY("affinity", ""),
        FMOD_THREAD_PRIORITY("priority", ""),
        FMOD_THREAD_STACK_SIZE("stacksize", "")
    )

    FMOD_RESULT(
        "System_Create",
        "FMOD System factory functions.  Use this to create an FMOD System Instance.  below you will see FMOD_System_Init/Close to get started.",

        Check(1)..FMOD_SYSTEM.p.p("system", ""),
        unsigned_int("headerversion", "")
    )

    FMOD_RESULT(
        "System_Release",
        "",

        FMOD_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_SetOutput",
        "Setup functions.",

        FMOD_SYSTEM.p("system", ""),
        FMOD_OUTPUTTYPE("output", "")
    )

    FMOD_RESULT(
        "System_GetOutput",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..FMOD_OUTPUTTYPE.p("output", "")
    )

    FMOD_RESULT(
        "System_GetNumDrivers",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..int.p("numdrivers", "")
    )

    FMOD_RESULT(
        "System_GetDriverInfo",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("id", ""),
        nullable..char.p("name", ""),
        AutoSize("name")..int("namelen", ""),
        nullable..FMOD_GUID.p("guid", ""),
        nullable..Check(1)..int.p("systemrate", ""),
        nullable..Check(1)..FMOD_SPEAKERMODE.p("speakermode", ""),
        nullable..Check(1)..int.p("speakermodechannels", "")
    )

    FMOD_RESULT(
        "System_SetDriver",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("driver", "")
    )

    FMOD_RESULT(
        "System_GetDriver",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..int.p("driver", "")
    )

    FMOD_RESULT(
        "System_SetSoftwareChannels",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("numsoftwarechannels", "")
    )

    FMOD_RESULT(
        "System_GetSoftwareChannels",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..int.p("numsoftwarechannels", "")
    )

    FMOD_RESULT(
        "System_SetSoftwareFormat",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("samplerate", ""),
        FMOD_SPEAKERMODE("speakermode", ""),
        int("numrawspeakers", "")
    )

    FMOD_RESULT(
        "System_GetSoftwareFormat",
        "",

        FMOD_SYSTEM.p("system", ""),
        nullable..Check(1)..int.p("samplerate", ""),
        nullable..Check(1)..FMOD_SPEAKERMODE.p("speakermode", ""),
        nullable..Check(1)..int.p("numrawspeakers", "")
    )

    FMOD_RESULT(
        "System_SetDSPBufferSize",
        "",

        FMOD_SYSTEM.p("system", ""),
        unsigned_int("bufferlength", ""),
        int("numbuffers", "")
    )

    FMOD_RESULT(
        "System_GetDSPBufferSize",
        "",

        FMOD_SYSTEM.p("system", ""),
        nullable..Check(1)..unsigned_int.p("bufferlength", ""),
        nullable..Check(1)..int.p("numbuffers", "")
    )

    FMOD_RESULT(
        "System_SetFileSystem",
        "",

        FMOD_SYSTEM.p("system", ""),
        nullable..FMOD_FILE_OPEN_CALLBACK("useropen", ""),
        nullable..FMOD_FILE_CLOSE_CALLBACK("userclose", ""),
        nullable..FMOD_FILE_READ_CALLBACK("userread", ""),
        nullable..FMOD_FILE_SEEK_CALLBACK("userseek", ""),
        nullable..FMOD_FILE_ASYNCREAD_CALLBACK("userasyncread", ""),
        nullable..FMOD_FILE_ASYNCCANCEL_CALLBACK("userasynccancel", ""),
        int("blockalign", "")
    )

    FMOD_RESULT(
        "System_AttachFileSystem",
        "",

        FMOD_SYSTEM.p("system", ""),
        nullable..FMOD_FILE_OPEN_CALLBACK("useropen", ""),
        nullable..FMOD_FILE_CLOSE_CALLBACK("userclose", ""),
        nullable..FMOD_FILE_READ_CALLBACK("userread", ""),
        nullable..FMOD_FILE_SEEK_CALLBACK("userseek", "")
    )

    FMOD_RESULT(
        "System_SetAdvancedSettings",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_ADVANCEDSETTINGS.p("settings", "")
    )

    FMOD_RESULT(
        "System_GetAdvancedSettings",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_ADVANCEDSETTINGS.p("settings", "")
    )

    FMOD_RESULT(
        "System_SetCallback",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_SYSTEM_CALLBACK("callback", ""),
        FMOD_SYSTEM_CALLBACK_TYPE("callbackmask", "")
    )

    FMOD_RESULT(
        "System_SetPluginPath",
        "Plug-in support.",

        FMOD_SYSTEM.p("system", ""),
        charUTF8.const.p("path", "")
    )

    FMOD_RESULT(
        "System_LoadPlugin",
        "",

        FMOD_SYSTEM.p("system", ""),
        charUTF8.const.p("filename", ""),
        Check(1)..unsigned_int.p("handle", ""),
        unsigned_int("priority", "")
    )

    FMOD_RESULT(
        "System_UnloadPlugin",
        "",

        FMOD_SYSTEM.p("system", ""),
        unsigned_int("handle", "")
    )

    FMOD_RESULT(
        "System_GetNumNestedPlugins",
        "",

        FMOD_SYSTEM.p("system", ""),
        unsigned_int("handle", ""),
        Check(1)..int.p("count", "")
    )

    FMOD_RESULT(
        "System_GetNestedPlugin",
        "",

        FMOD_SYSTEM.p("system", ""),
        unsigned_int("handle", ""),
        int("index", ""),
        Check(1)..unsigned_int.p("nestedhandle", "")
    )

    FMOD_RESULT(
        "System_GetNumPlugins",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_PLUGINTYPE("plugintype", ""),
        Check(1)..int.p("numplugins", "")
    )

    FMOD_RESULT(
        "System_GetPluginHandle",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_PLUGINTYPE("plugintype", ""),
        int("index", ""),
        Check(1)..unsigned_int.p("handle", "")
    )

    FMOD_RESULT(
        "System_GetPluginInfo",
        "",

        FMOD_SYSTEM.p("system", ""),
        unsigned_int("handle", ""),
        nullable..Check(1)..FMOD_PLUGINTYPE.p("plugintype", ""),
        nullable..char.p("name", ""),
        AutoSize("name")..int("namelen", ""),
        nullable..Check(1)..unsigned_int.p("version", "")
    )

    FMOD_RESULT(
        "System_SetOutputByPlugin",
        "",

        FMOD_SYSTEM.p("system", ""),
        unsigned_int("handle", "")
    )

    FMOD_RESULT(
        "System_GetOutputByPlugin",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..unsigned_int.p("handle", "")
    )

    FMOD_RESULT(
        "System_CreateDSPByPlugin",
        "",

        FMOD_SYSTEM.p("system", ""),
        unsigned_int("handle", ""),
        Check(1)..FMOD_DSP.p.p("dsp", "")
    )

    FMOD_RESULT(
        "System_GetDSPInfoByPlugin",
        "",

        FMOD_SYSTEM.p("system", ""),
        unsigned_int("handle", ""),
        Check(1)..FMOD_DSP_DESCRIPTION.const.p.p("description", "")
    )

    FMOD_RESULT(
        "System_RegisterCodec",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_CODEC_DESCRIPTION.p("description", ""),
        Check(1)..unsigned_int.p("handle", ""),
        unsigned_int("priority", "")
    )

    FMOD_RESULT(
        "System_RegisterDSP",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_DSP_DESCRIPTION.const.p("description", ""),
        Check(1)..unsigned_int.p("handle", "")
    )

    FMOD_RESULT(
        "System_RegisterOutput",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_OUTPUT_DESCRIPTION.const.p("description", ""),
        Check(1)..unsigned_int.p("handle", "")
    )

    FMOD_RESULT(
        "System_Init",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("maxchannels", ""),
        FMOD_INITFLAGS("flags", ""),
        nullable..opaque_p("extradriverdata", "")
    )

    FMOD_RESULT(
        "System_Close",
        "",

        FMOD_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_Update",
        "",

        FMOD_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_SetSpeakerPosition",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_SPEAKER("speaker", ""),
        float("x", ""),
        float("y", ""),
        FMOD_BOOL("active", "")
    )

    FMOD_RESULT(
        "System_GetSpeakerPosition",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_SPEAKER("speaker", ""),
        nullable..Check(1)..float.p("x", ""),
        nullable..Check(1)..float.p("y", ""),
        nullable..Check(1)..FMOD_BOOL.p("active", "")
    )

    FMOD_RESULT(
        "System_SetStreamBufferSize",
        "",

        FMOD_SYSTEM.p("system", ""),
        unsigned_int("filebuffersize", ""),
        FMOD_TIMEUNIT("filebuffersizetype", "")
    )

    FMOD_RESULT(
        "System_GetStreamBufferSize",
        "",

        FMOD_SYSTEM.p("system", ""),
        nullable..Check(1)..unsigned_int.p("filebuffersize", ""),
        nullable..Check(1)..FMOD_TIMEUNIT.p("filebuffersizetype", "")
    )

    FMOD_RESULT(
        "System_Set3DSettings",
        "",

        FMOD_SYSTEM.p("system", ""),
        float("dopplerscale", ""),
        float("distancefactor", ""),
        float("rolloffscale", "")
    )

    FMOD_RESULT(
        "System_Get3DSettings",
        "",

        FMOD_SYSTEM.p("system", ""),
        nullable..Check(1)..float.p("dopplerscale", ""),
        nullable..Check(1)..float.p("distancefactor", ""),
        nullable..Check(1)..float.p("rolloffscale", "")
    )

    FMOD_RESULT(
        "System_Set3DNumListeners",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("numlisteners", "")
    )

    FMOD_RESULT(
        "System_Get3DNumListeners",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..int.p("numlisteners", "")
    )

    FMOD_RESULT(
        "System_Set3DListenerAttributes",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("listener", ""),
        nullable..FMOD_VECTOR.const.p("pos", ""),
        nullable..FMOD_VECTOR.const.p("vel", ""),
        nullable..FMOD_VECTOR.const.p("forward", ""),
        nullable..FMOD_VECTOR.const.p("up", "")
    )

    FMOD_RESULT(
        "System_Get3DListenerAttributes",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("listener", ""),
        nullable..FMOD_VECTOR.p("pos", ""),
        nullable..FMOD_VECTOR.p("vel", ""),
        nullable..FMOD_VECTOR.p("forward", ""),
        nullable..FMOD_VECTOR.p("up", "")
    )

    FMOD_RESULT(
        "System_Set3DRolloffCallback",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_3D_ROLLOFF_CALLBACK("callback", "")
    )

    FMOD_RESULT(
        "System_MixerSuspend",
        "",

        FMOD_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_MixerResume",
        "",

        FMOD_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_GetDefaultMixMatrix",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_SPEAKERMODE("sourcespeakermode", ""),
        FMOD_SPEAKERMODE("targetspeakermode", ""),
        Unsafe..float.p("matrix", ""),
        int("matrixhop", "")
    )

    FMOD_RESULT(
        "System_GetSpeakerModeChannels",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_SPEAKERMODE("mode", ""),
        Check(1)..int.p("channels", "")
    )

    FMOD_RESULT(
        "System_GetVersion",
        "System information functions.",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..unsigned_int.p("version", "")
    )

    FMOD_RESULT(
        "System_GetOutputHandle",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..void.p.p("handle", "")
    )

    FMOD_RESULT(
        "System_GetChannelsPlaying",
        "",

        FMOD_SYSTEM.p("system", ""),
        nullable..Check(1)..int.p("channels", ""),
        nullable..Check(1)..int.p("realchannels", "")
    )

    FMOD_RESULT(
        "System_GetCPUUsage",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_CPU_USAGE.p("usage", "")
    )

    FMOD_RESULT(
        "System_GetFileUsage",
        "",

        FMOD_SYSTEM.p("system", ""),
        nullable..Check(1)..long_long.p("sampleBytesRead", ""),
        nullable..Check(1)..long_long.p("streamBytesRead", ""),
        nullable..Check(1)..long_long.p("otherBytesRead", "")
    )

    FMOD_RESULT(
        "System_CreateSound",
        "Sound/DSP/Channel/FX creation and retrieval.",

        FMOD_SYSTEM.p("system", ""),
        Unsafe..char.const.p("name_or_data", ""),
        FMOD_MODE("mode", ""),
        nullable..FMOD_CREATESOUNDEXINFO.p("exinfo", ""),
        Check(1)..FMOD_SOUND.p.p("sound", "")
    )

    FMOD_RESULT(
        "System_CreateStream",
        "",

        FMOD_SYSTEM.p("system", ""),
        Unsafe..char.const.p("name_or_data", ""),
        FMOD_MODE("mode", ""),
        nullable..FMOD_CREATESOUNDEXINFO.p("exinfo", ""),
        Check(1)..FMOD_SOUND.p.p("sound", "")
    )

    FMOD_RESULT(
        "System_CreateDSP",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_DSP_DESCRIPTION.const.p("description", ""),
        Check(1)..FMOD_DSP.p.p("dsp", "")
    )

    FMOD_RESULT(
        "System_CreateDSPByType",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_DSP_TYPE("type", ""),
        Check(1)..FMOD_DSP.p.p("dsp", "")
    )

    FMOD_RESULT(
        "System_CreateChannelGroup",
        "",

        FMOD_SYSTEM.p("system", ""),
        nullable..charUTF8.const.p("name", ""),
        Check(1)..FMOD_CHANNELGROUP.p.p("channelgroup", "")
    )

    FMOD_RESULT(
        "System_CreateSoundGroup",
        "",

        FMOD_SYSTEM.p("system", ""),
        charUTF8.const.p("name", ""),
        Check(1)..FMOD_SOUNDGROUP.p.p("soundgroup", "")
    )

    FMOD_RESULT(
        "System_CreateReverb3D",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..FMOD_REVERB3D.p.p("reverb", "")
    )

    FMOD_RESULT(
        "System_PlaySound",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_SOUND.p("sound", ""),
        nullable..FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_BOOL("paused", ""),
        nullable..Check(1)..FMOD_CHANNEL.p.p("channel", "")
    )

    FMOD_RESULT(
        "System_PlayDSP",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_DSP.p("dsp", ""),
        nullable..FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_BOOL("paused", ""),
        nullable..Check(1)..FMOD_CHANNEL.p.p("channel", "")
    )

    FMOD_RESULT(
        "System_GetChannel",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("channelid", ""),
        Check(1)..FMOD_CHANNEL.p.p("channel", "")
    )

    FMOD_RESULT(
        "System_GetDSPInfoByType",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_DSP_TYPE("type", ""),
        Check(1)..FMOD_DSP_DESCRIPTION.const.p.p("description", "")
    )

    FMOD_RESULT(
        "System_GetMasterChannelGroup",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..FMOD_CHANNELGROUP.p.p("channelgroup", "")
    )

    FMOD_RESULT(
        "System_GetMasterSoundGroup",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..FMOD_SOUNDGROUP.p.p("soundgroup", "")
    )

    FMOD_RESULT(
        "System_AttachChannelGroupToPort",
        "Routing to ports.",

        FMOD_SYSTEM.p("system", ""),
        FMOD_PORT_TYPE("portType", ""),
        FMOD_PORT_INDEX("portIndex", ""),
        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_BOOL("passThru", "")
    )

    FMOD_RESULT(
        "System_DetachChannelGroupFromPort",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_CHANNELGROUP.p("channelgroup", "")
    )

    FMOD_RESULT(
        "System_SetReverbProperties",
        "Reverb API.",

        FMOD_SYSTEM.p("system", ""),
        int("instance", ""),
        nullable..FMOD_REVERB_PROPERTIES.const.p("prop", "")
    )

    FMOD_RESULT(
        "System_GetReverbProperties",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("instance", ""),
        FMOD_REVERB_PROPERTIES.p("prop", "")
    )

    FMOD_RESULT(
        "System_LockDSP",
        "System level DSP functionality.",

        FMOD_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_UnlockDSP",
        "",

        FMOD_SYSTEM.p("system", "")
    )

    FMOD_RESULT(
        "System_GetRecordNumDrivers",
        "Recording API.",

        FMOD_SYSTEM.p("system", ""),
        nullable..Check(1)..int.p("numdrivers", ""),
        nullable..Check(1)..int.p("numconnected", "")
    )

    FMOD_RESULT(
        "System_GetRecordDriverInfo",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("id", ""),
        nullable..char.p("name", ""),
        AutoSize("name")..int("namelen", ""),
        nullable..FMOD_GUID.p("guid", ""),
        nullable..Check(1)..int.p("systemrate", ""),
        nullable..Check(1)..FMOD_SPEAKERMODE.p("speakermode", ""),
        nullable..Check(1)..int.p("speakermodechannels", ""),
        nullable..Check(1)..FMOD_DRIVER_STATE.p("state", "")
    )

    FMOD_RESULT(
        "System_GetRecordPosition",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("id", ""),
        Check(1)..unsigned_int.p("position", "")
    )

    FMOD_RESULT(
        "System_RecordStart",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("id", ""),
        FMOD_SOUND.p("sound", ""),
        FMOD_BOOL("loop", "")
    )

    FMOD_RESULT(
        "System_RecordStop",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("id", "")
    )

    FMOD_RESULT(
        "System_IsRecording",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("id", ""),
        nullable..Check(1)..FMOD_BOOL.p("recording", "")
    )

    FMOD_RESULT(
        "System_CreateGeometry",
        "Geometry API.",

        FMOD_SYSTEM.p("system", ""),
        int("maxpolygons", ""),
        int("maxvertices", ""),
        Check(1)..FMOD_GEOMETRY.p.p("geometry", "")
    )

    FMOD_RESULT(
        "System_SetGeometrySettings",
        "",

        FMOD_SYSTEM.p("system", ""),
        float("maxworldsize", "")
    )

    FMOD_RESULT(
        "System_GetGeometrySettings",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..float.p("maxworldsize", "")
    )

    FMOD_RESULT(
        "System_LoadGeometry",
        "",

        FMOD_SYSTEM.p("system", ""),
        void.const.p("data", ""),
        AutoSize("data")..int("datasize", ""),
        Check(1)..FMOD_GEOMETRY.p.p("geometry", "")
    )

    FMOD_RESULT(
        "System_GetGeometryOcclusion",
        "",

        FMOD_SYSTEM.p("system", ""),
        FMOD_VECTOR.const.p("listener", ""),
        FMOD_VECTOR.const.p("source", ""),
        nullable..Check(1)..float.p("direct", ""),
        nullable..Check(1)..float.p("reverb", "")
    )

    FMOD_RESULT(
        "System_SetNetworkProxy",
        "Network functions.",

        FMOD_SYSTEM.p("system", ""),
        charUTF8.const.p("proxy", "")
    )

    FMOD_RESULT(
        "System_GetNetworkProxy",
        "",

        FMOD_SYSTEM.p("system", ""),
        char.p("proxy", ""),
        AutoSize("proxy")..int("proxylen", "")
    )

    FMOD_RESULT(
        "System_SetNetworkTimeout",
        "",

        FMOD_SYSTEM.p("system", ""),
        int("timeout", "")
    )

    FMOD_RESULT(
        "System_GetNetworkTimeout",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..int.p("timeout", "")
    )

    FMOD_RESULT(
        "System_SetUserData",
        "",

        FMOD_SYSTEM.p("system", ""),
        opaque_p("userdata", "")
    )

    FMOD_RESULT(
        "System_GetUserData",
        "",

        FMOD_SYSTEM.p("system", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "Sound_Release",
        "",

        FMOD_SOUND.p("sound", "")
    )

    FMOD_RESULT(
        "Sound_GetSystemObject",
        "",

        FMOD_SOUND.p("sound", ""),
        Check(1)..FMOD_SYSTEM.p.p("system", "")
    )

    FMOD_RESULT(
        "Sound_Lock",
        "",

        FMOD_SOUND.p("sound", ""),
        unsigned_int("offset", ""),
        unsigned_int("length", ""),
        Check(1)..void.p.p("ptr1", ""),
        Check(1)..void.p.p("ptr2", ""),
        Check(1)..unsigned_int.p("len1", ""),
        Check(1)..unsigned_int.p("len2", "")
    )

    FMOD_RESULT(
        "Sound_Unlock",
        "",

        FMOD_SOUND.p("sound", ""),
        void.p("ptr1", ""),
        void.p("ptr2", ""),
        AutoSize("ptr1")..unsigned_int("len1", ""),
        AutoSize("ptr2")..unsigned_int("len2", "")
    )

    FMOD_RESULT(
        "Sound_SetDefaults",
        "",

        FMOD_SOUND.p("sound", ""),
        float("frequency", ""),
        int("priority", "")
    )

    FMOD_RESULT(
        "Sound_GetDefaults",
        "",

        FMOD_SOUND.p("sound", ""),
        nullable..Check(1)..float.p("frequency", ""),
        nullable..Check(1)..int.p("priority", "")
    )

    FMOD_RESULT(
        "Sound_Set3DMinMaxDistance",
        "",

        FMOD_SOUND.p("sound", ""),
        float("min", ""),
        float("max", "")
    )

    FMOD_RESULT(
        "Sound_Get3DMinMaxDistance",
        "",

        FMOD_SOUND.p("sound", ""),
        nullable..Check(1)..float.p("min", ""),
        nullable..Check(1)..float.p("max", "")
    )

    FMOD_RESULT(
        "Sound_Set3DConeSettings",
        "",

        FMOD_SOUND.p("sound", ""),
        float("insideconeangle", ""),
        float("outsideconeangle", ""),
        float("outsidevolume", "")
    )

    FMOD_RESULT(
        "Sound_Get3DConeSettings",
        "",

        FMOD_SOUND.p("sound", ""),
        nullable..Check(1)..float.p("insideconeangle", ""),
        nullable..Check(1)..float.p("outsideconeangle", ""),
        nullable..Check(1)..float.p("outsidevolume", "")
    )

    FMOD_RESULT(
        "Sound_Set3DCustomRolloff",
        "",

        FMOD_SOUND.p("sound", ""),
        FMOD_VECTOR.p("points", ""),
        AutoSize("points")..int("numpoints", "")
    )

    FMOD_RESULT(
        "Sound_Get3DCustomRolloff",
        "",

        FMOD_SOUND.p("sound", ""),
        nullable..Check(1)..FMOD_VECTOR.p.p("points", ""),
        nullable..Check(1)..int.p("numpoints", "")
    )

    FMOD_RESULT(
        "Sound_GetSubSound",
        "",

        FMOD_SOUND.p("sound", ""),
        int("index", ""),
        Check(1)..FMOD_SOUND.p.p("subsound", "")
    )

    FMOD_RESULT(
        "Sound_GetSubSoundParent",
        "",

        FMOD_SOUND.p("sound", ""),
        Check(1)..FMOD_SOUND.p.p("parentsound", "")
    )

    FMOD_RESULT(
        "Sound_GetName",
        "",

        FMOD_SOUND.p("sound", ""),
        char.p("name", ""),
        AutoSize("name")..int("namelen", "")
    )

    FMOD_RESULT(
        "Sound_GetLength",
        "",

        FMOD_SOUND.p("sound", ""),
        Check(1)..unsigned_int.p("length", ""),
        FMOD_TIMEUNIT("lengthtype", "")
    )

    FMOD_RESULT(
        "Sound_GetFormat",
        "",

        FMOD_SOUND.p("sound", ""),
        nullable..Check(1)..FMOD_SOUND_TYPE.p("type", ""),
        nullable..Check(1)..FMOD_SOUND_FORMAT.p("format", ""),
        nullable..Check(1)..int.p("channels", ""),
        nullable..Check(1)..int.p("bits", "")
    )

    FMOD_RESULT(
        "Sound_GetNumSubSounds",
        "",

        FMOD_SOUND.p("sound", ""),
        Check(1)..int.p("numsubsounds", "")
    )

    FMOD_RESULT(
        "Sound_GetNumTags",
        "",

        FMOD_SOUND.p("sound", ""),
        nullable..Check(1)..int.p("numtags", ""),
        nullable..Check(1)..int.p("numtagsupdated", "")
    )

    FMOD_RESULT(
        "Sound_GetTag",
        "",

        FMOD_SOUND.p("sound", ""),
        charUTF8.const.p("name", ""),
        int("index", ""),
        FMOD_TAG.p("tag", "")
    )

    FMOD_RESULT(
        "Sound_GetOpenState",
        "",

        FMOD_SOUND.p("sound", ""),
        nullable..Check(1)..FMOD_OPENSTATE.p("openstate", ""),
        nullable..Check(1)..unsigned_int.p("percentbuffered", ""),
        nullable..Check(1)..FMOD_BOOL.p("starving", ""),
        nullable..Check(1)..FMOD_BOOL.p("diskbusy", "")
    )

    FMOD_RESULT(
        "Sound_ReadData",
        "",

        FMOD_SOUND.p("sound", ""),
        void.p("buffer", ""),
        AutoSize("buffer")..unsigned_int("length", ""),
        nullable..Check(1)..unsigned_int.p("read", "")
    )

    FMOD_RESULT(
        "Sound_SeekData",
        "",

        FMOD_SOUND.p("sound", ""),
        unsigned_int("pcm", "")
    )

    FMOD_RESULT(
        "Sound_SetSoundGroup",
        "",

        FMOD_SOUND.p("sound", ""),
        FMOD_SOUNDGROUP.p("soundgroup", "")
    )

    FMOD_RESULT(
        "Sound_GetSoundGroup",
        "",

        FMOD_SOUND.p("sound", ""),
        Check(1)..FMOD_SOUNDGROUP.p.p("soundgroup", "")
    )

    FMOD_RESULT(
        "Sound_GetNumSyncPoints",
        "",

        FMOD_SOUND.p("sound", ""),
        Check(1)..int.p("numsyncpoints", "")
    )

    FMOD_RESULT(
        "Sound_GetSyncPoint",
        "",

        FMOD_SOUND.p("sound", ""),
        int("index", ""),
        Check(1)..FMOD_SYNCPOINT.p.p("point", "")
    )

    FMOD_RESULT(
        "Sound_GetSyncPointInfo",
        "",

        FMOD_SOUND.p("sound", ""),
        FMOD_SYNCPOINT.p("point", ""),
        char.p("name", ""),
        AutoSize("name")..int("namelen", ""),
        nullable..Check(1)..unsigned_int.p("offset", ""),
        FMOD_TIMEUNIT("offsettype", "")
    )

    FMOD_RESULT(
        "Sound_AddSyncPoint",
        "",

        FMOD_SOUND.p("sound", ""),
        unsigned_int("offset", ""),
        FMOD_TIMEUNIT("offsettype", ""),
        charUTF8.const.p("name", ""),
        nullable..Check(1)..FMOD_SYNCPOINT.p.p("point", "")
    )

    FMOD_RESULT(
        "Sound_DeleteSyncPoint",
        "",

        FMOD_SOUND.p("sound", ""),
        FMOD_SYNCPOINT.p("point", "")
    )

    FMOD_RESULT(
        "Sound_SetMode",
        "Functions also in Channel class but here they are the 'default' to save having to change it in Channel all the time.",

        FMOD_SOUND.p("sound", ""),
        FMOD_MODE("mode", "")
    )

    FMOD_RESULT(
        "Sound_GetMode",
        "",

        FMOD_SOUND.p("sound", ""),
        Check(1)..FMOD_MODE.p("mode", "")
    )

    FMOD_RESULT(
        "Sound_SetLoopCount",
        "",

        FMOD_SOUND.p("sound", ""),
        int("loopcount", "")
    )

    FMOD_RESULT(
        "Sound_GetLoopCount",
        "",

        FMOD_SOUND.p("sound", ""),
        Check(1)..int.p("loopcount", "")
    )

    FMOD_RESULT(
        "Sound_SetLoopPoints",
        "",

        FMOD_SOUND.p("sound", ""),
        unsigned_int("loopstart", ""),
        FMOD_TIMEUNIT("loopstarttype", ""),
        unsigned_int("loopend", ""),
        FMOD_TIMEUNIT("loopendtype", "")
    )

    FMOD_RESULT(
        "Sound_GetLoopPoints",
        "",

        FMOD_SOUND.p("sound", ""),
        nullable..Check(1)..unsigned_int.p("loopstart", ""),
        FMOD_TIMEUNIT("loopstarttype", ""),
        nullable..Check(1)..unsigned_int.p("loopend", ""),
        FMOD_TIMEUNIT("loopendtype", "")
    )

    FMOD_RESULT(
        "Sound_GetMusicNumChannels",
        "",

        FMOD_SOUND.p("sound", ""),
        Check(1)..int.p("numchannels", "")
    )

    FMOD_RESULT(
        "Sound_SetMusicChannelVolume",
        "",

        FMOD_SOUND.p("sound", ""),
        int("channel", ""),
        float("volume", "")
    )

    FMOD_RESULT(
        "Sound_GetMusicChannelVolume",
        "",

        FMOD_SOUND.p("sound", ""),
        int("channel", ""),
        Check(1)..float.p("volume", "")
    )

    FMOD_RESULT(
        "Sound_SetMusicSpeed",
        "",

        FMOD_SOUND.p("sound", ""),
        float("speed", "")
    )

    FMOD_RESULT(
        "Sound_GetMusicSpeed",
        "",

        FMOD_SOUND.p("sound", ""),
        Check(1)..float.p("speed", "")
    )

    FMOD_RESULT(
        "Sound_SetUserData",
        "",

        FMOD_SOUND.p("sound", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_RESULT(
        "Sound_GetUserData",
        "",

        FMOD_SOUND.p("sound", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "Channel_GetSystemObject",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..FMOD_SYSTEM.p.p("system", "")
    )

    FMOD_RESULT(
        "Channel_Stop",
        "",

        FMOD_CHANNEL.p("channel", "")
    )

    FMOD_RESULT(
        "Channel_SetPaused",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_BOOL("paused", "")
    )

    FMOD_RESULT(
        "Channel_GetPaused",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..FMOD_BOOL.p("paused", "")
    )

    FMOD_RESULT(
        "Channel_SetVolume",
        "",

        FMOD_CHANNEL.p("channel", ""),
        float("volume", "")
    )

    FMOD_RESULT(
        "Channel_GetVolume",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..float.p("volume", "")
    )

    FMOD_RESULT(
        "Channel_SetVolumeRamp",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_BOOL("ramp", "")
    )

    FMOD_RESULT(
        "Channel_GetVolumeRamp",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..FMOD_BOOL.p("ramp", "")
    )

    FMOD_RESULT(
        "Channel_GetAudibility",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..float.p("audibility", "")
    )

    FMOD_RESULT(
        "Channel_SetPitch",
        "",

        FMOD_CHANNEL.p("channel", ""),
        float("pitch", "")
    )

    FMOD_RESULT(
        "Channel_GetPitch",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..float.p("pitch", "")
    )

    FMOD_RESULT(
        "Channel_SetMute",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_BOOL("mute", "")
    )

    FMOD_RESULT(
        "Channel_GetMute",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..FMOD_BOOL.p("mute", "")
    )

    FMOD_RESULT(
        "Channel_SetReverbProperties",
        "",

        FMOD_CHANNEL.p("channel", ""),
        int("instance", ""),
        float("wet", "")
    )

    FMOD_RESULT(
        "Channel_GetReverbProperties",
        "",

        FMOD_CHANNEL.p("channel", ""),
        int("instance", ""),
        Check(1)..float.p("wet", "")
    )

    FMOD_RESULT(
        "Channel_SetLowPassGain",
        "",

        FMOD_CHANNEL.p("channel", ""),
        float("gain", "")
    )

    FMOD_RESULT(
        "Channel_GetLowPassGain",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..float.p("gain", "")
    )

    FMOD_RESULT(
        "Channel_SetMode",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_MODE("mode", "")
    )

    FMOD_RESULT(
        "Channel_GetMode",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..FMOD_MODE.p("mode", "")
    )

    FMOD_RESULT(
        "Channel_SetCallback",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..FMOD_CHANNELCONTROL_CALLBACK("callback", "")
    )

    FMOD_RESULT(
        "Channel_IsPlaying",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..FMOD_BOOL.p("isplaying", "")
    )

    FMOD_RESULT(
        "Channel_SetPan",
        """
        Note all 'set' functions alter a final matrix, this is why the only get function is getMixMatrix, to avoid other get functions returning
        incorrect/obsolete values.
        """,

        FMOD_CHANNEL.p("channel", ""),
        float("pan", "")
    )

    FMOD_RESULT(
        "Channel_SetMixLevelsOutput",
        "",

        FMOD_CHANNEL.p("channel", ""),
        float("frontleft", ""),
        float("frontright", ""),
        float("center", ""),
        float("lfe", ""),
        float("surroundleft", ""),
        float("surroundright", ""),
        float("backleft", ""),
        float("backright", "")
    )

    FMOD_RESULT(
        "Channel_SetMixLevelsInput",
        "",

        FMOD_CHANNEL.p("channel", ""),
        float.p("levels", ""),
        AutoSize("levels")..int("numlevels", "")
    )

    FMOD_RESULT(
        "Channel_SetMixMatrix",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..Check("outchannels * (inchannel_hop == 0 ? inchannels : inchannel_hop)")..float.p("matrix", ""),
        int("outchannels", ""),
        int("inchannels", ""),
        int("inchannel_hop", "")
    )

    FMOD_RESULT(
        "Channel_GetMixMatrix",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..Unsafe..float.p("matrix", ""),
        nullable..Check(1)..int.p("outchannels", ""),
        nullable..Check(1)..int.p("inchannels", ""),
        int("inchannel_hop", "")
    )

    FMOD_RESULT(
        "Channel_GetDSPClock",
        "Clock based functionality.",

        FMOD_CHANNEL.p("channel", ""),
        nullable..Check(1)..unsigned_long_long.p("dspclock", ""),
        nullable..Check(1)..unsigned_long_long.p("parentclock", "")
    )

    FMOD_RESULT(
        "Channel_SetDelay",
        "",

        FMOD_CHANNEL.p("channel", ""),
        unsigned_long_long("dspclock_start", ""),
        unsigned_long_long("dspclock_end", ""),
        FMOD_BOOL("stopchannels", "")
    )

    FMOD_RESULT(
        "Channel_GetDelay",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..Check(1)..unsigned_long_long.p("dspclock_start", ""),
        nullable..Check(1)..unsigned_long_long.p("dspclock_end", ""),
        nullable..Check(1)..FMOD_BOOL.p("stopchannels", "")
    )

    FMOD_RESULT(
        "Channel_AddFadePoint",
        "",

        FMOD_CHANNEL.p("channel", ""),
        unsigned_long_long("dspclock", ""),
        float("volume", "")
    )

    FMOD_RESULT(
        "Channel_SetFadePointRamp",
        "",

        FMOD_CHANNEL.p("channel", ""),
        unsigned_long_long("dspclock", ""),
        float("volume", "")
    )

    FMOD_RESULT(
        "Channel_RemoveFadePoints",
        "",

        FMOD_CHANNEL.p("channel", ""),
        unsigned_long_long("dspclock_start", ""),
        unsigned_long_long("dspclock_end", "")
    )

    FMOD_RESULT(
        "Channel_GetFadePoints",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..unsigned_int.p("numpoints", ""),
        nullable..Check(1)..unsigned_long_long.p("point_dspclock", ""),
        nullable..Check(1)..float.p("point_volume", "")
    )

    FMOD_RESULT(
        "Channel_GetDSP",
        "DSP effects.",

        FMOD_CHANNEL.p("channel", ""),
        int("index", ""),
        Check(1)..FMOD_DSP.p.p("dsp", "")
    )

    FMOD_RESULT(
        "Channel_AddDSP",
        "",

        FMOD_CHANNEL.p("channel", ""),
        int("index", ""),
        FMOD_DSP.p("dsp", "")
    )

    FMOD_RESULT(
        "Channel_RemoveDSP",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_DSP.p("dsp", "")
    )

    FMOD_RESULT(
        "Channel_GetNumDSPs",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..int.p("numdsps", "")
    )

    FMOD_RESULT(
        "Channel_SetDSPIndex",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_DSP.p("dsp", ""),
        int("index", "")
    )

    FMOD_RESULT(
        "Channel_GetDSPIndex",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_DSP.p("dsp", ""),
        Check(1)..int.p("index", "")
    )

    FMOD_RESULT(
        "Channel_Set3DAttributes",
        "3D functionality.",

        FMOD_CHANNEL.p("channel", ""),
        nullable..FMOD_VECTOR.const.p("pos", ""),
        nullable..FMOD_VECTOR.const.p("vel", "")
    )

    FMOD_RESULT(
        "Channel_Get3DAttributes",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..FMOD_VECTOR.p("pos", ""),
        nullable..FMOD_VECTOR.p("vel", "")
    )

    FMOD_RESULT(
        "Channel_Set3DMinMaxDistance",
        "",

        FMOD_CHANNEL.p("channel", ""),
        float("mindistance", ""),
        float("maxdistance", "")
    )

    FMOD_RESULT(
        "Channel_Get3DMinMaxDistance",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..Check(1)..float.p("mindistance", ""),
        nullable..Check(1)..float.p("maxdistance", "")
    )

    FMOD_RESULT(
        "Channel_Set3DConeSettings",
        "",

        FMOD_CHANNEL.p("channel", ""),
        float("insideconeangle", ""),
        float("outsideconeangle", ""),
        float("outsidevolume", "")
    )

    FMOD_RESULT(
        "Channel_Get3DConeSettings",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..Check(1)..float.p("insideconeangle", ""),
        nullable..Check(1)..float.p("outsideconeangle", ""),
        nullable..Check(1)..float.p("outsidevolume", "")
    )

    FMOD_RESULT(
        "Channel_Set3DConeOrientation",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_VECTOR.p("orientation", "")
    )

    FMOD_RESULT(
        "Channel_Get3DConeOrientation",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_VECTOR.p("orientation", "")
    )

    FMOD_RESULT(
        "Channel_Set3DCustomRolloff",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_VECTOR.p("points", ""),
        AutoSize("points")..int("numpoints", "")
    )

    FMOD_RESULT(
        "Channel_Get3DCustomRolloff",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..Check(1)..FMOD_VECTOR.p.p("points", ""),
        nullable..Check(1)..int.p("numpoints", "")
    )

    FMOD_RESULT(
        "Channel_Set3DOcclusion",
        "",

        FMOD_CHANNEL.p("channel", ""),
        float("directocclusion", ""),
        float("reverbocclusion", "")
    )

    FMOD_RESULT(
        "Channel_Get3DOcclusion",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..Check(1)..float.p("directocclusion", ""),
        nullable..Check(1)..float.p("reverbocclusion", "")
    )

    FMOD_RESULT(
        "Channel_Set3DSpread",
        "",

        FMOD_CHANNEL.p("channel", ""),
        float("angle", "")
    )

    FMOD_RESULT(
        "Channel_Get3DSpread",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..float.p("angle", "")
    )

    FMOD_RESULT(
        "Channel_Set3DLevel",
        "",

        FMOD_CHANNEL.p("channel", ""),
        float("level", "")
    )

    FMOD_RESULT(
        "Channel_Get3DLevel",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..float.p("level", "")
    )

    FMOD_RESULT(
        "Channel_Set3DDopplerLevel",
        "",

        FMOD_CHANNEL.p("channel", ""),
        float("level", "")
    )

    FMOD_RESULT(
        "Channel_Get3DDopplerLevel",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..float.p("level", "")
    )

    FMOD_RESULT(
        "Channel_Set3DDistanceFilter",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_BOOL("custom", ""),
        float("customLevel", ""),
        float("centerFreq", "")
    )

    FMOD_RESULT(
        "Channel_Get3DDistanceFilter",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..Check(1)..FMOD_BOOL.p("custom", ""),
        nullable..Check(1)..float.p("customLevel", ""),
        nullable..Check(1)..float.p("centerFreq", "")
    )

    FMOD_RESULT(
        "Channel_SetUserData",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_RESULT(
        "Channel_GetUserData",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "Channel_SetFrequency",
        "Channel specific control functionality.",

        FMOD_CHANNEL.p("channel", ""),
        float("frequency", "")
    )

    FMOD_RESULT(
        "Channel_GetFrequency",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..float.p("frequency", "")
    )

    FMOD_RESULT(
        "Channel_SetPriority",
        "",

        FMOD_CHANNEL.p("channel", ""),
        int("priority", "")
    )

    FMOD_RESULT(
        "Channel_GetPriority",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..int.p("priority", "")
    )

    FMOD_RESULT(
        "Channel_SetPosition",
        "",

        FMOD_CHANNEL.p("channel", ""),
        unsigned_int("position", ""),
        FMOD_TIMEUNIT("postype", "")
    )

    FMOD_RESULT(
        "Channel_GetPosition",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..unsigned_int.p("position", ""),
        FMOD_TIMEUNIT("postype", "")
    )

    FMOD_RESULT(
        "Channel_SetChannelGroup",
        "",

        FMOD_CHANNEL.p("channel", ""),
        FMOD_CHANNELGROUP.p("channelgroup", "")
    )

    FMOD_RESULT(
        "Channel_GetChannelGroup",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..FMOD_CHANNELGROUP.p.p("channelgroup", "")
    )

    FMOD_RESULT(
        "Channel_SetLoopCount",
        "",

        FMOD_CHANNEL.p("channel", ""),
        int("loopcount", "")
    )

    FMOD_RESULT(
        "Channel_GetLoopCount",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..int.p("loopcount", "")
    )

    FMOD_RESULT(
        "Channel_SetLoopPoints",
        "",

        FMOD_CHANNEL.p("channel", ""),
        unsigned_int("loopstart", ""),
        FMOD_TIMEUNIT("loopstarttype", ""),
        unsigned_int("loopend", ""),
        FMOD_TIMEUNIT("loopendtype", "")
    )

    FMOD_RESULT(
        "Channel_GetLoopPoints",
        "",

        FMOD_CHANNEL.p("channel", ""),
        nullable..Check(1)..unsigned_int.p("loopstart", ""),
        FMOD_TIMEUNIT("loopstarttype", ""),
        nullable..Check(1)..unsigned_int.p("loopend", ""),
        FMOD_TIMEUNIT("loopendtype", "")
    )

    FMOD_RESULT(
        "Channel_IsVirtual",
        "Information only functions.",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..FMOD_BOOL.p("isvirtual", "")
    )

    FMOD_RESULT(
        "Channel_GetCurrentSound",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..FMOD_SOUND.p.p("sound", "")
    )

    FMOD_RESULT(
        "Channel_GetIndex",
        "",

        FMOD_CHANNEL.p("channel", ""),
        Check(1)..int.p("index", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetSystemObject",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..FMOD_SYSTEM.p.p("system", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Stop",
        "General control functionality for Channels and ChannelGroups.",

        FMOD_CHANNELGROUP.p("channelgroup", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetPaused",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_BOOL("paused", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetPaused",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..FMOD_BOOL.p("paused", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetVolume",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float("volume", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetVolume",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..float.p("volume", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetVolumeRamp",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_BOOL("ramp", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetVolumeRamp",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..FMOD_BOOL.p("ramp", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetAudibility",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..float.p("audibility", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetPitch",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float("pitch", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetPitch",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..float.p("pitch", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetMute",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_BOOL("mute", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetMute",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..FMOD_BOOL.p("mute", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetReverbProperties",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        int("instance", ""),
        float("wet", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetReverbProperties",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        int("instance", ""),
        Check(1)..float.p("wet", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetLowPassGain",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float("gain", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetLowPassGain",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..float.p("gain", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetMode",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_MODE("mode", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetMode",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..FMOD_MODE.p("mode", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetCallback",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..FMOD_CHANNELCONTROL_CALLBACK("callback", "")
    )

    FMOD_RESULT(
        "ChannelGroup_IsPlaying",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..FMOD_BOOL.p("isplaying", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetPan",
        """
        Note all 'set' functions alter a final matrix, this is why the only get function is getMixMatrix, to avoid other get functions returning
        incorrect/obsolete values.
        """,

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float("pan", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetMixLevelsOutput",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float("frontleft", ""),
        float("frontright", ""),
        float("center", ""),
        float("lfe", ""),
        float("surroundleft", ""),
        float("surroundright", ""),
        float("backleft", ""),
        float("backright", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetMixLevelsInput",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float.p("levels", ""),
        AutoSize("levels")..int("numlevels", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetMixMatrix",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..Check("outchannels * (inchannel_hop == 0 ? inchannels : inchannel_hop)")..float.p("matrix", ""),
        int("outchannels", ""),
        int("inchannels", ""),
        int("inchannel_hop", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetMixMatrix",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..Unsafe..float.p("matrix", ""),
        nullable..Check(1)..int.p("outchannels", ""),
        nullable..Check(1)..int.p("inchannels", ""),
        int("inchannel_hop", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetDSPClock",
        "Clock based functionality.",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..Check(1)..unsigned_long_long.p("dspclock", ""),
        nullable..Check(1)..unsigned_long_long.p("parentclock", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetDelay",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        unsigned_long_long("dspclock_start", ""),
        unsigned_long_long("dspclock_end", ""),
        FMOD_BOOL("stopchannels", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetDelay",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..Check(1)..unsigned_long_long.p("dspclock_start", ""),
        nullable..Check(1)..unsigned_long_long.p("dspclock_end", ""),
        nullable..Check(1)..FMOD_BOOL.p("stopchannels", "")
    )

    FMOD_RESULT(
        "ChannelGroup_AddFadePoint",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        unsigned_long_long("dspclock", ""),
        float("volume", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetFadePointRamp",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        unsigned_long_long("dspclock", ""),
        float("volume", "")
    )

    FMOD_RESULT(
        "ChannelGroup_RemoveFadePoints",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        unsigned_long_long("dspclock_start", ""),
        unsigned_long_long("dspclock_end", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetFadePoints",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..unsigned_int.p("numpoints", ""),
        nullable..Check(1)..unsigned_long_long.p("point_dspclock", ""),
        nullable..Check(1)..float.p("point_volume", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetDSP",
        "DSP effects.",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        int("index", ""),
        Check(1)..FMOD_DSP.p.p("dsp", "")
    )

    FMOD_RESULT(
        "ChannelGroup_AddDSP",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        int("index", ""),
        FMOD_DSP.p("dsp", "")
    )

    FMOD_RESULT(
        "ChannelGroup_RemoveDSP",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_DSP.p("dsp", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetNumDSPs",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..int.p("numdsps", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetDSPIndex",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_DSP.p("dsp", ""),
        int("index", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetDSPIndex",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_DSP.p("dsp", ""),
        Check(1)..int.p("index", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Set3DAttributes",
        "3D functionality.",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..FMOD_VECTOR.const.p("pos", ""),
        nullable..FMOD_VECTOR.const.p("vel", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Get3DAttributes",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..FMOD_VECTOR.p("pos", ""),
        nullable..FMOD_VECTOR.p("vel", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Set3DMinMaxDistance",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float("mindistance", ""),
        float("maxdistance", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Get3DMinMaxDistance",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..Check(1)..float.p("mindistance", ""),
        nullable..Check(1)..float.p("maxdistance", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Set3DConeSettings",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float("insideconeangle", ""),
        float("outsideconeangle", ""),
        float("outsidevolume", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Get3DConeSettings",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..Check(1)..float.p("insideconeangle", ""),
        nullable..Check(1)..float.p("outsideconeangle", ""),
        nullable..Check(1)..float.p("outsidevolume", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Set3DConeOrientation",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_VECTOR.p("orientation", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Get3DConeOrientation",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_VECTOR.p("orientation", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Set3DCustomRolloff",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_VECTOR.p("points", ""),
        AutoSize("points")..int("numpoints", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Get3DCustomRolloff",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..Check(1)..FMOD_VECTOR.p.p("points", ""),
        nullable..Check(1)..int.p("numpoints", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Set3DOcclusion",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float("directocclusion", ""),
        float("reverbocclusion", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Get3DOcclusion",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..Check(1)..float.p("directocclusion", ""),
        nullable..Check(1)..float.p("reverbocclusion", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Set3DSpread",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float("angle", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Get3DSpread",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..float.p("angle", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Set3DLevel",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float("level", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Get3DLevel",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..float.p("level", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Set3DDopplerLevel",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        float("level", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Get3DDopplerLevel",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..float.p("level", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Set3DDistanceFilter",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_BOOL("custom", ""),
        float("customLevel", ""),
        float("centerFreq", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Get3DDistanceFilter",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..Check(1)..FMOD_BOOL.p("custom", ""),
        nullable..Check(1)..float.p("customLevel", ""),
        nullable..Check(1)..float.p("centerFreq", "")
    )

    FMOD_RESULT(
        "ChannelGroup_SetUserData",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetUserData",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "ChannelGroup_Release",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", "")
    )

    FMOD_RESULT(
        "ChannelGroup_AddGroup",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        FMOD_CHANNELGROUP.p("group", ""),
        FMOD_BOOL("propagatedspclock", ""),
        nullable..Check(1)..FMOD_DSPCONNECTION.p.p("connection", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetNumGroups",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..int.p("numgroups", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetGroup",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        int("index", ""),
        Check(1)..FMOD_CHANNELGROUP.p.p("group", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetParentGroup",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..FMOD_CHANNELGROUP.p.p("group", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetName",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        char.p("name", ""),
        AutoSize("name")..int("namelen", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetNumChannels",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        Check(1)..int.p("numchannels", "")
    )

    FMOD_RESULT(
        "ChannelGroup_GetChannel",
        "",

        FMOD_CHANNELGROUP.p("channelgroup", ""),
        int("index", ""),
        Check(1)..FMOD_CHANNEL.p.p("channel", "")
    )

    FMOD_RESULT(
        "SoundGroup_Release",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", "")
    )

    FMOD_RESULT(
        "SoundGroup_GetSystemObject",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        Check(1)..FMOD_SYSTEM.p.p("system", "")
    )

    FMOD_RESULT(
        "SoundGroup_SetMaxAudible",
        "SoundGroup control functions.",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        int("maxaudible", "")
    )

    FMOD_RESULT(
        "SoundGroup_GetMaxAudible",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        Check(1)..int.p("maxaudible", "")
    )

    FMOD_RESULT(
        "SoundGroup_SetMaxAudibleBehavior",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        FMOD_SOUNDGROUP_BEHAVIOR("behavior", "")
    )

    FMOD_RESULT(
        "SoundGroup_GetMaxAudibleBehavior",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        Check(1)..FMOD_SOUNDGROUP_BEHAVIOR.p("behavior", "")
    )

    FMOD_RESULT(
        "SoundGroup_SetMuteFadeSpeed",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        float("speed", "")
    )

    FMOD_RESULT(
        "SoundGroup_GetMuteFadeSpeed",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        Check(1)..float.p("speed", "")
    )

    FMOD_RESULT(
        "SoundGroup_SetVolume",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        float("volume", "")
    )

    FMOD_RESULT(
        "SoundGroup_GetVolume",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        Check(1)..float.p("volume", "")
    )

    FMOD_RESULT(
        "SoundGroup_Stop",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", "")
    )

    FMOD_RESULT(
        "SoundGroup_GetName",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        char.p("name", ""),
        AutoSize("name")..int("namelen", "")
    )

    FMOD_RESULT(
        "SoundGroup_GetNumSounds",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        Check(1)..int.p("numsounds", "")
    )

    FMOD_RESULT(
        "SoundGroup_GetSound",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        int("index", ""),
        Check(1)..FMOD_SOUND.p.p("sound", "")
    )

    FMOD_RESULT(
        "SoundGroup_GetNumPlaying",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        Check(1)..int.p("numplaying", "")
    )

    FMOD_RESULT(
        "SoundGroup_SetUserData",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_RESULT(
        "SoundGroup_GetUserData",
        "",

        FMOD_SOUNDGROUP.p("soundgroup", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "DSP_Release",
        "",

        FMOD_DSP.p("dsp", "")
    )

    FMOD_RESULT(
        "DSP_GetSystemObject",
        "",

        FMOD_DSP.p("dsp", ""),
        Check(1)..FMOD_SYSTEM.p.p("system", "")
    )

    FMOD_RESULT(
        "DSP_AddInput",
        "",

        FMOD_DSP.p("dsp", ""),
        FMOD_DSP.p("input", ""),
        nullable..Check(1)..FMOD_DSPCONNECTION.p.p("connection", ""),
        FMOD_DSPCONNECTION_TYPE("type", "")
    )

    FMOD_RESULT(
        "DSP_DisconnectFrom",
        "",

        FMOD_DSP.p("dsp", ""),
        nullable..FMOD_DSP.p("target", ""),
        nullable..FMOD_DSPCONNECTION.p("connection", "")
    )

    FMOD_RESULT(
        "DSP_DisconnectAll",
        "",

        FMOD_DSP.p("dsp", ""),
        FMOD_BOOL("inputs", ""),
        FMOD_BOOL("outputs", "")
    )

    FMOD_RESULT(
        "DSP_GetNumInputs",
        "",

        FMOD_DSP.p("dsp", ""),
        Check(1)..int.p("numinputs", "")
    )

    FMOD_RESULT(
        "DSP_GetNumOutputs",
        "",

        FMOD_DSP.p("dsp", ""),
        Check(1)..int.p("numoutputs", "")
    )

    FMOD_RESULT(
        "DSP_GetInput",
        "",

        FMOD_DSP.p("dsp", ""),
        int("index", ""),
        nullable..Check(1)..FMOD_DSP.p.p("input", ""),
        nullable..Check(1)..FMOD_DSPCONNECTION.p.p("inputconnection", "")
    )

    FMOD_RESULT(
        "DSP_GetOutput",
        "",

        FMOD_DSP.p("dsp", ""),
        int("index", ""),
        nullable..Check(1)..FMOD_DSP.p.p("output", ""),
        nullable..Check(1)..FMOD_DSPCONNECTION.p.p("outputconnection", "")
    )

    FMOD_RESULT(
        "DSP_SetActive",
        "DSP unit control.",

        FMOD_DSP.p("dsp", ""),
        FMOD_BOOL("active", "")
    )

    FMOD_RESULT(
        "DSP_GetActive",
        "",

        FMOD_DSP.p("dsp", ""),
        Check(1)..FMOD_BOOL.p("active", "")
    )

    FMOD_RESULT(
        "DSP_SetBypass",
        "",

        FMOD_DSP.p("dsp", ""),
        FMOD_BOOL("bypass", "")
    )

    FMOD_RESULT(
        "DSP_GetBypass",
        "",

        FMOD_DSP.p("dsp", ""),
        Check(1)..FMOD_BOOL.p("bypass", "")
    )

    FMOD_RESULT(
        "DSP_SetWetDryMix",
        "",

        FMOD_DSP.p("dsp", ""),
        float("prewet", ""),
        float("postwet", ""),
        float("dry", "")
    )

    FMOD_RESULT(
        "DSP_GetWetDryMix",
        "",

        FMOD_DSP.p("dsp", ""),
        nullable..Check(1)..float.p("prewet", ""),
        nullable..Check(1)..float.p("postwet", ""),
        nullable..Check(1)..float.p("dry", "")
    )

    FMOD_RESULT(
        "DSP_SetChannelFormat",
        "",

        FMOD_DSP.p("dsp", ""),
        FMOD_CHANNELMASK("channelmask", ""),
        int("numchannels", ""),
        FMOD_SPEAKERMODE("source_speakermode", "")
    )

    FMOD_RESULT(
        "DSP_GetChannelFormat",
        "",

        FMOD_DSP.p("dsp", ""),
        nullable..Check(1)..FMOD_CHANNELMASK.p("channelmask", ""),
        nullable..Check(1)..int.p("numchannels", ""),
        nullable..Check(1)..FMOD_SPEAKERMODE.p("source_speakermode", "")
    )

    FMOD_RESULT(
        "DSP_GetOutputChannelFormat",
        "",

        FMOD_DSP.p("dsp", ""),
        FMOD_CHANNELMASK("inmask", ""),
        int("inchannels", ""),
        FMOD_SPEAKERMODE("inspeakermode", ""),
        nullable..Check(1)..FMOD_CHANNELMASK.p("outmask", ""),
        nullable..Check(1)..int.p("outchannels", ""),
        nullable..Check(1)..FMOD_SPEAKERMODE.p("outspeakermode", "")
    )

    FMOD_RESULT(
        "DSP_Reset",
        "",

        FMOD_DSP.p("dsp", "")
    )

    FMOD_RESULT(
        "DSP_SetCallback",
        "",

        FMOD_DSP.p("dsp", ""),
        FMOD_DSP_CALLBACK("callback", "")
    )

    FMOD_RESULT(
        "DSP_SetParameterFloat",
        "DSP parameter control.",

        FMOD_DSP.p("dsp", ""),
        int("index", ""),
        float("value", "")
    )

    FMOD_RESULT(
        "DSP_SetParameterInt",
        "",

        FMOD_DSP.p("dsp", ""),
        int("index", ""),
        int("value", "")
    )

    FMOD_RESULT(
        "DSP_SetParameterBool",
        "",

        FMOD_DSP.p("dsp", ""),
        int("index", ""),
        FMOD_BOOL("value", "")
    )

    FMOD_RESULT(
        "DSP_SetParameterData",
        "",

        FMOD_DSP.p("dsp", ""),
        int("index", ""),
        void.p("data", ""),
        AutoSize("data")..unsigned_int("length", "")
    )

    FMOD_RESULT(
        "DSP_GetParameterFloat",
        "",

        FMOD_DSP.p("dsp", ""),
        int("index", ""),
        nullable..Check(1)..float.p("value", ""),
        nullable..char.p("valuestr", ""),
        AutoSize("valuestr")..int("valuestrlen", "")
    )

    FMOD_RESULT(
        "DSP_GetParameterInt",
        "",

        FMOD_DSP.p("dsp", ""),
        int("index", ""),
        nullable..Check(1)..int.p("value", ""),
        nullable..char.p("valuestr", ""),
        AutoSize("valuestr")..int("valuestrlen", "")
    )

    FMOD_RESULT(
        "DSP_GetParameterBool",
        "",

        FMOD_DSP.p("dsp", ""),
        int("index", ""),
        nullable..Check(1)..FMOD_BOOL.p("value", ""),
        nullable..char.p("valuestr", ""),
        AutoSize("valuestr")..int("valuestrlen", "")
    )

    FMOD_RESULT(
        "DSP_GetParameterData",
        "",

        FMOD_DSP.p("dsp", ""),
        int("index", ""),
        nullable..Check(1)..void.p.p("data", ""),
        nullable..Check(1)..unsigned_int.p("length", ""),
        nullable..char.p("valuestr", ""),
        AutoSize("valuestr")..int("valuestrlen", "")
    )

    FMOD_RESULT(
        "DSP_GetNumParameters",
        "",

        FMOD_DSP.p("dsp", ""),
        Check(1)..int.p("numparams", "")
    )

    FMOD_RESULT(
        "DSP_GetParameterInfo",
        "",

        FMOD_DSP.p("dsp", ""),
        int("index", ""),
        Check(1)..FMOD_DSP_PARAMETER_DESC.p.p("desc", "")
    )

    FMOD_RESULT(
        "DSP_GetDataParameterIndex",
        "",

        FMOD_DSP.p("dsp", ""),
        int("datatype", ""),
        Check(1)..int.p("index", "")
    )

    FMOD_RESULT(
        "DSP_ShowConfigDialog",
        "",

        FMOD_DSP.p("dsp", ""),
        opaque_p("hwnd", ""),
        FMOD_BOOL("show", "")
    )

    FMOD_RESULT(
        "DSP_GetInfo",
        "DSP attributes.",

        FMOD_DSP.p("dsp", ""),
        nullable..Check(32)..char.p("name", ""),
        nullable..Check(1)..unsigned_int.p("version", ""),
        nullable..Check(1)..int.p("channels", ""),
        nullable..Check(1)..int.p("configwidth", ""),
        nullable..Check(1)..int.p("configheight", "")
    )

    FMOD_RESULT(
        "DSP_GetType",
        "",

        FMOD_DSP.p("dsp", ""),
        Check(1)..FMOD_DSP_TYPE.p("type", "")
    )

    FMOD_RESULT(
        "DSP_GetIdle",
        "",

        FMOD_DSP.p("dsp", ""),
        Check(1)..FMOD_BOOL.p("idle", "")
    )

    FMOD_RESULT(
        "DSP_SetUserData",
        "",

        FMOD_DSP.p("dsp", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_RESULT(
        "DSP_GetUserData",
        "",

        FMOD_DSP.p("dsp", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "DSP_SetMeteringEnabled",
        "Metering.",

        FMOD_DSP.p("dsp", ""),
        FMOD_BOOL("inputEnabled", ""),
        FMOD_BOOL("outputEnabled", "")
    )

    FMOD_RESULT(
        "DSP_GetMeteringEnabled",
        "",

        FMOD_DSP.p("dsp", ""),
        nullable..Check(1)..FMOD_BOOL.p("inputEnabled", ""),
        nullable..Check(1)..FMOD_BOOL.p("outputEnabled", "")
    )

    FMOD_RESULT(
        "DSP_GetMeteringInfo",
        "",

        FMOD_DSP.p("dsp", ""),
        nullable..FMOD_DSP_METERING_INFO.p("inputInfo", ""),
        nullable..FMOD_DSP_METERING_INFO.p("outputInfo", "")
    )

    FMOD_RESULT(
        "DSP_GetCPUUsage",
        "",

        FMOD_DSP.p("dsp", ""),
        nullable..Check(1)..unsigned_int.p("exclusive", ""),
        nullable..Check(1)..unsigned_int.p("inclusive", "")
    )

    FMOD_RESULT(
        "DSPConnection_GetInput",
        "",

        FMOD_DSPCONNECTION.p("dspconnection", ""),
        Check(1)..FMOD_DSP.p.p("input", "")
    )

    FMOD_RESULT(
        "DSPConnection_GetOutput",
        "",

        FMOD_DSPCONNECTION.p("dspconnection", ""),
        Check(1)..FMOD_DSP.p.p("output", "")
    )

    FMOD_RESULT(
        "DSPConnection_SetMix",
        "",

        FMOD_DSPCONNECTION.p("dspconnection", ""),
        float("volume", "")
    )

    FMOD_RESULT(
        "DSPConnection_GetMix",
        "",

        FMOD_DSPCONNECTION.p("dspconnection", ""),
        Check(1)..float.p("volume", "")
    )

    FMOD_RESULT(
        "DSPConnection_SetMixMatrix",
        "",

        FMOD_DSPCONNECTION.p("dspconnection", ""),
        nullable..Check("outchannels * (inchannel_hop == 0 ? inchannels : inchannel_hop)")..float.p("matrix", ""),
        int("outchannels", ""),
        int("inchannels", ""),
        int("inchannel_hop", "")
    )

    FMOD_RESULT(
        "DSPConnection_GetMixMatrix",
        "",

        FMOD_DSPCONNECTION.p("dspconnection", ""),
        nullable..Unsafe..float.p("matrix", ""),
        nullable..Check(1)..int.p("outchannels", ""),
        nullable..Check(1)..int.p("inchannels", ""),
        int("inchannel_hop", "")
    )

    FMOD_RESULT(
        "DSPConnection_GetType",
        "",

        FMOD_DSPCONNECTION.p("dspconnection", ""),
        Check(1)..FMOD_DSPCONNECTION_TYPE.p("type", "")
    )

    FMOD_RESULT(
        "DSPConnection_SetUserData",
        "",

        FMOD_DSPCONNECTION.p("dspconnection", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_RESULT(
        "DSPConnection_GetUserData",
        "",

        FMOD_DSPCONNECTION.p("dspconnection", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "Geometry_Release",
        "",

        FMOD_GEOMETRY.p("geometry", "")
    )

    FMOD_RESULT(
        "Geometry_AddPolygon",
        "Polygon manipulation.",

        FMOD_GEOMETRY.p("geometry", ""),
        float("directocclusion", ""),
        float("reverbocclusion", ""),
        FMOD_BOOL("doublesided", ""),
        AutoSize("vertices")..int("numvertices", ""),
        FMOD_VECTOR.const.p("vertices", ""),
        nullable..Check(1)..int.p("polygonindex", "")
    )

    FMOD_RESULT(
        "Geometry_GetNumPolygons",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        Check(1)..int.p("numpolygons", "")
    )

    FMOD_RESULT(
        "Geometry_GetMaxPolygons",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        nullable..Check(1)..int.p("maxpolygons", ""),
        nullable..Check(1)..int.p("maxvertices", "")
    )

    FMOD_RESULT(
        "Geometry_GetPolygonNumVertices",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        int("index", ""),
        Check(1)..int.p("numvertices", "")
    )

    FMOD_RESULT(
        "Geometry_SetPolygonVertex",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        int("index", ""),
        int("vertexindex", ""),
        FMOD_VECTOR.const.p("vertex", "")
    )

    FMOD_RESULT(
        "Geometry_GetPolygonVertex",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        int("index", ""),
        int("vertexindex", ""),
        FMOD_VECTOR.p("vertex", "")
    )

    FMOD_RESULT(
        "Geometry_SetPolygonAttributes",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        int("index", ""),
        float("directocclusion", ""),
        float("reverbocclusion", ""),
        FMOD_BOOL("doublesided", "")
    )

    FMOD_RESULT(
        "Geometry_GetPolygonAttributes",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        int("index", ""),
        nullable..Check(1)..float.p("directocclusion", ""),
        nullable..Check(1)..float.p("reverbocclusion", ""),
        nullable..Check(1)..FMOD_BOOL.p("doublesided", "")
    )

    FMOD_RESULT(
        "Geometry_SetActive",
        "Object manipulation.",

        FMOD_GEOMETRY.p("geometry", ""),
        FMOD_BOOL("active", "")
    )

    FMOD_RESULT(
        "Geometry_GetActive",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        Check(1)..FMOD_BOOL.p("active", "")
    )

    FMOD_RESULT(
        "Geometry_SetRotation",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        nullable..FMOD_VECTOR.const.p("forward", ""),
        nullable..FMOD_VECTOR.const.p("up", "")
    )

    FMOD_RESULT(
        "Geometry_GetRotation",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        nullable..FMOD_VECTOR.p("forward", ""),
        nullable..FMOD_VECTOR.p("up", "")
    )

    FMOD_RESULT(
        "Geometry_SetPosition",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        FMOD_VECTOR.const.p("position", "")
    )

    FMOD_RESULT(
        "Geometry_GetPosition",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        FMOD_VECTOR.p("position", "")
    )

    FMOD_RESULT(
        "Geometry_SetScale",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        FMOD_VECTOR.const.p("scale", "")
    )

    FMOD_RESULT(
        "Geometry_GetScale",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        FMOD_VECTOR.p("scale", "")
    )

    FMOD_RESULT(
        "Geometry_Save",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        nullable..Unsafe..void.p("data", ""),
        Check(1)..int.p("datasize", "")
    )

    FMOD_RESULT(
        "Geometry_SetUserData",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_RESULT(
        "Geometry_GetUserData",
        "",

        FMOD_GEOMETRY.p("geometry", ""),
        Check(1)..void.p.p("userdata", "")
    )

    FMOD_RESULT(
        "Reverb3D_Release",
        "",

        FMOD_REVERB3D.p("reverb3d", "")
    )

    FMOD_RESULT(
        "Reverb3D_Set3DAttributes",
        "",

        FMOD_REVERB3D.p("reverb3d", ""),
        nullable..FMOD_VECTOR.const.p("position", ""),
        float("mindistance", ""),
        float("maxdistance", "")
    )

    FMOD_RESULT(
        "Reverb3D_Get3DAttributes",
        "",

        FMOD_REVERB3D.p("reverb3d", ""),
        nullable..FMOD_VECTOR.p("position", ""),
        nullable..Check(1)..float.p("mindistance", ""),
        nullable..Check(1)..float.p("maxdistance", "")
    )

    FMOD_RESULT(
        "Reverb3D_SetProperties",
        "",

        FMOD_REVERB3D.p("reverb3d", ""),
        FMOD_REVERB_PROPERTIES.const.p("properties", "")
    )

    FMOD_RESULT(
        "Reverb3D_GetProperties",
        "",

        FMOD_REVERB3D.p("reverb3d", ""),
        FMOD_REVERB_PROPERTIES.p("properties", "")
    )

    FMOD_RESULT(
        "Reverb3D_SetActive",
        "",

        FMOD_REVERB3D.p("reverb3d", ""),
        FMOD_BOOL("active", "")
    )

    FMOD_RESULT(
        "Reverb3D_GetActive",
        "",

        FMOD_REVERB3D.p("reverb3d", ""),
        Check(1)..FMOD_BOOL.p("active", "")
    )

    FMOD_RESULT(
        "Reverb3D_SetUserData",
        "",

        FMOD_REVERB3D.p("reverb3d", ""),
        nullable..opaque_p("userdata", "")
    )

    FMOD_RESULT(
        "Reverb3D_GetUserData",
        "",

        FMOD_REVERB3D.p("reverb3d", ""),
        Check(1)..void.p.p("userdata", "")
    )
}
