/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_performance_monitor = "AMDPerformanceMonitor".nativeClassGL("AMD_performance_monitor", postfix = AMD) {
    IntConstant(
        "COUNTER_TYPE_AMD"..0x8BC0,
        "COUNTER_RANGE_AMD"..0x8BC1
    )

    IntConstant(
        "UNSIGNED_INT64_AMD"..0x8BC2,
        "PERCENTAGE_AMD"..0x8BC3
    )

    IntConstant(
        "PERFMON_RESULT_AVAILABLE_AMD"..0x8BC4,
        "PERFMON_RESULT_SIZE_AMD"..0x8BC5,
        "PERFMON_RESULT_AMD"..0x8BC6
    )

    void(
        "GetPerfMonitorGroupsAMD",

        nullable..Check(1)..GLint.p("numGroups"),
        AutoSize("groups")..GLsizei("groupsSize"),
        nullable..GLuint.p("groups")
    )

    void(
        "GetPerfMonitorCountersAMD",

        GLuint("group"),
        Check(1)..GLint.p("numCounters"),
        Check(1)..GLint.p("maxActiveCounters"),
        AutoSize("counters")..GLsizei("counterSize"),
        GLuint.p("counters")
    )

    void(
        "GetPerfMonitorGroupStringAMD",

        GLuint("group"),
        AutoSize("groupString")..GLsizei("bufSize"),
        Check(1)..GLsizei.p("length"),
        GLcharASCII.p("groupString")
    )

    void(
        "GetPerfMonitorCounterStringAMD",

        GLuint("group"),
        GLuint("counter"),
        AutoSize("counterString")..GLsizei("bufSize"),
        nullable..Check(1)..GLsizei.p("length"),
        nullable..GLcharASCII.p("counterString")
    )

    void(
        "GetPerfMonitorCounterInfoAMD",

        GLuint("group"),
        GLuint("counter"),
        GLenum("pname"),
        Check(4)..MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT)..void.p("data")
    )

    void(
        "GenPerfMonitorsAMD",

        AutoSize("monitors")..GLsizei("n"),
        ReturnParam..GLuint.p("monitors")
    )

    void(
        "DeletePerfMonitorsAMD",

        AutoSize("monitors")..GLsizei("n"),
        SingleValue("monitor")..GLuint.p("monitors")
    )

    void(
        "SelectPerfMonitorCountersAMD",

        GLuint("monitor"),
        GLboolean("enable"),
        GLuint("group"),
        AutoSize("counterList")..GLint("numCounters"),
        GLuint.p("counterList")
    )

    void(
        "BeginPerfMonitorAMD",

        GLuint("monitor")
    )

    void(
        "EndPerfMonitorAMD",

        GLuint("monitor")
    )

    void(
        "GetPerfMonitorCounterDataAMD",

        GLuint("monitor"),
        GLenum("pname"),
        AutoSize("data")..GLsizei("dataSize"),
        GLuint.p("data"),
        Check(1)..nullable..GLint.p("bytesWritten")
    )
}