/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.yoga;

import org.jspecify.annotations.*;

import static org.lwjgl.util.yoga.Yoga.*;

public class YogaConfig {

    final long handle;

    private @Nullable YGCloneNodeFunc cloneNodeFunc;

    public YogaConfig() {
        this.handle = YGConfigNew();
    }

    @Override
    protected void finalize() throws Throwable {
        YGConfigFree(handle);
        if (cloneNodeFunc != null) {
            cloneNodeFunc.free();
        }
    }

    void setOnCloneNode(@Nullable YGCloneNodeFuncI callback) {
        if (cloneNodeFunc != null) {
            cloneNodeFunc.free();
        }
        YGConfigSetCloneNodeFunc(handle, cloneNodeFunc = callback == null ? null : YGCloneNodeFunc.create(callback));
    }

    void setErrata(YogaErrata errata) {
        YGConfigSetErrata(handle, errata.getValue());
    }

    void setExperimentalFeatureEnabled(YogaExperimentalFeature feature, boolean enabled) {
        YGConfigSetExperimentalFeatureEnabled(handle, feature.value, enabled);
    }

    void setUseLegacyStretchBehaviour(boolean useLegaceStretchBehaviour) {
        YGConfigSetErrata(handle, useLegaceStretchBehaviour ? YGErrataStretchFlexBasis : YGErrataNone);
    }

    void setUseWebDefaults(boolean enabled) {
        YGConfigSetUseWebDefaults(handle, enabled);
    }

    enum YogaErrata implements EnumWrapper {
        NONE(YGErrataNone),
        STRETCH_FLEX_BASIS(YGErrataStretchFlexBasis),
        ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING(YGErrataAbsolutePositionWithoutInsetsExcludesPadding),
        ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(YGErrataAbsolutePercentAgainstInnerSize),
        CLASSIC(YGErrataClassic),
        ALL(YGErrataAll);

        final int value;

        YogaErrata(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }

    enum YogaExperimentalFeature implements EnumWrapper {
        WEB_FLEX_BASIS(YGExperimentalFeatureWebFlexBasis);

        final int value;

        YogaExperimentalFeature(int value) {
            this.value = value;
        }

        @Override public int getValue() {
            return value;
        }
    }


}