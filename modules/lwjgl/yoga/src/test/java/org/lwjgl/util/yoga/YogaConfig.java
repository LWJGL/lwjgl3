/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

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

    void setOnCloneNode(@Nullable YGCloneNodeFuncI callback) {
        YGConfigSetCloneNodeFunc(handle, callback);
    }

    void setExperimentalFeatureEnabled(YogaNode.YogaExperimentalFeature feature, boolean enabled) {
        YGConfigSetExperimentalFeatureEnabled(handle, feature.value, enabled);
    }

    void setShouldDiffLayoutWithoutLegacyStretchBehaviour(boolean shouldDiffLayout) {
        YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(handle, shouldDiffLayout);
    }

    void setUseLegacyStretchBehaviour(boolean useLegaceStretchBehaviour) {
        YGConfigSetUseLegacyStretchBehaviour(handle, useLegaceStretchBehaviour);
    }

    void setUseWebDefaults(boolean enabled) {
        YGConfigSetUseWebDefaults(handle, enabled);
    }

}