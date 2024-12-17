/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_window_pos = "ARBWindowPos".nativeClassGL("ARB_window_pos", postfix = ARB) {
    void(
        "WindowPos2iARB",

        GLint("x"),
        GLint("y")
    )

    void("WindowPos2sARB", GLshort("x"), GLshort("y"))
    void("WindowPos2fARB", GLfloat("x"), GLfloat("y"))
    void("WindowPos2dARB", GLdouble("x"), GLdouble("y"))

    void("WindowPos2ivARB", Check(2)..GLint.const.p("p"))
    void("WindowPos2svARB", Check(2)..GLshort.const.p("p"))
    void("WindowPos2fvARB", Check(2)..GLfloat.const.p("p"))
    void("WindowPos2dvARB", Check(2)..GLdouble.const.p("p"))

    void(
        "WindowPos3iARB",

        GLint("x"),
        GLint("y"),
        GLint("z")
    )

    void("WindowPos3sARB", GLshort("x"), GLshort("y"), GLshort("z"))
    void("WindowPos3fARB", GLfloat("x"), GLfloat("y"), GLfloat("z"))
    void("WindowPos3dARB", GLdouble("x"), GLdouble("y"), GLdouble("z"))

    void("WindowPos3ivARB", Check(3)..GLint.const.p("p"))
    void("WindowPos3svARB", Check(3)..GLshort.const.p("p"))
    void("WindowPos3fvARB", Check(3)..GLfloat.const.p("p"))
    void("WindowPos3dvARB", Check(3)..GLdouble.const.p("p"))
}