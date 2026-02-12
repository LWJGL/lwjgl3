/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;
import org.lwjgl.system.ffm.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

import static org.lwjgl.system.ffm.FFM.*;

public final class JNI {

    @FFMFunctionAddress
    private interface JNIBindings {
        byte invokePB(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        short invokeC(MemorySegment __functionAddress);
        short invokeC(MemorySegment __functionAddress, int param0);
        short invokePC(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        short invokeCC(MemorySegment __functionAddress, int param0, short param1);
        short invokeCC(MemorySegment __functionAddress, short param0, boolean param1);
        short invokePC(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        short invokeJC(MemorySegment __functionAddress, int param0, int param1, long param2);
        short invokeCUC(MemorySegment __functionAddress, short param0, byte param1);
        short invokePCC(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1);
        short invokeCCC(MemorySegment __functionAddress, short param0, short param1, boolean param2);
        short invokePCC(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, short param2);
        short invokePCC(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, short param2);
        short invokeUPC(MemorySegment __functionAddress, byte param0, @FFMNullable @FFMPointer long param1, boolean param2);
        short invokePCC(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, short param3);
        short invokeCJC(MemorySegment __functionAddress, int param0, boolean param1, short param2, int param3, long param4);
        short invokeCPCC(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1, short param2);
        short invokeCPPC(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        short invokePPCC(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2);
        short invokeCCJC(MemorySegment __functionAddress, short param0, short param1, int param2, long param3);
        short invokePCCC(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, int param3, int param4);
        short invokeCCCCC(MemorySegment __functionAddress, short param0, short param1, short param2, short param3);
        short invokePJUPC(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, byte param2, @FFMNullable @FFMPointer long param3);
        short invokeCCJPC(MemorySegment __functionAddress, short param0, boolean param1, short param2, int param3, long param4, @FFMNullable @FFMPointer long param5);
        short invokePCCCCC(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, short param3, short param4);
        short invokeCCCJPC(MemorySegment __functionAddress, short param0, short param1, short param2, boolean param3, int param4, long param5, @FFMNullable @FFMPointer long param6);
        short invokeCCCJPC(MemorySegment __functionAddress, short param0, short param1, boolean param2, short param3, int param4, long param5, @FFMNullable @FFMPointer long param6);
        double invokeD(MemorySegment __functionAddress);
        double invokeD(MemorySegment __functionAddress, int param0);
        double invokePD(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        double invokePD(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        double invokePD(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2);
        double invokePPD(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        float invokeF(MemorySegment __functionAddress);
        float invokeF(MemorySegment __functionAddress, int param0);
        float invokePF(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        float invokePF(MemorySegment __functionAddress, float param0, @FFMNullable @FFMPointer long param1);
        float invokePF(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        float invokePF(MemorySegment __functionAddress, float param0, float param1, @FFMNullable @FFMPointer long param2);
        float invokePF(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, float param2);
        float invokePF(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2);
        float invokePF(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2);
        float invokePPF(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        float invokePPF(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2);
        float invokePPF(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, @FFMNullable @FFMPointer long param2, int param3);
        int invokeI(MemorySegment __functionAddress);
        int invokeI(MemorySegment __functionAddress, int param0);
        int invokeI(MemorySegment __functionAddress, boolean param0);
        int invokeI(MemorySegment __functionAddress, int param0, float param1);
        int invokeI(MemorySegment __functionAddress, int param0, int param1);
        int invokeI(MemorySegment __functionAddress, int param0, boolean param1);
        int invokeI(MemorySegment __functionAddress, int param0, int param1, int param2);
        int invokeI(MemorySegment __functionAddress, int param0, int param1, int param2, int param3);
        int invokeI(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4);
        int invokeI(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5);
        int invokeJI(MemorySegment __functionAddress, long param0);
        int invokePI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        int invokeCI(MemorySegment __functionAddress, int param0, short param1);
        int invokePI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1);
        int invokePI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        int invokePI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, boolean param1);
        int invokeCI(MemorySegment __functionAddress, int param0, short param1, boolean param2);
        int invokePI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2);
        int invokePI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, boolean param2);
        int invokePI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3);
        int invokePI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4);
        int invokePI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5, int param6);
        int invokeCPI(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1);
        int invokePCI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1);
        int invokePJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1);
        int invokePNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        int invokePJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2);
        int invokePNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2);
        int invokePNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2);
        int invokePPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, float param2);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, boolean param2);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, boolean param1, @FFMNullable @FFMPointer long param2);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, boolean param3);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, boolean param2, @FFMNullable @FFMPointer long param3);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, boolean param2, boolean param3);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4);
        int invokePPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, boolean param5);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        int invokePPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5, int param6);
        int invokeCPUI(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1, byte param2);
        int invokeJPPI(MemorySegment __functionAddress, long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        int invokePCPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, @FFMNullable @FFMPointer long param2);
        int invokePNNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2);
        int invokePNPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2);
        int invokePPCI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2);
        int invokePPJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2);
        int invokePPNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        int invokePNPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, @FFMNullable @FFMPointer long param3);
        int invokePNPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, int param3);
        int invokePPNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, long param3);
        int invokePPPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3);
        int invokePNNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, int param3, int param4);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, int param5);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, boolean param4, float param5);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6);
        int invokePPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, int param6, int param7);
        int invokePNPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        int invokePPNNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, long param3);
        int invokePPNPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, @FFMNullable @FFMPointer long param3);
        int invokePPPNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, long param3);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        int invokePUUUI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, byte param2, byte param3);
        int invokePNNPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, long param3, @FFMNullable @FFMPointer long param4);
        int invokePPPNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, long param4);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, int param7);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6, int param7);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5, int param6, int param7);
        int invokePPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, int param7, int param8);
        int invokePNNPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int invokePPNNPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, long param3, @FFMNullable @FFMPointer long param4);
        int invokePPPNNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, long param3, long param4);
        int invokePPPPNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, long param4);
        int invokePPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int invokePPUUUI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, byte param2, byte param3, byte param4);
        int invokePUUUUI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, byte param2, byte param3, byte param4);
        int invokePJPPNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, long param5);
        int invokePPNPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int invokePPNPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int invokePPPNJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, long param4, long param5);
        int invokePPPNNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, long param4, long param5);
        int invokePPPNPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, long param4, @FFMNullable @FFMPointer long param5);
        int invokePPPPNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, long param5);
        int invokePPPPNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, long param5);
        int invokePPPPPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int invokePPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int invokePPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int invokePPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int invokePPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5);
        int invokePNPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int invokePPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int invokePPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7);
        int invokePPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, int param6, @FFMNullable @FFMPointer long param7);
        int invokePPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5, int param6, @FFMNullable @FFMPointer long param7);
        int invokePPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, float param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8);
        int invokePPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int invokePPUUUUI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, byte param2, byte param3, byte param4, byte param5);
        int invokePJJJJPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, long param3, long param4, int param5, @FFMNullable @FFMPointer long param6);
        int invokePPNPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int invokePPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int invokePPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6);
        int invokePNNPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int invokePPPPPPI(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int invokePPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int invokePPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7, int param8, @FFMNullable @FFMPointer long param9);
        int invokePPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int invokePPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8);
        int invokePPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, float param5, float param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9);
        int invokePPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, int param7, @FFMNullable @FFMPointer long param8, int param9, @FFMNullable @FFMPointer long param10, int param11);
        int invokePPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9);
        long invokeJ(MemorySegment __functionAddress);
        long invokeJ(MemorySegment __functionAddress, int param0, int param1);
        long invokePJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        long invokePJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        long invokePJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2);
        long invokePJJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1);
        long invokePPJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        long invokePJJ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, long param2);
        long invokePJJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2);
        long invokePJJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2);
        long invokePPJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2);
        long invokeNN(MemorySegment __functionAddress, long param0);
        long invokePN(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        long invokePN(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        long invokeNNN(MemorySegment __functionAddress, long param0, long param1);
        long invokePPN(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        long invokeNNNN(MemorySegment __functionAddress, long param0, long param1, long param2);
        long invokePNPN(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2);
        long invokePNPN(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, int param3);
        long invokePPNN(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, long param4);
        long invokePNPNN(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, long param3);
        long invokePNPNPN(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, @FFMNullable @FFMPointer long param9, long param10, @FFMNullable @FFMPointer long param11);
        @FFMPointer long invokeP(MemorySegment __functionAddress);
        @FFMPointer long invokeP(MemorySegment __functionAddress, int param0);
        @FFMPointer long invokeP(MemorySegment __functionAddress, boolean param0);
        @FFMPointer long invokeP(MemorySegment __functionAddress, int param0, int param1);
        @FFMPointer long invokeP(MemorySegment __functionAddress, int param0, int param1, int param2);
        @FFMPointer long invokeCP(MemorySegment __functionAddress, short param0);
        @FFMPointer long invokeJP(MemorySegment __functionAddress, long param0);
        @FFMPointer long invokePP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        @FFMPointer long invokePP(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1);
        @FFMPointer long invokePP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, double param1);
        @FFMPointer long invokePP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1);
        @FFMPointer long invokePP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        @FFMPointer long invokePP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, boolean param1);
        @FFMPointer long invokePP(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2);
        @FFMPointer long invokePP(MemorySegment __functionAddress, int param0, boolean param1, @FFMNullable @FFMPointer long param2);
        @FFMPointer long invokePP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2);
        @FFMPointer long invokePP(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long invokePP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3);
        @FFMPointer long invokePP(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4);
        @FFMPointer long invokePP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, int param2, float param3, int param4);
        @FFMPointer long invokePP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4);
        @FFMPointer long invokePP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5);
        @FFMPointer long invokeCCP(MemorySegment __functionAddress, short param0, short param1);
        @FFMPointer long invokeJPP(MemorySegment __functionAddress, long param0, @FFMNullable @FFMPointer long param1);
        @FFMPointer long invokePJP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1);
        @FFMPointer long invokePNP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        @FFMPointer long invokePUP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1);
        @FFMPointer long invokeCPP(MemorySegment __functionAddress, int param0, short param1, @FFMNullable @FFMPointer long param2);
        @FFMPointer long invokePCP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, boolean param2);
        @FFMPointer long invokePJP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2);
        @FFMPointer long invokePJP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, boolean param2);
        @FFMPointer long invokePJP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, long param3);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, boolean param2, boolean param3);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, boolean param1, boolean param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4);
        @FFMPointer long invokePJP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, long param5);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4, int param5);
        @FFMPointer long invokePUP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, byte param2, int param3, boolean param4, boolean param5);
        @FFMPointer long invokePPP(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6);
        @FFMPointer long invokeCCPP(MemorySegment __functionAddress, short param0, short param1, @FFMNullable @FFMPointer long param2);
        @FFMPointer long invokeCPCP(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1, short param2);
        @FFMPointer long invokePJJP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2);
        @FFMPointer long invokePPJP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        @FFMPointer long invokePPUP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, byte param2);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, boolean param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long invokePPUP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, byte param3);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4);
        @FFMPointer long invokeJPPP(MemorySegment __functionAddress, int param0, int param1, int param2, long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, @FFMNullable @FFMPointer long param4, int param5);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6);
        @FFMPointer long invokePPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, @FFMNullable @FFMPointer long param4, int param5, int param6);
        @FFMPointer long invokePBPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long invokePNNPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long invokePPJPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long invokePPNNP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, long param3);
        @FFMPointer long invokePPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long invokePPPJP(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, long param4);
        @FFMPointer long invokePPPJP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, long param3, int param4);
        @FFMPointer long invokePPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long invokePPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long invokePPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long invokePPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        @FFMPointer long invokePJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long invokePJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5);
        @FFMPointer long invokePPPJP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, long param3, int param4, int param5);
        @FFMPointer long invokePPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long invokePPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5);
        @FFMPointer long invokePPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        @FFMPointer long invokePPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5, int param6);
        @FFMPointer long invokePPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5, int param6);
        @FFMPointer long invokePPPPP(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7);
        @FFMPointer long invokePJPJPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long invokePNNNPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long invokePPBPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, byte param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long invokePPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long invokeCCCUJP(MemorySegment __functionAddress, short param0, short param1, short param2, byte param3, int param4, long param5);
        @FFMPointer long invokePPPJPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, long param3, @FFMNullable @FFMPointer long param4, int param5);
        @FFMPointer long invokePPPPNP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, long param5);
        @FFMPointer long invokePPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long invokePPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long invokePPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5);
        @FFMPointer long invokePPJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        @FFMPointer long invokePPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6);
        @FFMPointer long invokePPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, int param6);
        @FFMPointer long invokePPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, int param6);
        @FFMPointer long invokePPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, int param6, int param7, int param8);
        @FFMPointer long invokePPJJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long invokePPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long invokePSSCCPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, short param3, short param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long invokePPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        @FFMPointer long invokePPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        @FFMPointer long invokePPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6);
        @FFMPointer long invokePPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        @FFMPointer long invokePPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        @FFMPointer long invokePPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7);
        @FFMPointer long invokePPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, int param7);
        @FFMPointer long invokePPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7, int param8, int param9);
        @FFMPointer long invokePPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, int param7, int param8, int param9);
        @FFMPointer long invokePPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        @FFMPointer long invokePPPPPJPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, long param6, int param7, @FFMNullable @FFMPointer long param8);
        @FFMPointer long invokePPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, int param8);
        @FFMPointer long invokePPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, int param7, @FFMNullable @FFMPointer long param8, int param9);
        @FFMPointer long invokePPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        @FFMPointer long invokePPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, int param7, @FFMNullable @FFMPointer long param8);
        @FFMPointer long invokePPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, int param8, @FFMNullable @FFMPointer long param9);
        @FFMPointer long invokePPPPJJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, long param5, int param6, long param7, int param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10);
        @FFMPointer long invokePPPPPJJPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, long param6, int param7, long param8, int param9, @FFMNullable @FFMPointer long param10);
        @FFMPointer long invokePPPPPJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, long param6, int param7, @FFMNullable @FFMPointer long param8, int param9, @FFMNullable @FFMPointer long param10);
        @FFMPointer long invokePPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, int param7, @FFMNullable @FFMPointer long param8, int param9, @FFMNullable @FFMPointer long param10);
        @FFMPointer long invokePPPPPJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6, int param7, long param8, int param9, @FFMNullable @FFMPointer long param10, @FFMNullable @FFMPointer long param11);
        @FFMPointer long invokePPPPPJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6, int param7, long param8, int param9, int param10, @FFMNullable @FFMPointer long param11, @FFMNullable @FFMPointer long param12);
        @FFMPointer long invokePPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, int param7, @FFMNullable @FFMPointer long param8, int param9, int param10, int param11, int param12, int param13);
        @FFMPointer long invokePPPPPJJJPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, long param6, long param7, long param8, int param9, @FFMNullable @FFMPointer long param10);
        @FFMPointer long invokePPPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, int param9, @FFMNullable @FFMPointer long param10);
        @FFMPointer long invokePPPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, int param7, @FFMNullable @FFMPointer long param8, int param9, @FFMNullable @FFMPointer long param10, int param11);
        @FFMPointer long invokePPPPPJPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, long param6, int param7, int param8, @FFMNullable @FFMPointer long param9, int param10, int param11, @FFMNullable @FFMPointer long param12, @FFMNullable @FFMPointer long param13);
        @FFMPointer long invokePPPPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9);
        @FFMPointer long invokePPPPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, int param7, @FFMNullable @FFMPointer long param8, int param9, @FFMNullable @FFMPointer long param10, @FFMNullable @FFMPointer long param11, int param12);
        @FFMPointer long invokePPPPPJPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, long param6, int param7, int param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10, @FFMNullable @FFMPointer long param11, @FFMNullable @FFMPointer long param12, @FFMNullable @FFMPointer long param13);
        @FFMPointer long invokePPPPPJPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, long param6, int param7, int param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10, int param11, int param12, @FFMNullable @FFMPointer long param13, @FFMNullable @FFMPointer long param14, @FFMNullable @FFMPointer long param15);
        @FFMPointer long invokePPPPPPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, int param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10, int param11, int param12, int param13, int param14, @FFMNullable @FFMPointer long param15, @FFMNullable @FFMPointer long param16, @FFMNullable @FFMPointer long param17, @FFMNullable @FFMPointer long param18);
        @FFMPointer long invokePPPPPJPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, long param6, int param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9, int param10, @FFMNullable @FFMPointer long param11, @FFMNullable @FFMPointer long param12, @FFMNullable @FFMPointer long param13, @FFMNullable @FFMPointer long param14, @FFMNullable @FFMPointer long param15);
        @FFMPointer long invokePPPPPJJPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, long param6, int param7, long param8, int param9, @FFMNullable @FFMPointer long param10, @FFMNullable @FFMPointer long param11, int param12, @FFMNullable @FFMPointer long param13, @FFMNullable @FFMPointer long param14, @FFMNullable @FFMPointer long param15, @FFMNullable @FFMPointer long param16);
        short invokePS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        byte invokeU(MemorySegment __functionAddress, int param0);
        byte invokePU(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        byte invokeUPU(MemorySegment __functionAddress, byte param0, @FFMNullable @FFMPointer long param1);
        void invokeV(MemorySegment __functionAddress);
        void invokeV(MemorySegment __functionAddress, double param0);
        void invokeV(MemorySegment __functionAddress, float param0);
        void invokeV(MemorySegment __functionAddress, int param0);
        void invokeV(MemorySegment __functionAddress, boolean param0);
        void invokeV(MemorySegment __functionAddress, int param0, float param1);
        void invokeV(MemorySegment __functionAddress, int param0, int param1);
        void invokeV(MemorySegment __functionAddress, int param0, boolean param1);
        void invokeV(MemorySegment __functionAddress, int param0, int param1, double param2);
        void invokeV(MemorySegment __functionAddress, int param0, int param1, float param2);
        void invokeV(MemorySegment __functionAddress, int param0, int param1, int param2);
        void invokeV(MemorySegment __functionAddress, int param0, float param1, float param2, float param3);
        void invokeV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3);
        void invokeV(MemorySegment __functionAddress, int param0, int param1, double param2, double param3, double param4);
        void invokeV(MemorySegment __functionAddress, int param0, int param1, float param2, float param3, float param4);
        void invokeV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4);
        void invokeCV(MemorySegment __functionAddress, short param0);
        void invokeJV(MemorySegment __functionAddress, long param0);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        void invokeUV(MemorySegment __functionAddress, byte param0);
        void invokeCV(MemorySegment __functionAddress, int param0, short param1);
        void invokeCV(MemorySegment __functionAddress, short param0, int param1);
        void invokeCV(MemorySegment __functionAddress, short param0, boolean param1);
        void invokeJV(MemorySegment __functionAddress, int param0, long param1);
        void invokeJV(MemorySegment __functionAddress, long param0, int param1);
        void invokePV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, boolean param1);
        void invokeUV(MemorySegment __functionAddress, byte param0, int param1);
        void invokeUV(MemorySegment __functionAddress, byte param0, boolean param1);
        void invokeCV(MemorySegment __functionAddress, short param0, int param1, int param2);
        void invokeJV(MemorySegment __functionAddress, int param0, int param1, long param2);
        void invokePV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2);
        void invokePV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, boolean param2);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, double param1, double param2);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, double param2);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, float param2);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, boolean param2);
        void invokePV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2, float param3);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2, int param3);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, double param3);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, float param3);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3);
        void invokePV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, float param2, float param3, float param4);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4);
        void invokeUV(MemorySegment __functionAddress, byte param0, float param1, float param2, float param3, float param4);
        void invokePV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        void invokePV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, boolean param5);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, double param3, double param4, double param5);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, float param3, float param4, float param5);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5);
        void invokePV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, boolean param5);
        void invokePV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        void invokeCCV(MemorySegment __functionAddress, short param0, short param1);
        void invokeCPV(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1);
        void invokePCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1);
        void invokePJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1);
        void invokePNV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        void invokePUV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1);
        void invokeUPV(MemorySegment __functionAddress, byte param0, @FFMNullable @FFMPointer long param1);
        void invokeCPV(MemorySegment __functionAddress, short param0, int param1, @FFMNullable @FFMPointer long param2);
        void invokeCPV(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1, int param2);
        void invokePCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, short param2);
        void invokePCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, boolean param2);
        void invokePJV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, long param2);
        void invokePJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2);
        void invokePJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2);
        void invokePPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, float param2);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, boolean param2);
        void invokeUCV(MemorySegment __functionAddress, byte param0, short param1, int param2);
        void invokePBV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, byte param3);
        void invokePCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, short param3);
        void invokePCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, int param2, int param3);
        void invokePJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, long param3);
        void invokePPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        void invokePPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, boolean param3);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3);
        void invokePSV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, short param3);
        void invokePUV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, byte param3);
        void invokeUCV(MemorySegment __functionAddress, byte param0, short param1, int param2, int param3);
        void invokeUPV(MemorySegment __functionAddress, byte param0, @FFMNullable @FFMPointer long param1, int param2, int param3);
        void invokePCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, int param2, int param3, int param4);
        void invokePPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, @FFMNullable @FFMPointer long param2, int param3, int param4);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4);
        void invokePPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, int param5);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, float param2, float param3, float param4, float param5);
        void invokePPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5, boolean param6);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4, int param5, int param6);
        void invokePPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, float param2, float param3, float param4, float param5, float param6, float param7);
        void invokeCCPV(MemorySegment __functionAddress, short param0, short param1, @FFMNullable @FFMPointer long param2);
        void invokeCPCV(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1, short param2);
        void invokeCPPV(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        void invokeJPPV(MemorySegment __functionAddress, long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        void invokePJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2);
        void invokePNNV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2);
        void invokePNPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2);
        void invokePPNV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        void invokeCCCV(MemorySegment __functionAddress, short param0, short param1, short param2, int param3);
        void invokeCCUV(MemorySegment __functionAddress, short param0, short param1, int param2, byte param3);
        void invokePJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, int param3);
        void invokePPJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, long param3);
        void invokePPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, float param3);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, boolean param3);
        void invokePUCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, short param2, int param3);
        void invokeUCCV(MemorySegment __functionAddress, byte param0, short param1, short param2, int param3);
        void invokeCCUV(MemorySegment __functionAddress, short param0, short param1, int param2, float param3, byte param4);
        void invokeJJJV(MemorySegment __functionAddress, int param0, int param1, long param2, long param3, long param4);
        void invokePNNV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3, long param4);
        void invokePPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, float param3, float param4);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, boolean param4);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, boolean param3, boolean param4);
        void invokePUCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, short param2, int param3, int param4);
        void invokePUPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, @FFMNullable @FFMPointer long param2, int param3, int param4);
        void invokeUCCV(MemorySegment __functionAddress, byte param0, short param1, int param2, int param3, short param4);
        void invokeUCUV(MemorySegment __functionAddress, byte param0, short param1, byte param2, int param3, int param4);
        void invokeUPCV(MemorySegment __functionAddress, byte param0, @FFMNullable @FFMPointer long param1, int param2, int param3, short param4);
        void invokeCCUV(MemorySegment __functionAddress, short param0, short param1, int param2, int param3, int param4, byte param5);
        void invokePPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, boolean param4, boolean param5);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, boolean param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, int param6);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5, int param6);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, float param2, float param3, float param4, float param5, @FFMNullable @FFMPointer long param6);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, float param3, float param4, float param5, float param6);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, boolean param6);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5, int param6, boolean param7);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, float param2, float param3, float param4, float param5, float param6, float param7, @FFMNullable @FFMPointer long param8);
        void invokePPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, float param3, float param4, float param5, float param6, float param7, float param8);
        void invokeCCPCV(MemorySegment __functionAddress, short param0, short param1, @FFMNullable @FFMPointer long param2, short param3);
        void invokeCCUPV(MemorySegment __functionAddress, short param0, short param1, byte param2, @FFMNullable @FFMPointer long param3);
        void invokePCPCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, @FFMNullable @FFMPointer long param2, short param3);
        void invokePNPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        void invokePPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        void invokeCCCUV(MemorySegment __functionAddress, short param0, short param1, short param2, int param3, byte param4);
        void invokePCCUV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, int param3, byte param4);
        void invokePJJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, long param3, @FFMNullable @FFMPointer long param4);
        void invokePPCPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2, int param3, @FFMNullable @FFMPointer long param4);
        void invokePPPCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, short param4);
        void invokePPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void invokePPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void invokePPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4);
        void invokePPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        void invokePPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, boolean param4);
        void invokePUCCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, short param2, short param3, int param4);
        void invokeCCCUV(MemorySegment __functionAddress, short param0, short param1, short param2, int param3, int param4, byte param5);
        void invokePJJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, long param3, long param4, long param5);
        void invokePPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void invokePPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, float param3, float param4, @FFMNullable @FFMPointer long param5);
        void invokePUCCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, short param2, int param3, int param4, short param5);
        void invokePUCUV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, short param2, byte param3, int param4, int param5);
        void invokePUPCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, @FFMNullable @FFMPointer long param2, int param3, int param4, short param5);
        void invokeCCCUV(MemorySegment __functionAddress, short param0, short param1, short param2, int param3, int param4, int param5, byte param6);
        void invokePCCUV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, int param3, int param4, int param5, byte param6);
        void invokePPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, float param3, float param4, float param5, float param6, @FFMNullable @FFMPointer long param7);
        void invokePPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, float param6, @FFMNullable @FFMPointer long param7);
        void invokePPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, float param3, float param4, float param5, float param6, float param7, float param8, @FFMNullable @FFMPointer long param9);
        void invokeCCCCCV(MemorySegment __functionAddress, short param0, short param1, short param2, short param3, short param4);
        void invokeCCUPPV(MemorySegment __functionAddress, short param0, short param1, byte param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void invokePPCPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void invokePPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void invokePCCCUV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, short param3, int param4, byte param5);
        void invokePJPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void invokePPPPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void invokePPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void invokePPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void invokePPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        void invokePCCCUV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, short param3, int param4, int param5, byte param6);
        void invokePPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        void invokePPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, boolean param6);
        void invokePCCCCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, short param3, boolean param4, boolean param5, short param6, int param7);
        void invokePCCCUV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, short param3, int param4, int param5, int param6, byte param7);
        void invokePPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7);
        void invokePPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, int param6, @FFMNullable @FFMPointer long param7);
        void invokeCCCCUV(MemorySegment __functionAddress, short param0, short param1, short param2, int param3, short param4, int param5, int param6, int param7, byte param8);
        void invokePPPPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7, int param8, boolean param9);
        void invokeCCCCPCV(MemorySegment __functionAddress, short param0, short param1, short param2, short param3, @FFMNullable @FFMPointer long param4, short param5);
        void invokePPPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void invokePCCCCUV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, int param2, short param3, short param4, short param5, byte param6);
        void invokePPPPPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        void invokePCCCCUV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, short param3, int param4, short param5, int param6, int param7, int param8, byte param9);
        void invokePPPPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        void invokePPPPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        void invokeCCUCCCCPCV(MemorySegment __functionAddress, short param0, short param1, byte param2, short param3, short param4, short param5, short param6, @FFMNullable @FFMPointer long param7, short param8);
        void invokeCUCCCCCCPV(MemorySegment __functionAddress, short param0, byte param1, short param2, short param3, short param4, short param5, short param6, short param7, @FFMNullable @FFMPointer long param8);
        void invokeCCUUCCCCPCV(MemorySegment __functionAddress, short param0, short param1, byte param2, byte param3, short param4, short param5, short param6, short param7, @FFMNullable @FFMPointer long param8, short param9);
        void invokeCCUUUUUUUUUV(MemorySegment __functionAddress, short param0, short param1, float param2, byte param3, byte param4, byte param5, byte param6, byte param7, byte param8, byte param9, byte param10, byte param11);
        void invokeCCUCCCCUCCCCCCV(MemorySegment __functionAddress, short param0, short param1, byte param2, short param3, short param4, short param5, short param6, byte param7, short param8, short param9, short param10, short param11, short param12, short param13);
        void invokePCCUCCCCUCCCCCCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, byte param3, short param4, short param5, short param6, short param7, byte param8, short param9, short param10, short param11, short param12, short param13, short param14);
        boolean invokeZ(MemorySegment __functionAddress);
        boolean invokeZ(MemorySegment __functionAddress, int param0);
        boolean invokeZ(MemorySegment __functionAddress, boolean param0);
        boolean invokeZ(MemorySegment __functionAddress, float param0, float param1);
        boolean invokeZ(MemorySegment __functionAddress, int param0, float param1);
        boolean invokeZ(MemorySegment __functionAddress, int param0, int param1);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        boolean invokeJZ(MemorySegment __functionAddress, long param0, int param1);
        boolean invokePZ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, boolean param1);
        boolean invokeJZ(MemorySegment __functionAddress, long param0, int param1, int param2);
        boolean invokePZ(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2);
        boolean invokePZ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, float param2);
        boolean invokePZ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2);
        boolean invokePZ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, boolean param2);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, int param2);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, boolean param2);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, boolean param1, int param2);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2, float param3);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2, float param3, float param4);
        boolean invokePZ(MemorySegment __functionAddress, int param0, int param1, int param2, float param3, boolean param4, @FFMNullable @FFMPointer long param5);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, float param3, float param4, float param5, float param6);
        boolean invokePZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, boolean param3, float param4, float param5, float param6);
        boolean invokePBZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1);
        boolean invokePCZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1);
        boolean invokePJZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1);
        boolean invokePPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        boolean invokePSZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1);
        boolean invokePUZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1);
        boolean invokeUPZ(MemorySegment __functionAddress, byte param0, @FFMNullable @FFMPointer long param1);
        boolean invokeJPZ(MemorySegment __functionAddress, long param0, @FFMNullable @FFMPointer long param1, boolean param2);
        boolean invokePJZ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, long param2);
        boolean invokePPZ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        boolean invokePPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2);
        boolean invokePPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2);
        boolean invokePPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, boolean param2);
        boolean invokePSZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, short param2);
        boolean invokePUZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, byte param2);
        boolean invokePPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2, @FFMNullable @FFMPointer long param3);
        boolean invokePPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3);
        boolean invokePPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3);
        boolean invokePPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3);
        boolean invokePPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, boolean param1, @FFMNullable @FFMPointer long param2, int param3);
        boolean invokePPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, float param4);
        boolean invokePPZ(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, int param5, @FFMNullable @FFMPointer long param6, int param7);
        boolean invokePPZ(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, int param5, @FFMNullable @FFMPointer long param6, int param7, boolean param8);
        boolean invokePPZ(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5, int param6, int param7, int param8, int param9, @FFMNullable @FFMPointer long param10, int param11);
        boolean invokePCCZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2);
        boolean invokePPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        boolean invokePCCZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, int param3);
        boolean invokePJJZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, long param3);
        boolean invokePJPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, int param3);
        boolean invokePPPZ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        boolean invokePPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        boolean invokePPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3);
        boolean invokePPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, boolean param3);
        boolean invokePPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, boolean param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        boolean invokePSSZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, short param2, short param3);
        boolean invokeCCJZ(MemorySegment __functionAddress, short param0, boolean param1, short param2, int param3, long param4);
        boolean invokePJPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, @FFMNullable @FFMPointer long param3, int param4);
        boolean invokePPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        boolean invokePPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, boolean param3, int param4);
        boolean invokePPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, boolean param5);
        boolean invokePPPJZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, long param3);
        boolean invokePPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        boolean invokePUUUZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, byte param2, byte param3);
        boolean invokePPPPZ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        boolean invokePPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        boolean invokePPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        boolean invokePPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, float param3, @FFMNullable @FFMPointer long param4);
        boolean invokePPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        boolean invokePPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, boolean param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        boolean invokePJPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        boolean invokePPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, float param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        boolean invokePPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5);
        boolean invokePPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, float param3, float param4, float param5, float param6, float param7, @FFMNullable @FFMPointer long param8);
        boolean invokePPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4, int param5, float param6, int param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9);
        boolean invokePPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, float param3, float param4, float param5, float param6, float param7, @FFMNullable @FFMPointer long param8, float param9);
        boolean invokePPPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        boolean invokePPPUPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, byte param3, @FFMNullable @FFMPointer long param4);
        boolean invokePUUUUZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, byte param1, byte param2, byte param3, byte param4);
        boolean invokePPPPPZ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        boolean invokePPPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        boolean invokePPPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5);
        boolean invokePPPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        boolean invokePPPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, double param4, @FFMNullable @FFMPointer long param5, int param6);
        boolean invokePPPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, boolean param5, int param6);
        boolean invokePUUUUZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, byte param3, byte param4, byte param5, byte param6);
        boolean invokePPPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, int param7);
        boolean invokePPJJPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        boolean invokePPPPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        boolean invokePPPPPPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, int param7, int param8, @FFMNullable @FFMPointer long param9, int param10, int param11);
        short callC(MemorySegment __functionAddress, int param0);
        float callF(MemorySegment __functionAddress, int param0, int param1, int param2);
        float callPF(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1);
        int callI(MemorySegment __functionAddress);
        int callI(MemorySegment __functionAddress, int param0);
        int callI(MemorySegment __functionAddress, int param0, int param1);
        int callI(MemorySegment __functionAddress, int param0, int param1, int param2);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        int callPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        int callPI(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2);
        int callPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, int param2);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, float param2);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2);
        int callJI(MemorySegment __functionAddress, int param0, long param1, int param2, int param3);
        int callPI(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2, float param3);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, float param2, float param3);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, boolean param3);
        int callPI(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, float param2, float param3, int param4);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4);
        int callPI(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        int callPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, int param3, float param4, int param5);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5, int param6);
        int callPI(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, int param6, float param7);
        int callPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8);
        int callPJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        int callPJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2);
        int callPJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, float param2);
        int callPJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2);
        int callPPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, @FFMNullable @FFMPointer long param2);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, float param2);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2);
        int callPPI(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, float param2, @FFMNullable @FFMPointer long param3);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, float param2, float param3);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, float param2, int param3);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, float param2, float param3, @FFMNullable @FFMPointer long param4);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, boolean param4);
        int callPPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, int param3, float param4, @FFMNullable @FFMPointer long param5);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, float param2, float param3, float param4, @FFMNullable @FFMPointer long param5);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4, int param5);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, float param2, float param3, float param4, int param5, @FFMNullable @FFMPointer long param6);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, float param2, float param3, float param4, float param5, int param6, @FFMNullable @FFMPointer long param7);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5, int param6, @FFMNullable @FFMPointer long param7);
        int callPPI(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5, int param6, int param7, float param8);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, float param2, float param3, float param4, float param5, float param6, int param7, @FFMNullable @FFMPointer long param8);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, float param3, float param4, float param5, float param6, float param7, int param8, @FFMNullable @FFMPointer long param9, int param10);
        int callPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5, int param6, @FFMNullable @FFMPointer long param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16);
        int callPJJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2);
        int callPJPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2);
        int callPPJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        int callPJJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, float param3);
        int callPJJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, int param3);
        int callPJPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, @FFMNullable @FFMPointer long param3);
        int callPJPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, @FFMNullable @FFMPointer long param3);
        int callPPJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, long param3);
        int callPPJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, long param3);
        int callPPNI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, long param3);
        int callPPPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3);
        int callPJJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, long param3, int param4);
        int callPJPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, @FFMNullable @FFMPointer long param3, int param4);
        int callPPJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, long param4);
        int callPPPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5, int param6);
        int callPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        int callJPPI(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callJJPPI(MemorySegment __functionAddress, long param0, long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        int callPJJJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, long param3);
        int callPJJPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, @FFMNullable @FFMPointer long param3);
        int callPJPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        int callPPJPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, @FFMNullable @FFMPointer long param3);
        int callPPNPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, @FFMNullable @FFMPointer long param3);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        int callPJJJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, long param3, long param4);
        int callPJPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        int callPJPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int callPPPPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5);
        int callPJPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        int callPPPPI(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20, @FFMNullable @FFMPointer long param21, @FFMNullable @FFMPointer long param22);
        int callPJJPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int callPJPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int callPPJPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int callPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        int callPJJJPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, long param3, int param4, @FFMNullable @FFMPointer long param5);
        int callPJPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int callPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int callPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int callPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int callPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        int callPPJPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPJPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPPPPI(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callJPPPPI(MemorySegment __functionAddress, int param0, int param1, long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callPJPPJI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, long param6, int param7);
        int callPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callPJJJJPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, long param3, long param4, @FFMNullable @FFMPointer long param5);
        int callPPPPJPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, long param4, @FFMNullable @FFMPointer long param5);
        int callPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        int callPJJPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPJPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPPJPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        int callPJPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callPPPJPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, long param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callPPPPPPI(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, int param7);
        int callPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8);
        int callPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8);
        int callPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8);
        int callPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8);
        int callPPPPPJPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        int callPPJPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8);
        int callPPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8);
        int callPPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, int param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9);
        int callPPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, int param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10);
        int callPPPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9);
        int callPPPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, int param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10);
        int callPPPPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, int param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10);
        int callPPPPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, int param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10, @FFMNullable @FFMPointer long param11);
        int callPPPPPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, int param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10, @FFMNullable @FFMPointer long param11);
        int callPPPPPPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9, int param10, @FFMNullable @FFMPointer long param11, @FFMNullable @FFMPointer long param12);
        int callPPPPPPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10, int param11, @FFMNullable @FFMPointer long param12, @FFMNullable @FFMPointer long param13);
        int callPPPPPPPPPPPPPPPI(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10, @FFMNullable @FFMPointer long param11, int param12, @FFMNullable @FFMPointer long param13, @FFMNullable @FFMPointer long param14, @FFMNullable @FFMPointer long param15);
        long callJ(MemorySegment __functionAddress);
        long callJ(MemorySegment __functionAddress, int param0);
        long callJ(MemorySegment __functionAddress, int param0, int param1);
        long callJ(MemorySegment __functionAddress, int param0, int param1, boolean param2, int param3, int param4);
        long callPJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        long callPPJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        long callPJJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3);
        long callPJJJ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2);
        long callPN(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        @FFMPointer long callP(MemorySegment __functionAddress);
        @FFMPointer long callP(MemorySegment __functionAddress, int param0);
        @FFMPointer long callP(MemorySegment __functionAddress, int param0, int param1);
        @FFMPointer long callP(MemorySegment __functionAddress, int param0, float param1, float param2, float param3);
        @FFMPointer long callJP(MemorySegment __functionAddress, long param0);
        @FFMPointer long callPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        @FFMPointer long callPP(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1);
        @FFMPointer long callPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        @FFMPointer long callPP(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2);
        @FFMPointer long callPP(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2);
        @FFMPointer long callPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2);
        @FFMPointer long callPP(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3);
        @FFMPointer long callJJP(MemorySegment __functionAddress, long param0, long param1);
        @FFMPointer long callPNP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1);
        @FFMPointer long callPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        @FFMPointer long callPPP(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        @FFMPointer long callPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2);
        @FFMPointer long callPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2);
        @FFMPointer long callPPP(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3);
        @FFMPointer long callPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long callPPP(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long callPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long callPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4);
        @FFMPointer long callPPNP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2);
        @FFMPointer long callPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        @FFMPointer long callPJPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long callPJPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, int param3);
        @FFMPointer long callPPPP(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long callPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long callPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long callPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3);
        @FFMPointer long callPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long callPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4);
        @FFMPointer long callPJPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long callJJPPP(MemorySegment __functionAddress, long param0, long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long callPPJPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long callPPNPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long callPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        @FFMPointer long callPJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long callPJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long callPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long callPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long callPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long callPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        @FFMPointer long callPJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long callPJPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long callPPPJPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, long param3, @FFMNullable @FFMPointer long param4);
        @FFMPointer long callPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long callPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long callPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        @FFMPointer long callPJJPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long callPJPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long callPPJPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long callPPPJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        @FFMPointer long callPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        @FFMPointer long callPPJPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        @FFMPointer long callPPPPJPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        @FFMPointer long callPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8);
        @FFMPointer long callPPPPPPPP(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, int param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9, int param10, @FFMNullable @FFMPointer long param11, @FFMNullable @FFMPointer long param12);
        @FFMPointer long callPJPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        @FFMPointer long callPPJPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9);
        @FFMPointer long callPJPPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9);
        @FFMPointer long callPPJPPPPPPPP(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, int param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10, @FFMNullable @FFMPointer long param11);
        short callS(MemorySegment __functionAddress, int param0);
        short callPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        short callPCS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1);
        short callPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        short callPSS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1);
        short callSPS(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1);
        short callPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2);
        short callPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3);
        short callPCPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, @FFMNullable @FFMPointer long param2);
        short callPPCS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2);
        short callPPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        short callPPSS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2);
        short callPSPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, @FFMNullable @FFMPointer long param2);
        short callSPPS(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        short callSPSS(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1, short param2);
        short callPPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4);
        short callPJCCS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, short param2, short param3);
        short callPPSPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2, @FFMNullable @FFMPointer long param3);
        short callPSSPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, @FFMNullable @FFMPointer long param3, int param4);
        short callPPPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        short callPCPPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        short callPCPSPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, @FFMNullable @FFMPointer long param2, short param3, @FFMNullable @FFMPointer long param4);
        short callPSSPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        short callPCPPPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        short callPCSPPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        short callPPSPSPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2, @FFMNullable @FFMPointer long param3, short param4, @FFMNullable @FFMPointer long param5);
        short callPCCPSPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, @FFMNullable @FFMPointer long param3, short param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        short callPPSPSPSS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2, @FFMNullable @FFMPointer long param3, short param4, @FFMNullable @FFMPointer long param5, short param6);
        short callSPSSPSPS(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1, short param2, short param3, @FFMNullable @FFMPointer long param4, short param5, @FFMNullable @FFMPointer long param6);
        short callPCPSPPSPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, @FFMNullable @FFMPointer long param2, short param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, short param6, @FFMNullable @FFMPointer long param7);
        short callPPPSPSPCS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, short param3, @FFMNullable @FFMPointer long param4, short param5, @FFMNullable @FFMPointer long param6, short param7);
        short callSPSPPPSPS(MemorySegment __functionAddress, short param0, @FFMNullable @FFMPointer long param1, short param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, short param6, @FFMNullable @FFMPointer long param7);
        short callPCPSPPPPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, @FFMNullable @FFMPointer long param2, short param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8);
        short callPPSPSPSCCS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2, @FFMNullable @FFMPointer long param3, short param4, @FFMNullable @FFMPointer long param5, short param6, short param7, short param8);
        short callPPSPSPSPSS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2, @FFMNullable @FFMPointer long param3, short param4, @FFMNullable @FFMPointer long param5, short param6, @FFMNullable @FFMPointer long param7, short param8);
        short callPCPSPSPSCCS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, @FFMNullable @FFMPointer long param2, short param3, @FFMNullable @FFMPointer long param4, short param5, @FFMNullable @FFMPointer long param6, short param7, short param8, short param9);
        short callPCSSSPSPPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, short param3, short param4, @FFMNullable @FFMPointer long param5, short param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9);
        short callPSSSPSSPPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, short param2, short param3, @FFMNullable @FFMPointer long param4, short param5, short param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9);
        short callPSPSPPPPPPPS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, short param1, @FFMNullable @FFMPointer long param2, short param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10);
        short callPPSPSPSPSPSPSS(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, short param2, @FFMNullable @FFMPointer long param3, short param4, @FFMNullable @FFMPointer long param5, short param6, @FFMNullable @FFMPointer long param7, short param8, @FFMNullable @FFMPointer long param9, short param10, @FFMNullable @FFMPointer long param11, short param12);
        void callV(MemorySegment __functionAddress);
        void callV(MemorySegment __functionAddress, double param0);
        void callV(MemorySegment __functionAddress, float param0);
        void callV(MemorySegment __functionAddress, int param0);
        void callV(MemorySegment __functionAddress, boolean param0);
        void callV(MemorySegment __functionAddress, double param0, double param1);
        void callV(MemorySegment __functionAddress, float param0, float param1);
        void callV(MemorySegment __functionAddress, float param0, boolean param1);
        void callV(MemorySegment __functionAddress, int param0, double param1);
        void callV(MemorySegment __functionAddress, int param0, float param1);
        void callV(MemorySegment __functionAddress, int param0, int param1);
        void callV(MemorySegment __functionAddress, int param0, boolean param1);
        void callV(MemorySegment __functionAddress, double param0, double param1, double param2);
        void callV(MemorySegment __functionAddress, float param0, float param1, float param2);
        void callV(MemorySegment __functionAddress, int param0, double param1, double param2);
        void callV(MemorySegment __functionAddress, int param0, float param1, float param2);
        void callV(MemorySegment __functionAddress, int param0, int param1, double param2);
        void callV(MemorySegment __functionAddress, int param0, int param1, float param2);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2);
        void callV(MemorySegment __functionAddress, int param0, int param1, boolean param2);
        void callV(MemorySegment __functionAddress, double param0, double param1, double param2, double param3);
        void callV(MemorySegment __functionAddress, float param0, float param1, float param2, float param3);
        void callV(MemorySegment __functionAddress, int param0, double param1, double param2, double param3);
        void callV(MemorySegment __functionAddress, int param0, float param1, float param2, float param3);
        void callV(MemorySegment __functionAddress, int param0, int param1, double param2, double param3);
        void callV(MemorySegment __functionAddress, int param0, int param1, float param2, float param3);
        void callV(MemorySegment __functionAddress, int param0, int param1, float param2, int param3);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, double param3);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, float param3);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, boolean param3);
        void callV(MemorySegment __functionAddress, int param0, int param1, boolean param2, int param3);
        void callV(MemorySegment __functionAddress, boolean param0, boolean param1, boolean param2, boolean param3);
        void callV(MemorySegment __functionAddress, int param0, double param1, double param2, double param3, double param4);
        void callV(MemorySegment __functionAddress, int param0, float param1, float param2, float param3, float param4);
        void callV(MemorySegment __functionAddress, int param0, int param1, double param2, double param3, double param4);
        void callV(MemorySegment __functionAddress, int param0, int param1, float param2, float param3, float param4);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, float param3, int param4);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, boolean param3, int param4);
        void callV(MemorySegment __functionAddress, int param0, boolean param1, boolean param2, boolean param3, boolean param4);
        void callV(MemorySegment __functionAddress, double param0, double param1, double param2, double param3, double param4, double param5);
        void callV(MemorySegment __functionAddress, int param0, double param1, double param2, int param3, double param4, double param5);
        void callV(MemorySegment __functionAddress, int param0, float param1, float param2, int param3, float param4, float param5);
        void callV(MemorySegment __functionAddress, int param0, int param1, double param2, double param3, double param4, double param5);
        void callV(MemorySegment __functionAddress, int param0, int param1, float param2, float param3, float param4, float param5);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, boolean param5);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, boolean param4, int param5);
        void callV(MemorySegment __functionAddress, int param0, double param1, double param2, double param3, double param4, double param5, double param6);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, double param3, double param4, double param5, double param6);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, float param3, float param4, float param5, float param6);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, boolean param3, int param4, int param5, int param6);
        void callV(MemorySegment __functionAddress, float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, float param3, float param4, float param5, float param6, float param7);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9);
        void callV(MemorySegment __functionAddress, int param0, int param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14);
        void callV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16);
        void callJV(MemorySegment __functionAddress, long param0);
        void callPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        void callSV(MemorySegment __functionAddress, short param0);
        void callUV(MemorySegment __functionAddress, byte param0);
        void callCV(MemorySegment __functionAddress, int param0, short param1);
        void callJV(MemorySegment __functionAddress, int param0, long param1);
        void callJV(MemorySegment __functionAddress, long param0, int param1);
        void callPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1);
        void callPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1);
        void callPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1);
        void callSV(MemorySegment __functionAddress, int param0, short param1);
        void callJV(MemorySegment __functionAddress, int param0, int param1, long param2);
        void callPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2);
        void callPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2);
        void callPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2);
        void callPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2);
        void callJV(MemorySegment __functionAddress, int param0, long param1, int param2, int param3);
        void callNV(MemorySegment __functionAddress, long param0, int param1, int param2, int param3);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3);
        void callPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3);
        void callPV(MemorySegment __functionAddress, int param0, int param1, boolean param2, @FFMNullable @FFMPointer long param3);
        void callPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, int param3);
        void callPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, float param1, float param2, float param3);
        void callPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, boolean param4);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, boolean param3, @FFMNullable @FFMPointer long param4);
        void callPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4);
        void callPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4);
        void callPV(MemorySegment __functionAddress, int param0, boolean param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        void callPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4);
        void callJV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, long param5);
        void callPV(MemorySegment __functionAddress, int param0, double param1, double param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPV(MemorySegment __functionAddress, int param0, float param1, float param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, boolean param5);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, int param5);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, boolean param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5);
        void callPV(MemorySegment __functionAddress, int param0, boolean param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5);
        void callJV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, long param6);
        void callPV(MemorySegment __functionAddress, int param0, int param1, double param2, double param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        void callPV(MemorySegment __functionAddress, int param0, int param1, float param2, float param3, float param4, float param5, @FFMNullable @FFMPointer long param6);
        void callPV(MemorySegment __functionAddress, int param0, int param1, float param2, float param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5, int param6);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, int param5, int param6);
        void callPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, int param6);
        void callPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5, int param6);
        void callJV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7);
        void callJV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, long param7);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, @FFMNullable @FFMPointer long param7);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, @FFMNullable @FFMPointer long param7);
        void callJV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, long param8);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, @FFMNullable @FFMPointer long param8);
        void callPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, int param6, int param7, float param8);
        void callPV(MemorySegment __functionAddress, int param0, double param1, double param2, int param3, int param4, double param5, double param6, int param7, int param8, @FFMNullable @FFMPointer long param9);
        void callPV(MemorySegment __functionAddress, int param0, float param1, float param2, int param3, int param4, float param5, float param6, int param7, int param8, @FFMNullable @FFMPointer long param9);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, @FFMNullable @FFMPointer long param9);
        void callJV(MemorySegment __functionAddress, long param0, int param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10);
        void callPV(MemorySegment __functionAddress, int param0, int param1, double param2, double param3, int param4, int param5, double param6, double param7, int param8, int param9, @FFMNullable @FFMPointer long param10);
        void callPV(MemorySegment __functionAddress, int param0, int param1, float param2, float param3, int param4, int param5, float param6, float param7, int param8, int param9, @FFMNullable @FFMPointer long param10);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, @FFMNullable @FFMPointer long param10);
        void callPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10);
        void callJV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, long param10, boolean param11);
        void callPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, @FFMNullable @FFMPointer long param11);
        void callPJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1);
        void callPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1);
        void callSSV(MemorySegment __functionAddress, short param0, short param1);
        void callJJV(MemorySegment __functionAddress, int param0, long param1, long param2);
        void callPCV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, short param2);
        void callPJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2);
        void callPJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, float param2);
        void callPJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2);
        void callPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        void callPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2);
        void callPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2);
        void callSSV(MemorySegment __functionAddress, int param0, short param1, short param2);
        void callJJV(MemorySegment __functionAddress, int param0, int param1, long param2, long param3);
        void callJPV(MemorySegment __functionAddress, int param0, int param1, long param2, @FFMNullable @FFMPointer long param3);
        void callJPV(MemorySegment __functionAddress, int param0, long param1, int param2, @FFMNullable @FFMPointer long param3);
        void callPJV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, long param3);
        void callPJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, int param3);
        void callPJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        void callPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3);
        void callPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3);
        void callPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, boolean param3);
        void callPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3);
        void callPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3);
        void callPJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3, int param4);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        void callPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4);
        void callPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4);
        void callPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5);
        void callPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5);
        void callPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5, int param6);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, int param5, int param6, @FFMNullable @FFMPointer long param7);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, int param6, @FFMNullable @FFMPointer long param7);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, float param5, float param6, int param7, @FFMNullable @FFMPointer long param8);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, int param6, int param7, @FFMNullable @FFMPointer long param8);
        void callPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6, int param7, int param8, float param9);
        void callBBBV(MemorySegment __functionAddress, byte param0, byte param1, byte param2);
        void callCCCV(MemorySegment __functionAddress, short param0, short param1, short param2);
        void callPJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2);
        void callPJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2);
        void callPPNV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2);
        void callPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        void callSSSV(MemorySegment __functionAddress, short param0, short param1, short param2);
        void callUUUV(MemorySegment __functionAddress, byte param0, byte param1, byte param2);
        void callJJJV(MemorySegment __functionAddress, int param0, long param1, long param2, long param3);
        void callPJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, int param3);
        void callPJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, @FFMNullable @FFMPointer long param3);
        void callPPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        void callPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        void callPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3);
        void callPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3);
        void callSSSV(MemorySegment __functionAddress, int param0, short param1, short param2, short param3);
        void callJJJV(MemorySegment __functionAddress, int param0, int param1, long param2, long param3, long param4);
        void callPJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, long param3, int param4);
        void callPJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, int param3, int param4);
        void callPPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void callPPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void callPPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4);
        void callPPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        void callPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void callPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4);
        void callPJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPPJV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, long param4, boolean param5);
        void callPPJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, long param4, int param5);
        void callPPPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void callPPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void callPPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, long param3, long param4, int param5, int param6);
        void callPPPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        void callPPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        void callPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        void callPPPV(MemorySegment __functionAddress, int param0, int param1, int param2, int param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        void callPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        void callPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, int param2, int param3, int param4, int param5, int param6, int param7, @FFMNullable @FFMPointer long param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17);
        void callBBBBV(MemorySegment __functionAddress, byte param0, byte param1, byte param2, byte param3);
        void callCCCCV(MemorySegment __functionAddress, short param0, short param1, short param2, short param3);
        void callPJJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, long param3);
        void callPJJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, @FFMNullable @FFMPointer long param3);
        void callPJPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        void callPPPNV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, long param3);
        void callPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3);
        void callSSSSV(MemorySegment __functionAddress, short param0, short param1, short param2, short param3);
        void callUUUUV(MemorySegment __functionAddress, byte param0, byte param1, byte param2, byte param3);
        void callJJJJV(MemorySegment __functionAddress, int param0, long param1, long param2, long param3, long param4);
        void callPJJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, long param3, int param4);
        void callPJJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, long param3, @FFMNullable @FFMPointer long param4);
        void callPJJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, int param3, @FFMNullable @FFMPointer long param4);
        void callPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4);
        void callPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, int param4);
        void callSSSSV(MemorySegment __functionAddress, int param0, short param1, short param2, short param3, short param4);
        void callUUUUV(MemorySegment __functionAddress, int param0, byte param1, byte param2, byte param3, byte param4);
        void callJJJJV(MemorySegment __functionAddress, int param0, int param1, long param2, long param3, long param4, long param5);
        void callPJJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, long param3, int param4, int param5);
        void callPJJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, long param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPJJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, int param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPJPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5);
        void callPPPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void callPPPPV(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5);
        void callPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void callPJJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3, long param4, int param5, @FFMNullable @FFMPointer long param6);
        void callPJJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, long param3, int param4, int param5, @FFMNullable @FFMPointer long param6);
        void callPJPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        void callPPPPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        void callPPPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, int param6);
        void callPJJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, long param3, int param4, int param5, @FFMNullable @FFMPointer long param6, int param7);
        void callPJPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, long param2, int param3, int param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7);
        void callPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, int param3, int param4, @FFMNullable @FFMPointer long param5, int param6, @FFMNullable @FFMPointer long param7, int param8, @FFMNullable @FFMPointer long param9);
        void callPJJJPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, long param3, @FFMNullable @FFMPointer long param4);
        void callPPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5);
        void callPJJJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, long param3, long param4, int param5, int param6);
        void callPPPPPV(MemorySegment __functionAddress, int param0, int param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        void callPPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6);
        void callPJJJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, int param2, int param3, long param4, long param5, long param6, int param7);
        void callPJPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, int param2, long param3, @FFMNullable @FFMPointer long param4, int param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        void callPPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, int param5, int param6, int param7);
        void callPPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, int param1, @FFMNullable @FFMPointer long param2, int param3, int param4, int param5, @FFMNullable @FFMPointer long param6, int param7, @FFMNullable @FFMPointer long param8, int param9, @FFMNullable @FFMPointer long param10);
        void callPPPPPJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, @FFMNullable @FFMPointer long param3, @FFMNullable @FFMPointer long param4, long param5);
        void callPPPPPPV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2, int param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
        void callPPPPPPPV(MemorySegment __functionAddress, int param0, int param1, int param2, @FFMNullable @FFMPointer long param3, int param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7, @FFMNullable @FFMPointer long param8, @FFMNullable @FFMPointer long param9, @FFMNullable @FFMPointer long param10);
        void callPPJJJJJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, @FFMNullable @FFMPointer long param1, long param2, long param3, int param4, long param5, long param6, long param7, long param8);
        void callPJJJJJJJJJJJV(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, long param10, long param11, int param12, int param13, int param14);
        boolean callZ(MemorySegment __functionAddress, int param0);
        boolean callZ(MemorySegment __functionAddress, int param0, int param1);
        boolean callZ(MemorySegment __functionAddress, int param0, float param1, float param2);
        boolean callZ(MemorySegment __functionAddress, int param0, int param1, float param2, float param3);
        boolean callJZ(MemorySegment __functionAddress, long param0);
        boolean callPZ(MemorySegment __functionAddress, @FFMNullable @FFMPointer long param0);
        boolean callJZ(MemorySegment __functionAddress, int param0, long param1);
        boolean callPZ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1);
        boolean callJZ(MemorySegment __functionAddress, int param0, long param1, int param2);
        boolean callPPZ(MemorySegment __functionAddress, int param0, @FFMNullable @FFMPointer long param1, @FFMNullable @FFMPointer long param2);
        boolean callPPPPZ(MemorySegment __functionAddress, int param0, int param1, int param2, float param3, @FFMNullable @FFMPointer long param4, @FFMNullable @FFMPointer long param5, @FFMNullable @FFMPointer long param6, @FFMNullable @FFMPointer long param7);
    }

    /*
    private static final TraceConsumer TRACER = (method, returnValue, args) -> {
        var prefix = method.getDeclaringClass().getAnnotation(FFMPrefix.class);
        if (prefix != null) {
            System.err.print(prefix.value());
        }
        System.err.println(method.getName() + '(' + Stream.of(args)
            .skip(1)
            .map(JNI::render)
            .collect(Collectors.joining(", ")) + ")" + (returnValue == null ? "" : " : " + render(returnValue)));
    };

    private static String render(Object value) {
        if (value instanceof MemorySegment segment) {
            return "0x" + Long.toHexString(segment.address()) + (segment.byteSize() == 0 ? "" : (" [" + (segment.byteSize() == Long.MAX_VALUE ? "?" : segment.byteSize()) + "]"));
        } else {
            return value.toString();
        }
    }*/

    /*private static int count;
    private static long lastT = System.nanoTime();
    private static final TraceConsumer TRACER = (_, _, _) -> {
        count++;
        long t = System.nanoTime();
        if (t - lastT > 1_000_000_000L) {
            System.err.println("JNI calls: " + count + "/s");
            lastT = t;
            count = 0;
        }
    };*/

    private static final JNIBindings jni = ffmGenerate(
        JNIBindings.class,
        ffmConfigBuilder(MethodHandles.lookup())
            .withChecks(false)
            //.withCriticalOverride(_ -> true)
            //.withTracing(TRACER)
            .build()
    );

    private JNI() {}

    // Pointer API

    public static byte invokePB(long param0, long __functionAddress) { return jni.invokePB(MemorySegment.ofAddress(__functionAddress), param0); }
    public static short invokeC(long __functionAddress) { return jni.invokeC(MemorySegment.ofAddress(__functionAddress)); }
    public static short invokeC(int param0, long __functionAddress) { return jni.invokeC(MemorySegment.ofAddress(__functionAddress), param0); }
    public static short invokePC(long param0, long __functionAddress) { return jni.invokePC(MemorySegment.ofAddress(__functionAddress), param0); }
    public static short invokeCC(int param0, short param1, long __functionAddress) { return jni.invokeCC(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static short invokeCC(short param0, boolean param1, long __functionAddress) { return jni.invokeCC(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static short invokePC(long param0, int param1, long __functionAddress) { return jni.invokePC(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static short invokeJC(int param0, int param1, long param2, long __functionAddress) { return jni.invokeJC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short invokeCUC(short param0, byte param1, long __functionAddress) { return jni.invokeCUC(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static short invokePCC(long param0, short param1, long __functionAddress) { return jni.invokePCC(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static short invokeCCC(short param0, short param1, boolean param2, long __functionAddress) { return jni.invokeCCC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short invokePCC(int param0, long param1, short param2, long __functionAddress) { return jni.invokePCC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short invokePCC(long param0, int param1, short param2, long __functionAddress) { return jni.invokePCC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short invokeUPC(byte param0, long param1, boolean param2, long __functionAddress) { return jni.invokeUPC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short invokePCC(long param0, int param1, int param2, short param3, long __functionAddress) { return jni.invokePCC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static short invokeCJC(int param0, boolean param1, short param2, int param3, long param4, long __functionAddress) { return jni.invokeCJC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static short invokeCPCC(short param0, long param1, short param2, long __functionAddress) { return jni.invokeCPCC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short invokeCPPC(short param0, long param1, long param2, long __functionAddress) { return jni.invokeCPPC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short invokePPCC(long param0, long param1, short param2, long __functionAddress) { return jni.invokePPCC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short invokeCCJC(short param0, short param1, int param2, long param3, long __functionAddress) { return jni.invokeCCJC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static short invokePCCC(long param0, short param1, short param2, int param3, int param4, long __functionAddress) { return jni.invokePCCC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static short invokeCCCCC(short param0, short param1, short param2, short param3, long __functionAddress) { return jni.invokeCCCCC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static short invokePJUPC(long param0, long param1, byte param2, long param3, long __functionAddress) { return jni.invokePJUPC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static short invokeCCJPC(short param0, boolean param1, short param2, int param3, long param4, long param5, long __functionAddress) { return jni.invokeCCJPC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static short invokePCCCCC(long param0, short param1, short param2, short param3, short param4, long __functionAddress) { return jni.invokePCCCCC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static short invokeCCCJPC(short param0, short param1, short param2, boolean param3, int param4, long param5, long param6, long __functionAddress) { return jni.invokeCCCJPC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static short invokeCCCJPC(short param0, short param1, boolean param2, short param3, int param4, long param5, long param6, long __functionAddress) { return jni.invokeCCCJPC(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static double invokeD(long __functionAddress) { return jni.invokeD(MemorySegment.ofAddress(__functionAddress)); }
    public static double invokeD(int param0, long __functionAddress) { return jni.invokeD(MemorySegment.ofAddress(__functionAddress), param0); }
    public static double invokePD(long param0, long __functionAddress) { return jni.invokePD(MemorySegment.ofAddress(__functionAddress), param0); }
    public static double invokePD(long param0, int param1, long __functionAddress) { return jni.invokePD(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static double invokePD(long param0, int param1, int param2, long __functionAddress) { return jni.invokePD(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static double invokePPD(long param0, long param1, long __functionAddress) { return jni.invokePPD(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static float invokeF(long __functionAddress) { return jni.invokeF(MemorySegment.ofAddress(__functionAddress)); }
    public static float invokeF(int param0, long __functionAddress) { return jni.invokeF(MemorySegment.ofAddress(__functionAddress), param0); }
    public static float invokePF(long param0, long __functionAddress) { return jni.invokePF(MemorySegment.ofAddress(__functionAddress), param0); }
    public static float invokePF(float param0, long param1, long __functionAddress) { return jni.invokePF(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static float invokePF(long param0, int param1, long __functionAddress) { return jni.invokePF(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static float invokePF(float param0, float param1, long param2, long __functionAddress) { return jni.invokePF(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static float invokePF(int param0, long param1, float param2, long __functionAddress) { return jni.invokePF(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static float invokePF(long param0, float param1, float param2, long __functionAddress) { return jni.invokePF(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static float invokePF(long param0, int param1, int param2, long __functionAddress) { return jni.invokePF(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static float invokePPF(long param0, long param1, long __functionAddress) { return jni.invokePPF(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static float invokePPF(long param0, int param1, long param2, long __functionAddress) { return jni.invokePPF(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static float invokePPF(long param0, float param1, long param2, int param3, long __functionAddress) { return jni.invokePPF(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokeI(long __functionAddress) { return jni.invokeI(MemorySegment.ofAddress(__functionAddress)); }
    public static int invokeI(int param0, long __functionAddress) { return jni.invokeI(MemorySegment.ofAddress(__functionAddress), param0); }
    public static int invokeI(boolean param0, long __functionAddress) { return jni.invokeI(MemorySegment.ofAddress(__functionAddress), param0); }
    public static int invokeI(int param0, float param1, long __functionAddress) { return jni.invokeI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokeI(int param0, int param1, long __functionAddress) { return jni.invokeI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokeI(int param0, boolean param1, long __functionAddress) { return jni.invokeI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokeI(int param0, int param1, int param2, long __functionAddress) { return jni.invokeI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokeI(int param0, int param1, int param2, int param3, long __functionAddress) { return jni.invokeI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokeI(int param0, int param1, int param2, int param3, int param4, long __functionAddress) { return jni.invokeI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokeI(int param0, int param1, int param2, int param3, int param4, int param5, long __functionAddress) { return jni.invokeI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokeJI(long param0, long __functionAddress) { return jni.invokeJI(MemorySegment.ofAddress(__functionAddress), param0); }
    public static int invokePI(long param0, long __functionAddress) { return jni.invokePI(MemorySegment.ofAddress(__functionAddress), param0); }
    public static int invokeCI(int param0, short param1, long __functionAddress) { return jni.invokeCI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokePI(int param0, long param1, long __functionAddress) { return jni.invokePI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokePI(long param0, int param1, long __functionAddress) { return jni.invokePI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokePI(long param0, boolean param1, long __functionAddress) { return jni.invokePI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokeCI(int param0, short param1, boolean param2, long __functionAddress) { return jni.invokeCI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePI(long param0, int param1, int param2, long __functionAddress) { return jni.invokePI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePI(long param0, int param1, boolean param2, long __functionAddress) { return jni.invokePI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePI(long param0, int param1, int param2, int param3, long __functionAddress) { return jni.invokePI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePI(long param0, int param1, int param2, int param3, int param4, long __functionAddress) { return jni.invokePI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePI(long param0, int param1, int param2, int param3, int param4, int param5, int param6, long __functionAddress) { return jni.invokePI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokeCPI(short param0, long param1, long __functionAddress) { return jni.invokeCPI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokePCI(long param0, short param1, long __functionAddress) { return jni.invokePCI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokePJI(long param0, long param1, long __functionAddress) { return jni.invokePJI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokePNI(long param0, long param1, long __functionAddress) { return jni.invokePNI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokePPI(long param0, long param1, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int invokePJI(long param0, long param1, int param2, long __functionAddress) { return jni.invokePJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePNI(long param0, int param1, long param2, long __functionAddress) { return jni.invokePNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePNI(long param0, long param1, int param2, long __functionAddress) { return jni.invokePNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePPI(int param0, long param1, long param2, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePPI(long param0, int param1, long param2, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePPI(long param0, long param1, float param2, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePPI(long param0, long param1, int param2, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePPI(long param0, long param1, boolean param2, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePPI(long param0, boolean param1, long param2, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePPI(long param0, int param1, int param2, long param3, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPI(long param0, int param1, long param2, int param3, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPI(long param0, int param1, long param2, boolean param3, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPI(long param0, int param1, boolean param2, long param3, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPI(long param0, long param1, int param2, int param3, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPI(long param0, long param1, boolean param2, boolean param3, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPI(long param0, int param1, int param2, int param3, long param4, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPI(long param0, int param1, int param2, long param3, int param4, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPI(long param0, int param1, long param2, int param3, int param4, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPI(int param0, long param1, int param2, long param3, int param4, boolean param5, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPI(long param0, int param1, int param2, int param3, int param4, long param5, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPI(long param0, int param1, int param2, int param3, int param4, long param5, int param6, long __functionAddress) { return jni.invokePPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokeCPUI(short param0, long param1, byte param2, long __functionAddress) { return jni.invokeCPUI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokeJPPI(long param0, long param1, long param2, long __functionAddress) { return jni.invokeJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePCPI(long param0, short param1, long param2, long __functionAddress) { return jni.invokePCPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePNNI(long param0, long param1, long param2, long __functionAddress) { return jni.invokePNNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePNPI(long param0, long param1, long param2, long __functionAddress) { return jni.invokePNPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePPCI(long param0, long param1, short param2, long __functionAddress) { return jni.invokePPCI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePPJI(long param0, long param1, long param2, long __functionAddress) { return jni.invokePPJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePPNI(long param0, long param1, long param2, long __functionAddress) { return jni.invokePPNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePPPI(long param0, long param1, long param2, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int invokePNPI(long param0, long param1, int param2, long param3, long __functionAddress) { return jni.invokePNPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePNPI(long param0, long param1, long param2, int param3, long __functionAddress) { return jni.invokePNPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPNI(long param0, int param1, long param2, long param3, long __functionAddress) { return jni.invokePPNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPPI(int param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPPI(long param0, int param1, long param2, long param3, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPPI(long param0, long param1, int param2, long param3, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPPI(long param0, long param1, long param2, int param3, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePNNI(long param0, long param1, long param2, int param3, int param4, long __functionAddress) { return jni.invokePNNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPI(long param0, int param1, int param2, long param3, long param4, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPI(long param0, int param1, long param2, int param3, long param4, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPI(long param0, int param1, long param2, long param3, int param4, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPI(long param0, long param1, int param2, int param3, long param4, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPI(long param0, long param1, int param2, long param3, int param4, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPI(long param0, long param1, long param2, int param3, int param4, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPI(long param0, int param1, int param2, int param3, long param4, long param5, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPI(long param0, int param1, long param2, int param3, long param4, int param5, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPI(long param0, int param1, long param2, long param3, int param4, int param5, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPI(long param0, long param1, int param2, long param3, int param4, int param5, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPI(long param0, long param1, long param2, int param3, boolean param4, float param5, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPI(long param0, int param1, int param2, int param3, int param4, long param5, long param6, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokePPPI(long param0, int param1, int param2, int param3, long param4, long param5, int param6, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokePPPI(long param0, int param1, int param2, long param3, int param4, long param5, int param6, int param7, long __functionAddress) { return jni.invokePPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int invokePNPPI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePNPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPNNI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPNNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPNPI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPNPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPPNI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPPNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePPPPI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePUUUI(long param0, byte param1, byte param2, byte param3, long __functionAddress) { return jni.invokePUUUI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int invokePNNPI(long param0, long param1, int param2, long param3, long param4, long __functionAddress) { return jni.invokePNNPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPNI(long param0, long param1, int param2, long param3, long param4, long __functionAddress) { return jni.invokePPPNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPPI(long param0, int param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPPI(long param0, long param1, int param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPPI(long param0, long param1, long param2, int param3, long param4, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPPI(long param0, long param1, long param2, long param3, int param4, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPPI(long param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPI(long param0, long param1, int param2, int param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPI(long param0, long param1, int param2, long param3, int param4, long param5, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPI(long param0, long param1, int param2, long param3, long param4, int param5, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPI(long param0, long param1, long param2, int param3, int param4, long param5, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPI(long param0, long param1, long param2, long param3, int param4, int param5, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPI(long param0, int param1, int param2, int param3, long param4, long param5, long param6, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokePPPPI(long param0, int param1, int param2, long param3, long param4, long param5, int param6, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokePPPPI(long param0, int param1, long param2, int param3, long param4, int param5, long param6, int param7, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int invokePPPPI(long param0, long param1, long param2, int param3, int param4, int param5, long param6, int param7, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int invokePPPPI(long param0, long param1, long param2, long param3, int param4, int param5, int param6, int param7, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int invokePPPPI(long param0, int param1, int param2, long param3, int param4, long param5, long param6, int param7, int param8, long __functionAddress) { return jni.invokePPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int invokePNNPPI(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePNNPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPNNPI(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPNNPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPNNI(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPNNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPPNI(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPPPPI(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePPUUUI(long param0, long param1, byte param2, byte param3, byte param4, long __functionAddress) { return jni.invokePPUUUI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePUUUUI(long param0, byte param1, byte param2, byte param3, byte param4, long __functionAddress) { return jni.invokePUUUUI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int invokePJPPNI(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePJPPNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPNPPI(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPNPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPNPPI(long param0, long param1, long param2, int param3, long param4, long param5, long __functionAddress) { return jni.invokePPNPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPNJI(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPNJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPNNI(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPNNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPNPI(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPNPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPNI(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPNI(long param0, long param1, int param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPPI(int param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPPI(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPPI(long param0, long param1, long param2, int param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPPPPI(long param0, long param1, long param2, long param3, long param4, int param5, long __functionAddress) { return jni.invokePPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePNPPPI(long param0, int param1, int param2, long param3, long param4, long param5, long param6, long __functionAddress) { return jni.invokePNPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokePPPPPI(long param0, long param1, int param2, int param3, long param4, long param5, long param6, long __functionAddress) { return jni.invokePPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokePPPPPI(long param0, long param1, int param2, long param3, int param4, long param5, int param6, long param7, long __functionAddress) { return jni.invokePPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int invokePPPPPI(long param0, long param1, int param2, long param3, long param4, int param5, int param6, long param7, long __functionAddress) { return jni.invokePPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int invokePPPPPI(long param0, long param1, long param2, int param3, long param4, int param5, int param6, long param7, long __functionAddress) { return jni.invokePPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int invokePPPPPI(long param0, long param1, long param2, int param3, int param4, int param5, float param6, long param7, long param8, long __functionAddress) { return jni.invokePPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int invokePPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePPUUUUI(long param0, long param1, byte param2, byte param3, byte param4, byte param5, long __functionAddress) { return jni.invokePPUUUUI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int invokePJJJJPI(long param0, long param1, long param2, long param3, long param4, int param5, long param6, long __functionAddress) { return jni.invokePJJJJPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokePPNPPPI(long param0, int param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress) { return jni.invokePPNPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokePPPPPPI(long param0, int param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress) { return jni.invokePPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokePPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, int param6, long __functionAddress) { return jni.invokePPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokePNNPPPI(long param0, long param1, long param2, int param3, int param4, long param5, long param6, long param7, long __functionAddress) { return jni.invokePNNPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int invokePPPPPPI(int param0, int param1, long param2, long param3, long param4, long param5, long param6, long param7, long __functionAddress) { return jni.invokePPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int invokePPPPPPI(long param0, int param1, int param2, long param3, long param4, long param5, long param6, long param7, long __functionAddress) { return jni.invokePPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int invokePPPPPPI(long param0, long param1, int param2, long param3, int param4, long param5, int param6, long param7, int param8, long param9, long __functionAddress) { return jni.invokePPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static int invokePPPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress) { return jni.invokePPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int invokePPPPPPPI(long param0, int param1, int param2, long param3, long param4, long param5, long param6, long param7, long param8, long __functionAddress) { return jni.invokePPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int invokePPPPPPPI(long param0, long param1, long param2, int param3, long param4, float param5, float param6, long param7, long param8, long param9, long __functionAddress) { return jni.invokePPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static int invokePPPPPPPI(long param0, long param1, long param2, int param3, int param4, long param5, long param6, int param7, long param8, int param9, long param10, int param11, long __functionAddress) { return jni.invokePPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static int invokePPPPPPPPI(long param0, int param1, int param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, long __functionAddress) { return jni.invokePPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static long invokeJ(long __functionAddress) { return jni.invokeJ(MemorySegment.ofAddress(__functionAddress)); }
    public static long invokeJ(int param0, int param1, long __functionAddress) { return jni.invokeJ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePJ(long param0, long __functionAddress) { return jni.invokePJ(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long invokePJ(long param0, int param1, long __functionAddress) { return jni.invokePJ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePJ(long param0, int param1, int param2, long __functionAddress) { return jni.invokePJ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePJJ(long param0, long param1, long __functionAddress) { return jni.invokePJJ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePPJ(long param0, long param1, long __functionAddress) { return jni.invokePPJ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePJJ(int param0, long param1, long param2, long __functionAddress) { return jni.invokePJJ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePJJ(long param0, int param1, long param2, long __functionAddress) { return jni.invokePJJ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePJJ(long param0, long param1, int param2, long __functionAddress) { return jni.invokePJJ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePPJ(long param0, long param1, int param2, long __functionAddress) { return jni.invokePPJ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokeNN(long param0, long __functionAddress) { return jni.invokeNN(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long invokePN(long param0, long __functionAddress) { return jni.invokePN(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long invokePN(long param0, int param1, long __functionAddress) { return jni.invokePN(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokeNNN(long param0, long param1, long __functionAddress) { return jni.invokeNNN(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePPN(long param0, long param1, long __functionAddress) { return jni.invokePPN(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokeNNNN(long param0, long param1, long param2, long __functionAddress) { return jni.invokeNNNN(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePNPN(long param0, long param1, long param2, long __functionAddress) { return jni.invokePNPN(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePNPN(long param0, long param1, long param2, int param3, long __functionAddress) { return jni.invokePNPN(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPNN(long param0, int param1, int param2, long param3, long param4, long __functionAddress) { return jni.invokePPNN(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePNPNN(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePNPNN(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePNPNPN(long param0, long param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, long param9, long param10, long param11, long __functionAddress) { return jni.invokePNPNPN(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static long invokeP(long __functionAddress) { return jni.invokeP(MemorySegment.ofAddress(__functionAddress)); }
    public static long invokeP(int param0, long __functionAddress) { return jni.invokeP(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long invokeP(boolean param0, long __functionAddress) { return jni.invokeP(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long invokeP(int param0, int param1, long __functionAddress) { return jni.invokeP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokeP(int param0, int param1, int param2, long __functionAddress) { return jni.invokeP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokeCP(short param0, long __functionAddress) { return jni.invokeCP(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long invokeJP(long param0, long __functionAddress) { return jni.invokeJP(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long invokePP(long param0, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long invokePP(int param0, long param1, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePP(long param0, double param1, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePP(long param0, float param1, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePP(long param0, int param1, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePP(long param0, boolean param1, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePP(int param0, int param1, long param2, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePP(int param0, boolean param1, long param2, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePP(long param0, int param1, int param2, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePP(int param0, int param1, int param2, long param3, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePP(long param0, int param1, int param2, int param3, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePP(int param0, int param1, int param2, long param3, int param4, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePP(long param0, float param1, int param2, float param3, int param4, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePP(long param0, int param1, int param2, int param3, int param4, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePP(long param0, int param1, int param2, int param3, int param4, int param5, long __functionAddress) { return jni.invokePP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokeCCP(short param0, short param1, long __functionAddress) { return jni.invokeCCP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokeJPP(long param0, long param1, long __functionAddress) { return jni.invokeJPP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePJP(long param0, long param1, long __functionAddress) { return jni.invokePJP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePNP(long param0, long param1, long __functionAddress) { return jni.invokePNP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePPP(long param0, long param1, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokePUP(long param0, byte param1, long __functionAddress) { return jni.invokePUP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long invokeCPP(int param0, short param1, long param2, long __functionAddress) { return jni.invokeCPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePCP(long param0, short param1, boolean param2, long __functionAddress) { return jni.invokePCP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePJP(long param0, int param1, long param2, long __functionAddress) { return jni.invokePJP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePJP(long param0, long param1, int param2, long __functionAddress) { return jni.invokePJP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePPP(int param0, long param1, long param2, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePPP(long param0, int param1, long param2, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePPP(long param0, long param1, int param2, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePPP(long param0, long param1, boolean param2, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePJP(long param0, int param1, int param2, long param3, long __functionAddress) { return jni.invokePJP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPP(long param0, int param1, int param2, long param3, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPP(long param0, int param1, long param2, int param3, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPP(long param0, long param1, int param2, int param3, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPP(long param0, long param1, boolean param2, boolean param3, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPP(long param0, boolean param1, boolean param2, long param3, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPP(long param0, int param1, int param2, int param3, long param4, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPP(long param0, int param1, long param2, int param3, int param4, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePJP(long param0, int param1, int param2, int param3, int param4, long param5, long __functionAddress) { return jni.invokePJP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPP(int param0, int param1, int param2, int param3, long param4, long param5, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPP(long param0, long param1, int param2, int param3, int param4, int param5, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePUP(long param0, int param1, byte param2, int param3, boolean param4, boolean param5, long __functionAddress) { return jni.invokePUP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPP(int param0, int param1, int param2, int param3, long param4, int param5, long param6, long __functionAddress) { return jni.invokePPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokeCCPP(short param0, short param1, long param2, long __functionAddress) { return jni.invokeCCPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokeCPCP(short param0, long param1, short param2, long __functionAddress) { return jni.invokeCPCP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePJJP(long param0, long param1, long param2, long __functionAddress) { return jni.invokePJJP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePPJP(long param0, long param1, long param2, long __functionAddress) { return jni.invokePPJP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePPPP(long param0, long param1, long param2, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePPUP(long param0, long param1, byte param2, long __functionAddress) { return jni.invokePPUP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long invokePPPP(int param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPPP(long param0, int param1, long param2, long param3, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPPP(long param0, long param1, int param2, long param3, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPPP(long param0, long param1, long param2, int param3, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPPP(long param0, long param1, boolean param2, long param3, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPUP(long param0, long param1, int param2, byte param3, long __functionAddress) { return jni.invokePPUP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPPP(int param0, int param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPPP(long param0, int param1, int param2, long param3, long param4, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPPP(long param0, long param1, int param2, int param3, long param4, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPPP(long param0, long param1, int param2, long param3, int param4, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPPP(long param0, long param1, long param2, int param3, int param4, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokeJPPP(int param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokeJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPP(long param0, int param1, long param2, long param3, int param4, int param5, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPP(long param0, long param1, int param2, int param3, int param4, long param5, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPP(long param0, long param1, int param2, int param3, long param4, int param5, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPP(int param0, int param1, int param2, long param3, long param4, int param5, long param6, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePPPP(long param0, long param1, int param2, int param3, long param4, int param5, int param6, long __functionAddress) { return jni.invokePPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePBPPP(long param0, byte param1, long param2, long param3, long __functionAddress) { return jni.invokePBPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePNNPP(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePNNPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPJPP(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPJPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPNNP(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPNNP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPPPP(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long invokePPPJP(int param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPJP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPPJP(long param0, long param1, long param2, long param3, int param4, long __functionAddress) { return jni.invokePPPJP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPPPP(long param0, int param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPPPP(long param0, long param1, int param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPPPP(long param0, long param1, long param2, int param3, long param4, long __functionAddress) { return jni.invokePPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPPPP(long param0, long param1, long param2, long param3, int param4, long __functionAddress) { return jni.invokePPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePJPPP(long param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePJPPP(long param0, long param1, int param2, long param3, long param4, int param5, long __functionAddress) { return jni.invokePJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPJP(long param0, long param1, long param2, long param3, int param4, int param5, long __functionAddress) { return jni.invokePPPJP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPPP(long param0, long param1, int param2, long param3, int param4, long param5, long __functionAddress) { return jni.invokePPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPPP(long param0, long param1, long param2, int param3, long param4, int param5, long __functionAddress) { return jni.invokePPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPPP(long param0, long param1, long param2, int param3, int param4, int param5, long param6, long __functionAddress) { return jni.invokePPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePPPPP(long param0, long param1, long param2, int param3, long param4, int param5, int param6, long __functionAddress) { return jni.invokePPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePPPPP(long param0, long param1, long param2, long param3, int param4, int param5, int param6, long __functionAddress) { return jni.invokePPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePPPPP(int param0, int param1, int param2, long param3, long param4, long param5, int param6, long param7, long __functionAddress) { return jni.invokePPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static long invokePJPJPP(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePJPJPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePNNNPP(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePNNNPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPBPPP(long param0, long param1, byte param2, long param3, long param4, long __functionAddress) { return jni.invokePPBPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokePPPPPP(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long invokeCCCUJP(short param0, short param1, short param2, byte param3, int param4, long param5, long __functionAddress) { return jni.invokeCCCUJP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPJPP(long param0, long param1, long param2, long param3, long param4, int param5, long __functionAddress) { return jni.invokePPPJPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPPNP(long param0, long param1, int param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPNP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPPPP(long param0, long param1, long param2, int param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, long __functionAddress) { return jni.invokePPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPPPP(long param0, long param1, long param2, long param3, long param4, int param5, long __functionAddress) { return jni.invokePPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPJPPP(long param0, long param1, long param2, int param3, int param4, long param5, long param6, long __functionAddress) { return jni.invokePPJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePPPPPP(long param0, long param1, long param2, int param3, long param4, int param5, long param6, long __functionAddress) { return jni.invokePPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, int param6, long __functionAddress) { return jni.invokePPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePPPPPP(long param0, long param1, long param2, long param3, long param4, int param5, int param6, long __functionAddress) { return jni.invokePPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePPPPPP(long param0, long param1, long param2, long param3, long param4, int param5, int param6, int param7, int param8, long __functionAddress) { return jni.invokePPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static long invokePPJJPPP(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPJJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePSSCCPP(long param0, short param1, short param2, short param3, short param4, long param5, long __functionAddress) { return jni.invokePSSCCPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long invokePPPPPPP(long param0, long param1, long param2, int param3, long param4, long param5, long param6, long __functionAddress) { return jni.invokePPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePPPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, long param6, long __functionAddress) { return jni.invokePPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, int param6, long __functionAddress) { return jni.invokePPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long invokePPPPPPP(long param0, long param1, int param2, int param3, long param4, long param5, long param6, long param7, long __functionAddress) { return jni.invokePPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static long invokePPPPPPP(long param0, long param1, long param2, int param3, long param4, int param5, long param6, long param7, long __functionAddress) { return jni.invokePPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static long invokePPPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, int param6, long param7, long __functionAddress) { return jni.invokePPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static long invokePPPPPPP(long param0, long param1, long param2, long param3, long param4, int param5, long param6, int param7, long __functionAddress) { return jni.invokePPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static long invokePPPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, int param6, long param7, int param8, int param9, long __functionAddress) { return jni.invokePPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static long invokePPPPPPP(long param0, long param1, long param2, long param3, long param4, int param5, long param6, int param7, int param8, int param9, long __functionAddress) { return jni.invokePPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static long invokePPPPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, long param6, long param7, long __functionAddress) { return jni.invokePPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static long invokePPPPPJPP(long param0, long param1, long param2, long param3, long param4, int param5, long param6, int param7, long param8, long __functionAddress) { return jni.invokePPPPPJPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static long invokePPPPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, long param6, long param7, int param8, long __functionAddress) { return jni.invokePPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static long invokePPPPPPPP(long param0, long param1, long param2, long param3, long param4, int param5, long param6, int param7, long param8, int param9, long __functionAddress) { return jni.invokePPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static long invokePPPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, long __functionAddress) { return jni.invokePPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static long invokePPPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, int param7, long param8, long __functionAddress) { return jni.invokePPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static long invokePPPPPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, long param6, long param7, int param8, long param9, long __functionAddress) { return jni.invokePPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static long invokePPPPJJPPP(long param0, long param1, long param2, long param3, int param4, long param5, int param6, long param7, int param8, long param9, long param10, long __functionAddress) { return jni.invokePPPPJJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static long invokePPPPPJJPP(long param0, long param1, long param2, long param3, long param4, int param5, long param6, int param7, long param8, int param9, long param10, long __functionAddress) { return jni.invokePPPPPJJPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static long invokePPPPPJPPP(long param0, long param1, long param2, long param3, long param4, int param5, long param6, int param7, long param8, int param9, long param10, long __functionAddress) { return jni.invokePPPPPJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static long invokePPPPPPPPP(long param0, long param1, long param2, long param3, long param4, int param5, long param6, int param7, long param8, int param9, long param10, long __functionAddress) { return jni.invokePPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static long invokePPPPPJPPP(long param0, int param1, long param2, long param3, long param4, long param5, int param6, int param7, long param8, int param9, long param10, long param11, long __functionAddress) { return jni.invokePPPPPJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static long invokePPPPPJPPP(long param0, int param1, long param2, long param3, long param4, long param5, int param6, int param7, long param8, int param9, int param10, long param11, long param12, long __functionAddress) { return jni.invokePPPPPJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12); }
    public static long invokePPPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, int param7, long param8, int param9, int param10, int param11, int param12, int param13, long __functionAddress) { return jni.invokePPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13); }
    public static long invokePPPPPJJJPP(long param0, long param1, long param2, long param3, long param4, int param5, long param6, long param7, long param8, int param9, long param10, long __functionAddress) { return jni.invokePPPPPJJJPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static long invokePPPPPPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, long param6, long param7, long param8, int param9, long param10, long __functionAddress) { return jni.invokePPPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static long invokePPPPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, int param7, long param8, int param9, long param10, int param11, long __functionAddress) { return jni.invokePPPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static long invokePPPPPJPPPP(long param0, long param1, long param2, long param3, long param4, int param5, long param6, int param7, int param8, long param9, int param10, int param11, long param12, long param13, long __functionAddress) { return jni.invokePPPPPJPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13); }
    public static long invokePPPPPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, long __functionAddress) { return jni.invokePPPPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static long invokePPPPPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, int param7, long param8, int param9, long param10, long param11, int param12, long __functionAddress) { return jni.invokePPPPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12); }
    public static long invokePPPPPJPPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, long param6, int param7, int param8, long param9, long param10, long param11, long param12, long param13, long __functionAddress) { return jni.invokePPPPPJPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13); }
    public static long invokePPPPPJPPPPPP(long param0, long param1, long param2, long param3, long param4, int param5, long param6, int param7, int param8, long param9, long param10, int param11, int param12, long param13, long param14, long param15, long __functionAddress) { return jni.invokePPPPPJPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15); }
    public static long invokePPPPPPPPPPPPP(long param0, int param1, long param2, long param3, long param4, int param5, long param6, long param7, int param8, long param9, long param10, int param11, int param12, int param13, int param14, long param15, long param16, long param17, long param18, long __functionAddress) { return jni.invokePPPPPPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18); }
    public static long invokePPPPPJPPPPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, long param6, int param7, long param8, long param9, int param10, long param11, long param12, long param13, long param14, long param15, long __functionAddress) { return jni.invokePPPPPJPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15); }
    public static long invokePPPPPJJPPPPPPP(long param0, long param1, long param2, long param3, long param4, int param5, long param6, int param7, long param8, int param9, long param10, long param11, int param12, long param13, long param14, long param15, long param16, long __functionAddress) { return jni.invokePPPPPJJPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16); }
    public static short invokePS(long param0, int param1, long __functionAddress) { return jni.invokePS(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static byte invokeU(int param0, long __functionAddress) { return jni.invokeU(MemorySegment.ofAddress(__functionAddress), param0); }
    public static byte invokePU(long param0, int param1, long __functionAddress) { return jni.invokePU(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static byte invokeUPU(byte param0, long param1, long __functionAddress) { return jni.invokeUPU(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeV(long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress)); }
    public static void invokeV(double param0, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void invokeV(float param0, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void invokeV(int param0, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void invokeV(boolean param0, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void invokeV(int param0, float param1, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeV(int param0, int param1, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeV(int param0, boolean param1, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeV(int param0, int param1, double param2, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokeV(int param0, int param1, float param2, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokeV(int param0, int param1, int param2, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokeV(int param0, float param1, float param2, float param3, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokeV(int param0, int param1, int param2, int param3, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokeV(int param0, int param1, double param2, double param3, double param4, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokeV(int param0, int param1, float param2, float param3, float param4, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokeV(int param0, int param1, int param2, int param3, int param4, long __functionAddress) { jni.invokeV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokeCV(short param0, long __functionAddress) { jni.invokeCV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void invokeJV(long param0, long __functionAddress) { jni.invokeJV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void invokePV(long param0, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void invokeUV(byte param0, long __functionAddress) { jni.invokeUV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void invokeCV(int param0, short param1, long __functionAddress) { jni.invokeCV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeCV(short param0, int param1, long __functionAddress) { jni.invokeCV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeCV(short param0, boolean param1, long __functionAddress) { jni.invokeCV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeJV(int param0, long param1, long __functionAddress) { jni.invokeJV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeJV(long param0, int param1, long __functionAddress) { jni.invokeJV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokePV(int param0, long param1, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokePV(long param0, float param1, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokePV(long param0, int param1, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokePV(long param0, boolean param1, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeUV(byte param0, int param1, long __functionAddress) { jni.invokeUV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeUV(byte param0, boolean param1, long __functionAddress) { jni.invokeUV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeCV(short param0, int param1, int param2, long __functionAddress) { jni.invokeCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokeJV(int param0, int param1, long param2, long __functionAddress) { jni.invokeJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePV(int param0, int param1, long param2, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePV(int param0, long param1, boolean param2, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePV(long param0, double param1, double param2, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePV(long param0, float param1, float param2, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePV(long param0, int param1, double param2, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePV(long param0, int param1, float param2, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePV(long param0, int param1, int param2, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePV(long param0, int param1, boolean param2, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePV(int param0, int param1, int param2, long param3, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePV(long param0, float param1, float param2, float param3, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePV(long param0, float param1, float param2, int param3, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePV(long param0, int param1, int param2, double param3, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePV(long param0, int param1, int param2, float param3, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePV(long param0, int param1, int param2, int param3, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePV(int param0, int param1, long param2, int param3, int param4, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePV(long param0, int param1, float param2, float param3, float param4, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePV(long param0, int param1, int param2, int param3, int param4, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokeUV(byte param0, float param1, float param2, float param3, float param4, long __functionAddress) { jni.invokeUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePV(int param0, int param1, int param2, int param3, int param4, long param5, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePV(int param0, int param1, int param2, int param3, long param4, boolean param5, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePV(long param0, int param1, int param2, double param3, double param4, double param5, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePV(long param0, int param1, int param2, float param3, float param4, float param5, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePV(long param0, int param1, int param2, int param3, int param4, int param5, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePV(long param0, int param1, int param2, int param3, int param4, boolean param5, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePV(int param0, int param1, int param2, int param3, int param4, int param5, long param6, long __functionAddress) { jni.invokePV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokeCCV(short param0, short param1, long __functionAddress) { jni.invokeCCV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeCPV(short param0, long param1, long __functionAddress) { jni.invokeCPV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokePCV(long param0, short param1, long __functionAddress) { jni.invokePCV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokePJV(long param0, long param1, long __functionAddress) { jni.invokePJV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokePNV(long param0, long param1, long __functionAddress) { jni.invokePNV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokePPV(long param0, long param1, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokePUV(long param0, byte param1, long __functionAddress) { jni.invokePUV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeUPV(byte param0, long param1, long __functionAddress) { jni.invokeUPV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void invokeCPV(short param0, int param1, long param2, long __functionAddress) { jni.invokeCPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokeCPV(short param0, long param1, int param2, long __functionAddress) { jni.invokeCPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePCV(long param0, int param1, short param2, long __functionAddress) { jni.invokePCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePCV(long param0, short param1, boolean param2, long __functionAddress) { jni.invokePCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePJV(int param0, long param1, long param2, long __functionAddress) { jni.invokePJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePJV(long param0, int param1, long param2, long __functionAddress) { jni.invokePJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePJV(long param0, long param1, int param2, long __functionAddress) { jni.invokePJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePPV(int param0, long param1, long param2, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePPV(long param0, int param1, long param2, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePPV(long param0, long param1, float param2, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePPV(long param0, long param1, int param2, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePPV(long param0, long param1, boolean param2, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokeUCV(byte param0, short param1, int param2, long __functionAddress) { jni.invokeUCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePBV(long param0, int param1, int param2, byte param3, long __functionAddress) { jni.invokePBV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePCV(long param0, int param1, int param2, short param3, long __functionAddress) { jni.invokePCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePCV(long param0, short param1, int param2, int param3, long __functionAddress) { jni.invokePCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePJV(long param0, int param1, int param2, long param3, long __functionAddress) { jni.invokePJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPV(int param0, int param1, long param2, long param3, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPV(int param0, long param1, long param2, int param3, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPV(long param0, int param1, int param2, long param3, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPV(long param0, int param1, long param2, int param3, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPV(long param0, int param1, long param2, boolean param3, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPV(long param0, long param1, int param2, int param3, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePSV(long param0, int param1, int param2, short param3, long __functionAddress) { jni.invokePSV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePUV(long param0, int param1, int param2, byte param3, long __functionAddress) { jni.invokePUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokeUCV(byte param0, short param1, int param2, int param3, long __functionAddress) { jni.invokeUCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokeUPV(byte param0, long param1, int param2, int param3, long __functionAddress) { jni.invokeUPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePCV(long param0, short param1, int param2, int param3, int param4, long __functionAddress) { jni.invokePCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPV(int param0, int param1, int param2, long param3, long param4, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPV(long param0, float param1, long param2, int param3, int param4, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPV(long param0, int param1, int param2, int param3, long param4, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPV(long param0, long param1, int param2, int param3, int param4, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPV(int param0, int param1, int param2, int param3, long param4, long param5, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPV(long param0, int param1, int param2, int param3, int param4, long param5, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPV(long param0, int param1, int param2, long param3, int param4, int param5, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPV(long param0, long param1, float param2, float param3, float param4, float param5, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPV(int param0, int param1, int param2, int param3, int param4, long param5, long param6, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPV(long param0, int param1, int param2, int param3, int param4, int param5, long param6, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPV(long param0, int param1, int param2, int param3, int param4, long param5, boolean param6, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPV(long param0, long param1, int param2, int param3, int param4, int param5, int param6, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPV(long param0, long param1, float param2, float param3, float param4, float param5, float param6, float param7, long __functionAddress) { jni.invokePPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void invokeCCPV(short param0, short param1, long param2, long __functionAddress) { jni.invokeCCPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokeCPCV(short param0, long param1, short param2, long __functionAddress) { jni.invokeCPCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokeCPPV(short param0, long param1, long param2, long __functionAddress) { jni.invokeCPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokeJPPV(long param0, long param1, long param2, long __functionAddress) { jni.invokeJPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePJPV(long param0, long param1, long param2, long __functionAddress) { jni.invokePJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePNNV(long param0, long param1, long param2, long __functionAddress) { jni.invokePNNV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePNPV(long param0, long param1, long param2, long __functionAddress) { jni.invokePNPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePPNV(long param0, long param1, long param2, long __functionAddress) { jni.invokePPNV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokePPPV(long param0, long param1, long param2, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void invokeCCCV(short param0, short param1, short param2, int param3, long __functionAddress) { jni.invokeCCCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokeCCUV(short param0, short param1, int param2, byte param3, long __functionAddress) { jni.invokeCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePJPV(long param0, long param1, long param2, int param3, long __functionAddress) { jni.invokePJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPJV(long param0, int param1, long param2, long param3, long __functionAddress) { jni.invokePPJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPPV(int param0, long param1, long param2, long param3, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPPV(long param0, int param1, long param2, long param3, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPPV(long param0, long param1, int param2, long param3, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPPV(long param0, long param1, long param2, float param3, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPPV(long param0, long param1, long param2, int param3, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPPV(long param0, long param1, long param2, boolean param3, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePUCV(long param0, byte param1, short param2, int param3, long __functionAddress) { jni.invokePUCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokeUCCV(byte param0, short param1, short param2, int param3, long __functionAddress) { jni.invokeUCCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokeCCUV(short param0, short param1, int param2, float param3, byte param4, long __functionAddress) { jni.invokeCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokeJJJV(int param0, int param1, long param2, long param3, long param4, long __functionAddress) { jni.invokeJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePNNV(long param0, long param1, int param2, int param3, long param4, long __functionAddress) { jni.invokePNNV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPV(int param0, int param1, long param2, long param3, long param4, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPV(long param0, int param1, int param2, long param3, long param4, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPV(long param0, int param1, long param2, long param3, int param4, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPV(long param0, long param1, int param2, int param3, long param4, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPV(long param0, long param1, int param2, long param3, int param4, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPV(long param0, long param1, long param2, float param3, float param4, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPV(long param0, long param1, long param2, int param3, boolean param4, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPV(long param0, long param1, long param2, boolean param3, boolean param4, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePUCV(long param0, byte param1, short param2, int param3, int param4, long __functionAddress) { jni.invokePUCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePUPV(long param0, byte param1, long param2, int param3, int param4, long __functionAddress) { jni.invokePUPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokeUCCV(byte param0, short param1, int param2, int param3, short param4, long __functionAddress) { jni.invokeUCCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokeUCUV(byte param0, short param1, byte param2, int param3, int param4, long __functionAddress) { jni.invokeUCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokeUPCV(byte param0, long param1, int param2, int param3, short param4, long __functionAddress) { jni.invokeUPCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokeCCUV(short param0, short param1, int param2, int param3, int param4, byte param5, long __functionAddress) { jni.invokeCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPV(int param0, int param1, long param2, int param3, long param4, long param5, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPV(long param0, int param1, int param2, int param3, long param4, long param5, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPV(long param0, int param1, long param2, int param3, long param4, int param5, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPV(long param0, int param1, long param2, long param3, int param4, int param5, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPV(long param0, long param1, int param2, int param3, int param4, long param5, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPV(long param0, long param1, long param2, int param3, boolean param4, boolean param5, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPV(long param0, boolean param1, int param2, long param3, long param4, int param5, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPV(long param0, int param1, int param2, long param3, int param4, long param5, int param6, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPPV(long param0, int param1, long param2, int param3, long param4, int param5, int param6, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPPV(long param0, long param1, float param2, float param3, float param4, float param5, long param6, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPPV(long param0, long param1, long param2, float param3, float param4, float param5, float param6, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPPV(long param0, long param1, long param2, int param3, int param4, int param5, boolean param6, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPPV(long param0, long param1, int param2, int param3, int param4, long param5, int param6, boolean param7, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void invokePPPV(long param0, long param1, float param2, float param3, float param4, float param5, float param6, float param7, long param8, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void invokePPPV(long param0, long param1, long param2, float param3, float param4, float param5, float param6, float param7, float param8, long __functionAddress) { jni.invokePPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void invokeCCPCV(short param0, short param1, long param2, short param3, long __functionAddress) { jni.invokeCCPCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokeCCUPV(short param0, short param1, byte param2, long param3, long __functionAddress) { jni.invokeCCUPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePCPCV(long param0, short param1, long param2, short param3, long __functionAddress) { jni.invokePCPCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePNPPV(long param0, long param1, long param2, long param3, long __functionAddress) { jni.invokePNPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokePPPPV(long param0, long param1, long param2, long param3, long __functionAddress) { jni.invokePPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void invokeCCCUV(short param0, short param1, short param2, int param3, byte param4, long __functionAddress) { jni.invokeCCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePCCUV(long param0, short param1, short param2, int param3, byte param4, long __functionAddress) { jni.invokePCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePJJPV(long param0, int param1, long param2, long param3, long param4, long __functionAddress) { jni.invokePJJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPCPV(long param0, long param1, short param2, int param3, long param4, long __functionAddress) { jni.invokePPCPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPCV(long param0, long param1, int param2, long param3, short param4, long __functionAddress) { jni.invokePPPCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPPV(long param0, int param1, long param2, long param3, long param4, long __functionAddress) { jni.invokePPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPPV(long param0, long param1, int param2, long param3, long param4, long __functionAddress) { jni.invokePPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPPV(long param0, long param1, long param2, int param3, long param4, long __functionAddress) { jni.invokePPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPPV(long param0, long param1, long param2, long param3, int param4, long __functionAddress) { jni.invokePPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPPV(long param0, long param1, long param2, long param3, boolean param4, long __functionAddress) { jni.invokePPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePUCCV(long param0, byte param1, short param2, short param3, int param4, long __functionAddress) { jni.invokePUCCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokeCCCUV(short param0, short param1, short param2, int param3, int param4, byte param5, long __functionAddress) { jni.invokeCCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePJJJV(long param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress) { jni.invokePJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPPV(long param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress) { jni.invokePPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPPV(long param0, long param1, long param2, float param3, float param4, long param5, long __functionAddress) { jni.invokePPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePUCCV(long param0, byte param1, short param2, int param3, int param4, short param5, long __functionAddress) { jni.invokePUCCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePUCUV(long param0, byte param1, short param2, byte param3, int param4, int param5, long __functionAddress) { jni.invokePUCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePUPCV(long param0, byte param1, long param2, int param3, int param4, short param5, long __functionAddress) { jni.invokePUPCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokeCCCUV(short param0, short param1, short param2, int param3, int param4, int param5, byte param6, long __functionAddress) { jni.invokeCCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePCCUV(long param0, short param1, short param2, int param3, int param4, int param5, byte param6, long __functionAddress) { jni.invokePCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPPPV(long param0, long param1, long param2, float param3, float param4, float param5, float param6, long param7, long __functionAddress) { jni.invokePPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void invokePPPPV(long param0, long param1, long param2, int param3, int param4, int param5, float param6, long param7, long __functionAddress) { jni.invokePPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void invokePPPPV(long param0, long param1, long param2, float param3, float param4, float param5, float param6, float param7, float param8, long param9, long __functionAddress) { jni.invokePPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static void invokeCCCCCV(short param0, short param1, short param2, short param3, short param4, long __functionAddress) { jni.invokeCCCCCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokeCCUPPV(short param0, short param1, byte param2, long param3, long param4, long __functionAddress) { jni.invokeCCUPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPCPPV(long param0, long param1, short param2, long param3, long param4, long __functionAddress) { jni.invokePPCPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePPPPPV(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { jni.invokePPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void invokePCCCUV(long param0, short param1, short param2, short param3, int param4, byte param5, long __functionAddress) { jni.invokePCCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePJPPPV(long param0, long param1, long param2, int param3, long param4, long param5, long __functionAddress) { jni.invokePJPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPPPV(int param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { jni.invokePPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPPPV(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { jni.invokePPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPPPV(long param0, long param1, int param2, long param3, long param4, long param5, long __functionAddress) { jni.invokePPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPPPV(long param0, long param1, long param2, long param3, int param4, long param5, long __functionAddress) { jni.invokePPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePCCCUV(long param0, short param1, short param2, short param3, int param4, int param5, byte param6, long __functionAddress) { jni.invokePCCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPPPPV(long param0, int param1, int param2, long param3, long param4, long param5, long param6, long __functionAddress) { jni.invokePPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPPPPV(long param0, long param1, long param2, long param3, int param4, long param5, boolean param6, long __functionAddress) { jni.invokePPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePCCCCV(long param0, short param1, short param2, short param3, boolean param4, boolean param5, short param6, int param7, long __functionAddress) { jni.invokePCCCCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void invokePCCCUV(long param0, short param1, short param2, short param3, int param4, int param5, int param6, byte param7, long __functionAddress) { jni.invokePCCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void invokePPPPPV(long param0, long param1, int param2, long param3, int param4, long param5, int param6, long param7, long __functionAddress) { jni.invokePPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void invokePPPPPV(long param0, long param1, int param2, long param3, long param4, int param5, int param6, long param7, long __functionAddress) { jni.invokePPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void invokeCCCCUV(short param0, short param1, short param2, int param3, short param4, int param5, int param6, int param7, byte param8, long __functionAddress) { jni.invokeCCCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void invokePPPPPV(int param0, long param1, int param2, long param3, long param4, long param5, int param6, long param7, int param8, boolean param9, long __functionAddress) { jni.invokePPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static void invokeCCCCPCV(short param0, short param1, short param2, short param3, long param4, short param5, long __functionAddress) { jni.invokeCCCCPCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePPPPPPV(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { jni.invokePPPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void invokePCCCCUV(long param0, short param1, int param2, short param3, short param4, short param5, byte param6, long __functionAddress) { jni.invokePCCCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPPPPPV(int param0, long param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress) { jni.invokePPPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePCCCCUV(long param0, short param1, short param2, short param3, int param4, short param5, int param6, int param7, int param8, byte param9, long __functionAddress) { jni.invokePCCCCUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static void invokePPPPPPPV(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress) { jni.invokePPPPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void invokePPPPPPPV(long param0, int param1, long param2, long param3, long param4, long param5, long param6, long param7, long __functionAddress) { jni.invokePPPPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void invokeCCUCCCCPCV(short param0, short param1, byte param2, short param3, short param4, short param5, short param6, long param7, short param8, long __functionAddress) { jni.invokeCCUCCCCPCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void invokeCUCCCCCCPV(short param0, byte param1, short param2, short param3, short param4, short param5, short param6, short param7, long param8, long __functionAddress) { jni.invokeCUCCCCCCPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void invokeCCUUCCCCPCV(short param0, short param1, byte param2, byte param3, short param4, short param5, short param6, short param7, long param8, short param9, long __functionAddress) { jni.invokeCCUUCCCCPCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static void invokeCCUUUUUUUUUV(short param0, short param1, float param2, byte param3, byte param4, byte param5, byte param6, byte param7, byte param8, byte param9, byte param10, byte param11, long __functionAddress) { jni.invokeCCUUUUUUUUUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static void invokeCCUCCCCUCCCCCCV(short param0, short param1, byte param2, short param3, short param4, short param5, short param6, byte param7, short param8, short param9, short param10, short param11, short param12, short param13, long __functionAddress) { jni.invokeCCUCCCCUCCCCCCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13); }
    public static void invokePCCUCCCCUCCCCCCV(long param0, short param1, short param2, byte param3, short param4, short param5, short param6, short param7, byte param8, short param9, short param10, short param11, short param12, short param13, short param14, long __functionAddress) { jni.invokePCCUCCCCUCCCCCCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14); }
    public static boolean invokeZ(long __functionAddress) { return jni.invokeZ(MemorySegment.ofAddress(__functionAddress)); }
    public static boolean invokeZ(int param0, long __functionAddress) { return jni.invokeZ(MemorySegment.ofAddress(__functionAddress), param0); }
    public static boolean invokeZ(boolean param0, long __functionAddress) { return jni.invokeZ(MemorySegment.ofAddress(__functionAddress), param0); }
    public static boolean invokeZ(float param0, float param1, long __functionAddress) { return jni.invokeZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokeZ(int param0, float param1, long __functionAddress) { return jni.invokeZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokeZ(int param0, int param1, long __functionAddress) { return jni.invokeZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokePZ(long param0, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0); }
    public static boolean invokeJZ(long param0, int param1, long __functionAddress) { return jni.invokeJZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokePZ(int param0, long param1, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokePZ(long param0, float param1, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokePZ(long param0, int param1, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokePZ(long param0, boolean param1, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokeJZ(long param0, int param1, int param2, long __functionAddress) { return jni.invokeJZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePZ(int param0, int param1, long param2, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePZ(int param0, long param1, float param2, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePZ(int param0, long param1, int param2, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePZ(int param0, long param1, boolean param2, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePZ(long param0, float param1, float param2, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePZ(long param0, float param1, int param2, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePZ(long param0, int param1, int param2, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePZ(long param0, int param1, boolean param2, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePZ(long param0, boolean param1, int param2, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePZ(long param0, float param1, float param2, float param3, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePZ(long param0, int param1, int param2, int param3, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePZ(long param0, float param1, float param2, float param3, float param4, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePZ(int param0, int param1, int param2, float param3, boolean param4, long param5, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static boolean invokePZ(long param0, int param1, int param2, float param3, float param4, float param5, float param6, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static boolean invokePZ(long param0, int param1, int param2, boolean param3, float param4, float param5, float param6, long __functionAddress) { return jni.invokePZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static boolean invokePBZ(long param0, byte param1, long __functionAddress) { return jni.invokePBZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokePCZ(long param0, short param1, long __functionAddress) { return jni.invokePCZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokePJZ(long param0, long param1, long __functionAddress) { return jni.invokePJZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokePPZ(long param0, long param1, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokePSZ(long param0, short param1, long __functionAddress) { return jni.invokePSZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokePUZ(long param0, byte param1, long __functionAddress) { return jni.invokePUZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokeUPZ(byte param0, long param1, long __functionAddress) { return jni.invokeUPZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean invokeJPZ(long param0, long param1, boolean param2, long __functionAddress) { return jni.invokeJPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePJZ(int param0, long param1, long param2, long __functionAddress) { return jni.invokePJZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePPZ(int param0, long param1, long param2, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePPZ(long param0, int param1, long param2, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePPZ(long param0, long param1, int param2, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePPZ(long param0, long param1, boolean param2, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePSZ(long param0, int param1, short param2, long __functionAddress) { return jni.invokePSZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePUZ(long param0, int param1, byte param2, long __functionAddress) { return jni.invokePUZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePPZ(long param0, float param1, float param2, long param3, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPZ(long param0, int param1, int param2, long param3, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPZ(long param0, int param1, long param2, int param3, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPZ(long param0, long param1, int param2, int param3, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPZ(long param0, boolean param1, long param2, int param3, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPZ(long param0, long param1, int param2, int param3, float param4, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePPZ(int param0, int param1, int param2, long param3, int param4, int param5, long param6, int param7, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static boolean invokePPZ(int param0, int param1, int param2, long param3, int param4, int param5, long param6, int param7, boolean param8, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static boolean invokePPZ(int param0, int param1, int param2, int param3, int param4, long param5, int param6, int param7, int param8, int param9, long param10, int param11, long __functionAddress) { return jni.invokePPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static boolean invokePCCZ(long param0, short param1, short param2, long __functionAddress) { return jni.invokePCCZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePPPZ(long param0, long param1, long param2, long __functionAddress) { return jni.invokePPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean invokePCCZ(long param0, short param1, short param2, int param3, long __functionAddress) { return jni.invokePCCZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePJJZ(long param0, int param1, long param2, long param3, long __functionAddress) { return jni.invokePJJZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePJPZ(long param0, long param1, long param2, int param3, long __functionAddress) { return jni.invokePJPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPPZ(int param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPPZ(long param0, int param1, long param2, long param3, long __functionAddress) { return jni.invokePPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPPZ(long param0, long param1, long param2, int param3, long __functionAddress) { return jni.invokePPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPPZ(long param0, long param1, long param2, boolean param3, long __functionAddress) { return jni.invokePPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPPZ(long param0, boolean param1, long param2, long param3, long __functionAddress) { return jni.invokePPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePSSZ(long param0, int param1, short param2, short param3, long __functionAddress) { return jni.invokePSSZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokeCCJZ(short param0, boolean param1, short param2, int param3, long param4, long __functionAddress) { return jni.invokeCCJZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePJPZ(long param0, int param1, long param2, long param3, int param4, long __functionAddress) { return jni.invokePJPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePPPZ(long param0, float param1, float param2, long param3, long param4, long __functionAddress) { return jni.invokePPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePPPZ(long param0, long param1, long param2, boolean param3, int param4, long __functionAddress) { return jni.invokePPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePPPZ(long param0, long param1, int param2, long param3, int param4, boolean param5, long __functionAddress) { return jni.invokePPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static boolean invokePPPJZ(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPPJZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPPPZ(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePUUUZ(long param0, byte param1, byte param2, byte param3, long __functionAddress) { return jni.invokePUUUZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean invokePPPPZ(int param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePPPPZ(long param0, int param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePPPPZ(long param0, long param1, int param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePPPPZ(long param0, long param1, long param2, float param3, long param4, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePPPPZ(long param0, long param1, long param2, long param3, int param4, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePPPPZ(long param0, boolean param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePJPPZ(long param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePJPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static boolean invokePPPPZ(long param0, long param1, float param2, int param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static boolean invokePPPPZ(long param0, long param1, long param2, int param3, long param4, int param5, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static boolean invokePPPPZ(long param0, long param1, long param2, float param3, float param4, float param5, float param6, float param7, long param8, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static boolean invokePPPPZ(long param0, long param1, int param2, int param3, int param4, int param5, float param6, int param7, long param8, long param9, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static boolean invokePPPPZ(long param0, long param1, long param2, float param3, float param4, float param5, float param6, float param7, long param8, float param9, long __functionAddress) { return jni.invokePPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static boolean invokePPPPPZ(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.invokePPPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePPPUPZ(long param0, long param1, long param2, byte param3, long param4, long __functionAddress) { return jni.invokePPPUPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePUUUUZ(long param0, byte param1, byte param2, byte param3, byte param4, long __functionAddress) { return jni.invokePUUUUZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static boolean invokePPPPPZ(int param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static boolean invokePPPPPZ(long param0, long param1, int param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static boolean invokePPPPPZ(long param0, long param1, long param2, long param3, long param4, int param5, long __functionAddress) { return jni.invokePPPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static boolean invokePPPPPZ(long param0, int param1, int param2, long param3, long param4, long param5, long param6, long __functionAddress) { return jni.invokePPPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static boolean invokePPPPPZ(long param0, long param1, long param2, long param3, double param4, long param5, int param6, long __functionAddress) { return jni.invokePPPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static boolean invokePPPPPZ(long param0, long param1, long param2, long param3, long param4, boolean param5, int param6, long __functionAddress) { return jni.invokePPPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static boolean invokePUUUUZ(long param0, int param1, int param2, byte param3, byte param4, byte param5, byte param6, long __functionAddress) { return jni.invokePUUUUZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static boolean invokePPPPPZ(long param0, long param1, long param2, int param3, long param4, int param5, long param6, int param7, long __functionAddress) { return jni.invokePPPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static boolean invokePPJJPPZ(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPJJPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static boolean invokePPPPPPZ(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.invokePPPPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static boolean invokePPPPPPZ(long param0, long param1, long param2, int param3, long param4, int param5, long param6, int param7, int param8, long param9, int param10, int param11, long __functionAddress) { return jni.invokePPPPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static short callC(int param0, long __functionAddress) { return jni.callC(MemorySegment.ofAddress(__functionAddress), param0); }
    public static float callF(int param0, int param1, int param2, long __functionAddress) { return jni.callF(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static float callPF(long param0, float param1, long __functionAddress) { return jni.callPF(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int callI(long __functionAddress) { return jni.callI(MemorySegment.ofAddress(__functionAddress)); }
    public static int callI(int param0, long __functionAddress) { return jni.callI(MemorySegment.ofAddress(__functionAddress), param0); }
    public static int callI(int param0, int param1, long __functionAddress) { return jni.callI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int callI(int param0, int param1, int param2, long __functionAddress) { return jni.callI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPI(long param0, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0); }
    public static int callPI(int param0, long param1, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int callPI(long param0, float param1, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int callPI(long param0, int param1, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int callPI(int param0, int param1, long param2, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPI(int param0, long param1, int param2, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPI(long param0, float param1, float param2, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPI(long param0, float param1, int param2, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPI(long param0, int param1, float param2, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPI(long param0, int param1, int param2, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callJI(int param0, long param1, int param2, int param3, long __functionAddress) { return jni.callJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPI(int param0, int param1, int param2, long param3, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPI(long param0, float param1, float param2, float param3, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPI(long param0, int param1, float param2, float param3, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPI(long param0, int param1, int param2, int param3, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPI(long param0, int param1, int param2, boolean param3, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPI(int param0, int param1, int param2, int param3, long param4, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPI(long param0, int param1, float param2, float param3, int param4, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPI(long param0, int param1, int param2, int param3, int param4, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPI(int param0, int param1, int param2, int param3, int param4, long param5, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPI(int param0, long param1, int param2, int param3, float param4, int param5, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPI(long param0, int param1, int param2, int param3, int param4, int param5, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPI(long param0, int param1, int param2, int param3, int param4, int param5, int param6, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPI(int param0, int param1, long param2, int param3, int param4, int param5, int param6, float param7, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPI(long param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, long __functionAddress) { return jni.callPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int callPJI(long param0, long param1, long __functionAddress) { return jni.callPJI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int callPPI(long param0, long param1, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static int callPJI(long param0, int param1, long param2, long __functionAddress) { return jni.callPJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPJI(long param0, long param1, float param2, long __functionAddress) { return jni.callPJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPJI(long param0, long param1, int param2, long __functionAddress) { return jni.callPJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPPI(int param0, long param1, long param2, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPPI(long param0, float param1, long param2, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPPI(long param0, int param1, long param2, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPPI(long param0, long param1, float param2, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPPI(long param0, long param1, int param2, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPPI(int param0, int param1, long param2, long param3, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPI(long param0, int param1, float param2, long param3, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPI(long param0, int param1, int param2, long param3, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPI(long param0, int param1, long param2, int param3, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPI(long param0, long param1, float param2, float param3, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPI(long param0, long param1, float param2, int param3, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPI(long param0, long param1, int param2, int param3, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPI(long param0, int param1, float param2, float param3, long param4, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPI(long param0, int param1, int param2, int param3, long param4, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPI(long param0, int param1, int param2, long param3, int param4, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPI(long param0, long param1, int param2, int param3, int param4, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPI(long param0, long param1, int param2, int param3, boolean param4, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPI(int param0, long param1, int param2, int param3, float param4, long param5, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPI(long param0, int param1, float param2, float param3, float param4, long param5, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPI(long param0, long param1, int param2, int param3, int param4, int param5, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPI(long param0, int param1, float param2, float param3, float param4, int param5, long param6, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPI(long param0, int param1, int param2, int param3, int param4, int param5, long param6, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPI(long param0, int param1, float param2, float param3, float param4, float param5, int param6, long param7, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPI(long param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPI(int param0, int param1, long param2, long param3, int param4, int param5, int param6, int param7, float param8, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int callPPI(long param0, int param1, float param2, float param3, float param4, float param5, float param6, int param7, long param8, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int callPPI(long param0, int param1, int param2, float param3, float param4, float param5, float param6, float param7, int param8, long param9, int param10, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static int callPPI(long param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, long __functionAddress) { return jni.callPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16); }
    public static int callPJJI(long param0, long param1, long param2, long __functionAddress) { return jni.callPJJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPJPI(long param0, long param1, long param2, long __functionAddress) { return jni.callPJPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPPJI(long param0, long param1, long param2, long __functionAddress) { return jni.callPPJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPPPI(long param0, long param1, long param2, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static int callPJJI(long param0, long param1, long param2, float param3, long __functionAddress) { return jni.callPJJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPJJI(long param0, long param1, long param2, int param3, long __functionAddress) { return jni.callPJJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPJPI(long param0, int param1, long param2, long param3, long __functionAddress) { return jni.callPJPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPJPI(long param0, long param1, int param2, long param3, long __functionAddress) { return jni.callPJPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPJI(long param0, int param1, long param2, long param3, long __functionAddress) { return jni.callPPJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPJI(long param0, long param1, int param2, long param3, long __functionAddress) { return jni.callPPJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPNI(long param0, int param1, long param2, long param3, long __functionAddress) { return jni.callPPNI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPPI(int param0, long param1, long param2, long param3, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPPI(long param0, int param1, long param2, long param3, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPPI(long param0, long param1, int param2, long param3, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPPI(long param0, long param1, long param2, int param3, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPJJI(long param0, long param1, int param2, long param3, int param4, long __functionAddress) { return jni.callPJJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPJPI(long param0, int param1, long param2, long param3, int param4, long __functionAddress) { return jni.callPJPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPJI(long param0, int param1, long param2, int param3, long param4, long __functionAddress) { return jni.callPPJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPPI(int param0, long param1, int param2, long param3, long param4, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPPI(long param0, int param1, int param2, long param3, long param4, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPPI(long param0, int param1, long param2, long param3, int param4, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPPI(long param0, long param1, int param2, long param3, int param4, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPPI(long param0, long param1, long param2, int param3, int param4, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPPI(long param0, int param1, int param2, int param3, long param4, long param5, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPI(long param0, int param1, int param2, long param3, int param4, long param5, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPI(long param0, int param1, long param2, long param3, int param4, int param5, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPI(long param0, long param1, int param2, int param3, int param4, long param5, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPI(long param0, long param1, long param2, int param3, int param4, int param5, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPI(long param0, float param1, float param2, int param3, int param4, long param5, long param6, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPI(long param0, int param1, int param2, int param3, int param4, long param5, long param6, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPI(long param0, int param1, long param2, long param3, int param4, int param5, int param6, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPI(long param0, long param1, int param2, int param3, int param4, int param5, long param6, long __functionAddress) { return jni.callPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callJPPI(int param0, int param1, int param2, int param3, int param4, long param5, long param6, long param7, long __functionAddress) { return jni.callJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callJJPPI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.callJJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPJJJI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.callPJJJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPJJPI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.callPJJPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPJPPI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.callPJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPJPI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.callPPJPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPNPI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.callPPNPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPPPPI(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static int callPJJJI(long param0, int param1, long param2, long param3, long param4, long __functionAddress) { return jni.callPJJJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPJPPI(long param0, long param1, int param2, long param3, long param4, long __functionAddress) { return jni.callPJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPPPI(long param0, int param1, long param2, long param3, long param4, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPPPI(long param0, long param1, int param2, long param3, long param4, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPPPI(long param0, long param1, long param2, int param3, long param4, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPPPI(long param0, long param1, long param2, long param3, int param4, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPJPPI(long param0, long param1, int param2, int param3, long param4, long param5, long __functionAddress) { return jni.callPJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPI(int param0, long param1, long param2, int param3, long param4, long param5, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPI(long param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPI(long param0, int param1, long param2, int param3, long param4, long param5, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPI(long param0, int param1, long param2, long param3, int param4, long param5, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPI(long param0, int param1, long param2, long param3, long param4, int param5, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPI(long param0, long param1, int param2, int param3, long param4, long param5, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPI(long param0, long param1, int param2, long param3, int param4, long param5, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPI(long param0, long param1, long param2, int param3, int param4, long param5, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPI(long param0, long param1, long param2, int param3, long param4, int param5, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPJPPI(long param0, long param1, int param2, int param3, int param4, long param5, long param6, long __functionAddress) { return jni.callPJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPPI(long param0, int param1, int param2, int param3, long param4, long param5, long param6, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPPI(long param0, int param1, long param2, int param3, int param4, long param5, long param6, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPPI(long param0, long param1, long param2, int param3, int param4, int param5, long param6, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPPI(int param0, long param1, long param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20, long param21, long param22, long __functionAddress) { return jni.callPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22); }
    public static int callPJJPPI(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.callPJJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPJPPPI(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.callPJPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPJPPI(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.callPPJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPPPPPI(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.callPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static int callPJJJPI(long param0, long param1, long param2, long param3, int param4, long param5, long __functionAddress) { return jni.callPJJJPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPJPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPJPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPPI(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPPI(long param0, long param1, long param2, int param3, long param4, long param5, long __functionAddress) { return jni.callPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPPI(long param0, long param1, long param2, long param3, int param4, long param5, long __functionAddress) { return jni.callPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPJPPI(long param0, int param1, long param2, long param3, int param4, long param5, long param6, long __functionAddress) { return jni.callPPJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPJPPI(long param0, long param1, int param2, long param3, int param4, long param5, long param6, long __functionAddress) { return jni.callPPJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPPPI(int param0, int param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress) { return jni.callPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPPPI(long param0, int param1, int param2, long param3, long param4, long param5, long param6, long __functionAddress) { return jni.callPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPPPI(long param0, int param1, long param2, int param3, long param4, long param5, long param6, long __functionAddress) { return jni.callPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPPPI(long param0, int param1, long param2, long param3, int param4, long param5, long param6, long __functionAddress) { return jni.callPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callJPPPPI(int param0, int param1, long param2, long param3, int param4, long param5, long param6, long param7, long __functionAddress) { return jni.callJPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPJPPJI(long param0, long param1, int param2, int param3, long param4, long param5, long param6, int param7, long __functionAddress) { return jni.callPJPPJI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPPPPI(long param0, int param1, long param2, int param3, long param4, int param5, long param6, long param7, long __functionAddress) { return jni.callPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPJJJJPI(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPJJJJPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPJPI(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPPPPJPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static int callPJJPPPI(long param0, long param1, long param2, int param3, long param4, long param5, long param6, long __functionAddress) { return jni.callPJJPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPJPPPPI(long param0, int param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress) { return jni.callPJPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPJPPI(long param0, long param1, long param2, long param3, int param4, long param5, long param6, long __functionAddress) { return jni.callPPPJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPPPPPPI(long param0, long param1, long param2, int param3, long param4, long param5, long param6, long __functionAddress) { return jni.callPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static int callPJPPPPI(long param0, int param1, long param2, long param3, long param4, int param5, long param6, long param7, long __functionAddress) { return jni.callPJPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPPJPPI(long param0, int param1, long param2, long param3, long param4, int param5, long param6, long param7, long __functionAddress) { return jni.callPPPJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPPPPPI(int param0, int param1, long param2, long param3, long param4, long param5, long param6, long param7, long __functionAddress) { return jni.callPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPPPPPI(long param0, int param1, long param2, int param3, long param4, long param5, long param6, long param7, long __functionAddress) { return jni.callPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPPPPPI(long param0, int param1, long param2, long param3, long param4, int param5, long param6, long param7, long __functionAddress) { return jni.callPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long param6, long param7, long __functionAddress) { return jni.callPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPPPPPPI(long param0, long param1, long param2, long param3, int param4, long param5, long param6, long param7, long __functionAddress) { return jni.callPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPPPPPPI(long param0, long param1, long param2, long param3, long param4, int param5, long param6, long param7, long __functionAddress) { return jni.callPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, long param6, int param7, long __functionAddress) { return jni.callPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPPPPPPI(long param0, int param1, long param2, int param3, long param4, long param5, long param6, long param7, long param8, long __functionAddress) { return jni.callPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int callPPPPPPPI(long param0, int param1, long param2, long param3, int param4, long param5, long param6, long param7, long param8, long __functionAddress) { return jni.callPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int callPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, int param6, long param7, long param8, long __functionAddress) { return jni.callPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int callPPPPPPPI(long param0, long param1, long param2, int param3, long param4, long param5, int param6, long param7, long param8, long __functionAddress) { return jni.callPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int callPPPPPJPPI(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, long __functionAddress) { return jni.callPPPPPJPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static int callPPJPPPPPI(long param0, long param1, long param2, long param3, long param4, int param5, long param6, long param7, long param8, long __functionAddress) { return jni.callPPJPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int callPPPPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, int param6, long param7, long param8, long __functionAddress) { return jni.callPPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static int callPPPPPPPPI(long param0, long param1, long param2, long param3, int param4, long param5, long param6, int param7, long param8, long param9, long __functionAddress) { return jni.callPPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static int callPPPPPPPPI(long param0, int param1, int param2, long param3, long param4, long param5, long param6, int param7, long param8, long param9, long param10, long __functionAddress) { return jni.callPPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static int callPPPPPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, int param6, long param7, long param8, long param9, long __functionAddress) { return jni.callPPPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static int callPPPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long param6, long param7, int param8, long param9, long param10, long __functionAddress) { return jni.callPPPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static int callPPPPPPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, long param6, int param7, long param8, long param9, long param10, long __functionAddress) { return jni.callPPPPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static int callPPPPPPPPPPI(long param0, long param1, long param2, long param3, int param4, long param5, long param6, long param7, int param8, long param9, long param10, long param11, long __functionAddress) { return jni.callPPPPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static int callPPPPPPPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, int param8, long param9, long param10, long param11, long __functionAddress) { return jni.callPPPPPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static int callPPPPPPPPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, int param10, long param11, long param12, long __functionAddress) { return jni.callPPPPPPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12); }
    public static int callPPPPPPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, long param10, int param11, long param12, long param13, long __functionAddress) { return jni.callPPPPPPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13); }
    public static int callPPPPPPPPPPPPPPPI(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, long param10, long param11, int param12, long param13, long param14, long param15, long __functionAddress) { return jni.callPPPPPPPPPPPPPPPI(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15); }
    public static long callJ(long __functionAddress) { return jni.callJ(MemorySegment.ofAddress(__functionAddress)); }
    public static long callJ(int param0, long __functionAddress) { return jni.callJ(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long callJ(int param0, int param1, long __functionAddress) { return jni.callJ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long callJ(int param0, int param1, boolean param2, int param3, int param4, long __functionAddress) { return jni.callJ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPJ(long param0, int param1, long __functionAddress) { return jni.callPJ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long callPPJ(long param0, long param1, long __functionAddress) { return jni.callPPJ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long callPJJ(long param0, long param1, int param2, int param3, long __functionAddress) { return jni.callPJJ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPJJJ(long param0, long param1, long param2, long __functionAddress) { return jni.callPJJJ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long callPN(long param0, long __functionAddress) { return jni.callPN(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long callP(long __functionAddress) { return jni.callP(MemorySegment.ofAddress(__functionAddress)); }
    public static long callP(int param0, long __functionAddress) { return jni.callP(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long callP(int param0, int param1, long __functionAddress) { return jni.callP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long callP(int param0, float param1, float param2, float param3, long __functionAddress) { return jni.callP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callJP(long param0, long __functionAddress) { return jni.callJP(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long callPP(long param0, long __functionAddress) { return jni.callPP(MemorySegment.ofAddress(__functionAddress), param0); }
    public static long callPP(int param0, long param1, long __functionAddress) { return jni.callPP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long callPP(long param0, int param1, long __functionAddress) { return jni.callPP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long callPP(int param0, int param1, long param2, long __functionAddress) { return jni.callPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long callPP(int param0, long param1, int param2, long __functionAddress) { return jni.callPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long callPP(long param0, int param1, int param2, long __functionAddress) { return jni.callPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long callPP(int param0, int param1, long param2, int param3, long __functionAddress) { return jni.callPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callJJP(long param0, long param1, long __functionAddress) { return jni.callJJP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long callPNP(long param0, long param1, long __functionAddress) { return jni.callPNP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long callPPP(long param0, long param1, long __functionAddress) { return jni.callPPP(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static long callPPP(int param0, long param1, long param2, long __functionAddress) { return jni.callPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long callPPP(long param0, int param1, long param2, long __functionAddress) { return jni.callPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long callPPP(long param0, long param1, int param2, long __functionAddress) { return jni.callPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long callPPP(int param0, long param1, long param2, int param3, long __functionAddress) { return jni.callPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPPP(long param0, int param1, int param2, long param3, long __functionAddress) { return jni.callPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPPP(int param0, int param1, int param2, long param3, long param4, long __functionAddress) { return jni.callPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPPP(long param0, int param1, int param2, int param3, long param4, long __functionAddress) { return jni.callPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPPP(long param0, long param1, int param2, int param3, int param4, long __functionAddress) { return jni.callPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPPNP(long param0, long param1, long param2, long __functionAddress) { return jni.callPPNP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long callPPPP(long param0, long param1, long param2, long __functionAddress) { return jni.callPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static long callPJPP(long param0, long param1, int param2, long param3, long __functionAddress) { return jni.callPJPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPJPP(long param0, long param1, long param2, int param3, long __functionAddress) { return jni.callPJPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPPPP(int param0, long param1, long param2, long param3, long __functionAddress) { return jni.callPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPPPP(long param0, int param1, long param2, long param3, long __functionAddress) { return jni.callPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPPPP(long param0, long param1, int param2, long param3, long __functionAddress) { return jni.callPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPPPP(long param0, long param1, long param2, int param3, long __functionAddress) { return jni.callPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPPPP(long param0, long param1, int param2, int param3, long param4, long __functionAddress) { return jni.callPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPPPP(long param0, long param1, int param2, long param3, int param4, long __functionAddress) { return jni.callPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPJPP(long param0, long param1, int param2, int param3, int param4, long param5, long __functionAddress) { return jni.callPJPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long callJJPPP(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.callJJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPPJPP(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.callPPJPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPPNPP(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.callPPNPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPPPPP(long param0, long param1, long param2, long param3, long __functionAddress) { return jni.callPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static long callPJPPP(long param0, long param1, int param2, long param3, long param4, long __functionAddress) { return jni.callPJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPJPPP(long param0, long param1, long param2, int param3, long param4, long __functionAddress) { return jni.callPJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPPPPP(long param0, int param1, long param2, long param3, long param4, long __functionAddress) { return jni.callPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPPPPP(long param0, long param1, int param2, long param3, long param4, long __functionAddress) { return jni.callPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPPPPP(long param0, long param1, long param2, int param3, long param4, long __functionAddress) { return jni.callPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPPPPP(long param0, long param1, long param2, long param3, int param4, long __functionAddress) { return jni.callPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPJPPP(long param0, long param1, int param2, int param3, long param4, long param5, long __functionAddress) { return jni.callPJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long callPJPPPP(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.callPJPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPPPJPP(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { return jni.callPPPJPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static long callPPPPPP(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long callPPPPPP(long param0, long param1, long param2, long param3, int param4, long param5, long __functionAddress) { return jni.callPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long callPPPPPP(long param0, int param1, int param2, long param3, int param4, long param5, long param6, long param7, long __functionAddress) { return jni.callPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static long callPJJPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPJJPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long callPJPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPJPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long callPPJPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPPJPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long callPPPJPPP(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPPPJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static long callPPPPPPP(long param0, int param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress) { return jni.callPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long callPPJPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress) { return jni.callPPJPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long callPPPPJPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress) { return jni.callPPPPJPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static long callPPPPPPPP(long param0, int param1, long param2, long param3, int param4, long param5, long param6, long param7, long param8, long __functionAddress) { return jni.callPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static long callPPPPPPPP(int param0, long param1, long param2, int param3, int param4, int param5, int param6, long param7, long param8, long param9, int param10, long param11, long param12, long __functionAddress) { return jni.callPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12); }
    public static long callPJPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, long __functionAddress) { return jni.callPJPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static long callPPJPPPPPP(long param0, long param1, int param2, long param3, long param4, long param5, int param6, long param7, long param8, long param9, long __functionAddress) { return jni.callPPJPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static long callPJPPPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, long __functionAddress) { return jni.callPJPPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static long callPPJPPPPPPPP(long param0, long param1, int param2, long param3, long param4, long param5, long param6, long param7, int param8, long param9, long param10, long param11, long __functionAddress) { return jni.callPPJPPPPPPPP(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static short callS(int param0, long __functionAddress) { return jni.callS(MemorySegment.ofAddress(__functionAddress), param0); }
    public static short callPS(long param0, long __functionAddress) { return jni.callPS(MemorySegment.ofAddress(__functionAddress), param0); }
    public static short callPCS(long param0, short param1, long __functionAddress) { return jni.callPCS(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static short callPPS(long param0, long param1, long __functionAddress) { return jni.callPPS(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static short callPSS(long param0, short param1, long __functionAddress) { return jni.callPSS(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static short callSPS(short param0, long param1, long __functionAddress) { return jni.callSPS(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static short callPPS(long param0, long param1, int param2, long __functionAddress) { return jni.callPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short callPPS(long param0, int param1, long param2, int param3, long __functionAddress) { return jni.callPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static short callPCPS(long param0, short param1, long param2, long __functionAddress) { return jni.callPCPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short callPPCS(long param0, long param1, short param2, long __functionAddress) { return jni.callPPCS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short callPPPS(long param0, long param1, long param2, long __functionAddress) { return jni.callPPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short callPPSS(long param0, long param1, short param2, long __functionAddress) { return jni.callPPSS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short callPSPS(long param0, short param1, long param2, long __functionAddress) { return jni.callPSPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short callSPPS(short param0, long param1, long param2, long __functionAddress) { return jni.callSPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short callSPSS(short param0, long param1, short param2, long __functionAddress) { return jni.callSPSS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static short callPPPS(long param0, int param1, long param2, int param3, long param4, long __functionAddress) { return jni.callPPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static short callPJCCS(long param0, long param1, short param2, short param3, long __functionAddress) { return jni.callPJCCS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static short callPPSPS(long param0, long param1, short param2, long param3, long __functionAddress) { return jni.callPPSPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static short callPSSPS(long param0, short param1, short param2, long param3, int param4, long __functionAddress) { return jni.callPSSPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static short callPPPPS(long param0, long param1, int param2, long param3, int param4, long param5, long __functionAddress) { return jni.callPPPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static short callPCPPPS(long param0, short param1, long param2, long param3, long param4, long __functionAddress) { return jni.callPCPPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static short callPCPSPS(long param0, short param1, long param2, short param3, long param4, long __functionAddress) { return jni.callPCPSPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static short callPSSPPS(long param0, short param1, short param2, long param3, int param4, long param5, long __functionAddress) { return jni.callPSSPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static short callPCPPPPS(long param0, short param1, long param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPCPPPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static short callPCSPPPS(long param0, short param1, short param2, long param3, long param4, long param5, long __functionAddress) { return jni.callPCSPPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static short callPPSPSPS(long param0, long param1, short param2, long param3, short param4, long param5, long __functionAddress) { return jni.callPPSPSPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static short callPCCPSPPS(long param0, short param1, short param2, long param3, short param4, long param5, long param6, long __functionAddress) { return jni.callPCCPSPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static short callPPSPSPSS(long param0, long param1, short param2, long param3, short param4, long param5, short param6, long __functionAddress) { return jni.callPPSPSPSS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static short callSPSSPSPS(short param0, long param1, short param2, short param3, long param4, short param5, long param6, long __functionAddress) { return jni.callSPSSPSPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static short callPCPSPPSPS(long param0, short param1, long param2, short param3, long param4, long param5, short param6, long param7, long __functionAddress) { return jni.callPCPSPPSPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static short callPPPSPSPCS(long param0, long param1, long param2, short param3, long param4, short param5, long param6, short param7, long __functionAddress) { return jni.callPPPSPSPCS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static short callSPSPPPSPS(short param0, long param1, short param2, long param3, long param4, long param5, short param6, long param7, long __functionAddress) { return jni.callSPSPPPSPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static short callPCPSPPPPPS(long param0, short param1, long param2, short param3, long param4, long param5, long param6, long param7, long param8, long __functionAddress) { return jni.callPCPSPPPPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static short callPPSPSPSCCS(long param0, long param1, short param2, long param3, short param4, long param5, short param6, short param7, short param8, long __functionAddress) { return jni.callPPSPSPSCCS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static short callPPSPSPSPSS(long param0, long param1, short param2, long param3, short param4, long param5, short param6, long param7, short param8, long __functionAddress) { return jni.callPPSPSPSPSS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static short callPCPSPSPSCCS(long param0, short param1, long param2, short param3, long param4, short param5, long param6, short param7, short param8, short param9, long __functionAddress) { return jni.callPCPSPSPSCCS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static short callPCSSSPSPPPS(long param0, short param1, short param2, short param3, short param4, long param5, short param6, long param7, long param8, long param9, long __functionAddress) { return jni.callPCSSSPSPPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static short callPSSSPSSPPPS(long param0, short param1, short param2, short param3, long param4, short param5, short param6, long param7, long param8, long param9, long __functionAddress) { return jni.callPSSSPSSPPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static short callPSPSPPPPPPPS(long param0, short param1, long param2, short param3, long param4, long param5, long param6, long param7, long param8, long param9, long param10, long __functionAddress) { return jni.callPSPSPPPPPPPS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static short callPPSPSPSPSPSPSS(long param0, long param1, short param2, long param3, short param4, long param5, short param6, long param7, short param8, long param9, short param10, long param11, short param12, long __functionAddress) { return jni.callPPSPSPSPSPSPSS(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12); }
    public static void callV(long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress)); }
    public static void callV(double param0, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void callV(float param0, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void callV(int param0, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void callV(boolean param0, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void callV(double param0, double param1, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callV(float param0, float param1, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callV(float param0, boolean param1, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callV(int param0, double param1, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callV(int param0, float param1, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callV(int param0, int param1, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callV(int param0, boolean param1, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callV(double param0, double param1, double param2, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callV(float param0, float param1, float param2, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callV(int param0, double param1, double param2, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callV(int param0, float param1, float param2, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callV(int param0, int param1, double param2, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callV(int param0, int param1, float param2, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callV(int param0, int param1, int param2, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callV(int param0, int param1, boolean param2, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callV(double param0, double param1, double param2, double param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(float param0, float param1, float param2, float param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(int param0, double param1, double param2, double param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(int param0, float param1, float param2, float param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(int param0, int param1, double param2, double param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(int param0, int param1, float param2, float param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(int param0, int param1, float param2, int param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(int param0, int param1, int param2, double param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(int param0, int param1, int param2, float param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(int param0, int param1, int param2, int param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(int param0, int param1, int param2, boolean param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(int param0, int param1, boolean param2, int param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(boolean param0, boolean param1, boolean param2, boolean param3, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callV(int param0, double param1, double param2, double param3, double param4, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callV(int param0, float param1, float param2, float param3, float param4, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callV(int param0, int param1, double param2, double param3, double param4, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callV(int param0, int param1, float param2, float param3, float param4, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callV(int param0, int param1, int param2, float param3, int param4, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callV(int param0, int param1, int param2, boolean param3, int param4, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callV(int param0, boolean param1, boolean param2, boolean param3, boolean param4, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callV(double param0, double param1, double param2, double param3, double param4, double param5, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callV(int param0, double param1, double param2, int param3, double param4, double param5, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callV(int param0, float param1, float param2, int param3, float param4, float param5, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callV(int param0, int param1, double param2, double param3, double param4, double param5, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callV(int param0, int param1, float param2, float param3, float param4, float param5, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, int param5, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, boolean param5, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callV(int param0, int param1, int param2, int param3, boolean param4, int param5, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callV(int param0, double param1, double param2, double param3, double param4, double param5, double param6, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callV(int param0, int param1, int param2, double param3, double param4, double param5, double param6, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callV(int param0, int param1, int param2, float param3, float param4, float param5, float param6, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callV(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callV(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callV(int param0, int param1, int param2, float param3, float param4, float param5, float param6, float param7, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static void callV(int param0, int param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14); }
    public static void callV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, long __functionAddress) { jni.callV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16); }
    public static void callJV(long param0, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void callPV(long param0, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void callSV(short param0, long __functionAddress) { jni.callSV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void callUV(byte param0, long __functionAddress) { jni.callUV(MemorySegment.ofAddress(__functionAddress), param0); }
    public static void callCV(int param0, short param1, long __functionAddress) { jni.callCV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callJV(int param0, long param1, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callJV(long param0, int param1, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callPV(int param0, long param1, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callPV(long param0, float param1, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callPV(long param0, int param1, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callSV(int param0, short param1, long __functionAddress) { jni.callSV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callJV(int param0, int param1, long param2, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPV(int param0, int param1, long param2, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPV(int param0, long param1, int param2, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPV(long param0, float param1, float param2, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPV(long param0, int param1, int param2, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callJV(int param0, long param1, int param2, int param3, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callNV(long param0, int param1, int param2, int param3, long __functionAddress) { jni.callNV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPV(int param0, int param1, int param2, long param3, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPV(int param0, int param1, long param2, int param3, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPV(int param0, int param1, boolean param2, long param3, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPV(int param0, long param1, int param2, int param3, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPV(long param0, float param1, float param2, float param3, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPV(long param0, int param1, int param2, int param3, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPV(int param0, int param1, int param2, int param3, long param4, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPV(int param0, int param1, int param2, long param3, int param4, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPV(int param0, int param1, int param2, long param3, boolean param4, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPV(int param0, int param1, int param2, boolean param3, long param4, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPV(int param0, int param1, long param2, int param3, int param4, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPV(int param0, long param1, int param2, int param3, int param4, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPV(int param0, boolean param1, int param2, int param3, long param4, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPV(long param0, int param1, int param2, int param3, int param4, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callJV(int param0, int param1, int param2, int param3, int param4, long param5, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPV(int param0, double param1, double param2, int param3, int param4, long param5, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPV(int param0, float param1, float param2, int param3, int param4, long param5, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPV(int param0, int param1, int param2, int param3, int param4, long param5, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPV(int param0, int param1, int param2, int param3, long param4, boolean param5, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPV(int param0, int param1, int param2, long param3, int param4, int param5, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPV(int param0, int param1, int param2, boolean param3, int param4, long param5, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPV(int param0, int param1, long param2, int param3, int param4, int param5, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPV(int param0, boolean param1, int param2, int param3, int param4, long param5, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPV(long param0, int param1, int param2, int param3, int param4, int param5, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callJV(int param0, int param1, int param2, int param3, int param4, int param5, long param6, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPV(int param0, int param1, double param2, double param3, int param4, int param5, long param6, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPV(int param0, int param1, float param2, float param3, float param4, float param5, long param6, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPV(int param0, int param1, float param2, float param3, int param4, int param5, long param6, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPV(int param0, int param1, int param2, int param3, int param4, int param5, long param6, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPV(int param0, int param1, int param2, int param3, int param4, long param5, int param6, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPV(int param0, int param1, int param2, long param3, int param4, int param5, int param6, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPV(long param0, int param1, int param2, int param3, int param4, int param5, int param6, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callJV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callJV(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, long param7, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPV(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, long param7, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callJV(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, long param8, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, long param8, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void callPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, int param7, float param8, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void callPV(int param0, double param1, double param2, int param3, int param4, double param5, double param6, int param7, int param8, long param9, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static void callPV(int param0, float param1, float param2, int param3, int param4, float param5, float param6, int param7, int param8, long param9, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, long param9, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static void callJV(long param0, int param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static void callPV(int param0, int param1, double param2, double param3, int param4, int param5, double param6, double param7, int param8, int param9, long param10, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static void callPV(int param0, int param1, float param2, float param3, int param4, int param5, float param6, float param7, int param8, int param9, long param10, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, long param10, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static void callPV(long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static void callJV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, long param10, boolean param11, long __functionAddress) { jni.callJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, long param11, long __functionAddress) { jni.callPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11); }
    public static void callPJV(long param0, long param1, long __functionAddress) { jni.callPJV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callPPV(long param0, long param1, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callSSV(short param0, short param1, long __functionAddress) { jni.callSSV(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static void callJJV(int param0, long param1, long param2, long __functionAddress) { jni.callJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPCV(long param0, int param1, short param2, long __functionAddress) { jni.callPCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPJV(long param0, int param1, long param2, long __functionAddress) { jni.callPJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPJV(long param0, long param1, float param2, long __functionAddress) { jni.callPJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPJV(long param0, long param1, int param2, long __functionAddress) { jni.callPJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPPV(int param0, long param1, long param2, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPPV(long param0, int param1, long param2, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPPV(long param0, long param1, int param2, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callSSV(int param0, short param1, short param2, long __functionAddress) { jni.callSSV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callJJV(int param0, int param1, long param2, long param3, long __functionAddress) { jni.callJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callJPV(int param0, int param1, long param2, long param3, long __functionAddress) { jni.callJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callJPV(int param0, long param1, int param2, long param3, long __functionAddress) { jni.callJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPJV(int param0, long param1, int param2, long param3, long __functionAddress) { jni.callPJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPJV(long param0, int param1, long param2, int param3, long __functionAddress) { jni.callPJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPJV(long param0, long param1, int param2, int param3, long __functionAddress) { jni.callPJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPV(int param0, int param1, long param2, long param3, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPV(int param0, long param1, int param2, long param3, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPV(int param0, long param1, long param2, int param3, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPV(int param0, long param1, long param2, boolean param3, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPV(long param0, int param1, int param2, long param3, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPV(long param0, long param1, int param2, int param3, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPJV(long param0, long param1, int param2, int param3, int param4, long __functionAddress) { jni.callPJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPV(int param0, int param1, int param2, long param3, long param4, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPV(int param0, int param1, long param2, int param3, long param4, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPV(int param0, int param1, long param2, long param3, int param4, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPV(int param0, long param1, int param2, long param3, int param4, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPV(int param0, long param1, long param2, int param3, int param4, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPV(long param0, int param1, int param2, int param3, long param4, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPV(int param0, int param1, int param2, int param3, long param4, long param5, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPV(int param0, int param1, int param2, long param3, long param4, int param5, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPV(int param0, int param1, long param2, int param3, int param4, long param5, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPV(int param0, int param1, long param2, long param3, int param4, int param5, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPV(int param0, long param1, long param2, int param3, int param4, int param5, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPV(long param0, int param1, long param2, int param3, int param4, int param5, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPV(int param0, int param1, int param2, int param3, int param4, long param5, long param6, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPV(int param0, int param1, int param2, long param3, int param4, int param5, long param6, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, long param6, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPV(int param0, int param1, long param2, long param3, int param4, int param5, int param6, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPV(int param0, int param1, int param2, int param3, int param4, int param5, long param6, long param7, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPPV(int param0, int param1, int param2, int param3, long param4, int param5, int param6, long param7, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, long param7, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPPV(int param0, int param1, int param2, long param3, int param4, float param5, float param6, int param7, long param8, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, int param7, long param8, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, long param6, int param7, int param8, float param9, long __functionAddress) { jni.callPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static void callBBBV(byte param0, byte param1, byte param2, long __functionAddress) { jni.callBBBV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callCCCV(short param0, short param1, short param2, long __functionAddress) { jni.callCCCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPJJV(long param0, long param1, long param2, long __functionAddress) { jni.callPJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPJPV(long param0, long param1, long param2, long __functionAddress) { jni.callPJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPPNV(long param0, long param1, long param2, long __functionAddress) { jni.callPPNV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callPPPV(long param0, long param1, long param2, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callSSSV(short param0, short param1, short param2, long __functionAddress) { jni.callSSSV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callUUUV(byte param0, byte param1, byte param2, long __functionAddress) { jni.callUUUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static void callJJJV(int param0, long param1, long param2, long param3, long __functionAddress) { jni.callJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPJJV(long param0, long param1, long param2, int param3, long __functionAddress) { jni.callPJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPJPV(long param0, long param1, int param2, long param3, long __functionAddress) { jni.callPJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPPV(int param0, long param1, long param2, long param3, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPPV(long param0, int param1, long param2, long param3, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPPV(long param0, long param1, int param2, long param3, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPPV(long param0, long param1, long param2, int param3, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callSSSV(int param0, short param1, short param2, short param3, long __functionAddress) { jni.callSSSV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callJJJV(int param0, int param1, long param2, long param3, long param4, long __functionAddress) { jni.callJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPJJV(long param0, int param1, long param2, long param3, int param4, long __functionAddress) { jni.callPJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPJJV(long param0, long param1, long param2, int param3, int param4, long __functionAddress) { jni.callPJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPPV(int param0, int param1, long param2, long param3, long param4, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPPV(int param0, long param1, int param2, long param3, long param4, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPPV(int param0, long param1, long param2, int param3, long param4, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPPV(int param0, long param1, long param2, long param3, int param4, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPPV(long param0, int param1, int param2, long param3, long param4, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPPV(long param0, int param1, long param2, int param3, long param4, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPJPV(long param0, int param1, long param2, int param3, int param4, long param5, long __functionAddress) { jni.callPJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPJPV(long param0, long param1, int param2, int param3, int param4, long param5, long __functionAddress) { jni.callPJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPJV(int param0, long param1, long param2, int param3, long param4, boolean param5, long __functionAddress) { jni.callPPJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPJV(long param0, int param1, long param2, int param3, long param4, int param5, long __functionAddress) { jni.callPPJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPPV(int param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPPV(int param0, int param1, long param2, int param3, long param4, long param5, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPPV(int param0, long param1, int param2, long param3, int param4, long param5, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPJJV(long param0, int param1, int param2, long param3, long param4, int param5, int param6, long __functionAddress) { jni.callPJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPPV(int param0, int param1, int param2, int param3, long param4, long param5, long param6, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPPV(int param0, int param1, long param2, long param3, int param4, int param5, long param6, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPPV(long param0, int param1, long param2, int param3, int param4, int param5, long param6, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPPV(int param0, int param1, int param2, int param3, long param4, int param5, long param6, long param7, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPPPV(long param0, int param1, int param2, int param3, int param4, int param5, long param6, long param7, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPPPV(long param0, long param1, int param2, int param3, int param4, int param5, int param6, int param7, long param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, long __functionAddress) { jni.callPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17); }
    public static void callBBBBV(byte param0, byte param1, byte param2, byte param3, long __functionAddress) { jni.callBBBBV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callCCCCV(short param0, short param1, short param2, short param3, long __functionAddress) { jni.callCCCCV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPJJJV(long param0, long param1, long param2, long param3, long __functionAddress) { jni.callPJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPJJPV(long param0, long param1, long param2, long param3, long __functionAddress) { jni.callPJJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPJPPV(long param0, long param1, long param2, long param3, long __functionAddress) { jni.callPJPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPPNV(long param0, long param1, long param2, long param3, long __functionAddress) { jni.callPPPNV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callPPPPV(long param0, long param1, long param2, long param3, long __functionAddress) { jni.callPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callSSSSV(short param0, short param1, short param2, short param3, long __functionAddress) { jni.callSSSSV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callUUUUV(byte param0, byte param1, byte param2, byte param3, long __functionAddress) { jni.callUUUUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static void callJJJJV(int param0, long param1, long param2, long param3, long param4, long __functionAddress) { jni.callJJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPJJJV(long param0, long param1, long param2, long param3, int param4, long __functionAddress) { jni.callPJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPJJPV(long param0, int param1, long param2, long param3, long param4, long __functionAddress) { jni.callPJJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPJJPV(long param0, long param1, long param2, int param3, long param4, long __functionAddress) { jni.callPJJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPPPV(long param0, int param1, long param2, long param3, long param4, long __functionAddress) { jni.callPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPPPV(long param0, long param1, long param2, long param3, int param4, long __functionAddress) { jni.callPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callSSSSV(int param0, short param1, short param2, short param3, short param4, long __functionAddress) { jni.callSSSSV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callUUUUV(int param0, byte param1, byte param2, byte param3, byte param4, long __functionAddress) { jni.callUUUUV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callJJJJV(int param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { jni.callJJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPJJJV(long param0, long param1, long param2, long param3, int param4, int param5, long __functionAddress) { jni.callPJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPJJPV(long param0, long param1, int param2, long param3, int param4, long param5, long __functionAddress) { jni.callPJJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPJJPV(long param0, long param1, long param2, int param3, int param4, long param5, long __functionAddress) { jni.callPJJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPJPPV(long param0, long param1, int param2, long param3, int param4, long param5, long __functionAddress) { jni.callPJPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPPPV(int param0, long param1, int param2, long param3, long param4, long param5, long __functionAddress) { jni.callPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPPPV(int param0, long param1, long param2, long param3, long param4, int param5, long __functionAddress) { jni.callPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPPPV(long param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress) { jni.callPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPJJPV(long param0, long param1, int param2, int param3, long param4, int param5, long param6, long __functionAddress) { jni.callPJJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPJJPV(long param0, long param1, int param2, long param3, int param4, int param5, long param6, long __functionAddress) { jni.callPJJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPJPPV(long param0, int param1, long param2, int param3, int param4, long param5, long param6, long __functionAddress) { jni.callPJPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPPPV(int param0, int param1, int param2, long param3, long param4, long param5, long param6, long __functionAddress) { jni.callPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPPPV(int param0, int param1, long param2, long param3, long param4, long param5, int param6, long __functionAddress) { jni.callPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPJJPV(long param0, long param1, int param2, long param3, int param4, int param5, long param6, int param7, long __functionAddress) { jni.callPJJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPJPPV(long param0, int param1, long param2, int param3, int param4, long param5, int param6, long param7, long __functionAddress) { jni.callPJPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPPPPV(long param0, int param1, int param2, int param3, int param4, long param5, int param6, long param7, int param8, long param9, long __functionAddress) { jni.callPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9); }
    public static void callPJJJPV(long param0, long param1, long param2, long param3, long param4, long __functionAddress) { jni.callPJJJPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4); }
    public static void callPPPPPV(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress) { jni.callPPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPJJJJV(long param0, long param1, long param2, long param3, long param4, int param5, int param6, long __functionAddress) { jni.callPJJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPPPPV(int param0, int param1, long param2, long param3, long param4, long param5, long param6, long __functionAddress) { jni.callPPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPPPPPV(long param0, int param1, int param2, long param3, long param4, long param5, long param6, long __functionAddress) { jni.callPPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6); }
    public static void callPJJJJV(long param0, long param1, int param2, int param3, long param4, long param5, long param6, int param7, long __functionAddress) { jni.callPJJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPJPPPV(long param0, int param1, int param2, long param3, long param4, int param5, long param6, long param7, long __functionAddress) { jni.callPJPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPPPPPV(long param0, long param1, long param2, long param3, long param4, int param5, int param6, int param7, long __functionAddress) { jni.callPPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPPPPPV(long param0, int param1, long param2, int param3, int param4, int param5, long param6, int param7, long param8, int param9, long param10, long __functionAddress) { jni.callPPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static void callPPPPPJV(long param0, long param1, long param2, long param3, long param4, long param5, long __functionAddress) { jni.callPPPPPJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5); }
    public static void callPPPPPPV(long param0, long param1, long param2, int param3, int param4, long param5, long param6, long param7, long __functionAddress) { jni.callPPPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }
    public static void callPPPPPPPV(int param0, int param1, int param2, long param3, int param4, long param5, long param6, long param7, long param8, long param9, long param10, long __functionAddress) { jni.callPPPPPPPV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10); }
    public static void callPPJJJJJJV(long param0, long param1, long param2, long param3, int param4, long param5, long param6, long param7, long param8, long __functionAddress) { jni.callPPJJJJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8); }
    public static void callPJJJJJJJJJJJV(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, long param10, long param11, int param12, int param13, int param14, long __functionAddress) { jni.callPJJJJJJJJJJJV(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14); }
    public static boolean callZ(int param0, long __functionAddress) { return jni.callZ(MemorySegment.ofAddress(__functionAddress), param0); }
    public static boolean callZ(int param0, int param1, long __functionAddress) { return jni.callZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean callZ(int param0, float param1, float param2, long __functionAddress) { return jni.callZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean callZ(int param0, int param1, float param2, float param3, long __functionAddress) { return jni.callZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3); }
    public static boolean callJZ(long param0, long __functionAddress) { return jni.callJZ(MemorySegment.ofAddress(__functionAddress), param0); }
    public static boolean callPZ(long param0, long __functionAddress) { return jni.callPZ(MemorySegment.ofAddress(__functionAddress), param0); }
    public static boolean callJZ(int param0, long param1, long __functionAddress) { return jni.callJZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean callPZ(int param0, long param1, long __functionAddress) { return jni.callPZ(MemorySegment.ofAddress(__functionAddress), param0, param1); }
    public static boolean callJZ(int param0, long param1, int param2, long __functionAddress) { return jni.callJZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean callPPZ(int param0, long param1, long param2, long __functionAddress) { return jni.callPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2); }
    public static boolean callPPPPZ(int param0, int param1, int param2, float param3, long param4, long param5, long param6, long param7, long __functionAddress) { return jni.callPPPPZ(MemorySegment.ofAddress(__functionAddress), param0, param1, param2, param3, param4, param5, param6, param7); }

    // Array API

    public static native short invokeUPC(byte param0, short @Nullable [] param1, boolean param2, long __functionAddress);
    public static native short invokeCPCC(short param0, short @Nullable [] param1, short param2, long __functionAddress);
    public static native int invokeCPI(short param0, int @Nullable [] param1, long __functionAddress);
    public static native int invokePCI(float @Nullable [] param0, short param1, long __functionAddress);
    public static native int invokePPI(int param0, long param1, int @Nullable [] param2, long __functionAddress);
    public static native int invokePPI(int param0, int @Nullable [] param1, int param2, int @Nullable [] param3, int param4, boolean param5, long __functionAddress);
    public static native int invokePPI(int param0, short @Nullable [] param1, int param2, short @Nullable [] param3, int param4, boolean param5, long __functionAddress);
    public static native int invokeCPUI(short param0, float @Nullable [] param1, byte param2, long __functionAddress);
    public static native int invokeCPUI(short param0, int @Nullable [] param1, byte param2, long __functionAddress);
    public static native int invokeCPUI(short param0, short @Nullable [] param1, byte param2, long __functionAddress);
    public static native int invokePPCI(long param0, float @Nullable [] param1, short param2, long __functionAddress);
    public static native int invokePPPI(int @Nullable [] param0, long param1, long param2, int param3, boolean param4, float param5, long __functionAddress);
    public static native int invokePPPI(short @Nullable [] param0, long param1, long param2, int param3, boolean param4, float param5, long __functionAddress);
    public static native int invokePPPPI(long param0, long param1, long param2, long @Nullable [] param3, long __functionAddress);
    public static native int invokePPPPI(long param0, long param1, int param2, int param3, float @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native int invokePPPPI(long param0, long param1, int param2, int param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native int invokePPPPPI(long param0, int @Nullable [] param1, int @Nullable [] param2, int @Nullable [] param3, long param4, long __functionAddress);
    public static native int invokePNNPPPI(long param0, long param1, long param2, int param3, int param4, int @Nullable [] param5, int @Nullable [] param6, long param7, long __functionAddress);
    public static native int invokePPPPPPI(int param0, int param1, int @Nullable [] param2, int @Nullable [] param3, int @Nullable [] param4, int @Nullable [] param5, int @Nullable [] param6, long param7, long __functionAddress);
    public static native int invokePPPPPPPI(long param0, int param1, int param2, int @Nullable [] param3, int @Nullable [] param4, int @Nullable [] param5, int @Nullable [] param6, int @Nullable [] param7, long param8, long __functionAddress);
    public static native int invokePPPPPPPPI(long param0, int param1, int param2, long param3, int @Nullable [] param4, int @Nullable [] param5, float @Nullable [] param6, int @Nullable [] param7, int @Nullable [] param8, int @Nullable [] param9, long __functionAddress);
    public static native long invokePP(double @Nullable [] param0, int param1, long __functionAddress);
    public static native long invokePP(float @Nullable [] param0, int param1, long __functionAddress);
    public static native long invokePP(int @Nullable [] param0, int param1, long __functionAddress);
    public static native long invokePP(long @Nullable [] param0, int param1, long __functionAddress);
    public static native long invokePP(short @Nullable [] param0, int param1, long __functionAddress);
    public static native long invokePPP(long param0, int @Nullable [] param1, long __functionAddress);
    public static native byte invokeUPU(byte param0, int @Nullable [] param1, long __functionAddress);
    public static native void invokePV(int param0, double @Nullable [] param1, long __functionAddress);
    public static native void invokePV(int param0, float @Nullable [] param1, long __functionAddress);
    public static native void invokePV(int param0, int @Nullable [] param1, long __functionAddress);
    public static native void invokePV(int param0, int param1, double @Nullable [] param2, long __functionAddress);
    public static native void invokePV(int param0, int param1, float @Nullable [] param2, long __functionAddress);
    public static native void invokePV(int param0, int param1, int @Nullable [] param2, long __functionAddress);
    public static native void invokePV(int param0, int param1, long @Nullable [] param2, long __functionAddress);
    public static native void invokePV(int param0, int @Nullable [] param1, boolean param2, long __functionAddress);
    public static native void invokePV(int param0, int param1, float @Nullable [] param2, int param3, int param4, long __functionAddress);
    public static native void invokePV(int param0, int param1, int @Nullable [] param2, int param3, int param4, long __functionAddress);
    public static native void invokePV(int param0, int param1, short @Nullable [] param2, int param3, int param4, long __functionAddress);
    public static native void invokePV(int param0, int param1, int param2, int param3, int param4, double @Nullable [] param5, long __functionAddress);
    public static native void invokePV(int param0, int param1, int param2, int param3, int param4, float @Nullable [] param5, long __functionAddress);
    public static native void invokePV(int param0, int param1, int param2, int param3, int param4, int @Nullable [] param5, long __functionAddress);
    public static native void invokePV(int param0, int param1, int param2, int param3, int param4, short @Nullable [] param5, long __functionAddress);
    public static native void invokePV(int param0, int param1, int param2, int param3, int @Nullable [] param4, boolean param5, long __functionAddress);
    public static native void invokePV(int param0, int param1, int param2, int param3, int param4, int param5, double @Nullable [] param6, long __functionAddress);
    public static native void invokePV(int param0, int param1, int param2, int param3, int param4, int param5, float @Nullable [] param6, long __functionAddress);
    public static native void invokePV(int param0, int param1, int param2, int param3, int param4, int param5, int @Nullable [] param6, long __functionAddress);
    public static native void invokePV(int param0, int param1, int param2, int param3, int param4, int param5, short @Nullable [] param6, long __functionAddress);
    public static native void invokeUPV(byte param0, float @Nullable [] param1, long __functionAddress);
    public static native void invokePJV(int param0, int @Nullable [] param1, long param2, long __functionAddress);
    public static native void invokePPV(long param0, int param1, double @Nullable [] param2, long __functionAddress);
    public static native void invokePPV(long param0, int param1, float @Nullable [] param2, long __functionAddress);
    public static native void invokePPV(long param0, int param1, int @Nullable [] param2, long __functionAddress);
    public static native void invokePPV(long param0, float @Nullable [] param1, int param2, long __functionAddress);
    public static native void invokePPV(long param0, int @Nullable [] param1, int param2, long __functionAddress);
    public static native void invokePPV(long param0, short @Nullable [] param1, int param2, long __functionAddress);
    public static native void invokePPV(long param0, int param1, int param2, double @Nullable [] param3, long __functionAddress);
    public static native void invokePPV(long param0, int param1, int param2, float @Nullable [] param3, long __functionAddress);
    public static native void invokePPV(long param0, int param1, int param2, int @Nullable [] param3, long __functionAddress);
    public static native void invokePPV(long param0, int param1, int param2, long @Nullable [] param3, long __functionAddress);
    public static native void invokePPV(long param0, int param1, int @Nullable [] param2, boolean param3, long __functionAddress);
    public static native void invokePPV(int param0, int param1, int param2, int @Nullable [] param3, long param4, long __functionAddress);
    public static native void invokePPV(long param0, int param1, int param2, float @Nullable [] param3, int param4, int param5, long __functionAddress);
    public static native void invokePPV(long param0, int param1, int param2, int @Nullable [] param3, int param4, int param5, long __functionAddress);
    public static native void invokePPV(long param0, int param1, int param2, short @Nullable [] param3, int param4, int param5, long __functionAddress);
    public static native void invokePPV(long param0, int param1, int param2, int param3, int param4, int @Nullable [] param5, boolean param6, long __functionAddress);
    public static native void invokeCCPV(short param0, short param1, short @Nullable [] param2, long __functionAddress);
    public static native void invokeCPCV(short param0, double @Nullable [] param1, short param2, long __functionAddress);
    public static native void invokeCPCV(short param0, float @Nullable [] param1, short param2, long __functionAddress);
    public static native void invokeCPCV(short param0, int @Nullable [] param1, short param2, long __functionAddress);
    public static native void invokeCPCV(short param0, long @Nullable [] param1, short param2, long __functionAddress);
    public static native void invokeCPCV(short param0, short @Nullable [] param1, short param2, long __functionAddress);
    public static native void invokeCPPV(short param0, float @Nullable [] param1, float @Nullable [] param2, long __functionAddress);
    public static native void invokePNPV(long param0, long param1, short @Nullable [] param2, long __functionAddress);
    public static native void invokePPPV(long param0, double @Nullable [] param1, double @Nullable [] param2, long __functionAddress);
    public static native void invokePPPV(long param0, float @Nullable [] param1, float @Nullable [] param2, long __functionAddress);
    public static native void invokePPPV(long param0, int @Nullable [] param1, int @Nullable [] param2, long __functionAddress);
    public static native void invokePPPV(int @Nullable [] param0, int @Nullable [] param1, int @Nullable [] param2, long __functionAddress);
    public static native void invokePPJV(long param0, int param1, int @Nullable [] param2, long param3, long __functionAddress);
    public static native void invokePPPV(int param0, float @Nullable [] param1, float @Nullable [] param2, float @Nullable [] param3, long __functionAddress);
    public static native void invokePPPV(int param0, int @Nullable [] param1, int @Nullable [] param2, int @Nullable [] param3, long __functionAddress);
    public static native void invokePPPV(int param0, int param1, double @Nullable [] param2, double @Nullable [] param3, double @Nullable [] param4, long __functionAddress);
    public static native void invokePPPV(int param0, int param1, float @Nullable [] param2, float @Nullable [] param3, float @Nullable [] param4, long __functionAddress);
    public static native void invokePPPV(int param0, int param1, int @Nullable [] param2, int @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native void invokePPPV(int param0, int param1, long @Nullable [] param2, long @Nullable [] param3, long @Nullable [] param4, long __functionAddress);
    public static native void invokePPPV(float @Nullable [] param0, int param1, long param2, long param3, int param4, long __functionAddress);
    public static native void invokePPPV(long param0, int param1, int param2, int param3, int @Nullable [] param4, long param5, long __functionAddress);
    public static native void invokePPPV(float @Nullable [] param0, boolean param1, int param2, long param3, long param4, int param5, long __functionAddress);
    public static native void invokeCCPCV(short param0, short param1, double @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokeCCPCV(short param0, short param1, float @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokeCCPCV(short param0, short param1, int @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokeCCPCV(short param0, short param1, long @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokeCCPCV(short param0, short param1, short @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokePCPCV(long param0, short param1, double @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokePCPCV(long param0, short param1, float @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokePCPCV(long param0, short param1, int @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokePCPCV(long param0, short param1, long @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokePCPCV(long param0, short param1, short @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokePNPPV(long param0, long param1, long param2, short @Nullable [] param3, long __functionAddress);
    public static native void invokePPPPV(long param0, int param1, float @Nullable [] param2, float @Nullable [] param3, float @Nullable [] param4, long __functionAddress);
    public static native void invokePPPPV(long param0, int param1, int @Nullable [] param2, int @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native void invokePPPPV(long param0, int param1, int param2, double @Nullable [] param3, double @Nullable [] param4, double @Nullable [] param5, long __functionAddress);
    public static native void invokePPPPV(long param0, int param1, int param2, float @Nullable [] param3, float @Nullable [] param4, float @Nullable [] param5, long __functionAddress);
    public static native void invokePPPPV(long param0, int param1, int param2, int @Nullable [] param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native void invokePPPPV(long param0, int param1, int param2, long @Nullable [] param3, long @Nullable [] param4, long @Nullable [] param5, long __functionAddress);
    public static native void invokePPPPPV(long param0, long param1, long param2, float @Nullable [] param3, long param4, long __functionAddress);
    public static native void invokePPPPPV(long param0, int @Nullable [] param1, int @Nullable [] param2, int @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native void invokePPPPPV(long param0, int param1, long param2, int @Nullable [] param3, long param4, long param5, long __functionAddress);
    public static native void invokePPPPPV(int param0, long param1, int param2, float @Nullable [] param3, float @Nullable [] param4, long param5, int param6, long param7, int param8, boolean param9, long __functionAddress);
    public static native void invokePPPPPV(int param0, int @Nullable [] param1, int param2, float @Nullable [] param3, float @Nullable [] param4, long param5, int param6, int @Nullable [] param7, int param8, boolean param9, long __functionAddress);
    public static native void invokePPPPPV(int param0, short @Nullable [] param1, int param2, float @Nullable [] param3, float @Nullable [] param4, long param5, int param6, short @Nullable [] param7, int param8, boolean param9, long __functionAddress);
    public static native boolean invokePZ(int param0, int @Nullable [] param1, boolean param2, long __functionAddress);
    public static native boolean invokePPZ(long param0, int @Nullable [] param1, long __functionAddress);
    public static native boolean invokePPPZ(long param0, long param1, int @Nullable [] param2, long __functionAddress);
    public static native int callPI(int @Nullable [] param0, long __functionAddress);
    public static native int callPI(int param0, int @Nullable [] param1, long __functionAddress);
    public static native int callPI(int @Nullable [] param0, int param1, long __functionAddress);
    public static native int callPI(int param0, int param1, int @Nullable [] param2, long __functionAddress);
    public static native int callPI(int param0, int @Nullable [] param1, int param2, long __functionAddress);
    public static native int callPI(int param0, int param1, int param2, int @Nullable [] param3, long __functionAddress);
    public static native int callPI(int param0, int param1, int param2, int param3, float @Nullable [] param4, long __functionAddress);
    public static native int callPI(int param0, int param1, int param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native int callPPI(long param0, int @Nullable [] param1, long __functionAddress);
    public static native int callPPI(long param0, long @Nullable [] param1, long __functionAddress);
    public static native int callPPI(int @Nullable [] param0, long param1, long __functionAddress);
    public static native int callPPI(int param0, long param1, int @Nullable [] param2, long __functionAddress);
    public static native int callPPI(long param0, int param1, double @Nullable [] param2, long __functionAddress);
    public static native int callPPI(long param0, int param1, float @Nullable [] param2, long __functionAddress);
    public static native int callPPI(long param0, int param1, int @Nullable [] param2, long __functionAddress);
    public static native int callPPI(long param0, int param1, long @Nullable [] param2, long __functionAddress);
    public static native int callPPI(long param0, int param1, short @Nullable [] param2, long __functionAddress);
    public static native int callPPI(long param0, long @Nullable [] param1, int param2, long __functionAddress);
    public static native int callPPI(long param0, int param1, int param2, int @Nullable [] param3, long __functionAddress);
    public static native int callPPI(long param0, int param1, int param2, long @Nullable [] param3, long __functionAddress);
    public static native int callPPI(int param0, long param1, int param2, int param3, float param4, int @Nullable [] param5, long __functionAddress);
    public static native int callPJPI(long param0, long param1, int @Nullable [] param2, long __functionAddress);
    public static native int callPJPI(long param0, long param1, long @Nullable [] param2, long __functionAddress);
    public static native int callPPPI(long param0, long param1, int @Nullable [] param2, long __functionAddress);
    public static native int callPPPI(long param0, long param1, long @Nullable [] param2, long __functionAddress);
    public static native int callPPPI(long param0, int @Nullable [] param1, long param2, long __functionAddress);
    public static native int callPPPI(long param0, int @Nullable [] param1, int @Nullable [] param2, long __functionAddress);
    public static native int callPPPI(long param0, long @Nullable [] param1, long @Nullable [] param2, long __functionAddress);
    public static native int callPPPI(int @Nullable [] param0, long param1, int @Nullable [] param2, long __functionAddress);
    public static native int callPJPI(long param0, int param1, long param2, int @Nullable [] param3, long __functionAddress);
    public static native int callPJPI(long param0, long param1, int param2, long @Nullable [] param3, long __functionAddress);
    public static native int callPPPI(int param0, long param1, int @Nullable [] param2, long param3, long __functionAddress);
    public static native int callPPPI(long param0, int param1, long param2, double @Nullable [] param3, long __functionAddress);
    public static native int callPPPI(long param0, int param1, long param2, float @Nullable [] param3, long __functionAddress);
    public static native int callPPPI(long param0, int param1, long param2, int @Nullable [] param3, long __functionAddress);
    public static native int callPPPI(long param0, int param1, long param2, long @Nullable [] param3, long __functionAddress);
    public static native int callPPPI(long param0, int param1, long param2, short @Nullable [] param3, long __functionAddress);
    public static native int callPPPI(long param0, int param1, int @Nullable [] param2, long param3, long __functionAddress);
    public static native int callPPPI(long param0, int param1, int @Nullable [] param2, int @Nullable [] param3, long __functionAddress);
    public static native int callPPPI(long param0, int param1, int @Nullable [] param2, long @Nullable [] param3, long __functionAddress);
    public static native int callPPPI(long param0, int param1, long @Nullable [] param2, long param3, long __functionAddress);
    public static native int callPPPI(long param0, long param1, int param2, int @Nullable [] param3, long __functionAddress);
    public static native int callPPPI(long param0, long param1, int param2, long @Nullable [] param3, long __functionAddress);
    public static native int callPPPI(long param0, long param1, int @Nullable [] param2, int param3, long __functionAddress);
    public static native int callPPJI(long param0, int param1, long @Nullable [] param2, int param3, long param4, long __functionAddress);
    public static native int callPPPI(long param0, int param1, int param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native int callPPPI(long param0, int param1, int param2, int param3, int @Nullable [] param4, float @Nullable [] param5, long __functionAddress);
    public static native int callPPPI(long param0, int param1, int param2, int param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native int callPJPPI(long param0, long param1, long param2, int @Nullable [] param3, long __functionAddress);
    public static native int callPJPPI(long param0, long param1, long param2, long @Nullable [] param3, long __functionAddress);
    public static native int callPJPPI(long param0, long param1, int @Nullable [] param2, long param3, long __functionAddress);
    public static native int callPJPPI(long param0, long param1, int @Nullable [] param2, int @Nullable [] param3, long __functionAddress);
    public static native int callPJPPI(long param0, long param1, int @Nullable [] param2, long @Nullable [] param3, long __functionAddress);
    public static native int callPPNPI(long param0, long param1, long param2, long @Nullable [] param3, long __functionAddress);
    public static native int callPPPPI(long param0, long param1, long param2, long @Nullable [] param3, long __functionAddress);
    public static native int callPPPPI(long param0, long param1, int @Nullable [] param2, long param3, long __functionAddress);
    public static native int callPPPPI(long param0, long param1, int @Nullable [] param2, int @Nullable [] param3, long __functionAddress);
    public static native int callPJPPI(long param0, long param1, int param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native int callPPPPI(long param0, int param1, long param2, long param3, long @Nullable [] param4, long __functionAddress);
    public static native int callPPPPI(long param0, int param1, long param2, int @Nullable [] param3, long param4, long __functionAddress);
    public static native int callPPPPI(long param0, int param1, long param2, long @Nullable [] param3, long param4, long __functionAddress);
    public static native int callPPPPI(long param0, int param1, long param2, long @Nullable [] param3, long @Nullable [] param4, long __functionAddress);
    public static native int callPPPPI(long param0, int param1, int @Nullable [] param2, long param3, long param4, long __functionAddress);
    public static native int callPPPPI(long param0, long param1, int param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native int callPPPPI(long param0, long param1, int param2, long @Nullable [] param3, long param4, long __functionAddress);
    public static native int callPPPPI(long param0, long param1, long param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native int callPPPPI(long param0, int @Nullable [] param1, long param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native int callPPPPI(long param0, long @Nullable [] param1, int param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native int callPJPPI(long param0, long param1, int param2, int param3, long param4, int @Nullable [] param5, long __functionAddress);
    public static native int callPJPPI(long param0, long param1, int param2, int param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native int callPPPPI(long param0, int param1, int param2, long param3, int @Nullable [] param4, long param5, long __functionAddress);
    public static native int callPPPPI(long param0, int param1, int param2, long param3, long @Nullable [] param4, long param5, long __functionAddress);
    public static native int callPPPPI(long param0, int param1, int param2, long @Nullable [] param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native int callPJPPI(long param0, long param1, int param2, int param3, int param4, long param5, int @Nullable [] param6, long __functionAddress);
    public static native int callPPPPI(long param0, int param1, long param2, int param3, int param4, long param5, int @Nullable [] param6, long __functionAddress);
    public static native int callPPPPI(int param0, int @Nullable [] param1, long @Nullable [] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20, int @Nullable [] param21, long @Nullable [] param22, long __functionAddress);
    public static native int callPJPPPI(long param0, long param1, long param2, long param3, long @Nullable [] param4, long __functionAddress);
    public static native int callPPJPPI(long param0, long param1, long param2, int @Nullable [] param3, long param4, long __functionAddress);
    public static native int callPPPPPI(long param0, long param1, int @Nullable [] param2, int @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native int callPPPPPI(long param0, long param1, int @Nullable [] param2, int @Nullable [] param3, long @Nullable [] param4, long __functionAddress);
    public static native int callPPPPPI(long param0, int @Nullable [] param1, int @Nullable [] param2, int @Nullable [] param3, long param4, long __functionAddress);
    public static native int callPJPPPI(long param0, long param1, int param2, long param3, long param4, long @Nullable [] param5, long __functionAddress);
    public static native int callPPPPPI(long param0, long param1, int param2, long param3, int @Nullable [] param4, long param5, long __functionAddress);
    public static native int callPPPPPI(long param0, long param1, int param2, long param3, long @Nullable [] param4, long param5, long __functionAddress);
    public static native int callPPPPPI(long param0, long param1, long param2, int @Nullable [] param3, int param4, int @Nullable [] param5, long __functionAddress);
    public static native int callPPPPPI(long param0, int @Nullable [] param1, float @Nullable [] param2, int param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native int callPPPPPI(int param0, int param1, int @Nullable [] param2, int @Nullable [] param3, int @Nullable [] param4, int @Nullable [] param5, long param6, long __functionAddress);
    public static native int callPPPPPI(long param0, int param1, long param2, long @Nullable [] param3, int param4, long param5, long param6, long __functionAddress);
    public static native int callPPPPPI(long param0, int param1, long @Nullable [] param2, int param3, long param4, long param5, long param6, long __functionAddress);
    public static native int callPJPPJI(long param0, long param1, int param2, int param3, long param4, int @Nullable [] param5, long param6, int param7, long __functionAddress);
    public static native int callPJPPJI(long param0, long param1, int param2, int param3, long param4, long @Nullable [] param5, long param6, int param7, long __functionAddress);
    public static native int callPJJJJPI(long param0, long param1, long param2, long param3, long param4, int @Nullable [] param5, long __functionAddress);
    public static native int callPPPPPPI(long param0, int @Nullable [] param1, int @Nullable [] param2, int @Nullable [] param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native int callPJJPPPI(long param0, long param1, long param2, int param3, long param4, long param5, long @Nullable [] param6, long __functionAddress);
    public static native int callPPPPPPI(long param0, long param1, long @Nullable [] param2, int param3, int @Nullable [] param4, int @Nullable [] param5, long param6, long __functionAddress);
    public static native int callPPPPPPI(int param0, int param1, int @Nullable [] param2, int @Nullable [] param3, int @Nullable [] param4, int @Nullable [] param5, int @Nullable [] param6, long param7, long __functionAddress);
    public static native int callPPPPPPPI(long param0, long param1, long param2, long param3, int param4, long param5, int @Nullable [] param6, long param7, long __functionAddress);
    public static native int callPPPPPPPI(long param0, long param1, float @Nullable [] param2, long param3, long param4, int param5, long param6, long param7, long __functionAddress);
    public static native int callPPPPPPPI(long param0, long param1, int @Nullable [] param2, long param3, long param4, int param5, long param6, long param7, long __functionAddress);
    public static native int callPPPPPPPI(long param0, long param1, int param2, long param3, long param4, double @Nullable [] param5, int param6, long param7, long param8, long __functionAddress);
    public static native int callPPPPPPPI(long param0, long param1, int param2, long param3, long param4, float @Nullable [] param5, int param6, long param7, long param8, long __functionAddress);
    public static native int callPPPPPPPI(long param0, long param1, int param2, long param3, long param4, int @Nullable [] param5, int param6, long param7, long param8, long __functionAddress);
    public static native int callPPPPPPPI(long param0, long param1, int param2, long param3, long param4, short @Nullable [] param5, int param6, long param7, long param8, long __functionAddress);
    public static native int callPPJPPPPPI(long param0, long @Nullable [] param1, long param2, long param3, long param4, int param5, long param6, long param7, long param8, long __functionAddress);
    public static native int callPPJPPPPPI(long param0, long @Nullable [] param1, long param2, long param3, long param4, int param5, long param6, int @Nullable [] param7, long param8, long __functionAddress);
    public static native int callPPPPPPPPPI(long param0, long param1, long @Nullable [] param2, long param3, long param4, long param5, int param6, int @Nullable [] param7, int @Nullable [] param8, long param9, long __functionAddress);
    public static native int callPPPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long param6, double @Nullable [] param7, int param8, long param9, long param10, long __functionAddress);
    public static native int callPPPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long param6, float @Nullable [] param7, int param8, long param9, long param10, long __functionAddress);
    public static native int callPPPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long param6, int @Nullable [] param7, int param8, long param9, long param10, long __functionAddress);
    public static native int callPPPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long param6, short @Nullable [] param7, int param8, long param9, long param10, long __functionAddress);
    public static native int callPPPPPPPPPPI(long param0, long param1, long @Nullable [] param2, long param3, long param4, long param5, long param6, int param7, int @Nullable [] param8, int @Nullable [] param9, long param10, long __functionAddress);
    public static native int callPPPPPPPPPPI(long param0, long param1, long @Nullable [] param2, long param3, float @Nullable [] param4, long param5, long param6, int param7, int @Nullable [] param8, int @Nullable [] param9, long param10, long __functionAddress);
    public static native int callPPPPPPPPPPI(long param0, long param1, long @Nullable [] param2, long param3, int @Nullable [] param4, long param5, long param6, int param7, int @Nullable [] param8, int @Nullable [] param9, long param10, long __functionAddress);
    public static native int callPPPPPPPPPPI(long param0, long param1, long @Nullable [] param2, long param3, int param4, long param5, long param6, long param7, int param8, int @Nullable [] param9, int @Nullable [] param10, long param11, long __functionAddress);
    public static native int callPPPPPPPPPPPI(long param0, long param1, long @Nullable [] param2, long param3, long param4, long param5, long param6, long param7, int param8, int @Nullable [] param9, int @Nullable [] param10, long param11, long __functionAddress);
    public static native int callPPPPPPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, double @Nullable [] param10, int param11, long param12, long param13, long __functionAddress);
    public static native int callPPPPPPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, float @Nullable [] param10, int param11, long param12, long param13, long __functionAddress);
    public static native int callPPPPPPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, int @Nullable [] param10, int param11, long param12, long param13, long __functionAddress);
    public static native int callPPPPPPPPPPPPI(long param0, long param1, int param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, short @Nullable [] param10, int param11, long param12, long param13, long __functionAddress);
    public static native int callPPPPPPPPPPPPPPPI(long param0, long param1, long @Nullable [] param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, long param10, long param11, int param12, int @Nullable [] param13, int @Nullable [] param14, long param15, long __functionAddress);
    public static native long callPP(int @Nullable [] param0, long __functionAddress);
    public static native long callPPP(long param0, int @Nullable [] param1, long __functionAddress);
    public static native long callPPP(int param0, long param1, int @Nullable [] param2, long __functionAddress);
    public static native long callPPP(long param0, int param1, int @Nullable [] param2, long __functionAddress);
    public static native long callPPP(int param0, int param1, int param2, int @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPPP(long param0, int param1, int param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPPPP(long param0, long param1, int @Nullable [] param2, long __functionAddress);
    public static native long callPPPP(long param0, long @Nullable [] param1, int @Nullable [] param2, long __functionAddress);
    public static native long callPJPP(long param0, long param1, int param2, int @Nullable [] param3, long __functionAddress);
    public static native long callPPPP(int param0, long param1, long @Nullable [] param2, int @Nullable [] param3, long __functionAddress);
    public static native long callPPPP(long param0, int param1, int @Nullable [] param2, long param3, long __functionAddress);
    public static native long callPPPP(long param0, long param1, int param2, int @Nullable [] param3, long __functionAddress);
    public static native long callPPPP(long param0, long param1, int param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPJPP(long param0, long param1, int param2, int param3, int param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPPJPP(long param0, long param1, long param2, int @Nullable [] param3, long __functionAddress);
    public static native long callPPNPP(long param0, long param1, long param2, int @Nullable [] param3, long __functionAddress);
    public static native long callPPPPP(long param0, long param1, long param2, int @Nullable [] param3, long __functionAddress);
    public static native long callPPPPP(long param0, long param1, long @Nullable [] param2, int @Nullable [] param3, long __functionAddress);
    public static native long callPJPPP(long param0, long param1, int param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPJPPP(long param0, long param1, int @Nullable [] param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPPPPP(long param0, int param1, long param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPPPPP(long param0, long param1, int param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPPPPP(long param0, long param1, long param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPPPPP(long param0, long @Nullable [] param1, long param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPJPPP(long param0, long param1, int param2, int param3, long param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPJPPPP(long param0, long param1, long param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPJPPPP(long param0, long param1, long param2, double @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPJPPPP(long param0, long param1, long param2, float @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPJPPPP(long param0, long param1, long param2, int @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPJPPPP(long param0, long param1, long param2, short @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native long callPPPPPP(long param0, int param1, long param2, long param3, long param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPPPPPP(long param0, long param1, long @Nullable [] param2, long param3, int param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPPPPPP(long param0, int param1, int param2, long param3, int param4, long param5, long param6, int @Nullable [] param7, long __functionAddress);
    public static native long callPJJPPPP(long param0, long param1, long param2, long param3, long param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPJJPPPP(long param0, long param1, long param2, long param3, double @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPJJPPPP(long param0, long param1, long param2, long param3, float @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPJJPPPP(long param0, long param1, long param2, long param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPJJPPPP(long param0, long param1, long param2, long param3, short @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPJPPPPP(long param0, long param1, long param2, long param3, long param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPJPPPPP(long param0, long param1, long param2, long param3, float @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPJPPPPP(long param0, long param1, long param2, long param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPJPPPPP(long param0, long param1, long param2, long param3, short @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPPJPPPP(long param0, long @Nullable [] param1, long param2, long param3, long param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPPJPPPP(long param0, long @Nullable [] param1, long param2, long param3, double @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPPJPPPP(long param0, long @Nullable [] param1, long param2, long param3, float @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPPJPPPP(long param0, long @Nullable [] param1, long param2, long param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPPJPPPP(long param0, long @Nullable [] param1, long param2, long param3, short @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPPPJPPP(long param0, long param1, long param2, long param3, long param4, int @Nullable [] param5, long __functionAddress);
    public static native long callPPPPPPP(long param0, int param1, long param2, long param3, long param4, int @Nullable [] param5, int @Nullable [] param6, long __functionAddress);
    public static native long callPPJPPPPP(long param0, long @Nullable [] param1, long param2, long param3, long param4, long param5, int @Nullable [] param6, long __functionAddress);
    public static native long callPPJPPPPP(long param0, long @Nullable [] param1, long param2, long param3, long param4, float @Nullable [] param5, int @Nullable [] param6, long __functionAddress);
    public static native long callPPJPPPPP(long param0, long @Nullable [] param1, long param2, long param3, long param4, int @Nullable [] param5, int @Nullable [] param6, long __functionAddress);
    public static native long callPPJPPPPP(long param0, long @Nullable [] param1, long param2, long param3, long param4, short @Nullable [] param5, int @Nullable [] param6, long __functionAddress);
    public static native long callPPPPPPPP(long param0, int param1, long param2, long param3, int param4, long param5, long param6, long param7, int @Nullable [] param8, long __functionAddress);
    public static native long callPPPPPPPP(int param0, int @Nullable [] param1, long @Nullable [] param2, int param3, int param4, int param5, int param6, long param7, long param8, long param9, int param10, int @Nullable [] param11, long @Nullable [] param12, long __functionAddress);
    public static native long callPJPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, int @Nullable [] param7, long __functionAddress);
    public static native long callPJPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, float @Nullable [] param6, int @Nullable [] param7, long __functionAddress);
    public static native long callPJPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, int @Nullable [] param6, int @Nullable [] param7, long __functionAddress);
    public static native long callPJPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, short @Nullable [] param6, int @Nullable [] param7, long __functionAddress);
    public static native long callPPJPPPPPP(long param0, long param1, int param2, long param3, long param4, long param5, int param6, long param7, long param8, int @Nullable [] param9, long __functionAddress);
    public static native long callPJPPPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, long param8, int @Nullable [] param9, long __functionAddress);
    public static native long callPJPPPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, float @Nullable [] param8, int @Nullable [] param9, long __functionAddress);
    public static native long callPJPPPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, int @Nullable [] param8, int @Nullable [] param9, long __functionAddress);
    public static native long callPJPPPPPPPPP(long param0, long param1, long param2, long param3, long param4, long param5, long param6, long param7, short @Nullable [] param8, int @Nullable [] param9, long __functionAddress);
    public static native long callPPJPPPPPPPP(long param0, long param1, int param2, long param3, long param4, long param5, long param6, long param7, int param8, long param9, long param10, int @Nullable [] param11, long __functionAddress);
    public static native void callPV(double @Nullable [] param0, long __functionAddress);
    public static native void callPV(float @Nullable [] param0, long __functionAddress);
    public static native void callPV(int @Nullable [] param0, long __functionAddress);
    public static native void callPV(short @Nullable [] param0, long __functionAddress);
    public static native void callPV(int param0, double @Nullable [] param1, long __functionAddress);
    public static native void callPV(int param0, float @Nullable [] param1, long __functionAddress);
    public static native void callPV(int param0, int @Nullable [] param1, long __functionAddress);
    public static native void callPV(int param0, long @Nullable [] param1, long __functionAddress);
    public static native void callPV(int param0, short @Nullable [] param1, long __functionAddress);
    public static native void callPV(int param0, int param1, double @Nullable [] param2, long __functionAddress);
    public static native void callPV(int param0, int param1, float @Nullable [] param2, long __functionAddress);
    public static native void callPV(int param0, int param1, int @Nullable [] param2, long __functionAddress);
    public static native void callPV(int param0, int param1, long @Nullable [] param2, long __functionAddress);
    public static native void callPV(int param0, int param1, short @Nullable [] param2, long __functionAddress);
    public static native void callPV(int param0, int @Nullable [] param1, int param2, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, double @Nullable [] param3, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, float @Nullable [] param3, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int @Nullable [] param3, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, long @Nullable [] param3, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, short @Nullable [] param3, long __functionAddress);
    public static native void callPV(int param0, int param1, boolean param2, double @Nullable [] param3, long __functionAddress);
    public static native void callPV(int param0, int param1, boolean param2, float @Nullable [] param3, long __functionAddress);
    public static native void callPV(int param0, int param1, boolean param2, int @Nullable [] param3, long __functionAddress);
    public static native void callPV(int param0, int param1, int @Nullable [] param2, int param3, long __functionAddress);
    public static native void callPV(int param0, int @Nullable [] param1, int param2, int param3, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, double @Nullable [] param4, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, float @Nullable [] param4, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, long @Nullable [] param4, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, short @Nullable [] param4, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, boolean param3, double @Nullable [] param4, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, boolean param3, float @Nullable [] param4, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int @Nullable [] param3, boolean param4, long __functionAddress);
    public static native void callPV(int param0, int param1, int @Nullable [] param2, int param3, int param4, long __functionAddress);
    public static native void callPV(int param0, boolean param1, int param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPV(int param0, double param1, double param2, int param3, int param4, double @Nullable [] param5, long __functionAddress);
    public static native void callPV(int param0, float param1, float param2, int param3, int param4, float @Nullable [] param5, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, double @Nullable [] param5, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, float @Nullable [] param5, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int @Nullable [] param5, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, short @Nullable [] param5, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int @Nullable [] param4, boolean param5, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, boolean param3, int param4, float @Nullable [] param5, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, boolean param3, int param4, int @Nullable [] param5, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, boolean param3, int param4, short @Nullable [] param5, long __functionAddress);
    public static native void callPV(int param0, int param1, double param2, double param3, int param4, int param5, double @Nullable [] param6, long __functionAddress);
    public static native void callPV(int param0, int param1, float param2, float param3, int param4, int param5, float @Nullable [] param6, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, double @Nullable [] param6, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, float @Nullable [] param6, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int @Nullable [] param6, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, short @Nullable [] param6, long __functionAddress);
    public static native void callPV(int param0, int param1, int @Nullable [] param2, int param3, int param4, int param5, int param6, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, double @Nullable [] param7, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, float @Nullable [] param7, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int @Nullable [] param7, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, short @Nullable [] param7, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, double @Nullable [] param8, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, float @Nullable [] param8, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int @Nullable [] param8, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, short @Nullable [] param8, long __functionAddress);
    public static native void callPV(int param0, double param1, double param2, int param3, int param4, double param5, double param6, int param7, int param8, double @Nullable [] param9, long __functionAddress);
    public static native void callPV(int param0, float param1, float param2, int param3, int param4, float param5, float param6, int param7, int param8, float @Nullable [] param9, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, double @Nullable [] param9, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, float @Nullable [] param9, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int @Nullable [] param9, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, short @Nullable [] param9, long __functionAddress);
    public static native void callPV(int param0, int param1, double param2, double param3, int param4, int param5, double param6, double param7, int param8, int param9, double @Nullable [] param10, long __functionAddress);
    public static native void callPV(int param0, int param1, float param2, float param3, int param4, int param5, float param6, float param7, int param8, int param9, float @Nullable [] param10, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, double @Nullable [] param10, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, float @Nullable [] param10, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int @Nullable [] param10, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, short @Nullable [] param10, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, double @Nullable [] param11, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, float @Nullable [] param11, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int @Nullable [] param11, long __functionAddress);
    public static native void callPV(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, short @Nullable [] param11, long __functionAddress);
    public static native void callPPV(long param0, float @Nullable [] param1, long __functionAddress);
    public static native void callPPV(long param0, int @Nullable [] param1, long __functionAddress);
    public static native void callPPV(double @Nullable [] param0, double @Nullable [] param1, long __functionAddress);
    public static native void callPPV(float @Nullable [] param0, float @Nullable [] param1, long __functionAddress);
    public static native void callPPV(int @Nullable [] param0, int @Nullable [] param1, long __functionAddress);
    public static native void callPPV(short @Nullable [] param0, short @Nullable [] param1, long __functionAddress);
    public static native void callPPV(int param0, long param1, int @Nullable [] param2, long __functionAddress);
    public static native void callPPV(int param0, int @Nullable [] param1, float @Nullable [] param2, long __functionAddress);
    public static native void callPPV(int param0, int @Nullable [] param1, int @Nullable [] param2, long __functionAddress);
    public static native void callPPV(int param0, int @Nullable [] param1, long @Nullable [] param2, long __functionAddress);
    public static native void callPPV(long param0, int param1, float @Nullable [] param2, long __functionAddress);
    public static native void callPPV(long param0, int param1, int @Nullable [] param2, long __functionAddress);
    public static native void callPPV(int @Nullable [] param0, int param1, int @Nullable [] param2, long __functionAddress);
    public static native void callPPV(int param0, int param1, long param2, int @Nullable [] param3, long __functionAddress);
    public static native void callPPV(int param0, int param1, int @Nullable [] param2, long param3, long __functionAddress);
    public static native void callPPV(int param0, int param1, int @Nullable [] param2, float @Nullable [] param3, long __functionAddress);
    public static native void callPPV(int param0, int param1, int @Nullable [] param2, int @Nullable [] param3, long __functionAddress);
    public static native void callPPV(int param0, int param1, int @Nullable [] param2, long @Nullable [] param3, long __functionAddress);
    public static native void callPPV(int param0, long param1, int param2, int @Nullable [] param3, long __functionAddress);
    public static native void callPPV(int param0, long param1, double @Nullable [] param2, int param3, long __functionAddress);
    public static native void callPPV(int param0, long param1, float @Nullable [] param2, int param3, long __functionAddress);
    public static native void callPPV(int param0, long param1, int @Nullable [] param2, int param3, long __functionAddress);
    public static native void callPPV(int param0, long param1, long @Nullable [] param2, int param3, long __functionAddress);
    public static native void callPPV(int param0, long param1, short @Nullable [] param2, int param3, long __functionAddress);
    public static native void callPPV(int param0, int @Nullable [] param1, int @Nullable [] param2, int param3, long __functionAddress);
    public static native void callPPV(int param0, long @Nullable [] param1, int @Nullable [] param2, int param3, long __functionAddress);
    public static native void callPPV(long param0, int param1, int param2, int @Nullable [] param3, long __functionAddress);
    public static native void callPPV(int param0, int param1, int param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPPV(int param0, int param1, int param2, int @Nullable [] param3, long param4, long __functionAddress);
    public static native void callPPV(int param0, int param1, int param2, int @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPPV(int param0, int param1, long param2, int @Nullable [] param3, int param4, long __functionAddress);
    public static native void callPPV(int param0, int param1, int @Nullable [] param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPPV(int param0, int @Nullable [] param1, int param2, long param3, int param4, long __functionAddress);
    public static native void callPPV(int param0, int @Nullable [] param1, int param2, int @Nullable [] param3, int param4, long __functionAddress);
    public static native void callPPV(int param0, int @Nullable [] param1, long param2, int param3, int param4, long __functionAddress);
    public static native void callPPV(long param0, int param1, int param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPPV(int param0, int param1, int param2, int param3, int @Nullable [] param4, long param5, long __functionAddress);
    public static native void callPPV(int param0, int param1, int param2, int @Nullable [] param3, int @Nullable [] param4, int param5, long __functionAddress);
    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, float @Nullable [] param5, long __functionAddress);
    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, short @Nullable [] param5, long __functionAddress);
    public static native void callPPV(int param0, int param1, int @Nullable [] param2, long param3, int param4, int param5, long __functionAddress);
    public static native void callPPV(int param0, int param1, int param2, long param3, int param4, int param5, float @Nullable [] param6, long __functionAddress);
    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, float @Nullable [] param6, long __functionAddress);
    public static native void callPPV(int param0, int param1, int param2, int param3, long param4, int param5, int param6, float @Nullable [] param7, long __functionAddress);
    public static native void callPPV(int param0, int param1, int param2, int param3, long param4, int param5, int param6, short @Nullable [] param7, long __functionAddress);
    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, float @Nullable [] param7, long __functionAddress);
    public static native void callPPV(int param0, int param1, int param2, long param3, int param4, float param5, float param6, int param7, float @Nullable [] param8, long __functionAddress);
    public static native void callPPV(int param0, int param1, long param2, int param3, int param4, int param5, int param6, int param7, float @Nullable [] param8, long __functionAddress);
    public static native void callPJPV(long param0, long param1, long @Nullable [] param2, long __functionAddress);
    public static native void callPPPV(long param0, long param1, int @Nullable [] param2, long __functionAddress);
    public static native void callPPPV(long param0, int @Nullable [] param1, long param2, long __functionAddress);
    public static native void callPJPV(long param0, long param1, int param2, long @Nullable [] param3, long __functionAddress);
    public static native void callPPPV(int param0, long param1, long param2, double @Nullable [] param3, long __functionAddress);
    public static native void callPPPV(int param0, long param1, long param2, float @Nullable [] param3, long __functionAddress);
    public static native void callPPPV(int param0, long param1, long param2, int @Nullable [] param3, long __functionAddress);
    public static native void callPPPV(int param0, long param1, long param2, long @Nullable [] param3, long __functionAddress);
    public static native void callPPPV(int param0, long param1, long param2, short @Nullable [] param3, long __functionAddress);
    public static native void callPPPV(long param0, int param1, int @Nullable [] param2, long param3, long __functionAddress);
    public static native void callPPPV(long param0, int param1, int @Nullable [] param2, long @Nullable [] param3, long __functionAddress);
    public static native void callPPPV(long param0, int param1, long @Nullable [] param2, long param3, long __functionAddress);
    public static native void callPPPV(long param0, long param1, int param2, int @Nullable [] param3, long __functionAddress);
    public static native void callPPPV(int param0, int param1, long param2, long param3, double @Nullable [] param4, long __functionAddress);
    public static native void callPPPV(int param0, int param1, long param2, long param3, float @Nullable [] param4, long __functionAddress);
    public static native void callPPPV(int param0, int param1, long param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPPPV(int param0, int param1, long param2, long param3, short @Nullable [] param4, long __functionAddress);
    public static native void callPPPV(int param0, int param1, int @Nullable [] param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPPPV(int param0, int param1, int @Nullable [] param2, int @Nullable [] param3, long param4, long __functionAddress);
    public static native void callPPPV(int param0, long param1, int param2, int @Nullable [] param3, long param4, long __functionAddress);
    public static native void callPPPV(int param0, long param1, int param2, int @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPPPV(int param0, int @Nullable [] param1, int @Nullable [] param2, int param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPPPV(long param0, int param1, int param2, int @Nullable [] param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPPPV(long param0, int param1, int param2, long @Nullable [] param3, long @Nullable [] param4, long __functionAddress);
    public static native void callPJPV(long param0, long param1, int param2, int param3, int param4, double @Nullable [] param5, long __functionAddress);
    public static native void callPJPV(long param0, long param1, int param2, int param3, int param4, float @Nullable [] param5, long __functionAddress);
    public static native void callPJPV(long param0, long param1, int param2, int param3, int param4, int @Nullable [] param5, long __functionAddress);
    public static native void callPJPV(long param0, long param1, int param2, int param3, int param4, long @Nullable [] param5, long __functionAddress);
    public static native void callPJPV(long param0, long param1, int param2, int param3, int param4, short @Nullable [] param5, long __functionAddress);
    public static native void callPPJV(long param0, int param1, long @Nullable [] param2, int param3, long param4, int param5, long __functionAddress);
    public static native void callPPPV(int param0, int param1, int param2, int @Nullable [] param3, long param4, long param5, long __functionAddress);
    public static native void callPPPV(int param0, int param1, int param2, int @Nullable [] param3, long param4, int @Nullable [] param5, long __functionAddress);
    public static native void callPPPV(int param0, int param1, int @Nullable [] param2, int param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native void callPPPV(int param0, int @Nullable [] param1, int param2, long param3, int param4, int @Nullable [] param5, long __functionAddress);
    public static native void callPPPV(int param0, int param1, long param2, long param3, int param4, int param5, float @Nullable [] param6, long __functionAddress);
    public static native void callPPPV(int param0, int param1, long param2, long param3, int param4, int param5, int @Nullable [] param6, long __functionAddress);
    public static native void callPPPV(int param0, int param1, long param2, long param3, int param4, int param5, short @Nullable [] param6, long __functionAddress);
    public static native void callPPPV(long param0, int param1, long param2, int param3, int param4, int param5, int @Nullable [] param6, long __functionAddress);
    public static native void callPPPV(int param0, int param1, int param2, int param3, int @Nullable [] param4, int param5, int @Nullable [] param6, float @Nullable [] param7, long __functionAddress);
    public static native void callPPPV(int param0, int param1, int param2, int param3, int @Nullable [] param4, int param5, int @Nullable [] param6, int @Nullable [] param7, long __functionAddress);
    public static native void callPPPV(long param0, int param1, int param2, int param3, int param4, int param5, int @Nullable [] param6, long param7, long __functionAddress);
    public static native void callPJPPV(long param0, long param1, int @Nullable [] param2, long param3, long __functionAddress);
    public static native void callPPPPV(long param0, long param1, int @Nullable [] param2, long param3, long __functionAddress);
    public static native void callPJJPV(long param0, int param1, long param2, long param3, long @Nullable [] param4, long __functionAddress);
    public static native void callPPPPV(long param0, int param1, long param2, int @Nullable [] param3, long param4, long __functionAddress);
    public static native void callPPPPV(long @Nullable [] param0, int @Nullable [] param1, int @Nullable [] param2, int @Nullable [] param3, int param4, long __functionAddress);
    public static native void callPPPPV(int param0, long param1, int @Nullable [] param2, int @Nullable [] param3, int @Nullable [] param4, int param5, long __functionAddress);
    public static native void callPPPPV(long param0, int param1, int param2, long @Nullable [] param3, long @Nullable [] param4, long @Nullable [] param5, long __functionAddress);
    public static native void callPJPPV(long param0, int param1, long param2, int param3, int param4, int @Nullable [] param5, long @Nullable [] param6, long __functionAddress);
    public static native void callPPPPV(int param0, int param1, int param2, int @Nullable [] param3, int @Nullable [] param4, int @Nullable [] param5, long param6, long __functionAddress);
    public static native void callPPPPV(int param0, int param1, long param2, int @Nullable [] param3, int @Nullable [] param4, int @Nullable [] param5, int param6, long __functionAddress);
    public static native void callPJPPV(long param0, int param1, long param2, int param3, int param4, long @Nullable [] param5, int param6, int @Nullable [] param7, long __functionAddress);
    public static native void callPJJJPV(long param0, long param1, long param2, long param3, double @Nullable [] param4, long __functionAddress);
    public static native void callPJJJPV(long param0, long param1, long param2, long param3, float @Nullable [] param4, long __functionAddress);
    public static native void callPJJJPV(long param0, long param1, long param2, long param3, int @Nullable [] param4, long __functionAddress);
    public static native void callPJJJPV(long param0, long param1, long param2, long param3, long @Nullable [] param4, long __functionAddress);
    public static native void callPJJJPV(long param0, long param1, long param2, long param3, short @Nullable [] param4, long __functionAddress);
    public static native void callPPPPPV(long param0, int param1, long param2, long @Nullable [] param3, int @Nullable [] param4, long param5, long __functionAddress);
    public static native void callPPPPPV(int param0, int param1, long param2, int @Nullable [] param3, int @Nullable [] param4, int @Nullable [] param5, int @Nullable [] param6, long __functionAddress);
    public static native void callPPPPPV(long param0, int param1, int param2, long @Nullable [] param3, long @Nullable [] param4, long @Nullable [] param5, long @Nullable [] param6, long __functionAddress);
    public static native void callPPPPPV(long param0, int param1, long @Nullable [] param2, int param3, int param4, int param5, long param6, int param7, long param8, int param9, long param10, long __functionAddress);
    public static native void callPPPPPPPV(int param0, int param1, int param2, long param3, int param4, long param5, int @Nullable [] param6, int @Nullable [] param7, int @Nullable [] param8, int @Nullable [] param9, long @Nullable [] param10, long __functionAddress);
    public static native boolean callPPZ(int param0, int @Nullable [] param1, long param2, long __functionAddress);
    public static native boolean callPPPPZ(int param0, int param1, int param2, float param3, float @Nullable [] param4, float @Nullable [] param5, float @Nullable [] param6, float @Nullable [] param7, long __functionAddress);

}
