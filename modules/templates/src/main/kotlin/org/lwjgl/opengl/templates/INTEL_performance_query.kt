/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val INTEL_performance_query = "INTELPerformanceQuery".nativeClassGL("INTEL_performance_query", postfix = INTEL) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The purpose of this extension is to expose Intel proprietary hardware performance counters to the OpenGL applications. Performance counters may count:
        ${ul(
            "number of hardware events such as number of spawned vertex shaders. In this case the results represent the number of events.",
            """
            duration of certain activity, like time took by all fragment shader invocations. In that case the result usually represents the number of clocks in
            which the particular HW unit was busy. In order to use such counter efficiently, it should be normalized to the range of <0,1> by dividing its
            value by the number of render clocks.
            """,
            """
            used throughput of certain memory types such as texture memory. In that case the result of performance counter usually represents the number of
            bytes transferred between GPU and memory.
            """
        )}
        This extension specifies universal API to manage performance counters on different Intel hardware platforms. Performance counters are grouped together
        into proprietary, hardware-specific, fixed sets of counters that are measured together by the GPU.

        It is assumed that performance counters are started and ended on any arbitrary boundaries during rendering.

        A set of performance counters is represented by a unique query type. Each query type is identified by assigned name and ID. Multiple query types (sets
        of performance counters) are supported by the Intel hardware. However each Intel hardware generation supports different sets of performance counters.
        Therefore the query types between hardware generations can be different. The definition of query types and their results structures can be learned
        through the API. It is also documented in a separate document of Intel OGL Performance Counters Specification issued per each new hardware generation.

        The API allows to create multiple instances of any query type and to sample different fragments of 3D rendering with such instances. Query instances
        are identified with handles.

        Requires ${GL30.core}.
        """

    IntConstant(
        "Returned by the capsMask parameter of GetPerfQueryInfoINTEL.",

        "PERFQUERY_SINGLE_CONTEXT_INTEL"..0x0000,
        "PERFQUERY_GLOBAL_CONTEXT_INTEL"..0x0001
    )

    IntConstant(
        "Accepted by the flags parameter of GetPerfQueryDataINTEL.",

        "PERFQUERY_WAIT_INTEL"..0x83FB,
        "PERFQUERY_FLUSH_INTEL"..0x83FA,
        "PERFQUERY_DONOT_FLUSH_INTEL"..0x83F9
    )

    IntConstant(
        "Returned by GetPerfCounterInfoINTEL function as counter type enumeration in location pointed by counterTypeEnum.",

        "PERFQUERY_COUNTER_EVENT_INTEL"..0x94F0,
        "PERFQUERY_COUNTER_DURATION_NORM_INTEL"..0x94F1,
        "PERFQUERY_COUNTER_DURATION_RAW_INTEL"..0x94F2,
        "PERFQUERY_COUNTER_THROUGHPUT_INTEL"..0x94F3,
        "PERFQUERY_COUNTER_RAW_INTEL"..0x94F4,
        "PERFQUERY_COUNTER_TIMESTAMP_INTEL"..0x94F5
    )

    IntConstant(
        "Returned by glGetPerfCounterInfoINTEL function as counter data type enumeration in location pointed by counterDataTypeEnum.",

        "PERFQUERY_COUNTER_DATA_UINT32_INTEL"..0x94F8,
        "PERFQUERY_COUNTER_DATA_UINT64_INTEL"..0x94F9,
        "PERFQUERY_COUNTER_DATA_FLOAT_INTEL"..0x94FA,
        "PERFQUERY_COUNTER_DATA_DOUBLE_INTEL"..0x94FB,
        "PERFQUERY_COUNTER_DATA_BOOL32_INTEL"..0x94FC
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv.",

        "PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL"..0x94FD,
        "PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL"..0x94FE,
        "PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL"..0x94FF
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv.",

        "PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL"..0x9500
    )

    void(
        "BeginPerfQueryINTEL",
        "",

        GLuint.IN("queryHandle", "")
    )

    void(
        "CreatePerfQueryINTEL",
        "",

        GLuint.IN("queryId", ""),
        Check(1)..ReturnParam..GLuint_p.OUT("queryHandle", "")
    )

    void(
        "DeletePerfQueryINTEL",
        "",

        GLuint.IN("queryHandle", "")
    )

    void(
        "EndPerfQueryINTEL",
        "",

        GLuint.IN("queryHandle", "")
    )

    void(
        "GetFirstPerfQueryIdINTEL",
        "",

        Check(1)..ReturnParam..GLuint_p.OUT("queryId", "")
    )

    void(
        "GetNextPerfQueryIdINTEL",
        "",

        GLuint.IN("queryId", ""),
        Check(1)..ReturnParam..GLuint_p.OUT("nextQueryId", "")
    )

    void(
        "GetPerfCounterInfoINTEL",
        "",

        GLuint.IN("queryId", ""),
        GLuint.IN("counterId", ""),
        AutoSize("counterName")..GLuint.IN("counterNameLength", ""),
        GLcharASCII_p.OUT("counterName", ""),
        AutoSize("counterDesc")..GLuint.IN("counterDescLength", ""),
        GLcharASCII_p.OUT("counterDesc", ""),
        Check(1)..GLuint_p.OUT("counterOffset", ""),
        Check(1)..GLuint_p.OUT("counterDataSize", ""),
        Check(1)..GLuint_p.OUT("counterTypeEnum", ""),
        Check(1)..GLuint_p.OUT("counterDataTypeEnum", ""),
        Check(1)..GLuint64_p.OUT("rawCounterMaxValue", "")
    )

    void(
        "GetPerfQueryDataINTEL",
        "",

        GLuint.IN("queryHandle", ""),
        GLuint.IN("flags", ""),
        AutoSize("data")..GLsizei.IN("dataSize", ""),
        void_p.OUT("data", ""),
        Check(1)..GLuint_p.OUT("bytesWritten", "")
    )

    void(
        "GetPerfQueryIdByNameINTEL",
        "",

        GLcharASCII_p.IN("queryName", ""),
        Check(1)..ReturnParam..GLuint_p.OUT("queryId", "")
    )

    void(
        "GetPerfQueryInfoINTEL",
        "",

        GLuint.IN("queryId", ""),
        AutoSize("queryName")..GLuint.IN("queryNameLength", ""),
        GLcharASCII_p.OUT("queryName", ""),
        Check(1)..GLuint_p.OUT("dataSize", ""),
        Check(1)..GLuint_p.OUT("noCounters", ""),
        Check(1)..GLuint_p.OUT("noInstances", ""),
        Check(1)..GLuint_p.OUT("capsMask", "")
    )
}