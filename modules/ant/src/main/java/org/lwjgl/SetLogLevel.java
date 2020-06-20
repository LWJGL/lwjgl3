/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl;

import org.apache.tools.ant.*;
import org.apache.tools.ant.types.*;

public class SetLogLevel extends org.apache.tools.ant.Task {

    private LogLevel logLevel = LogLevel.INFO;

    @Override public void execute() {
        for (BuildListener listener : getProject().getBuildListeners()) {
            if (listener instanceof BuildLogger) {
                ((BuildLogger)listener).setMessageOutputLevel(logLevel.getLevel());
            }
        }
    }

    public void setLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

}
