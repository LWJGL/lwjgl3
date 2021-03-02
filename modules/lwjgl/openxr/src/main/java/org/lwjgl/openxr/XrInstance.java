/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import java.util.*;

public class XrInstance extends DispatchableHandleInstance {
    public XrInstance(long handle, XrInstanceCreateInfo createInfo) {
        super(handle, getInstanceCapabilities(handle, createInfo));
    }

    private static XRCapabilitiesInstance getInstanceCapabilities(long handle, XrInstanceCreateInfo ci) {
        XrApplicationInfo appInfo = ci.applicationInfo();

        long apiVersion = appInfo.apiVersion();

        //TODO HIGH PRIORITY: REPLACE XR.functionProvider with xrGetFuncPrt thing
        return new XRCapabilitiesInstance(XR.functionProvider, apiVersion,
            XR.getEnabledExtensionSet(apiVersion, ci.enabledExtensionNames()), new HashSet<>());
    }
}