/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

@FunctionalInterface
@NativeType("PFN_xrDebugUtilsMessengerCallbackEXT")
public interface XrDebugUtilsMessengerCallbackEXTI extends CallbackI.I {

    String SIGNATURE = Callback.__stdcall("(llpp)i");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            dcbArgLongLong(args),
            dcbArgLongLong(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    @NativeType("XrBool32") int invoke(@NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long messageSeverity, @NativeType("XrDebugUtilsMessageTypeFlagsEXT") long messageTypes, @NativeType("XrDebugUtilsMessengerCallbackDataEXT const *") long callbackData, @NativeType("void *") long userData);

}