/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*

val ARB_transform_feedback_instanced = "ARBTransformFeedbackInstanced".nativeClassGL("ARB_transform_feedback_instanced") {
    reuse(GL42C, "DrawTransformFeedbackInstanced")
    reuse(GL42C, "DrawTransformFeedbackStreamInstanced")
}