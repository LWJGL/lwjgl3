/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val INTEL_performance_query = "INTELPerformanceQuery".nativeClassGLES("INTEL_performance_query", postfix = INTEL) {
    IntConstant(
        "PERFQUERY_SINGLE_CONTEXT_INTEL"..0x0000,
        "PERFQUERY_GLOBAL_CONTEXT_INTEL"..0x0001
    )

    IntConstant(
        "PERFQUERY_WAIT_INTEL"..0x83FB,
        "PERFQUERY_FLUSH_INTEL"..0x83FA,
        "PERFQUERY_DONOT_FLUSH_INTEL"..0x83F9
    )

    IntConstant(
        "PERFQUERY_COUNTER_EVENT_INTEL"..0x94F0,
        "PERFQUERY_COUNTER_DURATION_NORM_INTEL"..0x94F1,
        "PERFQUERY_COUNTER_DURATION_RAW_INTEL"..0x94F2,
        "PERFQUERY_COUNTER_THROUGHPUT_INTEL"..0x94F3,
        "PERFQUERY_COUNTER_RAW_INTEL"..0x94F4,
        "PERFQUERY_COUNTER_TIMESTAMP_INTEL"..0x94F5
    )

    IntConstant(
        "PERFQUERY_COUNTER_DATA_UINT32_INTEL"..0x94F8,
        "PERFQUERY_COUNTER_DATA_UINT64_INTEL"..0x94F9,
        "PERFQUERY_COUNTER_DATA_FLOAT_INTEL"..0x94FA,
        "PERFQUERY_COUNTER_DATA_DOUBLE_INTEL"..0x94FB,
        "PERFQUERY_COUNTER_DATA_BOOL32_INTEL"..0x94FC
    )

    IntConstant(
        "PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL"..0x94FD,
        "PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL"..0x94FE,
        "PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL"..0x94FF
    )

    IntConstant(
        "PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL"..0x9500
    )

    void(
        "BeginPerfQueryINTEL",

        GLuint("queryHandle")
    )

    void(
        "CreatePerfQueryINTEL",

        GLuint("queryId"),
        Check(1)..ReturnParam..GLuint.p("queryHandle")
    )

    void(
        "DeletePerfQueryINTEL",

        GLuint("queryHandle")
    )

    void(
        "EndPerfQueryINTEL",

        GLuint("queryHandle")
    )

    void(
        "GetFirstPerfQueryIdINTEL",

        Check(1)..ReturnParam..GLuint.p("queryId")
    )

    void(
        "GetNextPerfQueryIdINTEL",

        GLuint("queryId"),
        Check(1)..ReturnParam..GLuint.p("nextQueryId")
    )

    void(
        "GetPerfCounterInfoINTEL",

        GLuint("queryId"),
        GLuint("counterId"),
        AutoSize("counterName")..GLuint("counterNameLength"),
        GLcharASCII.p("counterName"),
        AutoSize("counterDesc")..GLuint("counterDescLength"),
        GLcharASCII.p("counterDesc"),
        Check(1)..GLuint.p("counterOffset"),
        Check(1)..GLuint.p("counterDataSize"),
        Check(1)..GLuint.p("counterTypeEnum"),
        Check(1)..GLuint.p("counterDataTypeEnum"),
        Check(1)..GLuint64.p("rawCounterMaxValue")
    )

    void(
        "GetPerfQueryDataINTEL",

        GLuint("queryHandle"),
        GLuint("flags"),
        AutoSize("data")..GLsizei("dataSize"),
        void.p("data"),
        Check(1)..GLuint.p("bytesWritten")
    )

    void(
        "GetPerfQueryIdByNameINTEL",

        Input..GLcharASCII.p("queryName"),
        Check(1)..ReturnParam..GLuint.p("queryId")
    )

    void(
        "GetPerfQueryInfoINTEL",

        GLuint("queryId"),
        AutoSize("queryName")..GLuint("queryNameLength"),
        GLcharASCII.p("queryName"),
        Check(1)..GLuint.p("dataSize"),
        Check(1)..GLuint.p("noCounters"),
        Check(1)..GLuint.p("noInstances"),
        Check(1)..GLuint.p("capsMask")
    )
}