/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

public class XrSession extends DispatchableHandleDevice  {
    XrSession(long handle, XRCapabilitiesDevice capabilities) {
        super(handle, capabilities);
    }
}
