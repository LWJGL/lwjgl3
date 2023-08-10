/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_performance_monitor_global_mode.txt">QCOM_perfmon_global_mode</a> extension.
 * 
 * <p>This extension introduces a global tracking mode in the performance monitors. When enabled, the counters increment in all operations, including all
 * "housekeeping" operations such as resolves/clears and operations performed by other concurrent applications. The normal operation is to track only the
 * application's own operations.</p>
 */
public final class QCOMPerfmonGlobalMode {

    /**
     * Accepted by the {@code cap} parameter of Enable and Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, and
     * GetFloatv.
     */
    public static final int GL_PERFMON_GLOBAL_MODE_QCOM = 0x8FA0;

    private QCOMPerfmonGlobalMode() {}

}