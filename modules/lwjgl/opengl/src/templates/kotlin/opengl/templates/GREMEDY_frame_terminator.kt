/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GREMEDY_frame_terminator = "GREMEDYFrameTerminator".nativeClassGL("GREMEDY_frame_terminator", postfix = GREMEDY) {
    void("FrameTerminatorGREMEDY")
}