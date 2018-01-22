/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_performance_monitor = "AMDPerformanceMonitor".nativeClassGL("AMD_performance_monitor", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables the capture and reporting of performance monitors. Performance monitors contain groups of counters which hold arbitrary counted
        data. Typically, the counters hold information on performance-related counters in the underlying hardware. The extension is general enough to allow the
        implementation to choose which counters to expose and pick the data type and range of the counters. The extension also allows counting to start and end
        on arbitrary boundaries during rendering.
        """

    IntConstant(
        "Accepted by the {@code pame} parameter of GetPerfMonitorCounterInfoAMD.",

        "COUNTER_TYPE_AMD"..0x8BC0,
        "COUNTER_RANGE_AMD"..0x8BC1
    )

    IntConstant(
        "Returned as a valid value in {@code data} parameter of GetPerfMonitorCounterInfoAMD if {@code pname} = COUNTER_TYPE_AMD.",

        "UNSIGNED_INT64_AMD"..0x8BC2,
        "PERCENTAGE_AMD"..0x8BC3
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetPerfMonitorCounterDataAMD.",

        "PERFMON_RESULT_AVAILABLE_AMD"..0x8BC4,
        "PERFMON_RESULT_SIZE_AMD"..0x8BC5,
        "PERFMON_RESULT_AMD"..0x8BC6
    )

    void(
        "GetPerfMonitorGroupsAMD",
        "",

        nullable..Check(1)..GLint_p.OUT("numGroups", ""),
        AutoSize("groups")..GLsizei.IN("groupsSize", ""),
        nullable..GLuint_p.OUT("groups", "")
    )

    void(
        "GetPerfMonitorCountersAMD",
        "",

        GLuint.IN("group", ""),
        Check(1)..GLint_p.OUT("numCounters", ""),
        Check(1)..GLint_p.OUT("maxActiveCounters", ""),
        AutoSize("counters")..GLsizei.IN("counterSize", ""),
        GLuint_p.OUT("counters", "")
    )

    void(
        "GetPerfMonitorGroupStringAMD",
        "",

        GLuint.IN("group", ""),
        AutoSize("groupString")..GLsizei.IN("bufSize", ""),
        Check(1)..GLsizei_p.OUT("length", ""),
        GLcharASCII_p.OUT("groupString", "")
    )

    void(
        "GetPerfMonitorCounterStringAMD",
        "",

        GLuint.IN("group", ""),
        GLuint.IN("counter", ""),
        AutoSize("counterString")..GLsizei.IN("bufSize", ""),
        nullable..Check(1)..GLsizei_p.OUT("length", ""),
        nullable..GLcharASCII_p.OUT("counterString", "")
    )

    void(
        "GetPerfMonitorCounterInfoAMD",
        "",

        GLuint.IN("group", ""),
        GLuint.IN("counter", ""),
        GLenum.IN("pname", ""),
        Check(4)..MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT)..void_p.OUT("data", "")
    )

    void(
        "GenPerfMonitorsAMD",
        "",

        AutoSize("monitors")..GLsizei.IN("n", ""),
        ReturnParam..GLuint_p.OUT("monitors", "")
    )

    void(
        "DeletePerfMonitorsAMD",
        "",

        AutoSize("monitors")..GLsizei.IN("n", ""),
        SingleValue("monitor")..GLuint_p.IN("monitors", "")
    )

    void(
        "SelectPerfMonitorCountersAMD",
        "",

        GLuint.IN("monitor", ""),
        GLboolean.IN("enable", ""),
        GLuint.IN("group", ""),
        AutoSize("counterList")..GLint.IN("numCounters", ""),
        GLuint_p.IN("counterList", "")
    )

    void(
        "BeginPerfMonitorAMD",
        "",

        GLuint.IN("monitor", "")
    )

    void(
        "EndPerfMonitorAMD",
        "",

        GLuint.IN("monitor", "")
    )

    void(
        "GetPerfMonitorCounterDataAMD",
        "",

        GLuint.IN("monitor", ""),
        GLenum.IN("pname", ""),
        AutoSize("data")..GLsizei.IN("dataSize", ""),
        GLuint_p.OUT("data", ""),
        Check(1)..nullable..GLint_p.OUT("bytesWritten", "")
    )
}