/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.annotation.*;
import java.lang.foreign.*;

/**
 * Enables the {@link Linker.Option#captureCallState} option when creating the FFM downcall.
 *
 * <p>Applicable only to the first method parameter.</p>
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface FFMCaptureCallState {
    /**
     * An array of call states to capture.
     *
     * <p>See {@link Linker.Option#captureStateLayout()} for supported values.</p>
     */
    String[] value();
}
