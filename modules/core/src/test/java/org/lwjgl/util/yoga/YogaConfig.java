/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.yoga;

import static org.lwjgl.util.yoga.Yoga.*;

public class YogaConfig {

    final long handle;

    public YogaConfig() {
        this.handle = YGConfigNew();
    }

    @Override
    protected void finalize() throws Throwable {
        YGConfigFree(handle);
    }

    void setExperimentalFeatureEnabled(YogaNode.YogaExperimentalFeature feature, boolean enabled) {
        YGConfigSetExperimentalFeatureEnabled(handle, feature.value, enabled);
    }

}